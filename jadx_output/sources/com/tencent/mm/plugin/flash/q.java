package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class q implements com.tencent.youtu.sdkkitframework.common.YtLogger.IYtLoggerListener {
    public q(com.tencent.mm.plugin.flash.r rVar) {
    }

    @Override // com.tencent.youtu.sdkkitframework.common.YtLogger.IYtLoggerListener
    public void log(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.YTLog", "%s:%s", str, str2);
    }
}
