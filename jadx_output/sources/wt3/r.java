package wt3;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449479d;

    /* renamed from: e, reason: collision with root package name */
    public int f449480e;

    /* renamed from: f, reason: collision with root package name */
    public int f449481f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f449482g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wt3.s f449483h;

    /* renamed from: i, reason: collision with root package name */
    public int f449484i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(wt3.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f449483h = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f449482g = obj;
        this.f449484i |= Integer.MIN_VALUE;
        return this.f449483h.a(null, 0, 0, this);
    }
}
