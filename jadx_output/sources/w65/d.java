package w65;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f443346d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f443347e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f443348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w65.e f443349g;

    /* renamed from: h, reason: collision with root package name */
    public int f443350h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w65.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f443349g = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f443348f = obj;
        this.f443350h |= Integer.MIN_VALUE;
        return this.f443349g.c(this);
    }
}
