package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class ExceptionMonitorBroadcastReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorBroadcastReceiver", "onReceive()");
        intent.setClass(context, com.tencent.mm.sandbox.monitor.ExceptionMonitorMMService.class);
        l85.h1.e(intent, "sandbox", true, j45.l.e("sandbox"));
    }
}
