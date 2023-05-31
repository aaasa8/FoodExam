package ddwu.com.mobile.foodexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ddwu.com.mobile.foodexam.databinding.ActivityAddFoodBinding

class AddFoodActivity : AppCompatActivity() {
    val TAG = "AddFoodActivity"
    lateinit var binding : ActivityAddFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
		
			binding.btnOk.setOnClickListener{
				val resultIntent = Intent()
				resultIntent.putExtra("result_data", "DetailActivity returns data!")
				setResult(RESULT_OK, resultIntent)
				finish()
			}
			binding.btnCancel.setOnClickListener{
				setResult(RESULT_CANCELED)
				finish()
			}

    }
}