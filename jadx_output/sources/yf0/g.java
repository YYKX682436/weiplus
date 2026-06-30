package yf0;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461551d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f461552e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f461553f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f461554g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f461555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yf0.m f461556i;

    /* renamed from: m, reason: collision with root package name */
    public int f461557m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yf0.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f461556i = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f461555h = obj;
        this.f461557m |= Integer.MIN_VALUE;
        return this.f461556i.c(false, null, null, this);
    }
}
