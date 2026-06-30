package kp;

/* loaded from: classes13.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310852e;

    /* renamed from: f, reason: collision with root package name */
    public int f310853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310852e = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310851d = obj;
        this.f310853f |= Integer.MIN_VALUE;
        return this.f310852e.nj(null, this);
    }
}
