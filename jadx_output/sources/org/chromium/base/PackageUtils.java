package org.chromium.base;

/* loaded from: classes13.dex */
public class PackageUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char[] HEX_CHAR_LOOKUP = "0123456789ABCDEF".toCharArray();
    private static final java.lang.String TAG = "PackageUtils";

    private PackageUtils() {
    }

    public static java.lang.String byteArrayToHexString(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((bArr.length * 3) - 1);
        for (int i17 = 0; i17 < bArr.length; i17++) {
            char[] cArr = HEX_CHAR_LOOKUP;
            sb6.append(cArr[(bArr[i17] & 240) >>> 4]);
            sb6.append(cArr[bArr[i17] & 15]);
            if (i17 < bArr.length - 1) {
                sb6.append(':');
            }
        }
        return sb6.toString();
    }

    public static android.content.pm.PackageInfo getApplicationPackageInfo(int i17) {
        return getPackageInfo(org.chromium.base.BuildInfo.getInstance().packageName, i17);
    }

    public static java.util.List<java.lang.String> getCertificateSHA256FingerprintForPackage(java.lang.String str) {
        android.content.pm.PackageInfo packageInfo = getPackageInfo(str, 64);
        if (packageInfo == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(packageInfo.signatures.length);
        for (android.content.pm.Signature signature : packageInfo.signatures) {
            try {
                arrayList.add(byteArrayToHexString(java.security.MessageDigest.getInstance("SHA256").digest(((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X509").generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray()))).getEncoded())));
            } catch (java.security.NoSuchAlgorithmException | java.security.cert.CertificateException e17) {
                org.chromium.base.Log.w(TAG, "Exception", e17);
                return null;
            }
        }
        return arrayList;
    }

    public static android.content.pm.PackageInfo getPackageInfo(java.lang.String str, int i17) {
        try {
            return org.chromium.base.ContextUtils.getApplicationContext().getPackageManager().getPackageInfo(str, i17);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int getPackageVersion(java.lang.String str) {
        android.content.pm.PackageInfo packageInfo = getPackageInfo(str, 0);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return -1;
    }

    public static boolean isPackageInstalled(java.lang.String str) {
        return getPackageInfo(str, 0) != null;
    }

    public static int getPackageVersion(android.content.Context context, java.lang.String str) {
        return getPackageVersion(str);
    }
}
