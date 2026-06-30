package gu0;

/* loaded from: classes5.dex */
public final class c1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275639d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275640e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275642g;

    /* renamed from: h, reason: collision with root package name */
    public int f275643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275642g = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275641f = obj;
        this.f275643h |= Integer.MIN_VALUE;
        return gu0.k2.f(this.f275642g, this);
    }
}
