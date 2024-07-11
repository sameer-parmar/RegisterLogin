<template>
  <form @submit.prevent="handleSubmit">
    <input type="text" v-model="username" placeholder="Username" required />
    <input type="password" v-model="password" placeholder="Password" required />
    <button type="submit">Register</button>
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
        const response = await axios.post('http://localhost:8081/api/user/register', {
          username: this.username,
          password: this.password,
          // Add more fields as needed
        });
        console.log('Registration successful:', response.data);
        // Handle success, e.g., show a success message or redirect to login
      } catch (error) {
        console.error('Registration error:', error);
        // Handle error, e.g., show an error message
      }
    },
  },
};
</script>
