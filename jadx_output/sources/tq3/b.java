package tq3;

/* loaded from: classes12.dex */
public class b extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f421231d;

    public b(com.tencent.mm.storage.f9 f9Var) {
        this.f421231d = f9Var;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.onC2CImgReceiveTask";
    }

    public final void b(com.tencent.mm.storage.f9 f9Var, int i17, int i18, double d17, int i19) {
        int i27;
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        if (nVar.f265537v != null) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.requireAccountInitialized();
            nVar2.f265537v.getClass();
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            if (nVar3.f265530o.e(f9Var.getMsgId())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "onImgReceive %d %s Update Status %d", java.lang.Long.valueOf(f9Var.getMsgId()), f9Var.Q0(), java.lang.Integer.valueOf(i18));
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.requireAccountInitialized();
                nVar4.f265530o.g(f9Var.getMsgId(), i17, i18);
                return;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(957L, 0L, 1L, false);
            if (hq3.a.b(i17, 8)) {
                fVar.idkeyStat(957L, 1L, 1L, false);
            }
            if (hq3.a.b(i17, 4)) {
                fVar.idkeyStat(957L, 2L, 1L, false);
            }
            if (hq3.a.b(i17, 2)) {
                fVar.idkeyStat(957L, 3L, 1L, false);
            }
            if (hq3.a.b(i17, 16)) {
                fVar.idkeyStat(957L, 4L, 1L, false);
            }
            if (hq3.a.b(i17, 1)) {
                i27 = 1;
                fVar.idkeyStat(957L, 5L, 1L, false);
            } else {
                i27 = 1;
            }
            if (hq3.a.b(i17, 32)) {
                fVar.idkeyStat(957L, 6L, 1L, false);
            }
            if (hq3.a.b(i17, 64)) {
                fVar.idkeyStat(957L, 7L, 1L, false);
            }
            if (hq3.a.b(i17, 128)) {
                fVar.idkeyStat(957L, 8L, 1L, false);
            }
            r45.rc rcVar = new r45.rc();
            rcVar.f384709d = f9Var.getMsgId();
            rcVar.f384710e = f9Var.Q0();
            if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                java.lang.String s17 = c01.w9.s(f9Var.j());
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (s17 == null) {
                    s17 = "";
                }
                rcVar.f384711f = s17;
            } else {
                rcVar.f384711f = f9Var.Q0();
            }
            rcVar.f384712g = i27;
            rcVar.f384713h = f9Var.getCreateTime();
            rcVar.f384714i = i17;
            rcVar.f384715m = i18;
            rcVar.f384716n = 0L;
            rcVar.f384717o = f9Var.I0();
            rcVar.f384718p = 0;
            rcVar.f384720r = d17;
            rcVar.f384721s = i19;
            fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar5.requireAccountInitialized();
            com.tencent.mm.plugin.priority.model.c2c.img.e eVar = nVar5.f265530o;
            eVar.getClass();
            long j17 = rcVar.f384709d;
            com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = eVar.f153183b;
            sQLiteStatement.bindLong(i27, j17);
            sQLiteStatement.bindString(2, rcVar.f384710e);
            sQLiteStatement.bindString(3, rcVar.f384711f);
            sQLiteStatement.bindLong(4, rcVar.f384712g);
            sQLiteStatement.bindLong(5, rcVar.f384713h);
            sQLiteStatement.bindLong(6, rcVar.f384714i);
            sQLiteStatement.bindLong(7, rcVar.f384715m);
            sQLiteStatement.bindLong(8, rcVar.f384716n);
            sQLiteStatement.bindLong(9, rcVar.f384717o);
            sQLiteStatement.bindLong(10, rcVar.f384718p);
            sQLiteStatement.bindLong(11, rcVar.f384719q);
            sQLiteStatement.bindDouble(12, rcVar.f384720r);
            sQLiteStatement.bindLong(13, rcVar.f384721s);
            sQLiteStatement.execute();
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "onImgReceive %d %s Insert Res %d %d %.2f %d", java.lang.Long.valueOf(f9Var.getMsgId()), f9Var.Q0(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i19));
            kq3.i.c(3, rcVar.f384713h, i18, rcVar);
            if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar6.requireAccountInitialized();
                nVar6.f265532q.k(rcVar.f384710e, "@all");
            }
            fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar7.requireAccountInitialized();
            nVar7.f265532q.k(f9Var.Q0(), rcVar.f384711f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tq3.b.run():void");
    }
}
