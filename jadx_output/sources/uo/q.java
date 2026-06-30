package uo;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static int f429533b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f429534c = false;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.concurrent.FutureTask f429535d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f429536e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f429537f;

    /* renamed from: a, reason: collision with root package name */
    public static final uo.q f429532a = new uo.q();

    /* renamed from: g, reason: collision with root package name */
    public static final android.util.ArrayMap f429538g = new android.util.ArrayMap();

    /* renamed from: h, reason: collision with root package name */
    public static int f429539h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static int f429540i = -1;

    public final void a() {
        try {
            f429537f = null;
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("camera");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
            java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
            kotlin.jvm.internal.o.f(cameraIdList, "getCameraIdList(...)");
            for (java.lang.String str : cameraIdList) {
                if (f429537f == null) {
                    f429537f = str + '-' + cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) + '-' + cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING) + '+';
                } else {
                    f429537f += str + '-' + cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) + '-' + cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING) + '+';
                }
            }
        } catch (java.lang.AssertionError unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginCamera", "some device has some problem in LegecyCamera ");
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginCamera", "a camera access exception happend");
        }
    }

    public final void b() {
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("camera");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            f429536e = ((android.hardware.camera2.CameraManager) systemService).getCameraIdList().length;
        } catch (java.lang.AssertionError unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginCamera", "some device has some problem in LegecyCamera ");
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginCamera", "a camera access exception happend");
        }
    }

    public final android.hardware.Camera.CameraInfo c(int i17) {
        if (d() != 2) {
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            return cameraInfo;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.util.ArrayMap arrayMap = f429538g;
        if (!arrayMap.containsKey(valueOf)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "cameraInfoList is empty, miss Cache, to make CameraInfo Cache");
            android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
            int o17 = com.tencent.mm.sdk.platformtools.o4.L().o("PluginCamera_CameraInfo_facing_" + i17, -1);
            int o18 = com.tencent.mm.sdk.platformtools.o4.L().o("PluginCamera_CameraInfo_orientation_" + i17, -1);
            boolean z17 = false;
            boolean i18 = com.tencent.mm.sdk.platformtools.o4.L().i("PluginCamera_CameraInfo_canDisableShutterSound_" + i17, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById, id = " + i17 + ", facing = " + o17 + ", orientation =" + o18 + ", canDisableShutterSound = " + i18);
            if (o17 == -1 || o18 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById no MMKV cache");
            } else {
                cameraInfo2.facing = o17;
                cameraInfo2.orientation = o18;
                cameraInfo2.canDisableShutterSound = i18;
                arrayMap.put(java.lang.Integer.valueOf(i17), cameraInfo2);
                z17 = true;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "getCameraInfoFromMMKVCacheById failed, refresh CameraCache");
                e();
            }
        }
        android.hardware.Camera.CameraInfo cameraInfo3 = (android.hardware.Camera.CameraInfo) arrayMap.get(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "getCameraInfo cameraInfoList.size = " + arrayMap.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "getCameraInfo id = " + i17 + ", ret = " + cameraInfo3);
        return cameraInfo3;
    }

    public final int d() {
        int i17 = f429533b;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "mCameraNumber == -1，slow initCameraNumbers, use MMKV cache");
            int i18 = com.tencent.mm.sdk.platformtools.o4.L().getInt("cameraNumberCache", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "get cameraNumberCache from MMKV cameraNumberCache is " + i18);
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV successful, return cameraNumberCache : " + i18);
                if (!f429534c) {
                    int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
                    f429533b = numberOfCameras;
                    return numberOfCameras;
                }
                if (i18 != 0) {
                    f429533b = i18;
                    return i18;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV is 0, error, getNumberOfCameras freshly ");
                int numberOfCameras2 = android.hardware.Camera.getNumberOfCameras();
                f429533b = numberOfCameras2;
                return numberOfCameras2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly");
            f429533b = android.hardware.Camera.getNumberOfCameras();
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly DONE");
            com.tencent.mm.sdk.platformtools.o4.L().putInt("cameraNumberCache", f429533b);
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "cameraNumberCache from MMKV failed, just getNumberOfCameras freshly save cache done");
        } else if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "mCameraNumber == 0， happened error to get camera number and try again");
            f429533b = android.hardware.Camera.getNumberOfCameras();
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "mCameraNumber == 0， happened error to get camera number and try again DONE");
            com.tencent.mm.sdk.platformtools.o4.L().putInt("cameraNumberCache", f429533b);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "mCameraNumber is " + f429533b);
        return f429533b;
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "makeCameraInfoCache");
        synchronized (this) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "before getCameraNumbers");
                int d17 = f429532a.d();
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "after getCameraNumbers");
                for (int i17 = 0; i17 < d17; i17++) {
                    android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                    android.hardware.Camera.getCameraInfo(i17, cameraInfo);
                    android.util.ArrayMap arrayMap = f429538g;
                    arrayMap.put(java.lang.Integer.valueOf(i17), cameraInfo);
                    f429532a.f(i17, cameraInfo.facing, cameraInfo.orientation, cameraInfo.canDisableShutterSound);
                    boolean z17 = true;
                    if (f429539h == -1) {
                        android.hardware.Camera.CameraInfo cameraInfo2 = (android.hardware.Camera.CameraInfo) arrayMap.get(java.lang.Integer.valueOf(i17));
                        if (cameraInfo2 != null && cameraInfo2.facing == 0) {
                            f429539h = i17;
                            com.tencent.mm.sdk.platformtools.o4.L().A("PluginCamera_BackCameraId", i17);
                        }
                    }
                    if (f429540i == -1) {
                        android.hardware.Camera.CameraInfo cameraInfo3 = (android.hardware.Camera.CameraInfo) arrayMap.get(java.lang.Integer.valueOf(i17));
                        if (cameraInfo3 == null || cameraInfo3.facing != 1) {
                            z17 = false;
                        }
                        if (z17) {
                            f429540i = i17;
                            com.tencent.mm.sdk.platformtools.o4.L().A("PluginCamera_FrontCameraId", i17);
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "makeCameraInfoCache, id = " + i17 + ", facint = " + cameraInfo.facing);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "makeCameraInfoCache mBackCameraId = " + f429539h + ", mFrontCameraId = " + f429540i);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginCamera", "makeCameraInfoCache failed : " + th6.getMessage() + ", clear cameraInfoList");
                f429538g.clear();
            }
        }
    }

    public final void f(int i17, int i18, int i19, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "saveCameraInfoToMMKVCache, id = " + i17 + ", orientation = " + i19 + ", canDisableShutterSound = " + z17);
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PluginCamera_CameraInfo_facing_");
        sb6.append(i17);
        L.A(sb6.toString(), i18);
        com.tencent.mm.sdk.platformtools.o4.L().A("PluginCamera_CameraInfo_orientation_" + i17, i19);
        com.tencent.mm.sdk.platformtools.o4.L().G("PluginCamera_CameraInfo_canDisableShutterSound_" + i17, z17);
    }

    public final void g(int i17, android.hardware.Camera.CameraInfo cameraInfo) {
        kotlin.jvm.internal.o.g(cameraInfo, "cameraInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "updateCameraInfoCache " + i17);
        f429538g.put(java.lang.Integer.valueOf(i17), cameraInfo);
    }
}
