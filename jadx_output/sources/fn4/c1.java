package fn4;

/* loaded from: classes4.dex */
public class c1 extends com.tencent.mm.modelvideo.MMVideoView {
    public fn4.b O1;
    public java.lang.String P1;

    public c1(android.content.Context context, fn4.b bVar) {
        super(context);
        this.P1 = "";
        this.f189740f = context;
        this.O1 = bVar;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public com.tencent.mm.pluginsdk.ui.tools.f4 C(android.content.Context context) {
        com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView topStoryVideoPlayTextureView = new com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView(context);
        topStoryVideoPlayTextureView.setOpenWithNoneSurface(true);
        topStoryVideoPlayTextureView.setNeedResetExtractor(k0());
        topStoryVideoPlayTextureView.setIsOnlineVideoType(true);
        return topStoryVideoPlayTextureView;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void I() {
        super.I();
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public boolean O() {
        return false;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public boolean Z(int i17, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        boolean z17;
        pInt.value = java.lang.Math.max(i17, this.E1);
        int i18 = this.f71651y1;
        if (i18 == 1 || i18 == 0) {
            if (this.f71652z1 == null || !k0()) {
                z17 = false;
            } else {
                pInt2.value = 0;
                pInt.value = 0;
                z17 = this.f71652z1.e(i17 + 1, pInt, pInt2);
            }
            if (!z17) {
                pInt.value = i17;
                pInt2.value = i17 + 4;
            }
        } else {
            z17 = false;
        }
        if (this.f71651y1 == 2) {
            d61.f fVar = this.f71652z1;
            if (fVar != null) {
                z17 = fVar.e(i17, pInt, pInt2);
                pInt2.value += 4;
            }
            if (!z17) {
                int i19 = i17 - 8;
                pInt.value = i19;
                if (i19 < 0) {
                    pInt.value = 0;
                }
                pInt2.value = pInt.value + this.F1 + 8;
            }
        }
        int i27 = this.f71651y1;
        if (i27 == 3 || i27 == 4) {
            pInt.value = this.E1;
            pInt2.value = this.A1 + 1;
        }
        int i28 = pInt2.value;
        int i29 = this.A1;
        if (i28 >= i29 + 1) {
            pInt2.value = i29 + 1;
        }
        int i37 = pInt2.value;
        int i38 = pInt.value;
        if (i37 < i38) {
            pInt2.value = i38 + 2;
            return false;
        }
        N();
        return true;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public boolean a0(int i17) {
        boolean z17;
        d61.f fVar;
        if (this.f71649x1 == 3) {
            return true;
        }
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        boolean z18 = false;
        try {
            com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt();
            if (i17 == 0 && this.f71652z1 != null && k0()) {
                pInt4.value = 0;
                pInt3.value = 0;
                z17 = this.f71652z1.e(i17 + 1, pInt3, pInt4);
            } else {
                z17 = false;
            }
            int i18 = i17 + 1;
            if (z17) {
                i18 = pInt4.value;
            }
            if (this.f71648x0 != null && (fVar = this.f71652z1) != null && fVar.b(i17, i18, pInt, pInt2) && (z18 = this.f71648x0.e(this.f71650y0, pInt.value, pInt2.value))) {
                this.E1 = i18;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryVideoView", "%s check video data error %s ", N(), e17.toString());
        }
        return z18;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void d() {
        super.d();
        this.O1 = null;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIPause", N());
        if (this.f189741g) {
            this.f189749r = getCurrPosSec();
            this.f189750s = isPlaying();
            this.G = 0;
            this.F = 0;
            pause();
            V();
            this.f189741g = false;
            H(600L, getReportIdkey() + 11, 1L, false);
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, t21.h0
    public void f(java.lang.String str, long j17, long j18) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f71650y0, str)) {
            N();
            if (this.D1 && this.f71651y1 == 3) {
                b0(getCurrPosSec());
            }
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void f0() {
        t21.n0 n0Var = this.J1;
        n0Var.f414840a = 4;
        n0Var.f414841b = 2;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIResume", N());
        if (this.f189741g) {
            return;
        }
        this.f189741g = true;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            if (this.f189750s) {
                play();
            } else {
                ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).E();
            }
        }
        H(600L, getReportIdkey() + 10, 1L, false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosMs() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        int currentPosition = f4Var != null ? f4Var.getCurrentPosition() : 0;
        int i17 = this.B1;
        return i17 > 0 ? i17 * 1000 : currentPosition;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosSec() {
        int round = this.f189748q != null ? java.lang.Math.round((r0.getCurrentPosition() * 1.0f) / 1000.0f) : 0;
        int i17 = this.B1;
        return i17 > 0 ? i17 : round;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public java.lang.String getSessionId() {
        return this.P1;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public boolean isPlaying() {
        boolean isPlaying = super.isPlaying();
        if (isPlaying) {
            int i17 = this.f71651y1;
        }
        N();
        return isPlaying;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public boolean j0(int i17, boolean z17) {
        int f17;
        d61.f fVar = this.f71652z1;
        if (fVar != null && i17 > (f17 = fVar.f()) && f17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoView", "%s seek to reset time ori[%d] last key frame[%d]", N(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f17));
            i17 = f17;
        }
        return super.j0(i17, z17);
    }

    public final boolean k0() {
        try {
            gm0.j1.i();
            return gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoView", e17, "check need reset error", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, t21.h0
    public void o(java.lang.String str, int i17) {
        com.tencent.mm.pluginsdk.ui.b1 b1Var;
        super.o(str, i17);
        if (i17 == 0 || (b1Var = this.f189751t) == null) {
            return;
        }
        b1Var.N(getSessionId(), getMediaId(), "download error", i17, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        super.onError(i17, i18);
        if (i18 == -3) {
            uu4.b.a(3);
            return;
        }
        if (i18 != -2) {
            if (i18 != -1) {
                return;
            }
            uu4.b.a(1);
            return;
        }
        try {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, java.lang.Boolean.TRUE);
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
            if (f4Var instanceof com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView) {
                ((com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView) f4Var).setNeedResetExtractor(true);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoView", e17, "%s onError [%s]", N(), e17.toString());
        }
        uu4.b.a(2);
    }

    public void setVideoInfo(r45.xn6 xn6Var) {
        h(false, xn6Var.f390256e, 0);
        this.f71650y0 = wm4.u.c(xn6Var.f390259h, xn6Var.f390271v);
        this.f71645l1 = this.O1.z4() + this.f71650y0 + ".mp4";
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void start() {
        super.start();
        uu4.a.a(5);
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void stop() {
        super.stop();
    }
}
