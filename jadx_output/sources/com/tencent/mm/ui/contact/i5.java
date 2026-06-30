package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public abstract class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f206780a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f206781b;

    /* renamed from: c, reason: collision with root package name */
    public static int f206782c;

    /* renamed from: d, reason: collision with root package name */
    public static int f206783d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f206784e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f206785f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f206786g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f206787h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f206788i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f206789j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f206790k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean[] f206791l;

    static {
        int g17 = g(256, 16, 1, 2, 4);
        f206780a = g17;
        f206781b = g(16, 1, 2, 4, 64, 16384);
        f206782c = g(16, 1, 2, 4, 64, 16384, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        g(16, 1, 2, 4, 16384, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        f206783d = g(16, 1, 2, 4, 64, 4096, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        f206784e = g(1, 2, 4, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        f206785f = g(g17, 64, 16384, 4096, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        f206786g = g(16, 2, 16384, 4);
        f206787h = g(g17, 16384, 64, 4096, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        f206788i = g(g17, 16384, 64, 131072, 8192, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        f206789j = g(16, 32, 1, 4, 2, 64);
        g(1, 2, 4, 64, 256, 16384);
        f206790k = g(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62, 67108864, 1, 2, 4, 64, 16384);
        g(f206782c, 131072);
        f206791l = new boolean[]{false};
    }

    public static int a() {
        e();
        return f206783d;
    }

    public static java.util.HashSet b() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("weixin");
        return hashSet;
    }

    public static java.util.HashSet c() {
        java.util.HashSet i17 = c01.e2.i();
        i17.add(c01.z1.r());
        i17.add("weixin");
        i17.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        return i17;
    }

    public static boolean d(int i17, int i18) {
        return (i17 & i18) > 0;
    }

    public static void e() {
        boolean[] zArr = f206791l;
        if (zArr[0]) {
            return;
        }
        boolean f17 = f();
        synchronized (zArr) {
            if (!zArr[0]) {
                if (f17) {
                    if (!d(f206782c, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                        f206782c = g(f206782c, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                    }
                    if (!d(f206783d, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                        f206783d = g(f206783d, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                    }
                } else {
                    if (d(f206782c, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                        f206782c &= -16777217;
                    }
                    if (d(f206783d, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                        f206783d &= -16777217;
                    }
                }
                zArr[0] = true;
            }
        }
    }

    public static boolean f() {
        int i17;
        try {
            i17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ShowOpenImInGroup", 0);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MMSelectContactLogic", "get config val crashed. use 0 as default");
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MMSelectContactLogic", "config_val %s ", java.lang.Integer.valueOf(i17));
        return i17 != 0;
    }

    public static int g(int... iArr) {
        if (iArr == null) {
            return 0;
        }
        int i17 = 0;
        for (int i18 : iArr) {
            i17 |= i18;
        }
        return i17;
    }
}
