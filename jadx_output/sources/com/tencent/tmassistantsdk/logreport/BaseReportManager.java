package com.tencent.tmassistantsdk.logreport;

/* loaded from: classes13.dex */
public abstract class BaseReportManager implements com.tencent.tmassistantsdk.logreport.ILogReportHttpListener {
    public static final int MAX_READ_COUNT = 1000;
    protected static final java.lang.String TAG = "BaseReportManager";
    protected com.tencent.tmassistantsdk.logreport.LogReportHttpRequest reportRequest = null;
    protected int maxReportCount = 0;
    protected final java.util.List<java.lang.Long> idLists = new java.util.ArrayList();

    public synchronized void addLogData(com.qq.taf.jce.JceStruct jceStruct) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "addLogData,loginfo");
        if (jceStruct != null) {
            getLogTable().save(com.tencent.tmassistantsdk.protocol.ProtocolPackage.jceStructToUTF8Byte(jceStruct));
        }
    }

    public void cancleRequest() {
        com.tencent.tmassistantsdk.logreport.LogReportHttpRequest logReportHttpRequest = this.reportRequest;
        if (logReportHttpRequest != null) {
            logReportHttpRequest.cancleRequest();
            this.reportRequest = null;
        }
    }

    public void destroy() {
        this.reportRequest = null;
        this.idLists.clear();
    }

    public abstract com.tencent.tmassistantsdk.storage.table.BaseLogTable getLogTable();

    public abstract byte getReportType();

    @Override // com.tencent.tmassistantsdk.logreport.ILogReportHttpListener
    public void onLogReprotHttpRequestFinish(com.tencent.tmassistantsdk.logreport.LogReportHttpRequest logReportHttpRequest, boolean z17) {
        java.util.List<java.lang.Long> list;
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onLogReprotHttpRequestFinish,result:" + z17);
        if (z17 && (list = this.idLists) != null && list.size() > 0) {
            getLogTable().delete(this.idLists);
        }
        this.reportRequest = null;
        this.idLists.clear();
        if (!z17 || this.maxReportCount >= 5) {
            return;
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onLogReprotHttpRequestFinish wifi is true reportlog go on,result:" + z17 + " count:" + this.maxReportCount);
        reportLogData();
        this.maxReportCount = this.maxReportCount + 1;
    }

    public synchronized void reportLogData() {
        boolean sendLogDataToServer;
        if (com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().canReportValue()) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "reportLogData,request:" + this.reportRequest);
            if (this.reportRequest != null) {
                return;
            }
            com.tencent.tmassistantsdk.logreport.LogReportHttpRequest logReportHttpRequest = new com.tencent.tmassistantsdk.logreport.LogReportHttpRequest();
            this.reportRequest = logReportHttpRequest;
            logReportHttpRequest.setmListener(this);
            com.tencent.tmassistantsdk.storage.table.BaseLogTable.DataWrapper datas = getLogTable().getDatas(1000);
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "readLogDataAndSendToServer,wrappterCount:" + datas.dataList.size());
            if (datas.dataList.size() <= 0) {
                sendLogDataToServer = false;
            } else {
                this.idLists.addAll(datas.idList);
                sendLogDataToServer = this.reportRequest.sendLogDataToServer(getReportType(), datas);
            }
            if (!sendLogDataToServer) {
                this.maxReportCount = 0;
                this.reportRequest = null;
            }
        }
    }

    public void resetMaxReportCount() {
        this.maxReportCount = 0;
    }
}
