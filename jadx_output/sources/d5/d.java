package d5;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f226475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f226476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.BroadcastReceiver.PendingResult f226477f;

    public d(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, android.content.Intent intent, android.content.Context context, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.f226475d = intent;
        this.f226476e = context;
        this.f226477f = pendingResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.BroadcastReceiver.PendingResult pendingResult = this.f226477f;
        android.content.Context context = this.f226476e;
        android.content.Intent intent = this.f226475d;
        try {
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            a5.a0.c().a(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.f12482a, java.lang.String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(booleanExtra3), java.lang.Boolean.valueOf(booleanExtra4)), new java.lang.Throwable[0]);
            k5.h.a(context, androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            k5.h.a(context, androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            k5.h.a(context, androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            k5.h.a(context, androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            pendingResult.finish();
        }
    }
}
