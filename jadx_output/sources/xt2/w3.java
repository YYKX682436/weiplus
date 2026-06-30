package xt2;

/* loaded from: classes3.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.z3 f457086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(xt2.z3 z3Var) {
        super(0);
        this.f457086d = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xt2.z3 z3Var = this.f457086d;
        tt2.i iVar = z3Var.f457150q;
        java.util.ArrayList arrayList = iVar.f421934h;
        try {
            java.util.Iterator it = arrayList.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                tt2.e eVar = (tt2.e) next;
                if (eVar.f421873b) {
                    it.remove();
                    iVar.f421935i.add(iVar.M(eVar.f421872a));
                }
            }
            iVar.K(arrayList, "after deleteProducts");
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveShoppingEditAdapter,deleteProducts:");
        }
        z3Var.f457150q.notifyDataSetChanged();
        z3Var.a(false);
        z3Var.b();
        return jz5.f0.f302826a;
    }
}
