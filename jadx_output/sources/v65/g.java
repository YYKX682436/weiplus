package v65;

/* loaded from: classes16.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f433568d;

    /* renamed from: e, reason: collision with root package name */
    public long f433569e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f433570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.h f433571g;

    /* renamed from: h, reason: collision with root package name */
    public int f433572h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v65.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f433571g = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f433570f = obj;
        this.f433572h |= Integer.MIN_VALUE;
        return this.f433571g.e(0L, this);
    }
}
