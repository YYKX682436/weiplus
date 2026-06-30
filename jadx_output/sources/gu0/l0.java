package gu0;

/* loaded from: classes5.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275752d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275754f;

    /* renamed from: g, reason: collision with root package name */
    public int f275755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275754f = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275753e = obj;
        this.f275755g |= Integer.MIN_VALUE;
        return this.f275754f.n(this);
    }
}
