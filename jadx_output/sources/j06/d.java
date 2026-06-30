package j06;

/* loaded from: classes15.dex */
public class d implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f297051a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f297052b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f297053c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f297054d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f297055e;

    public d(java.lang.Class cls, java.util.Map map, jz5.g gVar, jz5.g gVar2, java.util.List list) {
        this.f297051a = cls;
        this.f297052b = map;
        this.f297053c = gVar;
        this.f297054d = gVar2;
        this.f297055e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean z17;
        boolean b17;
        java.lang.Class annotationClass = this.f297051a;
        kotlin.jvm.internal.o.g(annotationClass, "$annotationClass");
        java.util.Map values = this.f297052b;
        kotlin.jvm.internal.o.g(values, "$values");
        jz5.g toString$delegate = this.f297053c;
        kotlin.jvm.internal.o.g(toString$delegate, "$toString$delegate");
        jz5.g hashCode$delegate = this.f297054d;
        kotlin.jvm.internal.o.g(hashCode$delegate, "$hashCode$delegate");
        java.util.List<java.lang.reflect.Method> methods = this.f297055e;
        kotlin.jvm.internal.o.g(methods, "$methods");
        java.lang.String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return java.lang.Integer.valueOf(((java.lang.Number) hashCode$delegate.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (java.lang.String) toString$delegate.getValue();
            }
        }
        boolean z18 = false;
        if (kotlin.jvm.internal.o.b(name, "equals")) {
            if (objArr != null && objArr.length == 1) {
                kotlin.jvm.internal.o.d(objArr);
                java.lang.Object l07 = kz5.z.l0(objArr);
                java.lang.annotation.Annotation annotation = l07 instanceof java.lang.annotation.Annotation ? (java.lang.annotation.Annotation) l07 : null;
                if (kotlin.jvm.internal.o.b(annotation != null ? xz5.a.b(xz5.a.a(annotation)) : null, annotationClass)) {
                    if (!methods.isEmpty()) {
                        for (java.lang.reflect.Method method2 : methods) {
                            java.lang.Object obj2 = values.get(method2.getName());
                            java.lang.Object invoke = method2.invoke(l07, new java.lang.Object[0]);
                            if (obj2 instanceof boolean[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                                b17 = java.util.Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                            } else if (obj2 instanceof char[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                                b17 = java.util.Arrays.equals((char[]) obj2, (char[]) invoke);
                            } else if (obj2 instanceof byte[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                b17 = java.util.Arrays.equals((byte[]) obj2, (byte[]) invoke);
                            } else if (obj2 instanceof short[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                                b17 = java.util.Arrays.equals((short[]) obj2, (short[]) invoke);
                            } else if (obj2 instanceof int[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                                b17 = java.util.Arrays.equals((int[]) obj2, (int[]) invoke);
                            } else if (obj2 instanceof float[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                                b17 = java.util.Arrays.equals((float[]) obj2, (float[]) invoke);
                            } else if (obj2 instanceof long[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                                b17 = java.util.Arrays.equals((long[]) obj2, (long[]) invoke);
                            } else if (obj2 instanceof double[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                                b17 = java.util.Arrays.equals((double[]) obj2, (double[]) invoke);
                            } else if (obj2 instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                b17 = java.util.Arrays.equals((java.lang.Object[]) obj2, (java.lang.Object[]) invoke);
                            } else {
                                b17 = kotlin.jvm.internal.o.b(obj2, invoke);
                            }
                            if (!b17) {
                                z17 = false;
                                break;
                            }
                        }
                    }
                    z17 = true;
                    if (z17) {
                        z18 = true;
                    }
                }
                return java.lang.Boolean.valueOf(z18);
            }
        }
        if (values.containsKey(name)) {
            return values.get(name);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Method is not supported: ");
        sb6.append(method);
        sb6.append(" (args: ");
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        sb6.append(kz5.z.z0(objArr));
        sb6.append(')');
        throw new i06.a4(sb6.toString());
    }
}
