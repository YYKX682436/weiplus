package fo0;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f264801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fo0.f f264802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f264803g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fo0.t f264804h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f264805i;

    public d(int i17, android.view.View view, fo0.f fVar, boolean z17, fo0.t tVar, android.graphics.Point point) {
        this.f264800d = i17;
        this.f264801e = view;
        this.f264802f = fVar;
        this.f264803g = z17;
        this.f264804h = tVar;
        this.f264805i = point;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f264800d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.view.View view = this.f264801e;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "addVoipView, no ball, state:%s, view:%s", valueOf, view);
        fo0.f fVar = this.f264802f;
        gp1.r rVar = fVar.f264807a;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.I = true;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.f93045J = false;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.H = i17;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.f93050h = view;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.F = true;
        ((com.tencent.mm.plugin.ball.service.d) rVar).f93132d.L = this.f264803g;
        fVar.f(this.f264804h);
        fVar.e(this.f264805i);
        fVar.f264807a.j();
    }
}
