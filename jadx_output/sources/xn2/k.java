package xn2;

/* loaded from: classes2.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455518d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f455519e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f455520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455521g;

    /* renamed from: h, reason: collision with root package name */
    public int f455522h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xn2.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f455521g = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f455520f = obj;
        this.f455522h |= Integer.MIN_VALUE;
        return xn2.p0.c(this.f455521g, this);
    }
}
