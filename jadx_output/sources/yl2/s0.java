package yl2;

/* loaded from: classes3.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463067d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463068e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f463070g;

    /* renamed from: h, reason: collision with root package name */
    public int f463071h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463070g = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463069f = obj;
        this.f463071h |= Integer.MIN_VALUE;
        return this.f463070g.n(this);
    }
}
