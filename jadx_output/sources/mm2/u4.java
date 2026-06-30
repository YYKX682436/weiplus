package mm2;

/* loaded from: classes10.dex */
public final class u4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f329457d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f329458e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f329459f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f329460g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f329461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mm2.v4 f329462i;

    /* renamed from: m, reason: collision with root package name */
    public int f329463m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(mm2.v4 v4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f329462i = v4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f329461h = obj;
        this.f329463m |= Integer.MIN_VALUE;
        return this.f329462i.Q6(null, null, false, this);
    }
}
