package com.tencent.tinker.loader.hotplug.handler;

/* loaded from: classes13.dex */
public class MHMessageHandler implements com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler {
    private static final int LAUNCH_ACTIVITY;
    private static final java.lang.String TAG = "Tinker.MHMsgHndlr";
    private final android.content.Context mContext;

    static {
        int i17 = 100;
        if (android.os.Build.VERSION.SDK_INT < 27) {
            try {
                i17 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(java.lang.Class.forName("android.app.ActivityThread$H"), "LAUNCH_ACTIVITY").getInt(null);
            } catch (java.lang.Throwable unused) {
            }
        }
        LAUNCH_ACTIVITY = i17;
    }

    public MHMessageHandler(android.content.Context context) {
        android.content.Context baseContext;
        while ((context instanceof android.content.ContextWrapper) && (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.mContext = context;
    }

    private <T> void copyInstanceFields(T t17, T t18) {
        if (t17 == null || t18 == null) {
            return;
        }
        for (java.lang.Class<?> cls = t17.getClass(); !cls.equals(java.lang.Object.class); cls = cls.getSuperclass()) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (!field.isSynthetic() && !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }
                    try {
                        field.set(t18, field.get(t17));
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
    }

    private void fixActivityScreenOrientation(java.lang.Object obj, int i17) {
        if (i17 == -1) {
            i17 = 2;
        }
        try {
            java.lang.Object obj2 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj, "token").get(obj);
            java.lang.Object invoke = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(java.lang.Class.forName("android.app.ActivityManagerNative"), "getDefault", (java.lang.Class<?>[]) new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(invoke, "setRequestedOrientation", (java.lang.Class<?>[]) new java.lang.Class[]{android.os.IBinder.class, java.lang.Integer.TYPE}).invoke(invoke, obj2, java.lang.Integer.valueOf(i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "Failed to fix screen orientation.", th6);
        }
    }

    private void fixStubActivityInfo(android.content.pm.ActivityInfo activityInfo, android.content.pm.ActivityInfo activityInfo2) {
        copyInstanceFields(activityInfo2, activityInfo);
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler
    public boolean handleMessage(android.os.Message message) {
        if (message.what == LAUNCH_ACTIVITY) {
            try {
                java.lang.Object obj = message.obj;
                if (obj == null) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "msg: [" + message.what + "] has no 'obj' value.", new java.lang.Object[0]);
                    return false;
                }
                android.content.Intent intent = (android.content.Intent) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj, "intent").get(obj);
                if (intent == null) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "cannot fetch intent from message received by mH.", new java.lang.Object[0]);
                    return false;
                }
                com.tencent.tinker.loader.shareutil.ShareIntentUtil.fixIntentClassLoader(intent, this.mContext.getClassLoader());
                android.content.ComponentName componentName = (android.content.ComponentName) intent.getParcelableExtra(com.tencent.tinker.loader.hotplug.EnvConsts.INTENT_EXTRA_OLD_COMPONENT);
                if (componentName == null) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "oldComponent was null, start " + intent.getComponent() + " next.", new java.lang.Object[0]);
                    return false;
                }
                android.content.pm.ActivityInfo activityInfo = (android.content.pm.ActivityInfo) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj, "activityInfo").get(obj);
                if (activityInfo == null) {
                    return false;
                }
                android.content.pm.ActivityInfo queryActivityInfo = com.tencent.tinker.loader.hotplug.IncrementComponentManager.queryActivityInfo(componentName.getClassName());
                if (queryActivityInfo == null) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "Failed to query target activity's info, perhaps the target is not hotpluged component. Target: " + componentName.getClassName(), new java.lang.Object[0]);
                    return false;
                }
                fixActivityScreenOrientation(obj, queryActivityInfo.screenOrientation);
                fixStubActivityInfo(activityInfo, queryActivityInfo);
                intent.setComponent(componentName);
                intent.removeExtra(com.tencent.tinker.loader.hotplug.EnvConsts.INTENT_EXTRA_OLD_COMPONENT);
            } catch (java.lang.Throwable th6) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "exception in handleMessage.", th6);
            }
        }
        return false;
    }
}
