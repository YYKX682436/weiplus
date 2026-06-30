package fo0;

/* loaded from: classes14.dex */
public final class n implements mn0.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final fo0.a f264820d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f264821e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f264822f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Intent f264823g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.live.core.mini.AbsLiveMiniView f264824h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f264825i;

    /* renamed from: m, reason: collision with root package name */
    public fo0.q f264826m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f264827n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f264828o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f264829p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f264830q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f264831r;

    /* renamed from: s, reason: collision with root package name */
    public final fo0.j f264832s;

    public n(fo0.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f264820d = callback;
        this.f264821e = jz5.h.b(fo0.i.f264813d);
        this.f264823g = new android.content.Intent();
        this.f264825i = new android.widget.FrameLayout(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LiveCoreMini", "dl: LiveMiniManager acquire wake lock", new java.lang.Object[0]);
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) systemService).newWakeLock(536870922, "MicroMsg.LiveCoreMini");
        kotlin.jvm.internal.o.f(newWakeLock, "newWakeLock(...)");
        this.f264822f = newWakeLock;
        if (!newWakeLock.isHeld()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMini", "acquire wakeLock");
            yj0.a.c(newWakeLock, "com/tencent/mm/live/core/mini/LiveMiniManager", "<init>", "(Lcom/tencent/mm/live/core/mini/IliveMiniCallback;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            newWakeLock.acquire();
            yj0.a.f(newWakeLock, "com/tencent/mm/live/core/mini/LiveMiniManager", "<init>", "(Lcom/tencent/mm/live/core/mini/IliveMiniCallback;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        this.f264832s = new fo0.j(this);
    }

    public static final void a(fo0.n nVar) {
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView = nVar.f264824h;
        int f116034f = absLiveMiniView != null ? absLiveMiniView.getF116034f() : 0;
        if (pm0.v.z(f116034f, 4) || pm0.v.z(f116034f, 2) || pm0.v.z(f116034f, 1) || pm0.v.z(f116034f, 8)) {
            gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
            fo0.c.f264798a.getClass();
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d;
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
            ballButtonInfo.f93069d = false;
            ballButtonInfo.f93071f = false;
            ballButtonInfo.f93072g = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.w_);
            Bi.b(ballInfo);
            return;
        }
        gp1.v Bi2 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        fo0.c.f264798a.getClass();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo2 = ballInfo2.f93054o;
        ballButtonInfo2.f93069d = true;
        ballButtonInfo2.f93071f = true;
        ballButtonInfo2.f93072g = -1;
        Bi2.b(ballInfo2);
    }

    public final void b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f264829p = view;
        view.setClipToOutline(true);
        view.setOutlineProvider(new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8)));
        android.widget.FrameLayout frameLayout = this.f264825i;
        frameLayout.removeView(this.f264829p);
        frameLayout.addView(view, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final void c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f264827n = view;
        view.setClipToOutline(true);
        view.setOutlineProvider(new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8)));
        android.widget.FrameLayout frameLayout = this.f264825i;
        frameLayout.removeAllViews();
        frameLayout.addView(view, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final void d(android.graphics.Point point, long j17, boolean z17, int i17, int i18, fo0.s ballInfo) {
        android.graphics.Point size = point;
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        boolean z18 = this.f264828o;
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView = this.f264824h;
        fo0.t tVar = new fo0.t(z18, j17, z17, i17, absLiveMiniView != null ? absLiveMiniView.c() : 0, i18);
        fo0.a aVar = this.f264820d;
        fo0.b d17 = aVar.d();
        ballInfo.f264846f = d17 != null ? d17.a() : null;
        fo0.b d18 = aVar.d();
        ballInfo.f264847g = d18 != null ? d18.b() : null;
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView2 = this.f264824h;
        if (absLiveMiniView2 != null) {
            int i19 = com.tencent.mm.live.core.mini.AbsLiveMiniView.f68573d;
            absLiveMiniView2.b(ballInfo.f264848h, true);
        }
        fo0.q qVar = this.f264826m;
        if (qVar != null) {
            android.view.View view = qVar.f264836a;
            if (view != null) {
                android.widget.FrameLayout frameLayout = this.f264825i;
                if (!(frameLayout.indexOfChild(view) != -1)) {
                    android.view.ViewParent parent = view.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    frameLayout.removeAllViews();
                    frameLayout.addView(view, new android.widget.RelativeLayout.LayoutParams(-1, -1));
                    frameLayout.setBackground(null);
                    android.view.ViewParent parent2 = frameLayout.getParent();
                    android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        viewGroup2.setBackground(null);
                    }
                    com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView3 = this.f264824h;
                    if (absLiveMiniView3 != null) {
                        absLiveMiniView3.setLiveFloatUpperView(8);
                    }
                }
            }
            android.graphics.Point point2 = qVar.f264837b;
            if (point2 != null) {
                size = point2;
            }
        }
        fo0.c.f264798a.getClass();
        fo0.f fVar = fo0.c.f264799b;
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView4 = this.f264824h;
        fo0.q qVar2 = this.f264826m;
        java.lang.Integer num = qVar2 != null ? qVar2.f264838c : null;
        java.lang.Integer num2 = qVar2 != null ? qVar2.f264839d : null;
        fVar.getClass();
        fVar.b();
        if (absLiveMiniView4 != null) {
            gp1.r rVar = fVar.f264807a;
            com.tencent.mm.plugin.ball.service.d dVar = (com.tencent.mm.plugin.ball.service.d) rVar;
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = dVar.f93132d;
            ballInfo2.f93058s = false;
            ballInfo2.f93053n = num != null ? num.intValue() : 1;
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo3 = dVar.f93132d;
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo3.f93054o;
            ballButtonInfo.f93072g = ballInfo.f264842b;
            ballButtonInfo.f93071f = ballInfo.f264843c;
            ballButtonInfo.f93069d = ballInfo.f264841a;
            ballButtonInfo.f93070e = ballInfo.f264844d;
            ballButtonInfo.f93073h = ballInfo.f264845e;
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = ballInfo3.f93055p;
            android.graphics.Bitmap bitmap = ballInfo.f264847g;
            ballBlurInfo.f93067e = bitmap;
            ballBlurInfo.f93066d = (bitmap == null || bitmap.isRecycled()) ? ballInfo.f264846f : "";
            if (num2 == null) {
                num2 = ballBlurInfo.f93068f;
            }
            ballBlurInfo.f93068f = num2;
            if (dVar.u()) {
                if (dVar.f93132d.f93050h != absLiveMiniView4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "addVoipView, has ball, but view is different, state:%s, view:%s, ballInfo.customView:%s", 4, absLiveMiniView4, dVar.f93132d.f93050h);
                    com.tencent.mm.plugin.ball.model.BallInfo ballInfo4 = dVar.f93132d;
                    ballInfo4.I = true;
                    ballInfo4.H = 4;
                    ballInfo4.f93050h = absLiveMiniView4;
                    ballInfo4.f93045J = false;
                    ballInfo4.F = true;
                    ballInfo4.L = z18;
                    fVar.f(tVar);
                    fVar.e(size);
                    rVar.j();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "addVoipView, has ball, state:%s, view:%s", 4, absLiveMiniView4);
                }
                dVar.S(dVar.f93132d.f93054o);
                dVar.R(dVar.f93132d.f93055p);
            } else {
                fo0.d dVar2 = new fo0.d(4, absLiveMiniView4, fVar, z18, tVar, size);
                long j18 = fVar.f264808b + 200;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = j18 - java.lang.System.currentTimeMillis();
                if (currentTimeMillis <= 0) {
                    dVar2.run();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveFloatBallHelper", "addVoipView, no ball, add delayed:%s", java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.mm.sdk.platformtools.u3.i(dVar2, currentTimeMillis);
                }
            }
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(21, this.f264832s);
        this.f264828o = true;
    }

    public final void e() {
        fo0.c cVar = fo0.c.f264798a;
        boolean z17 = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d.G.getBoolean("is_pause_replace_state") && ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().Y();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dl: LiveMiniManager release ");
        android.os.PowerManager.WakeLock wakeLock = this.f264822f;
        sb6.append(wakeLock.isHeld());
        sb6.append(", enableRemoveAllViewsWhenRelease:");
        jz5.g gVar = this.f264821e;
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        sb6.append(" floatReplaceState: ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreMini", sb6.toString());
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() && !z17) {
            this.f264825i.removeAllViews();
        }
        if (wakeLock.isHeld()) {
            android.os.PowerManager.WakeLock wakeLock2 = this.f264822f;
            yj0.a.c(wakeLock2, "com/tencent/mm/live/core/mini/LiveMiniManager", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            yj0.a.f(wakeLock2, "com/tencent/mm/live/core/mini/LiveMiniManager", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public final void f() {
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(46);
        fo0.c cVar = fo0.c.f264798a;
        fo0.f fVar = fo0.c.f264799b;
        if (!((com.tencent.mm.plugin.ball.service.d) fVar.f264807a).f93132d.G.getBoolean("is_pause_replace_state") || !((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().Y()) {
            fVar.d(this.f264824h);
            this.f264825i.removeView(this.f264829p);
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().L(21, this.f264832s);
    }

    public final void g(com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView) {
        fo0.p pVar = new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
        this.f264824h = absLiveMiniView;
        if (absLiveMiniView != null) {
            absLiveMiniView.setClipToOutline(true);
        }
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView2 = this.f264824h;
        if (absLiveMiniView2 != null) {
            absLiveMiniView2.setOutlineProvider(pVar);
        }
        android.widget.FrameLayout frameLayout = this.f264825i;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(pVar);
        if (frameLayout.getParent() != null && (frameLayout.getParent() instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = frameLayout.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(frameLayout);
        }
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView3 = this.f264824h;
        if (absLiveMiniView3 != null) {
            absLiveMiniView3.addView(frameLayout, 0);
        }
    }

    @Override // mn0.c0
    public void j6() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        fo0.c.f264798a.getClass();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d;
        ballInfo.f93054o.f93069d = false;
        Bi.b(ballInfo);
    }

    @Override // mn0.c0
    public void u() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        fo0.c.f264798a.getClass();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d;
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
        ballButtonInfo.f93069d = true;
        ballButtonInfo.f93071f = true;
        ballButtonInfo.f93072g = -1;
        Bi.b(ballInfo);
    }
}
