package gp2;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws5.f f274198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f274199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.q84 f274201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f274202h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f274203i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f274204m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274205n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ws5.f fVar, mn0.b0 b0Var, gp2.l0 l0Var, r45.q84 q84Var, kotlin.jvm.internal.h0 h0Var, so2.h1 h1Var, int i17, android.view.View view) {
        super(0);
        this.f274198d = fVar;
        this.f274199e = b0Var;
        this.f274200f = l0Var;
        this.f274201g = q84Var;
        this.f274202h = h0Var;
        this.f274203i = h1Var;
        this.f274204m = i17;
        this.f274205n = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gp2.l0 l0Var = this.f274200f;
        so2.h1 h1Var = this.f274203i;
        int i17 = this.f274204m;
        android.view.View view = this.f274205n;
        ws5.f fVar = this.f274198d;
        gp2.z zVar = new gp2.z(l0Var, h1Var, i17, view, fVar);
        fVar.setMute(true);
        ws5.f.j(this.f274198d, zVar, null, null, null, null, null, 62, null);
        gp2.l0 l0Var2 = this.f274200f;
        ((mn0.y) this.f274199e).K(l0Var2.f274251j, l0Var2.f274252k);
        com.tencent.mars.xlog.Log.i(l0Var2.t(), "checkCustomAutoPlay view:" + this.f274198d + ",previewTimeLimit:" + this.f274201g.getInteger(2));
        ne2.k kVar = (ne2.k) this.f274202h.f310123d;
        if (kVar != null) {
            r45.nw1 liveInfo = this.f274203i.getFeedObject().getFeedObject().getLiveInfo();
            kVar.c(liveInfo != null ? (r45.td2) liveInfo.getCustom(27) : null);
        }
        com.tencent.mars.xlog.Log.i(l0Var2.t(), "checkCustomAutoPlay pos:" + this.f274204m + " startCountDown!");
        return jz5.f0.f302826a;
    }
}
