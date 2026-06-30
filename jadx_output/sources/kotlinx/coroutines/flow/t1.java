package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class t1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310409d;

    /* renamed from: e, reason: collision with root package name */
    public int f310410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.u1 f310411f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(kotlinx.coroutines.flow.u1 u1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310411f = u1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310409d = obj;
        this.f310410e |= Integer.MIN_VALUE;
        return this.f310411f.emit(null, this);
    }
}
