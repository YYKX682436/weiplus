package so5;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410828d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f410829e;

    /* renamed from: f, reason: collision with root package name */
    public int f410830f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so5.m f410832h;

    /* renamed from: i, reason: collision with root package name */
    public int f410833i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(so5.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f410832h = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f410831g = obj;
        this.f410833i |= Integer.MIN_VALUE;
        return so5.m.a(this.f410832h, null, 0, this);
    }
}
