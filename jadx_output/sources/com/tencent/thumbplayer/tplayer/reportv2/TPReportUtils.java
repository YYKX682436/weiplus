package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public class TPReportUtils implements com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener {
    private static final int DEVICE_TYPE = 0;
    private static final int INIT_SEQ = 0;
    private static final java.lang.String OS_VERSION = java.lang.String.format("android %s", com.tencent.thumbplayer.core.common.TPSystemInfo.getOsVersion());
    private static final int PLATFORM_TYPE = 0;
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> REPORT_DRM_TYPE;
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> REPORT_PLAYER_TYPE;
    public static final java.lang.String REPORT_PROTOCOL_VERSION = "1.0.0";
    private static final java.lang.String TAG = "TPReportUtils";
    private android.content.Context mContext;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        REPORT_PLAYER_TYPE = hashMap;
        hashMap.put(0, -1);
        hashMap.put(1, 0);
        hashMap.put(2, 3);
        hashMap.put(3, 3);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        REPORT_DRM_TYPE = hashMap2;
        hashMap2.put(-1, -1);
        hashMap2.put(0, 32);
        hashMap2.put(2, 4);
    }

    public TPReportUtils(android.content.Context context) {
        this.mContext = context;
        com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.getInstance().addOnNetStatusChangeListener(this);
    }

    public static int convertTPDRMTypeToReportDrmType(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17) {
        java.lang.Integer num = REPORT_DRM_TYPE.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public static int convertTPPlayerTypeToReportPlayerEnum(int i17) {
        java.lang.Integer num = REPORT_PLAYER_TYPE.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private int getDrmAbility() {
        int i17 = 0;
        for (int i18 : com.tencent.thumbplayer.api.capability.TPCapability.getDRMCapabilities()) {
            i17 |= convertTPDRMTypeToReportDrmType(i18);
        }
        return i17;
    }

    public void initDeviceParams(com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams) {
        tPCommonParams.setGuid(com.tencent.thumbplayer.config.TPPlayerConfig.getGuid());
        tPCommonParams.setPlatformType(0);
        tPCommonParams.setDeviceType(0);
        tPCommonParams.setNetworkType(com.tencent.thumbplayer.utils.TPNetWorkUtils.getNetWorkClass(this.mContext));
        tPCommonParams.setDeviceName(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName());
        tPCommonParams.setOsVersion(OS_VERSION);
        tPCommonParams.setAppName(this.mContext.getPackageName());
        tPCommonParams.setAppVer(com.tencent.thumbplayer.config.TPPlayerConfig.getAppVersionName(this.mContext));
        tPCommonParams.setReportProtocolVer("1.0.0");
        tPCommonParams.setPlayerVer(com.tencent.thumbplayer.config.TPPlayerConfig.VERSION);
        tPCommonParams.setPlatform(com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform());
        tPCommonParams.setSeq(0);
        tPCommonParams.setDrmAbility(getDrmAbility());
    }

    @Override // com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener
    public void onStatusChanged(int i17, int i18, int i19, int i27) {
        com.tencent.thumbplayer.utils.TPNetWorkUtils.onNetworkChange(this.mContext);
    }

    public void updateCommonParams(com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams) {
        tPCommonParams.setNetworkType(com.tencent.thumbplayer.utils.TPNetWorkUtils.getNetWorkClass(this.mContext));
    }
}
