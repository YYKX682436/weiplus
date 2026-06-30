package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.storage.ra f195283d = new com.tencent.mm.storage.ra();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 4);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (java.lang.System.currentTimeMillis() < calendar.getTimeInMillis()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "executeTask!");
            com.tencent.mm.storage.va vaVar = com.tencent.mm.storage.va.f196289a;
            long j17 = 600000;
            while (true) {
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = com.tencent.mm.storage.va.f196291c;
                if (concurrentLinkedQueue.isEmpty() || !com.tencent.mm.storage.va.f196290b || j17 <= 0) {
                    break;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "mTaskRunnableQueue, mTaskQueue.size = " + concurrentLinkedQueue.size());
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.storage.ta taVar = (com.tencent.mm.storage.ta) concurrentLinkedQueue.poll();
                if (taVar != null) {
                    java.lang.Runnable runnable = taVar.f195340a;
                    if (runnable != null) {
                        runnable.run();
                    }
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", "mTaskRunnableQueue, [" + taVar.f195341b + "], duration = " + currentTimeMillis2);
                    j17 -= currentTimeMillis2;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remainingTime = ");
                    sb6.append(j17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SilentTask", sb6.toString());
                }
            }
        }
        com.tencent.mm.storage.va.f196290b = false;
    }
}
