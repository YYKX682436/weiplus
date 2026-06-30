package pg2;

/* loaded from: classes3.dex */
public final class m extends mn0.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f354155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f354156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nn0.c f354157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ co0.s f354158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f354159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ug5.v f354160i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354161m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354162n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354163o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f354164p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.FinderLiveSurfaceView f354165q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f354166r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ qo0.c f354167s;

    public m(long j17, boolean z17, nn0.c cVar, co0.s sVar, yz5.a aVar, ug5.v vVar, android.view.View view, android.view.View view2, pg2.j0 j0Var, android.app.Activity activity, com.tencent.mm.live.core.view.FinderLiveSurfaceView finderLiveSurfaceView, android.widget.FrameLayout frameLayout, qo0.c cVar2) {
        this.f354155d = j17;
        this.f354156e = z17;
        this.f354157f = cVar;
        this.f354158g = sVar;
        this.f354159h = aVar;
        this.f354160i = vVar;
        this.f354161m = view;
        this.f354162n = view2;
        this.f354163o = j0Var;
        this.f354164p = activity;
        this.f354165q = finderLiveSurfaceView;
        this.f354166r = frameLayout;
        this.f354167s = cVar2;
    }

    @Override // mn0.a0
    public void a(int i17, int i18) {
        this.f354163o.Vi(this.f354158g, this.f354167s, i17, i18);
    }

    @Override // mn0.a0
    public void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrameRender Cost=");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f354155d;
        sb6.append(elapsedRealtime - j17);
        sb6.append("ms  isImageType=");
        boolean z17 = this.f354156e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        this.f354157f.J(this.f354158g);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            eVar.f257897s = elapsedRealtime2;
            eVar.f257896r = elapsedRealtime2 - j17;
            com.tencent.mars.xlog.Log.i("ViewFluentReporter", "tickSecondFrameEnd cost: " + eVar.f257896r);
        }
        yz5.a aVar = this.f354159h;
        if (aVar != null) {
            aVar.invoke();
        }
        if (!z17) {
            android.view.View view = this.f354162n;
            view.postDelayed(new pg2.l(view, this.f354163o, this.f354164p, this.f354158g, this.f354165q, this.f354161m, this.f354160i), 200L);
            return;
        }
        ug5.f fVar = ug5.v.f427655g;
        this.f354160i.b(false);
        android.view.View view2 = this.f354161m;
        if (view2 != null) {
            view2.animate().alpha(0.0f).setStartDelay(120L).setDuration(120L).withEndAction(new pg2.k(this.f354162n, this.f354163o, this.f354164p, this.f354158g, this.f354165q, this.f354166r, view2)).start();
        }
    }

    @Override // mn0.a0
    public void c() {
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "onWarningReconnect:");
        ug5.v vVar = this.f354160i;
        java.lang.Object d17 = vVar.d("liveSdkChannelParams");
        r45.ka4 ka4Var = d17 instanceof r45.ka4 ? (r45.ka4) d17 : null;
        java.lang.Object d18 = vVar.d("playerInfoData");
        mn0.l0 l0Var = d18 instanceof mn0.l0 ? (mn0.l0) d18 : null;
        qg2.e.f362799a.c("changeSurfaceViewToLiveRoom", this.f354157f, ka4Var, this.f354163o.Ui(this.f354164p, l0Var != null ? l0Var.f329773d : 0L, l0Var != null ? l0Var.f329772c : 0L));
    }
}
