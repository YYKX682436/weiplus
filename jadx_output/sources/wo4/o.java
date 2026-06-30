package wo4;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wo4.y yVar) {
        super(0);
        this.f448283d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ds0.d0 d0Var = this.f448283d.f448302i;
        if (d0Var != null) {
            d0Var.n();
        }
        hs0.a aVar = this.f448283d.f448301h;
        if (aVar != null) {
            aVar.d();
        }
        this.f448283d.f448304k = true;
        this.f448283d.c();
        return jz5.f0.f302826a;
    }
}
