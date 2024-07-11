<template>
  <form @submit.prevent="handleSubmit">
    <input type="text" v-model="username" placeholder="Username" required />
    <input type="password" v-model="password" placeholder="Password" required />
    <button type="submit">Login</button>
  </form>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      username: '',
      password: '',
    };
  },
  methods: {
    async handleSubmit() {
      try {
        const response = await axios.post('http://localhost:8081/api/user/login', {
          username: this.username,
          password: this.password,
        });
        console.log('Login successful:', response.data);
        // Handle success, e.g., store login token in local storage
      } catch (error) {
        console.error('Login error:', error);
        // Handle error, e.g., show an error message
      }
    },
  },
};
</script>
