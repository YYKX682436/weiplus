package yt3;

/* loaded from: classes10.dex */
public final class h4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f465481d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f465482e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f465483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f465484g;

    /* renamed from: h, reason: collision with root package name */
    public int f465485h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(yt3.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f465484g = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f465483f = obj;
        this.f465485h |= Integer.MIN_VALUE;
        return this.f465484g.d(null, this);
    }
}
