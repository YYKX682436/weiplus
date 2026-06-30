package org.chromium.base.compat;

/* loaded from: classes13.dex */
public final class ApiHelperForQ {
    private ApiHelperForQ() {
    }

    public static boolean bindIsolatedService(android.content.Context context, android.content.Intent intent, int i17, java.lang.String str, java.util.concurrent.Executor executor, android.content.ServiceConnection serviceConnection) {
        return context.bindIsolatedService(intent, i17, str, executor, serviceConnection);
    }

    public static int canAuthenticate(android.hardware.biometrics.BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static long copy(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        return android.os.FileUtils.copy(inputStream, outputStream);
    }

    public static android.hardware.biometrics.BiometricManager getBiometricManagerSystemService(android.content.Context context) {
        return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
    }

    public static int getClassification(android.view.MotionEvent motionEvent) {
        return motionEvent.getClassification();
    }

    public static int getCurrentThermalStatus(android.os.PowerManager powerManager) {
        return powerManager.getCurrentThermalStatus();
    }

    public static java.util.Set<java.lang.String> getExternalVolumeNames(android.content.Context context) {
        return android.provider.MediaStore.getExternalVolumeNames(context);
    }

    public static android.net.TransportInfo getTransportInfo(android.net.NetworkCapabilities networkCapabilities) {
        return networkCapabilities.getTransportInfo();
    }

    public static void requestCellInfoUpdate(android.telephony.TelephonyManager telephonyManager, final org.chromium.base.Callback<java.util.List<android.telephony.CellInfo>> callback) {
        telephonyManager.requestCellInfoUpdate(org.chromium.base.task.AsyncTask.THREAD_POOL_EXECUTOR, new android.telephony.TelephonyManager.CellInfoCallback() { // from class: org.chromium.base.compat.ApiHelperForQ.1
            @Override // android.telephony.TelephonyManager.CellInfoCallback
            public void onCellInfo(java.util.List<android.telephony.CellInfo> list) {
                org.chromium.base.Callback.this.lambda$bind$0(list);
            }
        });
    }

    public static android.net.Uri setIncludePending(android.net.Uri uri) {
        return android.provider.MediaStore.setIncludePending(uri);
    }

    public static void startForeground(android.app.Service service, int i17, android.app.Notification notification, int i18) {
        service.startForeground(i17, notification, i18);
    }

    public static void updateServiceGroup(android.content.Context context, android.content.ServiceConnection serviceConnection, int i17, int i18) {
        context.updateServiceGroup(serviceConnection, i17, i18);
    }
}
