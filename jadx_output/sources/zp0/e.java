package zp0;

/* loaded from: classes5.dex */
public interface e {
    default java.lang.String a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", getName());
        hashMap.put("param", b());
        nf.f.c(hashMap);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return gVar;
    }

    java.util.Map b();

    java.lang.String getName();
}
