package sm2;

/* loaded from: classes3.dex */
public final class z8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409818d = o4Var;
        this.f409819e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.u8 u8Var = new sm2.u8(this.f409819e);
        sm2.o4 o4Var = this.f409818d;
        my2.e eVar = (my2.e) o4Var.N(u8Var);
        o4Var.D = eVar;
        return eVar;
    }
}
