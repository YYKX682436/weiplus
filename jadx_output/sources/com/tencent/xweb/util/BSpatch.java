package com.tencent.xweb.util;

/* loaded from: classes.dex */
public class BSpatch {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("bspatch_utils");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/util/BSpatch", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/xweb/util/BSpatch", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public native int nativeDoPatch(java.lang.String str, java.lang.String str2, java.lang.String str3);
}
