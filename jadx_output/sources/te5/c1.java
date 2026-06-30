package te5;

/* loaded from: classes9.dex */
public final class c1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f418618e;

    /* renamed from: f, reason: collision with root package name */
    public int f418619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(te5.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418618e = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418617d = obj;
        this.f418619f |= Integer.MIN_VALUE;
        return this.f418618e.bj(null, null, this);
    }
}
