package um2;

/* loaded from: classes3.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f428750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f428751e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f428752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ um2.g f428753g;

    /* renamed from: h, reason: collision with root package name */
    public int f428754h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(um2.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f428753g = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f428752f = obj;
        this.f428754h |= Integer.MIN_VALUE;
        return um2.g.k(this.f428753g, this);
    }
}
