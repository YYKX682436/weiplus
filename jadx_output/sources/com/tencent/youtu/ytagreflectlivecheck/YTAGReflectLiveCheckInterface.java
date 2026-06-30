package com.tencent.youtu.ytagreflectlivecheck;

/* loaded from: classes14.dex */
public class YTAGReflectLiveCheckInterface {
    private static int ERRCODE_GET_ACTREFLECTDATA_FAILED = 4;
    private static int ERRCODE_JNI_DETECT_FAILED = 3;
    private static int ERRCODE_JSON_DECODE_FAILED = 2;
    private static int ERRCODE_NET_RETURN_PARSE_NULL = 0;
    private static int ERRCODE_UPLOAD_VIDEO_FAILED = 1;
    private static final java.lang.String TAG = "YoutuLightLiveCheck";
    public static final java.lang.String VERSION = "3.6.9.2";
    public static java.lang.String mAppId = "";
    private static android.hardware.Camera mCamera;
    private static int mCameraRotatedTag;
    private static com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult mCheckResult;
    private static java.lang.String mColorSeq;
    private static com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker mGetValueTimer;
    private static int mOnGetValueCount;
    private static com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener mReflectListener;
    public static com.tencent.youtu.ytagreflectlivecheck.notice.YTReflectNotice mReflectNotice;
    private static int mState;
    public static com.tencent.youtu.ytagreflectlivecheck.YTAGReflectSettings mAGSettings = new com.tencent.youtu.ytagreflectlivecheck.YTAGReflectSettings();
    private static int mInitModel = 0;
    private static java.util.concurrent.locks.Lock initLock = new java.util.concurrent.locks.ReentrantLock();
    private static com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult getLiveStyleResultHandler = null;
    private static int mOverlayAlpha = 0;

    /* loaded from: classes14.dex */
    public interface GetLiveStyleResult {
        void onFailed(int i17, java.lang.String str, java.lang.String str2);

        void onSuccess(com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.YTLiveStyleReq yTLiveStyleReq, com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleResponse liveStyleResponse);
    }

    /* loaded from: classes14.dex */
    public interface IYTReflectListener {
        float onGetAppBrightness();

        void onReflectEvent(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17);

        void onReflectStart(long j17);
    }

    /* loaded from: classes14.dex */
    public interface LightLiveCheckResult {
        public static final int AUTH_FAILED = 1;
        public static final int FINISH_ERRORBASE = 300;
        public static final int INIT_ERRORBASE = 100;
        public static final int NOT_INIT_MODEL = 2;
        public static final int NOT_SET_RGBREQUEST = 4;
        public static final int NOT_SET_UPLOADREQUEST = 5;
        public static final int REFLECT_ERRORBASE = 200;
        public static final int SUCCESS = 0;
        public static final int USER_CANCEL = 3;

        void onFailed(int i17, java.lang.String str, java.lang.String str2);

        void onSuccess(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack fullPack);
    }

    /* loaded from: classes6.dex */
    public interface LightLiveProcessState {
        public static final int GET_RGBCONFIG = 1;
        public static final int HANGUP = 0;
        public static final int REFLECTING = 2;
        public static final int UPLOAD = 3;
    }

    /* loaded from: classes6.dex */
    public interface YTSAFETYLEVEL {
        public static final int SAFETY_HIGH = 2;
        public static final int SAFETY_LOW = 1;
        public static final int SAFETY_RECOMMEND = 0;
    }

    public static /* synthetic */ int access$008() {
        int i17 = mOnGetValueCount;
        mOnGetValueCount = i17 + 1;
        return i17;
    }

    public static void cancel() {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.cancel] --- ");
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRRelease();
    }

    public static com.tencent.youtu.ytagreflectlivecheck.YTAGReflectSettings getAGSettings() {
        return mAGSettings;
    }

    public static int getLiveCheckType(android.content.Context context, com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult getLiveStyleResult) {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] --- start");
        int i17 = 1;
        if (getLiveStyleResult != null) {
            if (context == null) {
                getLiveStyleResult.onFailed(1, "Input context is null.", "You can try to input getActivity().getApplicationContext() and test again.");
                i17 = 2;
            } else {
                if (getLiveStyleResultHandler != null) {
                    com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] repeated calls. this may cause the previous call lost callback.");
                }
                getLiveStyleResultHandler = getLiveStyleResult;
                mOnGetValueCount = 0;
                int start = com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.getInstance().start(context, new com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.OnGetValue() { // from class: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.1
                    @Override // com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.OnGetValue
                    public void onGetValue(float f17) {
                        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.access$008();
                        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onGetValue] get value: " + f17 + " mOnGetValueCount: " + com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mOnGetValueCount);
                        if (com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mOnGetValueCount > 1) {
                            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onGetValue] get value: " + f17);
                            if (com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mGetValueTimer != null) {
                                com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mGetValueTimer.cancel();
                                com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker unused = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mGetValueTimer = null;
                            }
                            if (com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.getLiveStyleResultHandler != null) {
                                com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.getLiveStyleResultHandler.onSuccess(new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.YTLiveStyleReq(f17, com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mAppId), new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleResponse());
                                com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult unused2 = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.getLiveStyleResultHandler = null;
                            }
                            com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.getInstance().stop();
                        }
                    }
                });
                if (start == 1) {
                    com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] Can't find light sensor.");
                    com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult getLiveStyleResult2 = getLiveStyleResultHandler;
                    if (getLiveStyleResult2 != null) {
                        getLiveStyleResult2.onSuccess(new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.YTLiveStyleReq(-1.0f, mAppId), new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleResponse());
                        getLiveStyleResultHandler = null;
                    }
                } else if (start != 0) {
                    com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult getLiveStyleResult3 = getLiveStyleResultHandler;
                    if (getLiveStyleResult3 != null) {
                        getLiveStyleResult3.onSuccess(new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.YTLiveStyleReq(com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.getInstance().getLux(), mAppId), new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleResponse());
                        getLiveStyleResultHandler = null;
                    }
                } else {
                    long j17 = 3000;
                    com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker timerWorker = new com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker(j17, j17) { // from class: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.2
                        @Override // com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker
                        public void onFinish() {
                            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onFinish] ");
                            if (com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.getLiveStyleResultHandler != null) {
                                com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.getLiveStyleResultHandler.onSuccess(new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.YTLiveStyleReq(-2.0f, com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mAppId), new com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleResponse());
                                com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult unused = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.getLiveStyleResultHandler = null;
                            }
                        }

                        @Override // com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker
                        public void onTick(long j18) {
                            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType.onTick] onTick");
                        }
                    };
                    mGetValueTimer = timerWorker;
                    timerWorker.start();
                }
                i17 = 0;
            }
        }
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.getLiveCheckType] --- finish. ret: " + i17);
        return i17;
    }

    public static com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawYuvData[] getRawYuvDatas() {
        return com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRGetRawYuvDatas();
    }

    public static com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener getReflectListener() {
        return mReflectListener;
    }

    public static synchronized int initModel(java.lang.String str, java.lang.String str2) {
        int i17;
        synchronized (com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.class) {
            try {
                try {
                    initLock.lock();
                    if (mInitModel > 0) {
                        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "initModel repeated calls.");
                    } else {
                        mAppId = str;
                        if (str == null) {
                            mAppId = "";
                        }
                    }
                    mInitModel++;
                    i17 = 0;
                } catch (java.lang.Exception e17) {
                    com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "initModel failed. message: " + e17.getMessage());
                    initLock.unlock();
                    i17 = -1;
                }
                com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.SetPipelineVersion(str2);
            } finally {
                initLock.unlock();
            }
        }
        return i17;
    }

    public static void onCameraChanged(int i17) {
        try {
            android.hardware.Camera.Parameters parameters = mCamera.getParameters();
            parameters.setExposureCompensation(i17);
            mCamera.setParameters(parameters);
        } catch (java.lang.Exception e17) {
            e17.getLocalizedMessage();
        }
    }

    public static int[] onFetchCameraInfo() {
        int i17;
        int i18;
        android.hardware.Camera.Parameters parameters;
        int i19 = 0;
        try {
            parameters = mCamera.getParameters();
            i17 = parameters.getExposureCompensation();
        } catch (java.lang.Exception e17) {
            e = e17;
            i17 = 0;
            i18 = 0;
        }
        try {
            try {
                i17 = java.lang.Integer.parseInt(parameters.get("iso"));
            } catch (java.lang.Exception e18) {
                e18.getLocalizedMessage();
            }
            i18 = parameters.getMinExposureCompensation();
        } catch (java.lang.Exception e19) {
            e = e19;
            i18 = 0;
            e.getLocalizedMessage();
            return new int[]{i17, i18, i19};
        }
        try {
            i19 = parameters.getMaxExposureCompensation();
        } catch (java.lang.Exception e27) {
            e = e27;
            e.getLocalizedMessage();
            return new int[]{i17, i18, i19};
        }
        return new int[]{i17, i18, i19};
    }

    public static void onFinish() {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "on finished");
        int FRDoDetectionYuvs = com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRDoDetectionYuvs(false, mCameraRotatedTag);
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "on finished " + FRDoDetectionYuvs);
        if (FRDoDetectionYuvs == 0) {
            mCheckResult.onSuccess(com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRGetAGin());
            return;
        }
        mCheckResult.onFailed(-1, "JNI return failed.[" + FRDoDetectionYuvs + "]", "Please make sure you have called the YTAGReflectLiveCheckInterface.onPreviewFrame during the hole reflecting process. Check log for more information. code: " + FRDoDetectionYuvs);
    }

    public static void onScreenChanged(int i17, int i18, int i19, int i27, float f17) {
        android.graphics.ColorMatrixColorFilter colorMatrixColorFilter = new android.graphics.ColorMatrixColorFilter(mOverlayAlpha != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, i18, 0.0f, 0.0f, 0.0f, 0.0f, i19, 0.0f, 0.0f, 0.0f, 0.0f, i27, 0.0f, 0.0f, 0.0f, i17, 0.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, i18, 0.0f, 0.0f, 0.0f, 0.0f, i19, 0.0f, 0.0f, 0.0f, 0.0f, i27, 0.0f, 0.0f, 0.0f, 0.0f, i17});
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener iYTReflectListener = mReflectListener;
        if (iYTReflectListener == null) {
            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "On reflection screen change failed:mReflectListener is null");
        } else {
            iYTReflectListener.onReflectEvent(colorMatrixColorFilter, f17);
        }
    }

    public static void onStateChanged(int i17) {
        mState = i17;
        try {
            if (i17 == 0) {
                android.hardware.Camera.Parameters parameters = mCamera.getParameters();
                parameters.setAutoWhiteBalanceLock(true);
                mCamera.setParameters(parameters);
                return;
            }
            if (i17 == 1) {
                com.tencent.youtu.ytagreflectlivecheck.notice.YTReflectNotice yTReflectNotice = mReflectNotice;
                if (yTReflectNotice != null) {
                    yTReflectNotice.onDelayCalc();
                    return;
                }
                return;
            }
            if (i17 == 2) {
                try {
                    try {
                        android.hardware.Camera.Parameters parameters2 = mCamera.getParameters();
                        parameters2.setAutoWhiteBalanceLock(false);
                        mCamera.setParameters(parameters2);
                    } catch (java.lang.Exception e17) {
                        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "on finish get param failed:" + e17.getLocalizedMessage());
                    }
                } finally {
                    onFinish();
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "on state changed failed:" + e18.getLocalizedMessage());
        }
    }

    public static void pushImageData(byte[] bArr, int i17, int i18, long j17, int i19, float[] fArr, float f17, float f18, float f19) {
        int i27 = mState;
        if (i27 != 0) {
            if (i27 == 1) {
                com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[ReflectController.onPreviewFrameReceived] record ios");
                com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRPushISOImgYuv(bArr, i17, i18);
                com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRPushISOCaptureTime(com.tencent.youtu.ytagreflectlivecheck.jni.JNIUtils.getTimeval(j17));
                return;
            }
            return;
        }
        int FRGetConfigBegin = com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRGetConfigBegin() - 2;
        int FRGetConfigEnd = com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRGetConfigEnd() + 4;
        int FRGetTriggerTime = com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRGetTriggerTime();
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "onPreviewFrameReceived. beginFrame: " + FRGetConfigBegin + " endFrame: " + FRGetConfigEnd + " currentFrame: " + FRGetTriggerTime);
        if (FRGetTriggerTime <= FRGetConfigBegin || FRGetTriggerTime >= FRGetConfigEnd) {
            return;
        }
        java.lang.System.currentTimeMillis();
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "onPreviewFrameReceived. insertYuv and time");
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRPushYuv(bArr, i17, i18, j17, i19, fArr);
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRPushCaptureTime(com.tencent.youtu.ytagreflectlivecheck.jni.JNIUtils.getTimeval(j17));
    }

    public static synchronized void releaseModel() {
        synchronized (com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.class) {
            try {
                initLock.lock();
                int i17 = mInitModel - 1;
                mInitModel = i17;
                if (i17 <= 0) {
                    mInitModel = 0;
                    mReflectNotice = null;
                    mReflectListener = null;
                    com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker timerWorker = mGetValueTimer;
                    if (timerWorker != null) {
                        timerWorker.cancel();
                        mGetValueTimer = null;
                    }
                    getLiveStyleResultHandler = null;
                    mCamera = null;
                }
                initLock.unlock();
                com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.clearInstance();
            } catch (java.lang.Throwable th6) {
                initLock.unlock();
                throw th6;
            }
        }
    }

    public static void setAGSettings(com.tencent.youtu.ytagreflectlivecheck.YTAGReflectSettings yTAGReflectSettings) {
        mAGSettings = yTAGReflectSettings;
    }

    public static void setReflectListener(com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener iYTReflectListener) {
        mReflectListener = iYTReflectListener;
    }

    public static void setReflectNotice(com.tencent.youtu.ytagreflectlivecheck.notice.YTReflectNotice yTReflectNotice) {
        mReflectNotice = yTReflectNotice;
    }

    public static void setSafetyLevel(int i17) {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.setSafetyLevel] --- level: " + i17);
        mAGSettings.safetylevel = i17;
    }

    public static void setupConfig(java.lang.String str, java.lang.String str2) {
        if (str == "overlay_alpha") {
            try {
                mOverlayAlpha = java.lang.Integer.parseInt(str2);
            } catch (java.lang.NumberFormatException unused) {
                mOverlayAlpha = 0;
            }
        }
    }

    public static void start(android.content.Context context, android.hardware.Camera camera, int i17, java.lang.String str, com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult lightLiveCheckResult, int i18) {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[YTAGReflectLiveCheckInterface.start] ---");
        if (lightLiveCheckResult == null) {
            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "On reflection start failed:checkResult is null");
            return;
        }
        mCheckResult = lightLiveCheckResult;
        if (mInitModel <= 0) {
            lightLiveCheckResult.onFailed(2, "Not init model.", "Call YTAGReflectLiveCheckInterface.initModel() before.");
            return;
        }
        mCameraRotatedTag = i17;
        mColorSeq = str;
        mCamera = camera;
        long[] jArr = new long[2];
        if (mReflectListener == null) {
            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "On reflection start failed:mReflectListener is null");
        }
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener iYTReflectListener = mReflectListener;
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.getInstance().FRInit(false, str, mAGSettings.safetylevel, jArr, iYTReflectListener != null ? iYTReflectListener.onGetAppBrightness() : -1.0f, i18);
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "output duration ms" + jArr[0] + " " + jArr[1]);
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener iYTReflectListener2 = mReflectListener;
        if (iYTReflectListener2 != null) {
            iYTReflectListener2.onReflectStart(jArr[0]);
        }
    }
}
