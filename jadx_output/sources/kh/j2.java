package kh;

/* loaded from: classes12.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.m2 f307835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(kh.m2 m2Var) {
        super(0);
        this.f307835d = m2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.l lVar;
        kh.m2 m2Var = this.f307835d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) m2Var.f307865c;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            kh.f2 f2Var = (kh.f2) ((java.util.Map.Entry) it.next()).getValue();
            java.lang.String str = f2Var.f307795e;
            kotlin.jvm.internal.o.d(str);
            kh.f2 a17 = m2Var.a(str, f2Var.f307794d);
            if (a17 == null) {
                lVar = null;
            } else {
                rh.d3 dlt = a17.a(f2Var).f395486c;
                java.lang.String str2 = ((kh.f2) dlt).f307795e;
                kotlin.jvm.internal.o.d(str2);
                kotlin.jvm.internal.o.f(dlt, "dlt");
                lVar = new jz5.l(str2, java.lang.Long.valueOf(m2Var.b((kh.f2) dlt)));
            }
            arrayList.add(lVar);
        }
        return kz5.n0.S0(kz5.n0.V(arrayList));
    }
}
