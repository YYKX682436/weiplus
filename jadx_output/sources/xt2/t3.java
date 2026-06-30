package xt2;

/* loaded from: classes3.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.z3 f457029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt2.i f457030e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(xt2.z3 z3Var, tt2.i iVar) {
        super(3);
        this.f457029d = z3Var;
        this.f457030e = iVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        ((java.lang.Number) obj2).intValue();
        so2.j5 shopItem = (so2.j5) obj3;
        kotlin.jvm.internal.o.g((android.view.View) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(shopItem, "shopItem");
        java.util.Iterator it = this.f457030e.f421934h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((tt2.e) it.next()).f421873b) {
                z17 = true;
                break;
            }
        }
        xt2.z3 z3Var = this.f457029d;
        z3Var.a(z17);
        z3Var.b();
        return jz5.f0.f302826a;
    }
}
