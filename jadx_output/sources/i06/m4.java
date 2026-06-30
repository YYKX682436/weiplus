package i06;

/* loaded from: classes15.dex */
public abstract class m4 {
    public static final java.lang.String a(java.lang.reflect.Method method) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(method.getName());
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.o.f(parameterTypes, "getParameterTypes(...)");
        sb6.append(kz5.z.d0(parameterTypes, "", "(", ")", 0, null, i06.l4.f286693d, 24, null));
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.o.f(returnType, "getReturnType(...)");
        sb6.append(u06.i.b(returnType));
        return sb6.toString();
    }
}
