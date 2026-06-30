package gk4;

/* loaded from: classes10.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.m implements yz5.l {
    public d(java.lang.Object obj) {
        super(1, obj, gk4.r.class, "onFrameRender", "onFrameRender(J)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).longValue();
        gk4.r rVar = (gk4.r) this.receiver;
        if (rVar.f272599d != null) {
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = rVar.f272606k;
            if (concurrentLinkedDeque.size() > 0 && ((hk4.a) concurrentLinkedDeque.getFirst()).f281931j && rVar.f272620y != null) {
                pm0.v.X(new gk4.g(rVar));
            }
        }
        if (!rVar.f272621z && rVar.A > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("first frame render cost:");
            long j17 = rVar.A;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            com.tencent.mars.xlog.Log.i(rVar.f272602g, sb6.toString());
            rVar.f272621z = true;
        }
        return jz5.f0.f302826a;
    }
}
