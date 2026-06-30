package ln1;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: r, reason: collision with root package name */
    public static final ln1.r f319797r = new ln1.r();

    /* renamed from: s, reason: collision with root package name */
    public static long f319798s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static long f319799t = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f319801b;

    /* renamed from: c, reason: collision with root package name */
    public final kn1.c f319802c;

    /* renamed from: d, reason: collision with root package name */
    public final kn1.f f319803d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319804e;

    /* renamed from: f, reason: collision with root package name */
    public final int f319805f;

    /* renamed from: j, reason: collision with root package name */
    public ln1.f0 f319809j;

    /* renamed from: a, reason: collision with root package name */
    public final int f319800a = j62.e.g().i("clicfg_backup_db_cache_size", 20971520, false, true);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f319806g = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b3 f319807h = new com.tencent.mm.sdk.platformtools.b3(true);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b3 f319808i = new com.tencent.mm.sdk.platformtools.b3(true);

    /* renamed from: k, reason: collision with root package name */
    public wn1.a f319810k = new wn1.a();

    /* renamed from: l, reason: collision with root package name */
    public long f319811l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f319812m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.pointers.PLong f319813n = new com.tencent.mm.pointers.PLong();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.pointers.PLong f319814o = new com.tencent.mm.pointers.PLong();

    /* renamed from: p, reason: collision with root package name */
    public boolean f319815p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f319816q = new java.util.concurrent.LinkedBlockingQueue();

    public s(kn1.f fVar, int i17, kn1.c cVar) {
        this.f319801b = false;
        this.f319803d = fVar;
        this.f319805f = i17;
        this.f319802c = cVar;
        this.f319801b = false;
    }

    public void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupPackAndSend", "cancel, caller:%s", com.tencent.mm.sdk.platformtools.z3.a());
        this.f319801b = true;
        this.f319807h.c();
        this.f319806g.set(0L);
        ln1.r rVar = f319797r;
        rVar.f319792g = true;
        rVar.b();
        this.f319815p = false;
        this.f319816q.clear();
        ln1.f0 f0Var = this.f319809j;
        if (f0Var != null) {
            f0Var.f319753d.set(0);
        }
    }

    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPackAndSend", "clearContinueBackupData.");
        int i17 = this.f319805f;
        if (i17 == 1) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN, java.lang.Boolean.FALSE);
        } else if (i17 == 2) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_MOVE_BACKUPING_BOOLEAN, java.lang.Boolean.FALSE);
        }
        android.content.SharedPreferences.Editor edit = kn1.f.d().edit();
        if (z17) {
            if (i17 == 1) {
                edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
                edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
                edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
                edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
            } else if (i17 == 2) {
                edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
                edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
                edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
                edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
            }
        }
        edit.commit();
    }

    public void c(java.lang.Runnable runnable) {
        try {
            this.f319816q.put(runnable);
            this.f319808i.c();
        } catch (java.lang.InterruptedException unused) {
        }
        if (this.f319815p) {
            return;
        }
        this.f319815p = true;
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: ln1.s$$c
            @Override // java.lang.Runnable
            public final void run() {
                ln1.s sVar = ln1.s.this;
                sVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPackAndSend", "packScene thread running");
                while (true) {
                    boolean z17 = sVar.f319815p;
                    java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = sVar.f319816q;
                    if (!z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPackAndSend", "packScene thread end: packTagQueue.size:%d", java.lang.Integer.valueOf(linkedBlockingQueue.size()));
                        return;
                    }
                    java.lang.Runnable runnable2 = (java.lang.Runnable) linkedBlockingQueue.poll();
                    if (runnable2 != null) {
                        runnable2.run();
                    } else {
                        com.tencent.mm.sdk.platformtools.b3 b3Var = sVar.f319808i;
                        b3Var.b();
                        b3Var.a(500L);
                    }
                }
            }
        });
    }
}
