package fq3;

/* loaded from: classes12.dex */
public class q extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f265546d;

    /* renamed from: e, reason: collision with root package name */
    public final long f265547e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f265548f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f265549g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f265550h;

    public q(fq3.w wVar, boolean z17, java.lang.String str, long j17, boolean z18, boolean z19) {
        this.f265550h = z17;
        this.f265546d = str;
        this.f265547e = j17;
        this.f265548f = z18;
        this.f265549g = z19;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.onC2CFileDownloadedTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        if (nVar.f265538w != null) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.requireAccountInitialized();
            nVar2.f265538w.getClass();
            java.lang.String str = this.f265546d;
            long j17 = this.f265547e;
            if (!this.f265548f) {
                if (this.f265549g) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "updateStatus download cancel %s %s", str, java.lang.Long.valueOf(j17));
                    fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar3.requireAccountInitialized();
                    nVar3.f265531p.f(str, j17, 1);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "updateStatus download fail %s %s", str, java.lang.Long.valueOf(j17));
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.requireAccountInitialized();
                nVar4.f265531p.f(str, j17, 4);
                return;
            }
            fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar5.requireAccountInitialized();
            r45.qc c17 = nVar5.f265531p.c(str, j17);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "sender file %s %s", str, java.lang.Long.valueOf(j17));
                return;
            }
            int i18 = c17.f383824m;
            if (i18 != 1 && i18 != 2 && i18 != 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "already auto download msgid %s %s", str, java.lang.Long.valueOf(j17));
                return;
            }
            if (this.f265550h) {
                oq3.h e17 = oq3.k.f347394a.e(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(c17.f383819e, c17.f383826o).G);
                ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Bi(4L, c17.f383826o, c17.f383819e, kq3.i.b(c17.f383830s), e17.f347386b, e17.f347387c, c17.f383822h);
                i17 = 3;
            } else {
                i17 = 5;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            kq3.i.d(1, currentTimeMillis, i17, c17);
            fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar6.requireAccountInitialized();
            nq3.f fVar = nVar6.f265531p;
            java.lang.String str2 = c17.f383818d;
            long j18 = c17.f383826o;
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = fVar.f339000g;
            sQLiteStatement.bindLong(1, currentTimeMillis);
            sQLiteStatement.bindLong(2, i17);
            sQLiteStatement.bindString(3, str2);
            sQLiteStatement.bindLong(4, j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "updateStatusAndDownloadTime %s res %s %s %s %s", java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()), str2, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17));
        }
    }
}
