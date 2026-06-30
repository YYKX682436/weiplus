package nm;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f338400a = {0, 1, 2};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f338401b = {3, 13, 23};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f338402c = {4, 14, 24};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f338403d = {5, 15, 25};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f338404e = {6, 16, 26};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f338405f = {7, 17, 27};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f338406g = {8, 18, 28};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f338407h = {9, 19, 29};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f338408i = {63, 69, 75};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f338409j = {64, 70, 76};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f338410k = {65, 71, 77};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f338411l = {66, 72, 78};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f338412m = {0};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f338413n = {3};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f338414o = {9};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f338415p = {10};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f338416q = {11};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f338417r = {12};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f338418s = {13};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f338419t = {14};

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f338420u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.ArrayList f338421v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public static boolean f338422w = false;

    /* renamed from: x, reason: collision with root package name */
    public static long f338423x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static long f338424y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static long f338425z = 0;
    public static byte A = 0;

    public static boolean a(int i17) {
        byte b17 = A;
        if ((b17 & i17) != 0) {
            return false;
        }
        A = (byte) (b17 | i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BlinkStartup", "checkAndMark bit 0x%x", java.lang.Integer.valueOf(i17));
        return true;
    }

    public static void b(long j17, long j18) {
        f338420u.add(new long[]{709, j17, j18});
    }

    public static void c(int[] iArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BlinkStartup", "%s %s", java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(j17));
        b(iArr[0], j17);
        b(iArr[1], j17);
    }

    public static void d(int[] iArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BlinkStartup", "%s %s", java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(j17));
        f338420u.add(new long[]{910, iArr[0], j17});
    }

    public static void e(int i17) {
        if (f338425z == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BlinkStartup", "sLastPhaseTimestamp is 0");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - f338425z;
        switch (i17) {
            case 1:
                if (a(1)) {
                    c(f338401b, currentTimeMillis);
                    f338425z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 2:
                if (a(2)) {
                    c(f338402c, currentTimeMillis);
                    f338425z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 3:
                if (a(4)) {
                    c(f338403d, currentTimeMillis);
                    f338425z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 4:
                if (a(8)) {
                    c(f338404e, currentTimeMillis);
                    f338425z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 5:
                if (a(16)) {
                    if (currentTimeMillis > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                        a(512);
                        f338422w = false;
                    }
                    c(f338405f, currentTimeMillis);
                    f338425z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 6:
                if (a(32)) {
                    if (currentTimeMillis > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                        a(512);
                        f338422w = false;
                    }
                    c(f338406g, currentTimeMillis);
                    f338425z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
