package com.tencent.xweb.remotedebug;

/* loaded from: classes13.dex */
public class XWebRemoteDebugServiceStopReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        by5.c4.f("XWebRemoteDebugServiceStopReceiver", "onReceive, stop remote debug service");
        tx5.h b17 = tx5.j.b(com.tencent.xweb.WebView.getCurrentModuleWebCoreType());
        if (b17 != null) {
            b17.invokeRuntimeChannel(80032, new java.lang.Object[0]);
        } else {
            by5.c4.g("XWebRemoteDebugServiceStopReceiver", "onReceive, current process has not init core yet");
        }
    }
}
