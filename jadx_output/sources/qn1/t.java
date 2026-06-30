package qn1;

/* loaded from: classes12.dex */
public class t implements kn1.e {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f365005q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f365006r;

    /* renamed from: a, reason: collision with root package name */
    public ln1.x f365007a;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f365013g;

    /* renamed from: i, reason: collision with root package name */
    public kn1.b f365015i;

    /* renamed from: b, reason: collision with root package name */
    public long f365008b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f365009c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f365010d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f365011e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f365012f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f365014h = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f365016j = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public long f365017k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f365018l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f365019m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f365020n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f365021o = false;

    /* renamed from: p, reason: collision with root package name */
    public final sn1.h f365022p = new qn1.o(this);

    @Override // kn1.e
    public void a(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new qn1.q(this, new java.util.HashSet(this.f365014h), i17));
        if (this.f365015i != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new qn1.r(this, i17));
        }
    }

    public void b(int i17, int i18) {
        long j17 = this.f365017k;
        long j18 = 0;
        if (j17 != 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j18 = java.lang.System.currentTimeMillis() - j17;
        }
        long j19 = j18 / 1000;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(this.f365008b / 1024), java.lang.Long.valueOf(j19), 2, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], recoverCostTime[%d s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(this.f365008b / 1024), java.lang.Long.valueOf(j19));
    }

    @Override // kn1.e
    public void c() {
        ((ku5.t0) ku5.t0.f312615d).g(new qn1.s(this));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMergeFinish = ");
        long j17 = this.f365018l;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis() - j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", sb6.toString());
        jx3.f.INSTANCE.d(21019, 0, java.lang.Long.valueOf(this.f365009c), 696, "PC-onMergeFinish", "true", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f365018l));
        xn1.b.f455454a.b(7, 5, qn1.c.o().f364969i, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f365018l), java.lang.Long.valueOf(this.f365009c), 1);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(400L, 27L, 1L, false);
        g0Var.idkeyStat(400L, 28L, (java.lang.System.currentTimeMillis() - this.f365018l) / 1000, false);
        sn1.i.X(12);
        sn1.i.Z();
        sn1.i.a0();
    }

    public void d(boolean z17, boolean z18, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "cancel isSelf[%b], needClearContinueRecoverData[%b], caller:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), com.tencent.mm.sdk.platformtools.z3.a());
        boolean z19 = true;
        f365005q = true;
        if (!z17) {
            qn1.c.i().j().d();
        }
        synchronized (this.f365010d) {
            this.f365011e = true;
            ln1.x xVar = this.f365007a;
            if (xVar != null && xVar.f319849c) {
                xVar.d(z18, i17);
                z19 = false;
            }
            this.f365007a = null;
        }
        if (z19 && i17 != 0) {
            qn1.c.i().e().f309609a = i17;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a(i17);
        }
        if (z18) {
            ((ku5.t0) ku5.t0.f312615d).g(new qn1.m(this));
        }
        sn1.i.Z();
        sn1.i.a0();
        sn1.i.Y();
        qn1.c.i().g();
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "clearContinueRecoverData");
        this.f365016j.clear();
        if (kn1.k.f309630a) {
            return;
        }
        kn1.k.k(kn1.k.o());
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f365021o = false;
        f365005q = false;
        f365006r = false;
        sn1.i.f410015i = this.f365022p;
        this.f365008b = 0L;
        this.f365009c = 0L;
        this.f365011e = false;
        this.f365020n = false;
        this.f365016j.clear();
    }

    public boolean g() {
        return c01.d9.b().h().z0();
    }

    public final void h(int i17, int i18, long j17) {
        wn1.r rVar = new wn1.r();
        rVar.f447461d = qn1.c.i().f309604b;
        rVar.f447464g = i17;
        rVar.f447467m = kn1.k.r(j17);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "send start resp, status[%d]", java.lang.Integer.valueOf(i17));
            sn1.i.S(rVar.toByteArray(), 4, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e17, "buf to BackupStartRequest err.", new java.lang.Object[0]);
        }
    }

    public final void i(java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        wn1.w wVar = new wn1.w();
        wVar.f447499d = str;
        wVar.f447500e = i17;
        wVar.f447501f = i18;
        wVar.f447502g = i19;
        wVar.f447503h = i27;
        try {
            sn1.i.S(wVar.toByteArray(), 7, i28);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e17, "sendResp", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[Catch: all -> 0x00aa, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000d, B:9:0x0015, B:14:0x001a, B:15:0x001d, B:17:0x0021, B:20:0x0028, B:21:0x0051, B:23:0x0066, B:24:0x006d, B:25:0x00a8, B:27:0x0030, B:29:0x0047, B:30:0x004d), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            r20 = this;
            r9 = r20
            java.lang.Object r10 = r9.f365010d
            monitor-enter(r10)
            ln1.x r0 = r9.f365007a     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L17
            boolean r1 = r0.f319849c     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L17
            java.lang.String r0 = "MicroMsg.BackupPcRecoverServer"
            java.lang.String r1 = "startMerge hasStartMerge, return."
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Laa
            return
        L17:
            r11 = 0
            if (r0 == 0) goto L1d
            r0.d(r11, r11)     // Catch: java.lang.Throwable -> Laa
        L1d:
            java.util.HashSet r0 = r9.f365016j     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L30
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Laa
            if (r0 > 0) goto L28
            goto L30
        L28:
            java.util.HashSet r0 = r9.f365016j     // Catch: java.lang.Throwable -> Laa
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Laa
            r5 = r0
            goto L51
        L30:
            c01.f r0 = c01.d9.b()     // Catch: java.lang.Throwable -> Laa
            com.tencent.mm.storage.o r0 = r0.h()     // Catch: java.lang.Throwable -> Laa
            l75.k0 r0 = r0.f195188d     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = "SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId "
            r2 = 0
            android.database.Cursor r0 = r0.B(r1, r2)     // Catch: java.lang.Throwable -> Laa
            boolean r1 = r0.moveToLast()     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L4c
            int r1 = r0.getInt(r11)     // Catch: java.lang.Throwable -> Laa
            goto L4d
        L4c:
            r1 = r11
        L4d:
            r0.close()     // Catch: java.lang.Throwable -> Laa
            r5 = r1
        L51:
            qn1.c r0 = qn1.c.i()     // Catch: java.lang.Throwable -> Laa
            kn1.g r0 = r0.e()     // Catch: java.lang.Throwable -> Laa
            r1 = 1
            r2 = 26
            r0.a(r2, r1, r5)     // Catch: java.lang.Throwable -> Laa
            r9.a(r2)     // Catch: java.lang.Throwable -> Laa
            java.util.LinkedList r0 = r9.f365013g     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto L6d
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> Laa
            r0.<init>()     // Catch: java.lang.Throwable -> Laa
            r9.f365013g = r0     // Catch: java.lang.Throwable -> Laa
        L6d:
            tn1.f r0 = tn1.f.f()     // Catch: java.lang.Throwable -> Laa
            r0.c()     // Catch: java.lang.Throwable -> Laa
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> Laa
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Laa
            r9.f365018l = r0     // Catch: java.lang.Throwable -> Laa
            tn1.f r0 = tn1.f.f()     // Catch: java.lang.Throwable -> Laa
            r0.c()     // Catch: java.lang.Throwable -> Laa
            ln1.x r0 = new ln1.x     // Catch: java.lang.Throwable -> Laa
            qn1.c r2 = qn1.c.i()     // Catch: java.lang.Throwable -> Laa
            r3 = 1
            boolean r6 = r9.f365020n     // Catch: java.lang.Throwable -> Laa
            java.util.LinkedList r7 = r9.f365012f     // Catch: java.lang.Throwable -> Laa
            java.util.LinkedList r8 = r9.f365013g     // Catch: java.lang.Throwable -> Laa
            r1 = r0
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laa
            r9.f365007a = r0     // Catch: java.lang.Throwable -> Laa
            r0.g(r11)     // Catch: java.lang.Throwable -> Laa
            com.tencent.mm.plugin.report.service.g0 r12 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> Laa
            r13 = 400(0x190, double:1.976E-321)
            r15 = 24
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Laa
            return
        Laa:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Laa
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qn1.t.j():void");
    }
}
