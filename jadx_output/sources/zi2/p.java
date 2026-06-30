package zi2;

/* loaded from: classes3.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473130d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f473131e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f473132f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473133g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473134h;

    /* renamed from: i, reason: collision with root package name */
    public int f473135i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473134h = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473133g = obj;
        this.f473135i |= Integer.MIN_VALUE;
        return this.f473134h.H1(null, this);
    }
}
