package com.tencent.recovery.wx.service;

/* loaded from: classes12.dex */
public class WXRecoveryUploadService extends android.app.IntentService {
    private static final java.lang.String EXTRA_CRASH_COUNT = "extra_crash_count";
    private static final java.lang.String EXTRA_FETCH_BASE_ID = "extra_fetch_base_id";
    private static final java.lang.String EXTRA_FOR_TEST = "extra_for_test";
    private static final java.lang.String EXTRA_NEXT_RETRY_DELAY_MS = "extra_next_retry_delay_ms";
    private static final java.lang.String EXTRA_PATCH_URL = "extra_patch_url";
    private static final java.lang.String EXTRA_RETRY_COUNTER = "extra_retry_counter";
    private static final java.lang.String EXTRA_USE_HTTPS_ONLY = "extra_use_https_only";
    private static final int MAX_RETRY_COUNT = 3;
    private static final int MAX_RETRY_DELAY_MS = 14400000;
    private static final java.lang.String RECOVERY_TAG = "MicroMsg.recovery.service";

    /* loaded from: classes12.dex */
    public interface IFetchCallback {
        void onCallback(int i17);
    }

    public WXRecoveryUploadService() {
        super("WXRecoveryUploadService");
    }

    public static void fetchTinkerPatch(android.content.Context context, sc0.f fVar, java.lang.String str, boolean z17, boolean z18) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.tencent.recovery.wx.service.WXRecoveryUploadService.class);
        intent.putExtra(EXTRA_FETCH_BASE_ID, str);
        intent.putExtra(EXTRA_FOR_TEST, z17);
        intent.putExtra(EXTRA_USE_HTTPS_ONLY, z18);
        try {
            context.startService(intent);
            d55.w wVar = new d55.w(context, "recovery_statistic");
            wVar.e();
            wVar.getInt("crash_count", 0);
            wVar.getBoolean("launch_recovery", false);
            boolean z19 = wVar.getBoolean("launch_recovery_real", false);
            boolean z27 = wVar.getBoolean("recover_from_crash", false);
            int i17 = wVar.getInt("recovery_status", -1);
            wVar.getInt("recovery_from", 0);
            int i18 = wVar.getInt("recover_internal_status", 0);
            wVar.getInt("recover_launch_mode", 0);
            wVar.getLong("recover_running_time", 0L);
            wVar.getBoolean("recover_is_discard", false);
            java.lang.String string = wVar.getString("recover_app_ver", "");
            int i19 = fVar.f405639d;
            long max = java.lang.Math.max(java.lang.System.currentTimeMillis() - com.tencent.mm.app.x.f53906a, 0L);
            wVar.g("crash_count", 0);
            wVar.putBoolean("launch_recovery", true);
            wVar.putBoolean("launch_recovery_real", z19);
            wVar.putBoolean("recover_from_crash", z27);
            wVar.putInt("recovery_status", i17);
            wVar.putInt("recovery_from", i19);
            wVar.putInt("recover_internal_status", i18);
            wVar.putInt("recover_launch_mode", 2);
            wVar.putLong("recover_running_time", max);
            wVar.putBoolean("recover_is_discard", false);
            wVar.putString("recover_app_ver", string);
            wVar.d();
            d55.w wVar2 = new d55.w(context, "recovery_statistic");
            wVar2.e();
            int i27 = wVar2.getInt("crash_count", 0);
            boolean z28 = wVar2.getBoolean("launch_recovery", false);
            boolean z29 = wVar2.getBoolean("launch_recovery_real", false);
            boolean z37 = wVar2.getBoolean("recover_from_crash", false);
            int i28 = wVar2.getInt("recovery_status", -1);
            int i29 = wVar2.getInt("recovery_from", 0);
            int i37 = wVar2.getInt("recover_internal_status", 0);
            int i38 = wVar2.getInt("recover_launch_mode", 0);
            long j17 = wVar2.getLong("recover_running_time", 0L);
            boolean z38 = wVar2.getBoolean("recover_is_discard", false);
            java.lang.String string2 = wVar2.getString("recover_app_ver", "");
            wVar2.g("crash_count", i27);
            wVar2.putBoolean("launch_recovery", z28);
            wVar2.putBoolean("launch_recovery_real", z29);
            wVar2.putBoolean("recover_from_crash", z37);
            wVar2.putInt("recovery_status", i28);
            wVar2.putInt("recovery_from", i29);
            wVar2.putInt("recover_internal_status", i37);
            wVar2.putInt("recover_launch_mode", i38);
            wVar2.putLong("recover_running_time", j17);
            wVar2.putBoolean("recover_is_discard", z38);
            wVar2.putString("recover_app_ver", string2);
            wVar2.c();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w(RECOVERY_TAG, "start service fail", th6);
        }
    }

    private void fetchTinkerPatchForTest(android.content.Intent intent, final com.tencent.recovery.wx.service.WXRecoveryUploadService.IFetchCallback iFetchCallback) {
        boolean booleanExtra = intent.getBooleanExtra(EXTRA_USE_HTTPS_ONLY, true);
        java.lang.String stringExtra = intent.getStringExtra(EXTRA_FETCH_BASE_ID);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            d55.u.d(RECOVERY_TAG, "fetchTinkerPatchForTest: you must provide baseId when test patch fetching.", new java.lang.Object[0]);
            return;
        }
        d55.u.b(RECOVERY_TAG, "fetchTinkerPatchForTest, baseId = %s, useHTTPSOnly = %s", stringExtra, java.lang.Boolean.valueOf(booleanExtra));
        android.content.Context applicationContext = getApplicationContext();
        m3.a aVar = new m3.a() { // from class: com.tencent.recovery.wx.service.WXRecoveryUploadService$$a
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                com.tencent.recovery.wx.service.WXRecoveryUploadService.lambda$fetchTinkerPatchForTest$1(com.tencent.recovery.wx.service.WXRecoveryUploadService.IFetchCallback.this, (java.lang.Integer) obj);
            }
        };
        d55.u.b("MicroMsg.recovery.operator", "#fetchTinkerPatchForTest", new java.lang.Object[0]);
        a55.h.f1617a.a();
        y45.n nVar = new y45.n(aVar);
        r45.f35 f35Var = new r45.f35();
        f35Var.f373987d = stringExtra;
        f35Var.f373988e = lp0.a.a();
        f35Var.f373989f = b55.b.b();
        f35Var.f373994n = 1;
        y45.m.a(applicationContext, f35Var, nVar, false, booleanExtra, false);
        d55.u.b(RECOVERY_TAG, "fetchTinkerPatchForTest done", new java.lang.Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$fetchTinkerPatch$2(com.tencent.recovery.wx.service.WXRecoveryUploadService.IFetchCallback iFetchCallback, java.lang.Integer num) {
        d55.u.b(RECOVERY_TAG, "#fetchTinkerPatch callback, status = " + num, new java.lang.Object[0]);
        d55.u.b(RECOVERY_TAG, "#fetchTinkerPatch done, status = " + num, new java.lang.Object[0]);
        d55.w wVar = new d55.w(getApplication(), "recovery_statistic");
        wVar.e();
        int i17 = wVar.getInt("crash_count", 0);
        boolean z17 = wVar.getBoolean("launch_recovery", false);
        boolean z18 = wVar.getBoolean("launch_recovery_real", false);
        boolean z19 = wVar.getBoolean("recover_from_crash", false);
        wVar.getInt("recovery_status", -1);
        int i18 = wVar.getInt("recovery_from", 0);
        int i19 = wVar.getInt("recover_internal_status", 0);
        int i27 = wVar.getInt("recover_launch_mode", 0);
        long j17 = wVar.getLong("recover_running_time", 0L);
        wVar.getBoolean("recover_is_discard", false);
        java.lang.String string = wVar.getString("recover_app_ver", "");
        int intValue = num.intValue();
        wVar.g("crash_count", i17);
        wVar.putBoolean("launch_recovery", z17);
        wVar.putBoolean("launch_recovery_real", z18);
        wVar.putBoolean("recover_from_crash", z19);
        wVar.putInt("recovery_status", intValue);
        wVar.putInt("recovery_from", i18);
        wVar.putInt("recover_internal_status", i19);
        wVar.putInt("recover_launch_mode", i27);
        wVar.putLong("recover_running_time", j17);
        wVar.putBoolean("recover_is_discard", false);
        wVar.putString("recover_app_ver", string);
        wVar.c();
        if (iFetchCallback != null) {
            iFetchCallback.onCallback(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchTinkerPatchForTest$1(com.tencent.recovery.wx.service.WXRecoveryUploadService.IFetchCallback iFetchCallback, java.lang.Integer num) {
        d55.u.b(RECOVERY_TAG, "fetchTinkerPatchForTest callback, status = " + num, new java.lang.Object[0]);
        if (iFetchCallback != null) {
            iFetchCallback.onCallback(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onHandleIntent$0(android.content.Intent intent, int i17) {
        if (i17 > 60 || i17 > 20) {
            try {
                int intExtra = intent.getIntExtra(EXTRA_RETRY_COUNTER, 0);
                if (intExtra > 3) {
                    d55.u.d(RECOVERY_TAG, "[!] Max retry count exceeded, give up.", new java.lang.Object[0]);
                    return;
                }
                android.app.AlarmManager alarmManager = (android.app.AlarmManager) getApplicationContext().getSystemService("alarm");
                android.content.Intent intent2 = new android.content.Intent(intent);
                intent2.putExtra(EXTRA_RETRY_COUNTER, intExtra + 1);
                long intExtra2 = intent.getIntExtra(EXTRA_NEXT_RETRY_DELAY_MS, 3600000);
                intent2.putExtra(EXTRA_NEXT_RETRY_DELAY_MS, java.lang.Math.min(java.lang.Math.max(intExtra2 >> 1, 60000L) + intExtra2, 14400000L));
                android.app.PendingIntent service = android.app.PendingIntent.getService(getApplicationContext(), 1, intent2, 201326592);
                long currentTimeMillis = java.lang.System.currentTimeMillis() + intExtra2;
                java.util.Objects.requireNonNull(service);
                z2.n.b(alarmManager, 0, currentTimeMillis, service);
            } catch (java.lang.Throwable th6) {
                d55.u.c(RECOVERY_TAG, "[!] fetch patch callback throws exception.", th6, new java.lang.Object[0]);
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        d55.u.b(RECOVERY_TAG, "onBind", new java.lang.Object[0]);
        onHandleIntent(intent);
        return null;
    }

    @Override // android.app.IntentService
    public void onHandleIntent(final android.content.Intent intent) {
        if (intent == null) {
            d55.u.d(RECOVERY_TAG, "intent is null.", new java.lang.Object[0]);
            return;
        }
        com.tencent.recovery.wx.service.WXRecoveryUploadService.IFetchCallback iFetchCallback = new com.tencent.recovery.wx.service.WXRecoveryUploadService.IFetchCallback() { // from class: com.tencent.recovery.wx.service.WXRecoveryUploadService$$b
            @Override // com.tencent.recovery.wx.service.WXRecoveryUploadService.IFetchCallback
            public final void onCallback(int i17) {
                com.tencent.recovery.wx.service.WXRecoveryUploadService.this.lambda$onHandleIntent$0(intent, i17);
            }
        };
        d55.w wVar = new d55.w(getApplication(), "recovery_statistic");
        wVar.e();
        int i17 = wVar.getInt("crash_count", 0);
        boolean z17 = wVar.getBoolean("launch_recovery", false);
        wVar.getBoolean("launch_recovery_real", false);
        boolean z18 = wVar.getBoolean("recover_from_crash", false);
        int i18 = wVar.getInt("recovery_status", -1);
        int i19 = wVar.getInt("recovery_from", 0);
        int i27 = wVar.getInt("recover_internal_status", 0);
        int i28 = wVar.getInt("recover_launch_mode", 0);
        long j17 = wVar.getLong("recover_running_time", 0L);
        boolean z19 = wVar.getBoolean("recover_is_discard", false);
        java.lang.String string = wVar.getString("recover_app_ver", "");
        wVar.g("crash_count", i17);
        wVar.putBoolean("launch_recovery", z17);
        wVar.putBoolean("launch_recovery_real", true);
        wVar.putBoolean("recover_from_crash", z18);
        wVar.putInt("recovery_status", i18);
        wVar.putInt("recovery_from", i19);
        wVar.putInt("recover_internal_status", i27);
        wVar.putInt("recover_launch_mode", i28);
        wVar.putLong("recover_running_time", j17);
        wVar.putBoolean("recover_is_discard", z19);
        wVar.putString("recover_app_ver", string);
        wVar.c();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (intent.getBooleanExtra(EXTRA_FOR_TEST, false)) {
            fetchTinkerPatchForTest(intent, iFetchCallback);
        } else {
            fetchTinkerPatch(intent, iFetchCallback);
        }
    }

    private void fetchTinkerPatch(android.content.Intent intent, final com.tencent.recovery.wx.service.WXRecoveryUploadService.IFetchCallback iFetchCallback) {
        d55.u.b(RECOVERY_TAG, "#onHandleIntent, thread = %s, crash count = %s", java.lang.Thread.currentThread().getName(), java.lang.Integer.valueOf(intent.getIntExtra(EXTRA_CRASH_COUNT, -1)));
        m3.a aVar = new m3.a() { // from class: com.tencent.recovery.wx.service.WXRecoveryUploadService$$c
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                com.tencent.recovery.wx.service.WXRecoveryUploadService.this.lambda$fetchTinkerPatch$2(iFetchCallback, (java.lang.Integer) obj);
            }
        };
        try {
            java.lang.String stringExtra = intent.getStringExtra(EXTRA_PATCH_URL);
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                stringExtra = intent.getDataString();
            }
            java.lang.String str = stringExtra;
            if (android.text.TextUtils.isEmpty(str)) {
                d55.u.b(RECOVERY_TAG, "#fetchTinkerPatch, fetch patch url with cgi", new java.lang.Object[0]);
                y45.m.c(getApplicationContext(), aVar, null, intent.getBooleanExtra(EXTRA_USE_HTTPS_ONLY, false), true);
            } else {
                d55.u.b(RECOVERY_TAG, "#fetchTinkerPatch, download patch with given url, url = " + str, new java.lang.Object[0]);
                y45.m.b(getApplicationContext(), str, 0L, null, aVar, true);
            }
        } catch (java.lang.Throwable th6) {
            d55.u.c(RECOVERY_TAG, "fetch error", th6, new java.lang.Object[0]);
            aVar.accept(10);
        }
    }
}
