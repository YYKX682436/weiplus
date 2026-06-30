package org.webrtc;

/* loaded from: classes4.dex */
class WebRtcClassLoader {
    public static java.lang.Object getClassLoader() {
        java.lang.ClassLoader classLoader = org.webrtc.WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new java.lang.RuntimeException("Failed to get WebRTC class loader.");
    }
}
