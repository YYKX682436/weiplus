package pf5;

/* loaded from: classes5.dex */
public abstract class a0 {
    public static final java.lang.Class a(f06.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        pf5.z zVar = pf5.z.f353948a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pf5.z.f353949b;
        java.lang.String d17 = dVar.d();
        kotlin.jvm.internal.o.d(d17);
        java.lang.Object obj = concurrentHashMap.get(d17);
        java.lang.Class cls = obj instanceof java.lang.Class ? (java.lang.Class) obj : null;
        if (cls != null) {
            return cls;
        }
        throw new java.lang.RuntimeException(dVar + " never import any instance.");
    }

    public static final java.lang.Class b(java.lang.Class cls, java.lang.Class api) {
        kotlin.jvm.internal.o.g(cls, "<this>");
        kotlin.jvm.internal.o.g(api, "api");
        pf5.z zVar = pf5.z.f353948a;
        pf5.z.f353949b.put(api.getName(), cls);
        java.lang.String str = "withApi " + api.getName() + " ==> " + cls.getName();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("UICProvider", str, obj);
        }
        return cls;
    }

    public static final java.lang.Class c(java.lang.Class cls, java.lang.Class api) {
        kotlin.jvm.internal.o.g(cls, "<this>");
        kotlin.jvm.internal.o.g(api, "api");
        pf5.z zVar = pf5.z.f353948a;
        pf5.z.f353950c.put(api.getName(), cls);
        java.lang.String str = "withInstanceApi " + api.getName() + " ==> " + cls.getName();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("UICProvider", str, obj);
        }
        return cls;
    }
}
