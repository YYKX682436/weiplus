package tx2;

/* loaded from: classes3.dex */
public final class z0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f422676d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f422677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.coroutines.Continuation continuation) {
        android.widget.TextView textView;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = nVar;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        y1Var.f212037s = new tx2.x0(h0Var);
        tx2.y0 y0Var = new tx2.y0(h0Var);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c8z, (android.view.ViewGroup) this, false);
        this.f422676d = inflate;
        if (inflate != null && (findViewById3 = inflate.findViewById(com.tencent.mm.R.id.bf_)) != null) {
            findViewById3.setOnClickListener(new tx2.t0(this));
        }
        android.view.View view = this.f422676d;
        if (view != null && (findViewById2 = view.findViewById(com.tencent.mm.R.id.f485663ij2)) != null) {
            findViewById2.setOnClickListener(new tx2.u0(this));
        }
        android.view.View view2 = this.f422676d;
        if (view2 != null && (findViewById = view2.findViewById(com.tencent.mm.R.id.bfa)) != null) {
            findViewById.setOnClickListener(new tx2.v0(this, y0Var));
        }
        android.view.View view3 = this.f422676d;
        if (view3 != null && (imageView2 = (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.f485410hl1)) != null) {
            n11.a.b().g(str, imageView2);
        }
        android.view.View view4 = this.f422676d;
        if (view4 != null && (imageView = (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.ehp)) != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_channel, i65.a.d(imageView.getContext(), com.tencent.mm.R.color.f478526a7)));
        }
        android.view.View view5 = this.f422676d;
        android.widget.TextView textView2 = view5 != null ? (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.oqh) : null;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        android.view.View view6 = this.f422676d;
        android.widget.TextView textView3 = view6 != null ? (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.f487432om4) : null;
        if (textView3 != null) {
            textView3.setText(str3);
        }
        android.view.View view7 = this.f422676d;
        if (view7 != null && (textView = (android.widget.TextView) view7.findViewById(com.tencent.mm.R.id.f487459op4)) != null) {
            hc2.o.a(textView, true);
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.e3x, java.lang.Integer.valueOf(i17)));
        }
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new tx2.w0(this));
        y1Var.k(this.f422676d);
        y1Var.s();
        this.f422677e = y1Var;
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final android.view.View getRoot() {
        return this.f422676d;
    }

    public final void setRoot(android.view.View view) {
        this.f422676d = view;
    }
}
