package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class DetectOnlyState extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    private static final java.lang.String TAG = "DetectOnlyState";
    private boolean isLoadResourceOnline = false;
    private java.lang.String resourceDownloadPath = "";
    private boolean needBigFaceMode = false;
    private int minFaceSize = 80;

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            if (jSONObject.has("resource_online")) {
                this.isLoadResourceOnline = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.resourceDownloadPath = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.needBigFaceMode = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("min_face_size")) {
                this.minFaceSize = jSONObject.getInt("min_face_size");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
        if (!this.isLoadResourceOnline) {
            com.tencent.youtu.sdkkitframework.common.FileUtils.loadLibrary("YTFaceTrackPro2");
        }
        android.content.Context context = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentAppContext;
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.isLoadResourceOnline) {
            absolutePath = this.resourceDownloadPath;
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "Use online path:" + absolutePath);
        } else {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "Use local path:" + absolutePath);
        }
        java.lang.String[] strArr = {"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"};
        if (!this.isLoadResourceOnline) {
            for (int i17 = 0; i17 < 4; i17++) {
                java.lang.String str2 = strArr[i17];
                android.content.res.AssetManager assets = context.getAssets();
                com.tencent.youtu.sdkkitframework.common.FileUtils.copyAsset(assets, "FaceTrackModels/detector/" + str2, absolutePath + "/" + str2);
            }
        }
        java.lang.String[] strArr2 = {"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"};
        if (!this.isLoadResourceOnline) {
            for (int i18 = 0; i18 < 5; i18++) {
                java.lang.String str3 = strArr2[i18];
                android.content.res.AssetManager assets2 = context.getAssets();
                com.tencent.youtu.sdkkitframework.common.FileUtils.copyAsset(assets2, "FaceTrackModels/ufa/" + str3, absolutePath + "/" + str3);
            }
        }
        java.lang.String[] strArr3 = {"rotBasis.bin"};
        if (!this.isLoadResourceOnline) {
            java.lang.String str4 = strArr3[0];
            android.content.res.AssetManager assets3 = context.getAssets();
            com.tencent.youtu.sdkkitframework.common.FileUtils.copyAsset(assets3, "FaceTrackModels/poseest/" + str4, absolutePath + "/" + str4);
        }
        int GlobalInit = com.tencent.youtu.ytfacetrack.YTFaceTrack.GlobalInit(absolutePath + "/");
        if (GlobalInit != 0) {
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(GlobalInit, "failed to init face trace sdk");
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(GlobalInit) { // from class: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState.1
                final /* synthetic */ int val$r;

                {
                    this.val$r = GlobalInit;
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_PARAM_ERROR, "检测初始化失败" + GlobalInit));
                }
            });
            return;
        }
        com.tencent.youtu.ytfacetrack.param.YTFaceDetectParam GetFaceDetectParam = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().GetFaceDetectParam();
        java.lang.String str5 = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str5, "big face mode" + this.needBigFaceMode);
        GetFaceDetectParam.bigger_face_mode = this.needBigFaceMode;
        GetFaceDetectParam.min_face_size = this.minFaceSize;
        com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceDetectParam(GetFaceDetectParam);
        com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam GetFaceTrackParam = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().GetFaceTrackParam();
        GetFaceTrackParam.need_pose_estimate = false;
        GetFaceTrackParam.single_detect_mode = true;
        GetFaceTrackParam.detect_interval = -1;
        com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceTrackParam(GetFaceTrackParam);
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str5, "Detect version:" + com.tencent.youtu.ytfacetrack.YTFaceTrack.Version);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        super.update(bArr, i17, i18, i19, j17);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i17, i18, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(bArr));
        android.graphics.Rect[] GetFaceRect = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().GetFaceRect(com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().GetYTImageBitmap(createBitmap, 1));
        if (GetFaceRect == null) {
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR, "detecet failed");
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState.2
                {
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR));
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "{\"errorcode\":3145728,\"errormsg\":\"检测失败\"}");
                }
            });
            return;
        }
        java.lang.String str = "[";
        for (int i27 = 0; i27 < GetFaceRect.length; i27++) {
            android.graphics.Rect rect = GetFaceRect[i27];
            int i28 = rect.left;
            int i29 = rect.top;
            str = str + "{\"rect\":{\"x\":" + i28 + ",\"y\":" + i29 + ",\"w\":" + (rect.right - i28) + ",\"h\":" + (rect.bottom - i29) + "}}";
            if (i27 < GetFaceRect.length - 1) {
                str = str + ",";
            }
        }
        java.lang.String str2 = "{\"errorcode\":0,\"errormsg\":\"OK\",\"face_count\":" + GetFaceRect.length + ",\"face_rects\":" + (str + "]") + "}";
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo("errorcode: 0, face_count: " + GetFaceRect.length);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(str2) { // from class: com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState.3
            final /* synthetic */ java.lang.String val$message;

            {
                this.val$message = str2;
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_SUCCEED);
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED);
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 0);
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str2);
            }
        });
    }
}
