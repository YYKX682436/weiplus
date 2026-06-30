package gb2;

/* loaded from: classes2.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270006d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f270007e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gb2.d f270009g;

    /* renamed from: h, reason: collision with root package name */
    public int f270010h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gb2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270009g = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270008f = obj;
        this.f270010h |= Integer.MIN_VALUE;
        return this.f270009g.i(false, this);
    }
}
