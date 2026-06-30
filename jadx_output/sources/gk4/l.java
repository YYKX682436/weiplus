package gk4;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gk4.r rVar) {
        super(1);
        this.f272589d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk4.a aVar;
        hk4.a it = (hk4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = this.f272589d.f272602g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayFinished, mediaId:");
        gk4.s sVar = it.f281929h;
        sb6.append((sVar == null || (aVar = sVar.f272629h) == null) ? null : aVar.f234482s);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int a17 = gk4.r.a(this.f272589d, it);
        com.tencent.mars.xlog.Log.i(this.f272589d.f272602g, "onPlayFinished, status:" + this.f272589d.f272611p + ", playingPlayers.size:" + this.f272589d.f272606k.size() + ", playerMediaIndex:" + a17);
        if (a17 == this.f272589d.f272610o.size() - 1) {
            com.tencent.mars.xlog.Log.i(this.f272589d.f272602g, "onPlayFinished last media");
            gk4.r rVar = this.f272589d;
            rVar.m();
            rVar.e();
            rVar.f272612q = 0L;
            yz5.a aVar2 = rVar.f272601f;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            if (rVar.f272614s && rVar.f272611p == gk4.e.f272543e) {
                com.tencent.mars.xlog.Log.i(rVar.f272602g, "checkLoopStartOrPlayFinished loop to start");
                rVar.f272611p = gk4.e.f272542d;
                rVar.k();
            } else {
                com.tencent.mars.xlog.Log.i(rVar.f272602g, "checkLoopStartOrPlayFinished now play is finished");
            }
        }
        return jz5.f0.f302826a;
    }
}
