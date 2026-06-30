package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
final class NewClassLoaderInjector {
    private NewClassLoaderInjector() {
        throw new java.lang.UnsupportedOperationException();
    }

    private static java.lang.ClassLoader createNewClassLoader(java.lang.ClassLoader classLoader, java.io.File file, boolean z17, boolean z18, java.lang.String... strArr) {
        java.lang.ClassLoader tinkerClassLoader;
        java.lang.Object obj = findField(java.lang.Class.forName("dalvik.system.BaseDexClassLoader", false, classLoader), "pathList").get(classLoader);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (strArr != null && strArr.length > 0) {
            for (int i17 = 0; i17 < strArr.length; i17++) {
                if (i17 > 0) {
                    sb6.append(java.io.File.pathSeparator);
                }
                sb6.append(strArr[i17]);
            }
        }
        java.lang.String sb7 = sb6.toString();
        java.lang.reflect.Field findField = findField(obj.getClass(), "nativeLibraryDirectories");
        java.util.List<java.io.File> asList = findField.getType().isArray() ? java.util.Arrays.asList((java.io.File[]) findField.get(obj)) : (java.util.List) findField.get(obj);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        boolean z19 = true;
        for (java.io.File file2 : asList) {
            if (file2 != null) {
                if (z19) {
                    z19 = false;
                } else {
                    sb8.append(java.io.File.pathSeparator);
                }
                sb8.append(file2.getAbsolutePath());
            }
        }
        java.lang.String sb9 = sb8.toString();
        if (!z17 || !com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(27, true)) {
            tinkerClassLoader = new com.tencent.tinker.loader.TinkerClassLoader(sb7, file, sb9, classLoader);
        } else if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(31, true)) {
            tinkerClassLoader = new dalvik.system.DelegateLastClassLoader(sb7, sb9, classLoader);
        } else {
            tinkerClassLoader = new dalvik.system.DelegateLastClassLoader(sb7, sb9, java.lang.ClassLoader.getSystemClassLoader());
            java.lang.reflect.Field declaredField = java.lang.ClassLoader.class.getDeclaredField("parent");
            declaredField.setAccessible(true);
            declaredField.set(tinkerClassLoader, classLoader);
        }
        if (z18 && !com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNewerOrEqualThanVersion(26, true)) {
            findField(obj.getClass(), "definingContext").set(obj, tinkerClassLoader);
        }
        return tinkerClassLoader;
    }

    private static void doInject(android.app.Application application, java.lang.ClassLoader classLoader) {
        java.lang.Thread.currentThread().setContextClassLoader(classLoader);
        android.content.Context context = (android.content.Context) findField(application.getClass(), "mBase").get(application);
        try {
            findField(context.getClass(), "mClassLoader").set(context, classLoader);
        } catch (java.lang.Throwable unused) {
        }
        java.lang.Object obj = findField(context.getClass(), "mPackageInfo").get(context);
        findField(obj.getClass(), "mClassLoader").set(obj, classLoader);
        android.content.res.Resources resources = application.getResources();
        try {
            findField(resources.getClass(), "mClassLoader").set(resources, classLoader);
        } catch (java.lang.Throwable unused2) {
        }
        try {
            java.lang.Object obj2 = findField(resources.getClass(), "mDrawableInflater").get(resources);
            if (obj2 != null) {
                findField(obj2.getClass(), "mClassLoader").set(obj2, classLoader);
            }
        } catch (java.lang.Throwable unused3) {
        }
    }

    private static java.lang.reflect.Field findField(java.lang.Class<?> cls, java.lang.String str) {
        java.lang.Class<?> cls2 = cls;
        while (true) {
            try {
                java.lang.reflect.Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (java.lang.Throwable unused) {
                if (cls2 == java.lang.Object.class) {
                    throw new java.lang.NoSuchFieldException("Cannot find field " + str + " in class " + cls.getName() + " and its super classes.");
                }
                cls2 = cls2.getSuperclass();
            }
        }
    }

    public static java.lang.ClassLoader inject(android.app.Application application, java.lang.ClassLoader classLoader, java.io.File file, boolean z17, java.util.List<java.io.File> list) {
        int size = list.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = list.get(i17).getAbsolutePath();
        }
        java.lang.ClassLoader createNewClassLoader = createNewClassLoader(classLoader, file, z17, true, strArr);
        doInject(application, createNewClassLoader);
        return createNewClassLoader;
    }

    public static java.lang.ClassLoader triggerDex2Oat(android.content.Context context, java.io.File file, boolean z17, java.lang.String... strArr) {
        return createNewClassLoader(context.getClassLoader(), file, z17, false, strArr);
    }
}
