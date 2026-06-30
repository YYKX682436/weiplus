package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public class DynamicRuntime {
    private static final java.lang.String KEY_RUNTIME_APK = "KEY_RUNTIME_APK";
    private static final java.lang.String KEY_RUNTIME_LIB = "KEY_RUNTIME_LIB";
    private static final java.lang.String KEY_RUNTIME_ODEX = "KEY_RUNTIME_ODEX";
    private static final java.lang.String SP_NAME = "ShadowRuntimeLoader";
    private static final com.tencent.shadow.core.common.Logger mLogger = com.tencent.shadow.core.common.LoggerFactory.getLogger("Shadow.DynamicRuntime");

    /* loaded from: classes13.dex */
    public static class RuntimeClassLoader extends dalvik.system.BaseDexClassLoader {
        private java.lang.String apkPath;

        public RuntimeClassLoader(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.ClassLoader classLoader) {
            super(str, str2 == null ? null : new java.io.File(str2), str3, classLoader);
            this.apkPath = str;
        }
    }

    private static com.tencent.shadow.core.common.InstalledApk getLastRuntimeInfo(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME, 0);
        java.lang.String string = sharedPreferences.getString(KEY_RUNTIME_APK, null);
        java.lang.String string2 = sharedPreferences.getString(KEY_RUNTIME_ODEX, null);
        java.lang.String string3 = sharedPreferences.getString(KEY_RUNTIME_LIB, null);
        if (string == null) {
            return null;
        }
        return new com.tencent.shadow.core.common.InstalledApk(string, string2, string3);
    }

    private static java.lang.reflect.Field getParentField() {
        java.lang.Object obj;
        java.lang.ClassLoader classLoader = com.tencent.shadow.dynamic.host.DynamicRuntime.class.getClassLoader();
        java.lang.ClassLoader parent = classLoader.getParent();
        for (java.lang.reflect.Field field : java.lang.ClassLoader.class.getDeclaredFields()) {
            try {
                boolean isAccessible = field.isAccessible();
                field.setAccessible(true);
                obj = field.get(classLoader);
                field.setAccessible(isAccessible);
            } catch (java.lang.IllegalAccessException unused) {
            }
            if (obj == parent) {
                return field;
            }
        }
        return null;
    }

    private static com.tencent.shadow.dynamic.host.DynamicRuntime.RuntimeClassLoader getRuntimeClassLoader() {
        for (java.lang.ClassLoader parent = com.tencent.shadow.dynamic.host.DynamicRuntime.class.getClassLoader().getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.tencent.shadow.dynamic.host.DynamicRuntime.RuntimeClassLoader) {
                return (com.tencent.shadow.dynamic.host.DynamicRuntime.RuntimeClassLoader) parent;
            }
        }
        return null;
    }

    public static void hackParentClassLoader(java.lang.ClassLoader classLoader, java.lang.ClassLoader classLoader2) {
        java.lang.reflect.Field parentField = getParentField();
        if (parentField == null) {
            throw new java.lang.RuntimeException("在ClassLoader.class中没找到类型为ClassLoader的parent域");
        }
        parentField.setAccessible(true);
        parentField.set(classLoader, classLoader2);
    }

    private static void hackParentToRuntime(com.tencent.shadow.core.common.InstalledApk installedApk, java.lang.ClassLoader classLoader) {
        hackParentClassLoader(classLoader, new com.tencent.shadow.dynamic.host.DynamicRuntime.RuntimeClassLoader(installedApk.apkFilePath, installedApk.oDexPath, installedApk.libraryPath, classLoader.getParent()));
    }

    public static boolean loadRuntime(com.tencent.shadow.core.common.InstalledApk installedApk) {
        java.lang.ClassLoader classLoader = com.tencent.shadow.dynamic.host.DynamicRuntime.class.getClassLoader();
        com.tencent.shadow.dynamic.host.DynamicRuntime.RuntimeClassLoader runtimeClassLoader = getRuntimeClassLoader();
        if (runtimeClassLoader != null) {
            java.lang.String str = runtimeClassLoader.apkPath;
            com.tencent.shadow.core.common.Logger logger = mLogger;
            if (logger.isInfoEnabled()) {
                logger.info("last apkPath:" + str + " new apkPath:" + installedApk.apkFilePath);
            }
            if (android.text.TextUtils.equals(str, installedApk.apkFilePath)) {
                if (!logger.isInfoEnabled()) {
                    return false;
                }
                logger.info("已经加载相同apkPath的runtime了,不需要加载");
                return false;
            }
            if (logger.isInfoEnabled()) {
                logger.info("加载不相同apkPath的runtime了,先恢复classLoader树结构");
            }
            try {
                recoveryClassLoader();
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        try {
            hackParentToRuntime(installedApk, classLoader);
            return true;
        } catch (java.lang.Exception e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    private static void recoveryClassLoader() {
        java.lang.ClassLoader classLoader = com.tencent.shadow.dynamic.host.DynamicRuntime.class.getClassLoader();
        java.lang.ClassLoader parent = classLoader.getParent();
        while (true) {
            java.lang.ClassLoader classLoader2 = parent;
            java.lang.ClassLoader classLoader3 = classLoader;
            classLoader = classLoader2;
            if (classLoader == null) {
                return;
            }
            if (classLoader instanceof com.tencent.shadow.dynamic.host.DynamicRuntime.RuntimeClassLoader) {
                hackParentClassLoader(classLoader3, classLoader.getParent());
                return;
            }
            parent = classLoader.getParent();
        }
    }

    public static boolean recoveryRuntime(android.content.Context context) {
        com.tencent.shadow.core.common.InstalledApk lastRuntimeInfo = getLastRuntimeInfo(context);
        if (lastRuntimeInfo != null && new java.io.File(lastRuntimeInfo.apkFilePath).exists()) {
            if (lastRuntimeInfo.oDexPath != null && !new java.io.File(lastRuntimeInfo.oDexPath).exists()) {
                return false;
            }
            try {
                hackParentToRuntime(lastRuntimeInfo, com.tencent.shadow.dynamic.host.DynamicRuntime.class.getClassLoader());
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.shadow.core.common.Logger logger = mLogger;
                if (logger.isErrorEnabled()) {
                    logger.error("recoveryRuntime 错误", (java.lang.Throwable) e17);
                }
                removeLastRuntimeInfo(context);
            }
        }
        return false;
    }

    private static void removeLastRuntimeInfo(android.content.Context context) {
        context.getSharedPreferences(SP_NAME, 0).edit().remove(KEY_RUNTIME_APK).remove(KEY_RUNTIME_ODEX).remove(KEY_RUNTIME_LIB).commit();
    }

    public static void saveLastRuntimeInfo(android.content.Context context, com.tencent.shadow.core.common.InstalledApk installedApk) {
        context.getSharedPreferences(SP_NAME, 0).edit().putString(KEY_RUNTIME_APK, installedApk.apkFilePath).putString(KEY_RUNTIME_ODEX, installedApk.oDexPath).putString(KEY_RUNTIME_LIB, installedApk.libraryPath).commit();
    }
}
