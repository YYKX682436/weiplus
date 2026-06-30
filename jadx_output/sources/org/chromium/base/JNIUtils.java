package org.chromium.base;

@org.chromium.build.annotations.MainDex
/* loaded from: classes7.dex */
public class JNIUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "JNIUtils";
    private static java.lang.ClassLoader sJniClassLoader;

    private static java.lang.ClassLoader getSplitClassLoader(java.lang.String str) {
        if (!str.isEmpty()) {
            boolean isIsolatedSplitInstalled = org.chromium.base.BundleUtils.isIsolatedSplitInstalled(str);
            org.chromium.base.Log.i(TAG, "Init JNI Classloader for %s. isInstalled=%b", str, java.lang.Boolean.valueOf(isIsolatedSplitInstalled));
            if (isIsolatedSplitInstalled) {
                return org.chromium.base.BundleUtils.getOrCreateSplitClassLoader(str);
            }
        }
        java.lang.ClassLoader classLoader = sJniClassLoader;
        return classLoader != null ? classLoader : org.chromium.base.JNIUtils.class.getClassLoader();
    }

    public static void setClassLoader(java.lang.ClassLoader classLoader) {
        sJniClassLoader = classLoader;
    }

    public static <K, V> void splitMap(java.util.Map<K, V> map, K[] kArr, V[] vArr) {
        int i17 = 0;
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            kArr[i17] = entry.getKey();
            vArr[i17] = entry.getValue();
            i17++;
        }
    }
}
