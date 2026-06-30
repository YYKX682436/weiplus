package com.tencent.mm.plugin.sns.ui.video;

/* loaded from: classes15.dex */
public class SnsVideoPlayTextureView extends com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView {
    public final java.lang.Object K;

    public SnsVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = new java.lang.Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #0 {Exception -> 0x0096, blocks: (B:3:0x0032, B:5:0x0040, B:8:0x0045, B:10:0x0051, B:12:0x0055, B:13:0x0085, B:14:0x008b, B:16:0x0092, B:21:0x005b, B:22:0x006c, B:24:0x0070, B:25:0x007b, B:26:0x0088), top: B:2:0x0032 }] */
    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(android.graphics.SurfaceTexture r6, int r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "handleOnSurfaceTextureAvailable"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r5.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r4 = r5.D
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r2, r3, r7, r8, r4}
            java.lang.String r8 = "MicroMsg.Sns.SnsVideoPlayTextureView"
            java.lang.String r2 = "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            com.tencent.mars.xlog.Log.i(r8, r2, r7)
            r7 = 0
            r5.C()     // Catch: java.lang.Exception -> L96
            android.view.Surface r2 = new android.view.Surface     // Catch: java.lang.Exception -> L96
            r2.<init>(r6)     // Catch: java.lang.Exception -> L96
            r5.f191457t = r2     // Catch: java.lang.Exception -> L96
            ph3.k r6 = r5.f191450m     // Catch: java.lang.Exception -> L96
            if (r6 == 0) goto L88
            boolean r3 = r5.f191454q     // Catch: java.lang.Exception -> L96
            if (r3 != 0) goto L45
            goto L88
        L45:
            r6.k(r2)     // Catch: java.lang.Exception -> L96
            r6 = 23
            boolean r6 = fp.h.c(r6)     // Catch: java.lang.Exception -> L96
            r2 = 1
            if (r6 == 0) goto L6c
            boolean r6 = r5.D     // Catch: java.lang.Exception -> L96
            if (r6 == 0) goto L5b
            ph3.k r6 = r5.f191450m     // Catch: java.lang.Exception -> L96
            r6.start()     // Catch: java.lang.Exception -> L96
            goto L85
        L5b:
            r5.E = r2     // Catch: java.lang.Exception -> L96
            r3 = 0
            r5.f191458u = r3     // Catch: java.lang.Exception -> L96
            ph3.k r6 = r5.f191450m     // Catch: java.lang.Exception -> L96
            r6.setMute(r2)     // Catch: java.lang.Exception -> L96
            ph3.k r6 = r5.f191450m     // Catch: java.lang.Exception -> L96
            r6.start()     // Catch: java.lang.Exception -> L96
            goto L85
        L6c:
            boolean r6 = r5.D     // Catch: java.lang.Exception -> L96
            if (r6 == 0) goto L7b
            ph3.k r6 = r5.f191450m     // Catch: java.lang.Exception -> L96
            int r6 = r6.l()     // Catch: java.lang.Exception -> L96
            double r3 = (double) r6     // Catch: java.lang.Exception -> L96
            r5.a(r3, r2)     // Catch: java.lang.Exception -> L96
            goto L85
        L7b:
            ph3.k r6 = r5.f191450m     // Catch: java.lang.Exception -> L96
            int r6 = r6.l()     // Catch: java.lang.Exception -> L96
            double r2 = (double) r6     // Catch: java.lang.Exception -> L96
            r5.a(r2, r7)     // Catch: java.lang.Exception -> L96
        L85:
            r5.D = r7     // Catch: java.lang.Exception -> L96
            goto L8b
        L88:
            r5.H()     // Catch: java.lang.Exception -> L96
        L8b:
            r5.J()     // Catch: java.lang.Exception -> L96
            com.tencent.mm.pluginsdk.ui.tools.d4 r6 = r5.f191463z     // Catch: java.lang.Exception -> L96
            if (r6 == 0) goto L9f
            r6.onSurfaceAvailable()     // Catch: java.lang.Exception -> L96
            goto L9f
        L96:
            r6 = move-exception
            java.lang.String r2 = "onSurfaceTextureAvailable failed"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.tencent.mars.xlog.Log.printErrStackTrace(r8, r6, r2, r7)
        L9f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView.F(android.graphics.SurfaceTexture, int, int):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleOnSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        if (fp.h.c(23) && this.E && this.f191458u > 0) {
            ph3.k kVar = this.f191450m;
            if (kVar != null) {
                kVar.pause();
                this.f191450m.setMute(this.f191455r);
            }
            this.E = false;
        }
        if (this.f191458u > 0 && this.f191461x != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoPlayTextureView", "%d notify surface update", java.lang.Integer.valueOf(hashCode()));
            this.f191461x.v();
            this.f191461x = null;
        }
        this.f191458u = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
    public void H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsVideoPlayTextureView", "%d open video [%s]", java.lang.Integer.valueOf(hashCode()), this.f191449i);
        synchronized (this.K) {
            try {
                ph3.k kVar = this.f191450m;
                if (kVar != null) {
                    kVar.f354429g = null;
                    kVar.stop();
                    this.f191450m.release();
                    this.f191450m = null;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f191449i)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Sns.SnsVideoPlayTextureView", "%d open video but path is null.", java.lang.Integer.valueOf(hashCode()));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                    return;
                }
                try {
                    this.f191454q = false;
                    ph3.k kVar2 = new ph3.k(android.os.Looper.getMainLooper(), false, 0);
                    this.f191450m = kVar2;
                    kVar2.h(this.f191449i);
                    ph3.k kVar3 = this.f191450m;
                    ph3.b bVar = this.A;
                    if (bVar != null) {
                        ph3.o oVar = kVar3.f354428f;
                        if (oVar != null) {
                            oVar.f354449l.f354407g = bVar;
                        }
                    } else {
                        kVar3.getClass();
                    }
                    this.f191450m.q(this.B);
                    this.f191450m.p(this.C);
                    ph3.k kVar4 = this.f191450m;
                    kVar4.f354429g = this.H;
                    kVar4.setSurface(this.f191457t);
                    this.f191450m.f354428f.f354449l.getClass();
                    if (this.f191457t != null) {
                        this.f191450m.prepare();
                    } else if (this.f191459v) {
                        this.f191450m.prepare();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sns.SnsVideoPlayTextureView", e17, "prepare async error %s", e17.getMessage());
                    com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191460w;
                    if (a4Var != null) {
                        a4Var.onError(-1, -1);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVideo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void b(double d17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                a(d17, true);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                super.pause();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void setMute(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                super.setMute(z17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoPath(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        super.setVideoPath(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean start() {
        boolean start;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                start = super.start();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        return start;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
        synchronized (this.K) {
            try {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$001", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                super.stop();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$001", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoPlayTextureView");
    }

    public SnsVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.K = new java.lang.Object();
    }
}
