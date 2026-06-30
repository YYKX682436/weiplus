package ez;

/* loaded from: classes9.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257690d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f257691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ez.e f257692f;

    /* renamed from: g, reason: collision with root package name */
    public int f257693g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ez.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f257692f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f257691e = obj;
        this.f257693g |= Integer.MIN_VALUE;
        return this.f257692f.Zi(null, null, this);
    }
}
