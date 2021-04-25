package com.example.gogians

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnEmergency: Button
    lateinit var btnTips: Button
    lateinit var btnStatus:Button
    lateinit var btnLaw:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)
        title="Features"
        btnEmergency=findViewById(R.id.btnEmergency)
        btnTips=findViewById(R.id.btnTips)
        btnStatus=findViewById(R.id.btnStatus)
        btnLaw=findViewById(R.id.btnLaw)


        btnEmergency.setOnClickListener {
            Toast.makeText(this@MainActivity,
                    "DONT WORRY YOU ARE UNDER  SURVILANCE!",
                    Toast.LENGTH_LONG
            ).show()
            btnTips.setOnClickListener {
                Toast.makeText(this@MainActivity,
                        "This is must know information for all our Women professionals. Feel free to share this even with members of your family.\n" +
                                "\n" +
                                "            1.       Be aware of your surroundings. Don’t let your guard down\n" +
                                "\n" +
                                "a.       If things seem even a slight unsafe get out of that place immediatelY",
                        Toast.LENGTH_LONG
                ).show()
            }
            btnStatus.setOnClickListener {
                Toast.makeText(this@MainActivity,
                        "IF YOU ARE NOT FINE,JUST TELL US WE WOULD TRACK YOU",
                        Toast.LENGTH_LONG
                ).show()
            }


                btnLaw.setOnClickListener {
                    Toast.makeText(this@MainActivity,
                            "The Immoral Traffic (Prevention) Act, 1956 (172.32 KB)\n" +
                                    "The Dowry Prohibition Act, 1961 (28 of 1961) (Amended in 1986) (239.43 KB)\n" +
                                    "The Indecent Representation of Women (Prohibition) Act, 1986 (172.32 KB)\n" +
                                    "The Commission of Sati (Prevention) Act, 1987 (3 of 1988) (294.55 KB)",
                            Toast.LENGTH_LONG
                    ).show()
                }




        }






    }
}