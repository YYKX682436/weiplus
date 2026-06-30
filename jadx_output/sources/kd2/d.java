package kd2;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f306714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f306717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f306718h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f306719i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f306720m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f306721n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f306722o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f306723p;

    public d(kd2.q qVar, boolean z17, int i17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38) {
        this.f306714d = qVar;
        this.f306715e = z17;
        this.f306716f = i17;
        this.f306717g = z18;
        this.f306718h = z19;
        this.f306719i = z27;
        this.f306720m = z28;
        this.f306721n = z29;
        this.f306722o = z37;
        this.f306723p = z38;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kd2.q qVar = this.f306714d;
        com.tencent.mars.xlog.Log.i("FinderMegaVideoMiniViewHelper", "addMiniView, no ball, ball: %s, view:%s", qVar.f93132d, qVar.k0());
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = qVar.f93132d;
        ballInfo.I = true;
        ballInfo.f93045J = false;
        ballInfo.H = this.f306715e ? 4 : 2048;
        ballInfo.f93050h = qVar.k0();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = qVar.f93132d;
        ballInfo2.F = true;
        ballInfo2.f93053n = this.f306716f;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo2.f93054o;
        ballButtonInfo.f93071f = this.f306717g;
        ballButtonInfo.f93070e = this.f306718h;
        ballButtonInfo.f93073h = this.f306719i;
        ballButtonInfo.f93076n = this.f306720m;
        ballButtonInfo.f93078p = this.f306721n;
        ballButtonInfo.f93080r = this.f306722o;
        ballButtonInfo.f93069d = this.f306723p;
        qVar.w0();
        qVar.f306794r.alive();
        qVar.f306795s.alive();
        qVar.f306796t.alive();
        qVar.f306797u.alive();
        qVar.f306798v.alive();
        qVar.j();
    }
}
