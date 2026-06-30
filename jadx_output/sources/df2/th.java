package df2;

/* loaded from: classes3.dex */
public final class th extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231442e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f231443f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f231444g;

    /* renamed from: h, reason: collision with root package name */
    public long f231445h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f231446i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231447m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df2.vh f231448n;

    /* renamed from: o, reason: collision with root package name */
    public int f231449o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(df2.vh vhVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231448n = vhVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231447m = obj;
        this.f231449o |= Integer.MIN_VALUE;
        return this.f231448n.g7(this);
    }
}
