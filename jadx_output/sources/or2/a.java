package or2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    public static final or2.a f347607a = new or2.a();

    /* renamed from: b */
    public static int f347608b = 0;

    /* renamed from: c */
    public static long f347609c = 0;

    /* renamed from: d */
    public static long f347610d = 0;

    /* renamed from: e */
    public static java.lang.String f347611e = "";

    /* renamed from: f */
    public static int f347612f;

    /* renamed from: g */
    public static int f347613g;

    /* renamed from: h */
    public static boolean f347614h;

    /* renamed from: i */
    public static boolean f347615i;

    public static /* synthetic */ void d(or2.a aVar, boolean z17, boolean z18, long j17, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z19 = false;
        }
        aVar.c(z17, z18, j17, z19);
    }

    public final boolean a() {
        int i17 = f347613g - 1;
        f347613g = i17;
        if (i17 > 0) {
            return false;
        }
        f347613g = 0;
        if ((f347608b & 1) != 0) {
            d(this, true, true, f347610d, false, 8, null);
        } else {
            d(this, false, false, 0L, false, 8, null);
        }
        return true;
    }

    public final void b(boolean z17, boolean z18) {
        int i17 = f347608b;
        int i18 = z17 ? i17 | 4 : i17 & (-5);
        f347608b = i18;
        long j17 = f347609c;
        if (!z17) {
            f347609c = 0L;
        }
        if (i17 == i18 && j17 == f347609c && !z18) {
            return;
        }
        e();
    }

    public final void c(boolean z17, boolean z18, long j17, boolean z19) {
        long j18 = f347610d;
        int i17 = f347608b;
        if (z17) {
            f347610d = j17;
            int i18 = z18 ? i17 | 1 : i17 | 2;
            f347608b = i18;
            if (z18 && f347613g <= 0) {
                f347608b = i18 & (-3);
            }
        } else {
            f347610d = 0L;
            f347608b = (i17 & 4) != 0 ? 4 : 0;
        }
        if (i17 == f347608b && j18 == f347610d && !z19) {
            return;
        }
        e();
    }

    public final void e() {
        java.lang.String str;
        if (f347608b > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("\"userType\":" + f347608b);
            if (f347609c != 0) {
                arrayList.add("\"feedID\":" + ((java.lang.Object) jz5.x.a(f347609c)));
            }
            if (f347610d != 0) {
                arrayList.add("\"liveID\":" + ((java.lang.Object) jz5.x.a(f347610d)));
            }
            if (f347614h) {
                arrayList.add("\"isFloat\":4");
            } else if (f347615i) {
                arrayList.add("\"isFloat\":2");
            }
            str = "{" + kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null) + '}';
        } else {
            str = "";
        }
        f347611e = str;
        com.tencent.mars.xlog.Log.i("FinderCrash", "json=" + f347611e);
        com.tencent.mm.app.MMCrashReportContents.Z.e(f347611e);
        com.tencent.mm.app.MMBugReportContents.f53230k.f53727q.e(f347611e);
        r26.i0.u(f347611e, ',', ';', false, 4, null);
    }
}
