<template>
  <div>
    <button @click="select1">固有查询</button>
    <button @click="select2">自定义查询</button>
    <button @click="insert">插入数据</button>

    <div v-if="errorMessage" class="error">{{ errorMessage }}</div>
    <textarea v-model="responseData" readonly></textarea>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import axios from 'axios'

const responseData = ref('')
const errorMessage = ref('')

const select1 = async () => {
  try {
    const response = await axios.get('http://localhost:8081/select1')
    responseData.value = JSON.stringify(response.data, null, 2)
  } catch (err) {
    errorMessage.value = `请求失败: ${err instanceof Error ? err.message : '未知错误'}`
  }
}

const select2 = async () => {
  try {
    const response = await axios.get('http://localhost:8081/select2')
    responseData.value = JSON.stringify(response.data, null, 2)
  } catch (err) {
    errorMessage.value = `请求失败: ${err instanceof Error ? err.message : '未知错误'}`
  }
}

const insert = async () => {
  try {
    const response = await axios.get('http://localhost:8081/insert', {
      params: {
        name: "jolin",
        age: 19
      }
    })
    responseData.value = JSON.stringify(response.data, null, 2)
  } catch (err) {
    errorMessage.value = `插入失败: ${err instanceof Error ? err.message : '未知错误'}`
  }
}
</script>

<style>
button {
  margin: 5px;
  padding: 8px 16px;
}
textarea {
  width: 100%;
  height: 300px;
  margin-top: 20px;
}
.error {
  color: red;
  margin: 10px 0;
}
</style>