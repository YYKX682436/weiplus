package hr3;

/* loaded from: classes12.dex */
public final class xf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f284183d;

    /* renamed from: e, reason: collision with root package name */
    public int f284184e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f284185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hr3.ag f284186g;

    /* renamed from: h, reason: collision with root package name */
    public int f284187h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(hr3.ag agVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f284186g = agVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f284185f = obj;
        this.f284187h |= Integer.MIN_VALUE;
        return this.f284186g.h(null, this);
    }
}
