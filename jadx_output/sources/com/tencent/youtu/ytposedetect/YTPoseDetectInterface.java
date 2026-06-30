package com.tencent.youtu.ytposedetect;

/* loaded from: classes14.dex */
public class YTPoseDetectInterface {
    private static final java.lang.String TAG = "YoutuFaceDetect";
    public static final java.lang.String VERSION = "3.5.6.4";
    private static com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult mCheckResult;
    private static int mInitModel;
    private static boolean mIsStarted;
    public static int mModelRetainCount;
    private static com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager mPoseDetectProcessManager;

    /* loaded from: classes6.dex */
    public interface PoseDetectGetBestImage {
        void onGetBestImage(byte[] bArr, int i17, int i18);
    }

    /* loaded from: classes6.dex */
    public interface PoseDetectGetImage {
        void onGetImage(byte[] bArr, int i17, int i18);
    }

    /* loaded from: classes6.dex */
    public interface PoseDetectLiveType {
        public static final int LIVETYPE_BLINK_EYE = 1;
        public static final int LIVETYPE_NOD_HEAD = 3;
        public static final int LIVETYPE_OPEN_MOUTH = 2;
        public static final int LIVETYPE_SHAKE_HEAD = 4;
        public static final int LIVETYPE_SILENCE = 5;
    }

    /* loaded from: classes14.dex */
    public interface PoseDetectOnFrame {
        public static final int DETECT_AUTH_FAILED = 1;
        public static final int DETECT_NOT_CALL_START = 3;
        public static final int DETECT_NOT_INIT_MODEL = 2;
        public static final int DETECT_SUCCESS = 0;

        void onCanReflect();

        void onFailed(int i17, java.lang.String str, java.lang.String str2);

        void onRecordingDone(byte[][] bArr, int i17, int i18);

        void onSuccess(int i17);
    }

    /* loaded from: classes14.dex */
    public interface PoseDetectResult {
        public static final int ERROR_AUTH_FAILED = 1;
        public static final int ERROR_NOT_INIT_MODEL = 2;
        public static final int SUCCESS = 0;

        void onFailed(int i17, java.lang.String str, java.lang.String str2);

        void onSuccess();
    }

    /* loaded from: classes6.dex */
    public interface PoseDetectSafetyLevel {
        public static final int SAFETY_COUNT = 3;
        public static final int SAFETY_HIGH = 2;
        public static final int SAFETY_LOW = 1;
        public static final int SAFETY_RECOMMAND = 0;
    }

    /* loaded from: classes6.dex */
    public class PoseImage {
        byte[] data;
        int height;
        int width;

        public PoseImage() {
        }
    }

    public static com.tencent.youtu.ytposedetect.data.YTActRefData getActReflectData() {
        return com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getActionReflectData(com.tencent.youtu.ytcommon.tools.YTCameraSetting.getRotateTag(mPoseDetectProcessManager.mCameraRotate, 1));
    }

    public static void getBestImage(com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectGetBestImage poseDetectGetBestImage, boolean z17) {
        int rotateTag = z17 ? com.tencent.youtu.ytcommon.tools.YTCameraSetting.getRotateTag(mPoseDetectProcessManager.mCameraRotate, 1) : 1;
        byte[] bestImage = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getBestImage(rotateTag);
        if (rotateTag != 5 && rotateTag != 6 && rotateTag != 7 && rotateTag != 8) {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            poseDetectGetBestImage.onGetBestImage(bestImage, poseDetectProcessManager.mDesiredPreviewWidth, poseDetectProcessManager.mDesiredPreviewHeight);
        } else {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager2 = mPoseDetectProcessManager;
            poseDetectGetBestImage.onGetBestImage(bestImage, poseDetectProcessManager2.mDesiredPreviewHeight, poseDetectProcessManager2.mDesiredPreviewWidth);
        }
    }

    public static com.tencent.youtu.ytposedetect.YTPoseImage getEyeImage(int i17) {
        com.tencent.youtu.ytposedetect.YTPoseImage yTPoseImage = new com.tencent.youtu.ytposedetect.YTPoseImage();
        yTPoseImage.yuvRotateData = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getEyeImage(i17);
        if (i17 == 5 || i17 == 6 || i17 == 7 || i17 == 8) {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager.mDesiredPreviewHeight;
            yTPoseImage.height = poseDetectProcessManager.mDesiredPreviewWidth;
        } else {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager2 = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager2.mDesiredPreviewWidth;
            yTPoseImage.height = poseDetectProcessManager2.mDesiredPreviewHeight;
        }
        return yTPoseImage;
    }

    public static com.tencent.youtu.ytposedetect.YTPoseImage getMouthImage(int i17) {
        com.tencent.youtu.ytposedetect.YTPoseImage yTPoseImage = new com.tencent.youtu.ytposedetect.YTPoseImage();
        yTPoseImage.yuvRotateData = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getMouthImage(i17);
        if (i17 == 5 || i17 == 6 || i17 == 7 || i17 == 8) {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager.mDesiredPreviewHeight;
            yTPoseImage.height = poseDetectProcessManager.mDesiredPreviewWidth;
        } else {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager2 = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager2.mDesiredPreviewWidth;
            yTPoseImage.height = poseDetectProcessManager2.mDesiredPreviewHeight;
        }
        return yTPoseImage;
    }

    public static java.lang.String getVersion() {
        return "jar3.5.6.4_native" + com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getVersion();
    }

    public static int initModel() {
        try {
            com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.initModel] ---");
            if (mInitModel > 0) {
                com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.initModel] has already inited.");
                mInitModel++;
                return 0;
            }
            int initModel = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.initModel("");
            if (initModel != 0) {
                return initModel;
            }
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = new com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager();
            mPoseDetectProcessManager = poseDetectProcessManager;
            poseDetectProcessManager.initAll();
            mInitModel++;
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "initModel failed. message: " + e17.getMessage());
            com.tencent.youtu.ytcommon.tools.YTException.report(e17);
            return 10;
        }
    }

    public static boolean isDetecting() {
        com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
        return poseDetectProcessManager != null && poseDetectProcessManager.mIsDetecting;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void noticeFailed(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeFailed] resultCode: " + i17 + " \r\nmessage: " + str + " \r\ntips: " + str2);
        mPoseDetectProcessManager.restoreCamera();
        mCheckResult.onFailed(i17, str, str2);
        mCheckResult = null;
        mIsStarted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void noticeSuccess() {
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeSuccess] ---");
        mCheckResult.onSuccess();
        mCheckResult = null;
        mIsStarted = true;
    }

    public static void poseDetect(float[] fArr, float[] fArr2, int i17, byte[] bArr, android.hardware.Camera camera, float f17, float f18, float f19, com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame poseDetectOnFrame, int i18) {
        if (mInitModel <= 0) {
            poseDetectOnFrame.onFailed(2, "Not init model on poseDetect.", "Call YTPoseDetectInterface.initModel() before.");
            return;
        }
        if (!mIsStarted) {
            poseDetectOnFrame.onFailed(3, "Not call start() interface before.", "Call YTPoseDetectInterface.start() before.");
            return;
        }
        poseDetectOnFrame.onSuccess(mPoseDetectProcessManager.poseDetect(fArr, fArr2, i17, bArr, f17, f18, f19, i18));
        if (com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.canReflect()) {
            poseDetectOnFrame.onCanReflect();
        }
        if (com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.isRecordingDone()) {
            byte[][] frameList = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getFrameList();
            int rotateTag = com.tencent.youtu.ytcommon.tools.YTCameraSetting.getRotateTag(mPoseDetectProcessManager.mCameraRotate, 1);
            com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.poseDetect] list num: " + frameList.length);
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            int i19 = poseDetectProcessManager.mDesiredPreviewWidth;
            int i27 = poseDetectProcessManager.mDesiredPreviewHeight;
            if (i18 == 1 && (rotateTag == 5 || rotateTag == 6 || rotateTag == 7 || rotateTag == 8)) {
                i19 = i27;
                i27 = i19;
            }
            poseDetectOnFrame.onRecordingDone(frameList, i19, i27);
        }
    }

    public static void releaseModel() {
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.finalize] ---");
        int i17 = mInitModel - 1;
        mInitModel = i17;
        if (i17 <= 0) {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            if (poseDetectProcessManager != null) {
                poseDetectProcessManager.clearAll();
            }
            com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.releaseAll();
            mInitModel = 0;
        }
    }

    public static void reset() {
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.resetDetect();
    }

    public static void setSafetyLevel(int i17) {
        if (i17 < 0 || i17 >= 3) {
            return;
        }
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.setSafetyLevel(i17);
    }

    public static int start(android.content.Context context, android.hardware.Camera camera, int i17, com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult poseDetectResult) {
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.start] ---");
        if (poseDetectResult == null) {
            return -1;
        }
        mCheckResult = poseDetectResult;
        if (mInitModel > 0) {
            mPoseDetectProcessManager.start(context, camera, i17, new com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult() { // from class: com.tencent.youtu.ytposedetect.YTPoseDetectInterface.1
                @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult
                public void onFailed(int i18, java.lang.String str, java.lang.String str2) {
                    com.tencent.youtu.ytposedetect.YTPoseDetectInterface.noticeFailed(i18, str, str2);
                }

                @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult
                public void onSuccess() {
                    com.tencent.youtu.ytposedetect.YTPoseDetectInterface.noticeSuccess();
                }
            });
            return 0;
        }
        noticeFailed(2, "Not init model.", "Call YTPoseDetectInterface.initModel() before.");
        return 0;
    }

    public static void stop() {
        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.stop] ---");
        com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
        if (poseDetectProcessManager != null) {
            poseDetectProcessManager.stop();
        }
        mIsStarted = false;
    }

    public static com.tencent.youtu.ytposedetect.YTPoseImage getBestImage(int i17) {
        com.tencent.youtu.ytposedetect.YTPoseImage yTPoseImage = new com.tencent.youtu.ytposedetect.YTPoseImage();
        yTPoseImage.yuvRotateData = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getBestImage(i17);
        if (i17 != 5 && i17 != 6 && i17 != 7 && i17 != 8) {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager.mDesiredPreviewWidth;
            yTPoseImage.height = poseDetectProcessManager.mDesiredPreviewHeight;
        } else {
            com.tencent.youtu.ytposedetect.manager.PoseDetectProcessManager poseDetectProcessManager2 = mPoseDetectProcessManager;
            yTPoseImage.width = poseDetectProcessManager2.mDesiredPreviewHeight;
            yTPoseImage.height = poseDetectProcessManager2.mDesiredPreviewWidth;
        }
        return yTPoseImage;
    }
}
