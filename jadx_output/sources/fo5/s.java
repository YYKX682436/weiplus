package fo5;

/* loaded from: classes14.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f265109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265110e;

    /* renamed from: f, reason: collision with root package name */
    public int f265111f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fo5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f265110e = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f265109d = obj;
        this.f265111f |= Integer.MIN_VALUE;
        return this.f265110e.d(null, this);
    }
}
