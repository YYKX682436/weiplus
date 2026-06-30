package pk4;

/* loaded from: classes15.dex */
public final class g0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView f356484d;

    public g0(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
        this.f356484d = thumbPlayerSurfaceView;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer player) {
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356484d;
        com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "onCompletion");
        thumbPlayerSurfaceView.n();
        for (ok4.d report : thumbPlayerSurfaceView.E) {
            kotlin.jvm.internal.o.g(report, "$this$report");
            report.onCompleted();
        }
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = thumbPlayerSurfaceView.f174581m.f356534c;
        if (a4Var != null) {
            a4Var.onCompletion();
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356484d;
        com.tencent.mars.xlog.Log.e(thumbPlayerSurfaceView.f174575d, "onError: type=" + i17 + ", code=" + i18 + ", " + j17 + ", " + j18);
        thumbPlayerSurfaceView.k(new pk4.a0(i18, i17));
        thumbPlayerSurfaceView.j();
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = thumbPlayerSurfaceView.f174581m.f356534c;
        if (a4Var != null) {
            a4Var.onError(i18, i17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356484d;
        if (i17 == 3) {
            com.tencent.mm.pluginsdk.ui.tools.b4 b4Var = thumbPlayerSurfaceView.f174581m.f356532a;
            if (b4Var != null) {
                b4Var.k(3, 0);
            }
        } else if (i17 == 108) {
            thumbPlayerSurfaceView.post(new pk4.c0(thumbPlayerSurfaceView));
        } else if (i17 == 150) {
            com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "loop start");
            thumbPlayerSurfaceView.getLoopStartCallback();
        } else if (i17 == 1006) {
            com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "download progress updated");
        } else if (i17 == 1014) {
            com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "player stopped");
        } else if (i17 == 105) {
            com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "first audio frame rendered");
        } else if (i17 == 106) {
            com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "first video frame rendered");
            pk4.x xVar = thumbPlayerSurfaceView.f174581m;
            com.tencent.mm.pluginsdk.ui.tools.e4 e4Var = xVar.f356533b;
            if (e4Var != null) {
                com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "notify onTextureUpdate");
                e4Var.v();
                xVar.f356533b = null;
            }
            if (!thumbPlayerSurfaceView.f174583o) {
                thumbPlayerSurfaceView.f174583o = true;
                java.util.Iterator it = thumbPlayerSurfaceView.E.iterator();
                while (it.hasNext()) {
                    ok4.d report = (ok4.d) it.next();
                    kotlin.jvm.internal.o.g(report, "$this$report");
                    report.s();
                }
            }
            thumbPlayerSurfaceView.m();
            com.tencent.mm.pluginsdk.ui.tools.b4 b4Var2 = thumbPlayerSurfaceView.f174581m.f356532a;
            if (b4Var2 != null) {
                b4Var2.k(i17, 0);
            }
        } else if (i17 == 200) {
            long j19 = thumbPlayerSurfaceView.f174584p;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j19;
            boolean z18 = currentTimeMillis <= 300;
            java.lang.String str = thumbPlayerSurfaceView.f174575d;
            if (z18) {
                pk4.b0 b0Var = new pk4.b0(thumbPlayerSurfaceView);
                thumbPlayerSurfaceView.f174592x = b0Var;
                thumbPlayerSurfaceView.postDelayed(b0Var, 300 - currentTimeMillis);
            } else {
                com.tencent.mm.pluginsdk.ui.tools.b4 b4Var3 = thumbPlayerSurfaceView.f174581m.f356532a;
                if (b4Var3 != null) {
                    b4Var3.k(701, 0);
                }
            }
            for (ok4.d report2 : thumbPlayerSurfaceView.E) {
                kotlin.jvm.internal.o.g(report2, "$this$report");
                report2.e();
            }
        } else if (i17 != 201) {
            com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "unhandled event: what=" + i17 + ", (" + j17 + ", " + j18 + ')');
        } else {
            java.lang.String str2 = thumbPlayerSurfaceView.f174575d;
            java.util.Objects.toString(thumbPlayerSurfaceView.f174592x);
            java.lang.Runnable runnable = thumbPlayerSurfaceView.f174592x;
            if (runnable != null) {
                thumbPlayerSurfaceView.removeCallbacks(runnable);
                thumbPlayerSurfaceView.f174592x = null;
            } else {
                com.tencent.mm.pluginsdk.ui.tools.b4 b4Var4 = thumbPlayerSurfaceView.f174581m.f356532a;
                if (b4Var4 != null) {
                    b4Var4.k(702, 0);
                }
            }
            for (ok4.d report3 : thumbPlayerSurfaceView.E) {
                kotlin.jvm.internal.o.g(report3, "$this$report");
                report3.h();
            }
        }
        pk4.d0 d0Var = new pk4.d0(i17, j17, j18);
        int i18 = com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView.G;
        thumbPlayerSurfaceView.k(d0Var);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356484d;
        com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "onPrepared");
        mk4.h hVar = thumbPlayerSurfaceView.f174585q;
        hVar.getClass();
        java.lang.String logTag = thumbPlayerSurfaceView.f174575d;
        kotlin.jvm.internal.o.g(logTag, "logTag");
        hVar.f327159f = true;
        hVar.f327155b = logTag.concat(".MMSurfaceViewSwitchHelper");
        if (iTPPlayer != null) {
            java.lang.Long.valueOf(iTPPlayer.getPropertyLong(205)).longValue();
        }
        android.view.Surface surface = thumbPlayerSurfaceView.f174582n.f356488e;
        if (surface != null && iTPPlayer != null) {
            iTPPlayer.setSurface(surface, 2);
        }
        hVar.e(thumbPlayerSurfaceView.f174586r);
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = thumbPlayerSurfaceView.f174581m.f356534c;
        if (a4Var != null) {
            a4Var.onPrepared();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new pk4.f0(iTPPlayer, thumbPlayerSurfaceView, null), 3, null);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356484d;
        com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "onSeekComplete: shouldPlay=" + thumbPlayerSurfaceView.f174578g + ", isPlaying=" + thumbPlayerSurfaceView.isPlaying());
        if (thumbPlayerSurfaceView.f174578g) {
            thumbPlayerSurfaceView.start();
        }
        for (ok4.d report : thumbPlayerSurfaceView.E) {
            kotlin.jvm.internal.o.g(report, "$this$report");
            report.q();
        }
        com.tencent.mm.pluginsdk.ui.tools.c4 c4Var = thumbPlayerSurfaceView.f174581m.f356535d;
        if (c4Var != null) {
            c4Var.z(thumbPlayerSurfaceView.f174578g);
        }
        thumbPlayerSurfaceView.f174578g = false;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356484d;
        com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "preState=" + i17 + ", curState=" + i18);
        thumbPlayerSurfaceView.f174588t = i18;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f356484d;
        com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "onVideoSizeChanged: " + j17 + " x " + j18);
        int i17 = (int) j17;
        int i18 = (int) j18;
        com.tencent.mars.xlog.Log.i(thumbPlayerSurfaceView.f174575d, "setVideoSize: videoWidth=" + thumbPlayerSurfaceView.f174591w + ", videoHeight=" + thumbPlayerSurfaceView.f174590v + ", width=" + i17 + ", height=" + i18);
        if (thumbPlayerSurfaceView.f174591w != i17 || thumbPlayerSurfaceView.f174590v != i18) {
            thumbPlayerSurfaceView.f174591w = i17;
            thumbPlayerSurfaceView.f174590v = i18;
            thumbPlayerSurfaceView.l();
            thumbPlayerSurfaceView.f174586r.a(thumbPlayerSurfaceView.f174591w, thumbPlayerSurfaceView.f174590v);
        }
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = thumbPlayerSurfaceView.f174581m.f356534c;
        if (a4Var != null) {
            a4Var.T4(i17, i18);
        }
    }
}
