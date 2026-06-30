package com.tencent.mm.plugin.story.ui.view.gallery;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView;", "Lcom/tencent/mm/modelvideo/MMVideoView;", "", "getSessionId", "", "mute", "Ljz5/f0;", "setMute", "show", "setNeedShowLoading", "", "getStayTime", "getErrorCode", "getFilePath", "Lcom/tencent/mm/pluginsdk/ui/e1;", "scaleType", "setScaleType", "", "Y1", "J", "getFirstPlayWaitTime", "()J", "setFirstPlayWaitTime", "(J)V", "firstPlayWaitTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryVideoView extends com.tencent.mm.modelvideo.MMVideoView {

    /* renamed from: a2, reason: collision with root package name */
    public static final /* synthetic */ int f172110a2 = 0;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public java.lang.String S1;
    public boolean T1;
    public android.widget.RelativeLayout U1;
    public android.widget.ImageView V1;
    public if4.h W1;
    public long X1;

    /* renamed from: Y1, reason: from kotlin metadata */
    public long firstPlayWaitTime;
    public android.widget.TextView Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setRootPath(com.tencent.mm.vfs.w6.i(ef4.w.f252468t.b(), true));
        this.f189756y.post(new com.tencent.mm.pluginsdk.ui.a(this));
        setIsShowBasicControls(false);
        this.f189745n.setVisibility(8);
        this.f189739e = "MicroMsg.StoryVideoView";
        this.P1 = true;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public com.tencent.mm.pluginsdk.ui.tools.f4 C(android.content.Context context) {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView storyVideoPlayTextureView = new com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView(context);
        storyVideoPlayTextureView.setOpenWithNoneSurface(true);
        storyVideoPlayTextureView.setNeedResetExtractor(k0());
        storyVideoPlayTextureView.setIsOnlineVideoType(true);
        return storyVideoPlayTextureView;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void I() {
        super.I();
        this.U1 = new android.widget.RelativeLayout(getContext());
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.V1 = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.widget.ImageView imageView2 = this.V1;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout = this.f189743i;
        android.widget.RelativeLayout relativeLayout2 = this.U1;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.o.o("fakeLayer");
            throw null;
        }
        relativeLayout.addView(relativeLayout2, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f189743i.addView(this.V1, 0);
        this.Z1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p0r);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void T() {
        if (this.P1) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f189756y;
            if (n3Var.hasMessages(1) || this.M) {
                return;
            }
            n3Var.sendEmptyMessageDelayed(1, 800L);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
        super.T4(i17, i18);
        com.tencent.mars.xlog.Log.i(this.f189739e, "onGetVideoSize, mediaId:" + getMediaId() + ", isLocalVideo:" + this.Q1 + ", isPrepareVideo:" + this.G1 + ", isPrepared:" + this.E + ", playerStatus:" + this.f71651y1 + ", downloadStatus:" + this.f71649x1);
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void U(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c(this.f189739e, N() + " startTimer, isLocalVideo:" + this.Q1, new java.lang.Object[0]);
        if (this.Q1) {
            return;
        }
        super.U(z17);
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void V() {
        com.tencent.mm.sdk.platformtools.Log.c(this.f189739e, N() + " stopTimer, isLocalVideo:" + this.Q1, new java.lang.Object[0]);
        super.V();
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public boolean Z(int i17, com.tencent.mm.pointers.PInt start, com.tencent.mm.pointers.PInt end) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(end, "end");
        start.value = java.lang.Math.max(i17, this.E1);
        int i18 = this.f71651y1;
        if (i18 == 1) {
            start.value = i17;
            end.value = this.F1 + i17;
            str = "step1;";
        } else {
            str = "";
        }
        if (i18 == 2) {
            int i19 = i17 - 8;
            start.value = i19;
            if (i19 < 0) {
                start.value = 0;
            }
            end.value = start.value + this.F1 + 8;
            str = str + "step2;";
        }
        int i27 = this.f71651y1;
        if (i27 == 3) {
            start.value = this.E1;
            end.value = i17 + 1 + this.J1.f414841b;
            str = str + "step3;";
        } else if (i27 == 4) {
            start.value = this.E1;
            end.value = this.F1 + i17 + 1 + this.J1.f414841b;
            str = str + "step4;";
        }
        int i28 = end.value;
        int i29 = this.A1;
        if (i28 >= i29 + 1) {
            end.value = i29 + 1;
            str = str + "step5;";
        }
        java.lang.String str2 = str;
        int i37 = end.value;
        int i38 = start.value;
        if (i37 < i38) {
            end.value = i38 + this.J1.f414841b;
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s] %s", N(), java.lang.Integer.valueOf(start.value), java.lang.Integer.valueOf(end.value), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f71651y1), java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this.f71650y0, str2);
        return true;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public boolean a0(int i17) {
        boolean a07 = super.a0(i17);
        com.tencent.mars.xlog.Log.i(this.f189739e, "checkCanPlay, cachePlayTime:" + this.E1 + ", ret:" + a07);
        return a07;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void d() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "onUIDestroy, isLocalVideo:" + this.Q1);
        super.d();
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "onUIPause, isLocalVideo:" + this.Q1);
        if (!this.Q1) {
            super.e();
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            f4Var.pause();
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, t21.h0
    public void f(java.lang.String str, long j17, long j18) {
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f71650y0, str)) {
            getCurrPosMs();
            this.f189748q.isPlaying();
            N();
            if ((getCurrPosMs() <= 0 || (i17 = this.f71651y1) == 1 || i17 == 0) && b0(getCurrPosSec())) {
                U(true);
            }
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "onUIResume, isLocalVideo:" + this.Q1);
        if (this.Q1) {
            return;
        }
        super.g();
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void g0() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "prepareVideo, surfaceAvailable:" + this.R1);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            kotlin.jvm.internal.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView");
            ((com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView) f4Var).setNeedResetExtractor(k0());
        }
        java.lang.String filepath = this.f71645l1;
        kotlin.jvm.internal.o.f(filepath, "filepath");
        o0(filepath);
        super.g0();
    }

    public final int getErrorCode() {
        return this.R.f190804k;
    }

    public final java.lang.String getFilePath() {
        java.lang.String filepath = this.f71645l1;
        kotlin.jvm.internal.o.f(filepath, "filepath");
        return filepath;
    }

    public final long getFirstPlayWaitTime() {
        return this.firstPlayWaitTime;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public java.lang.String getSessionId() {
        java.lang.String str = this.S1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    public final int getStayTime() {
        long j17 = this.X1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return (int) (android.os.SystemClock.elapsedRealtime() - j17);
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        super.h(z17, str, i17);
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void i0() {
        super.i0();
        this.R1 = false;
        this.S1 = null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public boolean j() {
        if (this.Q1) {
            return false;
        }
        return super.j();
    }

    public final boolean k0() {
        if (this.Q1) {
            return false;
        }
        try {
            return gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f189739e, e17, "check need reset error", new java.lang.Object[0]);
            return false;
        }
    }

    public final void l0(if4.h item, java.lang.String str) {
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = this.Z1;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.W1 = item;
        r45.xe6 xe6Var = item.f291258f;
        android.widget.RelativeLayout relativeLayout = this.U1;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("fakeLayer");
            throw null;
        }
        relativeLayout.setVisibility(8);
        android.widget.ImageView imageView = this.V1;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (!(item.f291257e != if4.i.f291260d)) {
            com.tencent.mars.xlog.Log.i(this.f189739e, "play empty item");
            T();
            return;
        }
        if (item.a()) {
            com.tencent.mars.xlog.Log.i(this.f189739e, "LogStory: play fake video");
        } else {
            com.tencent.mars.xlog.Log.i(this.f189739e, "LogStory: play normal video");
            ef4.k0 k0Var = ef4.k0.f252459a;
            java.lang.String d17 = k0Var.d(xe6Var);
            if (com.tencent.mm.vfs.w6.k(d17) > 0) {
                com.tencent.mars.xlog.Log.i(this.f189739e, "play " + d17 + " downloadDone now can play " + xe6Var.f390021d);
                this.f71645l1 = d17;
                if (d17 != null) {
                    m0(d17);
                }
            } else {
                nf4.o b17 = k0Var.b(item);
                int k17 = (int) com.tencent.mm.vfs.w6.k(b17.field_filePath);
                com.tencent.mars.xlog.Log.i(this.f189739e, "play " + d17 + " error try play from url or videoCache " + xe6Var.f390021d + " fileLength:" + k17 + " cacheSize:" + b17.field_cacheSize);
                if (k17 < b17.field_cacheSize) {
                    b17.field_cacheSize = k17;
                    ef4.w.f252468t.k().D0(b17);
                }
                com.tencent.mars.xlog.Log.i(this.f189739e, java.lang.String.valueOf(b17));
                boolean t07 = b17.t0();
                int i17 = item.f291255c;
                if (t07 && com.tencent.mm.vfs.w6.j(b17.field_filePath)) {
                    com.tencent.mars.xlog.Log.i(this.f189739e, "play " + xe6Var.f390021d + " download finish");
                    this.f71645l1 = b17.field_filePath;
                    this.f71650y0 = k0Var.a(i17, xe6Var.f390023f);
                    java.lang.String filepath = this.f71645l1;
                    kotlin.jvm.internal.o.f(filepath, "filepath");
                    m0(filepath);
                } else {
                    if (b17.t0() && !com.tencent.mm.vfs.w6.j(b17.field_filePath)) {
                        com.tencent.mars.xlog.Log.i(this.f189739e, "error downloadFinish " + b17.t0() + " ret:" + com.tencent.mm.vfs.w6.j(b17.field_filePath));
                        b17.field_cacheSize = 0;
                        b17.field_totalSize = 0;
                        ef4.w.f252468t.k().D0(b17);
                    }
                    com.tencent.mars.xlog.Log.i(this.f189739e, "play " + xe6Var.f390021d + ' ' + str + " start online play " + b17.field_filePath);
                    i0();
                    this.f189748q.stop();
                    this.f189748q.setVideoCallback(this);
                    this.Q1 = false;
                    this.A = true;
                    setNeedShowLoading(true);
                    super.h(false, item.f291258f.f390023f, (int) xe6Var.f390040z);
                    this.f71645l1 = b17.field_filePath;
                    this.f71650y0 = k0Var.a(i17, xe6Var.f390023f);
                    this.S1 = str;
                    this.X1 = android.os.SystemClock.elapsedRealtime();
                    this.firstPlayWaitTime = 0L;
                    start();
                }
            }
        }
        setLoop(true);
        java.lang.Object obj = this.f189748q;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void m0(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i(this.f189739e, "playLocalVideo: " + str + ", isPlayingNow:" + this.f189748q.isPlaying());
        if (this.f189748q == null) {
            this.f189748q = C(getContext());
        }
        i0();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            f4Var.stop();
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var2 = this.f189748q;
        if (f4Var2 != null) {
            f4Var2.setMute(this.O1);
        }
        this.S = false;
        this.Q1 = true;
        setDownloadStatus(3);
        setNeedShowLoading(false);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var3 = this.f189748q;
        kotlin.jvm.internal.o.e(f4Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView");
        ((com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView) f4Var3).setNeedResetExtractor(k0());
        this.f189748q.setVideoPath(str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.X1 = android.os.SystemClock.elapsedRealtime();
        this.firstPlayWaitTime = 0L;
        if4.h hVar = this.W1;
        if (hVar == null || (str2 = hVar.f291256d) == null) {
            str2 = "";
        }
        nf4.g g17 = ef4.w.f252468t.g();
        nf4.f L0 = g17.L0(str2);
        boolean t07 = L0.t0();
        long j17 = L0.field_readId;
        long j18 = L0.field_syncId;
        if (j17 != j18) {
            L0.field_readId = j18;
            L0.field_readTime = c01.id.c();
            boolean b17 = g17.b1(L0);
            boolean t08 = L0.t0();
            if (b17 && t07 && !t08) {
                g17.doNotify("notify_story_read", 1, L0);
            }
        }
        this.f189748q.setVideoCallback(new sf4.x1(this));
        this.T1 = false;
        this.S1 = null;
        o0(str);
    }

    public final void n0() {
        com.tencent.mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct();
        if4.h hVar = this.W1;
        wCStoryVideoPlayReportStruct.f62134d = wCStoryVideoPlayReportStruct.b("StoryId", java.lang.String.valueOf(hVar != null ? java.lang.Long.valueOf(hVar.f291254b) : null), true);
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct = mf4.d.f326163d;
        wCStoryVideoPlayReportStruct.f62135e = storyPreviewReportStruct.f60919e;
        wCStoryVideoPlayReportStruct.f62137g = storyPreviewReportStruct.f60928n == 1 ? 1L : 0L;
        wCStoryVideoPlayReportStruct.f62140j = this.firstPlayWaitTime;
        wCStoryVideoPlayReportStruct.f62145o = getStayTime();
        wCStoryVideoPlayReportStruct.f62146p = getErrorCode();
        wCStoryVideoPlayReportStruct.Q = 1L;
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct2 = mf4.d.f326163d;
        wCStoryVideoPlayReportStruct.R = storyPreviewReportStruct2.f60918d;
        wCStoryVideoPlayReportStruct.S = storyPreviewReportStruct2.f60924j;
        wCStoryVideoPlayReportStruct.f62139i = getCurrPosMs();
        java.lang.System.currentTimeMillis();
        if (java.lang.System.currentTimeMillis() - wCStoryVideoPlayReportStruct.S < 500) {
            return;
        }
        if4.h hVar2 = this.W1;
        try {
            ef4.w.f252468t.l().post(new sf4.y1(this, wCStoryVideoPlayReportStruct, hVar2 != null ? hVar2.f291254b : 0L));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f189739e, e17, "reportStopLocalVideo", new java.lang.Object[0]);
            wCStoryVideoPlayReportStruct.k();
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, t21.h0
    public void o(java.lang.String str, int i17) {
        super.o(str, i17);
    }

    public final void o0(java.lang.String str) {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        if (((java.lang.Integer) m17).intValue() == 1) {
            android.widget.TextView textView = this.Z1;
            if (textView != null) {
                ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
                textView.setText(com.tencent.mm.plugin.sight.base.e.e(str));
            }
            android.widget.TextView textView2 = this.Z1;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "onCompletion, currPosMs:" + getCurrPosMs() + ", playStatus:" + this.f71651y1 + ", downloadStatus:" + this.f71649x1);
        if (getCurrPosMs() <= 0) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f189751t;
        if (b1Var != null) {
            b1Var.E(getSessionId(), getMediaId());
        }
        super.onCompletion();
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.d4
    public void onSurfaceAvailable() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "onSurfaceAvailable");
        this.R1 = true;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public boolean pause() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "pause, isLocalVideo:" + this.Q1);
        if (!this.Q1) {
            return super.pause();
        }
        this.T1 = true;
        this.f189748q.pause();
        return true;
    }

    public final void setFirstPlayWaitTime(long j17) {
        this.firstPlayWaitTime = j17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void setMute(boolean z17) {
        super.setMute(z17);
        this.O1 = z17;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            f4Var.setMute(z17);
        }
    }

    public final void setNeedShowLoading(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f189739e, hashCode() + " setNeedShowLoading: " + z17);
        this.P1 = z17;
        if (z17) {
            return;
        }
        D();
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        super.setScaleType(e1Var);
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void start() {
        if (this.C > 0 && !this.Q1) {
            com.tencent.mars.xlog.Log.i(this.f189739e, "start from onError and not local video");
            if4.h hVar = this.W1;
            if (hVar != null) {
                nf4.o b17 = ef4.k0.f252459a.b(hVar);
                if (b17.t0()) {
                    com.tencent.mars.xlog.Log.i(this.f189739e, "start from onError and download finish now");
                    java.lang.String field_filePath = b17.field_filePath;
                    kotlin.jvm.internal.o.f(field_filePath, "field_filePath");
                    m0(field_filePath);
                    return;
                }
            }
        }
        java.lang.String filepath = this.f71645l1;
        kotlin.jvm.internal.o.f(filepath, "filepath");
        o0(filepath);
        super.start();
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void stop() {
        try {
            if (this.Q1) {
                n0();
                this.f189748q.stop();
                i0();
            } else {
                super.stop();
            }
            android.widget.ImageView imageView = this.V1;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f189739e, e17, "stop error", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.e4
    public void v() {
        super.v();
        java.lang.Object obj = this.f189748q;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", "onTextureUpdate", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", "onTextureUpdate", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (this.firstPlayWaitTime <= 0) {
            long j17 = this.X1;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.firstPlayWaitTime = android.os.SystemClock.elapsedRealtime() - j17;
            java.lang.String str = this.f189739e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTextureUpdate firstPlayWaitTime ");
            sb6.append(this.firstPlayWaitTime);
            sb6.append(" storyId: ");
            if4.h hVar = this.W1;
            sb6.append(hVar != null ? java.lang.Long.valueOf(hVar.f291254b) : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.c4
    public void z(boolean z17) {
        if (this.Q1) {
            return;
        }
        super.z(z17);
    }
}
