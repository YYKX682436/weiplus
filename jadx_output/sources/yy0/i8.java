package yy0;

/* loaded from: classes5.dex */
public final class i8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f468152d;

    /* renamed from: e, reason: collision with root package name */
    public long f468153e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yy0.k8 f468155g;

    /* renamed from: h, reason: collision with root package name */
    public int f468156h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(yy0.k8 k8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f468155g = k8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f468154f = obj;
        this.f468156h |= Integer.MIN_VALUE;
        return this.f468155g.Bi(null, 0L, this);
    }
}
