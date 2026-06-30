package zc5;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f471452d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f471453e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f471454f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f471455g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zc5.m f471456h;

    /* renamed from: i, reason: collision with root package name */
    public int f471457i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zc5.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f471456h = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f471455g = obj;
        this.f471457i |= Integer.MIN_VALUE;
        return this.f471456h.a(null, false, this);
    }
}
