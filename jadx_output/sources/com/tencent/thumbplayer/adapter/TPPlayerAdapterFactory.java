package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public class TPPlayerAdapterFactory {
    public static com.tencent.thumbplayer.adapter.ITPPlayerAdapter createTPPlayerAdapter(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext, com.tencent.thumbplayer.tplayer.TPContext tPContext) {
        return com.tencent.thumbplayer.config.TPPlayerConfig.getNewReportEnable() ? (com.tencent.thumbplayer.adapter.ITPPlayerAdapter) new com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy(new com.tencent.thumbplayer.adapter.TPPlayerAdapter(tPContext.getAppContext(), tPLoggerContext), tPContext).getProxyInstance() : new com.tencent.thumbplayer.adapter.TPPlayerAdapter(tPContext.getAppContext(), tPLoggerContext);
    }
}
