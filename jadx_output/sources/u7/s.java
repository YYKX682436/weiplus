package u7;

/* loaded from: classes13.dex */
public abstract class s {
    public static java.lang.String a(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException("Error decoding url", e17);
        }
    }
}
