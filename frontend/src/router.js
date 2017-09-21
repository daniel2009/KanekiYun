import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

// ===================== Pages Components ======================
import Navbar from './components/Navbar'
import MainPanel from './components/MainPanel'
import Signup from './components/Signup'
// import Login from './components/Login'
import GoogleSSO from './components/GoogleSSO'
import FBSSO from './components/FBSSO'

// ==================== Router registration ====================
export default new Router({
  mode: 'history',
  routes: [
    { path: '/', component: MainPanel },
    { path: '/signup', component: Signup },
    // { path: '/login', component: Login }
    { path: '/token_google', component: GoogleSSO },
    { path: '/token_facebook', component: FBSSO }
  ]
})
