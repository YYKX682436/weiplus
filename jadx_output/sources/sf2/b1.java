package sf2;

/* loaded from: classes10.dex */
public final class b1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407044d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407045e;

    /* renamed from: f, reason: collision with root package name */
    public long f407046f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407048h;

    /* renamed from: i, reason: collision with root package name */
    public int f407049i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(sf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407048h = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407047g = obj;
        this.f407049i |= Integer.MIN_VALUE;
        return this.f407048h.n7(false, this);
    }
}
