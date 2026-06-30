package zj3;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final zj3.i f473328a = new zj3.i();

    /* renamed from: b, reason: collision with root package name */
    public static final zj3.h[] f473329b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f473330c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f473331d;

    /* renamed from: e, reason: collision with root package name */
    public static long f473332e;

    /* renamed from: f, reason: collision with root package name */
    public static long f473333f;

    /* renamed from: g, reason: collision with root package name */
    public static long f473334g;

    /* renamed from: h, reason: collision with root package name */
    public static long f473335h;

    /* renamed from: i, reason: collision with root package name */
    public static int f473336i;

    static {
        zj3.h[] hVarArr = new zj3.h[5];
        for (int i17 = 0; i17 < 5; i17++) {
            hVarArr[i17] = new zj3.h(i17, 0L, 0);
        }
        f473329b = hVarArr;
        f473330c = kz5.c1.k(new jz5.l(0, 0), new jz5.l(1, 3), new jz5.l(2, 6), new jz5.l(3, 9), new jz5.l(4, 12));
        f473331d = new int[2];
    }

    public final void a(int i17, long j17) {
        zj3.h hVar = f473329b[i17];
        hVar.f473327c++;
        hVar.f473326b += j17;
    }

    public final void b(int i17) {
        if (f473336i == 0) {
            f473332e = java.lang.System.currentTimeMillis();
        }
        if (i17 != f473336i) {
            int[] iArr = f473331d;
            if (i17 == 1) {
                iArr[0] = iArr[0] + 1;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - f473332e;
                f473334g += currentTimeMillis;
                f473333f += currentTimeMillis;
            } else if (i17 == 2) {
                iArr[1] = iArr[1] + 1;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - f473332e;
                f473335h += currentTimeMillis2;
                f473333f += currentTimeMillis2;
            }
            f473332e = java.lang.System.currentTimeMillis();
            f473336i = i17;
        }
    }

    public final void c(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MultitalkReportHelper", "report avg key: " + i17 + " value: " + j17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.m(com.tencent.mm.plugin.appbrand.jsapi.game.f.CTRL_INDEX, i17, i17 + 1, (int) j17, false);
    }

    public final void d() {
        zj3.h[] hVarArr = f473329b;
        for (int i17 = 0; i17 < 5; i17++) {
            zj3.h hVar = hVarArr[i17];
            hVar.f473326b = 0L;
            hVar.f473327c = 0;
        }
        int[] iArr = f473331d;
        int length = iArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            iArr[i18] = 0;
        }
        f473332e = 0L;
        f473333f = 0L;
        f473335h = 0L;
        f473334g = 0L;
        f473336i = 0;
    }
}
