package com.tencent.mm.plugin.report.service;

/* loaded from: classes11.dex */
public class u implements java.lang.Runnable {
    public u(com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver kVCommCrossProcessReceiver) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.k2.d(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KVCommCrossProcessReceiver", "KVCommCrossProcessReceiver shut_down_weixin need to kill process");
            com.tencent.mars.xlog.Log.appenderFlushSync();
            com.tencent.mars.WeChatMars.onSingalCrash(0);
            if (com.tencent.paymars.WeChatMars.isEnable()) {
                com.tencent.paymars.WeChatMars.onSingalCrash(0);
            }
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/report/service/KVCommCrossProcessReceiver$4", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/plugin/report/service/KVCommCrossProcessReceiver$4", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
