package xm2;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.l f455219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xm2.l lVar) {
        super(1);
        this.f455219d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xm2.l lVar = this.f455219d;
        if (!kotlin.jvm.internal.o.b(lVar.f455228g, obj)) {
            lVar.f455228g = obj;
            lVar.f455229h.f455205e = obj;
            androidx.recyclerview.widget.RecyclerView recyclerView = lVar.f455230i;
            kotlin.jvm.internal.o.f(recyclerView, "recyclerView");
            java.util.Iterator it = oj5.x.b(recyclerView).iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                xm2.c cVar = k3Var instanceof xm2.c ? (xm2.c) k3Var : null;
                if (cVar != null) {
                    zm2.b bVar = cVar.f455202p;
                    cVar.j(kotlin.jvm.internal.o.b(bVar != null ? bVar.f474162d : null, obj));
                }
            }
            lVar.a(obj);
            lVar.f455225d.invoke(obj);
        }
        return jz5.f0.f302826a;
    }
}
