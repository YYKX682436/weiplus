package zc5;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f471466d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f471467e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f471468f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f471469g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f471470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zc5.m f471471i;

    /* renamed from: m, reason: collision with root package name */
    public int f471472m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zc5.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f471471i = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f471470h = obj;
        this.f471472m |= Integer.MIN_VALUE;
        return this.f471471i.c(null, false, this);
    }
}
