package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class p2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310360d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310361e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310362f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310363g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310364h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.q2 f310365i;

    /* renamed from: m, reason: collision with root package name */
    public int f310366m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(kotlinx.coroutines.flow.q2 q2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310365i = q2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310364h = obj;
        this.f310366m |= Integer.MIN_VALUE;
        return kotlinx.coroutines.flow.q2.l(this.f310365i, null, this);
    }
}
