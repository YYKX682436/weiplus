package com.tencent.wechat.aff.newlife;

/* loaded from: classes16.dex */
public interface AffSyncCppToNativeManagerBase {
    java.lang.String debugInfo(com.tencent.wechat.aff.newlife.NewLifeSyncRequest newLifeSyncRequest);

    java.lang.String debugSwitchInfo(com.tencent.wechat.aff.newlife.EntranceReportSwitch entranceReportSwitch);

    boolean enableSync(int i17, int i18);

    java.util.ArrayList<java.lang.String> getConfigSyncKeyPathList(int i17);

    com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo getLiteAppVersionInfo();

    com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult getNewLifeRequestSyncResult();

    com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig getWebSearchRequestSyncConfig();

    void handleCmd(int i17, com.tencent.wechat.aff.newlife.FinderCmdItem finderCmdItem, int i18, boolean z17);

    boolean isShowLookOneLookEntry();

    boolean isShowWebSearchEntry();

    java.lang.String mergeSyncKey(java.lang.String str, java.lang.String str2);
}
