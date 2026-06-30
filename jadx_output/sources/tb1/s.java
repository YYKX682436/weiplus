package tb1;

/* loaded from: classes7.dex */
public class s implements tb1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416934a;

    public s(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView, tb1.e eVar) {
        this.f416934a = appBrandCameraView;
    }

    public static void e(tb1.s sVar, java.lang.String str) {
        sVar.getClass();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = sVar.f416934a;
        if (K0) {
            sVar.i(-1, "record file not exist", appBrandCameraView.H, str);
            return;
        }
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        sVar.f(ai3.d.p(str), appBrandCameraView.H);
        sVar.i(0, "", appBrandCameraView.H, str);
    }

    @Override // tb1.m
    public void a(byte[] bArr, int i17, int i18) {
        boolean z17 = this.f416934a.f80181s;
    }

    @Override // tb1.m
    public void b() {
        long j17 = this.f416934a.M;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 1500) {
            j();
            return;
        }
        long j18 = 1500 - elapsedRealtime;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "stopRecord in %d ms later", java.lang.Long.valueOf(j18));
        com.tencent.mm.sdk.platformtools.u3.i(new tb1.r(this), j18);
    }

    @Override // tb1.m
    public void c(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "startRecord.");
        tb1.c cVar = tb1.b.f416889a;
        if (!cVar.f416890a || !cVar.f416891b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraMrg", "no all permission");
        }
        boolean z19 = cVar.f416890a && cVar.f416891b;
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416934a;
        if (!z19) {
            dp.a.makeText(appBrandCameraView.f80168d, com.tencent.mm.R.string.gw7, 1).show();
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "no micro phone permission");
            h(-1, "permission");
        } else if (appBrandCameraView.f80167J == 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "startRecord is recording!!");
            h(-1, "is recording");
        } else {
            if (!appBrandCameraView.Q) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "startRecord err, isn't init done");
                h(-1, "camera has not been initialized");
                return;
            }
            appBrandCameraView.F.g(z17, z18);
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            appBrandCameraView.M = android.os.SystemClock.elapsedRealtime();
            appBrandCameraView.f80167J = 2;
            h(0, "");
            appBrandCameraView.l();
        }
    }

    @Override // tb1.m
    public void d(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "takePicture.");
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416934a;
        if (appBrandCameraView.F == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "recordView is null");
            return;
        }
        if (appBrandCameraView.f80167J == 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "takePicture is recording!!");
            return;
        }
        if (!appBrandCameraView.K) {
            long j17 = appBrandCameraView.L;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 >= 300) {
                if (!appBrandCameraView.Q) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "takePicture err, isn't init done");
                    com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.a(appBrandCameraView, -1, null, null, "camera has not been initialized");
                    return;
                } else {
                    appBrandCameraView.L = android.os.SystemClock.elapsedRealtime();
                    appBrandCameraView.K = true;
                    appBrandCameraView.f80167J = 3;
                    appBrandCameraView.F.j(new tb1.n(this, z17), "on".equals(appBrandCameraView.f80175n), z18);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "not the right time to take picture.");
    }

    public final boolean f(android.graphics.Bitmap bitmap, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416934a;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                appBrandCameraView.f80185w = bitmap.getWidth();
                appBrandCameraView.f80186x = bitmap.getHeight();
                int i17 = "normal".equals(appBrandCameraView.f80176o) ? 44 : "low".equals(appBrandCameraView.f80176o) ? 25 : "original".equals(appBrandCameraView.f80176o) ? 100 : 90;
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, i17, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "bitmap filelen %s", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "mQuality:%s, quality:%d", appBrandCameraView.f80176o, java.lang.Integer.valueOf(i17));
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCameraView", "error for saveBitmapToImage %s", e17.getMessage());
            }
        }
        return false;
    }

    public final java.lang.String g(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        ik1.b0 b0Var = new ik1.b0();
        if (lVar.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)), "", true, b0Var) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            return (java.lang.String) b0Var.f291824a;
        }
        return null;
    }

    public final void h(int i17, java.lang.String str) {
        tb1.v vVar = this.f416934a.C;
        if (vVar != null) {
            tb1.q0 q0Var = ((tb1.r0) vVar).f416933a;
            if (i17 == 0) {
                q0Var.f416927e.a(q0Var.f416928f, q0Var.f416929g.o("ok"));
            } else {
                q0Var.f416927e.a(q0Var.f416928f, q0Var.f416929g.o("fail:" + str));
            }
        }
    }

    public final void i(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        long j17;
        int i18;
        int i19;
        gp.d dVar;
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416934a;
        if (appBrandCameraView.C != null) {
            int i27 = 0;
            if (i17 == 0) {
                int[] iArr = new int[3];
                if (com.tencent.mm.vfs.w6.j(str3)) {
                    try {
                        dVar = new gp.d();
                        try {
                            dVar.setDataSource(str3);
                            iArr[0] = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0);
                            int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(24), 0);
                            try {
                                if (P != 90 && P != 270) {
                                    iArr[1] = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
                                    iArr[2] = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
                                    dVar.release();
                                }
                                dVar.release();
                            } catch (java.io.IOException unused) {
                            }
                            iArr[1] = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
                            iArr[2] = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (dVar != null) {
                                try {
                                    dVar.release();
                                } catch (java.io.IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        dVar = null;
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "getInfoFromMetaData file isn't exist, filename: %s", str3);
                }
                i27 = (int) java.lang.Math.round((iArr[0] * 1.0d) / 1000.0d);
                j17 = com.tencent.mm.vfs.w6.k(str3);
                i19 = iArr[1];
                i18 = iArr[2];
            } else {
                j17 = 0;
                i18 = 0;
                i19 = 0;
            }
            tb1.v vVar = appBrandCameraView.C;
            java.lang.String g17 = g(appBrandCameraView.f80169e, str2);
            java.lang.String g18 = g(appBrandCameraView.f80169e, str3);
            tb1.q0 q0Var = ((tb1.r0) vVar).f416933a;
            if (i17 == 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempThumbPath", g17);
                hashMap.put("tempVideoPath", g18);
                hashMap.put("duration", java.lang.Integer.valueOf(i27));
                hashMap.put("size", java.lang.Long.valueOf(j17));
                hashMap.put("height", java.lang.Integer.valueOf(i18));
                hashMap.put("width", java.lang.Integer.valueOf(i19));
                q0Var.f416927e.a(q0Var.f416928f, q0Var.f416929g.p("ok", hashMap));
            } else {
                q0Var.f416927e.a(q0Var.f416928f, q0Var.f416929g.o("fail:" + str));
            }
        }
        appBrandCameraView.l();
    }

    @Override // tb1.m
    public void init() {
    }

    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416934a;
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = appBrandCameraView.F;
        if (mMSightRecordView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "recordView is null");
            i(-1, "camera is null", null, null);
        } else if (appBrandCameraView.f80167J != 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "stopRecord is not recording!!");
            i(-1, "is not recording", null, null);
        } else if (appBrandCameraView.f80182t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "recordView is IsStopping");
            i(-1, "is stopping", null, null);
        } else {
            appBrandCameraView.f80182t = true;
            mMSightRecordView.h(new tb1.o(this));
        }
    }

    @Override // tb1.m
    public void release() {
    }
}
