package pi0;

/* loaded from: classes11.dex */
public final class d1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354547d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354548e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354549f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f354550g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f354551h;

    /* renamed from: i, reason: collision with root package name */
    public long f354552i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354553m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354554n;

    /* renamed from: o, reason: collision with root package name */
    public int f354555o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354554n = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354553m = obj;
        this.f354555o |= Integer.MIN_VALUE;
        return this.f354554n.g(this);
    }
}
