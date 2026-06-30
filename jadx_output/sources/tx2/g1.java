package tx2;

/* loaded from: classes3.dex */
public final class g1 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f422567d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f422568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final java.lang.Object a(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.Button button;
        android.view.View findViewById;
        android.view.View findViewById2;
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = nVar;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        y1Var.f212037s = new tx2.e1(h0Var);
        tx2.f1 f1Var = new tx2.f1(h0Var);
        com.tencent.mars.xlog.Log.i("FinderLivePayLiveSecondCheckWidget", "#initView title=" + str + " price=" + i17 + " rightsWording=" + str2 + " buttonWord=" + str3);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489353c90, (android.view.ViewGroup) this, false);
        this.f422567d = inflate;
        if (inflate != null && (findViewById2 = inflate.findViewById(com.tencent.mm.R.id.bf_)) != null) {
            findViewById2.setOnClickListener(new tx2.a1(this));
        }
        android.view.View view = this.f422567d;
        if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.f485663ij2)) != null) {
            findViewById.setOnClickListener(new tx2.b1(this));
        }
        android.view.View view2 = this.f422567d;
        if (view2 != null && (button = (android.widget.Button) view2.findViewById(com.tencent.mm.R.id.bfa)) != null) {
            if (!(str3 == null || str3.length() == 0)) {
                button.setText(str3);
            }
            button.setOnClickListener(new tx2.c1(this, f1Var));
            com.tencent.mm.ui.fk.a(button);
        }
        android.view.View view3 = this.f422567d;
        android.widget.TextView textView3 = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.oqh) : null;
        if (str.length() > 0) {
            if (textView3 != null) {
                textView3.setText(str);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } else if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.view.View view4 = this.f422567d;
        if (view4 != null && (textView2 = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.f487459op4)) != null) {
            hc2.o.a(textView2, true);
            textView2.setText(java.lang.String.valueOf(i17));
        }
        android.view.View view5 = this.f422567d;
        if (view5 != null && (textView = (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.f487460op5)) != null) {
            textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.d_2, new java.text.DecimalFormat("#.#").format(java.lang.Float.valueOf(i17 / 10.0f))));
        }
        android.view.View view6 = this.f422567d;
        android.widget.TextView textView4 = view6 != null ? (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.oph) : null;
        if (textView4 != null) {
            textView4.setText(str2);
        }
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new tx2.d1(this));
        y1Var.k(this.f422567d);
        y1Var.m(java.lang.Boolean.TRUE);
        y1Var.s();
        this.f422568e = y1Var;
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final android.view.View getRoot() {
        return this.f422567d;
    }

    public final void setRoot(android.view.View view) {
        this.f422567d = view;
    }
}
