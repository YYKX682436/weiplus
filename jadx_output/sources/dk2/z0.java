package dk2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f234403d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f234404e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f234405f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f234406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234407h;

    /* renamed from: i, reason: collision with root package name */
    public int f234408i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(dk2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f234407h = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f234406g = obj;
        this.f234408i |= Integer.MIN_VALUE;
        return this.f234407h.o(null, null, null, this);
    }
}
