package gomez.roberto.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lugares = ArrayList<Lugar>()
        lugares.add(Lugar("Chile", "https://media.tacdn.com/media/attractions-splice-spp-674x446/07/c3/e0/be.jpg","la patagonia"))
        lugares.add(Lugar("Etzatlan", "https://www.mexicodesconocido.com.mx/wp-content/uploads/2019/10/tejido1.jpg","Pabellon"))
        lugares.add(Lugar("Etzatlan", "https://www.entornoturistico.com/wp-content/uploads/2018/10/La-Gerencia-660x330.jpg","Agencia"))
        lugares.add(Lugar("Etzatlan", "https://1.bp.blogspot.com/-7NoLnFt5yrY/XW-3LT5ZDFI/AAAAAAAArJw/XZjcT6FDHxE9VS1-7qutTnuLxCsI6yiiQCLcBGAs/s400/Kiosko%2BEtzatl%25C3%25A1n.jpg","plaza"))
        lugares.add(Lugar("Chile", "https://media.tacdn.com/media/attractions-splice-spp-674x446/07/c3/e0/be.jpg","la patagonia"))
        lugares.add(Lugar("Etzatlan", "https://www.mexicodesconocido.com.mx/wp-content/uploads/2019/10/tejido1.jpg","Pabellon"))
        lugares.add(Lugar("Etzatlan", "https://www.entornoturistico.com/wp-content/uploads/2018/10/La-Gerencia-660x330.jpg","Agencia"))
        lugares.add(Lugar("Etzatlan", "https://1.bp.blogspot.com/-7NoLnFt5yrY/XW-3LT5ZDFI/AAAAAAAArJw/XZjcT6FDHxE9VS1-7qutTnuLxCsI6yiiQCLcBGAs/s400/Kiosko%2BEtzatl%25C3%25A1n.jpg","plaza"))


        myRecycler.adapter = LugarAdapter(lugares,context = this)
        myRecycler.layoutManager= StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
    }
}
