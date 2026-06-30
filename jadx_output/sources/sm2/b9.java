package sm2;

/* loaded from: classes3.dex */
public final class b9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409383d = o4Var;
        this.f409384e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.a9 a9Var = new sm2.a9(this.f409384e);
        sm2.o4 o4Var = this.f409383d;
        my2.k0 k0Var = (my2.k0) o4Var.N(a9Var);
        o4Var.E = k0Var;
        return k0Var;
    }
}
