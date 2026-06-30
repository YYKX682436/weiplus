package l0;

/* loaded from: classes14.dex */
public final class p2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f314423d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f314424e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f314425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.q2 f314426g;

    /* renamed from: h, reason: collision with root package name */
    public int f314427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(l0.q2 q2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f314426g = q2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f314425f = obj;
        this.f314427h |= Integer.MIN_VALUE;
        return this.f314426g.emit(null, this);
    }
}
