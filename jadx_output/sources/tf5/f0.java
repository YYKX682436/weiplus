package tf5;

/* loaded from: classes11.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418975d;

    /* renamed from: e, reason: collision with root package name */
    public int f418976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf5.g0 f418977f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(tf5.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418977f = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418975d = obj;
        this.f418976e |= Integer.MIN_VALUE;
        return this.f418977f.emit(null, this);
    }
}
