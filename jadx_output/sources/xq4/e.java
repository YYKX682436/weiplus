package xq4;

/* loaded from: classes14.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static yq4.c f456113a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f456114b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static int f456115c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f456116d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f456117e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f456118f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f456119g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f456120h;

    /* renamed from: i, reason: collision with root package name */
    public static int f456121i;

    public static boolean a() {
        boolean z17;
        if (!f456120h) {
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CameraUtil", "find getNumberOfCameras failed: " + e17.getMessage());
            }
            if (java.lang.Class.forName("android.hardware.Camera").getDeclaredMethod("getNumberOfCameras", null) != null) {
                z17 = true;
                f456119g = z17;
                f456121i = uo.q.f429532a.d();
                f456120h = true;
            }
            z17 = false;
            f456119g = z17;
            f456121i = uo.q.f429532a.d();
            f456120h = true;
        }
        return f456119g;
    }

    public static void b(android.content.Context context) {
        if (f456113a != null) {
            return;
        }
        f456113a = new yq4.c("*", 15, 1, false, true, 0, 0, null, null);
        if (a() && !wo.v1.f447822b.f447657b) {
            c();
        } else if (a() && wo.v1.f447822b.f447657b) {
            c();
            d(context);
        } else {
            d(context);
        }
        wo.e eVar = wo.v1.f447822b;
        if (eVar.f447663h) {
            f456118f = eVar.f447662g;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "gCameraNum:" + f456113a.f464581b + "\ngIsHasFrontCamera:" + f456113a.f464582c + "\ngIsHasBackCamera:" + f456113a.f464583d + "\ngFrontCameraId:" + f456114b + "\ngBackCameraId:" + f456115c + "\ngBackOrientation:" + f456113a.f464585f + "\ngFrontOrientation:" + f456113a.f464584e + "\ngBestFps:" + f456113a.f464580a + "\ngFacePreviewSize:" + f456113a.f464586g + "\ngNonFacePreviewSize:" + f456113a.f464587h + "\ngFaceCameraIsRotate180:" + f456116d + "\ngMainCameraIsRotate180:" + f456117e + "\ngCameraFormat:" + f456118f + "\ngFaceNotRotate:SDK:" + android.os.Build.VERSION.SDK_INT + "\n");
    }

    public static void c() {
        boolean z17;
        int i17;
        int i18;
        f456113a.f464581b = f456121i;
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        if (com.tencent.mm.sdk.platformtools.o4.L().i("clicfg_voip_camera_info_use_cache_new", true) || o45.wf.f343033k) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "mCameraNumber = %d, useCache = %b", java.lang.Integer.valueOf(f456121i), java.lang.Boolean.valueOf(z17));
        final int i19 = 0;
        while (true) {
            try {
                if (i19 >= f456113a.f464581b) {
                    break;
                }
                if (z17) {
                    cameraInfo = uo.q.f429532a.c(i19);
                    i17 = cameraInfo.facing;
                    i18 = cameraInfo.orientation;
                    ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: xq4.e$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i27 = i19;
                            try {
                                android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
                                android.hardware.Camera.getCameraInfo(i27, cameraInfo2);
                                uo.q.f429532a.g(i27, cameraInfo2);
                            } catch (java.lang.Exception unused) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.CameraUtil", "error in get camera info");
                            }
                        }
                    }, "initDeviceFromAPI-checkCache");
                } else {
                    android.hardware.Camera.getCameraInfo(i19, cameraInfo);
                    i17 = cameraInfo.facing;
                    i18 = cameraInfo.orientation;
                }
                if (i17 == 1) {
                    if (f456114b != -1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "device has other camera id %s in front", java.lang.Integer.valueOf(i19));
                        break;
                    }
                    f456114b = i19;
                    yq4.c cVar = f456113a;
                    cVar.f464584e = i18;
                    cVar.f464582c = true;
                } else if (i17 != 0) {
                    continue;
                } else {
                    if (f456115c != -1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "device has other camera id %s in back", java.lang.Integer.valueOf(i19));
                        break;
                    }
                    f456115c = i19;
                    yq4.c cVar2 = f456113a;
                    cVar2.f464585f = i18;
                    cVar2.f464583d = true;
                }
                i19++;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CameraUtil", "get camera info error: %s", e17.getMessage());
            }
        }
        java.lang.String property = java.lang.System.getProperty("ro.media.enc.camera.platform", null);
        boolean equalsIgnoreCase = property == null ? false : property.equalsIgnoreCase("Mediatek");
        yq4.c cVar3 = f456113a;
        int i27 = cVar3.f464584e;
        if (i27 == 270 || (equalsIgnoreCase && i27 == 0)) {
            f456116d = 1;
        } else {
            f456116d = 0;
        }
        int i28 = cVar3.f464585f;
        if (i28 == 270 || (equalsIgnoreCase && i28 == 0)) {
            f456117e = 1;
        } else {
            f456117e = 0;
        }
    }

    public static void d(android.content.Context context) {
        int i17;
        int i18;
        int i19;
        int i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "initDeviceFromServerConf");
        wo.e eVar = wo.v1.f447822b;
        if (eVar.f447657b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "initDeviceFromServerConf setCameraNum %d", java.lang.Integer.valueOf(eVar.f447656a));
            f456113a.f464581b = eVar.f447656a;
        }
        boolean z17 = eVar.f447667l;
        if (z17) {
            if (eVar.f447666k.f447643a != 0) {
                f456113a.f464583d = true;
            } else {
                f456113a.f464583d = false;
            }
        }
        boolean z18 = eVar.f447665j;
        if (z18) {
            if (eVar.f447664i.f447643a != 0) {
                f456113a.f464582c = true;
            } else {
                f456113a.f464582c = false;
            }
        }
        if (z18 && (i27 = eVar.f447664i.f447645c) >= 0) {
            f456113a.f464584e = i27;
            f456116d = i27;
        }
        if (z17 && (i19 = eVar.f447666k.f447645c) >= 0) {
            f456113a.f464585f = i19;
            f456117e = i19;
        }
        if (z18) {
            yq4.c cVar = f456113a;
            if (cVar.f464586g == null) {
                cVar.f464586g = new android.graphics.Point(0, 0);
            }
            yq4.c cVar2 = f456113a;
            wo.d dVar = eVar.f447664i;
            cVar2.f464586g = new android.graphics.Point(dVar.f447648f, dVar.f447649g);
        }
        if (eVar.f447667l) {
            yq4.c cVar3 = f456113a;
            if (cVar3.f464587h == null) {
                cVar3.f464587h = new android.graphics.Point(0, 0);
            }
            yq4.c cVar4 = f456113a;
            wo.d dVar2 = eVar.f447666k;
            cVar4.f464587h = new android.graphics.Point(dVar2.f447648f, dVar2.f447649g);
        }
        if (eVar.f447667l && (i18 = eVar.f447666k.f447644b) != 0) {
            f456113a.f464580a = i18;
        }
        if (eVar.f447665j && (i17 = eVar.f447664i.f447644b) != 0) {
            f456113a.f464580a = i17;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (eVar.f447657b || packageManager.hasSystemFeature("android.hardware.camera")) {
            return;
        }
        yq4.c cVar5 = f456113a;
        cVar5.f464581b = 0;
        cVar5.f464582c = false;
        cVar5.f464583d = false;
    }
}
