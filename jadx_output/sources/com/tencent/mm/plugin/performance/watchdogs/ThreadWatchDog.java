package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class ThreadWatchDog implements android.app.Application.ActivityLifecycleCallbacks, ob0.q3 {
    private static final int COLD_THREAD = 101;
    private static final com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog DOG = new com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog();
    private static final int HOOK_ID_KEY = 1571;
    public static final int HOOK_THRESHOLD = 20;
    private static final int LIMIT_THREAD_COUNT_150 = 150;
    private static final int LIMIT_THREAD_COUNT_200 = 200;
    private static final int LIMIT_THREAD_COUNT_300 = 300;
    private static final int OVER_300 = 2;
    private static final int OVER_500 = 1;
    private static final int OVER_500_WHITE_THREAD = 3;
    private static final int OVER_INC_50 = 4;
    public static final boolean POLISHING_THREAD_NAME = false;
    protected static final int REPORT_ID = 960;
    private static final int REPORT_KV_ID = 16470;
    private static final int SAMPLING_DAILY = 100;
    private static final java.lang.String TAG = "MicroMsg.ThreadWatchDog";
    private static volatile int TOP_THREAD_COUNT = 500;
    private boolean enableTriggerPthreadHook;
    private boolean isSensitiveMode;
    private volatile java.lang.StringBuilder mContent;
    private ob0.v2 mExtraInfoFactory;
    private int mLastReportedThreadCount;
    private long mLastWangTime;
    private volatile boolean mShouldPreventThrow;
    private volatile int mProcessThreadCount = 0;
    private volatile int mJavaThreadCount = 0;
    private volatile int mLastProcessThreadCount = 0;
    private volatile int mLastJavaThreadCount = 0;
    private final java.util.Collection<java.lang.String> mScenes = new java.util.concurrent.ConcurrentSkipListSet();

    private ThreadWatchDog() {
        com.tencent.mm.matrix.dice.c cVar = com.tencent.mm.matrix.dice.c.f68706f;
        cVar.c(new com.tencent.mm.plugin.performance.watchdogs.c1(this));
        cVar.c(new com.tencent.mm.plugin.performance.watchdogs.d1(this));
    }

    private void dumpThreadCountAndReportAsync(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.performance.watchdogs.e1(this));
    }

    public static void dumpThreadCountBg() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        int b17 = com.tencent.mm.plugin.performance.watchdogs.b1.b();
        java.util.Collection a17 = com.tencent.mm.plugin.performance.watchdogs.b1.a();
        java.util.Iterator it = a17.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((com.tencent.mm.plugin.performance.watchdogs.z0) it.next()).a();
        }
        dumpThreadCountInfo("bg", android.os.SystemClock.uptimeMillis() - uptimeMillis, i17, b17, a17.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dumpThreadCountInfo(java.lang.String str, long j17, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.w(TAG, "[dumpAsync][From:%s][Cost:%s][%s:%s]:%s", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
    }

    private void enablePthreadHook(java.util.List<java.lang.String> list) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = o45.wf.f343033k || com.tencent.mm.sdk.platformtools.s9.f192975c || z65.c.a() || this.enableTriggerPthreadHook;
        com.tencent.mars.xlog.Log.i(TAG, "enable auto trigger? %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (list.isEmpty()) {
                com.tencent.mars.xlog.Log.w(TAG, "threadNames is empty, just return");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String replace = it.next().replace("[", "\\[").replace("]", "\\]").replace("?", ".*");
                if (replace.length() > 1 && replace.endsWith("J")) {
                    replace = replace.substring(0, replace.length() - 1);
                }
                sb6.append(replace);
                sb6.append(";");
            }
            tp3.a.INSTANCE.d("<cmd><diagnostic><PthreadHook\n enable='1' process='" + processCmd() + "' duration='1' hook='.*\\.so$' thread='" + sb6.toString() + "'/></diagnostic></cmd>");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey(HOOK_ID_KEY, 11, 1);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey(HOOK_ID_KEY, getWatchDogTriggerProcessKey(), 1);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            jx3.f.INSTANCE.b(arrayList, false);
        }
    }

    public static synchronized com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog getDog() {
        com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog threadWatchDog;
        synchronized (com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog.class) {
            threadWatchDog = DOG;
        }
        return threadWatchDog;
    }

    private int getWatchDogTriggerProcessKey() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return 60;
        }
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            return 61;
        }
        return (com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.r()) ? 62 : -1;
    }

    private boolean isCheck() {
        if (android.os.SystemClock.uptimeMillis() - this.mLastWangTime < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            return false;
        }
        this.mLastWangTime = android.os.SystemClock.uptimeMillis();
        return true;
    }

    private static /* synthetic */ boolean lambda$samplingColdThreads$0(java.util.List list, com.tencent.mm.plugin.performance.watchdogs.a1 a1Var) {
        return !list.contains(java.lang.Integer.valueOf((int) a1Var.f153005b));
    }

    private java.lang.String map2Json(java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return new org.json.JSONObject(map).toString().replace(",", ";");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
            return "";
        }
    }

    private void onOverInc() {
        if (this.mContent == null) {
            this.mContent = new java.lang.StringBuilder(com.tencent.mm.plugin.performance.watchdogs.b1.c().toString());
        }
        java.lang.String format = java.lang.String.format("ThreadInc[%s:%s->%s:%s]: %s", java.lang.Integer.valueOf(this.mLastJavaThreadCount), java.lang.Integer.valueOf(this.mLastProcessThreadCount), java.lang.Integer.valueOf(this.mJavaThreadCount), java.lang.Integer.valueOf(this.mProcessThreadCount), this.mContent.toString());
        java.lang.String a17 = sp3.d.a(this.mScenes.toArray());
        com.tencent.mars.xlog.Log.i(TAG, "ThreadInc[%s:%s->%s:%s] passedScenes:%s", java.lang.Integer.valueOf(this.mLastJavaThreadCount), java.lang.Integer.valueOf(this.mLastProcessThreadCount), java.lang.Integer.valueOf(this.mJavaThreadCount), java.lang.Integer.valueOf(this.mProcessThreadCount), a17);
        jx3.f.INSTANCE.d(REPORT_KV_ID, format, 4, java.lang.Integer.valueOf(this.mJavaThreadCount), java.lang.Integer.valueOf(this.mProcessThreadCount), "", "", "", "", "", "", "", "", "", bm5.f1.a(), a17, com.tencent.mm.sdk.platformtools.z.f193109e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ca, code lost:
    
        if (r19.isSensitiveMode == false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean onOverThread(int r20, int r21, int r22, java.lang.StringBuilder r23) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog.onOverThread(int, int, int, java.lang.StringBuilder):boolean");
    }

    private final java.lang.String processCmd() {
        return com.tencent.mm.sdk.platformtools.x2.n() ? "mm" : com.tencent.mm.sdk.platformtools.x2.j() ? "appbrand" : com.tencent.mm.sdk.platformtools.x2.s() ? "tools" : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String report() {
        int i17 = com.tencent.mm.sdk.platformtools.x2.n() ? 100 : com.tencent.mm.sdk.platformtools.x2.s() ? 120 : com.tencent.mm.sdk.platformtools.x2.j() ? 140 : -1;
        if (i17 == -1) {
            return null;
        }
        this.mContent = null;
        try {
            if (this.mProcessThreadCount > TOP_THREAD_COUNT) {
                this.mContent = new java.lang.StringBuilder();
                this.mShouldPreventThrow = onOverThread(1, this.mJavaThreadCount, this.mProcessThreadCount, this.mContent);
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 1, 1L, true);
            } else if (this.mProcessThreadCount > 300) {
                jx3.f.INSTANCE.idkeyStat(960L, i17, 1L, true);
                if (this.mProcessThreadCount - this.mLastReportedThreadCount >= 50) {
                    this.mLastReportedThreadCount = this.mProcessThreadCount;
                    onOverThread(2, this.mJavaThreadCount, this.mProcessThreadCount, this.mContent);
                }
            } else if (this.mProcessThreadCount > 200) {
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 2, 1L, true);
            } else if (this.mProcessThreadCount > 150) {
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 3, 1L, true);
            } else {
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 8, 1L, true);
            }
            if (this.mJavaThreadCount > TOP_THREAD_COUNT) {
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 4, 1L, true);
            } else if (this.mJavaThreadCount > 300) {
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 5, 1L, true);
            } else if (this.mJavaThreadCount > 200) {
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 6, 1L, true);
            } else if (this.mJavaThreadCount > 150) {
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 7, 1L, true);
            } else {
                jx3.f.INSTANCE.idkeyStat(960L, i17 + 9, 1L, true);
            }
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_thread_watchdog_enable_inc_report_threshold;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int Ni = ((h62.d) e0Var).Ni(d0Var, z65.c.a() ? 30 : Integer.MAX_VALUE);
            if (this.mLastProcessThreadCount >= 200 && this.mProcessThreadCount - this.mLastProcessThreadCount >= Ni) {
                onOverInc();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
        }
        if (this.mContent == null) {
            return null;
        }
        return this.mContent.toString();
    }

    private static boolean samplingThread(int i17, long j17, int i18, int i19, java.util.List<com.tencent.mm.plugin.performance.watchdogs.z0> list, java.util.Collection<java.lang.String> collection) {
        if (i19 <= 0) {
            return false;
        }
        com.tencent.mm.plugin.performance.watchdogs.z0[] z0VarArr = new com.tencent.mm.plugin.performance.watchdogs.z0[3];
        int i27 = 0;
        for (com.tencent.mm.plugin.performance.watchdogs.z0 z0Var : list) {
            z0VarArr[i27] = z0Var;
            if (com.tencent.mm.plugin.performance.watchdogs.h1.a(z0Var.f153168a)) {
                return false;
            }
            i27++;
            if (i27 >= 3) {
                break;
            }
        }
        long j18 = j17 / 60000;
        list.toString();
        com.tencent.mars.xlog.Log.i(TAG, "trigger Over DailySampling: duration=" + j18 + ", javaThreadCount=" + i18 + ", processThreadCount=" + i19 + ", passed scenes: " + sp3.d.a(collection.toArray()));
        org.json.JSONObject json = toJson(list, null);
        if (json != null) {
            json.toString().replace(",", ";");
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("durationMin", java.lang.Long.valueOf(j18));
        linkedHashMap.put("appPrcFg", java.lang.Integer.valueOf(!com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground() ? 1 : 0));
        linkedHashMap.put("appExpFg", java.lang.Integer.valueOf(!com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() ? 1 : 0));
        int i28 = com.tencent.mm.feature.performance.api.a.f67523m0;
        pj.e.a(linkedHashMap);
        int i29 = com.tencent.mm.feature.performance.api.a.f67523m0;
        return false;
    }

    private static org.json.JSONObject toJson(java.util.List<com.tencent.mm.plugin.performance.watchdogs.z0> list, java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            org.json.JSONObject jSONObject = map == null ? new org.json.JSONObject() : new org.json.JSONObject(map);
            for (com.tencent.mm.plugin.performance.watchdogs.z0 z0Var : list) {
                jSONObject.put(z0Var.f153168a, z0Var.a());
            }
            return jSONObject;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.lang.String simpleName = activity.getClass().getSimpleName();
        this.mScenes.add(simpleName);
        if (isCheck()) {
            wang();
            dumpThreadCountAndReportAsync(simpleName);
        }
    }

    public boolean sampling(long j17) {
        int i17 = com.tencent.mm.feature.performance.api.a.f67523m0;
        return false;
    }

    public boolean samplingColdThreads(long j17, java.util.List<java.lang.Integer> list) {
        int i17 = com.tencent.mm.feature.performance.api.a.f67523m0;
        return false;
    }

    @Override // ob0.q3
    public void setExtraInfoFactory(ob0.v2 v2Var) {
        this.mExtraInfoFactory = v2Var;
    }

    public void wang() {
        if (this.mProcessThreadCount > TOP_THREAD_COUNT) {
            if (this.mShouldPreventThrow) {
                com.tencent.mars.xlog.Log.i(TAG, "prevent throw Exception");
                TOP_THREAD_COUNT += 1024;
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(TAG);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(this.mJavaThreadCount);
            objArr[1] = java.lang.Integer.valueOf(this.mProcessThreadCount);
            objArr[2] = this.mContent == null ? "null" : this.mContent.toString();
            sb6.append(java.lang.String.format("\nThreadOver[%s:%s]: %s", objArr));
            throw new java.lang.RuntimeException(sb6.toString());
        }
    }
}
