package com.tencent.tinker.lib.service;

/* loaded from: classes13.dex */
public class TinkerPatchService extends android.app.IntentService {

    /* renamed from: d, reason: collision with root package name */
    public static qv5.a f215546d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Class f215547e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f215548f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* loaded from: classes11.dex */
    public static class InnerService extends android.app.Service {
        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            try {
                qv5.a aVar = com.tencent.tinker.lib.service.TinkerPatchService.f215546d;
                startForeground(com.tencent.tinker.loader.shareutil.ShareConstants.TINKER_PATCH_SERVICE_NOTIFICATION, new android.app.Notification());
            } catch (java.lang.Throwable th6) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.TinkerPatchService", "InnerService set service for push exception:%s.", th6);
            }
            stopSelf();
        }

        @Override // android.app.Service
        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(android.content.Intent intent, int i17, int i18) {
            super.onStartCommand(intent, i17, i18);
            return 2;
        }
    }

    public TinkerPatchService() {
        super("TinkerPatchService");
        setIntentRedelivery(true);
    }

    public static boolean a(android.content.Context context) {
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int i17;
        try {
            java.lang.String a17 = uv5.a.a(context);
            if (a17 != null && (activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = 0;
                        break;
                    }
                    android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.processName.equals(a17)) {
                        i17 = next.pid;
                        break;
                    }
                }
                if (i17 == 0) {
                    return false;
                }
                return new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(context), "patch_service_status/running_" + i17).exists();
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static void b(android.content.Context context) {
        java.io.File file = new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(context), "patch_service_status/running_" + android.os.Process.myPid());
        if (file.exists()) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            java.io.File[] listFiles = parentFile.listFiles();
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    file2.delete();
                }
            }
        } else {
            parentFile.mkdirs();
        }
        try {
            if (!file.createNewFile()) {
                throw new java.lang.IllegalStateException();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace("Tinker.TinkerPatchService", th6, "Fail to create running marker file.", new java.lang.Object[0]);
        }
    }

    public static void c(android.content.Context context) {
        java.io.File file = new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(context), "patch_service_status/running_" + android.os.Process.myPid());
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        java.lang.Throwable th6;
        boolean z17;
        qv5.a aVar;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.TinkerPatchService", "for system version >= Android O, we just ignore increasingPriority job to avoid crash or toasts.", new java.lang.Object[0]);
        } else if ("ZUK".equals(android.os.Build.MANUFACTURER)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.TinkerPatchService", "for ZUK device, we just ignore increasingPriority job to avoid crash.", new java.lang.Object[0]);
        } else {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.TinkerPatchService", "try to increase patch process priority", new java.lang.Object[0]);
            try {
                startForeground(com.tencent.tinker.loader.shareutil.ShareConstants.TINKER_PATCH_SERVICE_NOTIFICATION, new android.app.Notification());
                startService(new android.content.Intent(this, (java.lang.Class<?>) com.tencent.tinker.lib.service.TinkerPatchService.InnerService.class));
            } catch (java.lang.Throwable th7) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.TinkerPatchService", "try to increase patch process priority error:" + th7, new java.lang.Object[0]);
            }
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f215548f;
        if (!atomicBoolean.compareAndSet(false, true)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.w("Tinker.TinkerPatchService", "TinkerPatchService doApplyPatch is running by another runner.", new java.lang.Object[0]);
            return;
        }
        try {
            b(this);
            tv5.b b17 = tv5.b.b(this);
            rv5.d dVar = b17.f422372e;
            dVar.g(intent);
            if (intent == null) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.TinkerPatchService", "TinkerPatchService received a null intent, ignoring.", new java.lang.Object[0]);
            } else {
                java.lang.String stringExtra = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getStringExtra(intent, "patch_path_extra");
                if (stringExtra == null) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.TinkerPatchService", "TinkerPatchService can't get the path extra, ignoring.", new java.lang.Object[0]);
                } else {
                    java.io.File file = new java.io.File(stringExtra);
                    boolean booleanExtra = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getBooleanExtra(intent, "patch_use_emergency_mode", false);
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    com.tencent.tinker.lib.service.PatchResult patchResult = new com.tencent.tinker.lib.service.PatchResult();
                    try {
                        aVar = f215546d;
                    } catch (java.lang.Throwable th8) {
                        th6 = th8;
                        dVar.e(file, th6);
                        z17 = false;
                    }
                    if (aVar == null) {
                        throw new com.tencent.tinker.loader.TinkerRuntimeException("upgradePatchProcessor is null.");
                    }
                    z17 = aVar.a(this, stringExtra, booleanExtra, patchResult);
                    th6 = null;
                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                    dVar.f(file, z17, elapsedRealtime2);
                    patchResult.isSuccess = z17;
                    patchResult.rawPatchFilePath = stringExtra;
                    patchResult.useEmergencyMode = booleanExtra;
                    patchResult.totalCostTime = elapsedRealtime2;
                    patchResult.type = b17.f422374g == null ? 0 : 1;
                    patchResult.f215545e = th6;
                    c(this);
                    atomicBoolean.set(false);
                    com.tencent.tinker.lib.service.AbstractResultService.b(this, patchResult, com.tencent.tinker.loader.shareutil.ShareIntentUtil.getStringExtra(intent, "patch_result_class"));
                }
            }
        } finally {
            c(this);
        }
    }
}
