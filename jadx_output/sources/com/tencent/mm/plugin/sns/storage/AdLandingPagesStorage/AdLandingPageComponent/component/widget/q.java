package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaPlayer f165661d;

    /* renamed from: e, reason: collision with root package name */
    public int f165662e;

    /* renamed from: f, reason: collision with root package name */
    public double f165663f = -1.0d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.u f165664g;

    public q(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.u uVar, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.d dVar) {
        this.f165664g = uVar;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "stopPlayer");
        try {
            android.media.MediaPlayer mediaPlayer = this.f165661d;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.f165661d.release();
                this.f165661d = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e17, "stop play sound error: %s", e17.getMessage());
            this.f165661d = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i17 = this.f165662e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            str = "stop";
        } else if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            str = "start";
        } else if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            str = "pause";
        } else if (i17 == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            str = "resume";
        } else if (i17 != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            str = "seek";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "do play sound, operation %s", objArr);
        int i18 = this.f165662e;
        if (i18 == 0) {
            a();
        } else if (i18 == 1) {
            a();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.u uVar = this.f165664g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.u.j(uVar))) {
                try {
                    to.g gVar = new to.g();
                    this.f165661d = gVar;
                    gVar.setDisplay(null);
                    this.f165661d.reset();
                    this.f165661d.setDataSource(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.u.j(uVar));
                    this.f165661d.setAudioStreamType(3);
                    this.f165661d.setOnErrorListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.p(this));
                    this.f165661d.prepare();
                    this.f165661d.start();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e17, "play sound error: %s", e17.getMessage());
                    com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.u.j(uVar));
                    uVar.s();
                    if (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.u.o(uVar) != null) {
                        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.x) com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.u.o(uVar)).a(uVar, -1);
                    }
                }
            }
        } else if (i18 == 2) {
            try {
                android.media.MediaPlayer mediaPlayer = this.f165661d;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    this.f165661d.pause();
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e18, "pause sound error: %s", e18.getMessage());
                a();
            }
        } else if (i18 == 3) {
            try {
                android.media.MediaPlayer mediaPlayer2 = this.f165661d;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e19, "pause sound error: %s", e19.getMessage());
                a();
            }
        } else if (i18 == 4) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "soundplayer seek %f", java.lang.Double.valueOf(this.f165663f));
                this.f165661d.seekTo((int) (this.f165663f * 1000.0d));
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e27, "seek sound error: %s", e27.getMessage());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
    }
}
