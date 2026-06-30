package o1;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f342033d;

    /* renamed from: e, reason: collision with root package name */
    public long f342034e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f342035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o1.k f342036g;

    /* renamed from: h, reason: collision with root package name */
    public int f342037h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o1.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f342036g = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f342035f = obj;
        this.f342037h |= Integer.MIN_VALUE;
        return this.f342036g.c(0L, this);
    }
}
