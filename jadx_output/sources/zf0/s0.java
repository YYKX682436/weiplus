package zf0;

/* loaded from: classes12.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472538d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472539e;

    /* renamed from: f, reason: collision with root package name */
    public long f472540f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472541g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472542h;

    /* renamed from: i, reason: collision with root package name */
    public int f472543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472542h = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472541g = obj;
        this.f472543i |= Integer.MIN_VALUE;
        return this.f472542h.U(this);
    }
}
