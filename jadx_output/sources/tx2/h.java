package tx2;

/* loaded from: classes15.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422569d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422570e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tx2.k f422572g;

    /* renamed from: h, reason: collision with root package name */
    public int f422573h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(tx2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422572g = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422571f = obj;
        this.f422573h |= Integer.MIN_VALUE;
        return this.f422572g.c(null, null, this);
    }
}
