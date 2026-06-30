package jg0;

/* loaded from: classes12.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f299592d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299593e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299595g;

    /* renamed from: h, reason: collision with root package name */
    public int f299596h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299595g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299594f = obj;
        this.f299596h |= Integer.MIN_VALUE;
        return this.f299595g.m(this);
    }
}
