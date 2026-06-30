package yc;

/* loaded from: classes.dex */
public final class b implements yc.a {
    @Override // yc.a
    public void loadLibrary(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(name);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/gameaccelerate/LoadDelegate$delegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/gameaccelerate/LoadDelegate$delegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
