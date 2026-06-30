package kp;

/* loaded from: classes13.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310822d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310823e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310824f;

    /* renamed from: g, reason: collision with root package name */
    public int f310825g;

    /* renamed from: h, reason: collision with root package name */
    public int f310826h;

    /* renamed from: i, reason: collision with root package name */
    public int f310827i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310828m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310829n;

    /* renamed from: o, reason: collision with root package name */
    public int f310830o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310829n = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310828m = obj;
        this.f310830o |= Integer.MIN_VALUE;
        return this.f310829n.Vi(this);
    }
}
