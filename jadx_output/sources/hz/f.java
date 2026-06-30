package hz;

/* loaded from: classes12.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f286215d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f286216e;

    /* renamed from: f, reason: collision with root package name */
    public long f286217f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f286218g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f286219h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hz.h f286220i;

    /* renamed from: m, reason: collision with root package name */
    public int f286221m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hz.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f286220i = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f286219h = obj;
        this.f286221m |= Integer.MIN_VALUE;
        return this.f286220i.k(this);
    }
}
