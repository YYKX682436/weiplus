package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class YtLivenessNetProtoHelper {
    private static final java.lang.String TAG = "YtLivenessNetProtoHelper";

    /* loaded from: classes14.dex */
    public static class ActionLiveReq {
        public java.lang.String action_str;
        public java.lang.String action_video;
        public java.lang.String app_id;
        public java.lang.String best_image;
        public java.lang.String business_id;
        public java.lang.String compare_image;
        public int compare_image_type;
        public boolean do_eye_detect;
        public boolean do_live;
        public boolean do_mouth_detect;
        public boolean get_more_image;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData select_data;
        public java.lang.String session_id;
    }

    /* loaded from: classes14.dex */
    public static class ActionLiveReqData {
        public java.lang.String actionStr;
        public java.lang.String actionVideo;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData baseInfo;
        public java.lang.String bestImage;
        public int colorNum;
        public java.lang.String config;
        public java.lang.String controlConfig;
        public boolean needEyeDetect;
        public boolean needMoreImage;
        public boolean needMouthDetect;
        public java.lang.String reflectConfig;
        public java.lang.String reservedfield;
        public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.SensorData> sensorData;
    }

    /* loaded from: classes14.dex */
    public static class ActionReflectLiveReq {
        public java.lang.String action_str;
        public java.lang.String action_video;
        public java.lang.String app_id;
        public java.lang.String business_id;
        public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> camera_config;
        public java.lang.String color_data;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo compare_image;
        public int compare_image_type;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo eye_image;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo live_image;
        public int mode;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo mouth_image;
        public int platform;
        public com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData reflect_data;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData select_data;
        public java.lang.String session_id;
    }

    /* loaded from: classes14.dex */
    public static class ActionReflectLiveReqData {
        public java.lang.String actionStr;
        public java.lang.String actionVideo;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData baseInfo;
        public java.lang.String colorData;
        public int colorNum;
        public java.lang.String controlConfig;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo eyeImage;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo liveImage;
        public int mode;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo mouthImage;
        public java.lang.String reflectConfig;
        public com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData reflectData;
        public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.SensorData> sensorData;
    }

    /* loaded from: classes14.dex */
    public static class FaceFrame {
        public java.lang.String image;
        public java.util.ArrayList<java.lang.Float> x_coordinates;
        public java.util.ArrayList<java.lang.Float> y_coordinates;
    }

    /* loaded from: classes14.dex */
    public static class FourLiveReq {
        public java.lang.String app_id;
        public java.lang.String compare_image;
        public java.lang.String validate_data;
        public java.lang.String video;
    }

    /* loaded from: classes14.dex */
    public static class FourLiveReqData {
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData baseInfoData;
        public java.lang.String validateData;
        public java.lang.String video;
    }

    /* loaded from: classes14.dex */
    public static class GetFourLiveTypeReq {
        public java.lang.String app_id;
        public java.lang.String seq;
    }

    /* loaded from: classes14.dex */
    public static class GetFourLiveTypeReqData {
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData baseInfo;
    }

    /* loaded from: classes14.dex */
    public static class GetLiveTypeReq {
        public java.lang.String app_id;
        public java.lang.String business_name;
        public java.lang.String person_id;
        public int platform;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData select_data;
        public java.lang.String session_id;
    }

    /* loaded from: classes14.dex */
    public static class GetLiveTypeReqData {
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData baseInfo;
        public int colorNum;
        public java.lang.String controlConfig;
        public java.lang.String reflectConfig;
    }

    /* loaded from: classes14.dex */
    public static class LipReadReqData {
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData baseInfo;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo bestImage;
        public java.lang.String faceExtraInfo;
        public float[] liveFivePoint;
        public java.lang.String liveImage;
        public java.lang.String mouth_lip_reading;
        public java.lang.String mouth_move;
        public java.lang.String validate_data;
        public java.lang.String voice;
    }

    /* loaded from: classes13.dex */
    public static class LiveStyleRequester {

        /* loaded from: classes13.dex */
        public static class LiveStyleAndroidData {
            public float lux = 0.0f;
            public java.lang.String build_brand = android.os.Build.BRAND;
            public java.lang.String build_model = android.os.Build.MODEL;
            public java.lang.String build_hardware = android.os.Build.HARDWARE;
            public java.lang.String build_display = android.os.Build.DISPLAY;
            public java.lang.String build_product = android.os.Build.PRODUCT;
            public java.lang.String build_device = android.os.Build.DEVICE;
            public java.lang.String android_apilevel = "" + android.os.Build.VERSION.SDK_INT;
            public java.lang.String android_version = android.os.Build.VERSION.RELEASE;

            public java.lang.String toString() {
                return "".concat(this.build_brand).concat(this.build_model).concat(this.build_hardware).concat(this.build_display).concat(this.build_product).concat(this.build_device);
            }
        }

        /* loaded from: classes13.dex */
        public static class SeleceData {
            public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.LiveStyleAndroidData android_data;
            public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> camera_config;
            public int change_point_num;
            public java.lang.String client_version;
            public java.lang.String config;
            public java.lang.String reflect_param;
            public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.SensorData> sensor_data;
            public int platform = 2;
            public int protocal = 1;
            public java.lang.String version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;

            public SeleceData(float f17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
                this.change_point_num = 2;
                com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.LiveStyleAndroidData liveStyleAndroidData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.LiveStyleAndroidData();
                this.android_data = liveStyleAndroidData;
                liveStyleAndroidData.lux = f17;
                this.change_point_num = i17;
                if (str != null && str.length() > 0) {
                    this.reflect_param = str;
                }
                if (str3 != null && str3.length() > 0) {
                    this.config = str3;
                }
                this.client_version = str2;
            }

            public java.lang.String getConfig() {
                return this.config;
            }

            public void setCameraConfig(java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> arrayList) {
                this.camera_config = arrayList;
            }

            public void setConfig(java.lang.String str) {
                this.config = str;
            }

            public java.lang.String toString() {
                java.lang.String concat = "".concat(java.lang.Integer.toString(this.platform)).concat(java.lang.Integer.toString(this.protocal)).concat(this.client_version).concat(this.android_data.toString());
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.TAG, "select_data_str: " + concat);
                return concat;
            }
        }

        /* loaded from: classes13.dex */
        public static class YTLiveStyleReq {
            public java.lang.String app_id;
            public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData select_data;
        }
    }

    /* loaded from: classes14.dex */
    public static class NetBaseInfoData {
        public java.lang.String appId;
        public java.lang.String businessId;
        public int liveType;
        public float lux;
        public java.lang.String personId;
        public java.lang.String personType;
        public java.lang.String reqType;
        public java.lang.String sessionId;
    }

    /* loaded from: classes14.dex */
    public static class PersonLive {
        public java.lang.String color_data;
        public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame> frames;
        public java.lang.String mouth_lip_reading;
        public java.lang.String mouth_move;
        public int platform;
        public com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData reflect_data;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData select_data;
        public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.SensorData> sensor_data;
        public java.lang.String validate_data;
        public java.lang.String voice;
    }

    /* loaded from: classes14.dex */
    public static class PersonLiveReq {
        public java.lang.String app_id;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo best_image;
        public java.lang.String business_name;
        public int live_type;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLive livedata;
        public java.lang.String mp_business_buffer;
        public java.lang.String person_id;
        public java.lang.String person_type;
        public java.lang.String req_type;
        public java.lang.String request_id;
        public int scene;
    }

    /* loaded from: classes14.dex */
    public static class PictureLiveDetectReq {
        public java.lang.String app_id;
        public java.util.ArrayList<java.lang.Float> five_point;
        public java.lang.String image;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData select_data;
        public java.lang.String session_id;
    }

    /* loaded from: classes14.dex */
    public static class PictureLiveReqData {
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData baseInfo;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo imageInfo;
        public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.SensorData> sensorData;
    }

    /* loaded from: classes14.dex */
    public static class ReflectLiveReq {
        public java.lang.String app_id;
        public java.lang.String business_id;
        public java.lang.String color_data;
        public java.lang.String compare_image;
        public int compare_image_type;
        public java.lang.String live_image;
        public int platform;
        public com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData reflect_data;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData select_data;
        public java.lang.String session_id;
    }

    /* loaded from: classes14.dex */
    public static class ReflectLiveReqData {
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData baseInfo;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo bestImage;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo closeEyeImage;
        public java.lang.String colorData;
        public int colorNum;
        public java.lang.String config;
        public java.lang.String liveImage;
        public com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo openMouthImage;
        public com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData reflectData;
        public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.SensorData> sensorData;
    }

    /* loaded from: classes13.dex */
    public static class SensorData {
        public long capture_time;
        public java.util.ArrayList<java.lang.Float> sensor_data;
        public int type;
    }

    /* loaded from: classes14.dex */
    public static class Version {
        public java.lang.String sdk_version = "";
        public java.lang.String ftrack_sdk_version = "";
        public java.lang.String freflect_sdk_version = "";
        public java.lang.String faction_sdk_version = "";

        public java.lang.String makeVersion() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sdk_version:");
            stringBuffer.append(this.sdk_version);
            stringBuffer.append(";ftrack_sdk_version:");
            stringBuffer.append(this.ftrack_sdk_version);
            if (this.faction_sdk_version != "") {
                stringBuffer.append(";faction_sdk_version:");
                stringBuffer.append(this.faction_sdk_version);
            }
            if (this.freflect_sdk_version != "") {
                stringBuffer.append(";freflect_sdk_version:");
                stringBuffer.append(this.freflect_sdk_version);
            }
            return stringBuffer.toString();
        }
    }

    public static java.lang.String makeActionLiveReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionLiveReqData actionLiveReqData) {
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionLiveReq actionLiveReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionLiveReq();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = actionLiveReqData.baseInfo;
        actionLiveReq.app_id = netBaseInfoData.appId;
        actionLiveReq.session_id = netBaseInfoData.sessionId;
        actionLiveReq.business_id = netBaseInfoData.businessId;
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version version = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version();
        version.sdk_version = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = com.tencent.youtu.ytfacetrack.YTFaceTrack.Version;
        version.faction_sdk_version = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getVersion();
        actionLiveReq.select_data = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData(actionLiveReqData.baseInfo.lux, actionLiveReqData.colorNum, actionLiveReqData.reflectConfig, version.makeVersion(), actionLiveReqData.controlConfig);
        actionLiveReq.action_str = actionLiveReqData.actionStr;
        actionLiveReq.action_video = actionLiveReqData.actionVideo;
        actionLiveReq.best_image = actionLiveReqData.bestImage;
        actionLiveReq.do_eye_detect = actionLiveReqData.needEyeDetect;
        actionLiveReq.do_mouth_detect = actionLiveReqData.needMouthDetect;
        actionLiveReq.do_live = true;
        android.graphics.Bitmap bitmap = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            actionLiveReq.compare_image = new java.lang.String(android.util.Base64.encode(byteArrayOutputStream.toByteArray(), 2));
            actionLiveReq.compare_image_type = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToComapreType;
        }
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(actionLiveReq);
    }

    public static java.lang.String makeActionReflectLiveReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionReflectLiveReqData actionReflectLiveReqData, boolean z17) {
        java.lang.String removeKey;
        java.lang.String str;
        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
        com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.makeActionStr((java.lang.String[]) stateByName.getStateDataBy("action_seq"));
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionReflectLiveReq actionReflectLiveReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionReflectLiveReq();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = actionReflectLiveReqData.baseInfo;
        actionReflectLiveReq.app_id = netBaseInfoData.appId;
        actionReflectLiveReq.session_id = netBaseInfoData.sessionId;
        actionReflectLiveReq.business_id = netBaseInfoData.businessId;
        actionReflectLiveReq.platform = 2;
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version version = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version();
        version.sdk_version = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = com.tencent.youtu.ytfacetrack.YTFaceTrack.Version;
        version.faction_sdk_version = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getVersion();
        version.freflect_sdk_version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;
        java.lang.String makeVersion = version.makeVersion();
        actionReflectLiveReq.action_video = actionReflectLiveReqData.actionVideo;
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData seleceData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData(actionReflectLiveReqData.baseInfo.lux, actionReflectLiveReqData.colorNum, actionReflectLiveReqData.reflectConfig, makeVersion, actionReflectLiveReqData.controlConfig);
        actionReflectLiveReq.select_data = seleceData;
        seleceData.setCameraConfig(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().getCameraRiskOriginalDataList());
        java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> cameraRiskDataList = com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().getCameraRiskDataList();
        if (cameraRiskDataList != null) {
            java.util.Iterator<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData> it = cameraRiskDataList.iterator();
            while (it.hasNext()) {
                com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData next = it.next();
                next.state = com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().supportType.value;
                java.util.Iterator<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData> it6 = next.image_list.iterator();
                while (it6.hasNext()) {
                    com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData next2 = it6.next();
                    if (com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().supportType != com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.SUCCESS) {
                        next2.image = "";
                        next2.checksum = "";
                        next2.timestamp = 0L;
                    } else if (next2 != null && (str = next2.image) != null) {
                        next2.checksum = com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.Checksum(str);
                    }
                }
            }
            actionReflectLiveReq.camera_config = cameraRiskDataList;
        }
        actionReflectLiveReq.action_video = actionReflectLiveReqData.actionVideo;
        java.lang.String str2 = actionReflectLiveReqData.controlConfig;
        if (z17) {
            java.lang.String Checksum = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.Checksum((byte[]) stateByName.getStateDataBy("frames"));
            removeKey = removeKey(str2, "sdcs").concat("&sdcs=" + com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getLiveSelectDataChecksum(actionReflectLiveReq.select_data.toString(), Checksum)).concat("&avcs=" + Checksum);
        } else {
            removeKey = removeKey(str2, "sdcs");
        }
        actionReflectLiveReq.select_data.setConfig(removeKey);
        actionReflectLiveReq.color_data = actionReflectLiveReqData.colorData;
        actionReflectLiveReq.action_str = actionReflectLiveReqData.actionStr;
        android.graphics.Bitmap bitmap = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            actionReflectLiveReq.compare_image = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream.toByteArray(), (float[]) null, (java.lang.String) null);
            actionReflectLiveReq.compare_image_type = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToComapreType;
        }
        actionReflectLiveReq.live_image = actionReflectLiveReqData.liveImage;
        actionReflectLiveReq.mouth_image = actionReflectLiveReqData.mouthImage;
        actionReflectLiveReq.eye_image = actionReflectLiveReqData.eyeImage;
        actionReflectLiveReq.mode = actionReflectLiveReqData.mode;
        actionReflectLiveReq.reflect_data = actionReflectLiveReqData.reflectData;
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(actionReflectLiveReq);
    }

    public static java.lang.String makeFourLiveReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FourLiveReqData fourLiveReqData) {
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FourLiveReq fourLiveReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FourLiveReq();
        fourLiveReq.app_id = fourLiveReqData.baseInfoData.appId;
        fourLiveReq.validate_data = fourLiveReqData.validateData;
        fourLiveReq.video = fourLiveReqData.video;
        android.graphics.Bitmap bitmap = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            fourLiveReq.compare_image = new java.lang.String(android.util.Base64.encode(byteArrayOutputStream.toByteArray(), 2));
        }
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(fourLiveReq);
    }

    public static java.lang.String makeGetFourLiveReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.GetFourLiveTypeReqData getFourLiveTypeReqData) {
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.GetFourLiveTypeReq getFourLiveTypeReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.GetFourLiveTypeReq();
        getFourLiveTypeReq.app_id = getFourLiveTypeReqData.baseInfo.appId;
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(getFourLiveTypeReq);
    }

    public static java.lang.String makeGetLiveTypeReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData) {
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.GetLiveTypeReq getLiveTypeReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.GetLiveTypeReq();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = getLiveTypeReqData.baseInfo;
        getLiveTypeReq.app_id = netBaseInfoData.appId;
        getLiveTypeReq.business_name = netBaseInfoData.businessId;
        getLiveTypeReq.person_id = netBaseInfoData.personId;
        getLiveTypeReq.platform = 2;
        getLiveTypeReq.session_id = netBaseInfoData.sessionId;
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version version = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version();
        version.sdk_version = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = com.tencent.youtu.ytfacetrack.YTFaceTrack.Version;
        if (com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            version.faction_sdk_version = com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getVersion();
        }
        version.freflect_sdk_version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;
        getLiveTypeReq.select_data = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData(getLiveTypeReqData.baseInfo.lux, getLiveTypeReqData.colorNum, getLiveTypeReqData.reflectConfig, version.makeVersion(), getLiveTypeReqData.controlConfig);
        getLiveTypeReq.select_data.setConfig(getLiveTypeReqData.controlConfig.concat("&sdcs=" + com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.Checksum(getLiveTypeReq.select_data.toString())));
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(getLiveTypeReq);
    }

    public static java.lang.String makeLipReadReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LipReadReqData lipReadReqData) {
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLiveReq personLiveReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLiveReq();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = lipReadReqData.baseInfo;
        personLiveReq.app_id = netBaseInfoData.appId;
        personLiveReq.business_name = netBaseInfoData.businessId;
        personLiveReq.person_id = netBaseInfoData.personId;
        personLiveReq.livedata = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLive();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version version = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version();
        version.sdk_version = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = com.tencent.youtu.ytfacetrack.YTFaceTrack.Version;
        version.freflect_sdk_version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;
        personLiveReq.livedata.select_data = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData(lipReadReqData.baseInfo.lux, 0, "", version.makeVersion(), "");
        personLiveReq.livedata.frames = new java.util.ArrayList<>();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame faceFrame = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame();
        faceFrame.image = lipReadReqData.liveImage;
        faceFrame.x_coordinates = new java.util.ArrayList<>();
        faceFrame.y_coordinates = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < 5; i17++) {
            int i18 = i17 * 2;
            faceFrame.x_coordinates.add(java.lang.Float.valueOf(lipReadReqData.liveFivePoint[i18]));
            faceFrame.y_coordinates.add(java.lang.Float.valueOf(lipReadReqData.liveFivePoint[i18 + 1]));
        }
        personLiveReq.livedata.frames.add(faceFrame);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(lipReadReqData.faceExtraInfo);
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame faceFrame2 = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame();
            faceFrame2.image = jSONObject.getString("openmouth_img");
            faceFrame2.x_coordinates = new java.util.ArrayList<>();
            faceFrame2.y_coordinates = new java.util.ArrayList<>();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("openmouth_5pts");
            for (int i19 = 0; i19 < 5; i19++) {
                int i27 = i19 * 2;
                faceFrame2.x_coordinates.add(java.lang.Float.valueOf((float) jSONArray.optDouble(i27)));
                faceFrame2.y_coordinates.add(java.lang.Float.valueOf((float) jSONArray.optDouble(i27 + 1)));
            }
            personLiveReq.livedata.frames.add(faceFrame2);
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame faceFrame3 = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame();
            faceFrame3.image = jSONObject.getString("closeeye_img");
            faceFrame3.x_coordinates = new java.util.ArrayList<>();
            faceFrame3.y_coordinates = new java.util.ArrayList<>();
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("closeeye_5pts");
            for (int i28 = 0; i28 < 5; i28++) {
                int i29 = i28 * 2;
                faceFrame3.x_coordinates.add(java.lang.Float.valueOf((float) jSONArray2.optDouble(i29)));
                faceFrame3.y_coordinates.add(java.lang.Float.valueOf((float) jSONArray2.optDouble(i29 + 1)));
            }
            personLiveReq.livedata.frames.add(faceFrame3);
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed parse extra face list " + e17.getLocalizedMessage());
        }
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLive personLive = personLiveReq.livedata;
        personLive.validate_data = lipReadReqData.validate_data;
        personLive.voice = lipReadReqData.voice;
        personLive.mouth_move = lipReadReqData.mouth_move;
        personLive.mouth_lip_reading = lipReadReqData.mouth_lip_reading;
        personLive.platform = 2;
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData2 = lipReadReqData.baseInfo;
        personLiveReq.person_type = netBaseInfoData2.personType;
        personLiveReq.live_type = netBaseInfoData2.liveType;
        personLiveReq.req_type = netBaseInfoData2.reqType;
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(personLiveReq);
    }

    public static java.lang.String makePersonLiveReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ReflectLiveReqData reflectLiveReqData) {
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLiveReq personLiveReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLiveReq();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = reflectLiveReqData.baseInfo;
        personLiveReq.app_id = netBaseInfoData.appId;
        personLiveReq.business_name = netBaseInfoData.businessId;
        personLiveReq.person_id = netBaseInfoData.personId;
        personLiveReq.live_type = netBaseInfoData.liveType;
        personLiveReq.req_type = netBaseInfoData.reqType;
        personLiveReq.request_id = netBaseInfoData.sessionId;
        personLiveReq.person_type = netBaseInfoData.personType;
        personLiveReq.livedata = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLive();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version version = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version();
        version.sdk_version = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = com.tencent.youtu.ytfacetrack.YTFaceTrack.Version;
        version.freflect_sdk_version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;
        java.lang.String makeVersion = version.makeVersion();
        personLiveReq.livedata.select_data = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData(reflectLiveReqData.baseInfo.lux, reflectLiveReqData.colorNum, reflectLiveReqData.config, makeVersion, "");
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PersonLive personLive = personLiveReq.livedata;
        personLive.reflect_data = reflectLiveReqData.reflectData;
        personLive.color_data = reflectLiveReqData.colorData;
        personLive.platform = 2;
        personLive.frames = new java.util.ArrayList<>();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame faceFrame = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame();
        faceFrame.image = reflectLiveReqData.bestImage.image;
        personLiveReq.livedata.frames.add(faceFrame);
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame faceFrame2 = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame();
        faceFrame2.image = reflectLiveReqData.openMouthImage.image;
        personLiveReq.livedata.frames.add(faceFrame2);
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame faceFrame3 = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.FaceFrame();
        faceFrame3.image = reflectLiveReqData.openMouthImage.image;
        personLiveReq.livedata.frames.add(faceFrame3);
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(personLiveReq);
    }

    public static java.lang.String makePictureLiveReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PictureLiveReqData pictureLiveReqData) {
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PictureLiveDetectReq pictureLiveDetectReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PictureLiveDetectReq();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = pictureLiveReqData.baseInfo;
        pictureLiveDetectReq.app_id = netBaseInfoData.appId;
        pictureLiveDetectReq.session_id = netBaseInfoData.sessionId;
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo imageInfo = pictureLiveReqData.imageInfo;
        pictureLiveDetectReq.five_point = imageInfo.five_points;
        pictureLiveDetectReq.image = imageInfo.image;
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version version = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version();
        version.sdk_version = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = com.tencent.youtu.ytfacetrack.YTFaceTrack.Version;
        version.freflect_sdk_version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;
        pictureLiveDetectReq.select_data = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData(pictureLiveReqData.baseInfo.lux, 0, "", version.makeVersion(), "");
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(pictureLiveDetectReq);
    }

    public static java.lang.String makeReflectLiveReq(com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ReflectLiveReqData reflectLiveReqData) {
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ReflectLiveReq reflectLiveReq = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ReflectLiveReq();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = reflectLiveReqData.baseInfo;
        reflectLiveReq.app_id = netBaseInfoData.appId;
        reflectLiveReq.session_id = netBaseInfoData.sessionId;
        reflectLiveReq.business_id = netBaseInfoData.businessId;
        reflectLiveReq.platform = 2;
        reflectLiveReq.color_data = reflectLiveReqData.colorData;
        reflectLiveReq.live_image = reflectLiveReqData.liveImage;
        reflectLiveReq.reflect_data = reflectLiveReqData.reflectData;
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version version = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.Version();
        version.sdk_version = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = com.tencent.youtu.ytfacetrack.YTFaceTrack.Version;
        version.freflect_sdk_version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;
        reflectLiveReq.select_data = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.LiveStyleRequester.SeleceData(reflectLiveReqData.baseInfo.lux, reflectLiveReqData.colorNum, reflectLiveReqData.config, version.makeVersion(), "");
        android.graphics.Bitmap bitmap = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            reflectLiveReq.compare_image = new java.lang.String(android.util.Base64.encode(byteArrayOutputStream.toByteArray(), 2));
            reflectLiveReq.compare_image_type = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToComapreType;
        }
        return new com.tencent.youtu.sdkkitframework.common.WeJson().toJson(reflectLiveReq);
    }

    private static java.lang.String removeKey(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split = str.split("&");
        java.lang.String str3 = "";
        for (int i17 = 0; i17 < split.length; i17++) {
            if (!split[i17].split("=")[0].equals(str2)) {
                str3 = str3.length() == 0 ? str3.concat(split[i17]) : str3.concat("&").concat(split[i17]);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "result: " + str3);
            }
        }
        return str3;
    }

    /* loaded from: classes13.dex */
    public static class ImageInfo {
        public java.lang.String checksum;
        public java.util.ArrayList<java.lang.Float> five_points;
        public java.lang.String image;

        public ImageInfo(java.lang.String str, java.util.ArrayList<java.lang.Float> arrayList, java.lang.String str2) {
            this.image = str;
            this.five_points = arrayList;
            this.checksum = str2;
        }

        private void createFileWithByte(java.lang.String str, byte[] bArr) {
            java.io.BufferedOutputStream bufferedOutputStream;
            java.io.File file = new java.io.File(str);
            java.io.FileOutputStream fileOutputStream = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                try {
                    bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream2);
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                        try {
                            fileOutputStream2.close();
                        } catch (java.io.IOException unused) {
                        }
                    } catch (java.lang.Exception unused2) {
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (java.io.IOException unused3) {
                            }
                        }
                        if (bufferedOutputStream == null) {
                            return;
                        }
                        bufferedOutputStream.close();
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (java.io.IOException unused4) {
                            }
                        }
                        if (bufferedOutputStream == null) {
                            throw th;
                        }
                        try {
                            bufferedOutputStream.close();
                            throw th;
                        } catch (java.lang.Exception unused5) {
                            throw th;
                        }
                    }
                } catch (java.lang.Exception unused6) {
                    bufferedOutputStream = null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bufferedOutputStream = null;
                }
            } catch (java.lang.Exception unused7) {
                bufferedOutputStream = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                bufferedOutputStream = null;
            }
            try {
                bufferedOutputStream.close();
            } catch (java.lang.Exception unused8) {
            }
        }

        public ImageInfo(byte[] bArr, float[] fArr, java.lang.String str) {
            this.image = new java.lang.String(android.util.Base64.encode(bArr, 2));
            java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
            this.five_points = arrayList;
            this.checksum = str;
            if (fArr != null) {
                arrayList.add(java.lang.Float.valueOf(fArr[176]));
                this.five_points.add(java.lang.Float.valueOf(fArr[177]));
                this.five_points.add(java.lang.Float.valueOf(fArr[178]));
                this.five_points.add(java.lang.Float.valueOf(fArr[179]));
                this.five_points.add(java.lang.Float.valueOf(fArr[64]));
                this.five_points.add(java.lang.Float.valueOf(fArr[65]));
                this.five_points.add(java.lang.Float.valueOf(fArr[90]));
                this.five_points.add(java.lang.Float.valueOf(fArr[91]));
                this.five_points.add(java.lang.Float.valueOf(fArr[102]));
                this.five_points.add(java.lang.Float.valueOf(fArr[103]));
            }
        }
    }
}
