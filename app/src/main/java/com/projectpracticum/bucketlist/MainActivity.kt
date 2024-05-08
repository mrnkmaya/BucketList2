import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.projectpracticum.bucketlist.PopularActivity
import com.projectpracticum.bucketlist.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_kremlin = findViewById<ImageButton>(R.id.btn_kremlin)

        btn_kremlin.setOnClickListener {
            val intent = Intent(this, PopularActivity::class.java)
            startActivity(intent)
        }
    }
}
