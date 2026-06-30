package com.tencent.tinker.loader.hotplug.interceptor;

/* loaded from: classes13.dex */
public class TinkerHackInstrumentation extends android.app.Instrumentation {
    private static final java.lang.String TAG = "Tinker.Instrumentation";
    private final java.lang.Object mActivityThread;
    private final java.lang.reflect.Field mInstrumentationField;
    private final android.app.Instrumentation mOriginal;

    private TinkerHackInstrumentation(android.app.Instrumentation instrumentation, java.lang.Object obj, java.lang.reflect.Field field) {
        this.mOriginal = instrumentation;
        this.mActivityThread = obj;
        this.mInstrumentationField = field;
        try {
            copyAllFields(instrumentation);
        } catch (java.lang.Throwable th6) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException(th6.getMessage(), th6);
        }
    }

    private void copyAllFields(android.app.Instrumentation instrumentation) {
        java.lang.reflect.Field[] declaredFields = android.app.Instrumentation.class.getDeclaredFields();
        for (int i17 = 0; i17 < declaredFields.length; i17++) {
            declaredFields[i17].setAccessible(true);
            declaredFields[i17].set(this, declaredFields[i17].get(instrumentation));
        }
    }

    public static com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation create(android.content.Context context) {
        try {
            java.lang.Object activityThread = com.tencent.tinker.loader.shareutil.ShareReflectUtil.getActivityThread(context, null);
            java.lang.reflect.Field findField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(activityThread, "mInstrumentation");
            android.app.Instrumentation instrumentation = (android.app.Instrumentation) findField.get(activityThread);
            return instrumentation instanceof com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation ? (com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation) instrumentation : new com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation(instrumentation, activityThread, findField);
        } catch (java.lang.Throwable th6) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("see next stacktrace", th6);
        }
    }

    private void fixActivityParams(android.app.Activity activity, android.content.pm.ActivityInfo activityInfo) {
        activity.setRequestedOrientation(activityInfo.screenOrientation);
        activity.setTheme(activityInfo.theme);
        try {
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(activity, "mActivityInfo").set(activity, activityInfo);
        } catch (java.lang.Throwable th6) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("see next stacktrace.", th6);
        }
    }

    private boolean processIntent(java.lang.ClassLoader classLoader, android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        com.tencent.tinker.loader.shareutil.ShareIntentUtil.fixIntentClassLoader(intent, classLoader);
        android.content.ComponentName componentName = (android.content.ComponentName) intent.getParcelableExtra(com.tencent.tinker.loader.hotplug.EnvConsts.INTENT_EXTRA_OLD_COMPONENT);
        if (componentName == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "oldComponent was null, start " + intent.getComponent() + " next.", new java.lang.Object[0]);
            return false;
        }
        java.lang.String className = componentName.getClassName();
        if (com.tencent.tinker.loader.hotplug.IncrementComponentManager.queryActivityInfo(className) != null) {
            intent.setComponent(componentName);
            intent.removeExtra(com.tencent.tinker.loader.hotplug.EnvConsts.INTENT_EXTRA_OLD_COMPONENT);
            return true;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "Failed to query target activity's info, perhaps the target is not hotpluged component. Target: " + className, new java.lang.Object[0]);
        return false;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.pm.ActivityInfo queryActivityInfo;
        if (activity != null && (queryActivityInfo = com.tencent.tinker.loader.hotplug.IncrementComponentManager.queryActivityInfo(activity.getClass().getName())) != null) {
            fixActivityParams(activity, queryActivityInfo);
        }
        super.callActivityOnCreate(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(android.app.Activity activity, android.content.Intent intent) {
        if (activity != null) {
            processIntent(activity.getClass().getClassLoader(), intent);
        }
        super.callActivityOnNewIntent(activity, intent);
    }

    public void install() {
        if (this.mInstrumentationField.get(this.mActivityThread) instanceof com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "already installed, skip rest logic.", new java.lang.Object[0]);
        } else {
            this.mInstrumentationField.set(this.mActivityThread, this);
        }
    }

    @Override // android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.Class<?> cls, android.content.Context context, android.os.IBinder iBinder, android.app.Application application, android.content.Intent intent, android.content.pm.ActivityInfo activityInfo, java.lang.CharSequence charSequence, android.app.Activity activity, java.lang.String str, java.lang.Object obj) {
        processIntent(context.getClassLoader(), intent);
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    public void uninstall() {
        this.mInstrumentationField.set(this.mActivityThread, this.mOriginal);
    }

    @Override // android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        if (processIntent(classLoader, intent)) {
            return super.newActivity(classLoader, intent.getComponent().getClassName(), intent);
        }
        return super.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        android.content.pm.ActivityInfo queryActivityInfo;
        if (activity != null && (queryActivityInfo = com.tencent.tinker.loader.hotplug.IncrementComponentManager.queryActivityInfo(activity.getClass().getName())) != null) {
            fixActivityParams(activity, queryActivityInfo);
        }
        super.callActivityOnCreate(activity, bundle, persistableBundle);
    }
}
