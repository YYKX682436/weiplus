package vr0;

/* loaded from: classes14.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439512d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439513e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439515g;

    /* renamed from: h, reason: collision with root package name */
    public int f439516h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439515g = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439514f = obj;
        this.f439516h |= Integer.MIN_VALUE;
        return this.f439515g.n(null, this);
    }
}
