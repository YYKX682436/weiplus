package hu3;

/* loaded from: classes5.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f285096d;

    /* renamed from: e, reason: collision with root package name */
    public int f285097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f285098f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f285099g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285100h;

    /* renamed from: i, reason: collision with root package name */
    public int f285101i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f285100h = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f285099g = obj;
        this.f285101i |= Integer.MIN_VALUE;
        return hu3.n0.c(this.f285100h, 0, false, this);
    }
}
