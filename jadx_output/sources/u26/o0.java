package u26;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f424183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(kotlinx.coroutines.q qVar) {
        super(1);
        this.f424183d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f302826a;
        ((kotlinx.coroutines.r) this.f424183d).resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        return f0Var;
    }
}
