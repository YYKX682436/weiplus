package g80;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269427d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269428e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269429f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f269430g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f269431h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f269432i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g80.o f269433m;

    /* renamed from: n, reason: collision with root package name */
    public int f269434n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g80.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f269433m = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f269432i = obj;
        this.f269434n |= Integer.MIN_VALUE;
        return this.f269433m.W6(null, null, this);
    }
}
