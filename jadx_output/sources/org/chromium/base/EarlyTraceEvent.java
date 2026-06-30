package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
public class EarlyTraceEvent {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String BACKGROUND_STARTUP_TRACING_ENABLED_KEY = "bg_startup_tracing";
    static final int STATE_DISABLED = 0;
    static final int STATE_ENABLED = 1;
    static final int STATE_FINISHED = 2;
    private static final java.lang.String TRACE_CONFIG_FILENAME = "/data/local/chrome-trace-config.json";
    public static final java.lang.String TRACE_EARLY_JAVA_IN_CHILD_SWITCH = "trace-early-java-in-child";
    private static final java.lang.String TRACE_STARTUP_SWITCH = "trace-startup";
    static java.util.List<org.chromium.base.EarlyTraceEvent.AsyncEvent> sAsyncEvents;
    private static boolean sCachedBackgroundStartupTracingFlag;
    private static volatile boolean sEnabledInChildProcessBeforeCommandLine;
    static java.util.List<org.chromium.base.EarlyTraceEvent.Event> sEvents;
    static final java.lang.Object sLock = new java.lang.Object();
    static volatile int sState;

    /* loaded from: classes13.dex */
    public static final class AsyncEvent {
        final long mId;
        final boolean mIsStart;
        final java.lang.String mName;
        final long mTimeNanos = java.lang.System.nanoTime();

        public AsyncEvent(java.lang.String str, long j17, boolean z17) {
            this.mName = str;
            this.mId = j17;
            this.mIsStart = z17;
        }
    }

    /* loaded from: classes13.dex */
    public static final class Event {
        final boolean mIsStart;
        final boolean mIsToplevel;
        final java.lang.String mName;
        final int mThreadId = android.os.Process.myTid();
        final long mTimeNanos = java.lang.System.nanoTime();
        final long mThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();

        public Event(java.lang.String str, boolean z17, boolean z18) {
            this.mIsStart = z17;
            this.mIsToplevel = z18;
            this.mName = str;
        }
    }

    /* loaded from: classes13.dex */
    public interface Natives {
        void recordEarlyAsyncBeginEvent(java.lang.String str, long j17, long j18);

        void recordEarlyAsyncEndEvent(long j17, long j18);

        void recordEarlyBeginEvent(java.lang.String str, long j17, int i17, long j18);

        void recordEarlyEndEvent(java.lang.String str, long j17, int i17, long j18);

        void recordEarlyToplevelBeginEvent(java.lang.String str, long j17, int i17, long j18);

        void recordEarlyToplevelEndEvent(java.lang.String str, long j17, int i17, long j18);
    }

    public static void begin(java.lang.String str, boolean z17) {
        if (enabled()) {
            org.chromium.base.EarlyTraceEvent.Event event = new org.chromium.base.EarlyTraceEvent.Event(str, true, z17);
            synchronized (sLock) {
                if (enabled()) {
                    sEvents.add(event);
                }
            }
        }
    }

    public static void disable() {
        synchronized (sLock) {
            if (enabled()) {
                if (!sEvents.isEmpty()) {
                    dumpEvents(sEvents);
                    sEvents.clear();
                }
                if (!sAsyncEvents.isEmpty()) {
                    dumpAsyncEvents(sAsyncEvents);
                    sAsyncEvents.clear();
                }
                sState = 2;
                sEvents = null;
                sAsyncEvents = null;
            }
        }
    }

    private static void dumpAsyncEvents(java.util.List<org.chromium.base.EarlyTraceEvent.AsyncEvent> list) {
        for (org.chromium.base.EarlyTraceEvent.AsyncEvent asyncEvent : list) {
            if (asyncEvent.mIsStart) {
                org.chromium.base.EarlyTraceEventJni.get().recordEarlyAsyncBeginEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimeNanos);
            } else {
                org.chromium.base.EarlyTraceEventJni.get().recordEarlyAsyncEndEvent(asyncEvent.mId, asyncEvent.mTimeNanos);
            }
        }
    }

    private static void dumpEvents(java.util.List<org.chromium.base.EarlyTraceEvent.Event> list) {
        for (org.chromium.base.EarlyTraceEvent.Event event : list) {
            if (event.mIsStart) {
                if (event.mIsToplevel) {
                    org.chromium.base.EarlyTraceEventJni.get().recordEarlyToplevelBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                } else {
                    org.chromium.base.EarlyTraceEventJni.get().recordEarlyBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                }
            } else if (event.mIsToplevel) {
                org.chromium.base.EarlyTraceEventJni.get().recordEarlyToplevelEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            } else {
                org.chromium.base.EarlyTraceEventJni.get().recordEarlyEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            }
        }
    }

    public static void earlyEnableInChildWithoutCommandLine() {
        sEnabledInChildProcessBeforeCommandLine = true;
        enable();
    }

    public static void enable() {
        synchronized (sLock) {
            if (sState != 0) {
                return;
            }
            sEvents = new java.util.ArrayList();
            sAsyncEvents = new java.util.ArrayList();
            sState = 1;
        }
    }

    public static boolean enabled() {
        return sState == 1;
    }

    public static void end(java.lang.String str, boolean z17) {
        if (enabled()) {
            org.chromium.base.EarlyTraceEvent.Event event = new org.chromium.base.EarlyTraceEvent.Event(str, false, z17);
            synchronized (sLock) {
                if (enabled()) {
                    sEvents.add(event);
                }
            }
        }
    }

    public static void finishAsync(java.lang.String str, long j17) {
        if (enabled()) {
            org.chromium.base.EarlyTraceEvent.AsyncEvent asyncEvent = new org.chromium.base.EarlyTraceEvent.AsyncEvent(str, j17, false);
            synchronized (sLock) {
                if (enabled()) {
                    sAsyncEvents.add(asyncEvent);
                }
            }
        }
    }

    public static boolean getBackgroundStartupTracingFlag() {
        return sCachedBackgroundStartupTracingFlag;
    }

    public static java.util.List<org.chromium.base.EarlyTraceEvent.Event> getMatchingCompletedEventsForTesting(java.lang.String str) {
        java.util.ArrayList arrayList;
        synchronized (sLock) {
            arrayList = new java.util.ArrayList();
            for (org.chromium.base.EarlyTraceEvent.Event event : sEvents) {
                if (event.mName.equals(str)) {
                    arrayList.add(event);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void maybeEnableInBrowserProcess() {
        /*
            org.chromium.base.ThreadUtils.assertOnUiThread()
            int r0 = org.chromium.base.EarlyTraceEvent.sState
            if (r0 == 0) goto L8
            return
        L8:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            org.chromium.base.CommandLine r1 = org.chromium.base.CommandLine.getInstance()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "trace-startup"
            boolean r1 = r1.hasSwitch(r2)     // Catch: java.lang.Throwable -> L4a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = r2
            goto L29
        L1c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            java.lang.String r4 = "/data/local/chrome-trace-config.json"
            r1.<init>(r4)     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            boolean r1 = r1.exists()     // Catch: java.lang.SecurityException -> L28 java.lang.Throwable -> L4a
            goto L29
        L28:
            r1 = r3
        L29:
            android.content.SharedPreferences r4 = org.chromium.base.ContextUtils.getAppSharedPreferences()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "bg_startup_tracing"
            boolean r4 = r4.getBoolean(r5, r3)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L40
            if (r1 == 0) goto L3d
            setBackgroundStartupTracingFlag(r3)     // Catch: java.lang.Throwable -> L4a
            org.chromium.base.EarlyTraceEvent.sCachedBackgroundStartupTracingFlag = r3     // Catch: java.lang.Throwable -> L4a
            goto L40
        L3d:
            org.chromium.base.EarlyTraceEvent.sCachedBackgroundStartupTracingFlag = r2     // Catch: java.lang.Throwable -> L4a
            goto L41
        L40:
            r2 = r1
        L41:
            android.os.StrictMode.setThreadPolicy(r0)
            if (r2 == 0) goto L49
            enable()
        L49:
            return
        L4a:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.maybeEnableInBrowserProcess():void");
    }

    public static void onCommandLineAvailableInChildProcess() {
        if (sEnabledInChildProcessBeforeCommandLine) {
            synchronized (sLock) {
                if (!org.chromium.base.CommandLine.getInstance().hasSwitch(TRACE_EARLY_JAVA_IN_CHILD_SWITCH)) {
                    reset();
                } else {
                    if (sState == 0) {
                        enable();
                    }
                }
            }
        }
    }

    public static void reset() {
        synchronized (sLock) {
            sState = 0;
            sEvents = null;
            sAsyncEvents = null;
        }
    }

    public static void setBackgroundStartupTracingFlag(boolean z17) {
        org.chromium.base.StrictModeContext allowDiskWrites = org.chromium.base.StrictModeContext.allowDiskWrites();
        try {
            org.chromium.base.ContextUtils.getAppSharedPreferences().edit().putBoolean(BACKGROUND_STARTUP_TRACING_ENABLED_KEY, z17).apply();
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
        } catch (java.lang.Throwable th6) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static void startAsync(java.lang.String str, long j17) {
        if (enabled()) {
            org.chromium.base.EarlyTraceEvent.AsyncEvent asyncEvent = new org.chromium.base.EarlyTraceEvent.AsyncEvent(str, j17, true);
            synchronized (sLock) {
                if (enabled()) {
                    sAsyncEvents.add(asyncEvent);
                }
            }
        }
    }
}
