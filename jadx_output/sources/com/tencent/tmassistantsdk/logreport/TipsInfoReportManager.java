package com.tencent.tmassistantsdk.logreport;

/* loaded from: classes13.dex */
public class TipsInfoReportManager extends com.tencent.tmassistantsdk.logreport.BaseReportManager {
    protected static final java.lang.String TAG = "TipsInfoReportManager";
    protected static com.tencent.tmassistantsdk.logreport.TipsInfoReportManager mInstance;

    private TipsInfoReportManager() {
    }

    public static synchronized com.tencent.tmassistantsdk.logreport.TipsInfoReportManager getInstance() {
        com.tencent.tmassistantsdk.logreport.TipsInfoReportManager tipsInfoReportManager;
        synchronized (com.tencent.tmassistantsdk.logreport.TipsInfoReportManager.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.logreport.TipsInfoReportManager();
            }
            tipsInfoReportManager = mInstance;
        }
        return tipsInfoReportManager;
    }

    public com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog createTipsInfoLog(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "createTipsInfoLog");
        if (tMOpenSDKAuthorizedInfo == null) {
            return null;
        }
        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog tipsInfoLog = new com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog();
        tipsInfoLog.userId = tMOpenSDKAuthorizedInfo.userId;
        tipsInfoLog.userIdType = tMOpenSDKAuthorizedInfo.userIdType;
        tipsInfoLog.gamePackageName = tMOpenSDKAuthorizedInfo.gamePackageName;
        tipsInfoLog.gameVersionCode = com.tencent.mm.sdk.platformtools.t8.P(tMOpenSDKAuthorizedInfo.gameVersionCode, 0);
        tipsInfoLog.gameChannelId = tMOpenSDKAuthorizedInfo.gameChannelId;
        return tipsInfoLog;
    }

    @Override // com.tencent.tmassistantsdk.logreport.BaseReportManager
    public com.tencent.tmassistantsdk.storage.table.BaseLogTable getLogTable() {
        return com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable.getInstance();
    }

    @Override // com.tencent.tmassistantsdk.logreport.BaseReportManager
    public byte getReportType() {
        return (byte) 1;
    }
}
