package l0;

/* loaded from: classes14.dex */
public final class u2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f314540d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f314541e;

    /* renamed from: f, reason: collision with root package name */
    public float f314542f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f314543g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314544h;

    /* renamed from: i, reason: collision with root package name */
    public int f314545i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(l0.a3 a3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f314544h = a3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f314543g = obj;
        this.f314545i |= Integer.MIN_VALUE;
        return this.f314544h.c(null, null, this);
    }
}
