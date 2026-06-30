package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f137249a = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/fdv_");

    static {
        com.tencent.mm.plugin.facedetect.e.wi();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("FacePro");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("YTCommon");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("YTAGReflectLiveCheck");
        com.tencent.youtu.ytcommon.YTCommonExInterface.setIsEnabledLog(true);
        com.tencent.youtu.ytcommon.YTCommonExInterface.setIsEnabledNativeLog(true);
    }

    public r() {
        int i17 = 2;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_face_sdk_log_level, 2);
        if (Ni >= 0 && Ni <= 5) {
            i17 = Ni;
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.setLogLevel(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "choose sdk log level:%s", java.lang.Integer.valueOf(i17));
        com.tencent.youtu.sdkkitframework.common.YtLogger.setLoggerListener(new com.tencent.mm.plugin.flash.q(this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(5:2|3|4|(2:6|(2:8|(2:10|(1:12))(1:41))(1:42))(1:43)|13)|(3:15|16|(1:18)(2:20|(2:22|23)(1:24)))|26|27|28|29|30|31|(3:33|34|(0)(0))(2:35|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerConfig", r0, "par config error. config:%s", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode r20, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.flash.r.a(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$IYtSDKKitFrameworkEventListener):boolean");
    }

    public boolean b(android.hardware.Camera camera, int i17) {
        int initCamera = com.tencent.youtu.ytcommon.tools.YTCameraSetting.initCamera(com.tencent.mm.sdk.platformtools.x2.f193071a, camera, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "YTCameraSetting  initCamera result:%s", java.lang.Integer.valueOf(initCamera));
        if (initCamera != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "YTCommonInterface  initAuth error:%s", java.lang.Integer.valueOf(initCamera));
            return false;
        }
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext platformContext = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getPlatformContext();
        platformContext.currentCamera = camera;
        platformContext.currentCameraId = i17;
        platformContext.currentRotateState = com.tencent.youtu.ytcommon.tools.YTCameraSetting.getRotate(com.tencent.mm.sdk.platformtools.x2.f193071a, i17, 1);
        platformContext.currentAppContext = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return true;
    }

    public boolean c() {
        int b17 = com.tencent.ytcommon.auth.Auth.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "rel_wechat_2055-12-06.lic1.2", "", 0);
        if (b17 == 0) {
            com.tencent.ytcommon.auth.Auth.a();
            com.tencent.ytcommon.auth.Auth.getFailedReason(b17);
        } else {
            com.tencent.ytcommon.auth.Auth.a();
            com.tencent.ytcommon.auth.Auth.getFailedReason(b17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "YTCommonInterface  initAuth result:%s", java.lang.Integer.valueOf(b17));
        if (b17 == 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "YTCommonInterface  initAuth error:%s", java.lang.Integer.valueOf(b17));
        return false;
    }
}
