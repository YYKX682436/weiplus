package mn2;

/* loaded from: classes15.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.g3 f330117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(mn2.g3 g3Var) {
        super(0);
        this.f330117d = g3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yo0.a aVar = new yo0.a();
        aVar.f464060c = new mn2.l0();
        aVar.f464061d = new mn2.b1();
        aVar.f464062e = new ap0.a();
        aVar.f464059b = new mn2.z(mn2.k4.f330037f);
        aVar.f464063f = new mn2.a0();
        aVar.b(this.f330117d.O6());
        dp0.e eVar = new dp0.e(true, 0.5f);
        eVar.f242116c = dp0.c.f242111e;
        aVar.a(eVar);
        return new yo0.b(aVar);
    }
}
