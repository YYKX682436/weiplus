package zi2;

/* loaded from: classes3.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f473144e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f473145f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f473146g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473147h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473148i;

    /* renamed from: m, reason: collision with root package name */
    public int f473149m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473148i = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473147h = obj;
        this.f473149m |= Integer.MIN_VALUE;
        return this.f473148i.J1(null, false, this);
    }
}
