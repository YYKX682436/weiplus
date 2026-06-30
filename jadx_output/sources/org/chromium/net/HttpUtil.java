package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net")
/* loaded from: classes16.dex */
public final class HttpUtil {

    /* loaded from: classes16.dex */
    public interface Natives {
        boolean isAllowedHeader(java.lang.String str, java.lang.String str2);
    }

    public static boolean isAllowedHeader(java.lang.String str, java.lang.String str2) {
        return org.chromium.net.HttpUtilJni.get().isAllowedHeader(str, str2);
    }
}
