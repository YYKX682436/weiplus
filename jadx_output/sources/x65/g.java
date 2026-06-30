package x65;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452357d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452358e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f452359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x65.l f452360g;

    /* renamed from: h, reason: collision with root package name */
    public int f452361h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x65.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f452360g = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f452359f = obj;
        this.f452361h |= Integer.MIN_VALUE;
        return x65.l.i(this.f452360g, null, this);
    }
}
