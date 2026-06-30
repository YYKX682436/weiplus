package pp1;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f357415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f357416g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pp1.z zVar, boolean z17, boolean z18, yz5.a aVar) {
        super(0);
        this.f357413d = zVar;
        this.f357414e = z17;
        this.f357415f = z18;
        this.f357416g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        pp1.g gVar = new pp1.g(this.f357413d, this.f357414e, this.f357415f, this.f357416g);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(gVar, 400L, false);
        pp1.z.B = false;
        this.f357413d.q(false, 0.0f);
        this.f357413d.k();
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f357413d.f357448f;
        if (contentFloatBallView == null) {
            return null;
        }
        contentFloatBallView.B(true, false);
        return jz5.f0.f302826a;
    }
}
