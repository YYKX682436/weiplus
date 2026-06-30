package com.tencent.wechat.zidl2;

/* loaded from: classes4.dex */
public class ZidlLibraryLoader {
    private static final java.lang.String TAG = "ZidlLibraryLoader";
    private static final com.tencent.wechat.zidl2.ZidlLibraryLoader instance = new com.tencent.wechat.zidl2.ZidlLibraryLoader();
    private byte _hellAccFlag_;
    private boolean allInOneSo = true;

    public static com.tencent.wechat.zidl2.ZidlLibraryLoader getInstance() {
        return instance;
    }

    public void loadLibrary(java.lang.String str, java.lang.String str2) {
        if (this.allInOneSo) {
            str = str2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("zidl2");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wechat/zidl2/ZidlLibraryLoader", "loadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wechat/zidl2/ZidlLibraryLoader", "loadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(str);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/wechat/zidl2/ZidlLibraryLoader", "loadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/wechat/zidl2/ZidlLibraryLoader", "loadLibrary", "(Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.wechat.zlog.Zlog.c(TAG, "load library " + str, new java.lang.Object[0]);
    }

    public void setLibLoadMode(boolean z17) {
        this.allInOneSo = z17;
    }
}
