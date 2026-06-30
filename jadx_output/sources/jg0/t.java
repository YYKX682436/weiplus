package jg0;

/* loaded from: classes12.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f299622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299623e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299625g;

    /* renamed from: h, reason: collision with root package name */
    public int f299626h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299625g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299624f = obj;
        this.f299626h |= Integer.MIN_VALUE;
        return this.f299625g.y(this);
    }
}
