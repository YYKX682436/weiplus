package e22;

/* loaded from: classes5.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f246736d;

    /* renamed from: e, reason: collision with root package name */
    public int f246737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e22.v0 f246738f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(e22.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f246738f = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f246736d = obj;
        this.f246737e |= Integer.MIN_VALUE;
        return this.f246738f.emit(null, this);
    }
}
