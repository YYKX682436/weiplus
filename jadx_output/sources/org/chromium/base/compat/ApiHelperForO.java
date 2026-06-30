package org.chromium.base.compat;

/* loaded from: classes13.dex */
public final class ApiHelperForO {
    private ApiHelperForO() {
    }

    public static void addItem(android.content.ClipData clipData, android.content.ContentResolver contentResolver, android.content.ClipData.Item item) {
        clipData.addItem(contentResolver, item);
    }

    public static boolean areAnimatorsEnabled() {
        return android.animation.ValueAnimator.areAnimatorsEnabled();
    }

    public static void cancelAutofillSession(android.app.Activity activity) {
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) activity.getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager != null) {
            autofillManager.cancel();
        }
    }

    public static android.content.Context createContextForSplit(android.content.Context context, java.lang.String str) {
        org.chromium.base.StrictModeContext allowDiskReads = org.chromium.base.StrictModeContext.allowDiskReads();
        try {
            android.content.Context createContextForSplit = context.createContextForSplit(str);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return createContextForSplit;
        } catch (java.lang.Throwable th6) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static java.lang.String getNotificationChannelId(android.app.Notification notification) {
        return notification.getChannelId();
    }

    public static long getTimestamp(android.content.ClipDescription clipDescription) {
        return clipDescription.getTimestamp();
    }

    public static boolean isInstantApp(android.content.pm.PackageManager packageManager) {
        return packageManager.isInstantApp();
    }

    public static boolean isScreenWideColorGamut(android.content.res.Configuration configuration) {
        return configuration.isScreenWideColorGamut();
    }

    public static boolean isWideColorGamut(android.view.Display display) {
        return display.isWideColorGamut();
    }

    public static void notifyValueChangedForAutofill(android.view.View view) {
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager != null) {
            autofillManager.notifyValueChanged(view);
        }
    }

    public static void registerDefaultNetworkCallback(android.net.ConnectivityManager connectivityManager, android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
    }

    public static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i17);
    }

    public static android.app.Notification.Builder setChannelId(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.setChannelId(str);
    }

    public static void setColorMode(android.view.Window window, int i17) {
        window.setColorMode(i17);
    }

    public static void setDefaultFocusHighlightEnabled(android.view.View view, boolean z17) {
        view.setDefaultFocusHighlightEnabled(z17);
    }

    public static android.app.Notification.Builder setTimeoutAfter(android.app.Notification.Builder builder, long j17) {
        return builder.setTimeoutAfter(j17);
    }
}
