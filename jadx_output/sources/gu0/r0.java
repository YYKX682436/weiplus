package gu0;

/* loaded from: classes5.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275797d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275798e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275800g;

    /* renamed from: h, reason: collision with root package name */
    public int f275801h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275800g = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275799f = obj;
        this.f275801h |= Integer.MIN_VALUE;
        return gu0.k2.e(this.f275800g, this);
    }
}
