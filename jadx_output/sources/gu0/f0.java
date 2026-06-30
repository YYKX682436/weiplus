package gu0;

/* loaded from: classes5.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275666d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275667e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275669g;

    /* renamed from: h, reason: collision with root package name */
    public int f275670h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275669g = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275668f = obj;
        this.f275670h |= Integer.MIN_VALUE;
        return this.f275669g.m(null, this);
    }
}
