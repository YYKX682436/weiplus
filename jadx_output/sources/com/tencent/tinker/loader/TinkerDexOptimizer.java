package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public final class TinkerDexOptimizer {
    private static final java.lang.String INTERPRET_LOCK_FILE_NAME = "interpret.lock";
    private static final int SHELL_COMMAND_TRANSACTION = 1598246212;
    private static final java.lang.String TAG = "Tinker.ParallelDex";
    private static final android.os.ResultReceiver sEmptyResultReceiver;
    private static final android.os.Handler sHandler;
    private static final android.content.pm.PackageManager[] sSynchronizedPMCache;
    private static final int[] sPerformDexOptSecondaryTransactionCode = {-1};
    private static final android.os.IBinder[] sPMSBinderProxy = {null};

    /* loaded from: classes13.dex */
    public static class OptimizeWorker {
        private static java.lang.ClassLoader patchClassLoaderStrongRef;
        private final com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback callback;
        private final android.content.Context context;
        private final java.io.File dexFile;
        private final java.io.File optimizedDir;
        private final java.lang.String targetISA;
        private final boolean useDLC;
        private final boolean useEmergencyMode;
        private final boolean useInterpretMode;

        public OptimizeWorker(android.content.Context context, java.io.File file, java.io.File file2, boolean z17, boolean z18, java.lang.String str, boolean z19, com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback resultCallback) {
            this.context = context;
            this.dexFile = file;
            this.optimizedDir = file2;
            this.useInterpretMode = z17;
            this.useDLC = z18;
            this.callback = resultCallback;
            this.targetISA = str;
            this.useEmergencyMode = z19;
        }

        public boolean run() {
            com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback resultCallback;
            try {
                if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(this.dexFile) && (resultCallback = this.callback) != null) {
                    resultCallback.onFailed(this.dexFile, this.optimizedDir, new java.io.IOException("dex file " + this.dexFile.getAbsolutePath() + " is not exist!"));
                    return false;
                }
                com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback resultCallback2 = this.callback;
                if (resultCallback2 != null) {
                    resultCallback2.onStart(this.dexFile, this.optimizedDir);
                }
                final java.lang.String optimizedPathFor = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.optimizedPathFor(this.dexFile, this.optimizedDir);
                if (!com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isArkHotRuning()) {
                    if (this.useInterpretMode) {
                        com.tencent.tinker.loader.TinkerDexOptimizer.interpretDex2Oat(this.dexFile.getAbsolutePath(), optimizedPathFor, this.targetISA);
                    } else if (com.tencent.tinker.loader.app.TinkerApplication.getInstance().isUseInterpretModeOnSupported32BitSystem() && com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isVersionInRange(21, 25, true) && com.tencent.tinker.loader.shareutil.ShareTinkerInternals.is32BitEnv()) {
                        try {
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(com.tencent.tinker.loader.TinkerDexOptimizer.TAG, "dexopt with interpret mode on 32bit supported system was enabled.", new java.lang.Object[0]);
                            com.tencent.tinker.loader.TinkerDexOptimizer.interpretDex2Oat(this.dexFile.getAbsolutePath(), optimizedPathFor, this.targetISA);
                        } catch (java.lang.Throwable th6) {
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(com.tencent.tinker.loader.TinkerDexOptimizer.TAG, th6, "exception occurred on dexopt triggering.", new java.lang.Object[0]);
                        }
                        if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(new java.io.File(optimizedPathFor))) {
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(com.tencent.tinker.loader.TinkerDexOptimizer.TAG, "interpret dexopt failure, compensate with system method.", new java.lang.Object[0]);
                            dalvik.system.DexFile.loadDex(this.dexFile.getAbsolutePath(), optimizedPathFor, 0);
                        }
                    } else if (!com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(26, true)) {
                        dalvik.system.DexFile.loadDex(this.dexFile.getAbsolutePath(), optimizedPathFor, 0);
                    } else if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(29, true)) {
                        com.tencent.tinker.loader.TinkerDexOptimizer.createFakeODexPathStructureOnDemand(optimizedPathFor);
                        patchClassLoaderStrongRef = com.tencent.tinker.loader.NewClassLoaderInjector.triggerDex2Oat(this.context, this.optimizedDir, this.useDLC, this.dexFile.getAbsolutePath());
                        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    com.tencent.tinker.loader.TinkerDexOptimizer.triggerPMDexOptOnDemand(com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.this.context, com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.this.dexFile.getAbsolutePath(), optimizedPathFor);
                                    if (com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.this.useEmergencyMode) {
                                        return;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    java.lang.String str = optimizedPathFor;
                                    sb6.append(str.substring(0, str.lastIndexOf(com.tencent.tinker.loader.shareutil.ShareConstants.ODEX_SUFFIX)));
                                    sb6.append(com.tencent.tinker.loader.shareutil.ShareConstants.VDEX_SUFFIX);
                                    com.tencent.tinker.loader.TinkerDexOptimizer.waitUntilFileGeneratedOrTimeout(com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.this.context, sb6.toString(), new java.lang.Long[0]);
                                } catch (java.lang.Throwable th7) {
                                    try {
                                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(com.tencent.tinker.loader.TinkerDexOptimizer.TAG, th7, "Fail to call triggerPMDexOptAsyncOnDemand.", new java.lang.Object[0]);
                                        if (com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.this.useEmergencyMode) {
                                            return;
                                        }
                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                        java.lang.String str2 = optimizedPathFor;
                                        sb7.append(str2.substring(0, str2.lastIndexOf(com.tencent.tinker.loader.shareutil.ShareConstants.ODEX_SUFFIX)));
                                        sb7.append(com.tencent.tinker.loader.shareutil.ShareConstants.VDEX_SUFFIX);
                                        com.tencent.tinker.loader.TinkerDexOptimizer.waitUntilFileGeneratedOrTimeout(com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.this.context, sb7.toString(), new java.lang.Long[0]);
                                    } catch (java.lang.Throwable th8) {
                                        if (!com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.this.useEmergencyMode) {
                                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                            java.lang.String str3 = optimizedPathFor;
                                            sb8.append(str3.substring(0, str3.lastIndexOf(com.tencent.tinker.loader.shareutil.ShareConstants.ODEX_SUFFIX)));
                                            sb8.append(com.tencent.tinker.loader.shareutil.ShareConstants.VDEX_SUFFIX);
                                            com.tencent.tinker.loader.TinkerDexOptimizer.waitUntilFileGeneratedOrTimeout(com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.this.context, sb8.toString(), new java.lang.Long[0]);
                                        }
                                        throw th8;
                                    }
                                }
                            }
                        };
                        if (this.useEmergencyMode) {
                            new java.lang.Thread(runnable, "TinkerDex2oatTrigger").start();
                        } else {
                            runnable.run();
                        }
                    } else {
                        patchClassLoaderStrongRef = com.tencent.tinker.loader.NewClassLoaderInjector.triggerDex2Oat(this.context, this.optimizedDir, this.useDLC, this.dexFile.getAbsolutePath());
                    }
                }
                java.io.File file = new java.io.File(optimizedPathFor);
                if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file) && !com.tencent.tinker.loader.shareutil.SharePatchFileUtil.shouldAcceptEvenIfIllegal(file)) {
                    java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Odex file: " + file.getAbsolutePath() + " does not exist.");
                    com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback resultCallback3 = this.callback;
                    if (resultCallback3 != null) {
                        resultCallback3.onFailed(this.dexFile, this.optimizedDir, fileNotFoundException);
                    }
                    return false;
                }
                com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback resultCallback4 = this.callback;
                if (resultCallback4 != null) {
                    resultCallback4.onSuccess(this.dexFile, this.optimizedDir, file);
                }
                return true;
            } catch (java.lang.Throwable th7) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(com.tencent.tinker.loader.TinkerDexOptimizer.TAG, "Failed to optimize dex: " + this.dexFile.getAbsolutePath(), th7);
                com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback resultCallback5 = this.callback;
                if (resultCallback5 != null) {
                    resultCallback5.onFailed(this.dexFile, this.optimizedDir, th7);
                }
                return false;
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface ResultCallback {
        void onFailed(java.io.File file, java.io.File file2, java.lang.Throwable th6);

        void onStart(java.io.File file, java.io.File file2);

        void onSuccess(java.io.File file, java.io.File file2, java.io.File file3);
    }

    /* loaded from: classes13.dex */
    public static class StreamConsumer {
        static final java.util.concurrent.Executor STREAM_CONSUMER = java.util.concurrent.Executors.newSingleThreadExecutor();

        private StreamConsumer() {
        }

        public static void consumeInputStream(final java.io.InputStream inputStream) {
            STREAM_CONSUMER.execute(new java.lang.Runnable() { // from class: com.tencent.tinker.loader.TinkerDexOptimizer.StreamConsumer.1
                @Override // java.lang.Runnable
                public void run() {
                    if (inputStream == null) {
                        return;
                    }
                    do {
                        try {
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th6) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Exception unused2) {
                            }
                            throw th6;
                        }
                    } while (inputStream.read(new byte[256]) > 0);
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception unused3) {
                    }
                }
            });
        }
    }

    static {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        sHandler = handler;
        sEmptyResultReceiver = new android.os.ResultReceiver(handler);
        sSynchronizedPMCache = new android.content.pm.PackageManager[]{null};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void createFakeODexPathStructureOnDemand(java.lang.String str) {
        if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(29, true)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "Creating fake odex path structure.", new java.lang.Object[0]);
            java.io.File file = new java.io.File(str);
            if (file.exists()) {
                return;
            }
            java.io.File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private static void executePMSShellCommand(android.content.Context context, java.lang.String[] strArr) {
        android.os.Parcel parcel;
        android.os.IBinder pMSBinderProxy = getPMSBinderProxy(context);
        long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
        android.os.Parcel parcel2 = null;
        try {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "[+] Execute shell cmd, args: %s", java.util.Arrays.toString(strArr));
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                parcel = android.os.Parcel.obtain();
                try {
                    obtain.writeFileDescriptor(java.io.FileDescriptor.in);
                    obtain.writeFileDescriptor(java.io.FileDescriptor.out);
                    obtain.writeFileDescriptor(java.io.FileDescriptor.err);
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(null);
                    sEmptyResultReceiver.writeToParcel(obtain, 0);
                    pMSBinderProxy.transact(SHELL_COMMAND_TRANSACTION, obtain, parcel, 0);
                    parcel.readException();
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "[+] Execute shell cmd done.", new java.lang.Object[0]);
                    parcel.recycle();
                    obtain.recycle();
                    android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    parcel2 = obtain;
                    try {
                        throw new java.lang.IllegalStateException("Failure on executing shell cmd.", th);
                    } catch (java.lang.Throwable th7) {
                        if (parcel != null) {
                            parcel.recycle();
                        }
                        if (parcel2 != null) {
                            parcel2.recycle();
                        }
                        android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th7;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                parcel = null;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            parcel = null;
        }
    }

    private static android.os.IBinder getPMSBinderProxy(android.content.Context context) {
        android.os.IBinder[] iBinderArr = sPMSBinderProxy;
        synchronized (iBinderArr) {
            android.os.IBinder iBinder = iBinderArr[0];
            if (iBinder != null && iBinder.isBinderAlive()) {
                return iBinder;
            }
            try {
                android.os.IBinder iBinder2 = (android.os.IBinder) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(java.lang.Class.forName("android.os.ServiceManager"), "getService", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class}).invoke(null, "package");
                iBinderArr[0] = iBinder2;
                return iBinder2;
            } catch (java.lang.Throwable th6) {
                if (th6 instanceof java.lang.reflect.InvocationTargetException) {
                    throw new java.lang.IllegalStateException(th6.getTargetException());
                }
                throw new java.lang.IllegalStateException(th6);
            }
        }
    }

    private static final android.content.pm.PackageManager getSynchronizedPackageManager(android.content.Context context) {
        android.content.pm.PackageManager[] packageManagerArr = sSynchronizedPMCache;
        synchronized (packageManagerArr) {
            try {
                try {
                    if (packageManagerArr[0] != null) {
                        android.os.IBinder[] iBinderArr = sPMSBinderProxy;
                        synchronized (iBinderArr) {
                            android.os.IBinder iBinder = iBinderArr[0];
                            if (iBinder != null && iBinder.isBinderAlive()) {
                                return packageManagerArr[0];
                            }
                        }
                    }
                    final android.os.IBinder pMSBinderProxy = getPMSBinderProxy(context);
                    java.lang.Object invoke = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(java.lang.Class.forName("android.content.pm.IPackageManager$Stub"), "asInterface", (java.lang.Class<?>[]) new java.lang.Class[]{android.os.IBinder.class}).invoke(null, (android.os.IBinder) java.lang.reflect.Proxy.newProxyInstance(context.getClassLoader(), pMSBinderProxy.getClass().getInterfaces(), new java.lang.reflect.InvocationHandler() { // from class: com.tencent.tinker.loader.TinkerDexOptimizer.2
                        @Override // java.lang.reflect.InvocationHandler
                        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                            if ("transact".equals(method.getName())) {
                                objArr[3] = 0;
                            }
                            return method.invoke(pMSBinderProxy, objArr);
                        }
                    }));
                    java.lang.Class<?> cls = java.lang.Class.forName("android.app.ApplicationPackageManager");
                    if (context instanceof android.content.ContextWrapper) {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                    }
                    android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findConstructor(cls, (java.lang.Class<?>[]) new java.lang.Class[]{context.getClass(), java.lang.Class.forName("android.content.pm.IPackageManager")}).newInstance(context, invoke);
                    packageManagerArr[0] = packageManager;
                    return packageManager;
                } catch (java.lang.Throwable th6) {
                    if (th6 instanceof java.lang.IllegalStateException) {
                        throw th6;
                    }
                    throw new java.lang.IllegalStateException(th6);
                }
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.IllegalStateException(e17.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void interpretDex2Oat(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.tinker.loader.shareutil.ShareFileLockHelper shareFileLockHelper;
        java.io.File file = new java.io.File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            shareFileLockHelper = com.tencent.tinker.loader.shareutil.ShareFileLockHelper.getFileLock(new java.io.File(file.getParentFile(), INTERPRET_LOCK_FILE_NAME));
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("dex2oat");
                int i17 = android.os.Build.VERSION.SDK_INT;
                arrayList.add("--runtime-arg");
                arrayList.add("-classpath");
                arrayList.add("--runtime-arg");
                arrayList.add("&");
                arrayList.add("--dex-file=" + str);
                arrayList.add("--oat-file=" + str2);
                arrayList.add("--instruction-set=" + str3);
                if (i17 > 25) {
                    arrayList.add("--compiler-filter=quicken");
                } else {
                    arrayList.add("--compiler-filter=interpret-only");
                }
                java.lang.ProcessBuilder processBuilder = new java.lang.ProcessBuilder(arrayList);
                processBuilder.redirectErrorStream(true);
                java.lang.Process start = processBuilder.start();
                com.tencent.tinker.loader.TinkerDexOptimizer.StreamConsumer.consumeInputStream(start.getInputStream());
                com.tencent.tinker.loader.TinkerDexOptimizer.StreamConsumer.consumeInputStream(start.getErrorStream());
                try {
                    int waitFor = start.waitFor();
                    if (waitFor != 0) {
                        throw new java.io.IOException("dex2oat works unsuccessfully, exit code: " + waitFor);
                    }
                    if (shareFileLockHelper != null) {
                        try {
                            shareFileLockHelper.close();
                        } catch (java.io.IOException e17) {
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "release interpret Lock error", e17);
                        }
                    }
                } catch (java.lang.InterruptedException e18) {
                    throw new java.io.IOException("dex2oat is interrupted, msg: " + e18.getMessage(), e18);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (shareFileLockHelper != null) {
                    try {
                        shareFileLockHelper.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "release interpret Lock error", e19);
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            shareFileLockHelper = null;
        }
    }

    public static boolean optimizeAll(android.content.Context context, java.util.Collection<java.io.File> collection, java.io.File file, boolean z17, boolean z18, com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback resultCallback) {
        return optimizeAll(context, collection, file, false, z17, com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getCurrentInstructionSet(), z18, resultCallback);
    }

    private static void performBgDexOptJob(android.content.Context context) {
        executePMSShellCommand(context, new java.lang.String[]{"bg-dexopt-job", context.getPackageName()});
    }

    private static void performDexOptSecondary(android.content.Context context) {
        java.lang.String[] strArr = new java.lang.String[6];
        strArr[0] = "compile";
        strArr[1] = "-f";
        strArr[2] = "--secondary-dex";
        strArr[3] = "-m";
        strArr[4] = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(31, true) ? "verify" : "speed-profile";
        strArr[5] = context.getPackageName();
        executePMSShellCommand(context, strArr);
    }

    private static void performDexOptSecondaryByTransactionCode(android.content.Context context) {
        android.os.Parcel parcel;
        boolean z17;
        android.os.Parcel parcel2;
        int[] iArr = sPerformDexOptSecondaryTransactionCode;
        synchronized (iArr) {
            parcel = null;
            z17 = true;
            if (iArr[0] == -1) {
                try {
                    java.lang.reflect.Method findMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod((java.lang.Class<?>) java.lang.Class.class, "getDeclaredField", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
                    findMethod.setAccessible(true);
                    java.lang.reflect.Field field = (java.lang.reflect.Field) findMethod.invoke(java.lang.Class.forName("android.content.pm.IPackageManager$Stub"), "TRANSACTION_performDexOptSecondary");
                    field.setAccessible(true);
                    iArr[0] = ((java.lang.Integer) field.get(null)).intValue();
                } catch (java.lang.Throwable th6) {
                    throw new java.lang.IllegalStateException("Cannot query transaction code of performDexOptSecondary.", th6);
                }
            }
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "[+] performDexOptSecondaryByTransactionCode, code: %s", java.lang.Integer.valueOf(iArr[0]));
        android.os.IBinder pMSBinderProxy = getPMSBinderProxy(context);
        try {
            parcel2 = android.os.Parcel.obtain();
            try {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    parcel2.writeInterfaceToken(pMSBinderProxy.getInterfaceDescriptor());
                    parcel2.writeString(context.getPackageName());
                    parcel2.writeString(com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(31, true) ? "verify" : "speed-profile");
                    parcel2.writeInt(1);
                    if (!pMSBinderProxy.transact(iArr[0], parcel2, obtain, 0)) {
                        throw new java.lang.IllegalStateException("Binder transaction failure.");
                    }
                    try {
                        obtain.readException();
                        if (obtain.readInt() == 0) {
                            z17 = false;
                        }
                        if (!z17) {
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "[!] System API return false.", new java.lang.Object[0]);
                        }
                        obtain.recycle();
                        parcel2.recycle();
                        return;
                    } finally {
                        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(th);
                    }
                } catch (android.os.RemoteException th7) {
                    throw new java.lang.IllegalStateException(th7);
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
            th = th8;
        } catch (java.lang.Throwable th9) {
            th = th9;
            parcel2 = null;
        }
        if (0 != 0) {
            parcel.recycle();
        }
        if (parcel2 != null) {
            parcel2.recycle();
        }
        throw th;
    }

    private static void registerDexModule(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager synchronizedPackageManager = getSynchronizedPackageManager(context);
        try {
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(synchronizedPackageManager, "registerDexModule", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class, java.lang.Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback")}).invoke(synchronizedPackageManager, str, null);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.IllegalStateException(e17.getTargetException());
        } catch (java.lang.Throwable th6) {
            if (!(th6 instanceof java.lang.IllegalStateException)) {
                throw new java.lang.IllegalStateException(th6);
            }
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void triggerPMDexOptOnDemand(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (!com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(29, true)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "[+] Not API 29, 30 and newer device, skip triggering dexopt.", new java.lang.Object[0]);
            return;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "[+] Hit target device, do dexopt logic now.", new java.lang.Object[0]);
        java.io.File file = new java.io.File(str2);
        if (com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "[+] Oat file %s should be valid, skip triggering dexopt.", str2);
            return;
        }
        java.io.File file2 = new java.io.File(str);
        for (int i17 = 0; i17 < 10; i17++) {
            if (triggerSecondaryDexOpt(context, file2, file, true)) {
                return;
            }
        }
        if (com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file)) {
            return;
        }
        java.lang.String str3 = android.os.Build.MANUFACTURER;
        if (!"huawei".equalsIgnoreCase(str3) && !"honor".equalsIgnoreCase(str3)) {
            throw new java.lang.IllegalStateException("No odex file was generated after calling performDexOptSecondary");
        }
        for (int i18 = 0; i18 < 5; i18++) {
            try {
                registerDexModule(context, str);
            } catch (java.lang.Throwable th6) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th6, "[-] Error.", new java.lang.Object[0]);
            }
            if (com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file)) {
                break;
            }
            android.os.SystemClock.sleep(3000L);
        }
        if (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file)) {
            throw new java.lang.IllegalStateException("No odex file was generated after calling registerDexModule");
        }
    }

    private static boolean triggerSecondaryDexOpt(android.content.Context context, java.io.File file, java.io.File file2, boolean z17) {
        try {
            performDexOptSecondary(context);
            if (com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file2)) {
                return true;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th6, "[-] Error.", new java.lang.Object[0]);
        }
        try {
            performBgDexOptJob(context);
            if (com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file2)) {
                return true;
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th7, "[-] Error.", new java.lang.Object[0]);
        }
        try {
            performDexOptSecondaryByTransactionCode(context);
            if (com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file2)) {
                return true;
            }
        } catch (java.lang.Throwable th8) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, th8, "[-] Error.", new java.lang.Object[0]);
        }
        return z17 ? waitUntilFileGeneratedOrTimeout(context, file2.getAbsolutePath(), 3000L) : com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean waitUntilFileGeneratedOrTimeout(android.content.Context context, java.lang.String str, java.lang.Long... lArr) {
        java.io.File file = new java.io.File(str);
        if (lArr == null || lArr.length <= 0) {
            lArr = new java.lang.Long[]{1000L, 2000L, 4000L, 8000L, 16000L, 32000L};
        }
        int i17 = 0;
        while (!com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file) && i17 < lArr.length) {
            int i18 = i17 + 1;
            android.os.SystemClock.sleep(lArr[i17].longValue());
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "[!] File %s does not exist after waiting %s time(s), wait again.", str, java.lang.Integer.valueOf(i18));
            i17 = i18;
        }
        if (com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(file)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "[+] File %s was found.", str);
            return true;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "[-] File %s does not exist after waiting for %s times.", str, java.lang.Integer.valueOf(lArr.length));
        return false;
    }

    public static boolean optimizeAll(android.content.Context context, java.util.Collection<java.io.File> collection, java.io.File file, boolean z17, boolean z18, java.lang.String str, boolean z19, com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback resultCallback) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        java.util.Collections.sort(arrayList, new java.util.Comparator<java.io.File>() { // from class: com.tencent.tinker.loader.TinkerDexOptimizer.1
            @Override // java.util.Comparator
            public int compare(java.io.File file2, java.io.File file3) {
                long length = file2.length();
                long length2 = file3.length();
                if (length < length2) {
                    return 1;
                }
                return length == length2 ? 0 : -1;
            }
        });
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!new com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker(context, (java.io.File) it.next(), file, z17, z18, str, z19, resultCallback).run()) {
                return false;
            }
        }
        return true;
    }
}
