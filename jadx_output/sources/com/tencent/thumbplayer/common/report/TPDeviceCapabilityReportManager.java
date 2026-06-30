package com.tencent.thumbplayer.common.report;

/* loaded from: classes16.dex */
public class TPDeviceCapabilityReportManager {
    private static final java.lang.String COMMON_DEVICE_CAP_EVENT = "tp_common_device_cap";
    private static final java.lang.String TAG = "TPDeviceCapabilityReportManager";

    private void CommonCapabilityReport() {
        com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters tPDeviceCapabilityReportParameters = new com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters();
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        commonParamsCollect(tPDeviceCapabilityReportParameters.getCommonParams(), tPProperties);
        av1DecoderCapabilityCollect(tPDeviceCapabilityReportParameters.getAV1DecoderParams(), tPProperties);
        vp9DecoderCapabilityCollect(tPDeviceCapabilityReportParameters.getVP9DecoderParams(), tPProperties);
        vp8DecoderCapabilityCollect(tPDeviceCapabilityReportParameters.getVP8DecoderParams(), tPProperties);
        hevcDecoderCapabilityCollect(tPDeviceCapabilityReportParameters.getHEVCDecoderParams(), tPProperties);
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "device capability report:" + tPProperties.toString());
        com.tencent.thumbplayer.common.report.TPBeaconReportWrapper.trackCustomKVEvent(COMMON_DEVICE_CAP_EVENT, tPProperties);
    }

    private void av1DecoderCapabilityCollect(com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.AV1DecoderParams aV1DecoderParams, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
        com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet aV1MaxCapability = getAV1MaxCapability();
        if (aV1MaxCapability != null) {
            aV1DecoderParams.av1HWDecoderProfile = aV1MaxCapability.getMaxProfile();
            aV1DecoderParams.av1HWDecoderLevel = aV1MaxCapability.getMaxLevel();
        }
        aV1DecoderParams.paramsToProperties(iTPReportProperties);
    }

    private void commonParamsCollect(com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.CommonParams commonParams, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
        commonParams.apiLevel = com.tencent.thumbplayer.core.common.TPSystemInfo.SDK_INT;
        commonParams.flowId = java.util.UUID.randomUUID().toString() + java.lang.System.nanoTime() + "_" + com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform();
        commonParams.platform = com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform();
        commonParams.osVer = java.lang.String.format("Android %s", com.tencent.thumbplayer.core.common.TPSystemInfo.getOsVersion());
        commonParams.model = java.lang.String.format("%s_%s", com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceManufacturer(), com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName());
        commonParams.cpuName = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHarewareName();
        commonParams.paramsToProperties(iTPReportProperties);
    }

    private static com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet getAV1MaxCapability() {
        com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet tPVCodecCapabilityForGet;
        try {
            tPVCodecCapabilityForGet = com.tencent.thumbplayer.api.capability.TPCapability.getThumbPlayerVCodecTypeMaxCapability(1029, 102);
        } catch (com.tencent.thumbplayer.api.TPNativeException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            tPVCodecCapabilityForGet = null;
        }
        if (tPVCodecCapabilityForGet == com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return tPVCodecCapabilityForGet;
    }

    private static com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet getHEVCMaxCapability() {
        com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet tPVCodecCapabilityForGet;
        try {
            tPVCodecCapabilityForGet = com.tencent.thumbplayer.api.capability.TPCapability.getThumbPlayerVCodecTypeMaxCapability(172, 102);
        } catch (com.tencent.thumbplayer.api.TPNativeException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            tPVCodecCapabilityForGet = null;
        }
        if (tPVCodecCapabilityForGet == com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return tPVCodecCapabilityForGet;
    }

    private static com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet getVP8MaxCapability() {
        com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet tPVCodecCapabilityForGet;
        try {
            tPVCodecCapabilityForGet = com.tencent.thumbplayer.api.capability.TPCapability.getThumbPlayerVCodecTypeMaxCapability(138, 102);
        } catch (com.tencent.thumbplayer.api.TPNativeException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            tPVCodecCapabilityForGet = null;
        }
        if (tPVCodecCapabilityForGet == com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return tPVCodecCapabilityForGet;
    }

    private static com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet getVP9MaxCapability() {
        com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet tPVCodecCapabilityForGet;
        try {
            tPVCodecCapabilityForGet = com.tencent.thumbplayer.api.capability.TPCapability.getThumbPlayerVCodecTypeMaxCapability(166, 102);
        } catch (com.tencent.thumbplayer.api.TPNativeException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            tPVCodecCapabilityForGet = null;
        }
        if (tPVCodecCapabilityForGet == com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return tPVCodecCapabilityForGet;
    }

    private void hevcDecoderCapabilityCollect(com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.HEVCDecoderParams hEVCDecoderParams, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
        com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet hEVCMaxCapability = getHEVCMaxCapability();
        if (hEVCMaxCapability != null) {
            hEVCDecoderParams.hevcHWDecoderProfile = hEVCMaxCapability.getMaxProfile();
            hEVCDecoderParams.hevcHWDecoderLevel = hEVCMaxCapability.getMaxLevel();
        }
        hEVCDecoderParams.paramsToProperties(iTPReportProperties);
    }

    private void vp8DecoderCapabilityCollect(com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.VP8DecoderParams vP8DecoderParams, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
        com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet vP8MaxCapability = getVP8MaxCapability();
        if (vP8MaxCapability != null) {
            vP8DecoderParams.vp8HWDecoderProfile = vP8MaxCapability.getMaxProfile();
            vP8DecoderParams.vp8HWDecoderLevel = vP8MaxCapability.getMaxLevel();
        }
        vP8DecoderParams.paramsToProperties(iTPReportProperties);
    }

    private void vp9DecoderCapabilityCollect(com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters.VP9DecoderParams vP9DecoderParams, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
        com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet vP9MaxCapability = getVP9MaxCapability();
        if (vP9MaxCapability != null) {
            vP9DecoderParams.vp9HWDecoderProfile = vP9MaxCapability.getMaxProfile();
            vP9DecoderParams.vp9HWDecoderLevel = vP9MaxCapability.getMaxLevel();
        }
        vP9DecoderParams.paramsToProperties(iTPReportProperties);
    }

    public void reportAsync() {
        com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainThreadExecutor().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportManager.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportManager.this.reportSync();
            }
        });
    }

    public void reportSync() {
        CommonCapabilityReport();
    }
}
