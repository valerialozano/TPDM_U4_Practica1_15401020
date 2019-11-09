package mx.edu.ittepic.tpdm_u4_practica1_15401020

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View


class Lienzo(p:MainActivity) : View(p) {
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        var imagen = BitmapFactory.decodeResource(resources, R.drawable.lunita)
        var imagen2 = BitmapFactory.decodeResource(resources, R.drawable.santita)
        var imagen3 = BitmapFactory.decodeResource(resources, R.drawable.pinito)

        setBackgroundColor(Color.rgb(34, 52, 157))

        //montañas
        p.color = Color.rgb(77, 133, 209)
        c.drawCircle(1100f, 100f, 600f, p)
        /* p.color = Color.rgb(212,228,249)
         p.style = Paint.Style.STROKE
         p.strokeWidth = 25f
         c.drawCircle(1100f,100f,600f,p)*/

        // p.color = Color.rgb(77,133,209)
        /* p.style = Paint.Style.FILL
         c.drawCircle(1200f,1350f,800f,p)
         p.color = Color.rgb(212,228,249)
         p.style = Paint.Style.STROKE
         p.strokeWidth = 30f*/
        c.drawCircle(1200f, 1350f, 800f, p)

        //tronquito
        p.color = Color.rgb(92, 49, 14)
        c.drawRect(800f, 270f, 915f, 320f, p)
        //arriba, derecha, abajo, izquierda

        //luna
        c.drawBitmap(imagen, 100f, 100f, p)
        //santa
        c.drawBitmap(imagen2, 150f, 730f, p)
        //pinito
        c.drawBitmap(imagen3, 680f, 200f, p)

        p.color = Color.WHITE

        //mono de nieve
        c.drawCircle(800f, 1280f, 55f, p)
        c.drawCircle(900f, 1280f, 80f, p)

        //sombrerito
        p.color = Color.BLACK
        c.drawRect(720f, 1335f, 755f, 1225f, p)
        c.drawRect(680f, 1315f, 720f, 1245f, p)
        //arriba, derecha, abajo, izquierda
        //ojitos
        c.drawCircle(780f, 1300f, 7f, p)
        c.drawCircle(780f, 1260f, 7f, p)
        //nariz
        p.color = Color.rgb(216, 80, 25)
        p.strokeWidth = 8f
        c.drawLine(797f, 1290f, 805f, 1250f, p)
        c.drawLine(805f, 1250f, 815f, 1290f, p)
        //brazos
        p.color = Color.rgb(92, 49, 14)
        c.drawLine(870f, 1345f, 820f, 1423f, p)
        c.drawLine(840f, 1390f, 800f, 1420f, p)
        c.drawLine(840f, 1390f, 840f, 1430f, p)

        c.drawLine(870f, 1220f, 825f, 1120f, p)
        c.drawLine(843f, 1160f, 800f, 1130f, p)
        c.drawLine(843f, 1160f, 840f, 1112f, p)

        p.color = Color.BLACK
        c.drawCircle(865F, 1280f, 10f, p)
        c.drawCircle(895F, 1280f, 10f, p)
        c.drawCircle(925F, 1280f, 10f, p)

        //estrellitas
        p.color = Color.WHITE
        c.drawCircle(320F, 700f, 5f, p)
        c.drawCircle(100F, 900f, 5f, p)
        c.drawCircle(310F, 1000f, 5f, p)
        c.drawCircle(100F, 1500f, 5f, p)
        c.drawCircle(110F, 1200f, 5f, p)
        c.drawCircle(200F, 700f, 5f, p)
        c.drawCircle(300F, 1400f, 5f, p)
        c.drawCircle(180F, 1350f, 5f, p)
        c.drawCircle(150F, 400f, 5f, p)
        c.drawCircle(190F, 500f, 5f, p)
        c.drawCircle(400F, 550f, 5f, p)
        c.drawCircle(300F, 300f, 5f, p)
        c.drawCircle(90F, 600f, 5f, p)
        c.drawCircle(60F, 60f, 5f, p)
        c.drawCircle(60F, 300f, 5f, p)

        //otro arbolito
        p.color = Color.rgb(92, 49, 14)
        c.drawRect(780f, 900f, 880f, 950f, p)
        //arriba, derecha, abajo, izquierda
        p.color = Color.rgb(33, 81, 32)
        c.drawCircle(780f, 960f, 40f, p)
        c.drawCircle(780f, 890f, 40f, p)
        c.drawCircle(725f, 970f, 40f, p)
        c.drawCircle(725f, 880f, 40f, p)

        c.drawCircle(750f, 900f, 40f, p)
        c.drawCircle(691f, 900f, 40f, p)
        c.drawCircle(689f, 950f, 40f, p)

    }
}