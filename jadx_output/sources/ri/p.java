package ri;

/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.List f395959a = java.util.Collections.emptyList();

    /* renamed from: b, reason: collision with root package name */
    public static int f395960b = wh.m.u(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* renamed from: c, reason: collision with root package name */
    public static long f395961c = 0;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(qh.b r30, rh.o2 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.p.a(qh.b, rh.o2, java.lang.String):void");
    }

    public static void b(final java.lang.String str, final rh.c1 c1Var, final boolean z17) {
        final ph.u e17 = gi.d.e();
        if (e17 == null) {
            return;
        }
        if (str.equals("canary") || str.equals("module") || str.equals("biz") || str.equals("alertBatt") || str.equals("alertThermal")) {
            c1Var.q(new wh.t0() { // from class: ri.p$$m
                @Override // wh.t0
                public final void accept(java.lang.Object obj) {
                    final rh.c1 c1Var2 = rh.c1.this;
                    final java.lang.String str2 = str;
                    final ph.u uVar = e17;
                    final boolean z18 = z17;
                    final qh.b bVar = (qh.b) obj;
                    c1Var2.u(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class, new wh.t0() { // from class: ri.p$$o
                        /* JADX WARN: Removed duplicated region for block: B:194:0x0611 A[Catch: Exception -> 0x0627, TRY_LEAVE, TryCatch #1 {Exception -> 0x0627, blocks: (B:189:0x05d7, B:191:0x05dd, B:192:0x060b, B:194:0x0611, B:305:0x05ea, B:306:0x05ef, B:311:0x05fe, B:313:0x0603), top: B:188:0x05d7 }] */
                        /* JADX WARN: Removed duplicated region for block: B:203:0x062d  */
                        /* JADX WARN: Removed duplicated region for block: B:244:0x072d  */
                        /* JADX WARN: Removed duplicated region for block: B:247:0x0789  */
                        /* JADX WARN: Removed duplicated region for block: B:250:0x07e2  */
                        /* JADX WARN: Removed duplicated region for block: B:253:0x083b  */
                        /* JADX WARN: Removed duplicated region for block: B:256:0x0894  */
                        /* JADX WARN: Removed duplicated region for block: B:259:0x08ed  */
                        /* JADX WARN: Removed duplicated region for block: B:262:0x0946  */
                        /* JADX WARN: Removed duplicated region for block: B:265:0x09a4  */
                        /* JADX WARN: Removed duplicated region for block: B:268:0x0a02  */
                        /* JADX WARN: Removed duplicated region for block: B:271:0x0a60  */
                        /* JADX WARN: Removed duplicated region for block: B:274:0x0abe  */
                        /* JADX WARN: Removed duplicated region for block: B:277:0x0b17  */
                        /* JADX WARN: Removed duplicated region for block: B:280:0x0b8e  */
                        /* JADX WARN: Removed duplicated region for block: B:287:0x0ba7  */
                        /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:297:0x0780  */
                        /* JADX WARN: Removed duplicated region for block: B:300:0x0720  */
                        @Override // wh.t0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void accept(java.lang.Object r47) {
                            /*
                                Method dump skipped, instructions count: 3109
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: ri.p$$o.accept(java.lang.Object):void");
                        }
                    });
                }
            });
        }
    }

    public static void c(boolean z17, java.lang.String str, rh.o2 o2Var) {
        java.lang.String str2;
        java.lang.String f17 = ri.i.f();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish=");
        rh.d3 d3Var = o2Var.f395486c;
        int i17 = ((rh.f) d3Var).f395378h;
        int i18 = ((rh.f) d3Var).f395379i;
        long max = java.lang.Math.max(1L, o2Var.f395487d / 60000);
        rh.d3 d3Var2 = o2Var.f395486c;
        long longValue = ((java.lang.Long) ((rh.f) d3Var2).f395377g.f395552a).longValue() / max;
        com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#reportTaskJiffiesException, feat = " + str);
        sb6.append(((rh.f) d3Var2).f395381k);
        int l17 = wh.m.l(com.tencent.mm.sdk.platformtools.x2.f193071a);
        sb6.append("|batTemp=");
        sb6.append(l17);
        int[] p17 = wh.m.p();
        if (p17.length > 0) {
            sb6.append("|cupFreq=");
            sb6.append(java.util.Arrays.toString(p17));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (str.equals("threadPool")) {
            str2 = "avgTaskJiffies";
        } else {
            str2 = "avg" + ri.i.a(str) + "TaskJiffies";
        }
        sb7.append(str2);
        sb7.append(z17 ? "LongException" : "Exception");
        java.lang.String sb8 = sb7.toString();
        android.util.SparseArray sparseArray = ri.s.f396008a;
        ri.s.b(1, 5, f17, sb6.toString(), i17, i18, sb8, longValue, ((rh.f) d3Var2).f395375e, ((java.lang.Long) ((rh.f) o2Var.f395485b).f395377g.f395552a).longValue(), "duringMin", max, ((rh.f) d3Var2).f395380j, "", ((rh.f) d3Var2).f395382l, ((rh.f) d3Var2).f395383m, ((rh.f) d3Var2).f395384n, "");
    }

    public static void d(qh.b bVar, boolean z17, long j17, long j18) {
        if (bVar.g() || bVar.f363309b <= java.lang.Math.max(gi.d.f271993a, 0)) {
            return;
        }
        java.lang.String f17 = ri.i.f();
        java.lang.String str = z17 ? "wifi" : "mobile";
        int c17 = bVar.c();
        int d17 = bVar.d();
        com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#reportTrafficException");
        android.util.SparseArray sparseArray = ri.s.f396008a;
        ri.s.b(1, 5, f17, str, c17, d17, z17 ? "avgWifiException" : "avgRadioException", z17 ? j17 : j18, z17 ? "avgRadio" : "avgWifi", z17 ? j18 : j17, "duringMin", java.lang.Math.max(1L, bVar.f363321n / 60000), bVar.f363316i, "", bVar.f363309b, bVar.f363312e, bVar.f363317j, "");
    }
}
