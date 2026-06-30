package yv;

/* loaded from: classes5.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent instanceof com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent) {
            ((nq1.s) i95.n0.c(nq1.s.class)).getClass();
            am.t2 t2Var = ((com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent) iEvent).f54055g;
            if (29 == t2Var.f7966a && t2Var.f7968c == 0) {
                y73.z.d(0);
            }
            return false;
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) {
            ((nq1.s) i95.n0.c(nq1.s.class)).getClass();
            am.r2 r2Var = ((com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent).f54053g;
            if (29 == r2Var.f7759a && r2Var.f7763e) {
                java.lang.String i17 = com.tencent.mm.vfs.w6.i(r2Var.f7761c, false);
                y73.z.c(0);
                ((y73.q) y73.q.f459745f.b()).b(i17);
            }
        }
        return false;
    }
}
