package xm2;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.l f455220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xm2.l lVar) {
        super(1);
        this.f455220d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zm2.b bVar;
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        xm2.l lVar = this.f455220d;
        lVar.f455224c.invoke(lVar.f455228g, java.lang.Double.valueOf(doubleValue));
        androidx.recyclerview.widget.RecyclerView recyclerView = lVar.f455230i;
        kotlin.jvm.internal.o.f(recyclerView, "access$getRecyclerView$p(...)");
        java.util.Iterator it = oj5.x.b(recyclerView).iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            xm2.c cVar = k3Var instanceof xm2.c ? (xm2.c) k3Var : null;
            if (cVar != null) {
                zm2.b bVar2 = cVar.f455202p;
                xm2.c cVar2 = kotlin.jvm.internal.o.b(bVar2 != null ? bVar2.f474162d : null, lVar.f455228g) ? cVar : null;
                if (cVar2 != null && (bVar = cVar2.f455202p) != null) {
                    cVar2.i(bVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
