package ov5;

/* loaded from: classes12.dex */
public abstract class b {
    public static void a(java.lang.ClassLoader classLoader, java.io.File file) {
        java.lang.Object obj = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(classLoader, "pathList").get(classLoader);
        java.util.List list = (java.util.List) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj, "nativeLibraryDirectories").get(obj);
        if (list == null) {
            list = new java.util.ArrayList(2);
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (file.equals((java.io.File) it.next())) {
                it.remove();
                break;
            }
        }
        list.add(0, file);
        java.util.List list2 = (java.util.List) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj, "systemNativeLibraryDirectories").get(obj);
        if (list2 == null) {
            list2 = new java.util.ArrayList(2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size() + 1);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(obj, "nativeLibraryPathElements").set(obj, (java.lang.Object[]) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(obj, "makePathElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.List.class}).invoke(obj, arrayList));
    }
}
