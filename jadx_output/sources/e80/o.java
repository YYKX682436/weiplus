package e80;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f250050d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250051e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f250052f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f250053g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e80.r f250054h;

    /* renamed from: i, reason: collision with root package name */
    public int f250055i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e80.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f250054h = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f250053g = obj;
        this.f250055i |= Integer.MIN_VALUE;
        return this.f250054h.a7(null, this);
    }
}
