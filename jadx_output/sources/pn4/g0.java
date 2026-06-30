package pn4;

/* loaded from: classes14.dex */
public final class g0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357107d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.q0 f357109f;

    /* renamed from: g, reason: collision with root package name */
    public int f357110g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(pn4.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357109f = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357108e = obj;
        this.f357110g |= Integer.MIN_VALUE;
        return this.f357109f.b(null, 0, this);
    }
}
