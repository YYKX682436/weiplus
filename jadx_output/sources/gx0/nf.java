package gx0;

/* loaded from: classes5.dex */
public final class nf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276774d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276775e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f276777g;

    /* renamed from: h, reason: collision with root package name */
    public int f276778h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(gx0.gg ggVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276777g = ggVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276776f = obj;
        this.f276778h |= Integer.MIN_VALUE;
        return gx0.gg.U6(this.f276777g, null, this);
    }
}
