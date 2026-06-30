package rv0;

/* loaded from: classes5.dex */
public final class b0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.j f399929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f399930f;

    public b0(rv0.n1 n1Var, rv0.j jVar, ex0.a0 a0Var) {
        this.f399928d = n1Var;
        this.f399929e = jVar;
        this.f399930f = a0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.RandomAccess randomAccess;
        ex0.r rVar = (ex0.r) obj;
        rv0.n1 n1Var = this.f399928d;
        ((java.util.ArrayList) n1Var.A).clear();
        if (rVar != null) {
            java.util.List list = n1Var.A;
            ex0.a0 a0Var = this.f399930f;
            a0Var.getClass();
            if (rVar.o()) {
                com.tencent.maas.model.time.MJTimeRange l17 = rVar.l();
                java.util.List list2 = a0Var.f257097g.f257181i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    ex0.j0 j0Var = (ex0.j0) next;
                    if (j0Var.l().getEndTime().equalsTo(l17.getStartTime()) || j0Var.k().equalsTo(l17.getEndTime())) {
                        arrayList.add(next);
                    }
                }
                randomAccess = arrayList;
            } else {
                randomAccess = kz5.p0.f313996d;
            }
            ((java.util.ArrayList) list).addAll(randomAccess);
        }
        this.f399929e.G();
    }
}
