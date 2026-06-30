package com.tencent.tinker.loader.hotplug.handler;

/* loaded from: classes13.dex */
public class AMSInterceptHandler implements com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler {
    private static final int INTENT_SENDER_ACTIVITY;
    private static final java.lang.String TAG = "Tinker.AMSIntrcptHndlr";
    private static final int[] TRANSLUCENT_ATTR_ID = {android.R.attr.windowIsTranslucent};
    private final android.content.Context mContext;

    static {
        int i17 = 2;
        if (android.os.Build.VERSION.SDK_INT < 27) {
            try {
                i17 = ((java.lang.Integer) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Class<?>) android.app.ActivityManager.class, "INTENT_SENDER_ACTIVITY").get(null)).intValue();
            } catch (java.lang.Throwable unused) {
            }
        }
        INTENT_SENDER_ACTIVITY = i17;
    }

    public AMSInterceptHandler(android.content.Context context) {
        android.content.Context baseContext;
        while ((context instanceof android.content.ContextWrapper) && (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.mContext = context;
    }

    private java.lang.Object handleGetIntentSender(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        int i17 = 0;
        while (true) {
            if (i17 >= objArr.length) {
                i17 = -1;
                break;
            }
            if (objArr[i17] instanceof android.content.Intent[]) {
                break;
            }
            i17++;
        }
        if (i17 != -1 && ((java.lang.Integer) objArr[0]).intValue() == INTENT_SENDER_ACTIVITY) {
            android.content.Intent[] intentArr = (android.content.Intent[]) objArr[i17];
            for (int i18 = 0; i18 < intentArr.length; i18++) {
                android.content.Intent intent = new android.content.Intent(intentArr[i18]);
                processActivityIntent(intent);
                intentArr[i18] = intent;
            }
        }
        return method.invoke(obj, objArr);
    }

    private java.lang.Object handleStartActivities(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        int i17 = 0;
        while (true) {
            if (i17 >= objArr.length) {
                i17 = -1;
                break;
            }
            if (objArr[i17] instanceof android.content.Intent[]) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            android.content.Intent[] intentArr = (android.content.Intent[]) objArr[i17];
            for (int i18 = 0; i18 < intentArr.length; i18++) {
                android.content.Intent intent = new android.content.Intent(intentArr[i18]);
                processActivityIntent(intent);
                intentArr[i18] = intent;
            }
        }
        return method.invoke(obj, objArr);
    }

    private java.lang.Object handleStartActivity(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        int i17 = 0;
        while (true) {
            if (i17 >= objArr.length) {
                i17 = -1;
                break;
            }
            if (objArr[i17] instanceof android.content.Intent) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            android.content.Intent intent = new android.content.Intent((android.content.Intent) objArr[i17]);
            processActivityIntent(intent);
            objArr[i17] = intent;
        }
        return method.invoke(obj, objArr);
    }

    private boolean hasTransparentTheme(android.content.pm.ActivityInfo activityInfo) {
        int themeResource = activityInfo.getThemeResource();
        android.content.res.Resources.Theme newTheme = this.mContext.getResources().newTheme();
        newTheme.applyStyle(themeResource, true);
        android.content.res.TypedArray typedArray = null;
        try {
            typedArray = newTheme.obtainStyledAttributes(TRANSLUCENT_ATTR_ID);
            boolean z17 = typedArray.getBoolean(0, false);
            typedArray.recycle();
            return z17;
        } catch (java.lang.Throwable unused) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            return false;
        }
    }

    private void processActivityIntent(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        android.content.IntentFilter intentFilter;
        if (intent.getComponent() != null) {
            str = intent.getComponent().getPackageName();
            str2 = intent.getComponent().getClassName();
        } else {
            android.content.pm.ResolveInfo resolveActivity = this.mContext.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                resolveActivity = com.tencent.tinker.loader.hotplug.IncrementComponentManager.resolveIntent(intent);
            }
            if (resolveActivity == null || (intentFilter = resolveActivity.filter) == null || !intentFilter.hasCategory("android.intent.category.DEFAULT")) {
                str = null;
                str2 = null;
            } else {
                android.content.pm.ActivityInfo activityInfo = resolveActivity.activityInfo;
                java.lang.String str3 = activityInfo.packageName;
                str2 = activityInfo.name;
                str = str3;
            }
        }
        if (com.tencent.tinker.loader.hotplug.IncrementComponentManager.isIncrementActivity(str2)) {
            android.content.pm.ActivityInfo queryActivityInfo = com.tencent.tinker.loader.hotplug.IncrementComponentManager.queryActivityInfo(str2);
            storeAndReplaceOriginalComponentName(intent, str, str2, com.tencent.tinker.loader.hotplug.ActivityStubManager.assignStub(str2, queryActivityInfo.launchMode, hasTransparentTheme(queryActivityInfo)));
        }
    }

    private void storeAndReplaceOriginalComponentName(android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.ComponentName componentName = new android.content.ComponentName(str, str2);
        com.tencent.tinker.loader.shareutil.ShareIntentUtil.fixIntentClassLoader(intent, this.mContext.getClassLoader());
        intent.putExtra(com.tencent.tinker.loader.hotplug.EnvConsts.INTENT_EXTRA_OLD_COMPONENT, componentName);
        intent.setComponent(new android.content.ComponentName(str, str3));
    }

    @Override // com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        if ("startActivity".equals(name)) {
            return handleStartActivity(obj, method, objArr);
        }
        if ("startActivities".equals(name)) {
            return handleStartActivities(obj, method, objArr);
        }
        if (!"startActivityAndWait".equals(name) && !"startActivityWithConfig".equals(name) && !"startActivityAsUser".equals(name)) {
            return "getIntentSender".equals(name) ? handleGetIntentSender(obj, method, objArr) : method.invoke(obj, objArr);
        }
        return handleStartActivity(obj, method, objArr);
    }
}
