package com.tencent.paymars.mm;

/* loaded from: classes12.dex */
public class MMStnManager extends com.tencent.paymars.app.BaseManager {
    public static final int MM_STAT_CGI_INFO = 1;
    public static final int MM_STAT_CGI_NETWORK_COST = 7;
    public static final int MM_STAT_DNS = 8;
    public static final int MM_STAT_LONGLINK_BUILD = 3;
    public static final int MM_STAT_LONGLINK_CONNECT = 4;
    public static final int MM_STAT_LONGLINK_DISCONNECT = 5;
    public static final int MM_STAT_LONGLINK_FUNC_CONNECT = 6;
    public static final int MM_STAT_NETWORK_UNREACHABLE = 2;
    public static final int MM_Stat_Local_GetHostByName = 11;
    public static final int MM_Stat_Network_Changed = 10;
    public static final int MM_Stat_Noop_Send = 9;
    protected static final java.lang.String TAG = "Mars.MMStnManager";
    public com.tencent.paymars.mm.MMStnManager.CallBack ICallBack;
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;

    /* loaded from: classes12.dex */
    public interface CallBack {
        int OnActionNotify(java.lang.String str, long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, long j18);

        int ackActionNotify(java.lang.String str, long j17, int i17);

        void addMMNetCommonCallback(android.os.IInterface iInterface);

        int buf2Resp(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3);

        int doCertificateVerify(java.lang.String str, byte[][] bArr);

        int doLiveSpeedTest(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface);

        void doNetIdRequest();

        java.lang.String getCurLanguage();

        int getHostByName(java.lang.String str, java.util.List<java.lang.String> list);

        java.lang.String getIntegerExpt();

        int getJavaActionId(long j17);

        int getLogIdSubType(long j17, java.lang.String str);

        int getSnsIpsForScene(java.util.List<java.lang.String> list, boolean z17);

        int getSnsIpsForSceneWithHostName(java.util.List<java.lang.String> list, java.lang.String str, boolean z17);

        java.lang.String getUserIDCLocale();

        int getXAgreementId();

        java.lang.String ifUseNewNetId();

        int isOverseasUser();

        void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str);

        void notifyNewSpeedTestReport(byte[] bArr, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29, int i37);

        void notifyPayCgiNewDnsTagIncorrect(int i17, java.lang.String str);

        void notifyPayCgiNewDnsTagMiss(int i17, java.lang.String str);

        void notifyStnWeaknet(boolean z17);

        void onDisasterNodeNotify(java.lang.String str);

        void onLiveSpeedTestCallback(com.tencent.paymars.mm.LiveSpeedTestResult liveSpeedTestResult, boolean z17);

        void onOOBNotify(java.lang.String str);

        void receiveWeakNetNotify(boolean z17, int i17);

        void removeMMNetCommonCallback(android.os.IInterface iInterface);

        void reportFlow(int i17, int i18, int i19, int i27);

        void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17, boolean z18);

        void reportIDKey(long j17, long j18, long j19, boolean z17);

        void reportKV(long j17, java.lang.String str, boolean z17, boolean z18, long j18, boolean z19);

        void reportStat(com.tencent.paymars.mm.MMStnManager.ReportInfo reportInfo);

        void simpleTestCommand(java.lang.String str);
    }

    /* loaded from: classes12.dex */
    public static class ReportInfo {
        public long actionId = 0;
        public long rtType = 0;
        public long beginTime = 0;
        public long endTime = 0;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f215213ip = "";
        public int port = 0;
        public boolean isSocket = false;
        public int netType = 0;
        public int ipType = 0;
        public long sendSize = 0;
        public long recvSize = 0;
        public int errType = 0;
        public int errCode = 0;
        public long netSignal = 0;
        public int retryCount = 0;
        public long expand1 = 0;
        public java.lang.String clientIp = "";
        public long expand2 = 0;
        public int newNetType = 0;
        public int subNetType = 0;
        public java.lang.String extraInfo = "";
        public java.lang.String host = "";
        public int endStep = 0;
        public long newdnsCostTime = 0;
        public int newdnsErrType = 0;
        public int newdnsErrCode = 0;
        public java.lang.String dnsSvrIp = "";
        public long dnsCostTime = 0;
        public int dnsErrType = 0;
        public long connCostTime = 0;
        public long firstPkgTime = 0;
        public int endFlag = 0;
        public long connTotalCostTime = 0;
        public int usedIpIndex = 0;
        public int localIp = 0;
        public int refTime1 = 0;
        public int refTime2 = 0;
        public int refTime3 = 0;

        public java.lang.String toString() {
            return java.lang.String.format("actionId:%d, rtType:%d, begin:%d, end:%d, cost:%d, ip:%s, port:%d, isSocket:%b, netType:%d, ipType:%d, sendSize:%d, recvSize:%d, errType:%d, errCode:%d, netSignal:%d, retryCount:%d, expand1:%d, clientip:%s, expand2:%d, newNetType:%d, subNetType:%d, extraInfo:%s, host:%s, endStep:%d, endFlag:%d", java.lang.Long.valueOf(this.actionId), java.lang.Long.valueOf(this.rtType), java.lang.Long.valueOf(this.beginTime), java.lang.Long.valueOf(this.endTime), java.lang.Long.valueOf(this.endTime - this.beginTime), this.f215213ip, java.lang.Integer.valueOf(this.port), java.lang.Boolean.valueOf(this.isSocket), java.lang.Integer.valueOf(this.netType), java.lang.Integer.valueOf(this.ipType), java.lang.Long.valueOf(this.sendSize), java.lang.Long.valueOf(this.recvSize), java.lang.Integer.valueOf(this.errType), java.lang.Integer.valueOf(this.errCode), java.lang.Long.valueOf(this.netSignal), java.lang.Integer.valueOf(this.retryCount), java.lang.Long.valueOf(this.expand1), this.clientIp, java.lang.Long.valueOf(this.expand2), java.lang.Integer.valueOf(this.newNetType), java.lang.Integer.valueOf(this.subNetType), this.extraInfo, this.host, java.lang.Integer.valueOf(this.endStep), java.lang.Integer.valueOf(this.endFlag));
        }
    }

    public MMStnManager(long j17) {
        OnJniCreateMMStnManagerFromHandle(j17);
    }

    private native void OnJniClearPayMMtlsForbidenHostAndPsk();

    private native void OnJniDispatchPayMmtlsCtrlInfo(java.lang.Object obj, boolean z17, boolean z18);

    private native int OnJniGetPayMMtlsRegion();

    private native void OnJniSetPayMMtlsRegion(int i17);

    public native void OnJniAddHostInfo(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr);

    public native void OnJniClearLocalHostCache();

    public native void OnJniClearMMtlsForbidenHostAndPsk();

    public native void OnJniCombineGetHostIps(java.lang.String str, int i17, int i18, com.tencent.paymars.mm.GetDnsReturn getDnsReturn);

    public native void OnJniCreateMMStnManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateMMStnManagerFromHandle(long j17);

    public native void OnJniDestroyMMStnManager();

    public native void OnJniDoLiveSpeedTest(java.lang.String str, int i17, int i18, int i19, int i27, com.tencent.paymars.mm.SpeedTestCtx speedTestCtx, int i28);

    public native void OnJniForceUseV6(boolean z17);

    public native void OnJniGetHostIps(java.lang.String str, com.tencent.paymars.mm.GetDnsReturn getDnsReturn);

    public native java.lang.String[] OnJniGetIPsString(boolean z17);

    public native java.lang.String OnJniGetIspId();

    public native void OnJniGetLocalHostList(java.lang.String[] strArr, java.lang.String str);

    public native int OnJniGetMMtlsRegion();

    public native long OnJniGetMarsTimestamp();

    public native com.tencent.paymars.mm.NetworkIdInfo OnJniGetNetworkId(java.lang.String str);

    public native java.lang.String OnJniGetNetworkServerIp();

    public native com.tencent.paymars.mm.ConnectRecord[] OnJniGetRecentConnectRecords(int i17, int i18);

    public native void OnJniGetSnsIps(boolean z17, com.tencent.paymars.mm.GetDnsReturn getDnsReturn);

    public native void OnJniGetSnsIpsWithHostName(java.lang.String str, boolean z17, com.tencent.paymars.mm.GetDnsReturn getDnsReturn);

    public native int OnJniMMAckActionNotify(java.lang.String str, long j17, int i17);

    public native void OnJniRecoverLinkAddrs();

    public native void OnJniReportCGIServerError(int i17, int i18);

    public native void OnJniReportFailIp(java.lang.String str);

    public native void OnJniReportV6Status(boolean z17);

    public native void OnJniSaveAuthLongList(java.lang.Object obj, int[] iArr);

    public native void OnJniSaveAuthShortList(java.lang.Object obj, int[] iArr);

    public native void OnJniSetCallback(java.lang.Object obj);

    public native void OnJniSetCgiDebugIP(java.lang.String str, java.lang.String str2, int i17);

    public native void OnJniSetDebugHost(java.lang.String str);

    public native void OnJniSetDebugIP(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public native void OnJniSetHostInfo(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr);

    public native void OnJniSetMMTlsHostInfo(java.lang.String[] strArr, int[] iArr);

    public native void OnJniSetMMtlsRegion(int i17);

    public native void OnJniSetMmtlsCtrlInfo(boolean z17);

    public native void OnJniSetNetIdAndIsp(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public native void OnJniSetNetworkId(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17);

    public native void OnJniSetNewDnsDebugHost(java.lang.String str, java.lang.String str2);

    public native void OnJniSetPayNewDnsDebugHosts(java.lang.Object obj, boolean z17);

    public native void OnJniStartNetworkAnalysis();

    public native void OnJniSwitchProcessActiveState(boolean z17);

    public native void OnJniTestReportFlush();

    public void addHostInfo(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        OnJniAddHostInfo(strArr, strArr2, iArr);
    }

    public void addMMNetCommonCallback(android.os.IInterface iInterface) {
        com.tencent.paymars.mm.MMStnManager.CallBack callBack = this.ICallBack;
        if (callBack == null) {
            com.tencent.mars.xlog.Log.w(TAG, "ICallBack is null");
        } else {
            callBack.addMMNetCommonCallback(iInterface);
        }
    }

    public void clearLocalHostCache() {
        OnJniClearLocalHostCache();
    }

    public void clearMMtlsForbidenHostAndPsk() {
        OnJniClearMMtlsForbidenHostAndPsk();
    }

    public void clearPayMMtlsForbidenHostAndPsk() {
        OnJniClearPayMMtlsForbidenHostAndPsk();
    }

    public int combineGetHostIps(java.lang.String str, int i17, int i18, java.util.List<java.lang.String> list) {
        java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.GetDnsReturn getDnsReturn = new com.tencent.paymars.mm.GetDnsReturn();
        OnJniCombineGetHostIps(str, i17, i18, getDnsReturn);
        for (int i19 = 0; i19 < getDnsReturn.length; i19++) {
            list.add(getDnsReturn.aryIps[i19]);
        }
        return getDnsReturn.type;
    }

    public void dispatchPayMmtlsCtrlInfo(java.util.Map<java.lang.String, java.lang.Integer> map, boolean z17, boolean z18) {
        OnJniDispatchPayMmtlsCtrlInfo(map, z17, z18);
    }

    public int doLiveSpeedTest(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface) {
        com.tencent.paymars.mm.MMStnManager.CallBack callBack = this.ICallBack;
        if (callBack == null) {
            com.tencent.mars.xlog.Log.w(TAG, "ICallBack is null");
            return 0;
        }
        return callBack.doLiveSpeedTest(str, i17, i18, i19, i27, bArr, bArr2, iInterface);
    }

    public void forceUseV6(boolean z17) {
        OnJniForceUseV6(z17);
    }

    public int getHostByName(java.lang.String str, java.util.List<java.lang.String> list) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.GetDnsReturn getDnsReturn = new com.tencent.paymars.mm.GetDnsReturn();
        getHostIps(str, getDnsReturn);
        for (int i17 = 0; i17 < getDnsReturn.length; i17++) {
            list.add(getDnsReturn.aryIps[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.MMStnManager.ReportInfo reportInfo = new com.tencent.paymars.mm.MMStnManager.ReportInfo();
        reportInfo.actionId = 11L;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = str;
        reportInfo.f215213ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        return getDnsReturn.type;
    }

    public void getHostIps(java.lang.String str, com.tencent.paymars.mm.GetDnsReturn getDnsReturn) {
        OnJniGetHostIps(str, getDnsReturn);
    }

    public java.lang.String[] getIPsString(boolean z17) {
        return OnJniGetIPsString(z17);
    }

    public java.lang.String getIspId() {
        return OnJniGetIspId();
    }

    public void getLocalHostList(java.lang.String[] strArr, java.lang.String str) {
        OnJniGetLocalHostList(strArr, str);
    }

    public int getMMtlsRegion() {
        return OnJniGetMMtlsRegion();
    }

    public long getMarsTimestamp() {
        return OnJniGetMarsTimestamp();
    }

    @Override // com.tencent.paymars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public com.tencent.paymars.mm.NetworkIdInfo getNetworkId(java.lang.String str) {
        return OnJniGetNetworkId(str);
    }

    public java.lang.String getNetworkServerIp() {
        return OnJniGetNetworkServerIp();
    }

    public int getPayMMtlsRegion() {
        return OnJniGetPayMMtlsRegion();
    }

    public com.tencent.paymars.mm.ConnectRecord[] getRecentConnectRecords(int i17, int i18) {
        return OnJniGetRecentConnectRecords(i17, i18);
    }

    public void getSnsIps(boolean z17, com.tencent.paymars.mm.GetDnsReturn getDnsReturn) {
        OnJniGetSnsIps(z17, getDnsReturn);
    }

    public int getSnsIpsForScene(java.util.List<java.lang.String> list, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.GetDnsReturn getDnsReturn = new com.tencent.paymars.mm.GetDnsReturn();
        getSnsIps(z17, getDnsReturn);
        for (int i17 = 0; i17 < getDnsReturn.length; i17++) {
            list.add(getDnsReturn.aryIps[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.MMStnManager.ReportInfo reportInfo = new com.tencent.paymars.mm.MMStnManager.ReportInfo();
        reportInfo.actionId = 11L;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = "mmsns.qpic.cn";
        reportInfo.f215213ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        return getDnsReturn.type;
    }

    public int getSnsIpsForSceneWithHostName(java.util.List<java.lang.String> list, java.lang.String str, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.GetDnsReturn getDnsReturn = new com.tencent.paymars.mm.GetDnsReturn();
        getSnsIpsWithHostName(str, z17, getDnsReturn);
        for (int i17 = 0; i17 < getDnsReturn.length; i17++) {
            list.add(getDnsReturn.aryIps[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.paymars.mm.MMStnManager.ReportInfo reportInfo = new com.tencent.paymars.mm.MMStnManager.ReportInfo();
        reportInfo.actionId = 11L;
        reportInfo.beginTime = currentTimeMillis;
        reportInfo.endTime = currentTimeMillis2;
        reportInfo.clientIp = str;
        reportInfo.f215213ip = getDnsReturn.length > 0 ? getDnsReturn.aryIps[0] : "0.0.0.0";
        return getDnsReturn.type;
    }

    public void getSnsIpsWithHostName(java.lang.String str, boolean z17, com.tencent.paymars.mm.GetDnsReturn getDnsReturn) {
        OnJniGetSnsIpsWithHostName(str, z17, getDnsReturn);
    }

    public int mmAckActionNotify(java.lang.String str, long j17, int i17) {
        return OnJniMMAckActionNotify(str, j17, i17);
    }

    public void onDestroy() {
        OnJniDestroyMMStnManager();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void recoverLinkAddrs() {
        OnJniRecoverLinkAddrs();
    }

    public void removeMMNetCommonCallback(android.os.IInterface iInterface) {
        com.tencent.paymars.mm.MMStnManager.CallBack callBack = this.ICallBack;
        if (callBack == null) {
            com.tencent.mars.xlog.Log.w(TAG, "ICallBack is null");
        } else {
            callBack.removeMMNetCommonCallback(iInterface);
        }
    }

    public void reportCGIServerError(int i17, int i18) {
        OnJniReportCGIServerError(i17, i18);
    }

    public void reportFailIp(java.lang.String str) {
        OnJniReportFailIp(str);
    }

    public void reportV6Status(boolean z17) {
        OnJniReportV6Status(z17);
    }

    public void saveAuthLongList(java.lang.Object obj, int[] iArr) {
        OnJniSaveAuthLongList(obj, iArr);
    }

    public void saveAuthShortList(java.lang.Object obj, int[] iArr) {
        OnJniSaveAuthShortList(obj, iArr);
    }

    public void setCallback(com.tencent.paymars.mm.MMStnManager.CallBack callBack) {
        this.ICallBack = callBack;
        OnJniSetCallback(callBack);
    }

    public void setCgiDebugIP(java.lang.String str, java.lang.String str2, int i17) {
        OnJniSetCgiDebugIP(str, str2, i17);
    }

    public void setDebugHost(java.lang.String str) {
        OnJniSetDebugHost(str);
    }

    public void setDebugIP(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        OnJniSetDebugIP(str, str2, str3, str4);
    }

    public void setHostInfo(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        OnJniSetHostInfo(strArr, strArr2, iArr);
    }

    public void setMMTlsHostInfo(java.lang.String[] strArr, int[] iArr) {
        OnJniSetMMTlsHostInfo(strArr, iArr);
    }

    public void setMMtlsRegion(int i17) {
        OnJniSetMMtlsRegion(i17);
    }

    public void setMmtlsCtrlInfo(boolean z17) {
        OnJniSetMmtlsCtrlInfo(z17);
    }

    public void setNetIdAndIsp(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        OnJniSetNetIdAndIsp(str, str2, str3);
    }

    public void setNetworkId(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        OnJniSetNetworkId(str, str2, str3, i17);
    }

    public void setNewDnsDebugHost(java.lang.String str, java.lang.String str2) {
        OnJniSetNewDnsDebugHost(str, str2);
    }

    public void setPayMMtlsRegion(int i17) {
        OnJniSetPayMMtlsRegion(i17);
    }

    public void setPayNewDnsDebugHosts(java.util.Map<java.lang.String, java.lang.String> map, boolean z17) {
        OnJniSetPayNewDnsDebugHosts(map, z17);
    }

    public void simpleTestCommand(java.lang.String str) {
        com.tencent.paymars.mm.MMStnManager.CallBack callBack = this.ICallBack;
        if (callBack == null) {
            com.tencent.mars.xlog.Log.w(TAG, "ICallBack is null");
        } else {
            callBack.simpleTestCommand(str);
        }
    }

    public void startNetworkAnalysis() {
        OnJniStartNetworkAnalysis();
    }

    public void switchProcessActiveState(boolean z17) {
        OnJniSwitchProcessActiveState(z17);
    }

    public void testReportFlush() {
        OnJniTestReportFlush();
    }

    public void doLiveSpeedTest(java.lang.String str, int i17, int i18, int i19, int i27, com.tencent.paymars.mm.SpeedTestCtx speedTestCtx, int i28) {
        OnJniDoLiveSpeedTest(str, i17, i18, i19, i27, speedTestCtx, i28);
    }

    public MMStnManager(com.tencent.paymars.app.Context context) {
        OnJniCreateMMStnManagerFromContext(context);
    }
}
