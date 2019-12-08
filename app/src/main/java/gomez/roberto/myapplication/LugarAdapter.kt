package gomez.roberto.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.targeta3.view.*


class LugarAdapter (lugares:ArrayList<Lugar>,context:Context): RecyclerView.Adapter<LugarAdapter.ViewHoder>() {
    var lugares:ArrayList<Lugar>?=null
    var context:Context?=null

    init {
        this.lugares = lugares
        this.context =context

    }

    override fun getItemCount(): Int {
        return lugares!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder {
        val vistalugar:View = LayoutInflater.from(context).inflate(R.layout.mi_targeta,parent,false)
        val lugarViewHolder = ViewHoder(vistalugar)
        vistalugar.tag =lugarViewHolder
        return lugarViewHolder
    }

    override fun onBindViewHolder(holder: ViewHoder, position: Int) {

        holder.nombre!!.text = lugares!![position].nombre
        holder.descripcion!!.text = lugares!![position].descripicion
        Picasso.get().load(lugares!![position].foto).into(holder.imagen)
    }

    class ViewHoder(vista:View):RecyclerView.ViewHolder(vista) {

        var imagen: ImageView?=null
        var nombre: TextView?=null
        var descripcion:TextView?=null


        init {
            imagen = vista.ivPersona
            nombre = vista.tvNombre
            descripcion = vista.tvGenero
        }


    }


}