package eq1;

/* loaded from: classes.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f255833d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eq1.u f255835f;

    /* renamed from: g, reason: collision with root package name */
    public int f255836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(eq1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f255835f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f255834e = obj;
        this.f255836g |= Integer.MIN_VALUE;
        java.lang.Object b17 = this.f255835f.b(false, this);
        return b17 == pz5.a.f359186d ? b17 : kotlin.Result.m520boximpl(b17);
    }
}
