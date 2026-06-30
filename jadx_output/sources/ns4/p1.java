package ns4;

/* loaded from: classes.dex */
public final class p1 implements js4.h {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f339616a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f339617b;

    /* renamed from: c, reason: collision with root package name */
    public js4.g f339618c;

    public p1(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0, true, z17);
        this.f339616a = z2Var;
        z2Var.y(context.getString(com.tencent.mm.R.string.l9_));
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.f339616a;
        if (z2Var2 == null) {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
        z2Var2.F = new ns4.n1(this);
        z2Var2.l(new ns4.o1(this));
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bpq, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f339617b = inflate;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pku);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View view = this.f339617b;
        if (view == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.pjx);
        android.view.View view2 = this.f339617b;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pkv);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        java.lang.String r17 = c01.z1.r();
        java.lang.String l17 = c01.z1.l();
        l17 = l17.length() == 0 ? c01.z1.b() : l17;
        l17 = l17 == null || l17.length() == 0 ? r17 : l17;
        if (!(r17 == null || r17.length() == 0) && gm0.j1.a()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, r17, null);
        }
        textView2.setText(l17);
        if (z17) {
            android.view.View view3 = this.f339617b;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("mCustomView");
                throw null;
            }
            view3.findViewById(com.tencent.mm.R.id.pkt).setBackgroundResource(com.tencent.mm.R.drawable.ci9);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var3 = this.f339616a;
        if (z2Var3 == null) {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
        android.view.View view4 = this.f339617b;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        z2Var3.j(view4);
        com.tencent.mm.ui.widget.dialog.z2 z2Var4 = this.f339616a;
        if (z2Var4 != null) {
            z2Var4.C();
        } else {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
    }
}
