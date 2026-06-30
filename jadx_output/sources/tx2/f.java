package tx2;

/* loaded from: classes15.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422550d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422551e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tx2.k f422553g;

    /* renamed from: h, reason: collision with root package name */
    public int f422554h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tx2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422553g = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422552f = obj;
        this.f422554h |= Integer.MIN_VALUE;
        return this.f422553g.a(null, null, this);
    }
}
