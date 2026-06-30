package nr2;

/* loaded from: classes8.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339297d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339298e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f339299f;

    /* renamed from: g, reason: collision with root package name */
    public int f339300g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339301h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nr2.u0 f339302i;

    /* renamed from: m, reason: collision with root package name */
    public int f339303m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(nr2.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339302i = u0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339301h = obj;
        this.f339303m |= Integer.MIN_VALUE;
        return this.f339302i.Q6(null, 0, 0L, null, null, null, this);
    }
}
