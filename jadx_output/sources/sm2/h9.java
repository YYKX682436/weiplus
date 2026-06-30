package sm2;

/* loaded from: classes3.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409493d = o4Var;
        this.f409494e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sm2.g9 g9Var = new sm2.g9(this.f409494e);
        sm2.o4 o4Var = this.f409493d;
        qn2.n nVar = (qn2.n) o4Var.N(g9Var);
        o4Var.C = nVar;
        return nVar;
    }
}
