package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class ja extends com.tencent.mm.ui.chatting.gallery.j1 {
    public static final com.tencent.mm.ui.chatting.gallery.r8 N = new com.tencent.mm.ui.chatting.gallery.r8(null);
    public long A;
    public long B;
    public yd5.p C;
    public final com.tencent.mm.ui.chatting.gallery.lb D;
    public boolean E;
    public com.tencent.mm.ui.chatting.gallery.s8 F;
    public boolean G;
    public final m34.e H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public long f201071J;
    public long K;
    public int L;
    public int M;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.y0 f201072m;

    /* renamed from: n, reason: collision with root package name */
    public f25.m0 f201073n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f201074o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f201075p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.ub f201076q;

    /* renamed from: r, reason: collision with root package name */
    public long f201077r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f201078s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f201079t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f201080u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f201081v;

    /* renamed from: w, reason: collision with root package name */
    public fk4.u f201082w;

    /* renamed from: x, reason: collision with root package name */
    public wf0.u1 f201083x;

    /* renamed from: y, reason: collision with root package name */
    public long f201084y;

    /* renamed from: z, reason: collision with root package name */
    public long f201085z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(com.tencent.mm.ui.chatting.gallery.k1 adapter) {
        super(adapter);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f201072m = kotlinx.coroutines.z0.b();
        this.f201076q = new com.tencent.mm.ui.chatting.gallery.ub();
        this.f201080u = new java.util.HashMap();
        this.D = new com.tencent.mm.ui.chatting.gallery.lb();
        this.F = com.tencent.mm.ui.chatting.gallery.s8.f201368h;
        this.H = new com.tencent.mm.ui.chatting.gallery.z9(adapter, this);
    }

    public static final fk4.u C(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var, ok4.c cVar, com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct) {
        jaVar.getClass();
        com.tencent.mm.ui.chatting.gallery.p pVar = com.tencent.mm.ui.chatting.gallery.p.f201254a;
        fk4.k kVar = (fk4.k) com.tencent.mm.ui.chatting.gallery.p.f201255b.get(java.lang.Long.valueOf(f9Var.getMsgId()));
        if (kVar != null) {
            return kVar;
        }
        fk4.k kVar2 = new fk4.k(new com.tencent.mm.ui.chatting.gallery.q(f9Var, v2Var, cVar, new com.tencent.mm.ui.chatting.gallery.b9(tPVideoPlayReportStruct, v2Var)));
        jaVar.f201082w = kVar2;
        return kVar2;
    }

    public static final void D(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.ui.chatting.gallery.ta taVar) {
        if (jaVar.f200886d == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onVideoDownloadComplete");
        if (taVar.f201425c == jaVar.f200886d.f201092g.I7()) {
            jaVar.f200886d.f201092g.R8(taVar.f201425c);
        }
    }

    public static final void E(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.ui.chatting.gallery.ta taVar) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2;
        android.view.View view;
        if (jaVar.f200886d == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onVideoPlaying");
        taVar.g(true, 1.0f);
        taVar.d();
        taVar.f201447y.setVisibility(8);
        jaVar.f200886d.f201092g.g9(false);
        if (jaVar.f200886d.f201092g.x8()) {
            jaVar.f200886d.f201092g.getClass();
        }
        if (N.a() && (view = (imageGalleryUI2 = jaVar.f200886d.f201092g).T1) != null) {
            view.setContentDescription(imageGalleryUI2.getString(com.tencent.mm.R.string.f490511x5));
        }
        taVar.d();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = taVar.f201438p;
        kotlin.jvm.internal.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
        pk4.d dVar = (pk4.d) f4Var;
        f25.m0 m0Var = jaVar.f201073n;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        if (dVar.getF174611z()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onVideoPlaying: mute play, no need to request focus");
        } else {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.i.f259098c, new com.tencent.mm.ui.chatting.gallery.h9(dVar));
            jaVar.f201073n = m96;
            dVar.setMute(!(m96 != null && ((g25.e) m96).f267980c));
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI3 = jaVar.f200886d.f201092g;
        imageGalleryUI3.U7();
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = imageGalleryUI3.L1;
        redesignVideoPlayerSeekBar.setVideoTotalTime(dVar.getDuration() / 1000);
        redesignVideoPlayerSeekBar.a(dVar.getCurrentPosition() / 1000);
        kotlinx.coroutines.r2 r2Var = jaVar.f201074o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        jaVar.f201074o = kotlinx.coroutines.l.d(jaVar.f201072m, null, null, new com.tencent.mm.ui.chatting.gallery.e9(dVar, redesignVideoPlayerSeekBar, jaVar, null), 3, null);
        kotlinx.coroutines.r2 r2Var2 = jaVar.f201075p;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        jaVar.f201075p = kotlinx.coroutines.l.d(jaVar.f201072m, null, null, new com.tencent.mm.ui.chatting.gallery.ba(jaVar, dVar, null), 3, null);
        if (jaVar.f200886d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "keep screen on");
            jaVar.f200886d.f201092g.getContext().getWindow().addFlags(128);
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = jaVar.f200886d;
        if (k1Var != null && (imageGalleryUI = k1Var.f201092g) != null) {
            com.tencent.mm.storage.f9 w17 = k1Var.w();
            com.tencent.mm.ui.chatting.gallery.l3 l3Var = imageGalleryUI.f200676y;
            l3Var.getClass();
            if (w17 != null && w17.M2() && l3Var.f185843i != 2) {
                l3Var.c(w17, l3Var.a());
                l3Var.f185843i = 2;
            }
        }
        if (jaVar.F == com.tencent.mm.ui.chatting.gallery.s8.f201366f) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI4 = jaVar.f200886d.f201092g;
            imageGalleryUI4.l9(false, imageGalleryUI4.I7());
        }
    }

    public static final boolean H() {
        return N.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0327 A[ADDED_TO_REGION] */
    @Override // com.tencent.mm.ui.chatting.gallery.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.storage.f9 r19, int r20) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ja.A(com.tencent.mm.storage.f9, int):void");
    }

    @Override // com.tencent.mm.ui.chatting.gallery.j1
    public void B(com.tencent.mm.storage.f9 f9Var, int i17, boolean z17) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "toggleVideoMenu: position=" + i17 + ",needToggle = " + z17);
        if (f9Var == null || (k1Var = this.f200886d) == null || (imageGalleryUI = k1Var.f201092g) == null) {
            return;
        }
        int M7 = imageGalleryUI.M7(f9Var.getMsgId());
        com.tencent.mm.ui.chatting.gallery.ta k17 = k(i17);
        int i18 = M7 == 2 ? 8 : 5;
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        if (this.f201081v) {
            if (S() && z17) {
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f200886d.f201092g;
                kotlin.jvm.internal.o.d(k17);
                imageGalleryUI2.R8(k17.f201425c);
                n(f9Var);
                return;
            }
            return;
        }
        if (!kotlinx.coroutines.z0.h(this.f201072m)) {
            this.f201072m = kotlinx.coroutines.z0.b();
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null || ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).bj(f9Var)) {
            return;
        }
        if (com.tencent.mm.ui.chatting.component.z4.e(f9Var)) {
            androidx.appcompat.app.AppCompatActivity context = this.f200886d.f201092g.getContext();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = this.f200886d.f201092g.getContext().getString(com.tencent.mm.R.string.k7a);
            e4Var.c();
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = k17 != null ? k17.f201438p : null;
        pk4.d dVar = f4Var instanceof pk4.d ? (pk4.d) f4Var : null;
        if (dVar == null) {
            return;
        }
        if (!S()) {
            dVar.pause();
            L(k17, true);
            k17.d();
            k17.f(k17.f201437o, 8);
            this.f200886d.f201092g.g9(true);
        }
        kotlinx.coroutines.y0 y0Var = this.f201072m;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.ui.chatting.gallery.da(this, k17, f9Var, M7, dVar, h17, i18, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(com.tencent.mm.storage.f9 r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ja.F(com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean G(com.tencent.mm.ui.chatting.gallery.t8 t8Var) {
        if (t8Var == null) {
            return false;
        }
        int I7 = this.f200886d.f201092g.I7();
        int i17 = t8Var.f201408a;
        if (I7 != i17) {
            this.f200886d.f201098p.m(i17);
            return false;
        }
        com.tencent.mm.ui.chatting.gallery.ta k17 = k(i17);
        if (k17 != null) {
            k17.d();
            k17.f201447y.setVisibility(8);
            k17.d();
            k17.f201439q.setVisibility(8);
            k17.d();
            k17.f201437o.setVisibility(8);
        }
        this.G = true;
        this.f200886d.f201092g.o9(false);
        return true;
    }

    public final void I(yd5.p pVar, java.lang.String str) {
        if (str == null || !((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).zj(str) || pVar == null) {
            return;
        }
        kotlin.jvm.internal.o.g(1, "value");
        pVar.f461144p.put("isTmpPath", 1);
    }

    public final void J(com.tencent.mm.ui.chatting.gallery.ta taVar) {
        if (this.f200886d == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onVideoBuffering");
        taVar.d();
        taVar.f201437o.setVisibility(8);
        taVar.d();
        taVar.f201439q.setVisibility(8);
        taVar.d();
        taVar.f201447y.setVisibility(0);
        this.f200886d.f201092g.t9();
        kotlinx.coroutines.r2 r2Var = this.f201075p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f201075p = null;
    }

    public final void K(com.tencent.mm.ui.chatting.gallery.ta taVar, int i17) {
        if (this.f200886d == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onVideoDownloading: " + i17);
        taVar.d();
        taVar.f201437o.setVisibility(8);
        taVar.d();
        taVar.f201447y.setVisibility(8);
        taVar.d();
        taVar.f201439q.setProgress(i17);
        if (!S()) {
            taVar.d();
            taVar.f201439q.setVisibility(0);
            return;
        }
        if (taVar.f201425c == this.f200886d.f201092g.I7()) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200886d.f201092g;
            taVar.d();
            int progress = taVar.f201439q.getProgress();
            if (imageGalleryUI.I7() == taVar.f201425c) {
                com.tencent.mm.ui.chatting.gallery.q3 q3Var = imageGalleryUI.f200605e3;
                if (q3Var != null) {
                    com.tencent.mm.ui.chatting.gallery.q3.b(q3Var, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$a0(), java.lang.Integer.valueOf(progress));
                } else if (imageGalleryUI.M7(imageGalleryUI.f200611g.w().getMsgId()) == 2 || imageGalleryUI.M7(imageGalleryUI.f200611g.w().getMsgId()) == 1) {
                    imageGalleryUI.O7();
                    imageGalleryUI.f200629l1.b(progress);
                }
            }
        }
    }

    public final void L(com.tencent.mm.ui.chatting.gallery.ta taVar, boolean z17) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        int i17;
        if (this.f200886d == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onVideoStopped(" + taVar.f201425c + ')');
        if (N.a()) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f200886d.f201092g;
            android.view.View view = imageGalleryUI2.T1;
            if (view != null) {
                view.setContentDescription(imageGalleryUI2.getString(com.tencent.mm.R.string.f490519xf));
            }
        } else {
            this.f200886d.f201092g.t9();
        }
        if (z17) {
            this.f200886d.f201092g.g9(true);
            taVar.d();
            taVar.f201439q.setVisibility(8);
            taVar.d();
            taVar.f201447y.setVisibility(8);
            taVar.d();
            taVar.f(taVar.f201437o, 0);
            ((vf0.c) i95.n0.c(vf0.c.class)).getClass();
            taVar.d();
            taVar.f(taVar.f201437o, 8);
        }
        f25.m0 m0Var = this.f201073n;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f201073n = null;
        if (this.f200886d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "release screen on");
            this.f200886d.f201092g.getContext().getWindow().clearFlags(128);
        }
        kotlinx.coroutines.r2 r2Var = this.f201074o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f201074o = null;
        kotlinx.coroutines.r2 r2Var2 = this.f201075p;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f201075p = null;
        com.tencent.mm.ui.chatting.gallery.ub ubVar = this.f201076q;
        kotlinx.coroutines.r2 r2Var3 = ubVar.f201499a;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        ubVar.f201499a = null;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200886d;
        if (k1Var != null && (imageGalleryUI = k1Var.f201092g) != null) {
            com.tencent.mm.storage.f9 w17 = k1Var.w();
            com.tencent.mm.ui.chatting.gallery.l3 l3Var = imageGalleryUI.f200676y;
            l3Var.getClass();
            if (w17 != null && w17.M2() && (i17 = l3Var.f185843i) != 4) {
                if (i17 != 3) {
                    l3Var.c(w17, 8);
                }
                l3Var.f185843i = 3;
            }
        }
        yd5.p pVar = this.f201042e;
        if (pVar != null) {
            pVar.f461135g.f61603m = a06.d.c(((float) (java.lang.System.currentTimeMillis() - pVar.f461133e)) / 1000.0f);
        }
        yd5.p pVar2 = this.f201042e;
        if (pVar2 != null) {
            pVar2.a();
        }
        this.f201042e = null;
    }

    public final void M(com.tencent.mm.storage.f9 f9Var, int i17) {
        this.E = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "play thumb video(msgid=" + f9Var.getMsgId() + "),not playRawVideo");
        com.tencent.mm.ui.chatting.gallery.ta k17 = k(i17);
        if (k17 == null) {
            return;
        }
        k17.d();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = k17.f201438p;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer ? (com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) f4Var : null;
        if (thumbPlayerViewContainer != null) {
            thumbPlayerViewContainer.i();
        }
        k17.d();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var2 = k17.f201438p;
        kotlin.jvm.internal.o.e(f4Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
        kotlinx.coroutines.l.d(this.f201072m, null, null, new com.tencent.mm.ui.chatting.gallery.t9(this, k17, f9Var, (pk4.d) f4Var2, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(fk4.u r8, com.tencent.mm.storage.f9 r9, t21.v2 r10, pk4.d r11, com.tencent.mm.ui.chatting.gallery.ta r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ja.N(fk4.u, com.tencent.mm.storage.f9, t21.v2, pk4.d, com.tencent.mm.ui.chatting.gallery.ta, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(fk4.u r18, com.tencent.mm.storage.f9 r19, t21.v2 r20, pk4.d r21, yz5.a r22, yz5.a r23, yz5.a r24, com.tencent.mm.ui.chatting.gallery.ta r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ja.O(fk4.u, com.tencent.mm.storage.f9, t21.v2, pk4.d, yz5.a, yz5.a, yz5.a, com.tencent.mm.ui.chatting.gallery.ta, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void P(pk4.d dVar) {
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        if (N.a()) {
            com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200886d;
            if (k1Var == null || (imageGalleryUI = k1Var.f201092g) == null) {
                redesignVideoPlayerSeekBar = null;
            } else {
                imageGalleryUI.U7();
                redesignVideoPlayerSeekBar = imageGalleryUI.L1;
            }
            if (redesignVideoPlayerSeekBar instanceof com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) {
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f200886d.f201092g;
                imageGalleryUI2.U7();
                com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = imageGalleryUI2.L1;
                kotlin.jvm.internal.o.e(redesignVideoPlayerSeekBar2, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation");
                com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation = (com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) redesignVideoPlayerSeekBar2;
                if (dVar != null) {
                    float f17 = dVar.getF();
                    float f18 = 1.0f;
                    if (f17 == 1.0f) {
                        f18 = 1.5f;
                    } else {
                        if (f17 == 1.5f) {
                            f18 = 2.0f;
                        }
                    }
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(redesignVideoPlayerSeekBarWithAnimation.getSpeedRatioTextView(), kz5.c1.k(new jz5.l("before_speed_select", java.lang.Float.valueOf(f17)), new jz5.l("speed_select", java.lang.Float.valueOf(f18))));
                }
                redesignVideoPlayerSeekBarWithAnimation.setOnVideoSpeedChangeListener(new com.tencent.mm.ui.chatting.gallery.aa(this, redesignVideoPlayerSeekBarWithAnimation));
            }
        }
    }

    public final void Q(com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var) {
        taVar.d();
        taVar.f(taVar.f201437o, 8);
        taVar.d();
        taVar.f(taVar.f201439q, 8);
        taVar.d();
        taVar.f(taVar.f201447y, 8);
        taVar.b();
        taVar.f201448z.setVisibility(0);
        taVar.b();
        taVar.B.setImageResource(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
        taVar.b();
        int i17 = (int) (48 * taVar.B.getContext().getResources().getDisplayMetrics().density);
        taVar.b();
        android.view.ViewGroup.LayoutParams layoutParams = taVar.B.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i17;
        taVar.b();
        taVar.B.setLayoutParams(layoutParams);
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String L4 = tg3.u0.L4((tg3.u0) c17, f9Var, f9Var.z0(), false, 4, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "showVideoExpiredMask: thumbPath = " + L4);
        if (com.tencent.mm.vfs.w6.j(L4)) {
            taVar.b();
            taVar.f201448z.setBackgroundColor(this.f200886d.f201092g.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1_5));
            taVar.b();
            taVar.A.setTextColor(this.f200886d.f201092g.getResources().getColor(com.tencent.mm.R.color.BW_100));
            taVar.b();
            taVar.B.setColorFilter(this.f200886d.f201092g.getResources().getColor(com.tencent.mm.R.color.BW_100), android.graphics.PorterDuff.Mode.SRC_IN);
        } else {
            taVar.d();
            taVar.f201436n.setVisibility(8);
            taVar.b();
            taVar.f201448z.setBackgroundResource(com.tencent.mm.R.color.f478620cf);
            taVar.b();
            taVar.B.setColorFilter(this.f200886d.f201092g.getResources().getColor(com.tencent.mm.R.color.f478623ci), android.graphics.PorterDuff.Mode.SRC_IN);
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "showVideoExpiredMask: no thumbnail available, showing gray background");
        }
        taVar.b();
        taVar.A.setText(this.f200886d.f201092g.getString(com.tencent.mm.R.string.k78));
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "showVideoExpiredMask: expired mask shown");
    }

    public final void R(boolean z17) {
        if (!S() || !this.f201081v || z17) {
            this.f201081v = false;
            fk4.u uVar = this.f201082w;
            if (uVar != null) {
                ((fk4.k) uVar).p();
                return;
            }
            return;
        }
        fk4.u uVar2 = this.f201082w;
        if (uVar2 != null) {
            com.tencent.mm.ui.chatting.gallery.p pVar = com.tencent.mm.ui.chatting.gallery.p.f201254a;
            long j17 = ((fk4.k) uVar2).f263635w;
            fk4.k kVar = (fk4.k) uVar2;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = com.tencent.mm.ui.chatting.gallery.p.f201256c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                com.tencent.mm.ui.chatting.gallery.p.f201255b.put(java.lang.Long.valueOf(j17), kVar);
                kVar.f263634v = com.tencent.mm.ui.chatting.gallery.o.f201230d;
                reentrantReadWriteLock.writeLock().unlock();
                com.tencent.mm.ui.chatting.gallery.p.f201257d.put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
                fk4.u uVar3 = this.f201082w;
                if (uVar3 != null) {
                    ((fk4.k) uVar3).m();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "keep thumb video download [" + j17 + ']');
            } catch (java.lang.Throwable th6) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th6;
            }
        }
        this.f201082w = null;
        this.f201081v = false;
    }

    public final boolean S() {
        return ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).aj() && this.F == com.tencent.mm.ui.chatting.gallery.s8.f201364d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(fk4.u r9, com.tencent.mm.storage.f9 r10, t21.v2 r11, pk4.d r12, com.tencent.mm.ui.chatting.gallery.ta r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ja.T(fk4.u, com.tencent.mm.storage.f9, t21.v2, pk4.d, com.tencent.mm.ui.chatting.gallery.ta, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.ui.chatting.gallery.e
    public boolean i(com.tencent.mm.ui.chatting.gallery.ta holder, com.tencent.mm.storage.f9 f9Var, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(holder, f9Var, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "filling: " + i17);
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video.tp", "null msg: imgPath=null");
            return false;
        }
        java.util.HashMap hashMap = this.f201080u;
        if (!hashMap.containsKey(f9Var.z0())) {
            hashMap.put(f9Var.z0(), new com.tencent.mm.ui.chatting.gallery.t8(i17, f9Var, null, 4, null));
        }
        if (!kotlinx.coroutines.z0.h(this.f201072m)) {
            this.f201072m = kotlinx.coroutines.z0.b();
        }
        holder.d();
        if (!(holder.f201438p instanceof pk4.d)) {
            throw new java.lang.IllegalStateException("Must use ThumbPlayerTextureView".toString());
        }
        holder.d();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = holder.f201438p;
        kotlin.jvm.internal.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
        pk4.d dVar = (pk4.d) f4Var;
        if (dVar.isPlaying()) {
            dVar.stop();
        }
        dVar.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
        android.widget.TextView debugInfoTv = holder.f201440r;
        kotlin.jvm.internal.o.f(debugInfoTv, "debugInfoTv");
        this.f201076q.getClass();
        debugInfoTv.setVisibility(8);
        holder.d();
        holder.f201439q.setVisibility(8);
        holder.d();
        holder.f201447y.setVisibility(8);
        holder.g(false, 0.0f);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f201077r = java.lang.System.currentTimeMillis();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.ui.chatting.gallery.d9(f9Var, this, holder, null), 2, null);
        P(dVar);
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        if (!N.b(f9Var, t21.d3.h(z07))) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video.tp", "Video expired and truly no download in filling, show mask after thumb loaded");
        Q(holder, f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.e
    public com.tencent.mm.ui.chatting.gallery.ta k(int i17) {
        com.tencent.mm.ui.chatting.gallery.ta k17 = super.k(i17);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video.tp", "getHolder(" + i17 + ") returns null!");
        }
        return k17;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.j1
    public void n(com.tencent.mm.storage.f9 f9Var) {
        if (this.f201081v) {
            if ((f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "cancelThumbVideoDownload msgId: " + f9Var.getMsgId());
                this.f201081v = false;
                fk4.k c17 = com.tencent.mm.ui.chatting.gallery.p.f201254a.c(f9Var.getMsgId());
                if (kotlin.jvm.internal.o.b(this.f201082w, c17) || c17 == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "force stop cachedDownloader [" + c17.f263635w + ']');
                c17.p();
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.gallery.j1
    public void p() {
        com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video.tp", "detach");
        wf0.u1 u1Var = this.f201083x;
        if (u1Var != null) {
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(u1Var);
        }
        z();
        this.f200886d = null;
        java.util.Set keySet = com.tencent.mm.ui.chatting.gallery.l.f201164b.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        java.util.Iterator it = keySet.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            long longValue = ((java.lang.Number) it.next()).longValue();
            java.util.HashMap hashMap = com.tencent.mm.ui.chatting.gallery.l.f201164b;
            fk4.k kVar = (fk4.k) hashMap.get(java.lang.Long.valueOf(longValue));
            if (kVar != null) {
                kVar.f263624l = null;
            }
            if (kVar != null && kVar.f263618f) {
                z17 = true;
            }
            if (z17) {
                hashMap.remove(java.lang.Long.valueOf(longValue));
                com.tencent.mm.ui.chatting.gallery.l.f201165c.remove(java.lang.Long.valueOf(longValue));
            }
        }
        com.tencent.mm.ui.chatting.gallery.p pVar = com.tencent.mm.ui.chatting.gallery.p.f201254a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearCallback: clearing callbacks, size=");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.ui.chatting.gallery.p.f201255b;
        sb6.append(concurrentHashMap.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.C2CThumbVideoDownloader", sb6.toString());
        java.util.Set keySet2 = concurrentHashMap.keySet();
        kotlin.jvm.internal.o.f(keySet2, "<get-keys>(...)");
        java.util.Iterator it6 = keySet2.iterator();
        while (it6.hasNext()) {
            long longValue2 = ((java.lang.Number) it6.next()).longValue();
            fk4.k kVar2 = (fk4.k) com.tencent.mm.ui.chatting.gallery.p.f201255b.get(java.lang.Long.valueOf(longValue2));
            if (kVar2 != null) {
                kVar2.f263624l = null;
            }
            if (kVar2 != null && kVar2.f263618f) {
                pVar.c(longValue2);
                com.tencent.mm.ui.chatting.gallery.p.f201257d.remove(java.lang.Long.valueOf(longValue2));
            }
        }
        yd5.p pVar2 = this.f201042e;
        if (pVar2 != null) {
            pVar2.a();
        }
        yd5.p pVar3 = this.f201043f;
        if (pVar3 != null) {
            pVar3.a();
        }
        kotlinx.coroutines.z0.e(this.f201072m, null, 1, null);
        kotlinx.coroutines.z0.e(this.D.f201184a, null, 1, null);
        com.tencent.mm.ui.chatting.gallery.p pVar4 = com.tencent.mm.ui.chatting.gallery.p.f201254a;
        com.tencent.mm.ui.chatting.gallery.p.f201256c.writeLock().lock();
        try {
            java.util.Set keySet3 = com.tencent.mm.ui.chatting.gallery.p.f201255b.keySet();
            kotlin.jvm.internal.o.f(keySet3, "<get-keys>(...)");
            java.util.Iterator it7 = keySet3.iterator();
            while (it7.hasNext()) {
                long longValue3 = ((java.lang.Number) it7.next()).longValue();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.tencent.mm.ui.chatting.gallery.p.f201255b;
                fk4.k kVar3 = (fk4.k) concurrentHashMap2.get(java.lang.Long.valueOf(longValue3));
                if (kVar3 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.C2CThumbVideoDownloader", " try resumeAll: downloader[" + longValue3 + "] , finished = {" + kVar3.f263618f + "},downloading is {" + kVar3.i() + '}');
                    if (kVar3.f263618f) {
                        pVar4.c(longValue3);
                    } else if (!kVar3.i()) {
                        kVar3.f263613a.f(0);
                        if (!kVar3.o()) {
                            concurrentHashMap2.remove(java.lang.Long.valueOf(longValue3));
                        }
                    }
                }
            }
        } finally {
            com.tencent.mm.ui.chatting.gallery.p.f201256c.writeLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    @Override // com.tencent.mm.ui.chatting.gallery.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ja.v(int, int):void");
    }

    @Override // com.tencent.mm.ui.chatting.gallery.j1
    public void w(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "pause()");
        com.tencent.mm.ui.chatting.gallery.ta k17 = k(i17);
        if (k17 == null) {
            return;
        }
        k17.d();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = k17.f201438p;
        kotlin.jvm.internal.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
        ((pk4.d) f4Var).pause();
        this.f200886d.f201092g.g9(true);
        L(k17, true);
        if (S() && this.f201081v) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "pause video int downloading video,call requestall");
            fk4.u uVar = this.f201082w;
            if (uVar != null) {
                ((fk4.k) uVar).m();
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.gallery.j1
    public void x(com.tencent.mm.ui.chatting.gallery.ta taVar, java.lang.String str) {
        super.x(taVar, str);
        if (taVar != null) {
            taVar.d();
            taVar.f(taVar.f201437o, 8);
        }
    }

    @Override // com.tencent.mm.ui.chatting.gallery.j1
    public void y(com.tencent.mm.ui.chatting.gallery.ta holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "stop(" + holder.f201425c + ')');
        holder.g(false, 0.0f);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = holder.f201438p;
        pk4.d dVar = f4Var instanceof pk4.d ? (pk4.d) f4Var : null;
        if (dVar == null) {
            return;
        }
        holder.d();
        int currentPosition = holder.f201438p.getCurrentPosition();
        if (!this.f201078s) {
            t21.d3.w(this.f201079t, java.lang.Math.max(currentPosition - 1000, 0), dVar.getIsOnlineVideo());
        }
        R(false);
        dVar.stop();
        L(holder, true);
    }

    @Override // com.tencent.mm.ui.chatting.gallery.j1
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "stopAll");
        android.util.SparseArray sparseArray = this.f200886d.f228471f;
        int size = sparseArray.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                R(false);
                this.f201082w = null;
                this.f201081v = false;
                kotlinx.coroutines.z0.e(this.f201072m, null, 1, null);
                return;
            }
            android.view.View view = (android.view.View) sparseArray.get(sparseArray.keyAt(i17));
            com.tencent.mm.ui.chatting.gallery.ta taVar = (com.tencent.mm.ui.chatting.gallery.ta) (view != null ? view.getTag() : null);
            if ((taVar != null ? taVar.f201434l : null) != null) {
                com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = taVar.f201438p;
                pk4.d dVar = f4Var instanceof pk4.d ? (pk4.d) f4Var : null;
                if (dVar != null && dVar.isInitialized()) {
                    y(taVar);
                }
            }
            i17++;
        }
    }
}
