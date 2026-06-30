package db5;

/* loaded from: classes5.dex */
public class i3 extends com.tencent.mm.ui.widget.dialog.z2 {
    public final android.widget.TextView L;
    public final android.widget.TextView M;
    public final android.widget.Button N;
    public final android.widget.Button P;
    public final android.widget.TextView Q;

    public i3(android.content.Context context) {
        super(context);
        i(com.tencent.mm.R.layout.biu);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f212058g.findViewById(com.tencent.mm.R.id.dhp);
        this.Q = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.dhi);
        this.L = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.f487331ob2);
        this.M = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.oad);
        this.N = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.kao);
        this.P = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.b5i);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_error, context.getResources().getColor(com.tencent.mm.R.color.f478554ao)));
    }

    @Override // com.tencent.mm.ui.widget.dialog.z2
    public int c() {
        return com.tencent.mm.R.layout.byn;
    }
}
