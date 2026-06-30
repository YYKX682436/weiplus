package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes12.dex */
public class PowerMonitor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static org.chromium.base.PowerMonitor sInstance;
    private boolean mIsBatteryPower;

    /* loaded from: classes12.dex */
    public interface Natives {
        void onBatteryChargingChanged();

        void onThermalStatusChanged(int i17);
    }

    private PowerMonitor() {
    }

    public static void create() {
        android.os.PowerManager powerManager;
        org.chromium.base.ThreadUtils.assertOnUiThread();
        if (sInstance != null) {
            return;
        }
        android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
        sInstance = new org.chromium.base.PowerMonitor();
        android.content.Intent registerProtectedBroadcastReceiver = org.chromium.base.ContextUtils.registerProtectedBroadcastReceiver(applicationContext, null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerProtectedBroadcastReceiver != null) {
            onBatteryChargingChanged(registerProtectedBroadcastReceiver.getIntExtra("plugged", 0) == 0);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        org.chromium.base.ContextUtils.registerProtectedBroadcastReceiver(applicationContext, new android.content.BroadcastReceiver() { // from class: org.chromium.base.PowerMonitor.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                org.chromium.base.PowerMonitor.onBatteryChargingChanged(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
            }
        }, intentFilter);
        if (android.os.Build.VERSION.SDK_INT < 29 || (powerManager = (android.os.PowerManager) applicationContext.getSystemService("power")) == null) {
            return;
        }
        org.chromium.base.PowerMonitorForQ.addThermalStatusListener(powerManager);
    }

    public static void createForTests() {
        sInstance = new org.chromium.base.PowerMonitor();
    }

    private static int getCurrentThermalStatus() {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        if (sInstance == null) {
            create();
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return org.chromium.base.compat.ApiHelperForQ.getCurrentThermalStatus(powerManager);
    }

    private static int getRemainingBatteryCapacity() {
        if (sInstance == null) {
            create();
        }
        return getRemainingBatteryCapacityImpl();
    }

    private static int getRemainingBatteryCapacityImpl() {
        return ((android.os.BatteryManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("batterymanager")).getIntProperty(1);
    }

    private static boolean isBatteryPower() {
        if (sInstance == null) {
            create();
        }
        return sInstance.mIsBatteryPower;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onBatteryChargingChanged(boolean z17) {
        sInstance.mIsBatteryPower = z17;
        org.chromium.base.PowerMonitorJni.get().onBatteryChargingChanged();
    }
}
