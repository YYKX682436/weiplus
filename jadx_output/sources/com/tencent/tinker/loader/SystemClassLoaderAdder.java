package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public class SystemClassLoaderAdder {
    public static final java.lang.String CHECK_DEX_CLASS = "com.tencent.tinker.loader.TinkerTestDexLoad";
    public static final java.lang.String CHECK_DEX_FIELD = "isPatch";
    private static final java.lang.String TAG = "Tinker.ClassLoaderAdder";
    private static int sPatchDexCount;

    /* loaded from: classes13.dex */
    public static final class ArkHot {
        private ArkHot() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void install(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list) {
            java.lang.Class<?> loadClass = java.lang.ClassLoader.getSystemClassLoader().getParent().loadClass("com.huawei.ark.classloader.ExtendedClassLoaderHelper");
            java.util.Iterator<java.io.File> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String canonicalPath = it.next().getCanonicalPath();
                java.lang.reflect.Method declaredMethod = loadClass.getDeclaredMethod("applyPatch", java.lang.ClassLoader.class, java.lang.String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, classLoader, canonicalPath);
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "ArkHot install path = " + canonicalPath, new java.lang.Object[0]);
            }
        }
    }

    /* loaded from: classes13.dex */
    public static final class V14 {
        private V14() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void install(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
            java.lang.Object obj = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(classLoader, "pathList").get(classLoader);
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.expandFieldArray(obj, "dexElements", makeDexElements(obj, new java.util.ArrayList(list), file));
        }

        private static java.lang.Object[] makeDexElements(java.lang.Object obj, java.util.ArrayList<java.io.File> arrayList, java.io.File file) {
            return (java.lang.Object[]) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(obj, "makeDexElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.ArrayList.class, java.io.File.class}).invoke(obj, arrayList, file);
        }
    }

    /* loaded from: classes13.dex */
    public static final class V19 {
        private V19() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void install(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
            java.lang.Object obj = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(classLoader, "pathList").get(classLoader);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.expandFieldArray(obj, "dexElements", makeDexElements(obj, new java.util.ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    java.io.IOException iOException = (java.io.IOException) it.next();
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "Exception in makeDexElement", iOException);
                    throw iOException;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.Object[] makeDexElements(java.lang.Object obj, java.util.ArrayList<java.io.File> arrayList, java.io.File file, java.util.ArrayList<java.io.IOException> arrayList2) {
            java.lang.reflect.Method findMethod;
            try {
                findMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(obj, "makeDexElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.ArrayList.class, java.io.File.class, java.util.ArrayList.class});
            } catch (java.lang.NoSuchMethodException unused) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure", new java.lang.Object[0]);
                try {
                    findMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(obj, "makeDexElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.List.class, java.io.File.class, java.util.List.class});
                } catch (java.lang.NoSuchMethodException e17) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "NoSuchMethodException: makeDexElements(List,File,List) failure", new java.lang.Object[0]);
                    throw e17;
                }
            }
            return (java.lang.Object[]) findMethod.invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* loaded from: classes13.dex */
    public static final class V23 {
        private V23() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void install(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
            java.lang.Object obj = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(classLoader, "pathList").get(classLoader);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.expandFieldArray(obj, "dexElements", makePathElements(obj, new java.util.ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    java.io.IOException iOException = (java.io.IOException) it.next();
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "Exception in makePathElement", iOException);
                    throw iOException;
                }
            }
        }

        private static java.lang.Object[] makePathElements(java.lang.Object obj, java.util.ArrayList<java.io.File> arrayList, java.io.File file, java.util.ArrayList<java.io.IOException> arrayList2) {
            java.lang.reflect.Method findMethod;
            try {
                findMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(obj, "makePathElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.List.class, java.io.File.class, java.util.List.class});
            } catch (java.lang.NoSuchMethodException unused) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "NoSuchMethodException: makePathElements(List,File,List) failure", new java.lang.Object[0]);
                try {
                    findMethod = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(obj, "makePathElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.ArrayList.class, java.io.File.class, java.util.ArrayList.class});
                } catch (java.lang.NoSuchMethodException unused2) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure", new java.lang.Object[0]);
                    try {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "NoSuchMethodException: try use v19 instead", new java.lang.Object[0]);
                        return com.tencent.tinker.loader.SystemClassLoaderAdder.V19.makeDexElements(obj, arrayList, file, arrayList2);
                    } catch (java.lang.NoSuchMethodException e17) {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(com.tencent.tinker.loader.SystemClassLoaderAdder.TAG, "NoSuchMethodException: makeDexElements(List,File,List) failure", new java.lang.Object[0]);
                        throw e17;
                    }
                }
            }
            return (java.lang.Object[]) findMethod.invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* loaded from: classes13.dex */
    public static final class V4 {
        private V4() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void install(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
            int size = list.size();
            java.lang.reflect.Field findField = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(classLoader, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder((java.lang.String) findField.get(classLoader));
            java.lang.String[] strArr = new java.lang.String[size];
            java.io.File[] fileArr = new java.io.File[size];
            java.util.zip.ZipFile[] zipFileArr = new java.util.zip.ZipFile[size];
            dalvik.system.DexFile[] dexFileArr = new dalvik.system.DexFile[size];
            java.util.ListIterator<java.io.File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                java.io.File next = listIterator.next();
                java.lang.String absolutePath = next.getAbsolutePath();
                sb6.append(':');
                sb6.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new java.util.zip.ZipFile(next);
                dexFileArr[previousIndex] = dalvik.system.DexFile.loadDex(absolutePath, com.tencent.tinker.loader.shareutil.SharePatchFileUtil.optimizedPathFor(next, file), 0);
            }
            findField.set(classLoader, sb6.toString());
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.expandFieldArray(classLoader, "mPaths", strArr);
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.expandFieldArray(classLoader, "mFiles", fileArr);
            com.tencent.tinker.loader.shareutil.ShareReflectUtil.expandFieldArray(classLoader, "mZips", zipFileArr);
            try {
                com.tencent.tinker.loader.shareutil.ShareReflectUtil.expandFieldArray(classLoader, "mDexs", dexFileArr);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private static boolean checkDexInstall(java.lang.ClassLoader classLoader) {
        java.lang.Class<?> cls = java.lang.Class.forName(CHECK_DEX_CLASS, true, classLoader);
        boolean booleanValue = ((java.lang.Boolean) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls, CHECK_DEX_FIELD).get(null)).booleanValue();
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "checkDexInstall result: %s, checker_classloader: %s", java.lang.Boolean.valueOf(booleanValue), cls.getClassLoader());
        return booleanValue;
    }

    private static java.util.List<java.io.File> createSortedAdditionalPathEntries(java.util.List<java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        final java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String name = ((java.io.File) it.next()).getName();
            hashMap.put(name, java.lang.Boolean.valueOf(com.tencent.tinker.loader.shareutil.ShareConstants.CLASS_N_PATTERN.matcher(name).matches()));
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator<java.io.File>() { // from class: com.tencent.tinker.loader.SystemClassLoaderAdder.1
            @Override // java.util.Comparator
            public int compare(java.io.File file, java.io.File file2) {
                if (file == null && file2 == null) {
                    return 0;
                }
                if (file == null) {
                    return -1;
                }
                if (file2 == null) {
                    return 1;
                }
                java.lang.String name2 = file.getName();
                java.lang.String name3 = file2.getName();
                if (name2.equals(name3)) {
                    return 0;
                }
                if (name2.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.TEST_DEX_NAME)) {
                    return 1;
                }
                if (name3.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.TEST_DEX_NAME)) {
                    return -1;
                }
                boolean booleanValue = ((java.lang.Boolean) hashMap.get(name2)).booleanValue();
                boolean booleanValue2 = ((java.lang.Boolean) hashMap.get(name3)).booleanValue();
                if (!booleanValue || !booleanValue2) {
                    if (booleanValue) {
                        return -1;
                    }
                    if (booleanValue2) {
                        return 1;
                    }
                    return name2.compareTo(name3);
                }
                int indexOf = name2.indexOf(46);
                int indexOf2 = name3.indexOf(46);
                int parseInt = indexOf > 7 ? java.lang.Integer.parseInt(name2.substring(7, indexOf)) : 1;
                int parseInt2 = indexOf2 > 7 ? java.lang.Integer.parseInt(name3.substring(7, indexOf2)) : 1;
                if (parseInt == parseInt2) {
                    return 0;
                }
                return parseInt < parseInt2 ? -1 : 1;
            }
        });
        return arrayList;
    }

    public static void injectDexesInternal(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
        com.tencent.tinker.loader.SystemClassLoaderAdder.V23.install(classLoader, list, file);
    }

    public static void installApk(dalvik.system.PathClassLoader pathClassLoader, java.util.List<java.io.File> list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.List<java.io.File> createSortedAdditionalPathEntries = createSortedAdditionalPathEntries(list);
        com.tencent.tinker.loader.SystemClassLoaderAdder.ArkHot.install(pathClassLoader, createSortedAdditionalPathEntries);
        sPatchDexCount = createSortedAdditionalPathEntries.size();
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "after loaded classloader: " + pathClassLoader + ", dex size:" + sPatchDexCount, new java.lang.Object[0]);
        checkDexInstall(pathClassLoader);
    }

    public static void installDexes(android.app.Application application, java.lang.ClassLoader classLoader, java.io.File file, java.util.List<java.io.File> list, boolean z17, boolean z18) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "installDexes dexOptDir: " + file.getAbsolutePath() + ", dex size:" + list.size(), new java.lang.Object[0]);
        if (list.isEmpty()) {
            return;
        }
        java.util.List<java.io.File> createSortedAdditionalPathEntries = createSortedAdditionalPathEntries(list);
        if (z17) {
            injectDexesInternal(classLoader, createSortedAdditionalPathEntries, file);
        } else {
            classLoader = com.tencent.tinker.loader.NewClassLoaderInjector.inject(application, classLoader, file, z18, createSortedAdditionalPathEntries);
        }
        sPatchDexCount = createSortedAdditionalPathEntries.size();
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "after loaded classloader: " + classLoader + ", dex size:" + sPatchDexCount, new java.lang.Object[0]);
        if (checkDexInstall(classLoader)) {
            return;
        }
        uninstallPatchDex(classLoader);
        throw new com.tencent.tinker.loader.TinkerRuntimeException(com.tencent.tinker.loader.shareutil.ShareConstants.CHECK_DEX_INSTALL_FAIL);
    }

    public static void uninstallPatchDex(java.lang.ClassLoader classLoader) {
        if (sPatchDexCount <= 0) {
            return;
        }
        com.tencent.tinker.loader.shareutil.ShareReflectUtil.reduceFieldArray(com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(classLoader, "pathList").get(classLoader), "dexElements", sPatchDexCount);
    }
}
