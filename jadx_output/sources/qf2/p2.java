package qf2;

/* loaded from: classes10.dex */
public final class p2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f362532f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f362533g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362534h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362535i;

    /* renamed from: m, reason: collision with root package name */
    public int f362536m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(qf2.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f362535i = c3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f362534h = obj;
        this.f362536m |= Integer.MIN_VALUE;
        return qf2.c3.Z6(this.f362535i, null, 0, false, null, this);
    }
}
