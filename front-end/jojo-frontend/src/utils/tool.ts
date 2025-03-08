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