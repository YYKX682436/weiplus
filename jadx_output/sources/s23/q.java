package s23;

/* loaded from: classes4.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.m implements yz5.a {
    public q(java.lang.Object obj) {
        super(0, obj, s23.x.class, "onNegativeClickActivityTip", "onNegativeClickActivityTip()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s23.x xVar = (s23.x) this.receiver;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNegativeClickActivityTip: ");
        k33.b bVar = xVar.f402357u;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", "hitActivityTipNegativeEvent: ");
        yz5.l lVar = xVar.f402355s;
        if (lVar != null) {
            lVar.invoke(0L);
        }
        ((ez0.f) xVar.a()).a(uy0.n.f431904g);
        return jz5.f0.f302826a;
    }
}
