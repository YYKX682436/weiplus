package jg0;

/* loaded from: classes12.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f299600d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299601e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299603g;

    /* renamed from: h, reason: collision with root package name */
    public int f299604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299603g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299602f = obj;
        this.f299604h |= Integer.MIN_VALUE;
        return this.f299603g.N(this);
    }
}
