package com.tencent.tavkit.report;

/* loaded from: classes15.dex */
public class MemoryReportHelper {
    public static final int MIN_TICK_INTERVAL_MS = 1000;
    private static final java.lang.String TAG = "MemoryReportHelper";
    private static long lastTickTime;
    private java.util.Map<java.lang.String, com.tencent.tavkit.report.MemoryReportHelper.Consumer> consumerHashMap;
    private android.content.Context context;

    /* loaded from: classes15.dex */
    public static class Consumer {
        private final java.lang.String key;
        private long totalM = 0;
        private long count = 0;
        private long maxM = 0;

        public Consumer(java.lang.String str) {
            this.key = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getAvgMB() {
            long j17 = this.count;
            if (j17 == 0) {
                return 0L;
            }
            return this.totalM / j17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tick(long j17) {
            this.totalM += j17;
            this.count++;
            if (j17 > this.maxM) {
                this.maxM = j17;
            }
        }

        public long getMaxM() {
            return this.maxM;
        }
    }

    /* loaded from: classes15.dex */
    public static class Instance {
        private static final com.tencent.tavkit.report.MemoryReportHelper INSTANCE = new com.tencent.tavkit.report.MemoryReportHelper();

        private Instance() {
        }
    }

    public static java.lang.String appendKeys(java.util.Collection<java.lang.String> collection) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : collection) {
            if (sb6.length() > 0) {
                sb6.append(",");
            }
            sb6.append(str);
        }
        return sb6.toString();
    }

    public static java.lang.String appendReportKey(java.util.Collection<?> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof com.tencent.tavkit.report.IReportable) {
                arrayList.add(((com.tencent.tavkit.report.IReportable) obj).getReportKey());
            }
        }
        return appendKeys(arrayList);
    }

    public static com.tencent.tavkit.report.MemoryReportHelper getInstance() {
        return com.tencent.tavkit.report.MemoryReportHelper.Instance.INSTANCE;
    }

    public static boolean isInIntervalTime() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - lastTickTime < 1000) {
            return true;
        }
        lastTickTime = currentTimeMillis;
        return false;
    }

    public void clear() {
        this.consumerHashMap.clear();
    }

    public java.util.Map<java.lang.String, java.lang.Long> getAvgMBValues() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.tencent.tavkit.report.MemoryReportHelper.Consumer consumer : this.consumerHashMap.values()) {
            if (consumer != null) {
                hashMap.put(consumer.key, java.lang.Long.valueOf(consumer.getAvgMB()));
            }
        }
        return hashMap;
    }

    public java.util.Map<java.lang.String, java.lang.Long> getMaxMBValues() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.tencent.tavkit.report.MemoryReportHelper.Consumer consumer : this.consumerHashMap.values()) {
            if (consumer != null) {
                hashMap.put(consumer.key, java.lang.Long.valueOf(consumer.getMaxM()));
            }
        }
        return hashMap;
    }

    public int getPidMemorySize(int i17, android.content.Context context) {
        android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessMemoryInfo(new int[]{i17});
        processMemoryInfo[0].getTotalSharedDirty();
        return processMemoryInfo[0].getTotalPss();
    }

    public void init(android.content.Context context) {
        this.context = context;
    }

    public void tick(java.lang.String str) {
        if (this.context == null) {
            return;
        }
        tick(str, getPidMemorySize(android.os.Process.myPid(), this.context) / 1024);
    }

    private MemoryReportHelper() {
        this.consumerHashMap = new java.util.HashMap();
    }

    public void tick(java.lang.String str, long j17) {
        com.tencent.tavkit.report.MemoryReportHelper.Consumer consumer = this.consumerHashMap.get(str);
        if (consumer == null) {
            consumer = new com.tencent.tavkit.report.MemoryReportHelper.Consumer(str);
            this.consumerHashMap.put(consumer.key, consumer);
        }
        consumer.tick(j17);
    }
}
