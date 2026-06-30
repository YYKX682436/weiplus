package gx0;

/* loaded from: classes5.dex */
public final class qf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276893d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276894e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276895f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276896g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f276897h;

    /* renamed from: i, reason: collision with root package name */
    public int f276898i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(gx0.gg ggVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276897h = ggVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276896g = obj;
        this.f276898i |= Integer.MIN_VALUE;
        return gx0.gg.V6(this.f276897h, null, this);
    }
}
