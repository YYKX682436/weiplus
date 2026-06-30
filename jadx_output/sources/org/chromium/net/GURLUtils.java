package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net")
/* loaded from: classes16.dex */
public final class GURLUtils {

    /* loaded from: classes16.dex */
    public interface Natives {
        java.lang.String getOrigin(java.lang.String str);
    }

    public static java.lang.String getOrigin(java.lang.String str) {
        return org.chromium.net.GURLUtilsJni.get().getOrigin(str);
    }
}
