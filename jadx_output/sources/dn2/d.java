package dn2;

/* loaded from: classes3.dex */
public final class d implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241899a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241900b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241899a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241900b = (android.widget.TextView) findViewById2;
        dk2.w7 w7Var = liveMsg instanceof dk2.w7 ? (dk2.w7) liveMsg : null;
        java.lang.Object D = w7Var != null ? w7Var.D() : null;
        r45.qi1 qi1Var = D instanceof r45.qi1 ? (r45.qi1) D : null;
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.widget.TextView textView = this.f241900b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.widget.TextView textView2 = this.f241900b;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.text.TextPaint paint = textView2.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        r45.xn1 r17 = liveMsg.r();
        if (r17 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) r17.getCustom(0)) == null || (str = finderContact.getNickname()) == null) {
            str = "";
        }
        java.lang.CharSequence nf6 = c61.yb.nf(ybVar, context, paint, new android.text.SpannableString(str), 0, 8, null);
        int integer = qi1Var != null ? qi1Var.getInteger(2) : 0;
        android.view.View view = this.f241899a;
        if (view == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(new gm2.t1(gm2.c2.f273348g, gm2.e2.f273361g).i(integer));
        drawable.setAlpha(230);
        view.setBackground(drawable);
        android.view.View view2 = this.f241899a;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        java.lang.String string = view2.getContext().getString(com.tencent.mm.R.string.onp, nf6, java.lang.Integer.valueOf(integer));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mars.xlog.Log.i("GlobalLevelUpgradeBulletItem", "setBulletComment id:" + liveMsg.f() + ", msgContent: " + string + ", level:" + integer);
        boolean z17 = integer >= 80;
        int i17 = z17 ? cn2.d0.f43489b : 0;
        gm2.c1 c1Var = gm2.c1.f273320a;
        android.widget.TextView textView3 = this.f241900b;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.text.style.ImageSpan b17 = c1Var.b(integer, textView3, new gm2.t1(gm2.c2.f273351m, null, 2, null), i17, c1Var.k(), null);
        android.view.View view3 = this.f241899a;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        android.content.Context context2 = view3.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.pluginsdk.ui.span.f0 q17 = c1Var.q(context2, string, kz5.b0.c(b17), true);
        int i18 = z17 ? 0 : cn2.d0.f43489b;
        android.widget.TextView textView4 = this.f241900b;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.view.ViewParent parent = textView4.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setPadding(i18, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        android.widget.TextView textView5 = this.f241900b;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        textView5.setText(q17);
        android.widget.TextView textView6 = this.f241900b;
        if (textView6 != null) {
            textView6.setTextColor(zl2.r4.f473950a.W0(integer));
            return rootView;
        }
        kotlin.jvm.internal.o.o("bulletContentTv");
        throw null;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aox;
    }
}
