package n06;

/* loaded from: classes15.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n06.o f333993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e26.c0 f333994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n06.o oVar, e26.c0 c0Var) {
        super(0);
        this.f333993d = oVar;
        this.f333994e = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n06.o oVar = this.f333993d;
        r06.x0 l17 = oVar.l();
        kotlin.jvm.internal.o.f(l17, "getBuiltInsModule(...)");
        return new n06.b0(l17, this.f333994e, new n06.l(oVar));
    }
}
