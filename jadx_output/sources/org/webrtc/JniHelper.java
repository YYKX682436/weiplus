package org.webrtc;

/* loaded from: classes4.dex */
class JniHelper {
    public static java.lang.Object getKey(java.util.Map.Entry entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(java.lang.String str) {
        try {
            return str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.RuntimeException("ISO-8859-1 is unsupported");
        }
    }

    public static java.lang.Object getStringClass() {
        return java.lang.String.class;
    }

    public static java.lang.Object getValue(java.util.Map.Entry entry) {
        return entry.getValue();
    }
}
