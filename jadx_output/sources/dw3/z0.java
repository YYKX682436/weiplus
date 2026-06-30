package dw3;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.z0 f244296a = new dw3.z0();

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

    public final boolean b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.weishi", 64);
            if (packageInfo == null) {
                return false;
            }
            android.content.pm.Signature[] signatureArr = packageInfo.signatures;
            kotlin.jvm.internal.o.d(signatureArr);
            byte[] byteArray = signatureArr[0].toByteArray();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            kotlin.jvm.internal.o.d(messageDigest);
            messageDigest.update(byteArray);
            return com.tencent.mm.sdk.platformtools.t8.D0(a(messageDigest.digest()), "2A281593D71DF33374E6124E9106DF08");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeSeeUtil", "checkWeishiInstalled Exception: %s", e17.getMessage());
            return false;
        }
    }
}
