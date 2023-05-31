package ddwu.com.mobile.foodexam

data class FoodDto(var food: String, var country: String) : java.to.Serializab {
    override fun toString() = "$food ($country)"
}

