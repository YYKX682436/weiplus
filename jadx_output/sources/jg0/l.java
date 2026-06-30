package jg0;

/* loaded from: classes12.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f299584d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299585e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299587g;

    /* renamed from: h, reason: collision with root package name */
    public int f299588h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299587g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299586f = obj;
        this.f299588h |= Integer.MIN_VALUE;
        return this.f299587g.k(this);
    }
}
