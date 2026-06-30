package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareReflectUtil {
    public static void expandFieldArray(java.lang.Object obj, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.reflect.Field findField = findField(obj, str);
        java.lang.Object[] objArr2 = (java.lang.Object[]) findField.get(obj);
        java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        java.lang.System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        java.lang.System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        findField.set(obj, objArr3);
    }

    public static java.lang.reflect.Constructor<?> findConstructor(java.lang.Object obj, java.lang.Class<?>... clsArr) {
        return findConstructor(obj.getClass(), clsArr);
    }

    public static java.lang.reflect.Field findField(java.lang.Object obj, java.lang.String str) {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        throw new java.lang.NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static java.lang.reflect.Method findMethod(java.lang.Object obj, java.lang.String str, java.lang.Class<?>... clsArr) {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        throw new java.lang.NoSuchMethodException("Method " + str + " with parameters " + java.util.Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static java.lang.Object getActivityThread(android.content.Context context, java.lang.Class<?> cls) {
        if (cls == null) {
            try {
                cls = java.lang.Class.forName("android.app.ActivityThread");
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }
        java.lang.reflect.Method method = cls.getMethod("currentActivityThread", new java.lang.Class[0]);
        method.setAccessible(true);
        java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
        if (invoke != null || context == null) {
            return invoke;
        }
        java.lang.reflect.Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        java.lang.Object obj = field.get(context);
        java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static int getValueOfStaticIntField(java.lang.Class<?> cls, java.lang.String str, int i17) {
        try {
            return findField(cls, str).getInt(null);
        } catch (java.lang.Throwable unused) {
            return i17;
        }
    }

    public static void reduceFieldArray(java.lang.Object obj, java.lang.String str, int i17) {
        if (i17 <= 0) {
            return;
        }
        java.lang.reflect.Field findField = findField(obj, str);
        java.lang.Object[] objArr = (java.lang.Object[]) findField.get(obj);
        int length = objArr.length - i17;
        if (length <= 0) {
            return;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), length);
        java.lang.System.arraycopy(objArr, i17, objArr2, 0, length);
        findField.set(obj, objArr2);
    }

    public static java.lang.reflect.Constructor<?> findConstructor(java.lang.Class<?> cls, java.lang.Class<?>... clsArr) {
        for (java.lang.Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                java.lang.reflect.Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(clsArr);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        throw new java.lang.NoSuchMethodException("Constructor with parameters " + java.util.Arrays.asList(clsArr) + " not found in " + cls);
    }

    public static java.lang.reflect.Field findField(java.lang.Class<?> cls, java.lang.String str) {
        for (java.lang.Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        throw new java.lang.NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    public static java.lang.reflect.Method findMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        while (cls != null) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new java.lang.NoSuchMethodException("Method " + str + " with parameters " + java.util.Arrays.asList(clsArr) + " not found in " + cls);
    }
}
