package xm2;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.a0 f455282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xm2.a0 a0Var) {
        super(1);
        this.f455282d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xm2.a0 a0Var = this.f455282d;
        if (!kotlin.jvm.internal.o.b(a0Var.f455189f, obj)) {
            a0Var.f455189f = obj;
            a0Var.f455190g.f455273e = obj;
            androidx.recyclerview.widget.RecyclerView recyclerView = a0Var.f455191h;
            kotlin.jvm.internal.o.f(recyclerView, "recyclerView");
            java.util.Iterator it = oj5.x.b(recyclerView).iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                xm2.v vVar = k3Var instanceof xm2.v ? (xm2.v) k3Var : null;
                if (vVar != null) {
                    zm2.d dVar = vVar.f455271m;
                    vVar.i(kotlin.jvm.internal.o.b(dVar != null ? dVar.f474162d : null, obj));
                }
            }
            a0Var.a(obj);
            a0Var.f455187d.invoke(obj);
        }
        return jz5.f0.f302826a;
    }
}
