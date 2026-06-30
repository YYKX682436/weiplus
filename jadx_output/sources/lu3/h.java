package lu3;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f321404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlinx.coroutines.q qVar) {
        super(0);
        this.f321404d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f321404d;
        boolean n17 = rVar.n();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (n17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        }
        return f0Var;
    }
}
