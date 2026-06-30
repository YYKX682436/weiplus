package dn2;

/* loaded from: classes.dex */
public final class w implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241989a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241990b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241989a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241990b = (android.widget.TextView) findViewById2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show MMFinder_LiveAppMsg_Type_ReserveOrDownloadGame ");
        java.lang.Object D = liveMsg.D();
        if (D == null) {
            D = "";
        }
        sb6.append(pm0.b0.g(D));
        com.tencent.mars.xlog.Log.i("LiveGameReserveOrDownloadBulletItem", sb6.toString());
        java.lang.Object D2 = liveMsg.D();
        r45.yj1 yj1Var = D2 instanceof r45.yj1 ? (r45.yj1) D2 : null;
        if (yj1Var != null) {
            android.widget.TextView textView = this.f241990b;
            if (textView == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView.setText(yj1Var.getString(0) + yj1Var.getString(1));
        }
        android.widget.TextView textView2 = this.f241990b;
        if (textView2 != null) {
            textView2.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            return rootView;
        }
        kotlin.jvm.internal.o.o("bulletContentTv");
        throw null;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dqx;
    }
}
