package x03;

/* loaded from: classes15.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f451025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f451026e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f451027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x03.i f451028g;

    /* renamed from: h, reason: collision with root package name */
    public int f451029h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x03.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f451028g = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f451027f = obj;
        this.f451029h |= Integer.MIN_VALUE;
        return this.f451028g.a(null, this);
    }
}
