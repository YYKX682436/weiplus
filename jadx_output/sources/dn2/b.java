package dn2;

/* loaded from: classes3.dex */
public final class b implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241886a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241887b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        if (!(liveMsg instanceof dk2.w5)) {
            com.tencent.mars.xlog.Log.e("CommentTopAreaBulletItem", "invalid livemsg:" + liveMsg);
            return rootView;
        }
        android.content.Context context = rootView.getContext();
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241886a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241887b = (android.widget.TextView) findViewById2;
        android.view.View view = this.f241886a;
        if (view == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        int color = context.getResources().getColor(com.tencent.mm.R.color.f479549ab0);
        android.widget.TextView textView = this.f241887b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        textView.setTextColor(color);
        r45.dj1 dj1Var = ((dk2.w5) liveMsg).f234279b;
        java.lang.String string = dj1Var.getString(1);
        if (string == null) {
            string = "";
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) dj1Var.getCustom(3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show FinderLiveEnterRoomBulletAppMsg, tips:");
        sb6.append(string);
        sb6.append(" hasJumpInfo:");
        sb6.append(finderJumpInfo != null);
        com.tencent.mars.xlog.Log.i("CommentTopAreaBulletItem", sb6.toString());
        if (finderJumpInfo != null) {
            android.widget.TextView textView2 = this.f241887b;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView2.setOnClickListener(new dn2.a(this, string, finderJumpInfo));
            android.text.SpannableString spannableString = new android.text.SpannableString(string.concat("arrow"));
            android.graphics.drawable.Drawable e17 = m95.a.e(context.getResources(), com.tencent.mm.R.raw.icons_outlined_arrow, 0.0f);
            kotlin.jvm.internal.o.f(e17, "getSVGDrawable(...)");
            e17.setColorFilter(new android.graphics.PorterDuffColorFilter(color, android.graphics.PorterDuff.Mode.SRC_ATOP));
            e17.setBounds(0, 0, es.h.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 8), es.h.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16));
            com.tencent.mm.plugin.finder.feed.ui.sq sqVar = new com.tencent.mm.plugin.finder.feed.ui.sq(e17);
            e06.k kVar = new e06.k(spannableString.length() - 5, spannableString.length());
            spannableString.setSpan(sqVar, kVar.h().intValue(), kVar.g().intValue(), 17);
            android.widget.TextView textView3 = this.f241887b;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView3.setText(spannableString);
        } else {
            android.widget.TextView textView4 = this.f241887b;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView4.setOnClickListener(null);
            android.widget.TextView textView5 = this.f241887b;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView5.setText(string);
        }
        if (dj1Var.getInteger(0) == 2) {
            android.widget.TextView textView6 = this.f241887b;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView6.setMaxLines(3);
            android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
            layoutParams.height = -2;
            rootView.setMinimumHeight((int) rootView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db));
            rootView.setLayoutParams(layoutParams);
            android.view.View view2 = this.f241886a;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("bulletContent");
                throw null;
            }
            int b17 = i65.a.b(context, 3);
            view2.setPadding(view2.getPaddingLeft(), b17, view2.getPaddingRight(), b17);
        }
        return rootView;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488867dj3;
    }
}
