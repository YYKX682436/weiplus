package s23;

/* loaded from: classes4.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.m implements yz5.l {
    public p(java.lang.Object obj) {
        super(1, obj, s23.x.class, "onPositiveClickActivityTip", "onPositiveClickActivityTip(Lcom/tencent/mm/protocal/protobuf/ActivityTemplateTip;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.d2 p07 = (r45.d2) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        s23.x xVar = (s23.x) this.receiver;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPositiveClickActivityTip: ");
        k33.b bVar = xVar.f402357u;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", sb6.toString());
        xVar.b(p07);
        if (!xVar.d()) {
            xVar.e(0, java.lang.Boolean.TRUE);
        }
        ((ez0.f) xVar.a()).a(uy0.n.f431903f);
        return jz5.f0.f302826a;
    }
}
