package j06;

/* loaded from: classes5.dex */
public abstract class h {
    public static final java.lang.Object a(java.lang.Class annotationClass, java.util.Map values, java.util.List methods) {
        kotlin.jvm.internal.o.g(annotationClass, "annotationClass");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(methods, "methods");
        jz5.g b17 = jz5.h.b(new j06.e(values));
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(annotationClass.getClassLoader(), new java.lang.Class[]{annotationClass}, new j06.d(annotationClass, values, jz5.h.b(new j06.g(annotationClass, values)), b17, methods));
        kotlin.jvm.internal.o.e(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }
}
