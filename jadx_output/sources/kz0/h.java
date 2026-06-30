package kz0;

/* loaded from: classes5.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f313728d;

    /* renamed from: e, reason: collision with root package name */
    public int f313729e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f313730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kz0.i f313731g;

    /* renamed from: h, reason: collision with root package name */
    public int f313732h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kz0.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f313731g = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f313730f = obj;
        this.f313732h |= Integer.MIN_VALUE;
        return this.f313731g.b(null, this);
    }
}
