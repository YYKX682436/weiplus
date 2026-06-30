package g54;

/* loaded from: classes15.dex */
public final class o implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView f268942d;

    public o(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView) {
        this.f268942d = adThumbPlayerVideoView;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer player) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268942d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "onCompletion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        adThumbPlayerVideoView.u();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.o(adThumbPlayerVideoView, g54.h.f268932d);
        com.tencent.mm.pluginsdk.ui.tools.a4 b17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView).b();
        if (b17 != null) {
            b17.onCompletion();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268942d;
        com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "onError: type=" + i17 + ", code=" + i18 + ", " + j17 + ", " + j18);
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.o(adThumbPlayerVideoView, new g54.i(i18, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$release", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        adThumbPlayerVideoView.q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$release", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.pluginsdk.ui.tools.a4 b17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView).b();
        if (b17 != null) {
            b17.onError(i18, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268942d;
        if (i17 == 3) {
            com.tencent.mm.pluginsdk.ui.tools.b4 a17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView).a();
            if (a17 != null) {
                a17.k(3, 0);
            }
        } else if (i17 == 150) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "loop start");
            adThumbPlayerVideoView.getLoopStartCallback();
        } else if (i17 == 1006) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "download progress updated");
        } else if (i17 == 1014) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "player stopped");
        } else if (i17 == 105) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "first audio frame rendered");
        } else if (i17 == 106) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "first video frame rendered");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$tryNotifyFirstFrameRendered", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryNotifyFirstFrameRendered", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            g54.e eVar = adThumbPlayerVideoView.f163024q;
            eVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFirstFrameRendered", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
            com.tencent.mm.pluginsdk.ui.tools.e4 e4Var = eVar.f268928b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstFrameRendered", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
            if (e4Var != null) {
                com.tencent.mars.xlog.Log.i(adThumbPlayerVideoView.f163018h, "notify onTextureUpdate");
                e4Var.v();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFirstFrameRendered", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
                eVar.f268928b = null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFirstFrameRendered", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
            }
            if (!adThumbPlayerVideoView.f163026s) {
                adThumbPlayerVideoView.f163026s = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
                for (java.util.Iterator it = adThumbPlayerVideoView.G.iterator(); it.hasNext(); it = it) {
                    java.lang.Object next = it.next();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$tryNotifyFirstFrameRendered$2");
                    ok4.d report = (ok4.d) next;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$tryNotifyFirstFrameRendered$2");
                    kotlin.jvm.internal.o.g(report, "$this$report");
                    report.s();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$tryNotifyFirstFrameRendered$2");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$tryNotifyFirstFrameRendered$2");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            }
            adThumbPlayerVideoView.t();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryNotifyFirstFrameRendered", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$tryNotifyFirstFrameRendered", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        } else if (i17 == 200) {
            int i18 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.I;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSeekTime$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            long j19 = adThumbPlayerVideoView.f163027t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSeekTime$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j19;
            boolean z18 = currentTimeMillis <= 300;
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView);
            if (z18) {
                g54.j jVar = new g54.j(adThumbPlayerVideoView);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDelayBufferingAction$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
                adThumbPlayerVideoView.f163032y = jVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDelayBufferingAction$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
                adThumbPlayerVideoView.postDelayed(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.l(adThumbPlayerVideoView), 300 - currentTimeMillis);
            } else {
                com.tencent.mm.pluginsdk.ui.tools.b4 a18 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView).a();
                if (a18 != null) {
                    a18.k(701, 0);
                }
            }
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.o(adThumbPlayerVideoView, g54.k.f268936d);
        } else if (i17 != 201) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "unhandled event: what=" + i17 + ", (" + j17 + ", " + j18 + ')');
        } else {
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView);
            java.util.Objects.toString(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.l(adThumbPlayerVideoView));
            if (com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.l(adThumbPlayerVideoView) != null) {
                adThumbPlayerVideoView.removeCallbacks(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.l(adThumbPlayerVideoView));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDelayBufferingAction$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
                adThumbPlayerVideoView.f163032y = null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDelayBufferingAction$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            } else {
                com.tencent.mm.pluginsdk.ui.tools.b4 a19 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView).a();
                if (a19 != null) {
                    a19.k(702, 0);
                }
            }
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.o(adThumbPlayerVideoView, g54.l.f268937d);
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.o(adThumbPlayerVideoView, new g54.m(i17, j17, j18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268942d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "onPrepared");
        if (iTPPlayer != null) {
            int longValue = (int) java.lang.Long.valueOf(iTPPlayer.getPropertyLong(205)).longValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setFixRotation$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
            adThumbPlayerVideoView.C = longValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setFixRotation$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSurfaceListener$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSurfaceListener$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        g54.p pVar = adThumbPlayerVideoView.f163025r;
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSurface", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        android.view.Surface surface = pVar.f268944e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSurface", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$SurfaceListener");
        if (surface != null && iTPPlayer != null) {
            iTPPlayer.setSurface(surface, 1);
        }
        com.tencent.mm.pluginsdk.ui.tools.a4 b17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView).b();
        if (b17 != null) {
            b17.onPrepared();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268942d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "onSeekComplete: shouldPlay=" + com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.m(adThumbPlayerVideoView) + ", isPlaying=" + adThumbPlayerVideoView.isPlaying());
        if (com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.m(adThumbPlayerVideoView)) {
            adThumbPlayerVideoView.start();
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.o(adThumbPlayerVideoView, g54.n.f268941d);
        g54.e k17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView);
        k17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
        com.tencent.mm.pluginsdk.ui.tools.c4 c4Var = k17.f268931e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$Callbacks");
        if (c4Var != null) {
            c4Var.z(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.m(adThumbPlayerVideoView));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setShouldPlayAfterSeek$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        adThumbPlayerVideoView.f163021n = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setShouldPlayAfterSeek$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStateChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268942d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "preState=" + i17 + ", curState=" + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setState$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        adThumbPlayerVideoView.f163028u = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setState$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStateChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoSizeChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268942d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(adThumbPlayerVideoView), "onVideoSizeChanged: " + j17 + " x " + j18);
        int i17 = (int) j17;
        int i18 = (int) j18;
        adThumbPlayerVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mars.xlog.Log.i(adThumbPlayerVideoView.f163018h, "setVideoSize: videoWidth=" + adThumbPlayerVideoView.f163031x + ", videoHeight=" + adThumbPlayerVideoView.f163030w + ", width=" + i17 + ", height=" + i18);
        if (adThumbPlayerVideoView.f163031x != i17 || adThumbPlayerVideoView.f163030w != i18) {
            adThumbPlayerVideoView.f163031x = i17;
            adThumbPlayerVideoView.f163030w = i18;
            adThumbPlayerVideoView.s();
            adThumbPlayerVideoView.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.pluginsdk.ui.tools.a4 b17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView).b();
        if (b17 != null) {
            b17.T4(i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoSizeChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners");
    }
}
