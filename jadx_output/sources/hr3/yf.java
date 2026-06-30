package hr3;

/* loaded from: classes12.dex */
public final class yf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f284214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f284215e;

    /* renamed from: f, reason: collision with root package name */
    public long f284216f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f284217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hr3.ag f284218h;

    /* renamed from: i, reason: collision with root package name */
    public int f284219i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(hr3.ag agVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f284218h = agVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f284217g = obj;
        this.f284219i |= Integer.MIN_VALUE;
        return this.f284218h.i(null, null, false, 0L, this);
    }
}
