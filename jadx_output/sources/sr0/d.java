package sr0;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f411421d;

    /* renamed from: e, reason: collision with root package name */
    public int f411422e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sr0.f f411424g;

    /* renamed from: h, reason: collision with root package name */
    public int f411425h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sr0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f411424g = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f411423f = obj;
        this.f411425h |= Integer.MIN_VALUE;
        return sr0.f.G(this.f411424g, this);
    }
}
