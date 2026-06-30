package pk4;

/* loaded from: classes15.dex */
public final class a1 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView f356462d;

    public a1(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView) {
        this.f356462d = thumbPlayerVideoView;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer player) {
        kotlin.jvm.internal.o.g(player, "player");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356462d;
        com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "onCompletion");
        thumbPlayerVideoView.q();
        for (ok4.d report : thumbPlayerVideoView.f174595J) {
            kotlin.jvm.internal.o.g(report, "$this$report");
            report.onCompleted();
        }
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = thumbPlayerVideoView.f174602q.f356527d;
        if (a4Var != null) {
            a4Var.onCompletion();
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356462d;
        com.tencent.mars.xlog.Log.e(thumbPlayerVideoView.f174596h, "onError: type=" + i17 + ", code=" + i18 + ", " + j17 + ", " + j18);
        thumbPlayerVideoView.n(new pk4.v0(i18, i17));
        thumbPlayerVideoView.m();
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = thumbPlayerVideoView.f174602q.f356527d;
        if (a4Var != null) {
            a4Var.onError(i18, i17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356462d;
        if (i17 == 3) {
            com.tencent.mm.pluginsdk.ui.tools.b4 b4Var = thumbPlayerVideoView.f174602q.f356524a;
            if (b4Var != null) {
                b4Var.k(3, 0);
            }
        } else if (i17 == 150) {
            com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "loop start");
            pk4.t0 loopStartCallback = thumbPlayerVideoView.getLoopStartCallback();
            if (loopStartCallback != null) {
                loopStartCallback.a();
            }
        } else if (i17 == 1006) {
            com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "download progress updated");
        } else if (i17 == 1014) {
            com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "player stopped");
        } else if (i17 == 105) {
            com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "first audio frame rendered");
        } else if (i17 == 106) {
            com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "first video frame rendered");
            pk4.s0 s0Var = thumbPlayerVideoView.f174602q;
            com.tencent.mm.pluginsdk.ui.tools.e4 e4Var = s0Var.f356525b;
            if (e4Var != null) {
                com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "notify onTextureUpdate");
                e4Var.v();
                s0Var.f356525b = null;
            }
            if (!thumbPlayerVideoView.f174604s) {
                thumbPlayerVideoView.f174604s = true;
                java.util.Iterator it = thumbPlayerVideoView.f174595J.iterator();
                while (it.hasNext()) {
                    ok4.d report = (ok4.d) it.next();
                    kotlin.jvm.internal.o.g(report, "$this$report");
                    report.s();
                }
            }
            thumbPlayerVideoView.p();
            com.tencent.mm.pluginsdk.ui.tools.b4 b4Var2 = thumbPlayerVideoView.f174602q.f356524a;
            if (b4Var2 != null) {
                b4Var2.k(i17, 0);
            }
        } else if (i17 == 200) {
            long j19 = thumbPlayerVideoView.f174605t;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j19;
            boolean z18 = currentTimeMillis <= 300;
            java.lang.String str = thumbPlayerVideoView.f174596h;
            if (z18) {
                pk4.w0 w0Var = new pk4.w0(thumbPlayerVideoView);
                thumbPlayerVideoView.f174610y = w0Var;
                thumbPlayerVideoView.postDelayed(w0Var, 300 - currentTimeMillis);
            } else {
                com.tencent.mm.pluginsdk.ui.tools.b4 b4Var3 = thumbPlayerVideoView.f174602q.f356524a;
                if (b4Var3 != null) {
                    b4Var3.k(701, 0);
                }
            }
            for (ok4.d report2 : thumbPlayerVideoView.f174595J) {
                kotlin.jvm.internal.o.g(report2, "$this$report");
                report2.e();
            }
        } else if (i17 != 201) {
            com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "unhandled event: what=" + i17 + ", (" + j17 + ", " + j18 + ')');
        } else {
            java.lang.String str2 = thumbPlayerVideoView.f174596h;
            java.util.Objects.toString(thumbPlayerVideoView.f174610y);
            java.lang.Runnable runnable = thumbPlayerVideoView.f174610y;
            if (runnable != null) {
                thumbPlayerVideoView.removeCallbacks(runnable);
                thumbPlayerVideoView.f174610y = null;
            } else {
                com.tencent.mm.pluginsdk.ui.tools.b4 b4Var4 = thumbPlayerVideoView.f174602q.f356524a;
                if (b4Var4 != null) {
                    b4Var4.k(702, 0);
                }
            }
            for (ok4.d report3 : thumbPlayerVideoView.f174595J) {
                kotlin.jvm.internal.o.g(report3, "$this$report");
                report3.h();
            }
        }
        pk4.x0 x0Var = new pk4.x0(i17, j17, j18);
        int i18 = com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView.M;
        thumbPlayerVideoView.n(x0Var);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356462d;
        com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "onPrepared");
        if (iTPPlayer != null) {
            thumbPlayerVideoView.C = (int) java.lang.Long.valueOf(iTPPlayer.getPropertyLong(205)).longValue();
        }
        android.view.Surface surface = thumbPlayerVideoView.f174603r.f356465e;
        if (surface != null && iTPPlayer != null) {
            iTPPlayer.setSurface(surface, 1);
        }
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = thumbPlayerVideoView.f174602q.f356527d;
        if (a4Var != null) {
            a4Var.onPrepared();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new pk4.z0(thumbPlayerVideoView, iTPPlayer, null), 3, null);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356462d;
        com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "onSeekComplete: shouldPlay=" + thumbPlayerVideoView.f174599n + ", isPlaying=" + thumbPlayerVideoView.isPlaying());
        if (thumbPlayerVideoView.f174599n) {
            thumbPlayerVideoView.start();
        }
        for (ok4.d report : thumbPlayerVideoView.f174595J) {
            kotlin.jvm.internal.o.g(report, "$this$report");
            report.q();
        }
        com.tencent.mm.pluginsdk.ui.tools.c4 c4Var = thumbPlayerVideoView.f174602q.f356528e;
        if (c4Var != null) {
            c4Var.z(thumbPlayerVideoView.f174599n);
        }
        thumbPlayerVideoView.f174599n = false;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356462d;
        com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "preState=" + i17 + ", curState=" + i18);
        thumbPlayerVideoView.f174606u = i18;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356462d;
        com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "onVideoSizeChanged: " + j17 + " x " + j18);
        int i17 = (int) j17;
        int i18 = (int) j18;
        com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "setVideoSize: videoWidth=" + thumbPlayerVideoView.f174609x + ", videoHeight=" + thumbPlayerVideoView.f174608w + ", width=" + i17 + ", height=" + i18);
        if (thumbPlayerVideoView.f174609x != i17 || thumbPlayerVideoView.f174608w != i18) {
            thumbPlayerVideoView.f174609x = i17;
            thumbPlayerVideoView.f174608w = i18;
            thumbPlayerVideoView.o();
            thumbPlayerVideoView.requestLayout();
        }
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = thumbPlayerVideoView.f174602q.f356527d;
        if (a4Var != null) {
            a4Var.T4(i17, i18);
        }
    }
}
