package mz0;

/* loaded from: classes5.dex */
public final class d2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332922d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332923e;

    /* renamed from: f, reason: collision with root package name */
    public int f332924f;

    /* renamed from: g, reason: collision with root package name */
    public int f332925g;

    /* renamed from: h, reason: collision with root package name */
    public int f332926h;

    /* renamed from: i, reason: collision with root package name */
    public int f332927i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332928m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mz0.e2 f332929n;

    /* renamed from: o, reason: collision with root package name */
    public int f332930o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(mz0.e2 e2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332929n = e2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332928m = obj;
        this.f332930o |= Integer.MIN_VALUE;
        return this.f332929n.a(null, this);
    }
}
