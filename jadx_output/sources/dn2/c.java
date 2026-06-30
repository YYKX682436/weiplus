package dn2;

/* loaded from: classes3.dex */
public final class c implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241894a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241895b;

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
        this.f241894a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241895b = (android.widget.TextView) findViewById2;
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.widget.TextView textView = this.f241895b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.widget.TextView textView2 = this.f241895b;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.text.TextPaint paint = textView2.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        r45.xn1 C = liveMsg.C();
        if (C == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) C.getCustom(0)) == null || (str = finderContact.getNickname()) == null) {
            str = "";
        }
        java.lang.CharSequence nf6 = c61.yb.nf(ybVar, context, paint, new android.text.SpannableString(str), 0, 8, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show FinderLiveAppMsgGameLivePurchaseTeamUpInfo ");
        java.lang.Object D = liveMsg.D();
        sb6.append(pm0.b0.g(D != null ? D : ""));
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin_BulletNew_View", sb6.toString());
        java.lang.Object D2 = liveMsg.D();
        r45.li1 li1Var = D2 instanceof r45.li1 ? (r45.li1) D2 : null;
        if (li1Var != null) {
            android.view.View view = this.f241894a;
            if (view == null) {
                kotlin.jvm.internal.o.o("bulletContent");
                throw null;
            }
            java.lang.String string = view.getContext().getString(li1Var.getInteger(0) == 1 ? com.tencent.mm.R.string.mqe : com.tencent.mm.R.string.mqd, nf6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.widget.TextView textView3 = this.f241895b;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            android.view.ViewParent parent = textView3.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                int i17 = cn2.d0.f43489b;
                viewGroup.setPadding(cn2.d0.f43490c, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            }
            android.widget.TextView textView4 = this.f241895b;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView4.setText(string);
        }
        android.widget.TextView textView5 = this.f241895b;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        textView5.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        android.view.View view2 = this.f241894a;
        if (view2 != null) {
            view2.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
            return rootView;
        }
        kotlin.jvm.internal.o.o("bulletContent");
        throw null;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488867dj3;
    }
}
