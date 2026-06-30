package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class p implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f214864e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.xweb.j f214865f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f214863d = false;

    /* renamed from: g, reason: collision with root package name */
    public int f214866g = -1;

    public p(java.lang.String str, com.tencent.xweb.j jVar) {
        this.f214864e = str;
        this.f214865f = jVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.xwebutil.XWebAudioPlayerProgress b17;
        com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall;
        java.lang.Runnable runnable;
        try {
            com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "onCompletion");
            if (iTPPlayer.getPlayerType() == 1) {
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "onCompletion, is sys audio player, try stopAsync");
                iTPPlayer.stopAsync();
            }
            if (!com.tencent.mm.xwebutil.q.b(this.f214864e) || (b17 = com.tencent.mm.xwebutil.q.f214868a.b()) == null || (xWebAudioPlayerProgressBall = b17.f214813i) == null || (runnable = b17.f214816o) == null) {
                return;
            }
            xWebAudioPlayerProgressBall.postDelayed(runnable, 5L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onCompletion error: " + th6.getMessage());
            com.tencent.mm.xwebutil.q.d("onCompletion error ", th6);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onError, errorType = %d, errorCode = %d, arg1 = %d, arg2 = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (!com.tencent.mm.xwebutil.q.b(this.f214864e)) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onError, sCurrentParams invalid");
        } else {
            com.tencent.mm.xwebutil.r rVar = com.tencent.mm.xwebutil.q.f214868a;
            com.tencent.mm.xwebutil.q.c(rVar.f214874e, rVar.f214882m, i18, rVar.a(), this.f214865f);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "onInfo what = %d, arg1 = %d, arg2 = %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        try {
            com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "onPrepared");
            if (!com.tencent.mm.xwebutil.q.b(this.f214864e)) {
                com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onPrepared, sCurrentParams invalid");
                return;
            }
            com.tencent.mm.xwebutil.XWebAudioPlayerProgress b17 = com.tencent.mm.xwebutil.q.f214868a.b();
            if (b17 != null) {
                b17.setTotalTime(iTPPlayer.getDurationMs());
            }
            int i17 = this.f214866g;
            if (i17 > 0 && i17 <= iTPPlayer.getDurationMs()) {
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "onPrepared, seek to " + this.f214866g);
                iTPPlayer.seekTo(this.f214866g);
            }
            iTPPlayer.start();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onPrepared error: " + th6.getMessage());
            com.tencent.mm.xwebutil.q.d("onPrepared error ", th6);
            com.tencent.mm.xwebutil.r rVar = com.tencent.mm.xwebutil.q.f214868a;
            com.tencent.mm.xwebutil.q.c(rVar.f214874e, rVar.f214882m, -10, rVar.a(), this.f214865f);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        try {
            com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "onStateChange from %d to %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (!com.tencent.mm.xwebutil.q.b(this.f214864e)) {
                com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onStateChange, sCurrentParams invalid");
                return;
            }
            com.tencent.mm.ui.MMActivity a17 = com.tencent.mm.xwebutil.q.f214868a.a();
            if (a17 != null && !a17.isFinishing()) {
                com.tencent.mm.xwebutil.XWebAudioPlayerProgress b17 = com.tencent.mm.xwebutil.q.f214868a.b();
                if (b17 == null) {
                    com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onStateChange, progressBarInParams invalid");
                    return;
                }
                com.tencent.mm.xwebutil.r rVar = com.tencent.mm.xwebutil.q.f214868a;
                fp.e eVar = rVar.f214879j;
                if (eVar == null) {
                    com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onStateChange, audioFocusHelper invalid");
                    return;
                }
                java.lang.ref.WeakReference weakReference = rVar.f214871b;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = weakReference == null ? null : (com.tencent.mm.ui.widget.imageview.WeImageView) weakReference.get();
                if (weImageView == null) {
                    com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onStateChange, playBtn invalid");
                    return;
                }
                if (i18 != 5) {
                    eVar.a();
                    if (b17.f214815n != null) {
                        com.tencent.mars.xlog.Log.i("XFilesAudioPlayerProgress", "stopTimer");
                        b17.f214815n.cancel(false);
                        b17.f214815n = null;
                    }
                    android.graphics.drawable.Drawable drawable = a17.getDrawable(com.tencent.mm.R.raw.icons_filled_play);
                    com.tencent.mm.ui.uk.f(drawable, -1);
                    weImageView.setImageDrawable(drawable);
                    return;
                }
                eVar.b();
                if (b17.f214815n == null) {
                    com.tencent.mars.xlog.Log.i("XFilesAudioPlayerProgress", "startTimer");
                    b17.f214815n = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.xwebutil.t(b17), 5L, 250L);
                }
                android.graphics.drawable.Drawable drawable2 = a17.getDrawable(com.tencent.mm.R.raw.icons_filled_pause);
                com.tencent.mm.ui.uk.f(drawable2, -1);
                weImageView.setImageDrawable(drawable2);
                if (this.f214863d) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "onStateChange, first start state");
                this.f214863d = true;
                weImageView.postDelayed(new com.tencent.mm.xwebutil.o(this), 2000L);
                return;
            }
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onStateChange, activity invalid, try finishCurrentPlay");
            com.tencent.mm.xwebutil.r rVar2 = com.tencent.mm.xwebutil.q.f214868a;
            if (rVar2 == null) {
                return;
            }
            com.tencent.mm.xwebutil.q.a(rVar2.f214875f, rVar2.f214873d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onStateChange error: " + th6.getMessage());
            com.tencent.mm.xwebutil.q.d("onStateChange error ", th6);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener
    public void onStopAsyncComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.xwebutil.XWebAudioPlayerProgress b17;
        com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall;
        java.lang.Runnable runnable;
        try {
            com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "onStopAsyncComplete");
            if (!com.tencent.mm.xwebutil.q.b(this.f214864e) || (b17 = com.tencent.mm.xwebutil.q.f214868a.b()) == null || (xWebAudioPlayerProgressBall = b17.f214813i) == null || (runnable = b17.f214816o) == null) {
                return;
            }
            xWebAudioPlayerProgressBall.postDelayed(runnable, 5L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onStopAsyncComplete error: " + th6.getMessage());
            com.tencent.mm.xwebutil.q.d("onStopAsyncComplete error ", th6);
        }
    }
}
