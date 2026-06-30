package fg0;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f261825d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f261826e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f261827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg0.g f261828g;

    /* renamed from: h, reason: collision with root package name */
    public int f261829h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fg0.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f261828g = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f261827f = obj;
        this.f261829h |= Integer.MIN_VALUE;
        return this.f261828g.U6(null, this);
    }
}
