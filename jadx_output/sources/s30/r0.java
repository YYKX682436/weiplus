package s30;

/* loaded from: classes13.dex */
public class r0 extends com.tencent.mm.sdk.event.n {
    public r0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.expt.pageflow.k kVar = (com.tencent.mm.plugin.expt.pageflow.k) i95.n0.c(com.tencent.mm.plugin.expt.pageflow.k.class);
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPageFlowService", "manual force login");
        if (!kVar.f99812d) {
            kVar.f99812d = true;
            s52.b.f(105, null, 0, java.lang.System.currentTimeMillis());
            s52.b.d().g(7);
            g52.a.b(7);
        }
        return false;
    }
}
