package d26;

/* loaded from: classes16.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f226049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(d26.x xVar) {
        super(0);
        this.f226049d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d26.x xVar = this.f226049d;
        java.util.List list = xVar.f226053h.f287654v;
        kotlin.jvm.internal.o.f(list, "getConstructorList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.Boolean c17 = k16.f.f303446n.c(((i16.r) obj).f287705g);
            kotlin.jvm.internal.o.f(c17, "get(...)");
            if (c17.booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            b26.t tVar = xVar.f226060r;
            if (!hasNext) {
                return kz5.n0.t0(kz5.n0.t0(arrayList2, kz5.c0.j(xVar.s())), tVar.f17515a.f17496n.b(xVar));
            }
            i16.r rVar = (i16.r) it.next();
            b26.s0 s0Var = tVar.f17523i;
            kotlin.jvm.internal.o.d(rVar);
            arrayList2.add(s0Var.d(rVar, false));
        }
    }
}
