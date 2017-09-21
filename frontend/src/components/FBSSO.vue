<template>
  <div>
    <h1>Redirect Page</h1>
  </div>
</template>

<script type="text/javascript">
	import { apiDomain, signupUrl, facebookUrl } from '../config'

	export default {
		name: 'facebook-sso',
		data() {
			return {
				message : '',
				username : '',
				access_token : '',
				email : ''
			}
		},
		created : function () {
			this.facebookUrl();
		},
		methods : {
			facebookUrl () {
				let hashString = this.$route.hash;
        		this.access_token = hashString.substring(14).split('&')[0];
        		console.log(this.access_token);
        		this.fetchEmail();
			},

			fetchEmail () {
				let accessTokenUri = 'https://graph.facebook.com/me'
		        this.$http.get(accessTokenUri, { headers : {'Authorization' : 'Bearer ' + this.access_token }}).then((res) => {
		          console.log(res);
		          this.username = res.body.name;
		          if (this.username != null) {
		          	localStorage.setItem('username', this.username);
		          	localStorage.setItem('loggedIn', 'true');
		          	location.assign(apiDomain);
		          } else {
		          	location.assign(signupUrl);
		          }
		          
		        }, (err) => {
		          console.log(err);
		        });
			}

		}
	}
</script>