package gx0;

/* loaded from: classes5.dex */
public final class wf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277137d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f277138e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277139f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f277140g;

    /* renamed from: h, reason: collision with root package name */
    public int f277141h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(gx0.gg ggVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f277140g = ggVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f277139f = obj;
        this.f277141h |= Integer.MIN_VALUE;
        return gx0.gg.W6(this.f277140g, null, this);
    }
}
