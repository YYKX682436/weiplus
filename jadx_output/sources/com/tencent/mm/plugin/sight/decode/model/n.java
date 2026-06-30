package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f162434d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.model.s f162435e;

    public n(com.tencent.mm.plugin.sight.decode.model.s sVar, com.tencent.mm.plugin.sight.decode.model.b bVar) {
        this.f162435e = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f162435e.g();
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.f162435e;
        com.tencent.mm.feature.sight.api.ISightJNIService iSightJNIService = (com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class);
        com.tencent.mm.plugin.sight.decode.model.s sVar2 = this.f162435e;
        boolean z17 = false;
        sVar.f162449e = iSightJNIService.openFileVFS(sVar2.f162447c, 1 == sVar2.f162446b ? 0 : 1, 1, false);
        com.tencent.mm.plugin.sight.decode.model.s sVar3 = this.f162435e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "SightVideoJNI.openFile mVideoPath:%s mVideoId:%s", sVar3.f162447c, java.lang.Integer.valueOf(sVar3.f162449e));
        com.tencent.mm.plugin.sight.decode.model.s sVar4 = this.f162435e;
        ((java.util.concurrent.ConcurrentLinkedQueue) sVar4.f162450f).offer(java.lang.Integer.valueOf(sVar4.f162449e));
        if (this.f162435e.f162449e < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id %d, path %s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f162435e.hashCode()), java.lang.Integer.valueOf(this.f162435e.f162449e), this.f162435e.f162447c);
            this.f162435e.d(null);
            if (this.f162435e.F != null) {
                this.f162435e.F.a(this.f162435e, -1);
                return;
            }
            return;
        }
        int max = java.lang.Math.max(1, ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getVideoWidth(this.f162435e.f162449e));
        int max2 = java.lang.Math.max(1, ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getVideoHeight(this.f162435e.f162449e));
        com.tencent.mm.plugin.sight.decode.model.s sVar5 = this.f162435e;
        if (sVar5.f162446b == 0) {
            if (sVar5.f162467w) {
                if (max * max2 > 2073600 || max <= 0 || max2 <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "get error info for ad,  videoWidth %d height  %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
                    return;
                }
            } else if (max * max2 >= 1048576 || max <= 0 || max2 <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "get error info videoWidth %d height  %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
                return;
            }
            sVar5.hashCode();
            android.graphics.Bitmap bitmap = sVar5.f162452h;
            if (bitmap == null) {
                sVar5.f162452h = com.tencent.mm.memory.u.f68981d.m(new com.tencent.mm.memory.t(max, max2));
                com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.SightPlayController", "checkBmp, create new one, videoPath: %s", sVar5.f162447c);
            } else if (bitmap.getWidth() != max || sVar5.f162452h.getHeight() != max2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "reset bmp, old value " + sVar5.f162452h.getWidth() + "*" + sVar5.f162452h.getHeight());
                if (fp.h.c(19) && sVar5.f162452h.getAllocationByteCount() >= max2 * max * 4) {
                    try {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "reset bmp, try directly reconfigure");
                        sVar5.f162452h.reconfigure(max, max2, android.graphics.Bitmap.Config.ARGB_8888);
                        z17 = true;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "reconfigure failed: %s" + e17.getMessage());
                    }
                }
                if (!z17) {
                    com.tencent.mm.memory.u uVar = com.tencent.mm.memory.u.f68981d;
                    uVar.n(sVar5.f162452h);
                    sVar5.f162452h = uVar.m(new com.tencent.mm.memory.t(max, max2));
                }
                com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.SightPlayController", "checkBmp, the origin bmp size not match, create new one, videoPath: %s", sVar5.f162447c);
            }
        }
        com.tencent.mm.plugin.sight.decode.model.s sVar6 = this.f162435e;
        sVar6.getClass();
        sVar6.f162451g = 1000 / java.lang.Math.max(1, (int) ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getVideoRate(sVar6.f162449e));
        sVar6.hashCode();
        float f17 = max;
        float f18 = max2;
        if (java.lang.Float.compare(f17 / f18, 5.0f) > 0 || java.lang.Float.compare(f18 / f17, 5.0f) > 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "ERROR Video size %d, %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f162435e.f162447c)) {
                ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.plugin.sight.decode.model.s.H).put(this.f162435e.f162447c, 2);
            }
            com.tencent.mm.plugin.sight.decode.model.s sVar7 = this.f162435e;
            sVar7.f162455k = 0L;
            sVar7.e(sVar7.f162450f);
            com.tencent.mm.plugin.sight.decode.model.s sVar8 = this.f162435e;
            sVar8.f162449e = -1;
            sVar8.f162447c = "";
            sVar8.f162448d = "ERROR#PATH";
            sVar8.getClass();
            this.f162434d = true;
            if (this.f162435e.F != null) {
                this.f162435e.F.a(this.f162435e, -1);
                return;
            }
            return;
        }
        m34.g gVar = (m34.g) this.f162435e;
        com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView = (com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) gVar.I.get();
        if (sightPlayImageView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayImageView", "onGetVideoSizeEnd, imageView is null, do clear");
            gVar.c();
        } else if (!sightPlayImageView.P) {
            sightPlayImageView.f162489J = max;
            sightPlayImageView.K = max2;
            com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = sightPlayImageView.L;
            if (a4Var != null) {
                a4Var.T4(max, max2);
            }
            if (sightPlayImageView.H > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = sightPlayImageView.getLayoutParams();
                int i17 = layoutParams.width;
                int i18 = sightPlayImageView.H;
                if (i17 != i18 || layoutParams.height != (i18 * max2) / max) {
                    layoutParams.width = i18;
                    layoutParams.height = (i18 * max2) / max;
                    com.tencent.mm.sdk.platformtools.u3.h(new m34.f(gVar, sightPlayImageView, layoutParams));
                    sightPlayImageView.postInvalidate();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayImageView", "onGetVideoSize::params width %d height %d", java.lang.Integer.valueOf(layoutParams.width), java.lang.Integer.valueOf(layoutParams.height));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayImageView", "onGetVideoSize::DrawWidth %d, video size %d*%d", java.lang.Integer.valueOf(sightPlayImageView.H), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
        }
        com.tencent.mm.plugin.sight.decode.model.s sVar9 = this.f162435e;
        if (1 == sVar9.f162446b) {
            sVar9.f162459o = new com.tencent.mm.plugin.sight.decode.model.h(sVar9, null);
            this.f162435e.f162461q = null;
            if (!this.f162434d) {
                wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
                com.tencent.mm.plugin.sight.decode.model.h hVar = this.f162435e.f162459o;
                ((vf0.y1) k1Var).getClass();
                t21.o2.aj(hVar, 0L);
            }
        } else {
            sVar9.f162459o = new com.tencent.mm.plugin.sight.decode.model.h(sVar9, null);
            com.tencent.mm.plugin.sight.decode.model.s sVar10 = this.f162435e;
            sVar10.f162461q = new com.tencent.mm.plugin.sight.decode.model.i(sVar10);
            this.f162435e.f162459o.f162428e = this.f162435e.f162461q;
            this.f162435e.f162461q.f162431e = this.f162435e.f162459o;
            if (!this.f162434d) {
                wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
                com.tencent.mm.plugin.sight.decode.model.h hVar2 = this.f162435e.f162459o;
                ((vf0.y1) k1Var2).getClass();
                t21.o2.aj(hVar2, 0L);
            }
        }
        if (this.f162434d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "#0x%x-#0x%x open file end, match stop %B", java.lang.Integer.valueOf(this.f162435e.hashCode()), java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f162434d));
        }
    }
}
