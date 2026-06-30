package xu;

/* loaded from: classes9.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.m implements yz5.l {
    public h(java.lang.Object obj) {
        super(1, obj, xu.k.class, "processState", "processState(Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList<s15.h> j17;
        hu.e p07 = (hu.e) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        xu.k kVar = (xu.k) this.receiver;
        kVar.getClass();
        j75.d dVar = p07.f298066d;
        if (dVar != null && (dVar instanceof hu.a)) {
            hu.a aVar = (hu.a) dVar;
            hu.f fVar = aVar.f284994b;
            kotlin.jvm.internal.o.g(fVar, "<set-?>");
            p07.f285002e = fVar;
            s15.w wVar = aVar.f284995c;
            p07.f285003f = wVar;
            fVar.f285005e = wVar;
            if (wVar != null && (j17 = wVar.j()) != null) {
                for (s15.h hVar : j17) {
                    long Q = hVar.Q();
                    if (Q > 0) {
                        try {
                            java.lang.String format = kVar.f457180d.format(new java.util.Date(Q * 1000));
                            kotlin.jvm.internal.o.f(format, "format(...)");
                            hVar.T0(format);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.RecordDetailDataUIC", "Failed to format srcMsgCreateTime: " + e17.getMessage());
                        }
                    }
                }
            }
            pt0.e0 e0Var = pt0.f0.f358209b1;
            hu.f fVar2 = aVar.f284994b;
            com.tencent.mm.storage.f9 k17 = e0Var.k(fVar2.q(), fVar2.n());
            if (k17 != null) {
                p07.f285002e.f285004d = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(k17);
            }
        }
        return jz5.f0.f302826a;
    }
}
