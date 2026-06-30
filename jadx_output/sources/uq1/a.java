package uq1;

/* loaded from: classes.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17;
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        if (checkResUpdateCacheFileEvent != null) {
            am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
            int i18 = r2Var.f7759a;
            if (i18 == 62) {
                com.tencent.mars.xlog.Log.i("BoxCheckResUpdateListener", "CheckResUpdateCacheFileEvent %d", java.lang.Integer.valueOf(r2Var.f7760b));
                if (r2Var.f7760b == 2) {
                    java.lang.String Di = rq1.m0.Di();
                    if (com.tencent.mm.vfs.w6.j(Di)) {
                        com.tencent.mm.vfs.w6.h(Di);
                    }
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(Di);
                    if (!r6Var.s().m()) {
                        com.tencent.mm.vfs.w6.u(r6Var.r());
                    }
                    com.tencent.mm.vfs.w6.c(r2Var.f7761c, Di);
                    ((rq1.m0) i95.n0.c(rq1.m0.class)).aj();
                }
            } else if (i18 == 73 && (i17 = r2Var.f7760b) == 1) {
                com.tencent.mars.xlog.Log.i("BoxCheckResUpdateListener", "[checkResUpdateListener] word bank download, subtype: %d, file path: %s, version: %s, updated: %s", java.lang.Integer.valueOf(i17), r2Var.f7761c, java.lang.Integer.valueOf(r2Var.f7762d), java.lang.Boolean.valueOf(r2Var.f7763e));
                rq1.m0.bj(r2Var.f7761c, false);
            }
        }
        return false;
    }
}
