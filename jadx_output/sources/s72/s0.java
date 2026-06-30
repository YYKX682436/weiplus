package s72;

/* loaded from: classes5.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.v0 f404149e;

    /* renamed from: f, reason: collision with root package name */
    public int f404150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(s72.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404149e = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f404148d = obj;
        this.f404150f |= Integer.MIN_VALUE;
        return this.f404149e.T6(0, false, this);
    }
}
