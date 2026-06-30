package gg2;

/* loaded from: classes2.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271717d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271718e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg2.w f271720g;

    /* renamed from: h, reason: collision with root package name */
    public int f271721h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(gg2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271720g = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271719f = obj;
        this.f271721h |= Integer.MIN_VALUE;
        return this.f271720g.a(null, this);
    }
}
