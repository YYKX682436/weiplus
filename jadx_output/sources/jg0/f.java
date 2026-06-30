package jg0;

/* loaded from: classes12.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f299563d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299564e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299566g;

    /* renamed from: h, reason: collision with root package name */
    public int f299567h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299566g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299565f = obj;
        this.f299567h |= Integer.MIN_VALUE;
        return this.f299566g.M(this);
    }
}
