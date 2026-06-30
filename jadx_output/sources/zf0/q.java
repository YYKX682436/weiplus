package zf0;

/* loaded from: classes12.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472505d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472506e;

    /* renamed from: f, reason: collision with root package name */
    public long f472507f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472509h;

    /* renamed from: i, reason: collision with root package name */
    public int f472510i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472509h = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472508g = obj;
        this.f472510i |= Integer.MIN_VALUE;
        return this.f472509h.O(this);
    }
}
