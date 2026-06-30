package dw3;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.c f244181a = new dw3.c();

    public final java.lang.String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bArr.length);
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            kotlin.jvm.internal.o.f(hexString, "toHexString(...)");
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            java.lang.String upperCase = hexString.toUpperCase();
            kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
            stringBuffer.append(upperCase);
        }
        return stringBuffer.toString();
    }

    public final boolean b(android.content.Context context, java.lang.String packageName, java.lang.String publicKey) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(packageName, "packageName");
        kotlin.jvm.internal.o.g(publicKey, "publicKey");
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            if (packageInfo == null) {
                return false;
            }
            android.content.pm.Signature[] signatureArr = packageInfo.signatures;
            kotlin.jvm.internal.o.d(signatureArr);
            byte[] byteArray = signatureArr[0].toByteArray();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            kotlin.jvm.internal.o.d(messageDigest);
            messageDigest.update(byteArray);
            return com.tencent.mm.sdk.platformtools.t8.D0(a(messageDigest.digest()), publicKey);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CheckDownloadUtil", "checkInstalled " + packageName + " Exception: %s", e17.getMessage());
            return false;
        }
    }
}
