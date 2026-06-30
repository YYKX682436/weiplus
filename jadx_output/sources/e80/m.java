package e80;

/* loaded from: classes12.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f250037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250038e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f250039f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f250040g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f250041h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e80.r f250042i;

    /* renamed from: m, reason: collision with root package name */
    public int f250043m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e80.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f250042i = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f250041h = obj;
        this.f250043m |= Integer.MIN_VALUE;
        return e80.r.U6(this.f250042i, null, null, null, this);
    }
}
