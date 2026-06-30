package yi2;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yi2.i0 i0Var) {
        super(1);
        this.f462594d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        yi2.i0 i0Var = this.f462594d;
        dk2.xf W0 = i0Var.f462520f.W0();
        if (W0 != null) {
            gk2.e eVar = i0Var.f462518d;
            ((dk2.r4) W0).q0(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.o4) eVar.a(mm2.o4.class)).U.f377129d, ((mm2.o4) eVar.a(mm2.o4.class)).U.f377131f, ((mm2.o4) eVar.a(mm2.o4.class)).U.f377132g, ((mm2.o4) eVar.a(mm2.o4.class)).U.f377133h, intValue, ((mm2.o4) eVar.a(mm2.o4.class)).U.f377135m, new yi2.e0(intValue, i0Var));
        }
        return jz5.f0.f302826a;
    }
}
