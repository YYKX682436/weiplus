package se4;

/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f406925a;

    /* renamed from: b, reason: collision with root package name */
    public static int f406926b;

    /* renamed from: c, reason: collision with root package name */
    public static final au5.k f406927c = new se4.e();

    public static void a(boolean z17, boolean z18, re4.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterInitManager", "isNeedPrepareAsk: %b, isNeedSaveDeviceInfo: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            au5.j.f14160r = android.os.Process.myUid();
            au5.k kVar = f406927c;
            wt5.a.f449536b = kVar;
            au5.b bVar = wt5.a.f449537c;
            if (bVar == null) {
                zt5.h.b("Soter.SoterCore", "soter: setTrebleServiceListener IMPL is null, not support soter", new java.lang.Object[0]);
            } else {
                bVar.r(kVar);
            }
            km5.q qVar = (km5.q) ((km5.q) km5.u.f(java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18))).i(new se4.b()).i(new se4.k()).i(new se4.j()).i(new se4.l());
            qVar.s(new se4.g(zVar));
            qVar.a(new se4.f(currentTimeMillis, zVar));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SoterInitManager", e17, "exception when init soter: %s", e17.getMessage());
            re4.n.c(4, 1001, 1L);
            if (zVar != null) {
                zVar.h(-1, "system error");
            }
            b(-1, "system error");
        }
    }

    public static void b(int i17, java.lang.String str) {
        ((vc.s) ((wc.o) i95.n0.c(wc.o.class))).wi();
        if (!gm0.j1.b().n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterInitManager", "hasLogin false, do not sendSoterInitializedEvent");
            return;
        }
        com.tencent.mm.autogen.events.OnSoterInitializedEvent onSoterInitializedEvent = new com.tencent.mm.autogen.events.OnSoterInitializedEvent();
        am.dn dnVar = onSoterInitializedEvent.f54584g;
        dnVar.f6479a = i17;
        dnVar.f6480b = str;
        onSoterInitializedEvent.e();
    }
}
