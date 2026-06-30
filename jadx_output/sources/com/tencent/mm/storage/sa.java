package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class sa implements com.tencent.mm.app.y2 {
    @Override // com.tencent.mm.app.y2
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "isScreenOff : " + z17 + ", mCreateIndexThreadRunning = " + com.tencent.mm.storage.va.f196290b);
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mTaskQueue.size = ");
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = com.tencent.mm.storage.va.f196291c;
            sb6.append(concurrentLinkedQueue.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", sb6.toString());
            if (com.tencent.mm.storage.va.f196290b || concurrentLinkedQueue.isEmpty()) {
                return;
            }
            com.tencent.mm.storage.va.f196290b = true;
            com.tencent.mm.storage.ra raVar = com.tencent.mm.storage.ra.f195283d;
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.add(5, 1);
            calendar.set(11, 2);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            long currentTimeMillis = (timeInMillis - java.lang.System.currentTimeMillis()) + com.tencent.mm.sdk.platformtools.t8.R(600000, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "targetTimeStamp = " + timeInMillis);
            com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "delayTime = " + currentTimeMillis);
            com.tencent.mm.storage.va.f196292d = ((ku5.t0) ku5.t0.f312615d).l(raVar, currentTimeMillis, "Silent-Task-Thread");
            return;
        }
        try {
            if (com.tencent.mm.storage.va.f196290b) {
                com.tencent.mm.storage.va.f196290b = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "delayTask canceled");
                java.util.concurrent.Future future = com.tencent.mm.storage.va.f196292d;
                if (future != null) {
                    future.cancel(true);
                }
                if (d95.f.f227670p) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "isVacuuming, kill self");
                    jx3.f.INSTANCE.d(25824, "", "", 0, 0, 0, "wakeup-kill", 0, 0, 0, 0, 0, 0);
                    int myPid = android.os.Process.myPid();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(myPid));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/storage/SilentTask$1", "onScreen", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/storage/SilentTask$1", "onScreen", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "delayTask cancel error : " + th6.getMessage());
        }
    }
}
