package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaPlayer f162437d;

    /* renamed from: e, reason: collision with root package name */
    public int f162438e;

    /* renamed from: f, reason: collision with root package name */
    public double f162439f = -1.0d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.s f162440g;

    public p(com.tencent.mm.plugin.sight.decode.model.s sVar, com.tencent.mm.plugin.sight.decode.model.b bVar) {
        this.f162440g = sVar;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "stopPlayer");
        try {
            android.media.MediaPlayer mediaPlayer = this.f162437d;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.f162437d.release();
                this.f162437d = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e17, "stop play sound error: %s", e17.getMessage());
            this.f162437d = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i17 = this.f162438e;
        objArr[0] = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "seek" : "resume" : "pause" : "start" : "stop";
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "do play sound, operation %s", objArr);
        int i18 = this.f162438e;
        if (i18 == 0) {
            a();
            return;
        }
        if (i18 == 1) {
            a();
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f162440g.f162447c)) {
                return;
            }
            try {
                to.g gVar = new to.g();
                this.f162437d = gVar;
                gVar.setDisplay(null);
                this.f162437d.reset();
                this.f162437d.setDataSource(com.tencent.mm.vfs.w6.i(this.f162440g.f162447c, false));
                this.f162437d.setAudioStreamType(3);
                this.f162437d.setOnErrorListener(new com.tencent.mm.plugin.sight.decode.model.o(this));
                this.f162437d.prepare();
                this.f162437d.start();
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e17, "play sound error: %s", e17.getMessage());
                com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", this.f162440g.f162447c);
                this.f162440g.c();
                if (this.f162440g.F != null) {
                    this.f162440g.F.a(this.f162440g, -1);
                    return;
                }
                return;
            }
        }
        if (i18 == 2) {
            try {
                android.media.MediaPlayer mediaPlayer = this.f162437d;
                if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                    return;
                }
                this.f162437d.pause();
                return;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e18, "pause sound error: %s", e18.getMessage());
                a();
                return;
            }
        }
        if (i18 != 3) {
            if (i18 != 4) {
                return;
            }
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "soundplayer seek %f", java.lang.Double.valueOf(this.f162439f));
                this.f162437d.seekTo((int) (this.f162439f * 1000.0d));
                return;
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e19, "seek sound error: %s", e19.getMessage());
                return;
            }
        }
        try {
            android.media.MediaPlayer mediaPlayer2 = this.f162437d;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e27, "pause sound error: %s", e27.getMessage());
            a();
        }
    }
}
