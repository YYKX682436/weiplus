package zf0;

/* loaded from: classes12.dex */
public final class p0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f472500d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472501e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472503g;

    /* renamed from: h, reason: collision with root package name */
    public int f472504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472503g = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472502f = obj;
        this.f472504h |= Integer.MIN_VALUE;
        return this.f472503g.y(this);
    }
}
