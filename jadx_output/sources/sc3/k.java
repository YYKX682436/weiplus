package sc3;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f406469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f406470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f406471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f406472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sc3.k1 k1Var, yz5.l lVar, boolean z17, int i17, int i18) {
        super(0);
        this.f406468d = k1Var;
        this.f406469e = lVar;
        this.f406470f = z17;
        this.f406471g = i17;
        this.f406472h = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.magicbrush.MagicBrush magicBrush = this.f406468d.f406488t;
        if (magicBrush == null || magicBrush.d() || this.f406468d.f406474J) {
            com.tencent.mars.xlog.Log.i(this.f406468d.Q, "hy: not initializing magicbrush");
            this.f406469e.invoke(null);
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new sc3.j(this.f406468d, this.f406469e, this.f406470f, this.f406471g, this.f406472h));
        }
        return jz5.f0.f302826a;
    }
}
