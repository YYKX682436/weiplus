package qn1;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: u, reason: collision with root package name */
    public static int f364960u = 2;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f364962b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f364963c;

    /* renamed from: d, reason: collision with root package name */
    public int f364964d;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f364970j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f364972l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f364973m;

    /* renamed from: n, reason: collision with root package name */
    public int f364974n;

    /* renamed from: a, reason: collision with root package name */
    public int f364961a = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f364965e = java.lang.Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public int f364966f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f364967g = 3;

    /* renamed from: h, reason: collision with root package name */
    public boolean f364968h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f364969i = java.util.UUID.randomUUID().toString();

    /* renamed from: k, reason: collision with root package name */
    public boolean f364971k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f364975o = true;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f364976p = new qn1.f(this);

    /* renamed from: q, reason: collision with root package name */
    public final sn1.h f364977q = new qn1.g(this);

    /* renamed from: r, reason: collision with root package name */
    public final sn1.r0 f364978r = new qn1.j(this);

    /* renamed from: s, reason: collision with root package name */
    public final sn1.n0 f364979s = new qn1.k(this);

    /* renamed from: t, reason: collision with root package name */
    public final sn1.g f364980t = new qn1.l(this);

    public static void a(qn1.d dVar) {
        java.lang.String str = dVar.f364962b;
        java.lang.String str2 = dVar.f364963c;
        java.lang.String z17 = kn1.k.z(com.tencent.mm.sdk.platformtools.x2.f193071a);
        qn1.c.i().h().e();
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcProcessMgr", "tryConnectFailed thisWifiName:%s, pcWifiName:%s, pcIpAddress:%s, tryCount:%d", z17, str, str2, java.lang.Integer.valueOf(f364960u));
        if (z17 == null || z17.equals("")) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(400L, 1L, 1L, false);
            g0Var.d(13736, 1, str, z17, 0, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
            qn1.c.i().e().f309609a = -1;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            qn1.c.i().l().g(-1);
            return;
        }
        if (str == null || !str.equals(z17)) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(400L, 2L, 1L, false);
            g0Var2.d(13736, 2, str, z17, 0, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
            qn1.c.i().e().f309609a = -2;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            qn1.c.i().l().g(-2);
            return;
        }
        if (!kn1.k.E(str2)) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.idkeyStat(400L, 3L, 1L, false);
            g0Var3.d(13736, 3, str, z17, 0, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
            qn1.c.i().e().f309609a = -3;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            qn1.c.i().l().g(-3);
            return;
        }
        int i17 = f364960u;
        if (i17 > 0) {
            f364960u = i17 - 1;
            dVar.i();
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var4.idkeyStat(400L, 63L, 1L, false);
        g0Var4.d(13736, 6, str, z17, 0, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
        qn1.c.i().e().f309609a = -5;
        boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        qn1.c.i().l().g(-5);
    }

    public static void b(qn1.d dVar, int i17, int i18) {
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "newBackup, command[%d]", java.lang.Integer.valueOf(i17));
        dVar.f364961a = 1;
        if (dVar.h()) {
            qn1.c i19 = qn1.c.i();
            synchronized (i19) {
                i19.f309607e = null;
            }
        }
        qn1.c.i().l().e(dVar.g());
        qn1.c0 l17 = qn1.c.i().l();
        l17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "clearContinueBackupData.");
        l17.f364951c.b(false);
        java.util.LinkedList linkedList = l17.f364949a;
        if (linkedList != null) {
            linkedList.clear();
        }
        dVar.f(i17, i18);
        qn1.c0 l18 = qn1.c.i().l();
        l18.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new qn1.y(l18, new java.util.HashSet(l18.f364952d)));
    }

    public static void c(qn1.d dVar, int i17, int i18) {
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "newRecover, command[%d]", java.lang.Integer.valueOf(i17));
        dVar.f364961a = 2;
        if (!dVar.h()) {
            qn1.c i19 = qn1.c.i();
            synchronized (i19) {
                i19.f309607e = null;
            }
        }
        qn1.c.i().k().f();
        ((ku5.t0) ku5.t0.f312615d).g(new qn1.h(dVar, i17, i18));
        qn1.t k17 = qn1.c.i().k();
        k17.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new qn1.p(k17, new java.util.HashSet(k17.f365014h)));
        sn1.i.f410019p.a();
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "backupSendCancelRequest.");
        wn1.d dVar = new wn1.d();
        dVar.f447414d = qn1.c.i().f309604b;
        try {
            sn1.i.R(dVar.toByteArray(), 5);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcProcessMgr", e17, "BackupCancelRequest to buf err.", new java.lang.Object[0]);
        }
    }

    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandRequest cmd:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 12 || i17 == 16) {
            this.f364969i = java.util.UUID.randomUUID().toString();
        }
        wn1.e eVar = new wn1.e();
        eVar.f447415d = i17;
        if (i17 == 9) {
            eVar.f447416e = this.f364973m;
        }
        try {
            sn1.i.R(eVar.toByteArray(), 17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcProcessMgr", e17, "BackupCommandRequest to buf err.", new java.lang.Object[0]);
        }
    }

    public void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandResponse cmd:%d", java.lang.Integer.valueOf(i17));
        wn1.f fVar = new wn1.f();
        fVar.f447417d = i17;
        try {
            sn1.i.S(fVar.toByteArray(), 18, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcProcessMgr", e17, "BackupCommandResponse to buf err.", new java.lang.Object[0]);
        }
    }

    public boolean g() {
        return this.f364965e.booleanValue();
    }

    public boolean h() {
        int i17 = this.f364967g;
        return i17 == 100 || i17 == 101;
    }

    public final void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "tryConnect, isNewBackup = " + this.f364975o);
        if (this.f364975o) {
            xn1.b.c(xn1.b.f455454a, 1, 0, null, null, null, null, null, null, 252, null);
        }
        ln1.g h17 = qn1.c.i().h();
        java.lang.String str = this.f364963c;
        int i17 = this.f364964d;
        h17.f319756a.set(2);
        h17.f319757b = str;
        h17.f319758c = i17;
        sm0.b.f409311a = new ln1.a(h17);
        java.util.Map map = sn1.i.f410012f;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "BackupBaseScene clear.");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f410013g;
        synchronized (concurrentHashMap) {
            concurrentHashMap.clear();
        }
        java.util.Map map2 = sn1.i.f410012f;
        synchronized (map2) {
            ((java.util.HashMap) map2).clear();
        }
        sn1.i.I(1, this.f364976p);
        sn1.a aVar = new sn1.a(qn1.c.i().f309605c, qn1.c.i().f309606d, kn1.f.f309602h, qn1.c.i().f309604b, 0, 1, false);
        aVar.b0(true, true, true, false, false, true);
        aVar.f409966u.f447482m = 1;
        aVar.K();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "tryConnect start backupConnectTimerHandler.");
        if (this.f364970j == null) {
            this.f364970j = new com.tencent.mm.sdk.platformtools.b4(new qn1.e(this), false);
        }
        long Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_backup_connect_overtime_and, 30) * 1000;
        this.f364970j.c(Ni, Ni);
    }
}
