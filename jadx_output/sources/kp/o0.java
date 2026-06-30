package kp;

/* loaded from: classes13.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310805d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310806e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310808g;

    /* renamed from: h, reason: collision with root package name */
    public int f310809h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310808g = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310807f = obj;
        this.f310809h |= Integer.MIN_VALUE;
        return this.f310808g.Ui(null, this);
    }
}
