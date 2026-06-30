package wt;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449221d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f449222e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f449223f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f449224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wt.i f449225h;

    /* renamed from: i, reason: collision with root package name */
    public int f449226i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(wt.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f449225h = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f449224g = obj;
        this.f449226i |= Integer.MIN_VALUE;
        return this.f449225h.b(null, null, null, this);
    }
}
