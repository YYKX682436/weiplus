package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes13.dex */
public class ApplicationStatus {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String CACHE_ACTIVITY_TASKID_KEY = "cache_activity_taskid_enabled";
    private static final java.lang.String TOOLBAR_CALLBACK_WRAPPER_CLASS = "androidx.appcompat.app.ToolbarActionBar$ToolbarCallbackWrapper";
    private static android.app.Activity sActivity;
    private static org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ApplicationStateListener> sApplicationStateListeners;
    private static org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ActivityStateListener> sGeneralActivityStateListeners;
    private static org.chromium.base.ApplicationStatus.ApplicationStateListener sNativeApplicationStateListener;
    private static org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.TaskVisibilityListener> sTaskVisibilityListeners;
    private static org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.WindowFocusChangedListener> sWindowFocusListeners;
    private static final java.util.Map<android.app.Activity, org.chromium.base.ApplicationStatus.ActivityInfo> sActivityInfo = java.util.Collections.synchronizedMap(new java.util.HashMap());
    public static final java.util.Map<android.app.Activity, java.lang.Integer> sActivityTaskId = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private static int sCurrentApplicationState = 0;

    /* loaded from: classes13.dex */
    public static class ActivityInfo {
        private org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ActivityStateListener> mListeners;
        private int mStatus;

        public org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ActivityStateListener> getListeners() {
            return this.mListeners;
        }

        public int getStatus() {
            return this.mStatus;
        }

        public void setStatus(int i17) {
            this.mStatus = i17;
        }

        private ActivityInfo() {
            this.mStatus = 6;
            this.mListeners = new org.chromium.base.ObserverList<>();
        }
    }

    /* loaded from: classes13.dex */
    public interface ActivityStateListener {
        void onActivityStateChange(android.app.Activity activity, int i17);
    }

    /* loaded from: classes13.dex */
    public interface ApplicationStateListener {
        void onApplicationStateChange(int i17);
    }

    /* loaded from: classes13.dex */
    public interface Natives {
        void onApplicationStateChange(int i17);
    }

    /* loaded from: classes13.dex */
    public interface TaskVisibilityListener {
        void onTaskVisibilityChanged(int i17, boolean z17);
    }

    /* loaded from: classes13.dex */
    public static class WindowCallbackProxy implements java.lang.reflect.InvocationHandler {
        private final android.app.Activity mActivity;
        private final android.view.Window.Callback mCallback;

        public WindowCallbackProxy(android.app.Activity activity, android.view.Window.Callback callback) {
            this.mCallback = callback;
            this.mActivity = activity;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            if (method.getName().equals("onWindowFocusChanged") && objArr.length == 1) {
                java.lang.Object obj2 = objArr[0];
                if (obj2 instanceof java.lang.Boolean) {
                    onWindowFocusChanged(((java.lang.Boolean) obj2).booleanValue());
                    return null;
                }
            }
            try {
                return method.invoke(this.mCallback, objArr);
            } catch (java.lang.reflect.InvocationTargetException e17) {
                if (e17.getCause() instanceof java.lang.AbstractMethodError) {
                    throw e17.getCause();
                }
                throw e17;
            }
        }

        public void onWindowFocusChanged(boolean z17) {
            this.mCallback.onWindowFocusChanged(z17);
            if (org.chromium.base.ApplicationStatus.sWindowFocusListeners != null) {
                java.util.Iterator it = org.chromium.base.ApplicationStatus.sWindowFocusListeners.iterator();
                while (it.hasNext()) {
                    ((org.chromium.base.ApplicationStatus.WindowFocusChangedListener) it.next()).onWindowFocusChanged(this.mActivity, z17);
                }
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(android.app.Activity activity, boolean z17);
    }

    private ApplicationStatus() {
    }

    public static android.view.Window.Callback createWindowCallbackProxy(android.app.Activity activity, android.view.Window.Callback callback) {
        return (android.view.Window.Callback) java.lang.reflect.Proxy.newProxyInstance(android.view.Window.Callback.class.getClassLoader(), new java.lang.Class[]{android.view.Window.Callback.class}, new org.chromium.base.ApplicationStatus.WindowCallbackProxy(activity, callback));
    }

    public static void destroyForJUnitTests() {
        java.util.Map<android.app.Activity, org.chromium.base.ApplicationStatus.ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ApplicationStateListener> observerList = sApplicationStateListeners;
            if (observerList != null) {
                observerList.clear();
            }
            org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ActivityStateListener> observerList2 = sGeneralActivityStateListeners;
            if (observerList2 != null) {
                observerList2.clear();
            }
            org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.TaskVisibilityListener> observerList3 = sTaskVisibilityListeners;
            if (observerList3 != null) {
                observerList3.clear();
            }
            map.clear();
            org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.WindowFocusChangedListener> observerList4 = sWindowFocusListeners;
            if (observerList4 != null) {
                observerList4.clear();
            }
            sCurrentApplicationState = 0;
            sActivity = null;
            sNativeApplicationStateListener = null;
        }
    }

    private static int determineApplicationStateLocked() {
        java.util.Iterator<org.chromium.base.ApplicationStatus.ActivityInfo> it = sActivityInfo.values().iterator();
        boolean z17 = false;
        boolean z18 = false;
        while (it.hasNext()) {
            int status = it.next().getStatus();
            if (status != 4 && status != 5 && status != 6) {
                return 1;
            }
            if (status == 4) {
                z17 = true;
            } else if (status == 5) {
                z18 = true;
            }
        }
        if (z17) {
            return 2;
        }
        return z18 ? 3 : 4;
    }

    public static android.app.Activity getLastTrackedFocusedActivity() {
        return sActivity;
    }

    public static java.util.List<android.app.Activity> getRunningActivities() {
        java.util.ArrayList arrayList;
        java.util.Map<android.app.Activity, org.chromium.base.ApplicationStatus.ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            arrayList = new java.util.ArrayList(map.keySet());
        }
        return arrayList;
    }

    public static int getStateForActivity(android.app.Activity activity) {
        org.chromium.base.ApplicationStatus.ActivityInfo activityInfo;
        if (activity == null || (activityInfo = sActivityInfo.get(activity)) == null) {
            return 6;
        }
        return activityInfo.getStatus();
    }

    public static int getStateForApplication() {
        int i17;
        synchronized (sActivityInfo) {
            i17 = sCurrentApplicationState;
        }
        return i17;
    }

    public static int getTaskId(android.app.Activity activity) {
        if (!isCachingEnabled()) {
            return activity.getTaskId();
        }
        java.util.Map<android.app.Activity, java.lang.Integer> map = sActivityTaskId;
        if (!map.containsKey(activity)) {
            synchronized (map) {
                map.put(activity, java.lang.Integer.valueOf(activity.getTaskId()));
            }
        }
        return map.get(activity).intValue();
    }

    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        return stateForApplication == 1 || stateForApplication == 2;
    }

    public static void initialize(android.app.Application application) {
        synchronized (sActivityInfo) {
            sCurrentApplicationState = 4;
        }
        registerWindowFocusChangedListener(new org.chromium.base.ApplicationStatus.WindowFocusChangedListener() { // from class: org.chromium.base.ApplicationStatus.1
            @Override // org.chromium.base.ApplicationStatus.WindowFocusChangedListener
            public void onWindowFocusChanged(android.app.Activity activity, boolean z17) {
                int stateForActivity;
                if (!z17 || activity == org.chromium.base.ApplicationStatus.sActivity || (stateForActivity = org.chromium.base.ApplicationStatus.getStateForActivity(activity)) == 6 || stateForActivity == 5) {
                    return;
                }
                org.chromium.base.ApplicationStatus.sActivity = activity;
            }
        });
        application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() { // from class: org.chromium.base.ApplicationStatus.2
            static final /* synthetic */ boolean $assertionsDisabled = false;

            private void checkCallback(android.app.Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                org.chromium.base.ApplicationStatus.onStateChange(activity, 1);
                activity.getWindow().setCallback(org.chromium.base.ApplicationStatus.createWindowCallbackProxy(activity, activity.getWindow().getCallback()));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                org.chromium.base.ApplicationStatus.onStateChange(activity, 6);
                checkCallback(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(android.app.Activity activity) {
                org.chromium.base.ApplicationStatus.onStateChange(activity, 4);
                checkCallback(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(android.app.Activity activity) {
                org.chromium.base.ApplicationStatus.onStateChange(activity, 3);
                checkCallback(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
                checkCallback(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(android.app.Activity activity) {
                org.chromium.base.ApplicationStatus.onStateChange(activity, 2);
                checkCallback(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(android.app.Activity activity) {
                org.chromium.base.ApplicationStatus.onStateChange(activity, 5);
                checkCallback(activity);
            }
        });
    }

    public static boolean isCachingEnabled() {
        org.chromium.base.StrictModeContext allowDiskReads = org.chromium.base.StrictModeContext.allowDiskReads();
        try {
            boolean z17 = org.chromium.base.ContextUtils.getAppSharedPreferences().getBoolean(CACHE_ACTIVITY_TASKID_KEY, false);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return z17;
        } catch (java.lang.Throwable th6) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static boolean isEveryActivityDestroyed() {
        return sActivityInfo.isEmpty();
    }

    public static boolean isInitialized() {
        boolean z17;
        synchronized (sActivityInfo) {
            z17 = sCurrentApplicationState != 0;
        }
        return z17;
    }

    public static boolean isTaskVisible(int i17) {
        int status;
        for (java.util.Map.Entry<android.app.Activity, org.chromium.base.ApplicationStatus.ActivityInfo> entry : sActivityInfo.entrySet()) {
            if (getTaskId(entry.getKey()) == i17 && ((status = entry.getValue().getStatus()) == 3 || status == 4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onStateChange(android.app.Activity activity, int i17) {
        org.chromium.base.ApplicationStatus.ActivityInfo activityInfo;
        org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ApplicationStateListener> observerList;
        org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.TaskVisibilityListener> observerList2;
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("null activity is not supported");
        }
        if (sActivity == null || i17 == 1 || i17 == 3 || i17 == 2) {
            sActivity = activity;
        }
        int stateForApplication = getStateForApplication();
        boolean isTaskVisible = isTaskVisible(getTaskId(activity));
        java.util.Map<android.app.Activity, org.chromium.base.ApplicationStatus.ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            if (i17 == 1) {
                map.put(activity, new org.chromium.base.ApplicationStatus.ActivityInfo());
            }
            activityInfo = map.get(activity);
            activityInfo.setStatus(i17);
            if (i17 == 6) {
                map.remove(activity);
                if (activity == sActivity) {
                    sActivity = null;
                }
            }
            sCurrentApplicationState = determineApplicationStateLocked();
        }
        java.util.Iterator<org.chromium.base.ApplicationStatus.ActivityStateListener> it = activityInfo.getListeners().iterator();
        while (it.hasNext()) {
            it.next().onActivityStateChange(activity, i17);
        }
        org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ActivityStateListener> observerList3 = sGeneralActivityStateListeners;
        if (observerList3 != null) {
            java.util.Iterator<org.chromium.base.ApplicationStatus.ActivityStateListener> it6 = observerList3.iterator();
            while (it6.hasNext()) {
                it6.next().onActivityStateChange(activity, i17);
            }
        }
        boolean isTaskVisible2 = isTaskVisible(getTaskId(activity));
        if (isTaskVisible2 != isTaskVisible && (observerList2 = sTaskVisibilityListeners) != null) {
            java.util.Iterator<org.chromium.base.ApplicationStatus.TaskVisibilityListener> it7 = observerList2.iterator();
            while (it7.hasNext()) {
                it7.next().onTaskVisibilityChanged(getTaskId(activity), isTaskVisible2);
            }
        }
        int stateForApplication2 = getStateForApplication();
        if (stateForApplication2 != stateForApplication && (observerList = sApplicationStateListeners) != null) {
            java.util.Iterator<org.chromium.base.ApplicationStatus.ApplicationStateListener> it8 = observerList.iterator();
            while (it8.hasNext()) {
                it8.next().onApplicationStateChange(stateForApplication2);
            }
        }
        java.util.Map<android.app.Activity, java.lang.Integer> map2 = sActivityTaskId;
        synchronized (map2) {
            if (i17 == 6) {
                map2.remove(activity);
            }
        }
    }

    public static void onStateChangeForTesting(android.app.Activity activity, int i17) {
        onStateChange(activity, i17);
    }

    public static boolean reachesWindowCallback(android.view.Window.Callback callback) {
        if (callback == null) {
            return false;
        }
        if (callback.getClass().getName().equals("androidx.appcompat.app.p0")) {
            return true;
        }
        if (java.lang.reflect.Proxy.isProxyClass(callback.getClass())) {
            return java.lang.reflect.Proxy.getInvocationHandler(callback) instanceof org.chromium.base.ApplicationStatus.WindowCallbackProxy;
        }
        for (java.lang.Class<?> cls = callback.getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (field.getType().isAssignableFrom(android.view.Window.Callback.class)) {
                    boolean isAccessible = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        android.view.Window.Callback callback2 = (android.view.Window.Callback) field.get(callback);
                        field.setAccessible(isAccessible);
                        if (reachesWindowCallback(callback2)) {
                            return true;
                        }
                    } catch (java.lang.IllegalAccessException unused) {
                        field.setAccessible(isAccessible);
                    } catch (java.lang.Throwable th6) {
                        field.setAccessible(isAccessible);
                        throw th6;
                    }
                }
            }
        }
        return false;
    }

    public static void registerApplicationStateListener(org.chromium.base.ApplicationStatus.ApplicationStateListener applicationStateListener) {
        if (sApplicationStateListeners == null) {
            sApplicationStateListeners = new org.chromium.base.ObserverList<>();
        }
        sApplicationStateListeners.addObserver(applicationStateListener);
    }

    public static void registerStateListenerForActivity(org.chromium.base.ApplicationStatus.ActivityStateListener activityStateListener, android.app.Activity activity) {
        sActivityInfo.get(activity).getListeners().addObserver(activityStateListener);
    }

    public static void registerStateListenerForAllActivities(org.chromium.base.ApplicationStatus.ActivityStateListener activityStateListener) {
        if (sGeneralActivityStateListeners == null) {
            sGeneralActivityStateListeners = new org.chromium.base.ObserverList<>();
        }
        sGeneralActivityStateListeners.addObserver(activityStateListener);
    }

    public static void registerTaskVisibilityListener(org.chromium.base.ApplicationStatus.TaskVisibilityListener taskVisibilityListener) {
        if (sTaskVisibilityListeners == null) {
            sTaskVisibilityListeners = new org.chromium.base.ObserverList<>();
        }
        sTaskVisibilityListeners.addObserver(taskVisibilityListener);
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        org.chromium.base.ThreadUtils.runOnUiThread(new java.lang.Runnable() { // from class: org.chromium.base.ApplicationStatus.3
            @Override // java.lang.Runnable
            public void run() {
                if (org.chromium.base.ApplicationStatus.sNativeApplicationStateListener != null) {
                    return;
                }
                org.chromium.base.ApplicationStatus.sNativeApplicationStateListener = new org.chromium.base.ApplicationStatus.ApplicationStateListener() { // from class: org.chromium.base.ApplicationStatus.3.1
                    @Override // org.chromium.base.ApplicationStatus.ApplicationStateListener
                    public void onApplicationStateChange(int i17) {
                        org.chromium.base.ApplicationStatusJni.get().onApplicationStateChange(i17);
                    }
                };
                org.chromium.base.ApplicationStatus.registerApplicationStateListener(org.chromium.base.ApplicationStatus.sNativeApplicationStateListener);
            }
        });
    }

    public static void registerWindowFocusChangedListener(org.chromium.base.ApplicationStatus.WindowFocusChangedListener windowFocusChangedListener) {
        if (sWindowFocusListeners == null) {
            sWindowFocusListeners = new org.chromium.base.ObserverList<>();
        }
        sWindowFocusListeners.addObserver(windowFocusChangedListener);
    }

    public static void resetActivitiesForInstrumentationTests() {
        java.util.Map<android.app.Activity, org.chromium.base.ApplicationStatus.ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            java.util.Iterator it = new java.util.HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                onStateChangeForTesting((android.app.Activity) it.next(), 6);
            }
        }
    }

    public static void setCachingEnabled(boolean z17) {
        org.chromium.base.ContextUtils.getAppSharedPreferences().edit().putBoolean(CACHE_ACTIVITY_TASKID_KEY, z17).apply();
    }

    public static void unregisterActivityStateListener(org.chromium.base.ApplicationStatus.ActivityStateListener activityStateListener) {
        org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ActivityStateListener> observerList = sGeneralActivityStateListeners;
        if (observerList != null) {
            observerList.removeObserver(activityStateListener);
        }
        java.util.Map<android.app.Activity, org.chromium.base.ApplicationStatus.ActivityInfo> map = sActivityInfo;
        synchronized (map) {
            java.util.Iterator<org.chromium.base.ApplicationStatus.ActivityInfo> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().getListeners().removeObserver(activityStateListener);
            }
        }
    }

    public static void unregisterApplicationStateListener(org.chromium.base.ApplicationStatus.ApplicationStateListener applicationStateListener) {
        org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.ApplicationStateListener> observerList = sApplicationStateListeners;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(applicationStateListener);
    }

    public static void unregisterTaskVisibilityListener(org.chromium.base.ApplicationStatus.TaskVisibilityListener taskVisibilityListener) {
        org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.TaskVisibilityListener> observerList = sTaskVisibilityListeners;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(taskVisibilityListener);
    }

    public static void unregisterWindowFocusChangedListener(org.chromium.base.ApplicationStatus.WindowFocusChangedListener windowFocusChangedListener) {
        org.chromium.base.ObserverList<org.chromium.base.ApplicationStatus.WindowFocusChangedListener> observerList = sWindowFocusListeners;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(windowFocusChangedListener);
    }
}
