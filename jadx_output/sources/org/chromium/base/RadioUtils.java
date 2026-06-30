package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes13.dex */
public class RadioUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static java.lang.Boolean sHaveAccessNetworkState;
    private static java.lang.Boolean sHaveAccessWifiState;

    private RadioUtils() {
    }

    private static int getCellDataActivity() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((android.telephony.TelephonyManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("phone")).getDataActivity();
                if (scoped != null) {
                    scoped.close();
                }
                return dataActivity;
            } catch (java.lang.SecurityException unused) {
                if (scoped == null) {
                    return -1;
                }
                scoped.close();
                return -1;
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

    private static int getCellSignalLevel() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("RadioUtils::getCellSignalLevel");
        try {
            int i17 = -1;
            try {
                android.telephony.SignalStrength signalStrength = org.chromium.base.compat.ApiHelperForP.getSignalStrength((android.telephony.TelephonyManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("phone"));
                if (signalStrength != null) {
                    i17 = signalStrength.getLevel();
                }
            } catch (java.lang.SecurityException unused) {
            }
            if (scoped != null) {
                scoped.close();
            }
            return i17;
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

    private static boolean haveAccessNetworkState() {
        if (sHaveAccessNetworkState == null) {
            sHaveAccessNetworkState = java.lang.Boolean.valueOf(org.chromium.base.ApiCompatibilityUtils.checkPermission(org.chromium.base.ContextUtils.getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0);
        }
        return sHaveAccessNetworkState.booleanValue();
    }

    private static boolean haveAccessWifiState() {
        if (sHaveAccessWifiState == null) {
            sHaveAccessWifiState = java.lang.Boolean.valueOf(org.chromium.base.ApiCompatibilityUtils.checkPermission(org.chromium.base.ContextUtils.getApplicationContext(), "android.permission.ACCESS_WIFI_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0);
        }
        return sHaveAccessWifiState.booleanValue();
    }

    private static boolean isSupported() {
        return android.os.Build.VERSION.SDK_INT >= 28 && haveAccessNetworkState() && haveAccessWifiState();
    }

    private static boolean isWifiConnected() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("RadioUtils::isWifiConnected");
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("connectivity");
            android.net.Network activeNetwork = org.chromium.base.compat.ApiHelperForM.getActiveNetwork(connectivityManager);
            if (activeNetwork == null) {
                if (scoped != null) {
                    scoped.close();
                }
                return false;
            }
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (scoped != null) {
                    scoped.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (scoped != null) {
                scoped.close();
            }
            return hasTransport;
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
