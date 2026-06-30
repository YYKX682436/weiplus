package zv0;

/* loaded from: classes5.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476233d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f476234e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zv0.y f476236g;

    /* renamed from: h, reason: collision with root package name */
    public int f476237h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zv0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f476236g = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f476235f = obj;
        this.f476237h |= Integer.MIN_VALUE;
        return this.f476236g.d(null, null, this);
    }
}
