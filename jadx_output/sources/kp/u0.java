package kp;

/* loaded from: classes13.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310842e;

    /* renamed from: f, reason: collision with root package name */
    public int f310843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310842e = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310841d = obj;
        this.f310843f |= Integer.MIN_VALUE;
        return this.f310842e.ij(this);
    }
}
