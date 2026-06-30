package org.chromium.net;

/* loaded from: classes12.dex */
public class ThreadStatsUid {
    private static final java.lang.reflect.Method sClearThreadStatsUid;
    private static final java.lang.reflect.Method sSetThreadStatsUid;

    static {
        try {
            sSetThreadStatsUid = android.net.TrafficStats.class.getMethod("setThreadStatsUid", java.lang.Integer.TYPE);
            sClearThreadStatsUid = android.net.TrafficStats.class.getMethod("clearThreadStatsUid", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.SecurityException e17) {
            throw new java.lang.RuntimeException("Unable to get TrafficStats methods", e17);
        }
    }

    public static void clear() {
        try {
            sClearThreadStatsUid.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("TrafficStats.clearThreadStatsUid failed", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            throw new java.lang.RuntimeException("TrafficStats.clearThreadStatsUid failed", e18);
        }
    }

    public static void set(int i17) {
        try {
            sSetThreadStatsUid.invoke(null, java.lang.Integer.valueOf(i17));
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("TrafficStats.setThreadStatsUid failed", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            throw new java.lang.RuntimeException("TrafficStats.setThreadStatsUid failed", e18);
        }
    }
}
