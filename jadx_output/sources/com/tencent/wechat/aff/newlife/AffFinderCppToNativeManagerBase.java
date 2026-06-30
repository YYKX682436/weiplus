package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public interface AffFinderCppToNativeManagerBase {
    com.tencent.wechat.aff.newlife.FinderTipsShowInfo findShowInfoByPath(java.lang.String str);

    com.tencent.wechat.aff.newlife.FinderBaseRequest getFinderBaseReq(int i17, int i18, int i19);

    com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo getFinderCtrlInfoByKeyPath(java.lang.String str);

    com.tencent.wechat.aff.newlife.FinderSyncClientInfo getFinderSyncClientInfo(com.tencent.wechat.aff.newlife.SourceInfo sourceInfo);

    java.lang.String getFinderUserName();

    com.tencent.wechat.aff.newlife.SyncLocation getLocation(int i17);

    java.util.ArrayList<java.lang.String> getMultiFinderUserNames();
}
