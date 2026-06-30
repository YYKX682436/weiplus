package f12;

/* loaded from: classes4.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f258609d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f258610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f258611f;

    /* renamed from: g, reason: collision with root package name */
    public int f258612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f12.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f258611f = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f258610e = obj;
        this.f258612g |= Integer.MIN_VALUE;
        return f12.j0.N6(this.f258611f, this);
    }
}
