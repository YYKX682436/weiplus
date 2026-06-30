package lg1;

/* loaded from: classes5.dex */
public class c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f318554d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f318555e;

    public c(android.content.Context context) {
        super(context);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d3w, this);
        this.f318554d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f318555e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h5n);
    }

    public void setStep(lg1.b bVar) {
        android.widget.ImageView imageView = this.f318555e;
        android.widget.TextView textView = this.f318554d;
        if (bVar == null) {
            textView.setText((java.lang.CharSequence) null);
            imageView.setImageDrawable(null);
        } else {
            textView.setText(bVar.f318552a);
            int i17 = bVar.f318553b;
            imageView.setImageResource(i17 != -2 ? i17 != 0 ? i17 != 2 ? com.tencent.mm.R.drawable.brt : com.tencent.mm.R.drawable.brs : com.tencent.mm.R.drawable.bru : com.tencent.mm.R.drawable.brv);
        }
    }
}
