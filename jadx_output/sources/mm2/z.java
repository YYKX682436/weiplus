package mm2;

/* loaded from: classes3.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f329594d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f329595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.e0 f329596f;

    /* renamed from: g, reason: collision with root package name */
    public int f329597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(mm2.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f329596f = e0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f329595e = obj;
        this.f329597g |= Integer.MIN_VALUE;
        return this.f329596f.Q6(null, this);
    }
}
