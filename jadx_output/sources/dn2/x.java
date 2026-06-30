package dn2;

/* loaded from: classes3.dex */
public final class x implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241991a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241992b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.content.Context context = rootView.getContext();
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241991a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f241992b = textView;
        textView.setGravity(3);
        jz5.f0 f0Var = null;
        dk2.a8 a8Var = liveMsg instanceof dk2.a8 ? (dk2.a8) liveMsg : null;
        if (a8Var != null) {
            java.lang.Object D = a8Var.D();
            r45.ej1 ej1Var = D instanceof r45.ej1 ? (r45.ej1) D : null;
            if (ej1Var != null) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                kotlin.jvm.internal.o.d(context);
                android.widget.TextView textView2 = this.f241992b;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("bulletContentTv");
                    throw null;
                }
                android.text.TextPaint paint = textView2.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                java.lang.String k17 = liveMsg.k();
                if (k17 == null) {
                    k17 = "";
                }
                java.lang.String obj = c61.yb.nf(ybVar, context, paint, k17, 0, 8, null).toString();
                android.widget.TextView textView3 = this.f241992b;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("bulletContentTv");
                    throw null;
                }
                textView3.setText(obj + ' ' + ej1Var.getString(1));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show LiveInteractiveBulletItem, tips:");
                sb6.append(ej1Var.getString(1));
                com.tencent.mars.xlog.Log.i("LiveInteractiveBulletItem", sb6.toString());
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("LiveInteractiveBulletItem", "invalid livemsg:" + liveMsg);
        }
        return rootView;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488867dj3;
    }
}
