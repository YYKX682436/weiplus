package mz0;

/* loaded from: classes5.dex */
public final class j2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332981d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332982e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f332983f;

    /* renamed from: g, reason: collision with root package name */
    public long f332984g;

    /* renamed from: h, reason: collision with root package name */
    public int f332985h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332986i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mz0.l2 f332987m;

    /* renamed from: n, reason: collision with root package name */
    public int f332988n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(mz0.l2 l2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332987m = l2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332986i = obj;
        this.f332988n |= Integer.MIN_VALUE;
        return mz0.l2.J7(this.f332987m, null, this);
    }
}
