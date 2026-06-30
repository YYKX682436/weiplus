package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net::android::traffic_stats")
/* loaded from: classes12.dex */
public class AndroidTrafficStats {
    private AndroidTrafficStats() {
    }

    private static long getCurrentUidRxBytes() {
        long uidRxBytes = android.net.TrafficStats.getUidRxBytes(android.os.Process.myUid());
        if (uidRxBytes != -1) {
            return uidRxBytes;
        }
        return 0L;
    }

    private static long getCurrentUidTxBytes() {
        long uidTxBytes = android.net.TrafficStats.getUidTxBytes(android.os.Process.myUid());
        if (uidTxBytes != -1) {
            return uidTxBytes;
        }
        return 0L;
    }

    private static long getTotalRxBytes() {
        long totalRxBytes = android.net.TrafficStats.getTotalRxBytes();
        if (totalRxBytes != -1) {
            return totalRxBytes;
        }
        return 0L;
    }

    private static long getTotalTxBytes() {
        long totalTxBytes = android.net.TrafficStats.getTotalTxBytes();
        if (totalTxBytes != -1) {
            return totalTxBytes;
        }
        return 0L;
    }
}
