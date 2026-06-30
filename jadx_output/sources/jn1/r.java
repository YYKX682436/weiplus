package jn1;

/* loaded from: classes12.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f300515d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f300516e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f300517f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f300518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jn1.u f300519h;

    /* renamed from: i, reason: collision with root package name */
    public int f300520i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jn1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f300519h = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f300518g = obj;
        this.f300520i |= Integer.MIN_VALUE;
        jn1.o oVar = jn1.u.f300534f;
        return this.f300519h.l(null, null, this);
    }
}
