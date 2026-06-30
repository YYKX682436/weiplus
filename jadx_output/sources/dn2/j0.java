package dn2;

/* loaded from: classes3.dex */
public final class j0 implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241929a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241930b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f241931c = jz5.h.b(new dn2.i0(this));

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        int i17;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241929a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241930b = (android.widget.TextView) findViewById2;
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.widget.TextView textView = this.f241930b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.widget.TextView textView2 = this.f241930b;
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
        android.view.View view = this.f241929a;
        if (view == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        sb6.append(view.getContext().getString(com.tencent.mm.R.string.ehh, nf6));
        java.lang.String sb7 = sb6.toString();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.view.View view2 = this.f241929a;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        android.content.Context context2 = view2.getContext();
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, sb7));
        android.widget.TextView textView3 = this.f241930b;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            k0Var.getViewScope();
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) dk2.ef.f233411z.get("16_white");
        if (bitmap != null) {
            android.content.Context context3 = textView3.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            int e17 = e();
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context3.getResources(), bitmap);
            try {
                i17 = (int) ((e17 * bitmap.getWidth()) / bitmap.getHeight());
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("ShoppingUtil", "buildImageSpan " + e18.getMessage());
                i17 = e17 * 2;
            }
            bitmapDrawable.setBounds(0, 0, i17, e17);
            f0Var.c(new al5.w(bitmapDrawable, 1), 0, 1, 33);
        } else {
            f0Var.c((al5.w) ((jz5.n) this.f241931c).getValue(), 0, 1, 33);
        }
        android.widget.TextView textView4 = this.f241930b;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        android.view.ViewParent parent = textView4.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            int i18 = cn2.d0.f43489b;
            viewGroup.setPadding(cn2.d0.f43490c, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        android.widget.TextView textView5 = this.f241930b;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        textView5.setText(f0Var);
        android.widget.TextView textView6 = this.f241930b;
        if (textView6 == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        textView6.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        android.view.View view3 = this.f241929a;
        if (view3 != null) {
            view3.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.f481784j9));
            return rootView;
        }
        kotlin.jvm.internal.o.o("bulletContent");
        throw null;
    }

    public final int e() {
        if (zl2.r4.f473950a.w1()) {
            int i17 = cn2.d0.f43489b;
            return cn2.d0.f43493f;
        }
        int i18 = cn2.d0.f43489b;
        return cn2.d0.f43492e;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488867dj3;
    }
}
