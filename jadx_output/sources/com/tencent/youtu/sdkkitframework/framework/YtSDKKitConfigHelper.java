package com.tencent.youtu.sdkkitframework.framework;

/* loaded from: classes14.dex */
public class YtSDKKitConfigHelper {
    private static final java.lang.String TAG = "YtSDKKitConfigHelper";
    private static final java.util.HashMap<com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode, java.lang.String> SDK_SETTINGS = new java.util.HashMap<com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode, java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.1
        {
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE, "ocr_settings");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE, "silent_settings");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE, "action_settings");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE, "reflect_settings");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE, "action+reflect_settings");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_DETECTONLY_TYPE, "detectonly_settings");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_VIID_TYPE, "ocr_video_ident_settings");
        }
    };
    private static final java.util.HashMap<com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode, java.lang.String> UI_SETTINGS = new java.util.HashMap<com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode, java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.2
        {
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE, "ocr_card_ui");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE, "silent_ui");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE, "action_ui");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE, "reflect_ui");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE, "action+reflect_ui");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_DETECTONLY_TYPE, "detectonly_ui");
            put(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_VIID_TYPE, "ocr_video_ident_ui");
        }
    };

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper$9, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode;

        static {
            int[] iArr = new int[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values().length];
            $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode = iArr;
            try {
                iArr[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_DETECTONLY_TYPE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_VIID_TYPE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static java.lang.String getConfigStringBy(org.json.JSONObject jSONObject, java.lang.String str, boolean z17) {
        java.lang.String str2;
        try {
            str2 = jSONObject.getString(str);
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Parse json object failed " + e17.getLocalizedMessage());
            str2 = null;
        }
        if (z17 && (str2 == null || str2.equals(""))) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Parse json object failed " + str + "参数解析失败, 不存在或者不能为空");
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_JSON_PARAM_ERROR, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_PARAM_ERROR);
            java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_JSON_PARAM_ERROR));
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_JSON_PARAM_ERROR, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_PARAM_ERROR, str + "参数解析失败, 不存在或者不能为空"));
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
        }
        return str2;
    }

    public static java.util.ArrayList<java.lang.String> getPipleStateNames(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode) {
        switch (com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.AnonymousClass9.$SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[ytSDKKitFrameworkWorkMode.ordinal()]) {
            case 1:
                return new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.3
                    {
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.OCR_AUTO_DETECT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.OCR_MANUAL_DETECT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_OCR_REQ_RESULT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 2:
            case 3:
                return new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.4
                    {
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 4:
                return new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.5
                    {
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 5:
                return new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.6
                    {
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.START_CAMERA_RISK_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECTION_CAMERA_RISK_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECTION_END_CAMERA_RISK_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
                    }
                };
            case 6:
                return new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.7
                    {
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.DETECTONLY_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                    }
                };
            case 7:
                return new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.8
                    {
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.OCR_VIID_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_OCR_REQ_RESULT_STATE));
                        add(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                    }
                };
            default:
                return null;
        }
    }

    public static org.json.JSONObject getSDKConfig(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, org.json.JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(SDK_SETTINGS.get(ytSDKKitFrameworkWorkMode));
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, e17.getMessage());
            return null;
        }
    }

    public static org.json.JSONObject getUIConfig(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, org.json.JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(UI_SETTINGS.get(ytSDKKitFrameworkWorkMode));
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, e17.getMessage());
            return null;
        }
    }

    public static void setSDKConfig(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            jSONObject.put(SDK_SETTINGS.get(ytSDKKitFrameworkWorkMode), jSONObject2);
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, e17.getMessage());
        }
    }

    public static void setUIConfig(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            jSONObject.put(UI_SETTINGS.get(ytSDKKitFrameworkWorkMode), jSONObject2);
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, e17.getMessage());
        }
    }
}
