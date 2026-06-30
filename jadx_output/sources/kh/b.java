package kh;

/* loaded from: classes12.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d f307755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kh.d dVar) {
        super(0);
        this.f307755d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.l lVar;
        kh.d dVar = this.f307755d;
        if (dVar.f395294a.f363335d.f363301t) {
            return kz5.p0.f313996d;
        }
        java.util.Map map = dVar.f395391c;
        kotlin.jvm.internal.o.f(map, "access$getMTaskJiffiesTrace$p$s-730001956(...)");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            rh.f fVar = (rh.f) ((java.util.Map.Entry) it.next()).getValue();
            rh.f m17 = dVar.m(fVar.f395375e, fVar.f395374d);
            if (m17 == null) {
                lVar = null;
            } else {
                rh.f fVar2 = (rh.f) new rh.e(m17, fVar, m17).f395486c;
                lVar = new jz5.l(fVar2.f395375e, fVar2.f395377g.f395552a);
            }
            arrayList.add(lVar);
        }
        return kz5.n0.S0(kz5.n0.V(arrayList));
    }
}
