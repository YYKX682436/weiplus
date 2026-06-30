package tq3;

/* loaded from: classes12.dex */
public class d extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f421232d;

    public d(java.lang.String str) {
        this.f421232d = str;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "PriorityDeleteContactTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String userName = this.f421232d;
        if (Bi.n(userName, true).r2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityDeleteContactTask", "%s is Contact", userName);
            return;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        com.tencent.mm.plugin.priority.model.c2c.img.e eVar = nVar.f265530o;
        eVar.f153185d.bindString(1, userName);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "delete %d img %s", java.lang.Integer.valueOf(eVar.f153184c.executeUpdateDelete()), userName);
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.requireAccountInitialized();
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = nVar2.f265532q.f320460e;
        sQLiteStatement.bindString(1, userName);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "delete %d img usage %s", java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()), userName);
        fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar3.requireAccountInitialized();
        nq3.f fVar = nVar3.f265531p;
        fVar.f338997d.bindString(1, userName);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "delete %d file %s", java.lang.Integer.valueOf(fVar.f338996c.executeUpdateDelete()), userName);
        fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar4.requireAccountInitialized();
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement2 = nVar4.f265533r.f320460e;
        sQLiteStatement2.bindString(1, userName);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "delete %d img usage %s", java.lang.Integer.valueOf(sQLiteStatement2.executeUpdateDelete()), userName);
        fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar5.requireAccountInitialized();
        mq3.c cVar = nVar5.f265535t;
        cVar.getClass();
        cVar.f330775a.d(java.lang.String.format("DELETE FROM %s WHERE chat = ?", "C2CChatUsageResult"), new java.lang.String[]{userName});
        fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar6.requireAccountInitialized();
        mq3.d dVar = nVar6.f265534s;
        dVar.getClass();
        dVar.f330776a.d(java.lang.String.format("DELETE FROM %s WHERE chat = ?", "C2CChatUsage"), new java.lang.String[]{userName});
        fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar7.requireAccountInitialized();
        sq3.b bVar = nVar7.A;
        bVar.getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        p75.n0 n0Var = dm.n1.f238601u;
        n0Var.getClass();
        p75.m0 j17 = dm.n1.f238604x.j(userName);
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        p75.h hVar = (p75.h) j17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        java.lang.String table = n0Var.f352676a;
        kotlin.jvm.internal.o.g(table, "table");
        l75.k0 Q4 = bVar.f193147g.Q4();
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadStorage", "deleteByMsgUserName >> userName:" + userName + ", result:" + (Q4 != null ? Q4.delete(table, b17, e17) : -1));
    }
}
