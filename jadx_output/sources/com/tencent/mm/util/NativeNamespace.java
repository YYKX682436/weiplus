package com.tencent.mm.util;

/* loaded from: classes.dex */
public final class NativeNamespace {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechatnativeutils");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/util/NativeNamespace", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/util/NativeNamespace", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private static native int nativeResetNamespace();
}
