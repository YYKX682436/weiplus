package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class uc {

    /* renamed from: a, reason: collision with root package name */
    public static int f211078a;

    /* renamed from: b, reason: collision with root package name */
    public static int f211079b;

    /* renamed from: c, reason: collision with root package name */
    public static int f211080c;

    /* renamed from: d, reason: collision with root package name */
    public static int f211081d;

    /* renamed from: e, reason: collision with root package name */
    public static int f211082e;

    /* renamed from: f, reason: collision with root package name */
    public static int f211083f;

    /* renamed from: g, reason: collision with root package name */
    public static int f211084g;

    /* renamed from: h, reason: collision with root package name */
    public static int f211085h;

    static {
        boolean g17 = db5.f.g() & ep.a.a();
        int i17 = g17 ? com.tencent.mm.R.anim.f477886ea : com.tencent.mm.R.anim.f477843d1;
        f211078a = i17;
        int i18 = com.tencent.mm.R.anim.f477728p;
        int i19 = g17 ? com.tencent.mm.R.anim.f477882e6 : com.tencent.mm.R.anim.f477728p;
        f211079b = i19;
        if (g17) {
            i18 = com.tencent.mm.R.anim.f477880e4;
        }
        f211080c = i18;
        int i27 = g17 ? com.tencent.mm.R.anim.f477889ed : com.tencent.mm.R.anim.f477848d6;
        f211081d = i27;
        f211082e = i17;
        f211083f = i19;
        f211084g = i18;
        f211085h = i27;
    }

    public static void a() {
        wo.v1.f447827g.getClass();
        boolean z17 = false;
        if (wo.h1.f447716b) {
            wo.h1.f447716b = false;
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle swipbackType = " + z17);
        if (z17) {
            boolean g17 = db5.f.g() & ep.a.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle supportSwipe = " + g17);
            f211078a = g17 ? com.tencent.mm.R.anim.f477887eb : com.tencent.mm.R.anim.f477843d1;
            int i17 = com.tencent.mm.R.anim.f477728p;
            f211079b = g17 ? com.tencent.mm.R.anim.f477883e7 : com.tencent.mm.R.anim.f477728p;
            if (g17) {
                i17 = com.tencent.mm.R.anim.f477881e5;
            }
            f211080c = i17;
            int i18 = g17 ? com.tencent.mm.R.anim.f477890ee : com.tencent.mm.R.anim.f477848d6;
            f211081d = i18;
            f211082e = f211078a;
            f211083f = f211079b;
            f211084g = f211080c;
            f211085h = i18;
        }
    }
}
