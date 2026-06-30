package vt3;

/* loaded from: classes5.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439995d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439996e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vt3.l f439998g;

    /* renamed from: h, reason: collision with root package name */
    public int f439999h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vt3.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439998g = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439997f = obj;
        this.f439999h |= Integer.MIN_VALUE;
        return this.f439998g.e(this);
    }
}
