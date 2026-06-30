package nr0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final nr0.a f339064a = new nr0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Integer[] f339065b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.media.camera.CameraSupportInfo f339066c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.media.camera.CameraSupportInfo f339067d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f339068e;

    static {
        f339065b = android.os.Build.VERSION.SDK_INT < 28 ? new java.lang.Integer[]{0, 1} : new java.lang.Integer[]{0, 1, 3, 4};
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.Camera.CameraKitUtil");
        f339068e = M;
        android.os.Parcelable s17 = M.s("key_front_support_info", com.tencent.mm.media.camera.CameraSupportInfo.class, new com.tencent.mm.media.camera.CameraSupportInfo(null, 0, 0, null, 15, null));
        kotlin.jvm.internal.o.f(s17, "decodeParcelable(...)");
        com.tencent.mm.media.camera.CameraSupportInfo cameraSupportInfo = (com.tencent.mm.media.camera.CameraSupportInfo) s17;
        f339066c = cameraSupportInfo;
        android.os.Parcelable s18 = M.s("key_back_support_info", com.tencent.mm.media.camera.CameraSupportInfo.class, new com.tencent.mm.media.camera.CameraSupportInfo(null, 0, 0, null, 15, null));
        kotlin.jvm.internal.o.f(s18, "decodeParcelable(...)");
        com.tencent.mm.media.camera.CameraSupportInfo cameraSupportInfo2 = (com.tencent.mm.media.camera.CameraSupportInfo) s18;
        f339067d = cameraSupportInfo2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitUtil", "init camera support info from mmkv, front info:" + cameraSupportInfo + "  back info:" + cameraSupportInfo2);
        if (!(cameraSupportInfo2.f68859g.length() == 0)) {
            if (!(cameraSupportInfo.f68859g.length() == 0)) {
                return;
            }
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("camera");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
        java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
        kotlin.jvm.internal.o.f(cameraIdList, "getCameraIdList(...)");
        for (java.lang.String str : cameraIdList) {
            try {
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                kotlin.jvm.internal.o.f(cameraCharacteristics, "getCameraCharacteristics(...)");
                java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 1) {
                    java.lang.Integer num2 = (java.lang.Integer) cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    com.tencent.mm.media.camera.CameraSupportInfo cameraSupportInfo3 = f339067d;
                    kotlin.jvm.internal.o.d(str);
                    cameraSupportInfo3.getClass();
                    cameraSupportInfo3.f68856d = str;
                    cameraSupportInfo3.f68857e = 1;
                    cameraSupportInfo3.f68858f = num2 != null ? num2.intValue() : -1;
                    java.lang.String b17 = f339064a.b(num2);
                    cameraSupportInfo3.getClass();
                    cameraSupportInfo3.f68859g = b17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitUtil", "back camera info id:" + str + " level:" + num2 + " str:" + f339066c.f68859g);
                } else {
                    java.lang.Integer num3 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                    if (num3 != null && num3.intValue() == 0) {
                        java.lang.Integer num4 = (java.lang.Integer) cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        com.tencent.mm.media.camera.CameraSupportInfo cameraSupportInfo4 = f339066c;
                        kotlin.jvm.internal.o.d(str);
                        cameraSupportInfo4.getClass();
                        cameraSupportInfo4.f68856d = str;
                        cameraSupportInfo4.f68857e = 0;
                        cameraSupportInfo4.f68858f = num4 != null ? num4.intValue() : -1;
                        java.lang.String b18 = f339064a.b(num4);
                        cameraSupportInfo4.getClass();
                        cameraSupportInfo4.f68859g = b18;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitUtil", "front camera info id:" + str + " level:" + num4 + " str:" + cameraSupportInfo4.f68859g);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Camera.CameraKitUtil", e17, "getCameraCharacteristics error!", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f339068e;
        o4Var.C("key_front_support_info", f339066c);
        o4Var.C("key_back_support_info", f339067d);
    }

    public final boolean a() {
        boolean G = kz5.z.G(f339065b, java.lang.Integer.valueOf(f339067d.f68858f));
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitUtil", "enableCamerax :" + G);
        return G;
    }

    public final java.lang.String b(java.lang.Integer num) {
        return (num != null && num.intValue() == 0) ? "LIMITED" : (num != null && num.intValue() == 1) ? "FULL" : (num != null && num.intValue() == 2) ? "LEGACY" : (num != null && num.intValue() == 3) ? "LEVEL_3" : (num != null && num.intValue() == 4) ? "EXTERNAL" : "UNKNOW";
    }
}
