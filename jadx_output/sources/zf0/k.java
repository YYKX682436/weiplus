package zf0;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472456d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472458f;

    /* renamed from: g, reason: collision with root package name */
    public int f472459g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472458f = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472457e = obj;
        this.f472459g |= Integer.MIN_VALUE;
        return zf0.v0.w(this.f472458f, null, null, null, null, null, null, this);
    }
}
