package ov5;

/* loaded from: classes12.dex */
public abstract class c {
    public static boolean a(com.tencent.tinker.entry.ApplicationLike applicationLike, java.lang.String str) {
        if (applicationLike == null || applicationLike.getApplication() == null) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("tinkerApplication is null");
        }
        android.content.Intent tinkerResultIntent = applicationLike.getTinkerResultIntent();
        if (!(tinkerResultIntent != null && com.tencent.tinker.loader.shareutil.ShareIntentUtil.getIntentReturnCode(tinkerResultIntent) == 0)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "no loaded patch, skip installation.", new java.lang.Object[0]);
            return false;
        }
        java.lang.String a17 = tv5.c.a(applicationLike);
        if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNullOrNil(a17)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "failed to get current patch version.", new java.lang.Object[0]);
            return false;
        }
        java.io.File patchDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(applicationLike.getApplication());
        if (patchDirectory == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "failed to get current patch directory.", new java.lang.Object[0]);
            return false;
        }
        java.io.File file = new java.io.File(new java.io.File(patchDirectory.getAbsolutePath() + "/" + com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(a17)).getAbsolutePath() + "/lib/lib/" + str);
        if (!file.exists()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "tinker lib path [%s] is not exists.", file);
            return false;
        }
        java.lang.ClassLoader classLoader = applicationLike.getApplication().getClassLoader();
        if (classLoader == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "classloader is null", new java.lang.Object[0]);
            return false;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.LoadLibrary", "before hack classloader:" + classLoader.toString(), new java.lang.Object[0]);
        try {
            java.lang.reflect.Method declaredMethod = ov5.c.class.getDeclaredMethod("b", java.lang.ClassLoader.class, java.io.File.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, classLoader, file);
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file + ", thr: " + th6, new java.lang.Object[0]);
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new java.lang.Object[0]);
                return false;
            } catch (java.lang.Throwable th7) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new java.lang.Object[0]);
                throw th7;
            }
        }
    }

    public static void b(java.lang.ClassLoader classLoader, java.io.File file) {
        if (file == null || !file.exists()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "installNativeLibraryPath, folder %s is illegal", file);
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if ((i17 == 25 && android.os.Build.VERSION.PREVIEW_SDK_INT != 0) || i17 > 25) {
            try {
                ov5.b.a(classLoader, file);
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), th6.getMessage());
                ov5.a.a(classLoader, file);
                return;
            }
        }
        try {
            ov5.a.a(classLoader, file);
        } catch (java.lang.Throwable th7) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.LoadLibrary", "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), th7.getMessage());
            java.lang.Object obj = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(classLoader, "pathList").get(classLoader);
            java.lang.reflect.Field findField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj, "nativeLibraryDirectories");
            java.io.File[] fileArr = (java.io.File[]) findField.get(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList(fileArr.length + 1);
            arrayList.add(file);
            for (java.io.File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            findField.set(obj, arrayList.toArray(new java.io.File[0]));
        }
    }
}
