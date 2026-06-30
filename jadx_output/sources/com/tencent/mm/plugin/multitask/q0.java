package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f150484a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f150485b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f150486c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f150487d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f150488e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f150489f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f150490g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f150491h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f150492i;

    /* renamed from: j, reason: collision with root package name */
    public static int f150493j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f150494k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f150495l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f150496m;

    static {
        int i17;
        int h17 = com.tencent.mm.ui.bl.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a0g);
        int f17 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0j);
        f150484a = f17;
        f150485b = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0a);
        f150486c = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0b);
        int f18 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0h);
        f150487d = f18;
        f150488e = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0i);
        int dimensionPixelSize2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480526a16);
        int dimensionPixelSize3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480525a15);
        f150489f = dimensionPixelSize3;
        f150490g = dimensionPixelSize3 / dimensionPixelSize2;
        i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = al3.c.f5851a;
        f150491h = dimensionPixelSize + h17;
        f150492i = (i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a) - dimensionPixelSize) - ((i18 + f17) + f18);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        try {
            i17 = com.tencent.mm.ui.bl.c(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e17);
            i17 = 0;
        }
        f150493j = i17;
        f150494k = h17;
        f150495l = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) - i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.apf);
        f150496m = (int) (i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a) * 0.4f);
    }
}
