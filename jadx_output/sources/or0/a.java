package or0;

/* loaded from: classes8.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f347423d;

    /* renamed from: e, reason: collision with root package name */
    public long f347424e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f347425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ or0.c f347426g;

    /* renamed from: h, reason: collision with root package name */
    public int f347427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(or0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f347426g = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f347425f = obj;
        this.f347427h |= Integer.MIN_VALUE;
        return this.f347426g.a(null, this);
    }
}
