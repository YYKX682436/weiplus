package com.tencent.youtu.sdkkitframework.liveness.risk;

/* loaded from: classes14.dex */
public class CameraRiskHelper {
    public static final java.lang.String CLIENT_DEFAULT = "client_default";
    private static final java.lang.String TAG = "CameraRiskHelper";
    protected java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> cameraRiskDataList;
    protected java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> cameraRiskOriginalDataList;
    private java.util.List<android.graphics.ColorMatrixColorFilter> changeColor;
    private boolean isHasExposureRisk;
    private boolean isHasWhiteBalanceRisk;
    private boolean isHasZoomRisk;
    private boolean isSupportExposure;
    private boolean isSupportWH;
    private boolean isSupportZoom;
    protected int originalExposureIndex;
    protected java.lang.String originalWhiteBalance;
    protected int originalZoomIndex;
    private final java.util.Map<java.lang.Float, java.lang.Integer> realExposureIndexMap;
    private final java.util.Map<java.lang.Integer, java.lang.String> realWhiteBalanceMap;
    private final java.util.Map<java.lang.Integer, java.lang.Integer> realZoomIndexMap;
    public volatile com.tencent.youtu.sdkkitframework.liveness.risk.SupportType supportType;
    public android.graphics.ColorMatrixColorFilter whiteColor;

    /* loaded from: classes14.dex */
    public static final class CameraRiskHelperHolder {
        private static final com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper INSTANCE = new com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper();

        private CameraRiskHelperHolder() {
        }
    }

    public static com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper getInstance() {
        return com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.CameraRiskHelperHolder.INSTANCE;
    }

    private void makeExposureRealData(java.util.Map<java.lang.Float, java.lang.Integer> map, com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData riskData) {
        float f17 = riskData.key1;
        float f18 = 0.0f;
        int i17 = 0;
        if (f17 == 0.0f) {
            this.realExposureIndexMap.put(java.lang.Float.valueOf(f17), 0);
            return;
        }
        if (java.lang.Math.abs(f17 - (-10.0f)) < 1.0E-6f) {
            riskData.key1 = 0.0f;
        }
        float f19 = 99.0f;
        for (java.util.Map.Entry<java.lang.Float, java.lang.Integer> entry : map.entrySet()) {
            float floatValue = entry.getKey().floatValue();
            float abs = java.lang.Math.abs(floatValue - riskData.key1);
            if (abs < f19) {
                i17 = entry.getValue().intValue();
                f18 = floatValue;
                f19 = abs;
            }
        }
        if (i17 != 0) {
            riskData.key1 = f18;
            this.realExposureIndexMap.put(java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i17));
        }
    }

    private void makeRealWhiteBalanceData(java.util.List<java.lang.String> list, com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData riskData) {
        if (list == null || list.isEmpty()) {
            if (this.isHasWhiteBalanceRisk) {
                this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_WH_ERROR;
            } else {
                this.isSupportWH = false;
            }
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "wb not support");
            return;
        }
        int i17 = riskData.key2;
        boolean z17 = true;
        if (i17 == 0) {
            if (!list.contains("auto")) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make wb 0 error");
                z17 = false;
            }
            this.realWhiteBalanceMap.put(java.lang.Integer.valueOf(riskData.key2), "auto");
        } else if (i17 == 1) {
            if (!list.contains("cloudy-daylight")) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make wb 1 error");
                z17 = false;
            }
            this.realWhiteBalanceMap.put(java.lang.Integer.valueOf(riskData.key2), "cloudy-daylight");
        } else if (i17 == 2) {
            if (!list.contains("daylight")) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make wb 2 error");
                z17 = false;
            }
            this.realWhiteBalanceMap.put(java.lang.Integer.valueOf(riskData.key2), "daylight");
        } else if (i17 == 3) {
            if (!list.contains("warm-fluorescent")) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make wb 3 error");
                z17 = false;
            }
            this.realWhiteBalanceMap.put(java.lang.Integer.valueOf(riskData.key2), "warm-fluorescent");
        } else if (i17 == 4) {
            if (!list.contains("fluorescent")) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make wb 4 error");
                z17 = false;
            }
            this.realWhiteBalanceMap.put(java.lang.Integer.valueOf(riskData.key2), "fluorescent");
        } else if (i17 == 5) {
            if (!list.contains("incandescent")) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make wb 5 error");
                z17 = false;
            }
            this.realWhiteBalanceMap.put(java.lang.Integer.valueOf(riskData.key2), "incandescent");
        }
        if (z17) {
            return;
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "wb not support");
        if (this.isHasWhiteBalanceRisk) {
            this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_WH_ERROR;
        } else {
            this.isSupportWH = false;
        }
    }

    private void makeZoomRealData(java.util.List<java.lang.Integer> list, com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData riskData) {
        int intValue;
        int i17 = 999;
        int i18 = 100;
        int i19 = 0;
        for (int i27 = 0; i27 < list.size() && (intValue = list.get(i27).intValue()) <= 200; i27++) {
            if (java.lang.Math.abs(intValue - riskData.key3) < i17) {
                i17 = java.lang.Math.abs(intValue - riskData.key3);
                i19 = i27;
                i18 = intValue;
            }
        }
        riskData.key3 = i18;
        this.realZoomIndexMap.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String paramToStr(android.hardware.Camera.Parameters parameters) {
        if (parameters == null) {
            return "null params";
        }
        try {
            return java.lang.String.format("[e=(min%s,cur%s,max%s), w=%s, z=%s]", java.lang.Integer.valueOf(parameters.getMinExposureCompensation()), java.lang.Integer.valueOf(parameters.getExposureCompensation()), java.lang.Integer.valueOf(parameters.getMaxExposureCompensation()), parameters.getWhiteBalance(), java.lang.Integer.valueOf(parameters.getZoom()));
        } catch (java.lang.Exception e17) {
            return e17.getLocalizedMessage();
        }
    }

    private void sendChangeCameraParamsEvent(android.hardware.Camera camera, android.hardware.Camera.Parameters parameters) {
        java.lang.Runnable runnable = new java.lang.Runnable(parameters, camera) { // from class: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.1
            long sendChangeTime = java.lang.System.currentTimeMillis();
            final /* synthetic */ android.hardware.Camera val$camera;
            final /* synthetic */ android.hardware.Camera.Parameters val$parameters;

            {
                this.val$parameters = parameters;
                this.val$camera = camera;
                com.tencent.youtu.sdkkitframework.common.YtLogger.w(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.TAG, "SendChange: param=" + com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.paramToStr(parameters));
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.youtu.sdkkitframework.common.YtLogger.w(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.TAG, java.lang.String.format("PreChange%s - SendChange%s = delay%sms, param=%s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.sendChangeTime), java.lang.Long.valueOf(currentTimeMillis - this.sendChangeTime), com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.paramToStr(this.val$parameters)));
                    this.val$camera.setParameters(this.val$parameters);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    com.tencent.youtu.sdkkitframework.common.YtLogger.w(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.TAG, java.lang.String.format("PostChange%s-PreChange%s=cost%sms, param=%s", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis), com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.paramToStr(this.val$parameters)));
                } catch (java.lang.Exception e17) {
                    com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.CAMERA_PARAM_TRANSFORM_ERROR;
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.TAG, "device not support:" + android.util.Log.getStackTraceString(e17));
                }
            }
        };
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.CAMERA_PARAM_CHANGE, runnable);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
    }

    public boolean changeCameraParameters(android.hardware.Camera camera, com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData riskData) {
        boolean z17 = false;
        if (this.supportType != com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.SUCCESS) {
            return false;
        }
        java.lang.Integer num = this.realExposureIndexMap.get(java.lang.Float.valueOf(riskData.key1));
        java.lang.Integer num2 = this.realZoomIndexMap.get(java.lang.Integer.valueOf(riskData.key3));
        java.lang.String str = this.realWhiteBalanceMap.get(java.lang.Integer.valueOf(riskData.key2));
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "change param e:" + riskData.key1 + ",z:" + riskData.key3 + ",wb:" + riskData.key2 + ",ei:" + num + ",zi:" + num2 + ",wbi:" + str);
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            z17 = changeCameraParameters(parameters, num, num2, str);
            if (z17) {
                sendChangeCameraParamsEvent(camera, parameters);
            }
        } catch (java.lang.Exception e17) {
            this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.CAMERA_PARAM_TRANSFORM_ERROR;
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "device not support:" + android.util.Log.getStackTraceString(e17));
        }
        return z17;
    }

    public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> getCameraRiskDataList() {
        return this.cameraRiskDataList;
    }

    public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> getCameraRiskOriginalDataList() {
        return this.cameraRiskOriginalDataList;
    }

    public android.graphics.ColorMatrixColorFilter getColorMatrixColorFilter() {
        android.graphics.ColorMatrixColorFilter remove = this.changeColor.remove(0);
        this.changeColor.add(remove);
        return remove;
    }

    public com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData getCurrentStateRiskData(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName stageName) {
        java.util.Iterator<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> it = this.cameraRiskDataList.iterator();
        while (it.hasNext()) {
            com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData next = it.next();
            if (next.stage_name.equalsIgnoreCase(stageName.name())) {
                return next;
            }
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "not find risk data:" + stageName.name());
        return null;
    }

    public void makeRiskRealData(java.util.List<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> list, android.hardware.Camera camera) {
        java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData> arrayList;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            if (parameters == null) {
                this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_ERROR;
                return;
            }
            try {
                int minExposureCompensation = parameters.getMinExposureCompensation();
                int maxExposureCompensation = parameters.getMaxExposureCompensation();
                if (minExposureCompensation == 0 && maxExposureCompensation == 0) {
                    if (this.isHasExposureRisk) {
                        this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_EXPOSURE_ERROR;
                        return;
                    }
                    this.isSupportExposure = false;
                }
                while (minExposureCompensation <= maxExposureCompensation) {
                    if (minExposureCompensation != 0) {
                        hashMap.put(java.lang.Float.valueOf(minExposureCompensation * parameters.getExposureCompensationStep()), java.lang.Integer.valueOf(minExposureCompensation));
                    }
                    minExposureCompensation++;
                }
            } catch (java.lang.Exception e17) {
                if (this.isHasExposureRisk) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make risk error:" + android.util.Log.getStackTraceString(e17));
                    this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_EXPOSURE_ERROR;
                    return;
                }
                this.isSupportExposure = false;
            }
            java.util.List<java.lang.Integer> list2 = null;
            try {
                if (parameters.isZoomSupported()) {
                    list2 = parameters.getZoomRatios();
                }
            } catch (java.lang.Exception e18) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make risk error:" + android.util.Log.getStackTraceString(e18));
            }
            if (list2 == null || list2.isEmpty()) {
                if (this.isHasZoomRisk) {
                    this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_ZOOM_ERROR;
                    return;
                }
                this.isSupportZoom = false;
            }
            try {
                for (com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData cameraRiskData : list) {
                    java.util.Iterator<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData> it = cameraRiskData.image_list.iterator();
                    long j17 = 0;
                    int i17 = 0;
                    while (it.hasNext()) {
                        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData next = it.next();
                        if (this.isSupportExposure || this.supportType != com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_EXPOSURE_ERROR) {
                            makeExposureRealData(hashMap, next);
                        }
                        if ((this.isSupportZoom || this.supportType != com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_ZOOM_ERROR) && list2 != null) {
                            makeZoomRealData(list2, next);
                        }
                        if (this.isSupportWH || this.supportType != com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_WH_ERROR) {
                            makeRealWhiteBalanceData(parameters.getSupportedWhiteBalance(), next);
                        }
                        j17 += next.key4;
                        i17++;
                    }
                    if (cameraRiskData.stage_name.equalsIgnoreCase(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName.stage_reflect.name()) && (arrayList = cameraRiskData.image_list) != null && !arrayList.isEmpty()) {
                        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData riskData = new com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData();
                        riskData.image_name = CLIENT_DEFAULT;
                        riskData.key4 = j17 / i17;
                        cameraRiskData.image_list.add(riskData);
                    }
                }
                this.originalExposureIndex = parameters.getExposureCompensation();
                if (parameters.isZoomSupported()) {
                    this.originalZoomIndex = parameters.getZoom();
                } else {
                    if (this.isHasZoomRisk) {
                        this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_ZOOM_ERROR;
                        return;
                    }
                    this.isSupportZoom = false;
                }
                java.lang.String whiteBalance = parameters.getWhiteBalance();
                this.originalWhiteBalance = whiteBalance;
                if (android.text.TextUtils.isEmpty(whiteBalance)) {
                    if (this.isHasWhiteBalanceRisk) {
                        this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_WH_ERROR;
                    } else {
                        this.isSupportWH = false;
                    }
                }
            } catch (java.lang.Exception e19) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make risk error:" + android.util.Log.getStackTraceString(e19));
                this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_ERROR;
            }
        } catch (java.lang.Exception e27) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "make risk error:" + android.util.Log.getStackTraceString(e27));
            this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.GET_CAMERA_PARAM_ERROR;
        }
    }

    public void resetCameraParams() {
        android.hardware.Camera camera = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getPlatformContext().currentCamera;
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "change param oei:" + this.originalExposureIndex + ",zi:" + this.originalZoomIndex + ",wbi:" + this.originalWhiteBalance);
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            if (changeCameraParameters(parameters, java.lang.Integer.valueOf(this.originalExposureIndex), java.lang.Integer.valueOf(this.originalZoomIndex), this.originalWhiteBalance)) {
                sendChangeCameraParamsEvent(camera, parameters);
            }
        } catch (java.lang.Exception e17) {
            this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.CAMERA_PARAM_TRANSFORM_ERROR;
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "device not support:" + android.util.Log.getStackTraceString(e17));
        }
    }

    public boolean transformRiskData(org.json.JSONArray jSONArray) {
        unload();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData cameraRiskData = new com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData();
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                cameraRiskData.stage_name = jSONObject.getString("stage_name");
                cameraRiskData.ui_start_delay = jSONObject.getInt("ui_start_delay");
                cameraRiskData.ui_end_delay = jSONObject.getInt("ui_end_delay");
                cameraRiskData.image_list = new java.util.ArrayList<>();
                org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("image_list");
                for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                    org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i18);
                    com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData riskData = new com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData();
                    riskData.task_type = new java.util.ArrayList<>();
                    org.json.JSONArray jSONArray3 = jSONObject2.getJSONArray("task_type");
                    for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                        riskData.task_type.add(java.lang.Integer.valueOf(jSONArray3.getInt(i19)));
                    }
                    riskData.image_name = jSONObject2.getString("image_name");
                    float f17 = (float) jSONObject2.getDouble("key1");
                    riskData.key1 = f17;
                    if (f17 != 0.0f && !this.isHasExposureRisk) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "has e risk");
                        this.isHasExposureRisk = true;
                    }
                    int i27 = jSONObject2.getInt("key2");
                    riskData.key2 = i27;
                    if (i27 != 0 && !this.isHasWhiteBalanceRisk) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "has wb risk");
                        this.isHasWhiteBalanceRisk = true;
                    }
                    int i28 = jSONObject2.getInt("key3");
                    riskData.key3 = i28;
                    if (i28 != 100 && !this.isHasZoomRisk) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "has z risk");
                        this.isHasZoomRisk = true;
                    }
                    riskData.key4 = jSONObject2.getInt("key4");
                    cameraRiskData.image_list.add(riskData);
                }
                this.cameraRiskDataList.add(cameraRiskData);
            } catch (org.json.JSONException e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "transform json to risk error:" + android.util.Log.getStackTraceString(e17));
                return false;
            }
        }
        this.cameraRiskOriginalDataList = new java.util.ArrayList<>();
        java.util.Iterator<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> it = this.cameraRiskDataList.iterator();
        while (it.hasNext()) {
            this.cameraRiskOriginalDataList.add(it.next().m427clone());
        }
        makeRiskRealData(this.cameraRiskDataList, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getPlatformContext().currentCamera);
        return true;
    }

    public void unload() {
        this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.SUCCESS;
        this.cameraRiskDataList.clear();
        this.cameraRiskOriginalDataList.clear();
        this.realExposureIndexMap.clear();
        this.realZoomIndexMap.clear();
        this.realWhiteBalanceMap.clear();
        this.isSupportExposure = true;
        this.isSupportWH = true;
        this.isSupportZoom = true;
        this.isHasZoomRisk = false;
        this.isHasWhiteBalanceRisk = false;
        this.isHasExposureRisk = false;
    }

    private CameraRiskHelper() {
        this.cameraRiskDataList = new java.util.ArrayList<>();
        this.cameraRiskOriginalDataList = new java.util.ArrayList<>();
        this.realExposureIndexMap = new java.util.HashMap();
        this.realZoomIndexMap = new java.util.HashMap();
        this.realWhiteBalanceMap = new java.util.HashMap();
        this.changeColor = new java.util.LinkedList();
        this.originalExposureIndex = 0;
        this.originalZoomIndex = 0;
        this.originalWhiteBalance = "auto";
        this.supportType = com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.SUCCESS;
        this.isSupportZoom = true;
        this.isSupportWH = true;
        this.isSupportExposure = true;
        this.isHasZoomRisk = false;
        this.isHasExposureRisk = false;
        this.isHasWhiteBalanceRisk = false;
        this.changeColor.add(new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 230.0f, 0.0f, 0.0f, 0.0f, 0.0f, 53.0f, 0.0f, 0.0f, 0.0f, 0.0f, 135.0f, 0.0f, 0.0f, 0.0f, 0.0f, 242.0f}));
        this.changeColor.add(new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 31.0f, 0.0f, 0.0f, 0.0f, 0.0f, 191.0f, 0.0f, 0.0f, 0.0f, 0.0f, 70.0f, 0.0f, 0.0f, 0.0f, 0.0f, 242.0f}));
        this.changeColor.add(new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 55.0f, 0.0f, 0.0f, 0.0f, 0.0f, 30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 242.0f}));
        this.whiteColor = new android.graphics.ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    private boolean changeCameraParameters(android.hardware.Camera.Parameters parameters, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
        boolean z17;
        if (this.isSupportExposure && this.isHasExposureRisk && parameters.getExposureCompensation() != num.intValue()) {
            parameters.setExposureCompensation(num.intValue());
            z17 = true;
        } else {
            z17 = false;
        }
        if (this.isSupportZoom && this.isHasZoomRisk && parameters.getZoom() != num2.intValue()) {
            parameters.setZoom(num2.intValue());
            z17 = true;
        }
        if (!this.isSupportWH || !this.isHasWhiteBalanceRisk || parameters.getWhiteBalance().equalsIgnoreCase(str)) {
            return z17;
        }
        parameters.setWhiteBalance(str);
        return true;
    }
}
