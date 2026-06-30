package io.flutter.embedding.engine.deferredcomponents;

/* loaded from: classes13.dex */
public class PlayStoreDeferredComponentManager implements io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager {
    public static final java.lang.String MAPPING_KEY = io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager.class.getName().concat(".loadingUnitMapping");
    private static final java.lang.String TAG = "PlayStoreDeferredComponentManager";
    private io.flutter.embedding.engine.systemchannels.DeferredComponentChannel channel;
    private android.content.Context context;
    private io.flutter.embedding.engine.loader.FlutterApplicationInfo flutterApplicationInfo;
    private io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager.FeatureInstallStateUpdatedListener listener;
    protected android.util.SparseArray<java.lang.String> loadingUnitIdToComponentNames;
    protected android.util.SparseArray<java.lang.String> loadingUnitIdToSharedLibraryNames;
    private java.util.Map<java.lang.String, java.lang.Integer> nameToSessionId;
    private android.util.SparseIntArray sessionIdToLoadingUnitId;
    private android.util.SparseArray<java.lang.String> sessionIdToName;
    private android.util.SparseArray<java.lang.String> sessionIdToState;
    private qa.b splitInstallManager;

    /* loaded from: classes13.dex */
    public class FeatureInstallStateUpdatedListener {
        private FeatureInstallStateUpdatedListener() {
        }

        public /* bridge */ /* synthetic */ void onStateUpdate(java.lang.Object obj) {
            android.support.v4.media.f.a(obj);
            onStateUpdate((qa.c) null);
        }

        public void onStateUpdate(qa.c cVar) {
            throw null;
        }
    }

    public PlayStoreDeferredComponentManager(android.content.Context context, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.context = context;
        this.flutterJNI = flutterJNI;
        this.flutterApplicationInfo = io.flutter.embedding.engine.loader.ApplicationInfoLoader.load(context);
        throw new java.lang.RuntimeException("stub!");
    }

    private android.content.pm.ApplicationInfo getApplicationInfo() {
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    private void initLoadingUnitMappingToComponentNames() {
        android.os.Bundle bundle;
        android.content.pm.ApplicationInfo applicationInfo = getApplicationInfo();
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return;
        }
        java.lang.String str = MAPPING_KEY;
        java.lang.String string = bundle.getString(str, null);
        if (string == null) {
            io.flutter.Log.e(TAG, "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
            return;
        }
        if (string.equals("")) {
            return;
        }
        for (java.lang.String str2 : string.split(",")) {
            java.lang.String[] split = str2.split(":", -1);
            int parseInt = java.lang.Integer.parseInt(split[0]);
            this.loadingUnitIdToComponentNames.put(parseInt, split[1]);
            if (split.length > 2) {
                this.loadingUnitIdToSharedLibraryNames.put(parseInt, split[2]);
            }
        }
    }

    private /* synthetic */ void lambda$installDeferredComponent$0(java.lang.String str, int i17, java.lang.Integer num) {
        this.sessionIdToName.put(num.intValue(), str);
        this.sessionIdToLoadingUnitId.put(num.intValue(), i17);
        if (this.nameToSessionId.containsKey(str)) {
            this.sessionIdToState.remove(this.nameToSessionId.get(str).intValue());
        }
        this.nameToSessionId.put(str, num);
        this.sessionIdToState.put(num.intValue(), "Requested");
    }

    private /* synthetic */ void lambda$installDeferredComponent$1(int i17, java.lang.String str, java.lang.Exception exc) {
        com.google.android.play.core.splitinstall.SplitInstallException splitInstallException = (com.google.android.play.core.splitinstall.SplitInstallException) exc;
        int errorCode = splitInstallException.getErrorCode();
        if (errorCode == -6) {
            this.flutterJNI.deferredComponentInstallFailure(i17, "Install of deferred component module \"" + str + "\" failed with a network error", true);
            return;
        }
        if (errorCode != -2) {
            this.flutterJNI.deferredComponentInstallFailure(i17, java.lang.String.format("Install of deferred component module \"%s\" failed with error %d: %s", str, java.lang.Integer.valueOf(splitInstallException.getErrorCode()), splitInstallException.getMessage()), false);
            return;
        }
        this.flutterJNI.deferredComponentInstallFailure(i17, "Install of deferred component module \"" + str + "\" failed as it is unavailable", false);
    }

    private boolean verifyJNI() {
        if (this.flutterJNI != null) {
            return true;
        }
        io.flutter.Log.e(TAG, "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
        return false;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void destroy() {
        throw null;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public java.lang.String getDeferredComponentInstallState(int i17, java.lang.String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i17);
        }
        if (str == null) {
            io.flutter.Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        if (this.nameToSessionId.containsKey(str)) {
            return this.sessionIdToState.get(this.nameToSessionId.get(str).intValue());
        }
        qa.b bVar = null;
        bVar.getInstalledModules();
        throw null;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void installDeferredComponent(int i17, java.lang.String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i17);
        }
        if (str == null) {
            io.flutter.Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
        } else {
            if (!str.equals("") || i17 <= 0) {
                throw new java.lang.RuntimeException("stub!");
            }
            loadDartLibrary(i17, str);
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadAssets(int i17, java.lang.String str) {
        if (verifyJNI()) {
            try {
                android.content.Context context = this.context;
                android.content.Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
                this.context = createPackageContext;
                this.flutterJNI.updateJavaAssetManager(createPackageContext.getAssets(), this.flutterApplicationInfo.flutterAssetsDir);
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadDartLibrary(int i17, java.lang.String str) {
        if (verifyJNI() && i17 >= 0) {
            java.lang.String str2 = this.loadingUnitIdToSharedLibraryNames.get(i17);
            if (str2 == null) {
                str2 = this.flutterApplicationInfo.aotSharedLibraryName + "-" + i17 + ".part.so";
            }
            java.lang.String str3 = android.os.Build.SUPPORTED_ABIS[0];
            java.lang.String replace = str3.replace("-", "_");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.context.getFilesDir());
            for (java.lang.String str4 : this.context.getApplicationInfo().splitSourceDirs) {
                linkedList.add(new java.io.File(str4));
            }
            while (!linkedList.isEmpty()) {
                java.io.File file = (java.io.File) linkedList.remove();
                if (file == null || !file.isDirectory() || file.listFiles() == null) {
                    java.lang.String name = file.getName();
                    if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(replace))) {
                        arrayList.add(file.getAbsolutePath());
                    } else if (name.equals(str2)) {
                        arrayList2.add(file.getAbsolutePath());
                    }
                } else {
                    for (java.io.File file2 : file.listFiles()) {
                        linkedList.add(file2);
                    }
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(str2);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((java.lang.String) it.next()) + "!lib/" + str3 + "/" + str2);
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add((java.lang.String) it6.next());
            }
            this.flutterJNI.loadDartDeferredLibrary(i17, (java.lang.String[]) arrayList3.toArray(new java.lang.String[arrayList3.size()]));
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setDeferredComponentChannel(io.flutter.embedding.engine.systemchannels.DeferredComponentChannel deferredComponentChannel) {
        this.channel = deferredComponentChannel;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setJNI(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public boolean uninstallDeferredComponent(int i17, java.lang.String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i17);
        }
        if (str == null) {
            io.flutter.Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        qa.b bVar = null;
        bVar.deferredUninstall(arrayList);
        throw null;
    }
}
