package fq3;

/* loaded from: classes12.dex */
public class t extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f265556d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f265557e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f265558f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f265559g;

    public t(fq3.w wVar, long j17, java.lang.String str, boolean z17, boolean z18) {
        this.f265556d = j17;
        this.f265557e = str;
        this.f265558f = z17;
        this.f265559g = z18;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.onC2CImgDownloadedTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f265557e, this.f265556d);
        long createTime = Li.getCreateTime();
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        if (createTime <= nVar.f265528m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityService", "onC2CImgDownloaded time condition not support %s", k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, Li.getCreateTime() / 1000));
            return;
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.requireAccountInitialized();
        if (nVar2.f265537v != null) {
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            nVar3.f265537v.getClass();
            if (!this.f265558f) {
                if (this.f265559g) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "updateStatus download cancel %d", java.lang.Long.valueOf(Li.getMsgId()));
                    fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar4.requireAccountInitialized();
                    nVar4.f265530o.f(Li.getMsgId(), 1);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "updateStatus download fail %d", java.lang.Long.valueOf(Li.getMsgId()));
                    fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar5.requireAccountInitialized();
                    nVar5.f265530o.f(Li.getMsgId(), 4);
                }
                jx3.f.INSTANCE.idkeyStat(957L, 32L, 1L, false);
                return;
            }
            fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar6.requireAccountInitialized();
            r45.rc c17 = nVar6.f265530o.c(Li.getMsgId());
            if (c17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "sender img %d", java.lang.Long.valueOf(Li.getMsgId()));
                return;
            }
            if (c17.f384715m == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "already auto download msgid %d", java.lang.Long.valueOf(Li.getMsgId()));
                return;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(957L, 20L, 1L, false);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(Li.Q0(), c17.f384717o);
            c17.f384718p = b27.f322636d;
            kq3.i.c(1, currentTimeMillis, 0, c17);
            ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Bi(1L, c17.f384717o, c17.f384710e, kq3.i.b(c17.f384720r), oq3.k.f347394a.f(Li.G).f347389b, r7.f347390c, Li.getCreateTime());
            fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar7.requireAccountInitialized();
            com.tencent.mm.plugin.priority.model.c2c.img.e eVar = nVar7.f265530o;
            long j17 = c17.f384709d;
            int i17 = b27.f322636d;
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = eVar.f153188g;
            sQLiteStatement.bindLong(1, currentTimeMillis);
            sQLiteStatement.bindLong(2, 3);
            sQLiteStatement.bindLong(3, i17);
            sQLiteStatement.bindLong(4, j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "updateStatusAndDownloadTime %d res %d %d %d", java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis), 3);
            if (hq3.a.b(c17.f384714i, 1)) {
                fVar.idkeyStat(957L, 21L, 1L, false);
                fVar.idkeyStat(957L, 22L, b27.f322636d, false);
            }
            if (hq3.a.b(c17.f384714i, 8)) {
                fVar.idkeyStat(957L, 23L, 1L, false);
                fVar.idkeyStat(957L, 24L, b27.f322636d, false);
            }
            if (hq3.a.b(c17.f384714i, 2) || hq3.a.b(c17.f384714i, 4)) {
                fVar.idkeyStat(957L, 25L, 1L, false);
                fVar.idkeyStat(957L, 26L, b27.f322636d, false);
            }
            if (hq3.a.b(c17.f384714i, 16)) {
                fVar.idkeyStat(957L, 27L, 1L, false);
                fVar.idkeyStat(957L, 28L, b27.f322636d, false);
            }
            if (hq3.a.b(c17.f384714i, 32)) {
                fVar.idkeyStat(957L, 29L, 1L, false);
                fVar.idkeyStat(957L, 30L, b27.f322636d, false);
            }
            if (hq3.a.b(c17.f384714i, 64)) {
                fVar.idkeyStat(957L, 33L, 1L, false);
                fVar.idkeyStat(957L, 34L, b27.f322636d, false);
            }
            if (hq3.a.b(c17.f384714i, 128)) {
                fVar.idkeyStat(957L, 35L, 1L, false);
                fVar.idkeyStat(957L, 36L, b27.f322636d, false);
            }
        }
    }
}
