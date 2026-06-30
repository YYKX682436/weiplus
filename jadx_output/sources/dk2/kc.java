package dk2;

/* loaded from: classes3.dex */
public final class kc {

    /* renamed from: b, reason: collision with root package name */
    public static long f233697b;

    /* renamed from: c, reason: collision with root package name */
    public static int f233698c;

    /* renamed from: d, reason: collision with root package name */
    public static r45.u52 f233699d;

    /* renamed from: e, reason: collision with root package name */
    public static int f233700e;

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.kc f233696a = new dk2.kc();

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f233701f = new com.tencent.mm.sdk.platformtools.b4("FinderLiveReporterTimer", (com.tencent.mm.sdk.platformtools.a4) dk2.jc.f233662d, true);

    public final void a(boolean z17) {
        java.util.LinkedList linkedList;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - f233697b;
        synchronized (hn0.v.f282440a) {
            linkedList = new java.util.LinkedList(hn0.v.f282441b);
        }
        f233697b = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveReporter", "doLivePlayReport qosInfoQueue.size:" + linkedList.size() + " liveStarted:" + z17);
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.LivePlayReportStruct livePlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.LivePlayReportStruct();
        livePlayReportStruct.L = currentTimeMillis / 1000;
        long j17 = 2;
        livePlayReportStruct.K = 2L;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            kn0.e eVar = (kn0.e) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.K0(livePlayReportStruct.f58626d)) {
                livePlayReportStruct.f58626d = livePlayReportStruct.b("LiveId", java.lang.String.valueOf(eVar.f309503a), true);
            }
            if (livePlayReportStruct.f58627e == 0) {
                livePlayReportStruct.f58627e = eVar.f309508f;
            }
            if (livePlayReportStruct.f58628f == 0) {
                livePlayReportStruct.f58628f = eVar.f309509g;
            }
            if (livePlayReportStruct.f58639q == 0) {
                livePlayReportStruct.f58639q = eVar.f309520r;
            }
            if (livePlayReportStruct.f58645w == 0) {
                livePlayReportStruct.f58645w = eVar.f309525w;
            }
            if (livePlayReportStruct.A == 0) {
                livePlayReportStruct.A = eVar.A;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(livePlayReportStruct.B)) {
                java.lang.String str = eVar.B;
                if (str == null) {
                    str = "";
                }
                livePlayReportStruct.B = livePlayReportStruct.b("CdnSvrIp", str, true);
            }
            if (livePlayReportStruct.C == 0) {
                livePlayReportStruct.C = eVar.C;
            }
            if (livePlayReportStruct.O == 0) {
                int i17 = eVar.f309504b;
                livePlayReportStruct.O = i17 == 1 ? 1L : i17 == 0 ? j17 : 0L;
            }
            livePlayReportStruct.N = eVar.f309507e;
            int i18 = eVar.f309505c;
            livePlayReportStruct.M = i18 != 1 ? i18 == 1 ? j17 : 0L : 1L;
            livePlayReportStruct.f58629g += eVar.f309510h;
            livePlayReportStruct.f58630h += eVar.f309511i;
            livePlayReportStruct.f58631i += eVar.f309512j;
            livePlayReportStruct.f58632j += eVar.f309513k;
            livePlayReportStruct.f58633k += eVar.f309514l;
            livePlayReportStruct.f58636n += eVar.f309517o;
            livePlayReportStruct.f58641s += eVar.f309522t;
            livePlayReportStruct.f58646x += eVar.f309526x;
            livePlayReportStruct.f58647y += eVar.f309527y;
            livePlayReportStruct.f58648z += eVar.f309528z;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(livePlayReportStruct.D);
            sb6.append(eVar.D);
            livePlayReportStruct.D = livePlayReportStruct.b("CpuUsageProcess", sb6.toString(), true);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(livePlayReportStruct.E);
            sb7.append(eVar.E);
            livePlayReportStruct.E = livePlayReportStruct.b("CpuUsageDevice", sb7.toString(), true);
            livePlayReportStruct.f58634l += eVar.f309515m;
            livePlayReportStruct.f58635m += eVar.f309516n;
            livePlayReportStruct.f58637o += eVar.f309518p;
            livePlayReportStruct.f58638p += eVar.f309519q;
            livePlayReportStruct.f58642t = eVar.f309523u;
            livePlayReportStruct.f58643u += eVar.f309524v;
            long j18 = livePlayReportStruct.f58640r;
            long j19 = eVar.f309521s;
            if (j18 < j19) {
                j18 = j19;
            }
            livePlayReportStruct.f58640r = j18;
            long j27 = livePlayReportStruct.f58631i;
            long j28 = eVar.f309512j;
            livePlayReportStruct.G = j27 < j28 ? j28 : j27;
            long j29 = livePlayReportStruct.f58632j;
            long j37 = eVar.f309513k;
            livePlayReportStruct.I = j29 < j37 ? j37 : j29;
            if (j27 > j28) {
                j27 = j28;
            }
            livePlayReportStruct.H = j27;
            if (j29 > j37) {
                j29 = j37;
            }
            livePlayReportStruct.I = j29;
            j17 = 2;
        }
        livePlayReportStruct.F = f233698c;
        livePlayReportStruct.f58629g = ((float) livePlayReportStruct.f58629g) / linkedList.size();
        livePlayReportStruct.f58630h = ((float) livePlayReportStruct.f58630h) / linkedList.size();
        livePlayReportStruct.f58631i = ((float) livePlayReportStruct.f58631i) / linkedList.size();
        livePlayReportStruct.f58632j = ((float) livePlayReportStruct.f58632j) / linkedList.size();
        livePlayReportStruct.f58633k = ((float) livePlayReportStruct.f58633k) / linkedList.size();
        livePlayReportStruct.f58636n = ((float) livePlayReportStruct.f58636n) / linkedList.size();
        livePlayReportStruct.f58641s = ((float) livePlayReportStruct.f58641s) / linkedList.size();
        livePlayReportStruct.f58646x = ((float) livePlayReportStruct.f58646x) / linkedList.size();
        livePlayReportStruct.f58647y = ((float) livePlayReportStruct.f58647y) / linkedList.size();
        livePlayReportStruct.f58648z = ((float) livePlayReportStruct.f58648z) / linkedList.size();
        if (z17) {
            livePlayReportStruct.f58625J = 0L;
        } else {
            livePlayReportStruct.f58625J = 1L;
        }
        livePlayReportStruct.k();
        f233698c = 0;
    }

    public final void b() {
        f233698c++;
    }

    public final void c(boolean z17, boolean z18) {
        r45.u52 u52Var;
        if (f233699d == null) {
            f233699d = new r45.u52();
        }
        if (z17 && (u52Var = f233699d) != null) {
            u52Var.set(0, 1);
        }
        if (z18) {
            f233700e = 1;
        }
    }
}
