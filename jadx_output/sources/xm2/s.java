package xm2;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.t f455257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xm2.t tVar) {
        super(1);
        this.f455257d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xm2.t tVar = this.f455257d;
        if (!kotlin.jvm.internal.o.b(tVar.f455261d, obj)) {
            tVar.f455261d = obj;
            tVar.f455262e.f455245e = obj;
            androidx.recyclerview.widget.RecyclerView recyclerView = tVar.f455263f;
            kotlin.jvm.internal.o.f(recyclerView, "recyclerView");
            java.util.Iterator it = oj5.x.b(recyclerView).iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                xm2.o oVar = k3Var instanceof xm2.o ? (xm2.o) k3Var : null;
                if (oVar != null) {
                    zm2.c cVar = oVar.f455243q;
                    oVar.i(kotlin.jvm.internal.o.b(cVar != null ? cVar.f474162d : null, obj));
                }
            }
        }
        tVar.f455259b.invoke(obj);
        return jz5.f0.f302826a;
    }
}
