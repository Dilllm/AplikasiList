package com.example.aplikasilist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailGoogle extends AppCompatActivity {

    public static final String KEY_MOVIE = "KEY";

    ImageView gambar;
    TextView tvJudul, tvIsi;
    String idGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_google);
        idGoogle = getIntent().getStringExtra("KEY");
        tvJudul = findViewById(R.id.tvJudul);
        tvIsi = findViewById(R.id.tvIsi);
        gambar = findViewById(R.id.gambar);

        if (idGoogle.equals("Abu Bakar")){
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Abu Bakar");
            tvIsi.setText("Nama Asli Abu Bakar adalah Abdullah bin Utsman bin Amir bin Amr bin Ka’ab bin Sa’ad bin Taiym bin Murrah bin Ka’ab bin Lu’ay Al Qurasyi At Taimi, lahir pada tahun 572 Masehi di Makkah dan wafat pada tahun 634 Masehi di Madinah.");
            setTitle("Abu Bakar");
        }else if (idGoogle.equals("Umar Bin Khattab")) {
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Umar Bin Khattab");
            tvIsi.setText("Umar bin Khattab bin naufal bin Abd Uzza bin Raba’ah bin Abdillah bin Qurth bin Huzaul bin Ady bin Ka’ab bin Luway bin Fihr bin Malik atau lebih dikenal dengan nama Umar bin Al-Khattab, lahir Makkah, 40 tahun sebelum Nabi hijrah ke Makkah dan Wafat 644 Masehi di Madinah.");
            setTitle("Umar Bin Khattab");
        }else if (idGoogle.equals("Utsman Bin Affan")) {
            setTitle("Utsman Bin Affan");
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Utsman Bin Affan");
            tvIsi.setText("Utsman bin Affan bin Al-Ash bin Umayyah bin Abdu Syams bin Abdu Manaf bin Qushay Al-Amawi Al-Quraisy adalah nama lengkap dari Utsman bin Affan, Lahir pada tahun 574 Masehi dan Wafat pada bulan dzulhijah 35 Hijriah, Utsman dibunuh pada saat sedang membaca Al-Qur’an.");
        }else if (idGoogle.equals("Ali Bin Abi Thalib")) {
            setTitle("Ali Bin Abi Thalib");
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Ali Bin Abi Thalib");
            tvIsi.setText("Nama Lengkap Ali bin Abi Thalib bin Abdi Manaf bin Abdul Muththalib bin Hasyim bin Abdi Manaf bin Qushay bin Kilab bin Murrah bin Ka’ab bin Luay bin Ghalib bin Fihr bin Malik bin an-Nadhar bin Kinanah Abul Hasan dan Husein, adalah keponakan + menantu Nabi Muhammad SAW, lahir pada tahun 559 masehi di Makkah dan Wafat tahun 40 Hijriyah.");
        }else if (idGoogle.equals("Thalhah Bin Ubaidillah")) {
            setTitle("Thalhah Bin Ubaidillah");
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Thalhah Bin Ubaidillah");
            tvIsi.setText("Thalhah bin Ubaidillah bin Utsman bin Amr bin Ka’ab bin Sa’ad al-Quraisyi at-Taimi, wafatnya pada tahun 656 Masehi, wafatnya beliau saat mengikuti perang uhud terjadi ketika Thalhah melindungi Rasulullah yang sudah terdesak, menerima 70 luka dari sabetan pedang, tusukan tombak, dan anak panah , lalu pergelangan tangan terpotong, dan akhirnya terjatuh lalu wafat, dan Syahid.");
        }else if (idGoogle.equals("Zubair Bin Awwam")) {
            setTitle("Zubair Bin Awwam");
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Zubair Bin Awwam");
            tvIsi.setText("Zubair bin Awwan termasuk kedalam orang-orang yang pertama masuk islam (Assabiqunal awalun) saat itu Zubair masih remaja dengan usia 15 tahun, beliau lahir pada tahun 594 Masehi dan wafat 656 Masehi di Iraq.");
        }else if (idGoogle.equals("Abdurahman Bin Auf")) {
            setTitle("Abdurahman Bin Auf");
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Abdurahman Bin Auf");
            tvIsi.setText("Abdurrahmân bin Auf bin Abdi Auf bin Abdil Hârits bin Zahrah bin Kilâb bin al-Qurasyi Az-Zuhri Abu Muhammad, lahir diperkirakan 10 tahun setelah tahun gajah dan wafat pada umur 72 tahun di Yordania.");
        }else if (idGoogle.equals("Saad Bin Abi Waqqas")) {
            setTitle("Saad Bin Abi Waqqas");
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Saad Bin Abi Waqqas");
            tvIsi.setText("Sa’ad bin Abi Waqqas Malik bin Uhaib bin ‘Abdi Manaf Al-Qurasyi Az-Zuhri Al-Makki, lahir pada tahun 595 Masehi di Makkah dan wafat tahun 674 Masehi di MAdinah atau di Guangzhou, Sa’ad menyatakan keislamannya pada saat usianya baru 17 tahun.");
        }else if (idGoogle.equals("Said Bin Zaid")) {
            setTitle("Said Bin Zaid");
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Said Bin Zaid");
            tvIsi.setText("Sa’id bin Zaid bin Amru bin Nufail Al-Adawi, lahir 22 tahun sebelum Hijrah di Makkah dan wafat pada usia 70 tahun di tahu ke 50/51 Hijriah di Al-‘Aqiq dan dimakamkan di Madinah. Sa’id mengikuti seluruh peperangan terkecuali Perang Badar karena pada saat itu ditugaskan Nabi Muhammad untuk suatu tugas yang penting.");
        }else if (idGoogle.equals("Abu Ubaidillah bin Jarrah")) {
            setTitle("Abu Ubaidillah bin Jarrah");
            gambar.setImageResource(R.drawable.allfoto);
            tvJudul.setText("Abu Ubaidillah bin Jarrah");
            tvIsi.setText("Nama lengkapnya Amir bin Abdullah bin Jarrah Al-Fihry Al-Quraiys, beliau adalah orang kepercayaat umat islam, pernah suatu waktu saat beliau mengikuti perang badar, ada seorang Kafiir Quraisy yang menunggang kuda dengan beringas ingin membunuh Abu Ubaidillah, Abu Ubaidillahpun mencari momen dan kondisi yang tepat untuk membunuhnya hingga akhirnya lawannya inii tebunuh dengan kepala yang tersambit pedang.");
        }
    }
}
