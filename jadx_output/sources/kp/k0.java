package kp;

/* loaded from: classes13.dex */
public final class k0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310786d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310787e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310789g;

    /* renamed from: h, reason: collision with root package name */
    public int f310790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310789g = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310788f = obj;
        this.f310790h |= Integer.MIN_VALUE;
        return this.f310789g.Ri(this);
    }
}
