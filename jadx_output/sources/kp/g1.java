package kp;

/* loaded from: classes13.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310746e;

    /* renamed from: f, reason: collision with root package name */
    public int f310747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310746e = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310745d = obj;
        this.f310747f |= Integer.MIN_VALUE;
        return this.f310746e.qj(null, 0L, this);
    }
}
