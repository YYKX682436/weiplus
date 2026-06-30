package lf4;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.a f318434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f318435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(if4.a aVar, lf4.q0 q0Var) {
        super(0);
        this.f318434d = aVar;
        this.f318435e = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if4.a aVar = this.f318434d;
        aVar.f291237e = false;
        aVar.f291238f = false;
        aVar.f291236d = false;
        java.util.Iterator it = aVar.f291239g.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f271335f = false;
        }
        java.util.Iterator it6 = aVar.f291240h.iterator();
        while (it6.hasNext()) {
            ((gf4.a) it6.next()).f271335f = false;
        }
        java.util.Iterator it7 = aVar.f291242j.iterator();
        while (it7.hasNext()) {
            ((gf4.a) it7.next()).f271335f = false;
        }
        lf4.q0 q0Var = this.f318435e;
        q0Var.n();
        ((sf4.a1) q0Var.f318462f).d();
        return jz5.f0.f302826a;
    }
}
