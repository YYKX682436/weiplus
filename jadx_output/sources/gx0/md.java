package gx0;

/* loaded from: classes5.dex */
public final class md extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276724e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276726g;

    /* renamed from: h, reason: collision with root package name */
    public int f276727h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276726g = bfVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276725f = obj;
        this.f276727h |= Integer.MIN_VALUE;
        return this.f276726g.a7(null, this);
    }
}
