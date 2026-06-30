package th5;

/* loaded from: classes10.dex */
public final class b1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419346d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f419347e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f419348f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f419349g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f419350h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f419351i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ th5.f1 f419352m;

    /* renamed from: n, reason: collision with root package name */
    public int f419353n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(th5.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f419352m = f1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f419351i = obj;
        this.f419353n |= Integer.MIN_VALUE;
        return this.f419352m.a(null, null, null, null, this);
    }
}
