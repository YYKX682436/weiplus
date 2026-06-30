package lt1;

/* loaded from: classes11.dex */
public final class g extends lt1.e {

    /* renamed from: a, reason: collision with root package name */
    public final w11.u f321185a = new lt1.f();

    @Override // lt1.e
    public boolean a() {
        boolean Ri = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoContactSyncProcessor", "enable called enableBizPicNewName:" + Ri);
        return Ri;
    }

    @Override // lt1.e
    public int b() {
        return 28;
    }

    @Override // lt1.e
    public int c() {
        return 10818;
    }

    @Override // lt1.e
    public java.lang.String d() {
        return "MicroMsg.BizPhotoContactSyncProcessor";
    }

    @Override // lt1.e
    public java.lang.String e() {
        return "/cgi-bin/micromsg-bin/extcontactsync";
    }

    @Override // lt1.e
    public boolean h() {
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableSyncAfterAutoAuth", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoContactSyncProcessor", "isSyncOnAuth called EnableBizPhotoSyncAfterAutoAuth:" + z17);
        return z17;
    }

    @Override // lt1.e
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoContactSyncProcessor", "onStartSync");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2126, 4);
    }

    @Override // lt1.e
    public void j() {
        com.tencent.mars.xlog.Log.e("MicroMsg.BizPhotoContactSyncProcessor", "onSyncError");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2126, 5);
    }

    @Override // lt1.e
    public void k(java.util.List syncItems) {
        kotlin.jvm.internal.o.g(syncItems, "syncItems");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoContactSyncProcessor", "process() called with: syncItems = " + java.lang.Integer.valueOf(syncItems.size()));
        if (syncItems.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.zero.a1 a1Var = new com.tencent.mm.plugin.zero.a1();
        w11.u uVar = this.f321185a;
        a1Var.b(uVar);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int size = syncItems.size();
        java.util.Iterator it = syncItems.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.go5 go5Var = (r45.go5) next;
            r45.b50 b50Var = new r45.b50();
            b50Var.f370530d = go5Var.f375396d;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.c(go5Var.f375397e);
            b50Var.f370531e = cu5Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoContactSyncProcessor", "process cmd ret:" + a1Var.d(uVar, i17, size, b50Var, false, com.tencent.mm.booter.x1.e(), 5) + " diff:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " index:" + i17 + " size:" + size);
            it = it;
            i17 = i18;
        }
        a1Var.a(uVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoContactSyncProcessor", "process() end called");
    }
}
