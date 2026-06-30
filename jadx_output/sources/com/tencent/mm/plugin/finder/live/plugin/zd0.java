package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zd0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.de0 f115328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.t12 f115329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f115330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f115331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f115332h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f115333i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd0(com.tencent.mm.plugin.finder.live.plugin.de0 de0Var, r45.t12 t12Var, boolean z17, boolean z18, boolean z19, boolean z27) {
        super(0);
        this.f115328d = de0Var;
        this.f115329e = t12Var;
        this.f115330f = z17;
        this.f115331g = z18;
        this.f115332h = z19;
        this.f115333i = z27;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.text.style.ImageSpan imageSpan;
        android.text.SpannableString i17;
        int i18;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String nickname;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.String username;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = this.f115328d;
        android.view.View view = de0Var.f112283x;
        if (view != null) {
            de0Var.x1(view);
        }
        de0Var.K0(0);
        android.view.ViewGroup viewGroup = de0Var.f365323d;
        viewGroup.setAlpha(0.01f);
        com.tencent.mm.ui.bk.r0(com.tencent.mm.plugin.finder.live.plugin.de0.t1(de0Var).getPaint(), 0.8f);
        java.lang.String str = ((mm2.c1) de0Var.S0().a(mm2.c1.class)).f328852o;
        r45.t12 t12Var = this.f115329e;
        boolean b17 = kotlin.jvm.internal.o.b(str, t12Var.getString(4));
        boolean z17 = this.f115332h;
        boolean z18 = this.f115331g;
        boolean z19 = this.f115330f;
        boolean z27 = this.f115333i;
        java.lang.String y17 = (b17 || z19 || z18 || z17 || z27) ? com.tencent.mm.plugin.finder.live.plugin.de0.y1(z19, z18, z17, z27) : "";
        java.lang.String str2 = null;
        if (y17.length() == 0) {
            gm2.c1 c1Var = gm2.c1.f273320a;
            r45.xn1 xn1Var = (r45.xn1) t12Var.getCustom(8);
            java.util.LinkedList list = xn1Var != null ? xn1Var.getList(11) : null;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put(9, gm2.c2.f273349h);
            imageSpan = (android.text.style.ImageSpan) kz5.n0.Z(gm2.c1.r(c1Var, list, new int[]{9}, null, null, 0, null, null, 0, 0, null, linkedHashMap, com.tencent.mm.plugin.appbrand.jsapi.s6.CTRL_INDEX, null));
        } else {
            imageSpan = null;
        }
        r45.xn1 xn1Var2 = (r45.xn1) t12Var.getCustom(11);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = xn1Var2 != null ? (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0) : null;
        java.lang.String str3 = de0Var.f112275p;
        if (finderContact4 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#initTopComment reply text span. reply to ");
            r45.xn1 xn1Var3 = (r45.xn1) t12Var.getCustom(11);
            if (xn1Var3 != null && (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) != null) {
                str2 = finderContact3.getUsername();
            }
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i(str3, sb6.toString());
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.text.TextPaint paint = com.tencent.mm.plugin.finder.live.plugin.de0.t1(de0Var).getPaint();
            kotlin.jvm.internal.o.f(paint, "getPaint(...)");
            zl2.r4 r4Var = zl2.r4.f473950a;
            java.lang.CharSequence nf6 = c61.yb.nf(ybVar, context, paint, zl2.r4.D0(r4Var, t12Var.getString(4), t12Var.getString(0), false, 4, null), 0, 8, null);
            i95.m c18 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c61.yb ybVar2 = (c61.yb) c18;
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            android.text.TextPaint paint2 = com.tencent.mm.plugin.finder.live.plugin.de0.t1(de0Var).getPaint();
            kotlin.jvm.internal.o.f(paint2, "getPaint(...)");
            r45.xn1 xn1Var4 = (r45.xn1) t12Var.getCustom(11);
            java.lang.String str4 = (xn1Var4 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null || (username = finderContact2.getUsername()) == null) ? "" : username;
            r45.xn1 xn1Var5 = (r45.xn1) t12Var.getCustom(11);
            java.lang.CharSequence nf7 = c61.yb.nf(ybVar2, context2, paint2, zl2.r4.D0(r4Var, str4, (xn1Var5 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null || (nickname = finderContact.getNickname()) == null) ? "" : nickname, false, 4, null), 0, 8, null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = viewGroup.getContext();
            java.lang.String u17 = com.tencent.mm.plugin.finder.live.plugin.de0.u1(de0Var, y17, imageSpan, viewGroup.getContext().getString(com.tencent.mm.R.string.efk, nf6, nf7));
            ((ke0.e) xVar).getClass();
            i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context3, u17);
        } else {
            com.tencent.mars.xlog.Log.i(str3, "#initTopComment normal span.");
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context4 = viewGroup.getContext();
            java.lang.String concat = com.tencent.mm.plugin.finder.live.plugin.de0.u1(de0Var, y17, imageSpan, zl2.r4.D0(zl2.r4.f473950a, t12Var.getString(4), t12Var.getString(0), false, 4, null)).concat(" ");
            ((ke0.e) xVar2).getClass();
            i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context4, concat);
        }
        if (y17.length() > 0) {
            android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f273498f, com.tencent.mm.plugin.finder.live.plugin.de0.y1(z19, z18, z17, z27), 0.0f, 0.0f, 6, null);
            java.lang.String y18 = com.tencent.mm.plugin.finder.live.plugin.de0.y1(z19, z18, z17, z27);
            float f17 = gm2.w.f273511k;
            i17.setSpan(new gm2.v(a17, new gm2.w(y18, f17, f17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_0_5), gm2.w.f273509i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5), gm2.w.f273510j, 0.0f, 128, null)), 0, y17.length() + 0, 33);
            i18 = y17.length() + 0;
        } else {
            i18 = 0;
        }
        if (imageSpan != null) {
            i17.setSpan(imageSpan, i18, i18 + 1, 33);
        }
        android.widget.TextView t17 = com.tencent.mm.plugin.finder.live.plugin.de0.t1(de0Var);
        android.content.Context context5 = viewGroup.getContext();
        int i19 = com.tencent.mm.R.dimen.f479689co;
        t17.setTextSize(0, i65.a.h(context5, z27 ? com.tencent.mm.R.dimen.f479689co : com.tencent.mm.R.dimen.f479674cb));
        com.tencent.mm.plugin.finder.live.plugin.de0.t1(de0Var).setText(i17);
        com.tencent.mm.plugin.finder.live.plugin.de0.t1(de0Var).setSingleLine(!z27);
        android.widget.TextView v17 = de0Var.v1();
        android.content.Context context6 = viewGroup.getContext();
        if (z27) {
            i19 = com.tencent.mm.R.dimen.f479674cb;
        }
        v17.setTextSize(0, i65.a.h(context6, i19));
        if (z27) {
            de0Var.v1().setAlpha(0.55f);
        } else {
            de0Var.v1().setAlpha(1.0f);
        }
        android.widget.TextView v18 = de0Var.v1();
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context7 = viewGroup.getContext();
        java.lang.String string = t12Var.getString(2);
        ((ke0.e) xVar3).getClass();
        v18.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context7, string));
        android.widget.ScrollView scrollView = (android.widget.ScrollView) ((jz5.n) de0Var.f112278s).getValue();
        java.lang.CharSequence text = de0Var.v1().getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        scrollView.setVisibility(text.length() > 0 ? 0 : 8);
        de0Var.v1().setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        de0Var.v1().post(new com.tencent.mm.plugin.finder.live.plugin.yd0(de0Var, t12Var));
        return jz5.f0.f302826a;
    }
}
