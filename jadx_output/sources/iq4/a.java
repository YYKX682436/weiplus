package iq4;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f293792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f293794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f293795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f293796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ iq4.c f293797i;

    public a(iq4.c cVar, int i17, android.view.View view, boolean z17, boolean z18, long j17) {
        this.f293797i = cVar;
        this.f293792d = i17;
        this.f293793e = view;
        this.f293794f = z17;
        this.f293795g = z18;
        this.f293796h = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f293792d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.view.View view = this.f293793e;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipFloatBallHelper", "addVoipView, no ball, state:%s, view:%s", valueOf, view);
        iq4.c cVar = this.f293797i;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = cVar.f93132d;
        ballInfo.I = true;
        ballInfo.f93045J = false;
        ballInfo.f93050h = view;
        ballInfo.f93058s = false;
        ballInfo.L = gq4.v.Bi().f176564g;
        cVar.f93132d.F = true;
        if (!gq4.v.Bi().f176564g) {
            gq4.v.Bi().f176564g = true;
        }
        com.tencent.mm.plugin.ball.model.BallReportInfo t17 = cVar.t();
        boolean z17 = this.f293794f;
        t17.f93088h = z17 ? "3" : i17 == 4 ? "2" : "1";
        cVar.t().f93089i = z17 ? null : java.lang.String.valueOf(gq4.v.Bi().n());
        cVar.t().f93084d = 2;
        cVar.g();
        if (!z17) {
            cVar.f93132d.H = i17;
        } else if (i17 == 4) {
            cVar.f93132d.H = 512;
        } else if (i17 == 8) {
            cVar.f93132d.H = 1024;
        }
        cVar.h0(i17, z17, this.f293795g);
        cVar.g0(i17, z17);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
        cVar.f293800o = this.f293796h;
        cVar.j();
    }
}
