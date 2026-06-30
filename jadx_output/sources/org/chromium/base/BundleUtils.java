package org.chromium.base;

/* loaded from: classes13.dex */
public class BundleUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String LOADED_SPLITS_KEY = "split_compat_loaded_splits";
    private static final java.lang.String TAG = "BundleUtils";
    private static java.lang.Boolean sIsBundle;
    private static org.chromium.base.BundleUtils.SplitCompatClassLoader sSplitCompatClassLoaderInstance;
    private static java.util.ArrayList<java.lang.String> sSplitsToRestore;
    private static final java.lang.Object sSplitLock = new java.lang.Object();
    private static final android.util.ArrayMap<java.lang.String, java.lang.ClassLoader> sCachedClassLoaders = new android.util.ArrayMap<>();
    private static final java.util.Map<java.lang.String, java.lang.ClassLoader> sInflationClassLoaders = java.util.Collections.synchronizedMap(new android.util.ArrayMap());

    /* loaded from: classes13.dex */
    public static class SplitCompatClassLoader extends java.lang.ClassLoader {
        private static final java.lang.String TAG = "SplitCompatClassLoader";

        public SplitCompatClassLoader() {
            super(org.chromium.base.ContextUtils.getApplicationContext().getClassLoader());
            org.chromium.base.Log.i(TAG, "Splits: %s", org.chromium.base.BundleUtils.sSplitsToRestore);
        }

        private java.lang.Class<?> checkSplitsClassLoaders(java.lang.String str) {
            java.util.Iterator it = org.chromium.base.BundleUtils.sInflationClassLoaders.values().iterator();
            while (it.hasNext()) {
                try {
                    return ((java.lang.ClassLoader) it.next()).loadClass(str);
                } catch (java.lang.ClassNotFoundException unused) {
                }
            }
            return null;
        }

        private void restoreSplitsClassLoaders() {
            java.util.Iterator it = org.chromium.base.BundleUtils.sSplitsToRestore.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!org.chromium.base.BundleUtils.sInflationClassLoaders.containsKey(str)) {
                    org.chromium.base.BundleUtils.registerSplitClassLoaderForInflation(str);
                }
            }
            org.chromium.base.BundleUtils.sSplitsToRestore = null;
        }

        @Override // java.lang.ClassLoader
        public java.lang.Class<?> findClass(java.lang.String str) {
            java.lang.Class<?> checkSplitsClassLoaders = checkSplitsClassLoaders(str);
            if (checkSplitsClassLoaders != null) {
                return checkSplitsClassLoaders;
            }
            if (!str.startsWith("android.")) {
                if (org.chromium.base.BundleUtils.sSplitsToRestore != null) {
                    restoreSplitsClassLoaders();
                    java.lang.Class<?> checkSplitsClassLoaders2 = checkSplitsClassLoaders(str);
                    if (checkSplitsClassLoaders2 != null) {
                        return checkSplitsClassLoaders2;
                    }
                }
                org.chromium.base.Log.w(TAG, "No class %s amongst %s", str, android.text.TextUtils.join("\n", org.chromium.base.BundleUtils.sInflationClassLoaders.keySet()));
            }
            throw new java.lang.ClassNotFoundException(str);
        }
    }

    public static boolean canLoadClass(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            java.lang.Class.forName(str, false, classLoader);
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static void checkContextClassLoader(android.content.Context context, android.app.Activity activity) {
        java.lang.ClassLoader classLoader = activity.getClass().getClassLoader();
        if (classLoader != context.getClassLoader()) {
            org.chromium.base.Log.w(TAG, "Mismatched ClassLoaders between Activity and context (fixing): %s", activity.getClass());
            replaceClassLoader(context, classLoader);
        }
    }

    public static android.content.Context createContextForInflation(android.content.Context context, java.lang.String str) {
        if (!isIsolatedSplitInstalled(str)) {
            return context;
        }
        final java.lang.ClassLoader registerSplitClassLoaderForInflation = registerSplitClassLoaderForInflation(str);
        return new android.content.ContextWrapper(context) { // from class: org.chromium.base.BundleUtils.1
            @Override // android.content.ContextWrapper, android.content.Context
            public java.lang.ClassLoader getClassLoader() {
                return registerSplitClassLoaderForInflation;
            }

            @Override // android.content.ContextWrapper, android.content.Context
            public java.lang.Object getSystemService(java.lang.String str2) {
                java.lang.Object systemService = super.getSystemService(str2);
                return "layout_inflater".equals(str2) ? ((android.view.LayoutInflater) systemService).cloneInContext(this) : systemService;
            }
        };
    }

    public static android.content.Context createIsolatedSplitContext(android.content.Context context, java.lang.String str) {
        android.content.Context createContextForSplit;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return context;
        }
        try {
            if (isApplicationContext(context)) {
                createContextForSplit = org.chromium.base.compat.ApiHelperForO.createContextForSplit(context, str);
            } else {
                synchronized (getSplitContextLock()) {
                    createContextForSplit = org.chromium.base.compat.ApiHelperForO.createContextForSplit(context, str);
                }
            }
            java.lang.ClassLoader parent = createContextForSplit.getClassLoader().getParent();
            android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
            boolean z17 = true;
            boolean z18 = (!isolatedSplitsEnabled() || parent.equals(org.chromium.base.BundleUtils.class.getClassLoader()) || applicationContext == null || parent.equals(applicationContext.getClassLoader())) ? false : true;
            android.util.ArrayMap<java.lang.String, java.lang.ClassLoader> arrayMap = sCachedClassLoaders;
            synchronized (arrayMap) {
                if (z18) {
                    if (!arrayMap.containsKey(str)) {
                        arrayMap.put(str, new dalvik.system.PathClassLoader(getSplitApkPath(str), applicationContext.getClassLoader()));
                    }
                }
                java.lang.ClassLoader classLoader = arrayMap.get(str);
                if (classLoader == null) {
                    arrayMap.put(str, createContextForSplit.getClassLoader());
                } else if (!classLoader.equals(createContextForSplit.getClassLoader())) {
                    replaceClassLoader(createContextForSplit, classLoader);
                }
                z17 = z18;
            }
            org.chromium.base.metrics.RecordHistogram.recordBooleanHistogram("Android.IsolatedSplits.ClassLoaderReplaced." + str, z17);
            return createContextForSplit;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static java.lang.String getNativeLibraryPath(java.lang.String str, java.lang.String str2) {
        org.chromium.base.StrictModeContext allowDiskReads = org.chromium.base.StrictModeContext.allowDiskReads();
        try {
            java.lang.String findLibrary = ((dalvik.system.BaseDexClassLoader) org.chromium.base.BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            java.lang.ClassLoader classLoader = org.chromium.base.ContextUtils.getApplicationContext().getClassLoader();
            if (classLoader instanceof dalvik.system.BaseDexClassLoader) {
                findLibrary = ((dalvik.system.BaseDexClassLoader) classLoader).findLibrary(str);
            } else if (classLoader instanceof org.chromium.base.WrappedClassLoader) {
                findLibrary = ((org.chromium.base.WrappedClassLoader) classLoader).findLibrary(str);
            }
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            java.lang.String splitApkLibraryPath = getSplitApkLibraryPath(str, str2);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return splitApkLibraryPath;
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

    public static java.lang.ClassLoader getOrCreateSplitClassLoader(java.lang.String str) {
        java.lang.ClassLoader classLoader;
        android.util.ArrayMap<java.lang.String, java.lang.ClassLoader> arrayMap = sCachedClassLoaders;
        synchronized (arrayMap) {
            classLoader = arrayMap.get(str);
        }
        if (classLoader == null) {
            createIsolatedSplitContext(org.chromium.base.ContextUtils.getApplicationContext(), str);
            synchronized (arrayMap) {
                classLoader = arrayMap.get(str);
            }
        }
        return classLoader;
    }

    private static java.lang.String getSplitApkLibraryPath(java.lang.String str, java.lang.String str2) {
        java.lang.String splitApkPath;
        if (android.os.Build.VERSION.SDK_INT < 26 || (splitApkPath = getSplitApkPath(str2)) == null) {
            return null;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = org.chromium.base.ContextUtils.getApplicationContext().getApplicationInfo();
            return splitApkPath + "!/lib/" + ((java.lang.String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + java.lang.System.mapLibraryName(str);
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    private static java.lang.String getSplitApkPath(java.lang.String str) {
        int binarySearch;
        android.content.pm.ApplicationInfo applicationInfo = org.chromium.base.ContextUtils.getApplicationContext().getApplicationInfo();
        java.lang.String[] strArr = applicationInfo.splitNames;
        if (strArr != null && (binarySearch = java.util.Arrays.binarySearch(strArr, str)) >= 0) {
            return applicationInfo.splitSourceDirs[binarySearch];
        }
        return null;
    }

    public static java.lang.ClassLoader getSplitCompatClassLoader() {
        if (sSplitCompatClassLoaderInstance == null) {
            sSplitCompatClassLoaderInstance = new org.chromium.base.BundleUtils.SplitCompatClassLoader();
        }
        return sSplitCompatClassLoaderInstance;
    }

    public static java.lang.Object getSplitContextLock() {
        return sSplitLock;
    }

    private static boolean isApplicationContext(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Application) {
                return true;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return false;
    }

    public static boolean isBundle() {
        if (org.chromium.build.BuildConfig.BUNDLES_SUPPORTED) {
            return sIsBundle.booleanValue();
        }
        return false;
    }

    public static boolean isBundleForNative() {
        return isBundle();
    }

    public static boolean isIsolatedSplitInstalled(java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 26 && getSplitApkPath(str) != null;
    }

    public static boolean isolatedSplitsEnabled() {
        return org.chromium.build.BuildConfig.ISOLATED_SPLITS_ENABLED;
    }

    public static java.lang.Object newInstance(android.content.Context context, java.lang.String str) {
        android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
        if (applicationContext != null && canLoadClass(applicationContext.getClassLoader(), str)) {
            context = applicationContext;
        }
        try {
            return context.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static java.lang.ClassLoader registerSplitClassLoaderForInflation(java.lang.String str) {
        java.lang.ClassLoader orCreateSplitClassLoader = getOrCreateSplitClassLoader(str);
        sInflationClassLoaders.put(str, orCreateSplitClassLoader);
        return orCreateSplitClassLoader;
    }

    public static void replaceClassLoader(android.content.Context context, java.lang.ClassLoader classLoader) {
        while (context instanceof android.content.ContextWrapper) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        try {
            java.lang.reflect.Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.RuntimeException("Error setting ClassLoader.", e17);
        }
    }

    public static void resetForTesting() {
        sIsBundle = null;
        sCachedClassLoaders.clear();
        sInflationClassLoaders.clear();
        sSplitCompatClassLoaderInstance = null;
        sSplitsToRestore = null;
    }

    public static void restoreLoadedSplits(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        sSplitsToRestore = bundle.getStringArrayList(LOADED_SPLITS_KEY);
    }

    public static void saveLoadedSplits(android.os.Bundle bundle) {
        bundle.putStringArrayList(LOADED_SPLITS_KEY, new java.util.ArrayList<>(sInflationClassLoaders.keySet()));
    }

    public static void setIsBundle(boolean z17) {
        sIsBundle = java.lang.Boolean.valueOf(z17);
    }
}
