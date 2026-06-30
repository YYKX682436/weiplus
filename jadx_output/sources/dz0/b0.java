package dz0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244774d;

    /* renamed from: e, reason: collision with root package name */
    public int f244775e;

    /* renamed from: f, reason: collision with root package name */
    public int f244776f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dz0.e0 f244778h;

    /* renamed from: i, reason: collision with root package name */
    public int f244779i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(dz0.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244778h = e0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244777g = obj;
        this.f244779i |= Integer.MIN_VALUE;
        return this.f244778h.c(0, 0, this);
    }
}
