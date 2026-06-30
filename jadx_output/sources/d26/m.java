package d26;

/* loaded from: classes16.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.n f226025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d26.n nVar) {
        super(0);
        this.f226025d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b26.t tVar;
        d26.n nVar = this.f226025d;
        nVar.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        d26.x xVar = nVar.f226032d;
        java.util.Iterator it = xVar.f226062t.a().iterator();
        while (it.hasNext()) {
            for (o06.m mVar : y16.v.a(((f26.o0) it.next()).V(), null, null, 3, null)) {
                if ((mVar instanceof o06.v1) || (mVar instanceof o06.o1)) {
                    hashSet.add(mVar.getName());
                }
            }
        }
        i16.o oVar = xVar.f226053h;
        java.util.List list = oVar.f287655w;
        kotlin.jvm.internal.o.f(list, "getFunctionList(...)");
        java.util.Iterator it6 = list.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            tVar = xVar.f226060r;
            if (!hasNext) {
                break;
            }
            hashSet.add(b26.t0.b(tVar.f17516b, ((i16.j0) it6.next()).f287529i));
        }
        java.util.List list2 = oVar.f287656x;
        kotlin.jvm.internal.o.f(list2, "getPropertyList(...)");
        java.util.Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            hashSet.add(b26.t0.b(tVar.f17516b, ((i16.u0) it7.next()).f287765i));
        }
        return kz5.q1.i(hashSet, hashSet);
    }
}
