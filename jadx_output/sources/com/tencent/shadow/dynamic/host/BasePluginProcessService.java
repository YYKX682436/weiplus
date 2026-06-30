package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public abstract class BasePluginProcessService extends android.app.Service {
    private static final com.tencent.shadow.core.common.Logger logger = com.tencent.shadow.core.common.LoggerFactory.getLogger("Shadow.BasePluginProcessService");
    private static java.lang.Object sSingleInstanceFlag = null;

    /* loaded from: classes11.dex */
    public static class ActivityHolder implements android.app.Application.ActivityLifecycleCallbacks {
        private final java.util.List<android.app.Activity> mActivities = new java.util.LinkedList();

        public void finishAll() {
            java.util.Iterator<android.app.Activity> it = this.mActivities.iterator();
            while (it.hasNext()) {
                it.next().finish();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            this.mActivities.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            this.mActivities.remove(activity);
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
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        if (sSingleInstanceFlag != null) {
            throw new java.lang.IllegalStateException("PPS出现多实例");
        }
        sSingleInstanceFlag = new java.lang.Object();
        super.onCreate();
        com.tencent.shadow.core.common.Logger logger2 = logger;
        if (logger2.isInfoEnabled()) {
            logger2.info("onCreate:" + this);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.tencent.shadow.core.common.Logger logger2 = logger;
        if (logger2.isInfoEnabled()) {
            logger2.info("onDestroy:" + this);
        }
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        super.onRebind(intent);
        com.tencent.shadow.core.common.Logger logger2 = logger;
        if (logger2.isInfoEnabled()) {
            logger2.info("onRebind:" + this);
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        super.onTaskRemoved(intent);
        com.tencent.shadow.core.common.Logger logger2 = logger;
        if (logger2.isInfoEnabled()) {
            logger2.info("onTaskRemoved:" + this);
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.shadow.core.common.Logger logger2 = logger;
        if (logger2.isInfoEnabled()) {
            logger2.info("onUnbind:" + this);
        }
        return super.onUnbind(intent);
    }
}
