package ddwu.com.mobile.foodexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ddwu.com.mobile.foodexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    lateinit var binding : ActivityMainBinding
		val DETAIL_CODE = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

			val food = intent.getSerializable("food") as FoodDto

        val foods = FoodDao().foods

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        val adapter = FoodAdapter(foods)

        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter
			
			binding.tvText.text = food.food
        // btnAdd를 클릭하면 AddFoodActivity 실행
				binding.btnAdd.setOnClilckListener{
					val intent = Intent(this, AddFoodActivity::class.java)
					startActivityForResult(intent, DETAIL_ACTIVITY_CODE)
				}

    }
	override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
		when(requestCode) {
			DETAIL_ACTIVITY_CODE -> {
				if(resultCode == RESULT_OK){
					val result = data?.getStringExtra("result_data")

				}
			}
		}
	}



}