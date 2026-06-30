package dk2;

/* loaded from: classes3.dex */
public final class w1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f234264d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f234265e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f234266f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f234267g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234268h;

    /* renamed from: i, reason: collision with root package name */
    public int f234269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(dk2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f234268h = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f234267g = obj;
        this.f234269i |= Integer.MIN_VALUE;
        return this.f234268h.G(0, 0, 0, this);
    }
}
