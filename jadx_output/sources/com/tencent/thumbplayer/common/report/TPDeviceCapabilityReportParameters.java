package com.tencent.thumbplayer.common.report;

/* loaded from: classes16.dex */
public class TPDeviceCapabilityReportParameters {
    private com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.CommonParams mCommonParams = new com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.CommonParams();
    private com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.AV1DecoderParams mAV1DecoderParams = new com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.AV1DecoderParams();
    private com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.VP9DecoderParams mVP9DecoderParams = new com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.VP9DecoderParams();
    private com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.HEVCDecoderParams mHEVCDecoderParams = new com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.HEVCDecoderParams();
    private com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.VP8DecoderParams mVP8DecoderParams = new com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.VP8DecoderParams();

    /* loaded from: classes16.dex */
    public class AV1DecoderParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        private static final java.lang.String AV1_HW_DECODER_LEVEL = "av1hwdecoderlevel";
        private static final java.lang.String AV1_HW_DECODER_PROFILE = "av1hwdecoderprofile";
        private static final int LEVEL_UNKNOWN = -1;
        private static final int PROFILE_UNKNOWN = -1;
        public int av1HWDecoderLevel;
        public int av1HWDecoderProfile;

        public AV1DecoderParams() {
            reset();
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(AV1_HW_DECODER_PROFILE, this.av1HWDecoderProfile);
            iTPReportProperties.put(AV1_HW_DECODER_LEVEL, this.av1HWDecoderLevel);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.av1HWDecoderProfile = -1;
            this.av1HWDecoderLevel = -1;
        }
    }

    /* loaded from: classes16.dex */
    public class CommonParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        private static final java.lang.String API_LEVEL = "apilevel";
        private static final java.lang.String CPU_NAME = "cpuname";
        private static final java.lang.String FLOW_ID = "flowid";
        private static final java.lang.String MODEL = "model";
        private static final java.lang.String OS_VER = "osver";
        private static final java.lang.String PLATFORM = "appplatform";
        private static final java.lang.String SERIAL_NO = "serialno";
        public int apiLevel;
        public java.lang.String cpuName;
        public java.lang.String flowId;
        public java.lang.String model;
        public java.lang.String osVer;
        public int platform;
        public java.lang.String serialNo;

        public CommonParams() {
            reset();
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put("flowid", this.flowId);
            iTPReportProperties.put(PLATFORM, this.platform);
            iTPReportProperties.put(API_LEVEL, this.apiLevel);
            iTPReportProperties.put("osver", this.osVer);
            iTPReportProperties.put(MODEL, this.model);
            iTPReportProperties.put(SERIAL_NO, this.serialNo);
            iTPReportProperties.put(CPU_NAME, this.cpuName);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.flowId = "";
            this.platform = -1;
            this.apiLevel = -1;
            this.osVer = "";
            this.model = "";
            this.serialNo = "";
            this.cpuName = "";
        }
    }

    /* loaded from: classes16.dex */
    public class HEVCDecoderParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        private static final java.lang.String HEVC_HW_DECODER_LEVEL = "hevchwdecoderlevel";
        private static final java.lang.String HEVC_HW_DECODER_PROFILE = "hevchwdecoderprofile";
        private static final int LEVEL_UNKNOWN = -1;
        private static final int PROFILE_UNKNOWN = -1;
        public int hevcHWDecoderLevel;
        public int hevcHWDecoderProfile;

        public HEVCDecoderParams() {
            reset();
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(HEVC_HW_DECODER_PROFILE, this.hevcHWDecoderProfile);
            iTPReportProperties.put(HEVC_HW_DECODER_LEVEL, this.hevcHWDecoderLevel);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.hevcHWDecoderProfile = -1;
            this.hevcHWDecoderLevel = -1;
        }
    }

    /* loaded from: classes16.dex */
    public class VP8DecoderParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        private static final int LEVEL_UNKNOWN = -1;
        private static final int PROFILE_UNKNOWN = -1;
        private static final java.lang.String VP8_HW_DECODER_LEVEL = "vp8hwdecoderlevel";
        private static final java.lang.String VP8_HW_DECODER_PROFILE = "vp8hwdecoderprofile";
        public int vp8HWDecoderLevel;
        public int vp8HWDecoderProfile;

        public VP8DecoderParams() {
            reset();
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(VP8_HW_DECODER_PROFILE, this.vp8HWDecoderProfile);
            iTPReportProperties.put(VP8_HW_DECODER_LEVEL, this.vp8HWDecoderLevel);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.vp8HWDecoderProfile = -1;
            this.vp8HWDecoderLevel = -1;
        }
    }

    /* loaded from: classes16.dex */
    public class VP9DecoderParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        private static final int LEVEL_UNKNOWN = -1;
        private static final int PROFILE_UNKNOWN = -1;
        private static final java.lang.String VP9_HW_DECODER_LEVEL = "vp9hwdecoderlevel";
        private static final java.lang.String VP9_HW_DECODER_PROFILE = "vp9hwdecoderprofile";
        public int vp9HWDecoderLevel;
        public int vp9HWDecoderProfile;

        public VP9DecoderParams() {
            reset();
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(VP9_HW_DECODER_PROFILE, this.vp9HWDecoderProfile);
            iTPReportProperties.put(VP9_HW_DECODER_LEVEL, this.vp9HWDecoderLevel);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.vp9HWDecoderProfile = -1;
            this.vp9HWDecoderLevel = -1;
        }
    }

    public com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.AV1DecoderParams getAV1DecoderParams() {
        return this.mAV1DecoderParams;
    }

    public com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.CommonParams getCommonParams() {
        return this.mCommonParams;
    }

    public com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.HEVCDecoderParams getHEVCDecoderParams() {
        return this.mHEVCDecoderParams;
    }

    public com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.VP8DecoderParams getVP8DecoderParams() {
        return this.mVP8DecoderParams;
    }

    public com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.VP9DecoderParams getVP9DecoderParams() {
        return this.mVP9DecoderParams;
    }

    public void resetAllParams() {
        this.mCommonParams.reset();
        this.mAV1DecoderParams.reset();
    }
}
