package org.chromium.base;

/* loaded from: classes13.dex */
public class TimeUtils {
    public static final long MILLISECONDS_PER_MINUTE = 60000;
    public static final long NANOSECONDS_PER_MICROSECOND = 1000;
    public static final long NANOSECONDS_PER_MILLISECOND = 1000000;
    public static final long SECONDS_PER_DAY = 86400;
    public static final long SECONDS_PER_HOUR = 3600;
    public static final long SECONDS_PER_MINUTE = 60;
    static org.chromium.base.TimeUtils.FakeClock sFakeClock;

    /* loaded from: classes13.dex */
    public static class CurrentThreadTimeMillisTimer {
        private final long mStart = org.chromium.base.TimeUtils.currentThreadTimeMillis();

        public long getElapsedMillis() {
            return org.chromium.base.TimeUtils.currentThreadTimeMillis() - this.mStart;
        }
    }

    /* loaded from: classes13.dex */
    public static class ElapsedRealtimeMillisTimer {
        private final long mStart = org.chromium.base.TimeUtils.elapsedRealtimeMillis();

        public long getElapsedMillis() {
            return org.chromium.base.TimeUtils.elapsedRealtimeMillis() - this.mStart;
        }
    }

    /* loaded from: classes13.dex */
    public static class ElapsedRealtimeNanosTimer {
        private final long mStart = org.chromium.base.TimeUtils.elapsedRealtimeNanos();

        public long getElapsedNanos() {
            return org.chromium.base.TimeUtils.elapsedRealtimeNanos() - this.mStart;
        }
    }

    /* loaded from: classes13.dex */
    public interface FakeClock {
        long currentThreadTimeMillis();

        long currentTimeMillis();

        long elapsedRealtimeNanos();

        long uptimeMillis();
    }

    /* loaded from: classes13.dex */
    public static class UptimeMillisTimer {
        private final long mStart = org.chromium.base.TimeUtils.uptimeMillis();

        public long getElapsedMillis() {
            return org.chromium.base.TimeUtils.uptimeMillis() - this.mStart;
        }
    }

    private TimeUtils() {
    }

    public static long currentThreadTimeMillis() {
        org.chromium.base.TimeUtils.FakeClock fakeClock = sFakeClock;
        return fakeClock != null ? fakeClock.currentThreadTimeMillis() : android.os.SystemClock.currentThreadTimeMillis();
    }

    public static long currentTimeMillis() {
        org.chromium.base.TimeUtils.FakeClock fakeClock = sFakeClock;
        return fakeClock != null ? fakeClock.currentTimeMillis() : java.lang.System.currentTimeMillis();
    }

    public static long elapsedRealtimeMillis() {
        org.chromium.base.TimeUtils.FakeClock fakeClock = sFakeClock;
        return fakeClock != null ? fakeClock.elapsedRealtimeNanos() / 1000000 : android.os.SystemClock.elapsedRealtime();
    }

    public static long elapsedRealtimeNanos() {
        org.chromium.base.TimeUtils.FakeClock fakeClock = sFakeClock;
        return fakeClock != null ? fakeClock.elapsedRealtimeNanos() : android.os.SystemClock.elapsedRealtimeNanos();
    }

    public static long uptimeMillis() {
        org.chromium.base.TimeUtils.FakeClock fakeClock = sFakeClock;
        return fakeClock != null ? fakeClock.uptimeMillis() : android.os.SystemClock.uptimeMillis();
    }
}
