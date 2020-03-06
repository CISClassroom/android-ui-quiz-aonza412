package com.cis.lab.uiquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listView: ListView = findViewById(R.id.listView)
        val student_list = mutableListOf<Student>()

        student_list.add(Student("นายกฤษฎา ท่าสะอาด",   "603410032-9",   R.drawable.m  ))
        student_list.add(Student("นายกัมพล โชติทอง", "603410034-5", R.drawable.m  ))
        student_list.add(Student("นายณัฐนนท์ ทาไธสง",  "603410041-8",  R.drawable.m  ))
        student_list.add(Student("นายนฤเบศร์ พระโรจน์",  "603410047-6",  R.drawable.m  ))
        student_list.add(Student("นายพรหมพัฒน์ ชาญโชคประเสริฐ",  "603410052-3",  R.drawable.m  ))
        student_list.add(Student("นายเมธาวี สารีผล",  "603410057-3",  R.drawable.m  ))
        student_list.add(Student("นายรัฐเขต สีเหลือง",  "603410059-9",  R.drawable.m  ))
        student_list.add(Student("นายรุ่งโรจน์ พลเยี่ยม",  "603410060-4",  R.drawable.m  ))
        student_list.add(Student("นายวิธาน วงษาบุตร",  "603410061-2",  R.drawable.m  ))
        student_list.add(Student("นางสาวศศิกร กอเสนาะรส",  "603410063-8",  R.drawable.w  ))
        student_list.add(Student("นางสาวอนันตยา โคตรศรี",  "603410070-1",  R.drawable.w  ))
        student_list.add(Student("นายอภิเดช นารอง",  "603410071-9",  R.drawable.m  ))
        student_list.add(Student("นายอุทัยพันธ์ เที่ยงโคตร",  "603410073-5",  R.drawable.m  ))
        student_list.add(Student("นางสาวพัชรี แอแป",  "603410155-3",  R.drawable.w  ))
        student_list.add(Student("นางสาวศศิธร พิมมะทา",  "603410156-1",  R.drawable.w  ))
        student_list.add(Student("นายสุรพร อินพิลึก",  "603410157-9", R.drawable.m  ))
        student_list.add(Student("นายกฤษดา อุ่นสำโรง",  "603410194-3",  R.drawable.m  ))
        student_list.add(Student("นายณรงค์ศึก เตชะศรี",  "603410200-4",  R.drawable.m  ))
        student_list.add(Student("นายติยพล ต่อติด",  "603410202-0",  R.drawable.m  ))
        student_list.add(Student("นายทรัพย์ทวี เพ็ชรสาย",  "603410203-8",  R.drawable.m  ))
        student_list.add(Student("นางสาวธิดารัตน์ ดานะพันธ์",  "603410204-6",  R.drawable.w  ))
        student_list.add(Student("นายปิยทัศน์ นวกิจวัฒนา",  "603410208-8",  R.drawable.m  ))
        student_list.add(Student("นายพรสิน มีสีบู",  "603410210-1",  R.drawable.m  ))
        student_list.add(Student("นายพัชรพล ไทยมานี้",  "603410211-9",  R.drawable.m  ))
        student_list.add(Student("นายวงษกร พันธ์พิบูลย์",  "603410213-5",  R.drawable.m  ))
        student_list.add(Student("นายวรรณพงษ์ ภัททิยไพบูลย์",  "603410214-3",  R.drawable.m  ))
        student_list.add(Student("นายวิวัฒน์ วงษ์พิชัย",  "603410217-7",  R.drawable.m  ))
        student_list.add(Student("นางสาวศุภรัตน์ นพวัติ",  "603410219-3",  R.drawable.w  ))
        student_list.add(Student("นางสาวสิรินาถ จริยพันธ์",  "603410221-6",  R.drawable.w  ))
        student_list.add(Student("นายเกียรติศักดิ์ วรภาพ",  "603410289-2",  R.drawable.m  ))
        student_list.add(Student("นางสาวธัญสิริ ผลไสว",  "603410291-5",  R.drawable.w  ))
        student_list.add(Student("นางสาวอาทิตยา ฉิมมาแก้ว",  "603410321-2",  R.drawable.w  ))


        listView.adapter = MyListAdapter(
            this,
            R.layout.list_item,
            student_list
        )

        listView.setOnItemClickListener{parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as Student
            Toast.makeText(this,selectedItem.name, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Profile::class.java)
            intent.putExtra("name",selectedItem.name)
            intent.putExtra("id",selectedItem.id)
            intent.putExtra("icon",selectedItem.photo)
            startActivity(intent)
        }
    }
}
