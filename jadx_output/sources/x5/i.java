package x5;

/* loaded from: classes16.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f451948d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f451949e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f451950f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f451951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x5.j f451952h;

    /* renamed from: i, reason: collision with root package name */
    public int f451953i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x5.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f451952h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f451951g = obj;
        this.f451953i |= Integer.MIN_VALUE;
        return x5.j.d(this.f451952h, null, null, null, null, this);
    }
}
