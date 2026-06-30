package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public class TPDataTransportManagerFactory {
    public static com.tencent.thumbplayer.datatransport.ITPPlayManager createDataTransportManager(android.os.Looper looper, com.tencent.thumbplayer.tplayer.TPContext tPContext) {
        return com.tencent.thumbplayer.config.TPPlayerConfig.getNewReportEnable() ? (com.tencent.thumbplayer.datatransport.ITPPlayManager) new com.tencent.thumbplayer.datatransport.TPDataTransportManagerProxy(new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl(tPContext.getAppContext(), looper), tPContext).getProxyInstance() : new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl(tPContext.getAppContext(), looper);
    }
}
