package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class SynchronizedVideoPlayTextureView extends com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView {
    public final java.lang.Object K;

    public SynchronizedVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = new java.lang.Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: Exception -> 0x00a2, all -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a2, blocks: (B:6:0x003a, B:8:0x004d, B:11:0x0052, B:13:0x005d, B:15:0x0061, B:16:0x0091, B:17:0x0097, B:19:0x009e, B:25:0x0067, B:26:0x0078, B:28:0x007c, B:29:0x0087, B:30:0x0094), top: B:5:0x003a, outer: #1 }] */
    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(android.graphics.SurfaceTexture r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.K
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.SynchronizedVideoPlayTextureView"
            java.lang.String r2 = "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lae
            int r4 = r7.hashCode()     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> Lae
            int r4 = r8.hashCode()     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lae
            r4 = 2
            r3[r4] = r9     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lae
            r10 = 3
            r3[r10] = r9     // Catch: java.lang.Throwable -> Lae
            boolean r9 = r7.D     // Catch: java.lang.Throwable -> Lae
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> Lae
            r10 = 4
            r3[r10] = r9     // Catch: java.lang.Throwable -> Lae
            com.tencent.mars.xlog.Log.i(r1, r2, r3)     // Catch: java.lang.Throwable -> Lae
            r7.C()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            android.view.Surface r9 = r7.f191457t     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r7.I(r9)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            android.view.Surface r9 = new android.view.Surface     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r9.<init>(r8)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r7.f191457t = r9     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            ph3.k r8 = r7.f191450m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto L94
            boolean r10 = r7.f191454q     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r10 != 0) goto L52
            goto L94
        L52:
            r8.k(r9)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8 = 23
            boolean r8 = fp.h.c(r8)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto L78
            boolean r8 = r7.D     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto L67
            ph3.k r8 = r7.f191450m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8.start()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto L91
        L67:
            r7.E = r6     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8 = 0
            r7.f191458u = r8     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            ph3.k r8 = r7.f191450m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8.setMute(r6)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            ph3.k r8 = r7.f191450m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r8.start()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto L91
        L78:
            boolean r8 = r7.D     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto L87
            ph3.k r8 = r7.f191450m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            int r8 = r8.l()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            double r8 = (double) r8     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r7.a(r8, r6)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto L91
        L87:
            ph3.k r8 = r7.f191450m     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            int r8 = r8.l()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            double r8 = (double) r8     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            r7.a(r8, r5)     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
        L91:
            r7.D = r5     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto L97
        L94:
            r7.H()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
        L97:
            r7.J()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            com.tencent.mm.pluginsdk.ui.tools.d4 r8 = r7.f191463z     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            if (r8 == 0) goto Lac
            r8.onSurfaceAvailable()     // Catch: java.lang.Exception -> La2 java.lang.Throwable -> Lae
            goto Lac
        La2:
            r8 = move-exception
            java.lang.String r9 = "MicroMsg.SynchronizedVideoPlayTextureView"
            java.lang.String r10 = "onSurfaceTextureAvailable failed"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lae
            com.tencent.mars.xlog.Log.printErrStackTrace(r9, r8, r10, r1)     // Catch: java.lang.Throwable -> Lae
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            return
        Lae:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView.F(android.graphics.SurfaceTexture, int, int):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.K) {
            if (fp.h.c(23) && this.E && this.f191458u > 0) {
                ph3.k kVar = this.f191450m;
                if (kVar != null) {
                    kVar.pause();
                    this.f191450m.setMute(this.f191455r);
                }
                this.E = false;
            }
            if (this.f191458u > 0 && this.f191461x != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SynchronizedVideoPlayTextureView", "%d notify surface update", java.lang.Integer.valueOf(hashCode()));
                this.f191461x.v();
                this.f191461x = null;
            }
            this.f191458u = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SynchronizedVideoPlayTextureView", "%d open video [%s]", java.lang.Integer.valueOf(hashCode()), this.f191449i);
        synchronized (this.K) {
            ph3.k kVar = this.f191450m;
            if (kVar != null) {
                kVar.f354429g = null;
                kVar.stop();
                this.f191450m.release();
                this.f191450m = null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f191449i)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SynchronizedVideoPlayTextureView", "%d open video but path is null.", java.lang.Integer.valueOf(hashCode()));
                return;
            }
            try {
                this.f191454q = false;
                ph3.k kVar2 = new ph3.k(android.os.Looper.getMainLooper(), false, getBusinessType());
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
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SynchronizedVideoPlayTextureView", e17, "prepare async error %s", e17.getMessage());
                com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191460w;
                if (a4Var != null) {
                    a4Var.onError(-1, -1);
                }
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void b(double d17) {
        synchronized (this.K) {
            a(d17, true);
        }
    }

    public int getBusinessType() {
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void pause() {
        synchronized (this.K) {
            super.pause();
            this.f191456s = false;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void setMute(boolean z17) {
        synchronized (this.K) {
            super.setMute(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoPath(java.lang.String str) {
        synchronized (this.K) {
            super.setVideoPath(str);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean start() {
        boolean start;
        synchronized (this.K) {
            this.f191456s = true;
            start = super.start();
        }
        return start;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void stop() {
        synchronized (this.K) {
            super.stop();
        }
    }

    public SynchronizedVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.K = new java.lang.Object();
    }

    public SynchronizedVideoPlayTextureView(android.content.Context context) {
        super(context, null);
        this.K = new java.lang.Object();
    }
}
