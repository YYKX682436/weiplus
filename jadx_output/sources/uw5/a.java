package uw5;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final uw5.a f431764a = new uw5.a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f431765b;

    static {
        kz5.c0.d("zlog_binding");
        f431765b = true;
        new java.util.LinkedHashSet();
        new java.util.LinkedHashMap();
        new java.util.LinkedHashMap();
    }

    public final void a(java.lang.String libName) {
        kotlin.jvm.internal.o.g(libName, "libName");
        if (!f431765b) {
            throw new java.lang.IllegalStateException("load library when pkg is not ready");
        }
        java.lang.String format = "load libName:" + libName + " redirectedLibName:" + libName;
        java.lang.Object[] objArr = new java.lang.Object[0];
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(libName);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wemagic/common/DynamicPkgLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wemagic/common/DynamicPkgLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
