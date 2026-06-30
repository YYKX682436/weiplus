package gg2;

/* loaded from: classes2.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271709d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271710e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg2.t f271712g;

    /* renamed from: h, reason: collision with root package name */
    public int f271713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(gg2.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271712g = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271711f = obj;
        this.f271713h |= Integer.MIN_VALUE;
        return this.f271712g.a(null, this);
    }
}
