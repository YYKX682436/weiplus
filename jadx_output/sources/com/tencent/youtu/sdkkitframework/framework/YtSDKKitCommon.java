package com.tencent.youtu.sdkkitframework.framework;

/* loaded from: classes14.dex */
public class YtSDKKitCommon {

    /* loaded from: classes14.dex */
    public static class ProcessHelper {
        public static float calcEyeScore(float[] fArr) {
            float f17 = fArr[32] - fArr[40];
            float f18 = fArr[33] - fArr[41];
            float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
            float f19 = fArr[44];
            float f27 = fArr[40];
            float f28 = fArr[45];
            float f29 = fArr[41];
            float abs = (java.lang.Math.abs(crossProduct(f17, f18, f19 - f27, f28 - f29)) + java.lang.Math.abs(crossProduct(f17, f18, fArr[36] - f27, fArr[37] - f29))) / (sqrt * sqrt);
            float f37 = fArr[56] - fArr[48];
            float f38 = fArr[57] - fArr[49];
            float sqrt2 = (float) java.lang.Math.sqrt((f37 * f37) + (f38 * f38));
            float f39 = fArr[60];
            float f47 = fArr[56];
            float f48 = fArr[61];
            float f49 = fArr[57];
            return abs + ((java.lang.Math.abs(crossProduct(f37, f38, f39 - f47, f48 - f49)) + java.lang.Math.abs(crossProduct(f37, f38, fArr[52] - f47, fArr[53] - f49))) / (sqrt2 * sqrt2));
        }

        public static float calcMouthScore(float[] fArr) {
            return java.lang.Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / java.lang.Math.abs(fArr[90] - fArr[102]);
        }

        public static float[] convert90PTo5P(float[] fArr) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i("ProcessHelper", "90 to 5 convert size:" + fArr.length);
            return new float[]{fArr[176], fArr[177], fArr[178], fArr[179], fArr[64], fArr[65], fArr[90], fArr[91], fArr[102], fArr[103]};
        }

        private static float crossProduct(float f17, float f18, float f19, float f27) {
            return (f17 * f27) - (f19 * f18);
        }

        public static float preCheckCloseEyeScore(float[] fArr) {
            float f17 = fArr[32] - fArr[40];
            float f18 = fArr[33] - fArr[41];
            float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
            float f19 = fArr[44];
            float f27 = fArr[40];
            float f28 = fArr[45];
            float f29 = fArr[41];
            float abs = (java.lang.Math.abs(crossProduct(f17, f18, f19 - f27, f28 - f29)) + java.lang.Math.abs(crossProduct(f17, f18, fArr[36] - f27, fArr[37] - f29))) / (sqrt * sqrt);
            float f37 = fArr[56] - fArr[48];
            float f38 = fArr[57] - fArr[49];
            float sqrt2 = (float) java.lang.Math.sqrt((f37 * f37) + (f38 * f38));
            float f39 = fArr[60];
            float f47 = fArr[56];
            float f48 = fArr[61];
            float f49 = fArr[57];
            float abs2 = (java.lang.Math.abs(crossProduct(f37, f38, f39 - f47, f48 - f49)) + java.lang.Math.abs(crossProduct(f37, f38, fArr[52] - f47, fArr[53] - f49))) / (sqrt2 * sqrt2);
            return abs > abs2 ? abs2 : abs;
        }
    }

    /* loaded from: classes14.dex */
    public static class StateNameHelper {
        private static java.util.HashMap<com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName, java.lang.String> _stateNameMap = new java.util.HashMap<com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName, java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.1
            {
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.UNKNOWN_STATE, "com.tencent.youtu.sdkkitframework.liveness.Unknown");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE, "com.tencent.youtu.sdkkitframework.framework.TimeoutState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE, "com.tencent.youtu.sdkkitframework.framework.IdleState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE, "com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.START_CAMERA_RISK_STATE, "com.tencent.youtu.sdkkitframework.liveness.StartCameraRiskState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE, "com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECTION_CAMERA_RISK_STATE, "com.tencent.youtu.sdkkitframework.liveness.ReflectionCameraRiskState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE, "com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECTION_END_CAMERA_RISK_STATE, "com.tencent.youtu.sdkkitframework.liveness.ReflectionEndCameraRiskState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.OCR_AUTO_DETECT_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrCardAutoDetectState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.OCR_MANUAL_DETECT_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrCardManualDetectState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE, "com.tencent.youtu.sdkkitframework.liveness.NetFetchState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_OCR_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.ocr.NetOcrReqResultState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.DETECTONLY_STATE, "com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState");
                put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.OCR_VIID_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrVideoIdentState");
            }
        };

        /* loaded from: classes14.dex */
        public enum StateClassName {
            UNKNOWN_STATE,
            TIMEOUT_STATE,
            IDLE_STATE,
            SILENT_STATE,
            ACTION_STATE,
            REFLECT_STATE,
            OCR_AUTO_DETECT_STATE,
            OCR_MANUAL_DETECT_STATE,
            NET_FETCH_STATE,
            NET_LIVENESS_REQ_RESULT_STATE,
            NET_OCR_REQ_RESULT_STATE,
            DETECTONLY_STATE,
            OCR_VIID_STATE,
            STATE_COUNT,
            START_CAMERA_RISK_STATE,
            REFLECTION_CAMERA_RISK_STATE,
            REFLECTION_END_CAMERA_RISK_STATE
        }

        public static java.lang.String classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName stateClassName) {
            return _stateNameMap.get(stateClassName);
        }

        public static com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName typeOfClassName(java.lang.String str) {
            for (java.util.Map.Entry<com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName, java.lang.String> entry : _stateNameMap.entrySet()) {
                if (entry.getValue().equals(str)) {
                    return entry.getKey();
                }
            }
            return com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.UNKNOWN_STATE;
        }
    }
}
