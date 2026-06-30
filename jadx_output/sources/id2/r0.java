package id2;

/* loaded from: classes3.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f290770d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f290771e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f290772f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f290773g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f290774h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f290775i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290776m;

    /* renamed from: n, reason: collision with root package name */
    public int f290777n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(id2.v1 v1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f290776m = v1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f290775i = obj;
        this.f290777n |= Integer.MIN_VALUE;
        return id2.v1.P6(this.f290776m, this);
    }
}
