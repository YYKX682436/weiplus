package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPPrimaryReflectUtil {
    public static final java.lang.String TAG = "TPPrimaryReflectUtil";
    private static java.lang.reflect.Method sForNameMethod;
    private static java.lang.reflect.Method sGetDeclaredMethod;
    private static java.lang.reflect.Method sGetFieldMethod;

    static {
        try {
            sForNameMethod = java.lang.Class.class.getDeclaredMethod("forName", java.lang.String.class);
            sGetDeclaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
            sGetFieldMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6.getMessage());
        }
    }

    private static boolean canReflection() {
        return (sForNameMethod == null || sGetDeclaredMethod == null || sGetFieldMethod == null) ? false : true;
    }

    private static java.lang.reflect.Method getMethod(java.lang.String str, java.lang.String str2, java.lang.Class[] clsArr) {
        java.lang.reflect.Method method = null;
        if (!canReflection()) {
            return null;
        }
        try {
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) sGetDeclaredMethod.invoke((java.lang.Class) sForNameMethod.invoke(null, str), str2, clsArr);
            try {
                method2.setAccessible(true);
                return method2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                method = method2;
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th.getMessage());
                return method;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static java.lang.Object invokeMethod(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method method = getMethod(str, str2, clsArr);
            if (method != null) {
                return method.invoke(obj, objArr);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6.getMessage());
            return null;
        }
    }
}
