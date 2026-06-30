package com.tencent.tinker.loader;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class TinkerResourcePatcher {
    private static final java.lang.String TAG = "Tinker.ResourcePatcher";
    private static final java.lang.String TEST_ASSETS_VALUE = "only_use_to_test_tinker_resource.txt";
    private static java.lang.reflect.Method addAssetPathAsSharedLibraryMethod;
    private static java.lang.reflect.Method addAssetPathMethod;
    private static java.lang.reflect.Field assetsFiled;
    private static java.lang.Object currentActivityThread;
    private static java.lang.reflect.Method ensureStringBlocksMethod;
    private static android.content.res.AssetManager newAssetManager;
    private static java.lang.reflect.Constructor<?> newAssetManagerCtor;
    private static android.content.Context packageContext;
    private static android.content.Context packageResContext;
    private static java.lang.reflect.Field packagesFiled;
    private static java.lang.reflect.Field publicSourceDirField;
    private static java.util.Collection<java.lang.ref.WeakReference<android.content.res.Resources>> references;
    private static java.lang.reflect.Field resDir;
    private static java.util.Map<java.lang.Object, java.lang.ref.WeakReference<java.lang.Object>> resourceImpls;
    private static java.lang.reflect.Field resourcePackagesFiled;
    private static java.lang.reflect.Field resourcesImplFiled;
    private static long storedPatchedResModifiedTime;
    private static java.lang.reflect.Field stringBlocksField;

    /* loaded from: classes13.dex */
    public static final class ResourceInsuranceHandlerCallback implements android.os.Handler.Callback {
        private static final java.lang.String LAUNCH_ACTIVITY_LIFECYCLE_ITEM_CLASSNAME = "android.app.servertransaction.LaunchActivityItem";
        private final int EXECUTE_TRANSACTION;
        private final int LAUNCH_ACTIVITY;
        private final int RELAUNCH_ACTIVITY;
        private final android.content.Context mContext;
        private final android.os.Handler.Callback mOriginalCallback;
        private final java.lang.String mPatchResApkPath;
        private java.lang.reflect.Method mGetCallbacksMethod = null;
        private boolean mSkipInterceptExecuteTransaction = false;

        public ResourceInsuranceHandlerCallback(android.content.Context context, java.lang.String str, android.os.Handler.Callback callback, java.lang.Class<?> cls) {
            android.content.Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext != null ? applicationContext : context;
            this.mPatchResApkPath = str;
            this.mOriginalCallback = callback;
            this.LAUNCH_ACTIVITY = fetchMessageId(cls, "LAUNCH_ACTIVITY", 100);
            this.RELAUNCH_ACTIVITY = fetchMessageId(cls, "RELAUNCH_ACTIVITY", 126);
            if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(28, true)) {
                this.EXECUTE_TRANSACTION = fetchMessageId(cls, "EXECUTE_TRANSACTION ", com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX);
            } else {
                this.EXECUTE_TRANSACTION = -1;
            }
        }

        private int fetchMessageId(java.lang.Class<?> cls, java.lang.String str, int i17) {
            try {
                return com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls, str).getInt(null);
            } catch (java.lang.Throwable unused) {
                return i17;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
        
            if (r6.getClass().getName().equals(com.tencent.tinker.loader.TinkerResourcePatcher.ResourceInsuranceHandlerCallback.LAUNCH_ACTIVITY_LIFECYCLE_ITEM_CLASSNAME) != false) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean hackMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.String r0 = r5.mPatchResApkPath
                boolean r0 = com.tencent.tinker.loader.TinkerResourcePatcher.access$000(r0)
                java.lang.String r1 = "Tinker.ResourcePatcher"
                r2 = 1
                r3 = 0
                if (r0 != 0) goto Lf
            Lc:
                r6 = r3
                goto L7b
            Lf:
                int r0 = r6.what
                int r4 = r5.LAUNCH_ACTIVITY
                if (r0 == r4) goto L7a
                int r4 = r5.RELAUNCH_ACTIVITY
                if (r0 != r4) goto L1a
                goto L7a
            L1a:
                int r4 = r5.EXECUTE_TRANSACTION
                if (r0 != r4) goto Lc
                boolean r0 = r5.mSkipInterceptExecuteTransaction
                if (r0 == 0) goto L23
                goto Lc
            L23:
                java.lang.Object r6 = r6.obj
                if (r6 != 0) goto L2f
                java.lang.String r6 = "transaction is null, skip rest insurance logic."
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(r1, r6, r0)
                goto Lc
            L2f:
                java.lang.reflect.Method r0 = r5.mGetCallbacksMethod
                if (r0 != 0) goto L3d
                java.lang.String r0 = "getCallbacks"
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3d
                java.lang.reflect.Method r0 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(r6, r0, r4)     // Catch: java.lang.Throwable -> L3d
                r5.mGetCallbacksMethod = r0     // Catch: java.lang.Throwable -> L3d
            L3d:
                java.lang.reflect.Method r0 = r5.mGetCallbacksMethod
                if (r0 != 0) goto L4b
                java.lang.String r6 = "fail to find getLifecycleStateRequest method, skip rest insurance logic."
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r1, r6, r0)
                r5.mSkipInterceptExecuteTransaction = r2
                goto Lc
            L4b:
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L72
                java.lang.Object r6 = r0.invoke(r6, r4)     // Catch: java.lang.Throwable -> L72
                java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L72
                if (r6 == 0) goto Lc
                int r0 = r6.size()     // Catch: java.lang.Throwable -> L72
                if (r0 <= 0) goto Lc
                java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L72
                if (r6 == 0) goto Lc
                java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L72
                java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L72
                java.lang.String r0 = "android.app.servertransaction.LaunchActivityItem"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> L72
                if (r6 == 0) goto Lc
                goto L7a
            L72:
                java.lang.String r6 = "fail to call getLifecycleStateRequest method, skip rest insurance logic."
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r1, r6, r0)
                goto Lc
            L7a:
                r6 = r2
            L7b:
                if (r6 == 0) goto L8d
                android.content.Context r6 = r5.mContext     // Catch: java.lang.Throwable -> L85
                java.lang.String r0 = r5.mPatchResApkPath     // Catch: java.lang.Throwable -> L85
                com.tencent.tinker.loader.TinkerResourcePatcher.monkeyPatchExistingResources(r6, r0, r2)     // Catch: java.lang.Throwable -> L85
                goto L8d
            L85:
                r6 = move-exception
                java.lang.String r0 = "fail to ensure patched resources available after it's modified."
                java.lang.Object[] r2 = new java.lang.Object[r3]
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(r1, r6, r0, r2)
            L8d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.TinkerResourcePatcher.ResourceInsuranceHandlerCallback.hackMessage(android.os.Message):boolean");
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (hackMessage(message)) {
                return true;
            }
            android.os.Handler.Callback callback = this.mOriginalCallback;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        }
    }

    private static boolean checkResUpdate(android.content.Context context) {
        try {
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(context.getAssets().open(TEST_ASSETS_VALUE));
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "checkResUpdate success, found test resource assets file only_use_to_test_tinker_resource.txt", new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "checkResUpdate failed, can't find test resource assets file only_use_to_test_tinker_resource.txt e:" + th6.getMessage(), new java.lang.Object[0]);
                return false;
            } finally {
                com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(null);
            }
        }
    }

    private static void clearPreloadTypedArrayIssue(android.content.res.Resources resources) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "try to clear typedArray cache!", new java.lang.Object[0]);
        try {
            java.lang.Object obj = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Class<?>) android.content.res.Resources.class, "mTypedArrayPool").get(resources);
            do {
            } while (com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(obj, "acquire", (java.lang.Class<?>[]) new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]) != null);
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "clearPreloadTypedArrayIssue failed, ignore error: " + th6, new java.lang.Object[0]);
        }
    }

    private static void installResourceInsuranceHacks(android.content.Context context, java.lang.String str) {
        try {
            java.lang.Object activityThread = com.tencent.tinker.loader.shareutil.ShareReflectUtil.getActivityThread(context, null);
            android.os.Handler handler = (android.os.Handler) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(activityThread, "mH").get(activityThread);
            java.lang.reflect.Field findField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Class<?>) android.os.Handler.class, "mCallback");
            android.os.Handler.Callback callback = (android.os.Handler.Callback) findField.get(handler);
            if (callback instanceof com.tencent.tinker.loader.TinkerResourcePatcher.ResourceInsuranceHandlerCallback) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "installResourceInsuranceHacks: already installed, skip rest logic.", new java.lang.Object[0]);
            } else {
                findField.set(handler, new com.tencent.tinker.loader.TinkerResourcePatcher.ResourceInsuranceHandlerCallback(context, str, callback, handler.getClass()));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th6, "failed to install resource insurance hack.", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPatchedResModifiedAfterLastLoad(java.lang.String str) {
        long j17;
        try {
            j17 = new java.io.File(str).lastModified();
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th6, "Fail to get patched res modified time.", new java.lang.Object[0]);
            j17 = 0;
        }
        return (j17 == 0 || j17 == storedPatchedResModifiedTime) ? false : true;
    }

    public static void isResourceCanPatch(android.content.Context context) {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = java.lang.Class.forName("android.app.ActivityThread");
        currentActivityThread = com.tencent.tinker.loader.shareutil.ShareReflectUtil.getActivityThread(context, cls2);
        try {
            cls = java.lang.Class.forName("android.app.LoadedApk");
        } catch (java.lang.ClassNotFoundException unused) {
            cls = java.lang.Class.forName("android.app.ActivityThread$PackageInfo");
        }
        resDir = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls, "mResDir");
        packagesFiled = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls2, "mPackages");
        try {
            resourcePackagesFiled = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls2, "mResourcePackages");
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th6, "Fail to get mResourcePackages field.", new java.lang.Object[0]);
            resourcePackagesFiled = null;
        }
        android.content.res.AssetManager assets = context.getAssets();
        addAssetPathMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(assets, "addAssetPath", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
        if (shouldAddSharedLibraryAssets(context.getApplicationInfo())) {
            addAssetPathAsSharedLibraryMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(assets, "addAssetPathAsSharedLibrary", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
        }
        try {
            stringBlocksField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(assets, "mStringBlocks");
            ensureStringBlocksMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(assets, "ensureStringBlocks", (java.lang.Class<?>[]) new java.lang.Class[0]);
        } catch (java.lang.Throwable unused2) {
        }
        newAssetManagerCtor = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findConstructor(assets, (java.lang.Class<?>[]) new java.lang.Class[0]);
        java.lang.Class<?> cls3 = java.lang.Class.forName("android.app.ResourcesManager");
        java.lang.Object invoke = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(cls3, "getInstance", (java.lang.Class<?>[]) new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        try {
            references = ((android.util.ArrayMap) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls3, "mActiveResources").get(invoke)).values();
        } catch (java.lang.NoSuchFieldException unused3) {
            references = (java.util.Collection) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls3, "mResourceReferences").get(invoke);
            try {
                resourceImpls = (java.util.Map) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls3, "mResourceImpls").get(invoke);
            } catch (java.lang.Throwable unused4) {
                resourceImpls = null;
            }
        }
        if (references == null) {
            throw new java.lang.IllegalStateException("resource references is null");
        }
        android.content.res.Resources resources = context.getResources();
        try {
            resourcesImplFiled = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(resources, "mResourcesImpl");
        } catch (java.lang.Throwable unused5) {
            assetsFiled = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(resources, "mAssets");
        }
        try {
            publicSourceDirField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Class<?>) android.content.pm.ApplicationInfo.class, "publicSourceDir");
        } catch (java.lang.NoSuchFieldException unused6) {
        }
    }

    public static void monkeyPatchExistingResources(android.content.Context context, java.lang.String str, boolean z17) {
        if (str == null) {
            return;
        }
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        packageContext = context.createPackageContext(context.getPackageName(), 1);
        packageResContext = context.createPackageContext(context.getPackageName(), 0);
        java.lang.reflect.Field[] fieldArr = {packagesFiled, resourcePackagesFiled};
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.reflect.Field field = fieldArr[i17];
            if (field != null) {
                java.util.Iterator it = ((java.util.Map) field.get(currentActivityThread)).entrySet().iterator();
                while (it.hasNext()) {
                    java.lang.Object obj = ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                    if (obj != null && applicationInfo.sourceDir.equals((java.lang.String) resDir.get(obj))) {
                        resDir.set(obj, str);
                    }
                }
            }
        }
        if (z17) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "Re-injecting, skip rest logic.", new java.lang.Object[0]);
            recordCurrentPatchedResModifiedTime(str);
            return;
        }
        android.content.res.AssetManager assetManager = (android.content.res.AssetManager) newAssetManagerCtor.newInstance(new java.lang.Object[0]);
        newAssetManager = assetManager;
        if (((java.lang.Integer) addAssetPathMethod.invoke(assetManager, str)).intValue() == 0) {
            throw new java.lang.IllegalStateException("Could not create new AssetManager");
        }
        recordCurrentPatchedResModifiedTime(str);
        if (shouldAddSharedLibraryAssets(applicationInfo)) {
            for (java.lang.String str2 : applicationInfo.sharedLibraryFiles) {
                if (str2.endsWith(".apk")) {
                    if (((java.lang.Integer) addAssetPathAsSharedLibraryMethod.invoke(newAssetManager, str2)).intValue() == 0) {
                        throw new java.lang.IllegalStateException("AssetManager add SharedLibrary Fail");
                    }
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "addAssetPathAsSharedLibrary ".concat(str2), new java.lang.Object[0]);
                }
            }
        }
        java.lang.reflect.Field field2 = stringBlocksField;
        java.lang.reflect.Field field3 = null;
        if (field2 != null && ensureStringBlocksMethod != null) {
            field2.set(newAssetManager, null);
            ensureStringBlocksMethod.invoke(newAssetManager, new java.lang.Object[0]);
        }
        java.util.Iterator<java.lang.ref.WeakReference<android.content.res.Resources>> it6 = references.iterator();
        while (it6.hasNext()) {
            android.content.res.Resources resources = it6.next().get();
            if (resources != null) {
                try {
                    assetsFiled.set(resources, newAssetManager);
                } catch (java.lang.Throwable unused) {
                    java.lang.Object obj2 = resourcesImplFiled.get(resources);
                    com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj2, "mAssets").set(obj2, newAssetManager);
                }
                clearPreloadTypedArrayIssue(resources);
                resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
            }
        }
        java.util.Map<java.lang.Object, java.lang.ref.WeakReference<java.lang.Object>> map = resourceImpls;
        if (map != null) {
            java.lang.reflect.Field field4 = null;
            for (java.util.Map.Entry<java.lang.Object, java.lang.ref.WeakReference<java.lang.Object>> entry : map.entrySet()) {
                java.lang.Object key = entry.getKey();
                if (field3 == null) {
                    field3 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(key.getClass(), "mResDir");
                }
                if (applicationInfo.sourceDir.equals((java.lang.String) field3.get(key))) {
                    if (android.os.Build.VERSION.SDK_INT >= 35) {
                        field3.set(key, str);
                    }
                    java.lang.Object obj3 = entry.getValue().get();
                    if (obj3 != null) {
                        if (field4 == null) {
                            field4 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj3, "mAssets");
                        }
                        field4.set(obj3, newAssetManager);
                    }
                }
            }
        }
        try {
            java.lang.reflect.Field field5 = publicSourceDirField;
            if (field5 != null) {
                field5.set(context.getApplicationInfo(), str);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th6, "fail to process publicSourceDirField field hack.", new java.lang.Object[0]);
        }
        if (!checkResUpdate(context)) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException(com.tencent.tinker.loader.shareutil.ShareConstants.CHECK_RES_INSTALL_FAIL);
        }
        installResourceInsuranceHacks(context, str);
    }

    private static void recordCurrentPatchedResModifiedTime(java.lang.String str) {
        try {
            storedPatchedResModifiedTime = new java.io.File(str).lastModified();
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th6, "Fail to store patched res modified time.", new java.lang.Object[0]);
            storedPatchedResModifiedTime = 0L;
        }
    }

    private static boolean shouldAddSharedLibraryAssets(android.content.pm.ApplicationInfo applicationInfo) {
        return (applicationInfo == null || applicationInfo.sharedLibraryFiles == null) ? false : true;
    }
}
