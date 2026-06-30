package com.tencent.youtu.ytposedetect.manager;

/* loaded from: classes14.dex */
public class PoseDetectProcessManager {
    private static final java.lang.String TAG = "FaceDetectProcess";
    public int mCameraRotate;
    public boolean mIsDetecting = false;
    private android.hardware.Camera mCamera = null;
    private android.hardware.Camera.Parameters mCameraParameters = null;
    public int mDesiredPreviewWidth = 640;
    public int mDesiredPreviewHeight = 480;

    private int setCamera(android.content.Context context, android.hardware.Camera camera, int i17) {
        this.mCamera = camera;
        int i18 = 3;
        int i19 = 0;
        while (i18 > 0) {
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                this.mCameraParameters = parameters;
                this.mDesiredPreviewHeight = parameters.getPreviewSize().height;
                this.mDesiredPreviewWidth = this.mCameraParameters.getPreviewSize().width;
                com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[PoseDetectProcessManager.setCamera] mDesiredPreviewWidth: " + this.mDesiredPreviewWidth + " mDesiredPreviewHeight: " + this.mDesiredPreviewHeight);
                i18 = 0;
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[PoseDetectProcessManager.setCamera] failed:" + e17 + " retry " + i18);
                i18 += -1;
                try {
                    java.lang.Thread.sleep(10L);
                } catch (java.lang.InterruptedException e18) {
                    com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[PoseDetectProcessManager.setCamera] sleep failed:" + e18);
                }
                if (i18 == 0) {
                    i19 = 3;
                }
            }
        }
        return i19;
    }

    public void clearAll() {
        restoreCamera();
    }

    public void finalize() {
        super.finalize();
    }

    public void initAll() {
    }

    public int poseDetect(float[] fArr, float[] fArr2, int i17, byte[] bArr, float f17, float f18, float f19, int i18) {
        return com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.poseDetect(fArr, fArr2, i17, bArr, this.mDesiredPreviewWidth, this.mDesiredPreviewHeight, com.tencent.youtu.ytcommon.tools.YTCameraSetting.getRotateTag(this.mCameraRotate, 1), f17, f18, f19, i18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void restoreCamera() {
        android.hardware.Camera.Parameters parameters;
        android.hardware.Camera camera = this.mCamera;
        if (camera == null || (parameters = this.mCameraParameters) == null) {
            return;
        }
        try {
            try {
                camera.setParameters(parameters);
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "restoreCamera failed. ");
                com.tencent.youtu.ytcommon.tools.YTException.report(e17);
            }
        } finally {
            this.mCamera = null;
            this.mCameraParameters = null;
        }
    }

    public void start(android.content.Context context, android.hardware.Camera camera, int i17, com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult poseDetectResult) {
        if (this.mIsDetecting) {
            com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "Restart FaceDetect process. YTPoseDetectInterface.stop() should be called before the next start, or maybe camera's parameter may be setting wrong.");
        }
        int camera2 = setCamera(context, camera, i17);
        if (camera2 != 0) {
            poseDetectResult.onFailed(camera2, "set camera failed", "reset again");
            return;
        }
        this.mCameraRotate = com.tencent.youtu.ytcommon.tools.YTCameraSetting.getVideoRotate(context, i17);
        this.mIsDetecting = true;
        poseDetectResult.onSuccess();
    }

    public void stop() {
        if (this.mIsDetecting) {
            this.mIsDetecting = false;
            restoreCamera();
            com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.resetDetect();
        }
    }
}
