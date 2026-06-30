package pb;

/* loaded from: classes.dex */
public final class g implements pb.c {
    @Override // pb.c
    public void load(java.lang.String libName) {
        kotlin.jvm.internal.o.g(libName, "libName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(libName);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/luggage/trace/TraceLoader$mLoaderDelegate$1", "load", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/luggage/trace/TraceLoader$mLoaderDelegate$1", "load", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
