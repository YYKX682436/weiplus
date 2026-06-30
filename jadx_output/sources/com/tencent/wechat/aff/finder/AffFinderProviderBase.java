package com.tencent.wechat.aff.finder;

/* loaded from: classes16.dex */
public interface AffFinderProviderBase {

    /* loaded from: classes8.dex */
    public interface Callback {
        void onfinderRedDotDataChangedActionComplete(long j17);

        void onfinderRedDotHasAddActionComplete(long j17);

        void onfinderRedDotHasDisposeActionComplete(long j17);
    }

    java.lang.String curContextID();

    java.lang.String curTabSessionID();

    bw5.sc finderGetCGIBaseRequest(int i17, int i18);

    java.lang.String finderGetCurrentUsername();

    void finderRedDotDataChangedActionAsync(long j17, int i17, int i18, bw5.e0 e0Var, bw5.e0 e0Var2, java.lang.String str);

    void finderRedDotDataChangedWithPathKey(java.lang.String str);

    void finderRedDotDataReceiveRedDotBindObjectPathKey(java.lang.String str);

    void finderRedDotDataReceiveWithPathKey(java.lang.String str, boolean z17);

    void finderRedDotDataRevokedWithPathKey(java.lang.String str);

    boolean finderRedDotEnableUseCtrlInfoInNMStrategy(java.lang.String str, boolean z17, bw5.e0 e0Var);

    void finderRedDotHasAddActionAsync(long j17, bw5.e0 e0Var);

    void finderRedDotHasDisposeActionAsync(long j17, java.lang.String str, bw5.e0 e0Var);

    boolean finderRedDotWillAddAction(bw5.e0 e0Var);

    boolean finderRedDotWillDisposeAction(java.lang.String str);

    bw5.tj getCacheLocation();

    java.util.ArrayList<bw5.ae> getContact(java.lang.String str);

    int getCurFinderUnreadCountByUsername(java.lang.String str, boolean z17, int i17, int i18);

    java.lang.String getFeedSessionBuffer(java.lang.String str, bw5.os0 os0Var, java.lang.String str2);

    java.util.ArrayList<bw5.yr> getLocalFinderObject(java.util.ArrayList<java.lang.String> arrayList);

    int getPrivateMsgTotalUnreadCountByUsername(java.lang.String str);

    boolean isRedDotMeetWithCondition(java.lang.String str, bw5.e0 e0Var);

    boolean reddotPersonalExposeClearSwitch();

    void reddotWillRevokeTipsUuidArray(java.util.ArrayList<java.lang.String> arrayList);

    void saveFinderObject(java.util.ArrayList<bw5.yr> arrayList, bw5.os0 os0Var, java.lang.String str);

    void setCallback(com.tencent.wechat.aff.finder.AffFinderProviderBase.Callback callback);
}
