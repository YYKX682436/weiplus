package jg0;

/* loaded from: classes12.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f299570d;

    /* renamed from: e, reason: collision with root package name */
    public long f299571e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299573g;

    /* renamed from: h, reason: collision with root package name */
    public int f299574h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299573g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299572f = obj;
        this.f299574h |= Integer.MIN_VALUE;
        return this.f299573g.D(null, this);
    }
}
