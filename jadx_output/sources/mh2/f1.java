package mh2;

/* loaded from: classes10.dex */
public final class f1 extends mh2.a {
    public int A;
    public boolean B;
    public final mh2.r0 C;

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f326328c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f326329d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326330e;

    /* renamed from: f, reason: collision with root package name */
    public final nh2.a f326331f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f326332g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f326333h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f326334i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f326335j;

    /* renamed from: k, reason: collision with root package name */
    public org.libpag.PAGFile f326336k;

    /* renamed from: l, reason: collision with root package name */
    public org.libpag.PAGFile f326337l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagFile f326338m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagFile f326339n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget f326340o;

    /* renamed from: p, reason: collision with root package name */
    public int f326341p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f326342q;

    /* renamed from: r, reason: collision with root package name */
    public long f326343r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f326344s;

    /* renamed from: t, reason: collision with root package name */
    public om2.e0 f326345t;

    /* renamed from: u, reason: collision with root package name */
    public int f326346u;

    /* renamed from: v, reason: collision with root package name */
    public int f326347v;

    /* renamed from: w, reason: collision with root package name */
    public int f326348w;

    /* renamed from: x, reason: collision with root package name */
    public final eh2.a f326349x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.r2 f326350y;

    /* renamed from: z, reason: collision with root package name */
    public r45.ha4 f326351z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context, android.view.ViewGroup root, ah2.f service, lj2.v0 pluginAbility) {
        super(context, root);
        nh2.c jVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f326328c = service;
        this.f326329d = pluginAbility;
        this.f326330e = "KTVSingingWidget";
        android.view.KeyEvent.Callback findViewById = this.f326292b.findViewById(com.tencent.mm.R.id.u8_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        nh2.a aVar = (nh2.a) findViewById;
        this.f326331f = aVar;
        android.view.View findViewById2 = this.f326292b.findViewById(com.tencent.mm.R.id.s_5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f326332g = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = this.f326292b.findViewById(com.tencent.mm.R.id.s3n);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f326333h = textView;
        android.view.View findViewById4 = this.f326292b.findViewById(com.tencent.mm.R.id.f486929s62);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f326334i = (com.tencent.mm.view.MMPAGView) findViewById4;
        android.view.View findViewById5 = this.f326292b.findViewById(com.tencent.mm.R.id.fxw);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        this.f326335j = textView2;
        android.view.View findViewById6 = this.f326292b.findViewById(com.tencent.mm.R.id.u89);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f326340o = (com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget) findViewById6;
        this.f326346u = -1;
        this.f326349x = new eh2.a();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        zl2.r4.f473950a.b3(textView2);
        com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView = aVar instanceof com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ? (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) aVar : null;
        if (ktvRenderLayoutView != null) {
            oh2.r rVar = ktvRenderLayoutView.f111676h;
            rVar.getClass();
            rVar.f345417h = ktvRenderLayoutView;
            ktvRenderLayoutView.f111675g.getClass();
            ktvRenderLayoutView.F = service;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3778j).getValue()).r()).intValue() == 1) {
                android.view.SurfaceView surfaceView = new android.view.SurfaceView(ktvRenderLayoutView.getContext());
                ktvRenderLayoutView.addView(surfaceView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                jVar = new nh2.i(surfaceView);
            } else {
                android.view.TextureView textureView = new android.view.TextureView(ktvRenderLayoutView.getContext());
                textureView.setOpaque(false);
                ktvRenderLayoutView.addView(textureView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                jVar = new nh2.j(textureView, ktvRenderLayoutView.F);
            }
            ktvRenderLayoutView.f111673e = jVar;
            ph2.e bVar = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3798l).getValue()).r()).intValue() == 1 ? new ph2.b() : new ph2.c();
            bVar.b(ktvRenderLayoutView);
            bVar.d(service);
            ktvRenderLayoutView.f111674f = bVar;
            nh2.c cVar = ktvRenderLayoutView.f111673e;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("ktvRender");
                throw null;
            }
            cVar.a(ktvRenderLayoutView);
            ktvRenderLayoutView.setClipChildren(false);
            com.tencent.mm.view.MMPAGView mMPAGView = ktvRenderLayoutView.f111682q;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) ktvRenderLayoutView.e(72.0f), (int) ktvRenderLayoutView.e(40.0f));
            layoutParams.gravity = 1;
            layoutParams.topMargin = (int) ktvRenderLayoutView.e(6.0f);
            mMPAGView.setTranslationX(-ktvRenderLayoutView.e(34.0f));
            mMPAGView.setLayoutParams(layoutParams);
            android.widget.ImageView imageView = ktvRenderLayoutView.f111683r;
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams((int) ktvRenderLayoutView.e(16.0f), (int) ktvRenderLayoutView.e(16.0f));
            layoutParams2.gravity = 1;
            layoutParams2.topMargin = (int) ktvRenderLayoutView.e(36.0f);
            layoutParams2.bottomMargin = (int) ktvRenderLayoutView.e(-4.0f);
            imageView.setLayoutParams(layoutParams2);
            com.tencent.mm.view.MMPAGView mMPAGView2 = ktvRenderLayoutView.f111684s;
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) ktvRenderLayoutView.e(74.0f), (int) ktvRenderLayoutView.e(28.0f));
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = (int) ktvRenderLayoutView.e(10.0f);
            mMPAGView2.setLayoutParams(layoutParams3);
            ktvRenderLayoutView.addView(mMPAGView);
            ktvRenderLayoutView.addView(imageView);
            ktvRenderLayoutView.addView(mMPAGView2);
            imageView.setVisibility(8);
            mMPAGView.setVisibility(8);
        }
        ym5.a1.h(textView, new mh2.o0(this));
        this.C = new mh2.r0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(mh2.f1 r7, mh2.p0 r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.f1.f(mh2.f1, mh2.p0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void g(mh2.f1 f1Var, mh2.p0 p0Var, int i17) {
        f1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlayComboPag type: ");
        sb6.append(p0Var);
        sb6.append(" index: ");
        sb6.append(i17);
        sb6.append(" isPlaying: ");
        com.tencent.mm.view.MMPAGView mMPAGView = f1Var.f326334i;
        sb6.append(mMPAGView.f());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = f1Var.f326330e;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (mMPAGView.f()) {
            com.tencent.mars.xlog.Log.i(str, "startPlayComboPag isPlaying progress: " + mMPAGView.getProgress());
        } else {
            kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new mh2.b1(f1Var, p0Var, null), 2, null);
        }
    }

    @Override // mh2.a
    public int a() {
        return com.tencent.mm.R.layout.dro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    @Override // mh2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(om2.d0 r23) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.f1.c(om2.d0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0263  */
    @Override // mh2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(r45.x84 r30) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.f1.d(r45.x84):void");
    }

    @Override // mh2.a
    public void e(om2.d0 singState) {
        kotlin.jvm.internal.o.g(singState, "singState");
        com.tencent.mars.xlog.Log.i(this.f326330e, "onSwitchState: " + singState + " comboPag: " + this.f326334i.f() + " resetStartTimeCount: " + this.f326348w);
        if (!this.f326328c.k()) {
            pm0.z.b(xy2.b.f458155b, "ktvTimerResetCount", false, null, null, false, false, new mh2.y0(this), 60, null);
        }
        this.f326345t = null;
        this.f326351z = null;
        this.f326348w = 0;
        eh2.a aVar = this.f326349x;
        aVar.f252909a.clear();
        aVar.f252910b = 500L;
        pm0.v.X(new mh2.x0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0 == r1.ordinal()) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r5 = this;
            lj2.v0 r0 = r5.f326329d
            boolean r1 = r0 instanceof com.tencent.mm.plugin.finder.live.plugin.l
            nh2.a r2 = r5.f326331f
            r3 = 0
            if (r1 == 0) goto L5c
            com.tencent.mm.plugin.finder.live.plugin.l r0 = (com.tencent.mm.plugin.finder.live.plugin.l) r0
            java.lang.Class<om2.g> r1 = om2.g.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            om2.g r0 = (om2.g) r0
            kotlinx.coroutines.flow.j2 r0 = r0.C
            kotlinx.coroutines.flow.h3 r0 = (kotlinx.coroutines.flow.h3) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L47
            int r0 = r0.intValue()
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r1 = com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger
            int r4 = r1.ordinal()
            if (r0 != r4) goto L2c
            goto L48
        L2c:
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r1 = com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger
            int r4 = r1.ordinal()
            if (r0 != r4) goto L35
            goto L48
        L35:
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r1 = com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAnchor
            int r4 = r1.ordinal()
            if (r0 != r4) goto L3e
            goto L48
        L3e:
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r1 = com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAudience
            int r4 = r1.ordinal()
            if (r0 != r4) goto L47
            goto L48
        L47:
            r1 = r3
        L48:
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r0 = com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger
            if (r1 != r0) goto L5c
            boolean r0 = r2 instanceof com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView
            if (r0 == 0) goto L53
            r3 = r2
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r3 = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) r3
        L53:
            if (r3 == 0) goto L6a
            oh2.r r0 = r3.f111676h
            r1 = 200(0xc8, float:2.8E-43)
            r0.f345427r = r1
            goto L6a
        L5c:
            boolean r0 = r2 instanceof com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView
            if (r0 == 0) goto L63
            r3 = r2
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r3 = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) r3
        L63:
            if (r3 == 0) goto L6a
            r0 = 0
            oh2.r r1 = r3.f111676h
            r1.f345427r = r0
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.f1.h():void");
    }

    public final void i(om2.e0 e0Var) {
        om2.p pVar;
        if (e0Var != null) {
            com.tencent.mm.plugin.finder.live.util.j2 j2Var = com.tencent.mm.plugin.finder.live.util.j2.f115579a;
            om2.o oVar = e0Var.f346299a;
            if (!j2Var.c(oVar.f346365f).f447045a || (pVar = e0Var.f346300b) == null) {
                return;
            }
            my5.a lyric = pVar.f346368b.f346391c;
            om2.w wVar = pVar.f346370d;
            com.tencent.mars.xlog.Log.i(this.f326330e, "on bind with lyrics " + lyric + ", note " + (wVar != null ? wVar.f346387c : null));
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) this.f326331f;
            ktvRenderLayoutView.getClass();
            kotlin.jvm.internal.o.g(lyric, "lyric");
            oh2.o oVar2 = ktvRenderLayoutView.f111675g;
            oVar2.getClass();
            com.tencent.mars.xlog.Log.i("KtvLyricsDrawer", "bind lyrics size: " + lyric.b());
            oVar2.f345383c = lyric;
            oVar2.b();
            int i17 = oVar.f346365f;
            java.lang.String str = oVar.f346362c;
            jh2.c rVar = i17 == 2 ? new kh2.r() : new kh2.l();
            rVar.a(new om2.u(str, pVar));
            rVar.f(new mh2.a1(this, i17, rVar));
        }
    }

    public final void j(r45.ha4 ha4Var) {
        if (ha4Var == null) {
            return;
        }
        int i17 = ha4Var.f375980d;
        com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) this.f326331f;
        ktvRenderLayoutView.f111680o = i17;
        if (!ktvRenderLayoutView.f111677i) {
            ph2.e eVar = ktvRenderLayoutView.f111674f;
            if (eVar == null) {
                kotlin.jvm.internal.o.o("drawerLooper");
                throw null;
            }
            eVar.a();
        }
        ktvRenderLayoutView.f111677i = true;
    }

    public final void k(int i17) {
        r45.yx1 Q6;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        java.lang.Object obj = this.f326329d;
        java.lang.String str = null;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = obj instanceof com.tencent.mm.plugin.finder.live.plugin.l ? (com.tencent.mm.plugin.finder.live.plugin.l) obj : null;
        if (lVar != null && (Q6 = ((om2.g) lVar.P0(om2.g.class)).Q6()) != null) {
            str = Q6.f391459e;
        }
        if (str == null) {
            str = "";
        }
        jSONObject.put("req_unique_id", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f473950a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328371p2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.V2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }
}
