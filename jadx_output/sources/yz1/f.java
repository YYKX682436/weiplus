package yz1;

/* loaded from: classes15.dex */
public abstract class f {
    public static yz1.f a(java.lang.String str, java.lang.String str2) {
        try {
            return new yz1.e(str2, str.getBytes(com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
