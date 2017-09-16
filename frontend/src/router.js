import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

// ===================== Pages Components ======================
import Navbar from './components/Navbar'

// ==================== Router registration ====================
export default new Router({
  mode: 'hash',
  routes: [
    { path: '/', component: Navbar },
  ]
})
