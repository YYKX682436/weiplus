package v20;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432752d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432753e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f432754f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f432755g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f432756h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432757i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v20.g f432758m;

    /* renamed from: n, reason: collision with root package name */
    public int f432759n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v20.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432758m = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432757i = obj;
        this.f432759n |= Integer.MIN_VALUE;
        return this.f432758m.b(null, null, null, false, this);
    }
}
