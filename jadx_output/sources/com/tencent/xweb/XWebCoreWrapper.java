package com.tencent.xweb;

/* loaded from: classes13.dex */
public class XWebCoreWrapper implements tx5.h {
    public static final java.lang.String TAG = "XWebCoreWrapper";

    public java.lang.Class<?> getBridgeClass(java.lang.String str) {
        try {
            java.lang.ClassLoader webViewCoreClassLoader = getWebViewCoreClassLoader();
            if (webViewCoreClassLoader == null) {
                return null;
            }
            return webViewCoreClassLoader.loadClass(getBridgePackageName() + "." + str);
        } catch (java.lang.Throwable th6) {
            by5.c4.g(TAG, "getBridgeClass failed, class:" + str + ", error:" + th6);
            return null;
        }
    }

    public java.lang.Object getBridgeObject(java.lang.Object obj) {
        try {
            return new by5.i0(obj, "getBridge", new java.lang.Class[0]).b(new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            by5.c4.g(TAG, "getBridgeObject failed, object:" + obj + ", error:" + th6);
            return null;
        }
    }

    public java.lang.String getBridgePackageName() {
        return null;
    }

    public java.lang.Class<?> getClass(java.lang.String str) {
        try {
            java.lang.ClassLoader webViewCoreClassLoader = getWebViewCoreClassLoader();
            if (webViewCoreClassLoader != null) {
                return webViewCoreClassLoader.loadClass(str);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            by5.c4.g(TAG, "getClass failed, class:" + str + ", error:" + th6);
            return null;
        }
    }

    public java.lang.ClassLoader getWebViewCoreClassLoader() {
        return null;
    }

    @Override // tx5.h
    public boolean hasFeature(int i17) {
        return false;
    }

    @Override // tx5.h
    public boolean invokeNativeChannel(int i17, java.lang.Object[] objArr) {
        return false;
    }

    @Override // tx5.h
    public java.lang.Object invokeRuntimeChannel(int i17, java.lang.Object[] objArr) {
        return null;
    }
}
