package wl2;

/* loaded from: classes10.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f447047d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f447048e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f447049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl2.d f447050g;

    /* renamed from: h, reason: collision with root package name */
    public int f447051h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wl2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f447050g = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f447049f = obj;
        this.f447051h |= Integer.MIN_VALUE;
        return this.f447050g.a(this);
    }
}
