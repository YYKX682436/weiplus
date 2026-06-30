package df2;

/* loaded from: classes10.dex */
public final class q9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231145d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.t9 f231147f;

    /* renamed from: g, reason: collision with root package name */
    public int f231148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(df2.t9 t9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231147f = t9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231146e = obj;
        this.f231148g |= Integer.MIN_VALUE;
        return this.f231147f.Z6(0, null, 0L, this);
    }
}
