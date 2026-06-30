package zv;

/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static long f476030b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f476031c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f476032d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f476033e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f476034f;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f476036h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f476037i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f476038j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f476039k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f476040l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f476041m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f476042n;

    /* renamed from: o, reason: collision with root package name */
    public static int f476043o;

    /* renamed from: p, reason: collision with root package name */
    public static int f476044p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f476045q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f476046r;

    /* renamed from: s, reason: collision with root package name */
    public static int f476047s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f476048t;

    /* renamed from: u, reason: collision with root package name */
    public static int f476049u;

    /* renamed from: v, reason: collision with root package name */
    public static com.tencent.mm.storage.l4 f476050v;

    /* renamed from: a, reason: collision with root package name */
    public static final zv.m0 f476029a = new zv.m0();

    /* renamed from: g, reason: collision with root package name */
    public static volatile java.util.Map f476035g = kz5.q0.f314001d;

    static {
        new java.util.LinkedList();
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService_accounts");
        f476037i = R;
        R.q("lastBoxExposeReaTimeReportTime", java.lang.System.currentTimeMillis());
        f476039k = "-1";
        f476040l = "-1";
        f476041m = "-1";
        f476045q = -1;
        f476049u = -1;
    }

    public final java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return "lstExpTime_" + str + '}';
    }

    public final java.lang.String b(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return "totalExpTime_" + str + '}';
    }

    public final java.util.Map c() {
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.wechat.aff.brand_service.a d17 = yw.a3.f466266a.d();
        java.lang.String b17 = d17 != null ? d17.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[0] = new jz5.l("custom_session_id", b17);
        lVarArr[1] = new jz5.l("pos", java.lang.String.valueOf(f476045q));
        lVarArr[2] = new jz5.l("new_noti_count", java.lang.String.valueOf(f476043o));
        lVarArr[3] = new jz5.l("new_message_count", java.lang.String.valueOf(f476044p));
        return kz5.c1.k(lVarArr);
    }

    public final java.util.Map d(int i17) {
        return kz5.c1.k(new jz5.l("pos", java.lang.String.valueOf(i17)), new jz5.l("new_noti_count", java.lang.String.valueOf(f476043o)), new jz5.l("new_message_count", java.lang.String.valueOf(f476044p)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        if (r12 == null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r34, int r35, int r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.m0.e(java.lang.String, int, int, java.lang.String):void");
    }

    public final void f(java.lang.String str, int i17, com.tencent.mm.storage.l4 l4Var) {
        if (l4Var == null) {
            return;
        }
        yw.a3 a3Var = yw.a3.f466266a;
        if (!yw.a3.f466271f) {
            f476048t = str;
            f476049u = i17;
            f476050v = l4Var;
        } else {
            int d17 = l4Var.d1();
            java.lang.String str2 = f476040l;
            f476041m = str2;
            ((ku5.t0) ku5.t0.f312615d).h(new zv.i0(str, i17, l4Var, d17, str2), "MicroMsg.BrandServiceMainCellExposeHelper");
        }
    }
}
