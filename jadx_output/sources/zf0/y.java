package zf0;

/* loaded from: classes12.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472592d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472594f;

    /* renamed from: g, reason: collision with root package name */
    public int f472595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472594f = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472593e = obj;
        this.f472595g |= Integer.MIN_VALUE;
        return this.f472594f.R(null, null, this);
    }
}
