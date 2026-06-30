package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public class PluginProcessService extends com.tencent.shadow.dynamic.host.BasePluginProcessService implements android.os.IBinder.DeathRecipient {
    private static com.tencent.shadow.dynamic.host.PluginProcessService sSelf;
    private static com.tencent.shadow.dynamic.host.ISystemServiceManager sSystemServiceManager;
    private byte _hellAccFlag_;
    private com.tencent.shadow.dynamic.host.PluginLoaderImpl mPluginLoader;
    private com.tencent.shadow.dynamic.host.UuidManager mUuidManager;
    private static final com.tencent.shadow.core.common.Logger logger = com.tencent.shadow.core.common.LoggerFactory.getLogger("Shadow.PluginProcessService");
    private static final java.lang.Object ppsIdLock = new java.lang.Object();
    private static java.lang.String sPpsId = "";
    static final com.tencent.shadow.dynamic.host.BasePluginProcessService.ActivityHolder sActivityHolder = new com.tencent.shadow.dynamic.host.BasePluginProcessService.ActivityHolder();
    private final com.tencent.shadow.dynamic.host.PpsBinder mPpsControllerBinder = new com.tencent.shadow.dynamic.host.PpsBinder(this);
    private android.os.Handler mMainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private java.lang.Runnable mKillSelfTask = new java.lang.Runnable() { // from class: com.tencent.shadow.dynamic.host.PluginProcessService.1
        private byte _hellAccFlag_;

        @Override // java.lang.Runnable
        public void run() {
            com.tencent.shadow.dynamic.host.PluginProcessService.logger.error("kill-self task will run.");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/shadow/dynamic/host/PluginProcessService$1", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
            java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/shadow/dynamic/host/PluginProcessService$1", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    };
    private boolean mRuntimeLoaded = false;
    private java.lang.String mLoaderUuid = "";

    private static void checkApkFileExists(java.lang.String str, com.tencent.shadow.core.common.InstalledApk installedApk) {
        java.lang.String str2;
        if (installedApk == null || ((str2 = installedApk.apkFilePath) == null && installedApk.apkFd == null)) {
            throw new com.tencent.shadow.dynamic.host.FailedException(3003, "uuid==" + str + "的 apkFile 没有找到。");
        }
        if (str2 != null) {
            java.io.File file = new java.io.File(installedApk.apkFilePath);
            if (file.exists()) {
                return;
            }
            throw new com.tencent.shadow.dynamic.host.FailedException(3003, file.getAbsolutePath() + "文件不存在");
        }
    }

    private void checkUuidManagerNotNull() {
        if (this.mUuidManager == null) {
            throw new com.tencent.shadow.dynamic.host.FailedException(3004, "mUuidManager == null");
        }
    }

    public static android.app.Application.ActivityLifecycleCallbacks getActivityHolder() {
        return sActivityHolder;
    }

    public static com.tencent.shadow.dynamic.host.PluginProcessService getInstance() {
        return sSelf;
    }

    public static java.lang.String getPpsId() {
        java.lang.String str;
        synchronized (ppsIdLock) {
            str = sPpsId;
        }
        return str;
    }

    public static com.tencent.shadow.dynamic.host.ISystemServiceManager getServiceManager() {
        return sSystemServiceManager;
    }

    private void killSelf() {
        com.tencent.shadow.core.common.Logger logger2 = logger;
        logger2.info("PluginProcessService found binderDied: killSelf");
        logger2.flush();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/shadow/dynamic/host/PluginProcessService", "killSelf", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/shadow/dynamic/host/PluginProcessService", "killSelf", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    private void setUuid(java.lang.String str) {
        if (this.mLoaderUuid.isEmpty()) {
            this.mLoaderUuid = str;
        } else {
            if (this.mLoaderUuid.equals(str)) {
                return;
            }
            throw new com.tencent.shadow.dynamic.host.FailedException(3006, "已设置过uuid==" + this.mLoaderUuid + "试图设置uuid==" + str);
        }
    }

    public void bindLifecycleListener(android.os.IBinder iBinder) {
        try {
            iBinder.linkToDeath(this, 0);
        } catch (android.os.RemoteException e17) {
            logger.error("bindLifecycleListener to binder failed", (java.lang.Throwable) e17);
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        killSelf();
    }

    public com.tencent.shadow.dynamic.host.PpsStatus checkPpsId(java.lang.String str) {
        com.tencent.shadow.dynamic.host.PpsStatus ppsStatus;
        synchronized (ppsIdLock) {
            logger.info("checkPpsId(" + str + ") -> sPpsId = (" + sPpsId + ")");
            if (sPpsId.isEmpty()) {
                sPpsId = str;
            }
            if (!sPpsId.equals(str)) {
                this.mMainHandler.removeCallbacks(this.mKillSelfTask);
                this.mMainHandler.postDelayed(this.mKillSelfTask, 50L);
            }
            ppsStatus = getPpsStatus();
        }
        return ppsStatus;
    }

    public void exit() {
        com.tencent.shadow.core.common.Logger logger2 = logger;
        if (logger2.isInfoEnabled()) {
            logger2.info("exit");
        }
        sActivityHolder.finishAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/shadow/dynamic/host/PluginProcessService", "exit", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/shadow/dynamic/host/PluginProcessService", "exit", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public android.os.IBinder getPluginLoader() {
        return this.mPluginLoader;
    }

    public com.tencent.shadow.dynamic.host.PpsStatus getPpsStatus() {
        return new com.tencent.shadow.dynamic.host.PpsStatus(this.mLoaderUuid, this.mRuntimeLoaded, this.mPluginLoader != null, this.mUuidManager != null, getPpsId());
    }

    public void initCrashHandlerByFd(android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2) {
        logger.info("initCrashHandlerByFd call for " + parcelFileDescriptor.getFd() + ", " + parcelFileDescriptor2.getFd());
        com.tencent.shadow.dynamic.host.FdCrashHandlerGuest.getCallback().init(parcelFileDescriptor, parcelFileDescriptor2);
    }

    public void loadPluginLoader(java.lang.String str) {
        com.tencent.shadow.core.common.Logger logger2 = logger;
        logger2.info("loadPluginLoader uuid:" + str + " mPluginLoader:" + this.mPluginLoader);
        checkUuidManagerNotNull();
        setUuid(str);
        if (this.mPluginLoader != null) {
            throw new com.tencent.shadow.dynamic.host.FailedException(com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_LOADER_EXCEPTION, "重复调用loadPluginLoader");
        }
        try {
            try {
                com.tencent.shadow.core.common.InstalledApk pluginLoader = this.mUuidManager.getPluginLoader(str);
                android.os.ParcelFileDescriptor androidJar = this.mUuidManager.getAndroidJar();
                if (logger2.isInfoEnabled()) {
                    logger2.info("取出uuid==" + str + "的Loader apk:" + pluginLoader.apkFilePath);
                }
                checkApkFileExists(str, pluginLoader);
                com.tencent.shadow.dynamic.host.PluginLoaderImpl load = new com.tencent.shadow.dynamic.host.LoaderImplLoader().load(pluginLoader, str, getApplicationContext(), androidJar);
                load.setUuidManager(this.mUuidManager);
                if (androidJar != null) {
                    androidJar.close();
                }
                pluginLoader.closeIfNeeded();
                this.mPluginLoader = load;
            } catch (android.os.RemoteException e17) {
                com.tencent.shadow.core.common.Logger logger3 = logger;
                if (logger3.isErrorEnabled()) {
                    logger3.error("获取Loader Apk失败", (java.lang.Throwable) e17);
                }
                throw new com.tencent.shadow.dynamic.host.FailedException(3005, e17.getMessage());
            } catch (com.tencent.shadow.dynamic.host.NotFoundException e18) {
                throw new com.tencent.shadow.dynamic.host.FailedException(3003, "uuid==" + str + "的PluginLoader没有找到。cause:" + e18.getMessage());
            }
        } catch (com.tencent.shadow.dynamic.host.FailedException e19) {
            com.tencent.shadow.core.common.Logger logger4 = logger;
            if (logger4.isErrorEnabled()) {
                logger4.error("loadPluginLoader发生FailedException", (java.lang.Throwable) e19);
            }
            throw e19;
        } catch (java.lang.RuntimeException e27) {
            com.tencent.shadow.core.common.Logger logger5 = logger;
            if (logger5.isErrorEnabled()) {
                logger5.error("loadPluginLoader发生RuntimeException", (java.lang.Throwable) e27);
            }
            throw new com.tencent.shadow.dynamic.host.FailedException(e27);
        } catch (java.lang.Exception e28) {
            e = e28;
            com.tencent.shadow.core.common.Logger logger6 = logger;
            if (logger6.isErrorEnabled()) {
                logger6.error("loadPluginLoader发生Exception", e);
            }
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new com.tencent.shadow.dynamic.host.FailedException(3002, "加载动态实现失败 cause：" + e.getMessage());
        }
    }

    public void loadPluginLoaderByApk(java.lang.String str, com.tencent.shadow.core.common.InstalledApk installedApk, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        logger.info("loadPluginLoaderByApk:" + installedApk);
        if (this.mPluginLoader != null) {
            throw new com.tencent.shadow.dynamic.host.FailedException(com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_LOADER_EXCEPTION, "重复调用loadPluginLoader");
        }
        try {
            if (parcelFileDescriptor == null || installedApk == null) {
                throw new com.tencent.shadow.dynamic.host.FailedException(3003, "PluginLoader没有找到: androidJar:" + parcelFileDescriptor + "; " + installedApk);
            }
            checkApkFileExists(null, installedApk);
            com.tencent.shadow.dynamic.host.PluginLoaderImpl load = new com.tencent.shadow.dynamic.host.LoaderImplLoader().load(installedApk, str, getApplicationContext(), parcelFileDescriptor);
            load.setUuidManager(this.mUuidManager);
            parcelFileDescriptor.close();
            installedApk.closeIfNeeded();
            this.mPluginLoader = load;
        } catch (com.tencent.shadow.dynamic.host.FailedException e17) {
            logger.error("loadPluginLoader发生FailedException", (java.lang.Throwable) e17);
            throw e17;
        } catch (java.lang.RuntimeException e18) {
            logger.error("loadPluginLoader发生RuntimeException", (java.lang.Throwable) e18);
            throw new com.tencent.shadow.dynamic.host.FailedException(e18);
        } catch (java.lang.Exception e19) {
            e = e19;
            logger.error("loadPluginLoader发生Exception", e);
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new com.tencent.shadow.dynamic.host.FailedException(3002, "加载动态实现失败 cause：" + e.getMessage());
        }
    }

    public void loadRuntime(java.lang.String str) {
        checkUuidManagerNotNull();
        setUuid(str);
        if (this.mRuntimeLoaded) {
            throw new com.tencent.shadow.dynamic.host.FailedException(com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_RUNTIME_EXCEPTION, "重复调用loadRuntime");
        }
        try {
            com.tencent.shadow.core.common.Logger logger2 = logger;
            if (logger2.isInfoEnabled()) {
                logger2.info("loadRuntime uuid:" + str);
            }
            try {
                try {
                    com.tencent.shadow.core.common.InstalledApk runtime = this.mUuidManager.getRuntime(str);
                    com.tencent.shadow.core.common.InstalledApk installedApk = new com.tencent.shadow.core.common.InstalledApk(runtime.apkFilePath, runtime.oDexPath, runtime.libraryPath);
                    if (com.tencent.shadow.dynamic.host.DynamicRuntime.loadRuntime(installedApk)) {
                        com.tencent.shadow.dynamic.host.DynamicRuntime.saveLastRuntimeInfo(this, installedApk);
                    }
                    this.mRuntimeLoaded = true;
                } catch (com.tencent.shadow.dynamic.host.NotFoundException e17) {
                    throw new com.tencent.shadow.dynamic.host.FailedException(3003, "uuid==" + str + "的Runtime没有找到。cause:" + e17.getMessage());
                }
            } catch (android.os.RemoteException e18) {
                throw new com.tencent.shadow.dynamic.host.FailedException(3005, e18.getMessage());
            }
        } catch (java.lang.RuntimeException e19) {
            com.tencent.shadow.core.common.Logger logger3 = logger;
            if (logger3.isErrorEnabled()) {
                logger3.error("loadRuntime发生RuntimeException", (java.lang.Throwable) e19);
            }
            throw new com.tencent.shadow.dynamic.host.FailedException(e19);
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        logger.info("onBind:" + intent);
        return this.mPpsControllerBinder;
    }

    @Override // com.tencent.shadow.dynamic.host.BasePluginProcessService, android.app.Service
    public void onCreate() {
        sSelf = this;
        super.onCreate();
    }

    @Override // com.tencent.shadow.dynamic.host.BasePluginProcessService, android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        logger.info("onUnbind:" + intent);
        return super.onUnbind(intent);
    }

    public void setHostOpenedFds(java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> map) {
        com.tencent.shadow.dynamic.host.HostOpenPathDelegator.getCallback().handleFds(map);
    }

    public void setSystemService(com.tencent.shadow.dynamic.host.ISystemServiceManager iSystemServiceManager) {
        logger.info("setSystemService " + iSystemServiceManager);
        sSystemServiceManager = iSystemServiceManager;
        bindLifecycleListener(iSystemServiceManager.asBinder());
    }

    public void setUuidManager(com.tencent.shadow.dynamic.host.UuidManager uuidManager) {
        com.tencent.shadow.core.common.Logger logger2 = logger;
        if (logger2.isInfoEnabled()) {
            logger2.info("setUuidManager uuidManager==" + uuidManager);
        }
        this.mUuidManager = uuidManager;
        if (this.mPluginLoader != null) {
            if (logger2.isInfoEnabled()) {
                logger2.info("更新mPluginLoader的uuidManager");
            }
            this.mPluginLoader.setUuidManager(uuidManager);
        }
    }
}
