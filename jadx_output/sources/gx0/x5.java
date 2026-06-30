package gx0;

/* loaded from: classes5.dex */
public final class x5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277158d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277160f;

    /* renamed from: g, reason: collision with root package name */
    public int f277161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f277160f = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f277159e = obj;
        this.f277161g |= Integer.MIN_VALUE;
        return gx0.w8.f7(this.f277160f, null, this);
    }
}
