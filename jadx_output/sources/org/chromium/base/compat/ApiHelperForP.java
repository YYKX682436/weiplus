package org.chromium.base.compat;

/* loaded from: classes13.dex */
public final class ApiHelperForP {
    private ApiHelperForP() {
    }

    public static android.view.textclassifier.TextSelection.Request build(android.view.textclassifier.TextSelection.Request.Builder builder) {
        return builder.build();
    }

    public static void clearPrimaryClip(android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static long getLongVersionCode(android.content.pm.PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static java.lang.String getPrivateDnsServerName(android.net.LinkProperties linkProperties) {
        return linkProperties.getPrivateDnsServerName();
    }

    public static android.telephony.SignalStrength getSignalStrength(android.telephony.TelephonyManager telephonyManager) {
        return telephonyManager.getSignalStrength();
    }

    public static boolean hasSigningCertificate(android.content.pm.PackageManager packageManager, java.lang.String str, byte[] bArr, int i17) {
        return packageManager.hasSigningCertificate(str, bArr, i17);
    }

    public static boolean isLocationEnabled(android.location.LocationManager locationManager) {
        return locationManager.isLocationEnabled();
    }

    public static boolean isPrivateDnsActive(android.net.LinkProperties linkProperties) {
        return linkProperties.isPrivateDnsActive();
    }

    public static android.view.textclassifier.TextSelection.Request.Builder newTextSelectionRequestBuilder(java.lang.CharSequence charSequence, int i17, int i18) {
        return new android.view.textclassifier.TextSelection.Request.Builder(charSequence, i17, i18);
    }

    public static android.view.textclassifier.TextSelection.Request.Builder setDefaultLocales(android.view.textclassifier.TextSelection.Request.Builder builder, android.os.LocaleList localeList) {
        return builder.setDefaultLocales(localeList);
    }

    public static android.view.textclassifier.TextSelection suggestSelection(android.view.textclassifier.TextClassifier textClassifier, android.view.textclassifier.TextSelection.Request request) {
        return textClassifier.suggestSelection(request);
    }
}
