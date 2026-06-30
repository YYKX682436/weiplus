package m;

/* loaded from: classes16.dex */
public final class b extends qz5.d {
    public java.lang.Object L;
    public /* synthetic */ java.lang.Object M;
    public final /* synthetic */ we0.u0 N;
    public int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(we0.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.N = u0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.M = obj;
        this.P |= Integer.MIN_VALUE;
        return we0.u0.a(this.N, null, this);
    }
}
