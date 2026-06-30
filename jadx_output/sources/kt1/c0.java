package kt1;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f311924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f311925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.a aVar, kotlinx.coroutines.q qVar) {
        super(0);
        this.f311924d = aVar;
        this.f311925e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f311924d.invoke();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f302826a;
        ((kotlinx.coroutines.r) this.f311925e).resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        return f0Var;
    }
}
