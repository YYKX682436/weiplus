package rx3;

/* loaded from: classes10.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f401067d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f401068e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx3.z f401070g;

    /* renamed from: h, reason: collision with root package name */
    public int f401071h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rx3.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f401070g = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f401069f = obj;
        this.f401071h |= Integer.MIN_VALUE;
        return this.f401070g.a(0, false, false, this);
    }
}
