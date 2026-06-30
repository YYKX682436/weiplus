package com.tencent.youtu.ytcommon.auth;

/* loaded from: classes12.dex */
public class StatisticsUtils {
    private StatisticsUtils() {
    }

    private static java.lang.String encryptUid(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            sb6.append(charAt + (charAt % length));
        }
        sb6.reverse();
        return sb6.toString();
    }

    private static char getChar(byte b17, int i17) {
        return (char) (b17 - getOffset(i17 & 1));
    }

    public static java.lang.String getDeviceUid(android.content.Context context) {
        if (context.getPackageName().startsWith("com.tencent")) {
            return "com.tencent";
        }
        java.lang.String imei = getIMEI(context.getApplicationContext());
        java.lang.String macAddr = getMacAddr(context.getApplicationContext());
        boolean z17 = !android.text.TextUtils.isEmpty(macAddr);
        if (z17) {
            macAddr = macAddr.replaceAll(":", "");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(imei);
        sb6.append(z17 ? macAddr : "");
        return toMD5(encryptUid(sb6.toString()));
    }

    public static java.lang.String getIMEI(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        return (!android.text.TextUtils.isEmpty(string) || (telephonyManager = (android.telephony.TelephonyManager) context.getApplicationContext().getSystemService("phone")) == null) ? string : telephonyManager.getDeviceId();
    }

    public static java.lang.String getMacAddr(android.content.Context context) {
        android.net.wifi.WifiManager wifiManager;
        android.net.wifi.WifiInfo connectionInfo;
        if (context == null || (wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi")) == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return connectionInfo.getMacAddress();
    }

    private static byte getOffset(int i17) {
        return (byte) (i17 == 0 ? 65 : 97);
    }

    public static java.lang.String toMD5(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            java.lang.String bigInteger = new java.math.BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
