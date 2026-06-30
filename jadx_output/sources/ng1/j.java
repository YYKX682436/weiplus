package ng1;

/* loaded from: classes7.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f336930d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f336931e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f336932f;

    /* renamed from: g, reason: collision with root package name */
    public int f336933g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336934h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ng1.l f336935i;

    /* renamed from: m, reason: collision with root package name */
    public int f336936m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ng1.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f336935i = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f336934h = obj;
        this.f336936m |= Integer.MIN_VALUE;
        return this.f336935i.a(null, this);
    }
}
