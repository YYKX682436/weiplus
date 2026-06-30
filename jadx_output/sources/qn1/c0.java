package qn1;

/* loaded from: classes12.dex */
public class c0 implements kn1.l {

    /* renamed from: l, reason: collision with root package name */
    public static boolean f364945l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f364946m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f364947n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f364948o;

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f364949a;

    /* renamed from: b, reason: collision with root package name */
    public kn1.b f364950b;

    /* renamed from: c, reason: collision with root package name */
    public ln1.s f364951c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f364952d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f364953e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f364954f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f364955g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f364956h = new qn1.u(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f364957i = new qn1.v(this);

    /* renamed from: j, reason: collision with root package name */
    public final sn1.h f364958j = new qn1.x(this);

    /* renamed from: k, reason: collision with root package name */
    public final kn1.c f364959k = new qn1.b0(this);

    @Override // kn1.l
    public void a(int i17, long j17, long j18, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "setBackupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18));
        if (i17 == 0) {
            j17 = 0;
            j18 = 0;
        }
        qn1.c.i();
        android.content.SharedPreferences.Editor edit = kn1.f.d().edit();
        edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", i17);
        edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", i18);
        edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", j17);
        edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", j18);
        edit.apply();
    }

    public void b(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest");
        sn1.i.I(3, this.f364956h);
        sn1.t0 t0Var = new sn1.t0(qn1.c.i().f309604b);
        com.tencent.mm.pointers.PLong pLong = new com.tencent.mm.pointers.PLong();
        com.tencent.mm.pointers.PLong pLong2 = new com.tencent.mm.pointers.PLong();
        gm0.j1.i();
        kn1.k.d(0L, pLong, pLong2, gm0.j1.u().d());
        int i17 = f364945l ? 3 : ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue() ? 0 : 1;
        wn1.p r17 = kn1.k.r(pLong2.value);
        java.lang.Long valueOf = java.lang.Long.valueOf((qn1.c.i().m().f() / 1024) / 1024);
        java.lang.String str = qn1.c.o().f364969i;
        wn1.q qVar = t0Var.f410100u;
        qVar.f447454e = 0L;
        qVar.f447455f = j17;
        qVar.f447456g = 0L;
        qVar.f447457h = r17;
        qVar.f447458i = valueOf.longValue();
        qVar.f447459m = i17;
        qVar.f447460n = str;
        xn1.c.b("SessionId", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest sessionCount:%d, transferType:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        t0Var.K();
    }

    public void c(int i17, int i18) {
        long j17;
        ln1.s sVar = this.f364951c;
        if (sVar != null) {
            long j18 = sVar.f319812m;
            long currentTimeMillis = j18 != 0 ? java.lang.System.currentTimeMillis() - j18 : 0L;
            r1 = this.f364951c.f319811l / 1024;
            j17 = currentTimeMillis;
        } else {
            j17 = 0;
        }
        long j19 = j17 / 1000;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(r1), java.lang.Long.valueOf(j19), 1, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], backupCostTime[%d s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(r1), java.lang.Long.valueOf(j19));
    }

    public void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "cancel, isSelf[%b], Caller:%s", java.lang.Boolean.valueOf(z17), com.tencent.mm.sdk.platformtools.z3.a());
        f364947n = true;
        if (!z17) {
            qn1.c.i().j().d();
        }
        ln1.s sVar = this.f364951c;
        if (sVar != null) {
            sVar.a();
        }
        sn1.i.Z();
        sn1.i.a0();
        sn1.i.Y();
        qn1.c.i().g();
    }

    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "BackupPcServer init.");
        f364947n = false;
        this.f364953e = false;
        f364948o = z17;
        sn1.i.f410015i = this.f364958j;
        ln1.s sVar = this.f364951c;
        if (sVar != null) {
            sVar.a();
        }
        this.f364951c = new ln1.s(qn1.c.i(), 1, this.f364959k);
    }

    public void f(java.util.LinkedList linkedList) {
        this.f364949a = linkedList;
        qn1.c.i();
        android.content.SharedPreferences d17 = kn1.f.d();
        f364946m = d17.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0) == 1;
        this.f364954f = d17.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
        this.f364955g = d17.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
        f364945l = d17.getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0) == 1;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
        objArr[1] = java.lang.Boolean.valueOf(f364946m);
        objArr[2] = java.lang.Boolean.valueOf(f364945l);
        objArr[3] = java.lang.Long.valueOf(this.f364954f);
        objArr[4] = java.lang.Long.valueOf(this.f364955g);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "setBackupChooseData users size[%d], isSelectTime[%b], isQuickBackup[%b], selectStartTime[%d], selectEndTime[%d]", objArr);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN, java.lang.Boolean.TRUE);
    }

    public void g(int i17) {
        ((qn1.b0) this.f364959k).a(i17);
    }
}
