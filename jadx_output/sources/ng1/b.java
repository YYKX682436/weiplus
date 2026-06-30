package ng1;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng1.c f336913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ng1.c cVar) {
        super(1);
        this.f336913d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList<jx3.a> linkedList;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession it = (com.tencent.mm.plugin.appbrand.report.quality.QualitySession) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ng1.c cVar = this.f336913d;
        synchronized (cVar.f336916b) {
            linkedList = new java.util.LinkedList(cVar.f336916b);
            cVar.f336916b.clear();
        }
        for (jx3.a aVar : linkedList) {
            kotlin.jvm.internal.o.g(aVar, "<this>");
            aVar.k();
        }
        return jz5.f0.f302826a;
    }
}
