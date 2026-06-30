package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
public class TraceEvent implements java.lang.AutoCloseable {
    private static volatile boolean sEnabled;
    private static boolean sEventNameFilteringEnabled;
    private static volatile boolean sUiThreadReady;
    private final java.lang.String mName;

    /* loaded from: classes13.dex */
    public static class ActivityInfo {
        public java.lang.String mActivityName;
        public java.util.ArrayList<org.chromium.base.TraceEvent.ViewInfo> mViews = new java.util.ArrayList<>(125);

        public ActivityInfo(java.lang.String str) {
            this.mActivityName = str;
        }
    }

    /* loaded from: classes13.dex */
    public static class BasicLooperMonitor implements android.util.Printer {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final java.lang.String FILTERED_EVENT_NAME = "Looper.dispatch: EVENT_NAME_FILTERED";
        static final java.lang.String LOOPER_TASK_PREFIX = "Looper.dispatch: ";
        private static final int SHORTEST_LOG_PREFIX_LENGTH = 18;
        private java.lang.String mCurrentTarget;

        private static java.lang.String getTarget(java.lang.String str) {
            int indexOf = str.indexOf(40, SHORTEST_LOG_PREFIX_LENGTH);
            int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
            return indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
        }

        private static java.lang.String getTargetName(java.lang.String str) {
            int indexOf = str.indexOf(125, SHORTEST_LOG_PREFIX_LENGTH);
            int indexOf2 = indexOf == -1 ? -1 : str.indexOf(58, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            return indexOf != -1 ? str.substring(indexOf + 2, indexOf2) : "";
        }

        public static java.lang.String getTraceEventName(java.lang.String str) {
            if (org.chromium.base.TraceEvent.sEventNameFilteringEnabled) {
                return FILTERED_EVENT_NAME;
            }
            return LOOPER_TASK_PREFIX + getTarget(str) + "(" + getTargetName(str) + ")";
        }

        public void beginHandling(java.lang.String str) {
            boolean enabled = org.chromium.base.EarlyTraceEvent.enabled();
            if (org.chromium.base.TraceEvent.sEnabled || enabled) {
                this.mCurrentTarget = getTraceEventName(str);
                if (org.chromium.base.TraceEvent.sEnabled) {
                    org.chromium.base.TraceEventJni.get().beginToplevel(this.mCurrentTarget);
                } else {
                    org.chromium.base.EarlyTraceEvent.begin(this.mCurrentTarget, true);
                }
            }
        }

        public void endHandling(java.lang.String str) {
            boolean enabled = org.chromium.base.EarlyTraceEvent.enabled();
            if ((org.chromium.base.TraceEvent.sEnabled || enabled) && this.mCurrentTarget != null) {
                if (org.chromium.base.TraceEvent.sEnabled) {
                    org.chromium.base.TraceEventJni.get().endToplevel(this.mCurrentTarget);
                } else {
                    org.chromium.base.EarlyTraceEvent.end(this.mCurrentTarget, true);
                }
            }
            this.mCurrentTarget = null;
        }

        @Override // android.util.Printer
        public void println(java.lang.String str) {
            if (str.startsWith(">")) {
                beginHandling(str);
            } else {
                endHandling(str);
            }
        }
    }

    /* loaded from: classes13.dex */
    public static final class IdleTracingLooperMonitor extends org.chromium.base.TraceEvent.BasicLooperMonitor implements android.os.MessageQueue.IdleHandler {
        private static final long FRAME_DURATION_MILLIS = 16;
        private static final java.lang.String IDLE_EVENT_NAME = "Looper.queueIdle";
        private static final long MIN_INTERESTING_BURST_DURATION_MILLIS = 48;
        private static final long MIN_INTERESTING_DURATION_MILLIS = 16;
        private static final java.lang.String TAG = "TraceEvt_LooperMonitor";
        private boolean mIdleMonitorAttached;
        private long mLastIdleStartedAt;
        private long mLastWorkStartedAt;
        private int mNumIdlesSeen;
        private int mNumTasksSeen;
        private int mNumTasksSinceLastIdle;

        private final void syncIdleMonitoring() {
            if (org.chromium.base.TraceEvent.sEnabled && !this.mIdleMonitorAttached) {
                this.mLastIdleStartedAt = org.chromium.base.TimeUtils.elapsedRealtimeMillis();
                android.os.Looper.myQueue().addIdleHandler(this);
                this.mIdleMonitorAttached = true;
            } else {
                if (!this.mIdleMonitorAttached || org.chromium.base.TraceEvent.sEnabled) {
                    return;
                }
                android.os.Looper.myQueue().removeIdleHandler(this);
                this.mIdleMonitorAttached = false;
            }
        }

        private static void traceAndLog(int i17, java.lang.String str) {
            org.chromium.base.TraceEvent.instant("TraceEvent.LooperMonitor:IdleStats", str);
            android.util.Log.println(i17, TAG, str);
        }

        @Override // org.chromium.base.TraceEvent.BasicLooperMonitor
        public final void beginHandling(java.lang.String str) {
            if (this.mNumTasksSinceLastIdle == 0) {
                org.chromium.base.TraceEvent.end(IDLE_EVENT_NAME);
            }
            this.mLastWorkStartedAt = org.chromium.base.TimeUtils.elapsedRealtimeMillis();
            syncIdleMonitoring();
            super.beginHandling(str);
        }

        @Override // org.chromium.base.TraceEvent.BasicLooperMonitor
        public final void endHandling(java.lang.String str) {
            long elapsedRealtimeMillis = org.chromium.base.TimeUtils.elapsedRealtimeMillis() - this.mLastWorkStartedAt;
            if (elapsedRealtimeMillis > 16) {
                traceAndLog(5, "observed a task that took " + elapsedRealtimeMillis + "ms: " + str);
            }
            super.endHandling(str);
            syncIdleMonitoring();
            this.mNumTasksSeen++;
            this.mNumTasksSinceLastIdle++;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtimeMillis = org.chromium.base.TimeUtils.elapsedRealtimeMillis();
            if (this.mLastIdleStartedAt == 0) {
                this.mLastIdleStartedAt = elapsedRealtimeMillis;
            }
            long j17 = elapsedRealtimeMillis - this.mLastIdleStartedAt;
            this.mNumIdlesSeen++;
            org.chromium.base.TraceEvent.begin(IDLE_EVENT_NAME, this.mNumTasksSinceLastIdle + " tasks since last idle.");
            if (j17 > MIN_INTERESTING_BURST_DURATION_MILLIS) {
                traceAndLog(3, this.mNumTasksSeen + " tasks and " + this.mNumIdlesSeen + " idles processed so far, " + this.mNumTasksSinceLastIdle + " tasks bursted and " + j17 + "ms elapsed since last idle");
            }
            this.mLastIdleStartedAt = elapsedRealtimeMillis;
            this.mNumTasksSinceLastIdle = 0;
            return true;
        }

        private IdleTracingLooperMonitor() {
        }
    }

    /* loaded from: classes13.dex */
    public static final class LooperMonitorHolder {
        private static final org.chromium.base.TraceEvent.BasicLooperMonitor sInstance;

        static {
            sInstance = org.chromium.base.CommandLine.getInstance().hasSwitch(org.chromium.base.BaseSwitches.ENABLE_IDLE_TRACING) ? new org.chromium.base.TraceEvent.IdleTracingLooperMonitor() : new org.chromium.base.TraceEvent.BasicLooperMonitor();
        }

        private LooperMonitorHolder() {
        }
    }

    /* loaded from: classes13.dex */
    public interface Natives {
        void addViewDump(int i17, int i18, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, long j17);

        void begin(java.lang.String str, java.lang.String str2);

        void beginToplevel(java.lang.String str);

        void beginWithIntArg(java.lang.String str, int i17);

        void end(java.lang.String str, java.lang.String str2, long j17);

        void endToplevel(java.lang.String str);

        void finishAsync(java.lang.String str, long j17);

        void initViewHierarchyDump(long j17, java.lang.Object obj);

        void instant(java.lang.String str, java.lang.String str2);

        void instantAndroidIPC(java.lang.String str, long j17);

        void instantAndroidToolbar(int i17, int i18, int i19);

        void registerEnabledObserver();

        long startActivityDump(java.lang.String str, long j17);

        void startAsync(java.lang.String str, long j17);

        boolean viewHierarchyDumpEnabled();

        void webViewStartupStage1(long j17, long j18);

        void webViewStartupStage2(long j17, long j18, boolean z17);

        void webViewStartupTotalFactoryInit(long j17, long j18);
    }

    /* loaded from: classes13.dex */
    public static final class ViewHierarchyDumper implements android.os.MessageQueue.IdleHandler {
        private static final java.lang.String EVENT_NAME = "TraceEvent.ViewHierarchyDumper";
        private static final long MIN_VIEW_DUMP_INTERVAL_MILLIS = 1000;
        private static boolean sEnabled;
        private static org.chromium.base.TraceEvent.ViewHierarchyDumper sInstance;
        private long mLastDumpTs;

        private ViewHierarchyDumper() {
        }

        private static void disable() {
            org.chromium.base.ThreadUtils.assertOnUiThread();
            if (sEnabled) {
                android.os.Looper.myQueue().removeIdleHandler(sInstance);
                sEnabled = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void dumpView(org.chromium.base.TraceEvent.ActivityInfo activityInfo, int i17, android.view.View view) {
            org.chromium.base.ThreadUtils.assertOnUiThread();
            int id6 = view.getId();
            activityInfo.mViews.add(new org.chromium.base.TraceEvent.ViewInfo(id6, i17, view.isShown(), view.isDirty(), view.getClass().getSimpleName(), view.getResources()));
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                    dumpView(activityInfo, id6, viewGroup.getChildAt(i18));
                }
            }
        }

        private static void enable() {
            org.chromium.base.ThreadUtils.assertOnUiThread();
            if (sEnabled) {
                return;
            }
            android.os.Looper.myQueue().addIdleHandler(sInstance);
            sEnabled = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$updateEnabledState$0() {
            if (org.chromium.base.TraceEventJni.get().viewHierarchyDumpEnabled()) {
                if (sInstance == null) {
                    sInstance = new org.chromium.base.TraceEvent.ViewHierarchyDumper();
                }
                enable();
            } else if (sInstance != null) {
                disable();
            }
        }

        public static void updateEnabledState() {
            org.chromium.base.task.PostTask.runOrPostTask(7, new org.chromium.base.TraceEvent$ViewHierarchyDumper$$a());
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtimeMillis = org.chromium.base.TimeUtils.elapsedRealtimeMillis();
            long j17 = this.mLastDumpTs;
            if (j17 != 0 && elapsedRealtimeMillis - j17 <= 1000) {
                return true;
            }
            this.mLastDumpTs = elapsedRealtimeMillis;
            org.chromium.base.TraceEvent.snapshotViewHierarchy();
            return true;
        }
    }

    /* loaded from: classes13.dex */
    public static class ViewInfo {
        private java.lang.String mClassName;
        private int mId;
        private boolean mIsDirty;
        private boolean mIsShown;
        private int mParentId;
        private android.content.res.Resources mRes;

        public ViewInfo(int i17, int i18, boolean z17, boolean z18, java.lang.String str, android.content.res.Resources resources) {
            this.mId = i17;
            this.mParentId = i18;
            this.mIsShown = z17;
            this.mIsDirty = z18;
            this.mClassName = str;
            this.mRes = resources;
        }
    }

    private TraceEvent(java.lang.String str, java.lang.String str2) {
        this.mName = str;
        begin(str, str2);
    }

    public static void begin(java.lang.String str) {
        begin(str, (java.lang.String) null);
    }

    public static void dumpViewHierarchy(long j17, java.lang.Object obj) {
        java.lang.String str;
        if (org.chromium.base.ApplicationStatus.isInitialized()) {
            java.util.Iterator it = ((java.util.ArrayList) obj).iterator();
            while (it.hasNext()) {
                org.chromium.base.TraceEvent.ActivityInfo activityInfo = (org.chromium.base.TraceEvent.ActivityInfo) it.next();
                long startActivityDump = org.chromium.base.TraceEventJni.get().startActivityDump(activityInfo.mActivityName, j17);
                java.util.Iterator<org.chromium.base.TraceEvent.ViewInfo> it6 = activityInfo.mViews.iterator();
                while (it6.hasNext()) {
                    org.chromium.base.TraceEvent.ViewInfo next = it6.next();
                    try {
                        if (next.mRes != null) {
                            if (next.mId != 0 && next.mId != -1) {
                                str = next.mRes.getResourceName(next.mId);
                            }
                            str = "__no_id__";
                        } else {
                            str = "__no_resources__";
                        }
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        str = "__name_not_found__";
                    }
                    org.chromium.base.TraceEventJni.get().addViewDump(next.mId, next.mParentId, next.mIsShown, next.mIsDirty, next.mClassName, str, startActivityDump);
                }
            }
        }
    }

    public static boolean enabled() {
        return sEnabled;
    }

    public static void end(java.lang.String str) {
        end(str, null);
    }

    public static boolean eventNameFilteringEnabled() {
        return sEventNameFilteringEnabled;
    }

    public static void finishAsync(java.lang.String str, long j17) {
        org.chromium.base.EarlyTraceEvent.finishAsync(str, j17);
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().finishAsync(str, j17);
        }
    }

    public static void instant(java.lang.String str) {
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().instant(str, null);
        }
    }

    public static void instantAndroidIPC(java.lang.String str, long j17) {
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().instantAndroidIPC(str, j17);
        }
    }

    public static void instantAndroidToolbar(int i17, int i18, int i19) {
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().instantAndroidToolbar(i17, i18, i19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$snapshotViewHierarchy$0(long j17, java.util.ArrayList arrayList) {
        org.chromium.base.TraceEventJni.get().initViewHierarchyDump(j17, arrayList);
    }

    public static void maybeEnableEarlyTracing(boolean z17) {
        if (z17) {
            org.chromium.base.EarlyTraceEvent.maybeEnableInBrowserProcess();
        }
        if (org.chromium.base.EarlyTraceEvent.enabled()) {
            org.chromium.base.ThreadUtils.getUiThreadLooper().setMessageLogging(org.chromium.base.TraceEvent.LooperMonitorHolder.sInstance);
        }
    }

    public static void onNativeTracingReady() {
        org.chromium.base.TraceEventJni.get().registerEnabledObserver();
    }

    public static void onUiThreadReady() {
        sUiThreadReady = true;
        if (sEnabled) {
            org.chromium.base.TraceEvent.ViewHierarchyDumper.updateEnabledState();
        }
    }

    public static org.chromium.base.TraceEvent scoped(java.lang.String str, java.lang.String str2) {
        if (org.chromium.base.EarlyTraceEvent.enabled() || enabled()) {
            return new org.chromium.base.TraceEvent(str, str2);
        }
        return null;
    }

    public static void setEnabled(boolean z17) {
        if (z17) {
            org.chromium.base.EarlyTraceEvent.disable();
        }
        if (sEnabled != z17) {
            sEnabled = z17;
            org.chromium.base.ThreadUtils.getUiThreadLooper().setMessageLogging(z17 ? org.chromium.base.TraceEvent.LooperMonitorHolder.sInstance : null);
        }
        if (sUiThreadReady) {
            org.chromium.base.TraceEvent.ViewHierarchyDumper.updateEnabledState();
        }
    }

    public static void setEventNameFilteringEnabled(boolean z17) {
        sEventNameFilteringEnabled = z17;
    }

    public static void snapshotViewHierarchy() {
        if (sEnabled && org.chromium.base.TraceEventJni.get().viewHierarchyDumpEnabled()) {
            begin("instantAndroidViewHierarchy");
            final java.util.ArrayList<org.chromium.base.TraceEvent.ActivityInfo> snapshotViewHierarchyState = snapshotViewHierarchyState();
            if (snapshotViewHierarchyState.isEmpty()) {
                end("instantAndroidViewHierarchy");
                return;
            }
            final long hashCode = snapshotViewHierarchyState.hashCode();
            org.chromium.base.task.PostTask.postTask(0, new java.lang.Runnable() { // from class: org.chromium.base.TraceEvent$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.chromium.base.TraceEvent.lambda$snapshotViewHierarchy$0(hashCode, snapshotViewHierarchyState);
                }
            });
            end("instantAndroidViewHierarchy", null, hashCode);
        }
    }

    public static java.util.ArrayList<org.chromium.base.TraceEvent.ActivityInfo> snapshotViewHierarchyState() {
        if (!org.chromium.base.ApplicationStatus.isInitialized()) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<org.chromium.base.TraceEvent.ActivityInfo> arrayList = new java.util.ArrayList<>(2);
        for (android.app.Activity activity : org.chromium.base.ApplicationStatus.getRunningActivities()) {
            arrayList.add(new org.chromium.base.TraceEvent.ActivityInfo(activity.getClass().getName()));
            org.chromium.base.TraceEvent.ViewHierarchyDumper.dumpView(arrayList.get(arrayList.size() - 1), 0, activity.getWindow().getDecorView().getRootView());
        }
        return arrayList;
    }

    public static void startAsync(java.lang.String str, long j17) {
        org.chromium.base.EarlyTraceEvent.startAsync(str, j17);
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().startAsync(str, j17);
        }
    }

    public static void webViewStartupStage1(long j17, long j18) {
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().webViewStartupStage1(j17, j18);
        }
    }

    public static void webViewStartupStage2(long j17, long j18, boolean z17) {
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().webViewStartupStage2(j17, j18, z17);
        }
    }

    public static void webViewStartupTotalFactoryInit(long j17, long j18) {
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().webViewStartupTotalFactoryInit(j17, j18);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end(this.mName);
    }

    public static void begin(java.lang.String str, java.lang.String str2) {
        org.chromium.base.EarlyTraceEvent.begin(str, false);
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().begin(str, str2);
        }
    }

    public static void end(java.lang.String str, java.lang.String str2) {
        end(str, str2, 0L);
    }

    public static void instant(java.lang.String str, java.lang.String str2) {
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().instant(str, str2);
        }
    }

    public static void end(java.lang.String str, java.lang.String str2, long j17) {
        org.chromium.base.EarlyTraceEvent.end(str, false);
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().end(str, str2, j17);
        }
    }

    public static org.chromium.base.TraceEvent scoped(java.lang.String str, int i17) {
        if (org.chromium.base.EarlyTraceEvent.enabled() || enabled()) {
            return new org.chromium.base.TraceEvent(str, i17);
        }
        return null;
    }

    private TraceEvent(java.lang.String str, int i17) {
        this.mName = str;
        begin(str, i17);
    }

    public static void begin(java.lang.String str, int i17) {
        org.chromium.base.EarlyTraceEvent.begin(str, false);
        if (sEnabled) {
            org.chromium.base.TraceEventJni.get().beginWithIntArg(str, i17);
        }
    }

    public static org.chromium.base.TraceEvent scoped(java.lang.String str) {
        return scoped(str, (java.lang.String) null);
    }
}
