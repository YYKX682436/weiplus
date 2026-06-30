package zr5;

/* loaded from: classes13.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            try {
                byte[] b17 = bs5.p.b(str);
                javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str2.getBytes(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), "DES");
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DES/ECB/PKCS5Padding");
                cipher.init(2, secretKeySpec);
                byte[] doFinal = cipher.doFinal(b17);
                return doFinal == null ? "" : new java.lang.String(doFinal, java.nio.charset.Charset.forName(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }
}
