package gp3;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public android.view.View.OnClickListener M;
    public java.lang.String N;
    public java.lang.String P;

    public p(android.content.Context context) {
        super(context);
        this.L = null;
        this.G = com.tencent.mm.R.layout.bwc;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        java.lang.String str;
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.j_4);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j_5);
        imageView.setImageBitmap(null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
            o11.f fVar = new o11.f();
            bp3.f.wi().getClass();
            if (gm0.j1.a()) {
                str = g83.a.a() + "order";
            } else {
                str = "";
            }
            fVar.f342083g = str;
            fVar.f342078b = true;
            fVar.f342095s = true;
            fVar.f342096t = true;
            n11.a.b().h(this.P, imageView, fVar.a());
        }
        textView.setText(this.N);
        view.findViewById(com.tencent.mm.R.id.j_3).setOnClickListener(this.M);
    }
}
