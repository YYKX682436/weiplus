package zv;

/* loaded from: classes11.dex */
public final class j1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475999d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f476000e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f476001f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zv.e2 f476003h;

    /* renamed from: i, reason: collision with root package name */
    public int f476004i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(zv.e2 e2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f476003h = e2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f476002g = obj;
        this.f476004i |= Integer.MIN_VALUE;
        return this.f476003h.wi(null, null, this);
    }
}
