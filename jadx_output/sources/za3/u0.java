package za3;

/* loaded from: classes15.dex */
public class u0 implements p21.d, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f471024d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.Button f471025e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.VolumeMeter f471026f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f471027g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471029i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471030m;

    /* renamed from: v, reason: collision with root package name */
    public final p21.c f471039v;

    /* renamed from: w, reason: collision with root package name */
    public za3.t0 f471040w;

    /* renamed from: h, reason: collision with root package name */
    public boolean f471028h = true;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f471031n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public boolean f471032o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f471033p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final long f471034q = 500;

    /* renamed from: r, reason: collision with root package name */
    public long f471035r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f471036s = new com.tencent.mm.sdk.platformtools.b4(new za3.l0(this), false);

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f471037t = new com.tencent.mm.sdk.platformtools.b4(new za3.m0(this), false);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f471038u = new com.tencent.mm.sdk.platformtools.b4(new za3.n0(this), false);

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f471041x = new com.tencent.mm.sdk.platformtools.b4(new za3.p0(this), true);

    public u0(android.app.Activity activity, android.widget.Button button, com.tencent.mm.plugin.location.ui.TipSayingWidget tipSayingWidget) {
        this.f471024d = activity;
        this.f471025e = button;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) activity.findViewById(com.tencent.mm.R.id.p89);
        this.f471027g = relativeLayout;
        relativeLayout.setVisibility(8);
        com.tencent.mm.plugin.location.ui.VolumeMeter volumeMeter = (com.tencent.mm.plugin.location.ui.VolumeMeter) this.f471027g.findViewById(com.tencent.mm.R.id.p8_);
        this.f471026f = volumeMeter;
        volumeMeter.setArchView(button);
        com.tencent.mm.plugin.location.ui.VolumeMeter volumeMeter2 = this.f471026f;
        if (volumeMeter2.f144680n == null) {
            volumeMeter2.f144680n = new com.tencent.mm.sdk.platformtools.n3("VolumeMeter_handler");
        }
        ((dh4.l) ((fa0.r) i95.n0.c(fa0.r.class))).getClass();
        dh4.f0 Di = dh4.l.Di();
        this.f471039v = Di;
        if (Di == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TalkMgr", "cannot get talkroom server");
        }
    }

    @Override // p21.d
    public void J0(int i17, int i18, java.lang.String str) {
    }

    @Override // p21.d
    public void J1(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.f("MicroMsg.TalkMgr", "onInitFailed %s", str);
        va3.j0.Ri().b(3);
        this.f471024d.finish();
    }

    @Override // p21.d
    public void N4(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkMgr", "onSeizeMicFailed");
        if (i17 == 340) {
            if (this.f471033p != 3) {
                return;
            } else {
                this.f471033p = 4;
            }
        } else if (this.f471033p != 1) {
            return;
        } else {
            this.f471033p = 2;
        }
        a();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.sdk.platformtools.r5 r5Var = new com.tencent.mm.sdk.platformtools.r5(null);
        com.tencent.mm.sdk.platformtools.d6 d6Var = com.tencent.mm.sdk.platformtools.d6.f192524a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.platformtools.d6.e(context, com.tencent.mm.R.string.f493320jq4, com.tencent.mm.sdk.platformtools.x5.f193085e, -1, false, r5Var);
    }

    @Override // p21.d
    public void P2(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkMgr", "add %s,  del %s", str, str2);
    }

    @Override // p21.d
    public void P3() {
    }

    @Override // p21.d
    public void R() {
    }

    @Override // p21.d
    public void T0(java.lang.String str) {
    }

    @Override // p21.d
    public void T1() {
        a();
    }

    @Override // p21.d
    public void U2() {
        a();
    }

    public final void a() {
        za3.t0 t0Var;
        com.tencent.mm.plugin.location.ui.impl.TrackPoint trackPoint;
        com.tencent.mm.plugin.location_soso.ViewManager viewManager;
        za3.t0 t0Var2;
        if (this.f471028h) {
            return;
        }
        ((dh4.l) ((fa0.r) i95.n0.c(fa0.r.class))).getClass();
        if (dh4.l.Di().f232531z && (t0Var2 = this.f471040w) != null) {
            ((za3.g0) t0Var2).a(null);
            ((za3.g0) this.f471040w).b();
        }
        int i17 = this.f471033p;
        if (i17 == 0) {
            java.lang.String str = this.f471029i;
            if (this.f471040w != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ((za3.g0) this.f471040w).a(null);
                    return;
                } else {
                    ((za3.g0) this.f471040w).a(this.f471029i);
                    return;
                }
            }
            return;
        }
        if (i17 == 1) {
            za3.t0 t0Var3 = this.f471040w;
            if (t0Var3 != null) {
                com.tencent.mm.sdk.platformtools.n3 n3Var = ((za3.g0) t0Var3).f470914c.f470941l;
                n3Var.removeMessages(8);
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = 8;
                n3Var.sendMessageAtFrontOfQueue(obtain);
                return;
            }
            return;
        }
        if (i17 == 2) {
            java.lang.String str2 = this.f471029i;
            if (this.f471040w == null || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            za3.t0 t0Var4 = this.f471040w;
            java.lang.String str3 = this.f471029i;
            za3.i0 i0Var = ((za3.g0) t0Var4).f470914c;
            i0Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                return;
            }
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(c01.a2.e(str3))) {
                return;
            }
            i0Var.f470939j = true;
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = i0Var.f470941l;
            n3Var2.removeMessages(7);
            android.os.Message obtain2 = android.os.Message.obtain();
            obtain2.what = 7;
            n3Var2.sendMessageAtFrontOfQueue(obtain2);
            return;
        }
        if ((i17 == 3 || i17 == 5) && (t0Var = this.f471040w) != null) {
            za3.g0 g0Var = (za3.g0) t0Var;
            g0Var.f470917f = true;
            java.lang.String r17 = c01.z1.r();
            g0Var.f470913b.c();
            g0Var.f470913b.a(r17);
            com.tencent.mm.sdk.platformtools.n3 n3Var3 = g0Var.f470914c.f470941l;
            n3Var3.removeMessages(6);
            n3Var3.removeMessages(5);
            android.os.Message obtain3 = android.os.Message.obtain();
            obtain3.what = 6;
            n3Var3.sendMessageAtFrontOfQueue(obtain3);
            java.lang.Object viewByItag = g0Var.f470918g.getViewByItag(r17);
            if ((viewByItag instanceof com.tencent.mm.plugin.location.ui.impl.TrackPoint) && (viewManager = (trackPoint = (com.tencent.mm.plugin.location.ui.impl.TrackPoint) viewByItag).f144721p) != null) {
                viewManager.setMarker2Top(trackPoint.f144713e);
                viewManager.setMarker2Top(trackPoint.f144714f);
            }
            g0Var.f470916e = r17;
        }
    }

    public final void b() {
        if (this.f471033p != 5) {
            return;
        }
        this.f471036s.d();
        a();
        com.tencent.mm.sdk.platformtools.v5.c(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.jpy, new za3.o0(this));
        this.f471037t.c(1000L, 1000L);
    }

    public void c() {
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7584b = true;
        talkRoomServerEvent.e();
        ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).v();
    }

    public void d() {
        this.f471030m = this.f471024d.getIntent().getStringExtra("map_talker_name");
        ((dh4.f0) this.f471039v).a(this);
        java.lang.String str = this.f471030m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (com.tencent.mm.storage.z3.R4(str)) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(str);
            if (m17 == null) {
                c01.n8.a().c(str, 28);
            } else {
                this.f471031n = m17;
            }
        } else {
            ((java.util.LinkedList) this.f471031n).clear();
            ((java.util.LinkedList) this.f471031n).add(str);
            ((java.util.LinkedList) this.f471031n).add(c01.z1.r());
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new za3.q0(this, str));
        this.f471025e.setOnTouchListener(new za3.s0(this));
    }

    @Override // p21.d
    public void m3() {
        if (this.f471033p != 1) {
            return;
        }
        this.f471033p = 5;
        long j17 = this.f471035r;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        long j18 = this.f471034q;
        if (elapsedRealtime >= j18) {
            b();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkMgr", "onSeizeMicSuccess waiting to execute");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f471036s;
        long elapsedRealtime2 = j18 - (android.os.SystemClock.elapsedRealtime() - this.f471035r);
        b4Var.c(elapsedRealtime2, elapsedRealtime2);
    }

    @Override // p21.d
    public void n1() {
        this.f471028h = false;
        this.f471025e.setEnabled(true);
        a();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // p21.d
    public void q5(java.lang.String str) {
        this.f471029i = str;
        a();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f471041x;
        if (K0) {
            b4Var.d();
        } else {
            com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493317jq1);
            b4Var.c(100L, 100L);
        }
    }
}
