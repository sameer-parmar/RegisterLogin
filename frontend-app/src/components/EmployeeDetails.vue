<template>
  <div>
    <h2>Employee Details</h2>
    <p v-if="employee">Username: {{ employee.username }}</p>
    <p v-else>Loading...</p>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      employee: null,
    };
  },
  mounted() {
    this.fetchEmployeeDetails();
  },
  methods: {
    async fetchEmployeeDetails() {
      try {
        const response = await axios.get(`http://localhost:8081/api/user/fetch/${this.$route.params.username}`);
        this.employee = response.data;
      } catch (error) {
        console.error('Fetch employee details error:', error);
        // Handle error, e.g., show an error message
      }
    },
  },
};
</script>
