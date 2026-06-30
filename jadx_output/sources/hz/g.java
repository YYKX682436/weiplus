package hz;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f286222d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f286223e;

    /* renamed from: f, reason: collision with root package name */
    public long f286224f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f286225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hz.h f286226h;

    /* renamed from: i, reason: collision with root package name */
    public int f286227i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hz.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f286226h = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f286225g = obj;
        this.f286227i |= Integer.MIN_VALUE;
        return this.f286226h.m(this);
    }
}
