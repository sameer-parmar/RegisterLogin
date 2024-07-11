<template>
  <div id="app">
    <h1>User Management System</h1>
    <RegisterForm />
    <LoginForm />
    <!-- Example of using EmployeeDetails component -->
    <EmployeeDetails username="exampleUser" /> <!-- Replace with actual username -->
  </div>
</template>

<script>
import RegisterForm from './components/RegisterForm.vue';
import LoginForm from './components/LoginForm.vue';
import EmployeeDetails from './components/EmployeeDetails.vue';

export default {
  name: 'App',
  components: {
    RegisterForm,
    LoginForm,
   EmployeeDetails,
  },
};
</script>
