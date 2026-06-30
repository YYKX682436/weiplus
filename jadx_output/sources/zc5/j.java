package zc5;

/* loaded from: classes12.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f471458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f471459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f471460f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f471461g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f471462h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f471463i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zc5.m f471464m;

    /* renamed from: n, reason: collision with root package name */
    public int f471465n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zc5.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f471464m = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f471463i = obj;
        this.f471465n |= Integer.MIN_VALUE;
        return this.f471464m.b(null, false, this);
    }
}
