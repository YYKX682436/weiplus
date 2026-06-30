package pn4;

/* loaded from: classes14.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357263d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357264e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357265f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f357266g;

    /* renamed from: h, reason: collision with root package name */
    public int f357267h;

    /* renamed from: i, reason: collision with root package name */
    public int f357268i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357269m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f357270n;

    /* renamed from: o, reason: collision with root package name */
    public int f357271o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(pn4.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357270n = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357269m = obj;
        this.f357271o |= Integer.MIN_VALUE;
        return pn4.e1.c(this.f357270n, null, this);
    }
}
