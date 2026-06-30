package pk1;

/* loaded from: classes12.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk1.l0 f355457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(pk1.l0 l0Var) {
        super(1);
        this.f355457d = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f355457d.f355470h, "startCallback, startRet: " + booleanValue);
        this.f355457d.f355474o = java.lang.Boolean.valueOf(booleanValue);
        if (booleanValue && (aVar = this.f355457d.f355469g) != null) {
            pk1.r rVar = (pk1.r) aVar;
            if (rVar.W == 0 && rVar.H > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - rVar.H;
                rVar.W = currentTimeMillis;
                com.tencent.mars.xlog.Log.i(rVar.f355486a, "markTimeForFirstByte costTime:%d", java.lang.Long.valueOf(currentTimeMillis));
            }
        }
        return jz5.f0.f302826a;
    }
}
