package com.example.hotelmanagementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hotelmanagementapp.retrofit.INodeJS
import com.example.hotelmanagementapp.retrofit.RetrofitClient
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myAPI:INodeJS
    var compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialise API
        val retrofit = RetrofitClient.instance
        myAPI = retrofit.create(INodeJS::class.java)

        login_button.setOnClickListener{
            login(edt_username.text.toString(), edt_password.text.toString())
        }

        register_button.setOnClickListener{
            register(edt_username.text.toString(), edt_password.text.toString())
        }
    }

    private fun register(username: String, password: String) {

    }


    private fun login(username: String, password: String) {
//        compositeDisposable.add(myAPI.loginUser(username, password)
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe{ message : String ->
//                if(message.contains("encrypted_password")){
//                    Toast.makeText(this@MainActivity, "Login successful", Toast.LENGTH_SHORT.show())
//                }
//                else{
//                Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT.show())
//                }
//            })


    }

    override fun onStop() {
        compositeDisposable.clear()
        super.onStop()
    }

    override fun onDestroy() {
        compositeDisposable.clear()
        super.onDestroy()
    }
}

private fun Int.show(): Int {
    TODO("Not yet implemented")
}
