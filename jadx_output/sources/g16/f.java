package g16;

/* loaded from: classes15.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g16.g f267617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g16.g gVar) {
        super(1);
        this.f267617d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        t06.c cVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        g16.q0 kotlinClass = (g16.q0) obj;
        kotlin.jvm.internal.o.g(kotlinClass, "kotlinClass");
        g16.g gVar = this.f267617d;
        gVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        g16.d dVar = new g16.d(gVar, hashMap, kotlinClass, hashMap3, hashMap2);
        java.lang.Class klass = ((t06.g) kotlinClass).f414536a;
        kotlin.jvm.internal.o.g(klass, "klass");
        java.lang.reflect.Method[] declaredMethods = klass.getDeclaredMethods();
        kotlin.jvm.internal.o.f(declaredMethods, "getDeclaredMethods(...)");
        int length = declaredMethods.length;
        int i17 = 0;
        while (true) {
            cVar = t06.c.f414533a;
            str = "toString(...)";
            str2 = "getParameterTypes(...)";
            str3 = "(";
            if (i17 >= length) {
                break;
            }
            java.lang.reflect.Method method = declaredMethods[i17];
            n16.g k17 = n16.g.k(method.getName());
            java.lang.reflect.Method[] methodArr = declaredMethods;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            kotlin.jvm.internal.o.f(parameterTypes, "getParameterTypes(...)");
            int i18 = length;
            for (java.lang.Class<?> cls : parameterTypes) {
                kotlin.jvm.internal.o.d(cls);
                sb6.append(u06.i.b(cls));
            }
            sb6.append(")");
            java.lang.Class<?> returnType = method.getReturnType();
            kotlin.jvm.internal.o.f(returnType, "getReturnType(...)");
            sb6.append(u06.i.b(returnType));
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            java.lang.Object a17 = dVar.a(k17, sb7);
            java.lang.annotation.Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            kotlin.jvm.internal.o.f(declaredAnnotations, "getDeclaredAnnotations(...)");
            int length2 = declaredAnnotations.length;
            int i19 = 0;
            while (i19 < length2) {
                java.lang.annotation.Annotation annotation = declaredAnnotations[i19];
                kotlin.jvm.internal.o.d(annotation);
                java.lang.Class b17 = xz5.a.b(xz5.a.a(annotation));
                java.lang.annotation.Annotation[] annotationArr = declaredAnnotations;
                g16.m0 b18 = ((g16.c) a17).b(u06.i.a(b17), new t06.b(annotation));
                if (b18 != null) {
                    cVar.c(b18, annotation, b17);
                }
                i19++;
                declaredAnnotations = annotationArr;
            }
            java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            kotlin.jvm.internal.o.f(parameterAnnotations, "getParameterAnnotations(...)");
            java.lang.annotation.Annotation[][] annotationArr2 = parameterAnnotations;
            int length3 = annotationArr2.length;
            for (int i27 = 0; i27 < length3; i27++) {
                java.lang.annotation.Annotation[] annotationArr3 = annotationArr2[i27];
                kotlin.jvm.internal.o.d(annotationArr3);
                int length4 = annotationArr3.length;
                int i28 = 0;
                while (i28 < length4) {
                    java.lang.annotation.Annotation annotation2 = annotationArr3[i28];
                    java.lang.Class b19 = xz5.a.b(xz5.a.a(annotation2));
                    java.lang.annotation.Annotation[][] annotationArr4 = annotationArr2;
                    int i29 = length3;
                    java.lang.annotation.Annotation[] annotationArr5 = annotationArr3;
                    g16.m0 c17 = ((g16.b) a17).c(i27, u06.i.a(b19), new t06.b(annotation2));
                    if (c17 != null) {
                        cVar.c(c17, annotation2, b19);
                    }
                    i28++;
                    annotationArr2 = annotationArr4;
                    length3 = i29;
                    annotationArr3 = annotationArr5;
                }
            }
            ((g16.c) a17).a();
            i17++;
            declaredMethods = methodArr;
            length = i18;
        }
        java.lang.reflect.Constructor<?>[] declaredConstructors = klass.getDeclaredConstructors();
        kotlin.jvm.internal.o.f(declaredConstructors, "getDeclaredConstructors(...)");
        int length5 = declaredConstructors.length;
        int i37 = 0;
        while (i37 < length5) {
            java.lang.reflect.Constructor<?> constructor = declaredConstructors[i37];
            n16.g gVar2 = n16.i.f334177e;
            kotlin.jvm.internal.o.d(constructor);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str3);
            java.lang.reflect.Constructor<?>[] constructorArr = declaredConstructors;
            java.lang.Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            kotlin.jvm.internal.o.f(parameterTypes2, str2);
            int i38 = length5;
            int length6 = parameterTypes2.length;
            java.lang.String str4 = str2;
            int i39 = 0;
            while (i39 < length6) {
                java.lang.Class<?> cls2 = parameterTypes2[i39];
                kotlin.jvm.internal.o.d(cls2);
                sb8.append(u06.i.b(cls2));
                i39++;
                parameterTypes2 = parameterTypes2;
            }
            sb8.append(")V");
            java.lang.String sb9 = sb8.toString();
            kotlin.jvm.internal.o.f(sb9, str);
            java.lang.Object a18 = dVar.a(gVar2, sb9);
            java.lang.annotation.Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            kotlin.jvm.internal.o.f(declaredAnnotations2, "getDeclaredAnnotations(...)");
            int length7 = declaredAnnotations2.length;
            int i47 = 0;
            while (i47 < length7) {
                java.lang.annotation.Annotation annotation3 = declaredAnnotations2[i47];
                kotlin.jvm.internal.o.d(annotation3);
                java.lang.annotation.Annotation[] annotationArr6 = declaredAnnotations2;
                java.lang.Class b27 = xz5.a.b(xz5.a.a(annotation3));
                int i48 = length7;
                java.lang.String str5 = str;
                java.lang.String str6 = str3;
                g16.m0 b28 = ((g16.c) a18).b(u06.i.a(b27), new t06.b(annotation3));
                if (b28 != null) {
                    cVar.c(b28, annotation3, b27);
                }
                i47++;
                length7 = i48;
                declaredAnnotations2 = annotationArr6;
                str = str5;
                str3 = str6;
            }
            java.lang.String str7 = str;
            java.lang.String str8 = str3;
            java.lang.annotation.Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            kotlin.jvm.internal.o.d(parameterAnnotations2);
            if (!(parameterAnnotations2.length == 0)) {
                int length8 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length9 = parameterAnnotations2.length;
                for (int i49 = 0; i49 < length9; i49++) {
                    java.lang.annotation.Annotation[] annotationArr7 = parameterAnnotations2[i49];
                    kotlin.jvm.internal.o.d(annotationArr7);
                    int length10 = annotationArr7.length;
                    int i57 = 0;
                    while (i57 < length10) {
                        java.lang.annotation.Annotation[][] annotationArr8 = parameterAnnotations2;
                        java.lang.annotation.Annotation annotation4 = annotationArr7[i57];
                        int i58 = length9;
                        java.lang.Class b29 = xz5.a.b(xz5.a.a(annotation4));
                        java.lang.annotation.Annotation[] annotationArr9 = annotationArr7;
                        int i59 = length8;
                        int i66 = length10;
                        java.util.HashMap hashMap4 = hashMap;
                        g16.m0 c18 = ((g16.b) a18).c(i49 + length8, u06.i.a(b29), new t06.b(annotation4));
                        if (c18 != null) {
                            cVar.c(c18, annotation4, b29);
                        }
                        i57++;
                        parameterAnnotations2 = annotationArr8;
                        annotationArr7 = annotationArr9;
                        length9 = i58;
                        length8 = i59;
                        length10 = i66;
                        hashMap = hashMap4;
                    }
                }
            }
            ((g16.c) a18).a();
            i37++;
            declaredConstructors = constructorArr;
            length5 = i38;
            str2 = str4;
            str = str7;
            str3 = str8;
            hashMap = hashMap;
        }
        java.util.HashMap hashMap5 = hashMap;
        java.lang.reflect.Field[] declaredFields = klass.getDeclaredFields();
        kotlin.jvm.internal.o.f(declaredFields, "getDeclaredFields(...)");
        int length11 = declaredFields.length;
        int i67 = 0;
        while (i67 < length11) {
            java.lang.reflect.Field field = declaredFields[i67];
            n16.g k18 = n16.g.k(field.getName());
            java.lang.Class<?> type = field.getType();
            kotlin.jvm.internal.o.f(type, "getType(...)");
            java.lang.String desc = u06.i.b(type);
            kotlin.jvm.internal.o.g(desc, "desc");
            java.lang.String h17 = k18.h();
            kotlin.jvm.internal.o.f(h17, "asString(...)");
            g16.u0 u0Var = new g16.u0(h17 + '#' + desc, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.annotation.Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            kotlin.jvm.internal.o.f(declaredAnnotations3, "getDeclaredAnnotations(...)");
            int length12 = declaredAnnotations3.length;
            int i68 = 0;
            while (i68 < length12) {
                java.lang.annotation.Annotation annotation5 = declaredAnnotations3[i68];
                kotlin.jvm.internal.o.d(annotation5);
                java.lang.Class b37 = xz5.a.b(xz5.a.a(annotation5));
                java.lang.reflect.Field[] fieldArr = declaredFields;
                int i69 = length11;
                g16.m0 r17 = dVar.f267601a.r(u06.i.a(b37), new t06.b(annotation5), arrayList);
                if (r17 != null) {
                    cVar.c(r17, annotation5, b37);
                }
                i68++;
                declaredFields = fieldArr;
                length11 = i69;
            }
            java.lang.reflect.Field[] fieldArr2 = declaredFields;
            int i76 = length11;
            if (!arrayList.isEmpty()) {
                dVar.f267602b.put(u0Var, arrayList);
            }
            i67++;
            declaredFields = fieldArr2;
            length11 = i76;
        }
        return new g16.n(hashMap5, hashMap2, hashMap3);
    }
}
