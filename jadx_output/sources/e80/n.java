package e80;

/* loaded from: classes12.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f250044d;

    /* renamed from: e, reason: collision with root package name */
    public int f250045e;

    /* renamed from: f, reason: collision with root package name */
    public long f250046f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f250047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e80.r f250048h;

    /* renamed from: i, reason: collision with root package name */
    public int f250049i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e80.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f250048h = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f250047g = obj;
        this.f250049i |= Integer.MIN_VALUE;
        return this.f250048h.Z6(null, this);
    }
}
