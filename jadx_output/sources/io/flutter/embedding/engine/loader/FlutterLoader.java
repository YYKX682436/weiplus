package io.flutter.embedding.engine.loader;

/* loaded from: classes13.dex */
public class FlutterLoader {
    static final java.lang.String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
    static final java.lang.String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
    static final java.lang.String AUTOMATICALLY_REGISTER_PLUGINS_KEY = "automatically-register-plugins";
    public static java.lang.String CPU_ABI = null;
    private static final java.lang.String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final java.lang.String DEFAULT_LIBRARY = "libflutter.so";
    private static final java.lang.String DISABLE_MERGED_PLATFORM_UI_THREAD_KEY = "io.flutter.embedding.android.DisableMergedPlatformUIThread";
    private static final java.lang.String ENABLE_FLUTTER_GPU = "io.flutter.embedding.android.EnableFlutterGPU";
    private static final java.lang.String ENABLE_IMPELLER_META_DATA_KEY = "io.flutter.embedding.android.EnableImpeller";
    private static final java.lang.String ENABLE_SURFACE_CONTROL = "io.flutter.embedding.android.EnableSurfaceControl";
    private static final java.lang.String ENABLE_VULKAN_VALIDATION_META_DATA_KEY = "io.flutter.embedding.android.EnableVulkanValidation";
    static final java.lang.String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
    private static final java.lang.String IMPELLER_ANTIALIAS_LINES = "io.flutter.embedding.android.ImpellerAntialiasLines";
    private static final java.lang.String IMPELLER_BACKEND_META_DATA_KEY = "io.flutter.embedding.android.ImpellerBackend";
    private static final java.lang.String IMPELLER_LAZY_SHADER_MODE = "io.flutter.embedding.android.ImpellerLazyShaderInitialization";
    private static final java.lang.String IMPELLER_OPENGL_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableOpenGLGPUTracing";
    private static final java.lang.String IMPELLER_VULKAN_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableVulkanGPUTracing";
    static final java.lang.String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
    private static final java.lang.String LEAK_VM_META_DATA_KEY = "io.flutter.embedding.android.LeakVM";
    private static final java.lang.String OLD_GEN_HEAP_SIZE_META_DATA_KEY = "io.flutter.embedding.android.OldGenHeapSize";
    static final java.lang.String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final java.lang.String TAG = "FlutterLoader";
    private static final java.lang.String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
    static final java.lang.String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
    private static io.flutter.embedding.engine.loader.FlutterLoader instance;
    private java.util.concurrent.ExecutorService executorService;
    private io.flutter.embedding.engine.loader.FlutterApplicationInfo flutterApplicationInfo;
    private io.flutter.embedding.engine.FlutterJNI flutterJNI;
    java.util.concurrent.Future<io.flutter.embedding.engine.loader.FlutterLoader.InitResult> initResultFuture;
    private long initStartTimestampMillis;
    private boolean initialized;
    private io.flutter.embedding.engine.loader.FlutterLoader.Settings settings;

    /* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.util.concurrent.Callable<io.flutter.embedding.engine.loader.FlutterLoader.InitResult> {
        final /* synthetic */ android.content.Context val$appContext;

        public AnonymousClass1(android.content.Context context) {
            this.val$appContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$call$0(android.content.Context context) {
            io.flutter.embedding.engine.loader.FlutterLoader.this.flutterJNI.prefetchDefaultFontManager(io.flutter.util.PathUtils.getCacheDirectory(context));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.flutter.embedding.engine.loader.FlutterLoader.InitResult call() {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String[] strArr;
            io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterLoader initTask");
            try {
                io.flutter.embedding.engine.loader.FlutterLoader.getCPUAbi();
                io.flutter.embedding.engine.loader.ResourceExtractor initResources = io.flutter.embedding.engine.loader.FlutterLoader.this.initResources(this.val$appContext);
                try {
                    io.flutter.embedding.engine.loader.FlutterLoader.this.flutterJNI.loadLibrary(this.val$appContext);
                    io.flutter.embedding.engine.loader.FlutterLoader.this.flutterJNI.updateRefreshRate();
                    java.util.concurrent.ExecutorService executorService = io.flutter.embedding.engine.loader.FlutterLoader.this.executorService;
                    final android.content.Context context = this.val$appContext;
                    executorService.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$1$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            io.flutter.embedding.engine.loader.FlutterLoader.AnonymousClass1.this.lambda$call$0(context);
                        }
                    });
                    if (initResources != null) {
                        initResources.waitForCompletion();
                    }
                    io.flutter.embedding.engine.loader.FlutterLoader.InitResult initResult = new io.flutter.embedding.engine.loader.FlutterLoader.InitResult(io.flutter.util.PathUtils.getFilesDir(this.val$appContext), io.flutter.util.PathUtils.getCacheDirectory(this.val$appContext), io.flutter.util.PathUtils.getDataDirectory(this.val$appContext), null);
                    if (scoped != null) {
                        scoped.close();
                    }
                    return initResult;
                } catch (java.lang.UnsatisfiedLinkError e17) {
                    if (!e17.toString().contains("couldn't find \"libflutter.so\"") && !e17.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e17;
                    }
                    java.lang.String property = java.lang.System.getProperty("os.arch");
                    java.io.File file = new java.io.File(io.flutter.embedding.engine.loader.FlutterLoader.this.flutterApplicationInfo.nativeLibraryDir);
                    java.lang.String[] list = file.list();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.String[] strArr2 = android.os.Build.SUPPORTED_ABIS;
                    int length = strArr2.length;
                    int i17 = 0;
                    while (i17 < length) {
                        java.lang.String str3 = strArr2[i17];
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("!");
                        java.lang.String str4 = java.io.File.separator;
                        sb6.append(str4);
                        sb6.append(com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH);
                        sb6.append(str4);
                        sb6.append(str3);
                        java.lang.String sb7 = sb6.toString();
                        java.lang.String[] strArr3 = this.val$appContext.getApplicationInfo().splitSourceDirs;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        if (strArr3 != null) {
                            int length2 = strArr3.length;
                            int i18 = 0;
                            while (i18 < length2) {
                                arrayList2.add(strArr3[i18] + sb7);
                                i18++;
                                strArr2 = strArr2;
                            }
                            strArr = strArr2;
                            arrayList.addAll(arrayList2);
                        } else {
                            strArr = strArr2;
                        }
                        java.lang.String str5 = this.val$appContext.getApplicationInfo().sourceDir;
                        if (str5 != null && !str5.isEmpty()) {
                            arrayList.add(str5 + sb7);
                        }
                        i17++;
                        strArr2 = strArr;
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                    sb8.append(property);
                    sb8.append(", and the native libraries directory (with path ");
                    sb8.append(file.getAbsolutePath());
                    sb8.append(") ");
                    if (file.exists()) {
                        str = "contains the following files: " + java.util.Arrays.toString(list);
                    } else {
                        str = "does not exist";
                    }
                    sb8.append(str);
                    if (arrayList.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ", and the split and source libraries directory (with path(s) " + arrayList + ")";
                    }
                    sb8.append(str2);
                    sb8.append(".");
                    throw new java.lang.UnsupportedOperationException(sb8.toString(), e17);
                }
            } finally {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class InitResult {
        final java.lang.String appStoragePath;
        final java.lang.String dataDirPath;
        final java.lang.String engineCachesPath;

        public /* synthetic */ InitResult(java.lang.String str, java.lang.String str2, java.lang.String str3, io.flutter.embedding.engine.loader.FlutterLoader.AnonymousClass1 anonymousClass1) {
            this(str, str2, str3);
        }

        private InitResult(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.appStoragePath = str;
            this.engineCachesPath = str2;
            this.dataDirPath = str3;
        }
    }

    /* loaded from: classes11.dex */
    public static class Settings {
        private java.lang.String logTag;

        public java.lang.String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(java.lang.String str) {
            this.logTag = str;
        }
    }

    public FlutterLoader() {
        this(io.flutter.FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
    }

    private java.lang.String fullAssetPathFrom(java.lang.String str) {
        return this.flutterApplicationInfo.flutterAssetsDir + java.io.File.separator + str;
    }

    public static void getCPUAbi() {
        int i17 = 0;
        int i18 = 0;
        boolean z17 = false;
        boolean z18 = false;
        while (true) {
            java.lang.String[] strArr = android.os.Build.SUPPORTED_32_BIT_ABIS;
            if (i18 >= strArr.length) {
                break;
            }
            java.lang.String str = strArr[i18];
            if ("armeabi".equalsIgnoreCase(str)) {
                z17 = true;
            } else if ("armeabi-v7a".equalsIgnoreCase(str)) {
                z18 = true;
            } else if (!"x86".equalsIgnoreCase(str)) {
                "mips".equalsIgnoreCase(str);
            }
            i18++;
        }
        boolean z19 = false;
        while (true) {
            java.lang.String[] strArr2 = android.os.Build.SUPPORTED_64_BIT_ABIS;
            if (i17 >= strArr2.length) {
                break;
            }
            java.lang.String str2 = strArr2[i17];
            if ("arm64-v8a".equalsIgnoreCase(str2)) {
                z19 = true;
            } else if (!"x86_64".equalsIgnoreCase(str2)) {
                "mips64".equalsIgnoreCase(str2);
            }
            i17++;
        }
        if (z19) {
            CPU_ABI = "arm64-v8a";
        } else if (z17 || z18) {
            CPU_ABI = "armeabi-v7a";
        } else {
            CPU_ABI = "x86_64";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.flutter.embedding.engine.loader.ResourceExtractor initResources(android.content.Context context) {
        io.flutter.embedding.engine.loader.ResourceExtractor resourceExtractor = new io.flutter.embedding.engine.loader.ResourceExtractor(io.flutter.util.PathUtils.getDataDirectory(context), context.getPackageName(), context.getPackageManager(), context.getResources().getAssets());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(CPU_ABI);
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append(this.flutterApplicationInfo.vmSnapshotData);
        resourceExtractor.addResource(fullAssetPathFrom(sb6.toString())).addResource(fullAssetPathFrom(CPU_ABI + str + this.flutterApplicationInfo.isolateSnapshotData));
        resourceExtractor.start();
        return resourceExtractor;
    }

    private static boolean isLeakVM(android.os.Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean(LEAK_VM_META_DATA_KEY, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureInitializationCompleteAsync$1(java.lang.Runnable runnable) {
        io.flutter.embedding.engine.FlutterJNI.nativeAfterInit();
        io.flutter.Log.i(TAG, "ensureInitializationCompleteAsync afterInit finished");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitializationCompleteAsync$2(android.content.Context context, java.lang.String[] strArr, final java.lang.Runnable runnable) {
        try {
            this.initResultFuture.get();
            ensureInitializationComplete(context.getApplicationContext(), strArr, false);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.engine.loader.FlutterLoader.lambda$ensureInitializationCompleteAsync$1(runnable);
                }
            });
        } catch (java.lang.Exception e17) {
            io.flutter.Log.e(TAG, "Flutter initialization failed.", e17);
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startInitialization$0(android.content.Context context) {
        io.flutter.Log.i(TAG, "startInitialization, start init VsyncWaiter");
        io.flutter.view.VsyncWaiter.getInstance((android.hardware.display.DisplayManager) context.getSystemService("display"), this.flutterJNI).init();
        io.flutter.Log.i(TAG, "startInitialization, finish init VsyncWaiter");
    }

    public boolean automaticallyRegisterPlugins() {
        return this.flutterApplicationInfo.automaticallyRegisterPlugins;
    }

    public void ensureInitializationComplete(android.content.Context context, java.lang.String[] strArr) {
        ensureInitializationComplete(context, strArr, true);
    }

    public void ensureInitializationCompleteAsync(final android.content.Context context, final java.lang.String[] strArr, android.os.Handler handler, final java.lang.Runnable runnable) {
        if (this.settings == null) {
            throw new java.lang.IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.initialized) {
            handler.post(runnable);
        } else {
            this.executorService.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$$b
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.engine.loader.FlutterLoader.this.lambda$ensureInitializationCompleteAsync$2(context, strArr, runnable);
                }
            });
        }
    }

    public java.lang.String findAppBundlePath() {
        return this.flutterApplicationInfo.flutterAssetsDir;
    }

    public java.lang.String getLookupKeyForAsset(java.lang.String str) {
        return fullAssetPathFrom(str);
    }

    public boolean initialized() {
        return this.initialized;
    }

    public void startInitialization(android.content.Context context) {
        startInitialization(context, new io.flutter.embedding.engine.loader.FlutterLoader.Settings(), true);
    }

    public void startInitializationAsync(android.content.Context context) {
        startInitialization(context, new io.flutter.embedding.engine.loader.FlutterLoader.Settings(), false);
    }

    public FlutterLoader(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this(flutterJNI, io.flutter.FlutterInjector.instance().executorService());
    }

    public void ensureInitializationComplete(android.content.Context context, java.lang.String[] strArr, boolean z17) {
        java.lang.String str;
        io.flutter.util.TraceSection traceSection;
        if (this.initialized) {
            return;
        }
        if (z17) {
            str = "--impeller-backend=";
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                throw new java.lang.IllegalStateException("ensureInitializationComplete must be called on the main thread");
            }
        } else {
            str = "--impeller-backend=";
        }
        if (this.settings != null) {
            try {
                io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterLoader#ensureInitializationComplete");
                try {
                    io.flutter.embedding.engine.loader.FlutterLoader.InitResult initResult = this.initResultFuture.get();
                    traceSection = scoped;
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--icu-native-lib-path=");
                        sb6.append(this.flutterApplicationInfo.nativeLibraryDir);
                        java.lang.String str2 = java.io.File.separator;
                        sb6.append(str2);
                        sb6.append(DEFAULT_LIBRARY);
                        arrayList.add(sb6.toString());
                        if (strArr != null) {
                            java.util.Collections.addAll(arrayList, strArr);
                        }
                        java.lang.String str3 = initResult.dataDirPath + str2 + this.flutterApplicationInfo.flutterAssetsDir + str2 + CPU_ABI;
                        java.lang.String str4 = str3 + str2 + this.flutterApplicationInfo.vmSnapshotData;
                        java.lang.String str5 = str3 + str2 + this.flutterApplicationInfo.isolateSnapshotData;
                        java.io.File file = new java.io.File(str4);
                        java.io.File file2 = new java.io.File(str5);
                        if (file.exists() && file2.exists()) {
                            arrayList.add("--snapshot-asset-path=" + str3);
                            arrayList.add("--vm-snapshot-data=" + this.flutterApplicationInfo.vmSnapshotData);
                            arrayList.add("--isolate-snapshot-data=" + this.flutterApplicationInfo.isolateSnapshotData);
                        } else if ((!file.exists() && file2.exists()) || (file.exists() && !file2.exists())) {
                            io.flutter.Log.i(TAG, "vm_snapshot_data and isolate_snapshot_data. This two files only exist one of them.");
                        }
                        arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.aotSharedLibraryName);
                        arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.nativeLibraryDir + str2 + this.flutterApplicationInfo.aotSharedLibraryName);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("--cache-dir-path=");
                        sb7.append(initResult.engineCachesPath);
                        arrayList.add(sb7.toString());
                        if (this.flutterApplicationInfo.domainNetworkPolicy != null) {
                            arrayList.add("--domain-network-policy=" + this.flutterApplicationInfo.domainNetworkPolicy);
                        }
                        if (this.settings.getLogTag() != null) {
                            arrayList.add("--log-tag=" + this.settings.getLogTag());
                        }
                        android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        int i17 = bundle != null ? bundle.getInt(OLD_GEN_HEAP_SIZE_META_DATA_KEY) : 0;
                        if (i17 == 0) {
                            ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
                            i17 = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                        }
                        arrayList.add("--old-gen-heap-size=" + i17);
                        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                        arrayList.add("--prefetched-default-font-manager");
                        if (bundle != null) {
                            if (bundle.containsKey(ENABLE_IMPELLER_META_DATA_KEY)) {
                                if (bundle.getBoolean(ENABLE_IMPELLER_META_DATA_KEY)) {
                                    arrayList.add(io.flutter.embedding.engine.FlutterShellArgs.ARG_ENABLE_IMPELLER);
                                } else {
                                    arrayList.add(io.flutter.embedding.engine.FlutterShellArgs.ARG_DISABLE_IMPELLER);
                                }
                            }
                            if (bundle.getBoolean(ENABLE_VULKAN_VALIDATION_META_DATA_KEY, false)) {
                                arrayList.add(io.flutter.embedding.engine.FlutterShellArgs.ARG_ENABLE_VULKAN_VALIDATION);
                            }
                            if (bundle.getBoolean(IMPELLER_OPENGL_GPU_TRACING_DATA_KEY, false)) {
                                arrayList.add("--enable-opengl-gpu-tracing");
                            }
                            if (bundle.getBoolean(IMPELLER_VULKAN_GPU_TRACING_DATA_KEY, false)) {
                                arrayList.add("--enable-vulkan-gpu-tracing");
                            }
                            if (bundle.getBoolean(DISABLE_MERGED_PLATFORM_UI_THREAD_KEY, false)) {
                                arrayList.add("--merged-platform-ui-thread=disabled");
                            }
                            if (bundle.getBoolean(ENABLE_FLUTTER_GPU, false)) {
                                arrayList.add("--enable-flutter-gpu");
                            }
                            if (bundle.getBoolean(ENABLE_SURFACE_CONTROL, false)) {
                                arrayList.add("--enable-surface-control");
                            }
                            java.lang.String string = bundle.getString(IMPELLER_BACKEND_META_DATA_KEY);
                            if (string != null) {
                                arrayList.add(str.concat(string));
                            }
                            if (bundle.getBoolean(IMPELLER_LAZY_SHADER_MODE)) {
                                arrayList.add("--impeller-lazy-shader-mode");
                            }
                            if (bundle.getBoolean(IMPELLER_ANTIALIAS_LINES)) {
                                arrayList.add("--impeller-antialias-lines");
                            }
                        }
                        arrayList.add("--leak-vm=".concat(isLeakVM(bundle) ? "true" : "false"));
                        long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.initStartTimestampMillis;
                        if (z17) {
                            this.flutterJNI.init(context, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, initResult.appStoragePath, initResult.engineCachesPath, uptimeMillis, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue());
                        } else {
                            this.flutterJNI.initNotInMainThread(context, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, initResult.appStoragePath, initResult.engineCachesPath, uptimeMillis, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue());
                        }
                        this.initialized = true;
                        if (traceSection != null) {
                            traceSection.close();
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        java.lang.Throwable th7 = th;
                        if (traceSection == null) {
                            throw th7;
                        }
                        try {
                            traceSection.close();
                            throw th7;
                        } catch (java.lang.Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    traceSection = scoped;
                }
            } catch (java.lang.Exception e17) {
                io.flutter.Log.e(TAG, "Flutter initialization failed.", e17);
                throw new java.lang.RuntimeException(e17);
            }
        } else {
            throw new java.lang.IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
    }

    public java.lang.String getLookupKeyForAsset(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("packages");
        java.lang.String str3 = java.io.File.separator;
        sb6.append(str3);
        sb6.append(str2);
        sb6.append(str3);
        sb6.append(str);
        return getLookupKeyForAsset(sb6.toString());
    }

    public void startInitialization(android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader.Settings settings) {
        startInitialization(context, settings, true);
    }

    public void startInitializationAsync(android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader.Settings settings) {
        startInitialization(context, settings, false);
    }

    public FlutterLoader(io.flutter.embedding.engine.FlutterJNI flutterJNI, java.util.concurrent.ExecutorService executorService) {
        this.initialized = false;
        this.flutterJNI = flutterJNI;
        this.executorService = executorService;
    }

    public void startInitialization(android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader.Settings settings, boolean z17) {
        if (this.settings != null) {
            return;
        }
        if (z17 && android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("startInitialization must be called on the main thread");
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterLoader#startInitialization");
        try {
            final android.content.Context applicationContext = context.getApplicationContext();
            this.settings = settings;
            this.initStartTimestampMillis = android.os.SystemClock.uptimeMillis();
            this.flutterApplicationInfo = io.flutter.embedding.engine.loader.ApplicationInfoLoader.load(applicationContext);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$$c
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.engine.loader.FlutterLoader.this.lambda$startInitialization$0(applicationContext);
                }
            });
            this.initResultFuture = this.executorService.submit(new io.flutter.embedding.engine.loader.FlutterLoader.AnonymousClass1(applicationContext));
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
