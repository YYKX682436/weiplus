package com.tencent.tmassistantsdk.logreport;

/* loaded from: classes13.dex */
public class LogReportHttpRequest extends com.tencent.tmassistantsdk.network.PostHttpRequest {
    protected com.tencent.tmassistantsdk.logreport.ILogReportHttpListener mListener = null;

    @Override // com.tencent.tmassistantsdk.network.PostHttpRequest
    public void onFinished(com.qq.taf.jce.JceStruct jceStruct, com.qq.taf.jce.JceStruct jceStruct2, int i17) {
        if (jceStruct2 == null) {
            return;
        }
        com.tencent.tmassistantsdk.logreport.ILogReportHttpListener iLogReportHttpListener = this.mListener;
        if (iLogReportHttpListener == null || i17 != 0) {
            com.tencent.tmassistantsdk.util.TMLog.i("LogReportHttpRequest", "mListener is null !");
            return;
        }
        if (!(jceStruct2 instanceof com.tencent.tmassistantsdk.protocol.jce.ReportLogResponse)) {
            com.tencent.tmassistantsdk.util.TMLog.i("LogReportHttpRequest", "response isn't instanceof ReportLogResponse !");
        } else if (((com.tencent.tmassistantsdk.protocol.jce.ReportLogResponse) jceStruct2).ret == 0) {
            iLogReportHttpListener.onLogReprotHttpRequestFinish(this, true);
        } else {
            iLogReportHttpListener.onLogReprotHttpRequestFinish(this, false);
        }
    }

    public boolean sendLogDataToServer(byte b17, com.tencent.tmassistantsdk.storage.table.BaseLogTable.DataWrapper dataWrapper) {
        if (dataWrapper == null) {
            return false;
        }
        return super.sendRequest((com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest) com.tencent.tmassistantsdk.protocol.ProtocolPackage.buildReportRequest(b17, dataWrapper.dataList, com.tencent.tmassistantsdk.util.GlobalUtil.getAppPackageName(com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext()), com.tencent.tmassistantsdk.util.GlobalUtil.getAppVersionCode(com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext()), ""));
    }

    public void setmListener(com.tencent.tmassistantsdk.logreport.ILogReportHttpListener iLogReportHttpListener) {
        this.mListener = iLogReportHttpListener;
    }
}
