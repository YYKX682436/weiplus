package qt5;

/* loaded from: classes14.dex */
public abstract class k0 {
    public static android.util.Pair a() {
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        int i17 = -1;
        for (int i18 = 0; i18 < numberOfCameras; i18++) {
            android.hardware.Camera.getCameraInfo(i18, cameraInfo);
            com.tencent.stubs.logger.Log.i("ScanCameraUtil", "getBackCameraId currentFacing: %s, systemFacing: %s, %s", java.lang.Integer.valueOf(cameraInfo.facing), 0, 1);
            if (i18 == 0) {
                i17 = cameraInfo.facing;
            }
            if (cameraInfo.facing == 0) {
                com.tencent.stubs.logger.Log.i("ScanCameraUtil", "getBackCameraId get CAMERA_FACING_BACK bid:%d  num:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(numberOfCameras));
                return new android.util.Pair(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(cameraInfo.facing));
            }
        }
        com.tencent.stubs.logger.Log.w("ScanCameraUtil", "getBackCameraId cannot get facing back id, bid:%d  num:%d, facing: %d", 0, java.lang.Integer.valueOf(numberOfCameras), java.lang.Integer.valueOf(i17));
        return new android.util.Pair(0, java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qt5.j0 b(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qt5.k0.b(int, int):qt5.j0");
    }
}
