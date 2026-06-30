package hu3;

/* loaded from: classes5.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f285105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f285106e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f285107f;

    /* renamed from: g, reason: collision with root package name */
    public int f285108g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f285109h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285110i;

    /* renamed from: m, reason: collision with root package name */
    public int f285111m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f285110i = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f285109h = obj;
        this.f285111m |= Integer.MIN_VALUE;
        return this.f285110i.h(null, false, this);
    }
}
