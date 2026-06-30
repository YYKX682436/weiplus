package df2;

/* loaded from: classes3.dex */
public final class r5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231222d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.s5 f231224f;

    /* renamed from: g, reason: collision with root package name */
    public int f231225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(df2.s5 s5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231224f = s5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231223e = obj;
        this.f231225g |= Integer.MIN_VALUE;
        return this.f231224f.a(this);
    }
}
