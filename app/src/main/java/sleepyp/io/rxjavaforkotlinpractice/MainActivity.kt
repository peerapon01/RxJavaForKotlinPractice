package sleepyp.io.rxjavaforkotlinpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Observable.just("Hello! Please use this app responsibly!")
                .subscribe({
                    main_text.text = it
                }); }
}
