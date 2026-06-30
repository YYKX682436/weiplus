package i06;

/* loaded from: classes15.dex */
public abstract class o4 {

    /* renamed from: a, reason: collision with root package name */
    public static final n16.c f286715a = new n16.c("kotlin.jvm.JvmStatic");

    public static final i06.k0 a(java.lang.Object obj) {
        i06.k0 k0Var = obj instanceof i06.k0 ? (i06.k0) obj : null;
        if (k0Var != null) {
            return k0Var;
        }
        i06.y1 b17 = b(obj);
        return b17 != null ? b17 : c(obj);
    }

    public static final i06.y1 b(java.lang.Object obj) {
        i06.y1 y1Var = obj instanceof i06.y1 ? (i06.y1) obj : null;
        if (y1Var != null) {
            return y1Var;
        }
        kotlin.jvm.internal.l lVar = obj instanceof kotlin.jvm.internal.l ? (kotlin.jvm.internal.l) obj : null;
        f06.c compute = lVar != null ? lVar.compute() : null;
        if (compute instanceof i06.y1) {
            return (i06.y1) compute;
        }
        return null;
    }

    public static final i06.q3 c(java.lang.Object obj) {
        i06.q3 q3Var = obj instanceof i06.q3 ? (i06.q3) obj : null;
        if (q3Var != null) {
            return q3Var;
        }
        kotlin.jvm.internal.b0 b0Var = obj instanceof kotlin.jvm.internal.b0 ? (kotlin.jvm.internal.b0) obj : null;
        f06.c compute = b0Var != null ? b0Var.compute() : null;
        if (compute instanceof i06.q3) {
            return (i06.q3) compute;
        }
        return null;
    }

    public static final java.util.List d(p06.a aVar) {
        boolean z17;
        java.util.List c17;
        java.lang.annotation.Annotation j17;
        kotlin.jvm.internal.o.g(aVar, "<this>");
        p06.k<p06.c> annotations = aVar.getAnnotations();
        java.util.ArrayList<java.lang.annotation.Annotation> arrayList = new java.util.ArrayList();
        for (p06.c cVar : annotations) {
            o06.x1 source = cVar.getSource();
            if (source instanceof t06.b) {
                j17 = ((t06.b) source).f414532b;
            } else if (source instanceof t06.l) {
                u06.b0 b0Var = ((t06.l) source).f414544b;
                u06.j jVar = b0Var instanceof u06.j ? (u06.j) b0Var : null;
                j17 = jVar != null ? jVar.f423510a : null;
            } else {
                j17 = j(cVar);
            }
            if (j17 != null) {
                arrayList.add(j17);
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(xz5.a.b(xz5.a.a((java.lang.annotation.Annotation) it.next())).getSimpleName(), "Container")) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (!z17) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.annotation.Annotation annotation : arrayList) {
            java.lang.Class b17 = xz5.a.b(xz5.a.a(annotation));
            if (!kotlin.jvm.internal.o.b(b17.getSimpleName(), "Container") || b17.getAnnotation(kotlin.jvm.internal.k0.class) == null) {
                c17 = kz5.b0.c(annotation);
            } else {
                java.lang.Object invoke = b17.getDeclaredMethod("value", new java.lang.Class[0]).invoke(annotation, new java.lang.Object[0]);
                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                c17 = kz5.v.f((java.lang.annotation.Annotation[]) invoke);
            }
            kz5.h0.u(arrayList2, c17);
        }
        return arrayList2;
    }

    public static final java.lang.Object e(java.lang.reflect.Type type) {
        kotlin.jvm.internal.o.g(type, "type");
        if (!(type instanceof java.lang.Class) || !((java.lang.Class) type).isPrimitive()) {
            return null;
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Boolean.TYPE)) {
            return java.lang.Boolean.FALSE;
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Character.TYPE)) {
            return (char) 0;
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Byte.TYPE)) {
            return (byte) 0;
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Short.TYPE)) {
            return (short) 0;
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Integer.TYPE)) {
            return 0;
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Float.TYPE)) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Long.TYPE)) {
            return 0L;
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Double.TYPE)) {
            return java.lang.Double.valueOf(0.0d);
        }
        if (kotlin.jvm.internal.o.b(type, java.lang.Void.TYPE)) {
            throw new java.lang.IllegalStateException("Parameter with void type is illegal");
        }
        throw new java.lang.UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final o06.b f(java.lang.Class moduleAnchor, p16.h0 proto, k16.g nameResolver, k16.k typeTable, k16.a metadataVersion, yz5.p createDescriptor) {
        java.util.List list;
        kotlin.jvm.internal.o.g(moduleAnchor, "moduleAnchor");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        kotlin.jvm.internal.o.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.o.g(createDescriptor, "createDescriptor");
        t06.k a17 = i06.b4.a(moduleAnchor);
        if (proto instanceof i16.j0) {
            list = ((i16.j0) proto).f287532o;
        } else {
            if (!(proto instanceof i16.u0)) {
                throw new java.lang.IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((i16.u0) proto).f287768o;
        }
        java.util.List list2 = list;
        b26.q qVar = a17.f414542a;
        o06.v0 v0Var = qVar.f17484b;
        k16.l lVar = k16.m.f303462a;
        k16.m mVar = k16.m.f303463b;
        kotlin.jvm.internal.o.d(list2);
        return (o06.b) createDescriptor.invoke(new b26.s0(new b26.t(qVar, nameResolver, v0Var, typeTable, mVar, metadataVersion, null, null, list2)), proto);
    }

    public static final o06.r1 g(o06.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        if (bVar.Z() == null) {
            return null;
        }
        o06.m e17 = bVar.e();
        kotlin.jvm.internal.o.e(e17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((o06.g) e17).R();
    }

    public static final boolean h(f06.w wVar) {
        f26.o0 o0Var;
        kotlin.jvm.internal.o.g(wVar, "<this>");
        i06.w3 w3Var = wVar instanceof i06.w3 ? (i06.w3) wVar : null;
        return (w3Var == null || (o0Var = w3Var.f286780d) == null || !r16.m.g(o0Var)) ? false : true;
    }

    public static final java.lang.Class i(java.lang.ClassLoader classLoader, n16.b bVar, int i17) {
        n06.d dVar = n06.d.f333953a;
        n16.e i18 = bVar.b().i();
        kotlin.jvm.internal.o.f(i18, "toUnsafe(...)");
        n16.b g17 = dVar.g(i18);
        if (g17 != null) {
            bVar = g17;
        }
        java.lang.String b17 = bVar.h().b();
        kotlin.jvm.internal.o.f(b17, "asString(...)");
        java.lang.String b18 = bVar.i().b();
        kotlin.jvm.internal.o.f(b18, "asString(...)");
        if (kotlin.jvm.internal.o.b(b17, "kotlin")) {
            switch (b18.hashCode()) {
                case -901856463:
                    if (b18.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b18.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b18.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b18.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b18.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b18.equals("Array")) {
                        return java.lang.Object[].class;
                    }
                    break;
                case 601811914:
                    if (b18.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b18.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b18.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 > 0) {
            for (int i19 = 0; i19 < i17; i19++) {
                sb6.append("[");
            }
            sb6.append("L");
        }
        if (b17.length() > 0) {
            sb6.append(b17.concat("."));
        }
        sb6.append(r26.i0.u(b18, '.', '$', false, 4, null));
        if (i17 > 0) {
            sb6.append(";");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return t06.e.a(classLoader, sb7);
    }

    public static final java.lang.annotation.Annotation j(p06.c cVar) {
        o06.g d17 = v16.f.d(cVar);
        java.lang.Class k17 = d17 != null ? k(d17) : null;
        if (!(k17 instanceof java.lang.Class)) {
            k17 = null;
        }
        if (k17 == null) {
            return null;
        }
        java.util.Set<java.util.Map.Entry> entrySet = cVar.c().entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : entrySet) {
            n16.g gVar = (n16.g) entry.getKey();
            t16.g gVar2 = (t16.g) entry.getValue();
            java.lang.ClassLoader classLoader = k17.getClassLoader();
            kotlin.jvm.internal.o.f(classLoader, "getClassLoader(...)");
            java.lang.Object l17 = l(gVar2, classLoader);
            jz5.l lVar = l17 != null ? new jz5.l(gVar.h(), l17) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        java.util.Map q17 = kz5.c1.q(arrayList);
        java.util.Set keySet = q17.keySet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(keySet, 10));
        java.util.Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(k17.getDeclaredMethod((java.lang.String) it.next(), new java.lang.Class[0]));
        }
        return (java.lang.annotation.Annotation) j06.h.a(k17, q17, arrayList2);
    }

    public static final java.lang.Class k(o06.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<this>");
        o06.x1 source = gVar.getSource();
        kotlin.jvm.internal.o.f(source, "getSource(...)");
        if (source instanceof g16.s0) {
            g16.q0 q0Var = ((g16.s0) source).f267661b;
            kotlin.jvm.internal.o.e(q0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((t06.g) q0Var).f414536a;
        }
        if (source instanceof t06.l) {
            u06.b0 b0Var = ((t06.l) source).f414544b;
            kotlin.jvm.internal.o.e(b0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((u06.x) b0Var).f423533a;
        }
        n16.b f17 = v16.f.f(gVar);
        if (f17 == null) {
            return null;
        }
        return i(u06.i.d(gVar.getClass()), f17, 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0070. Please report as an issue. */
    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v18, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v20, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v19, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(t16.g r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i06.o4.l(t16.g, java.lang.ClassLoader):java.lang.Object");
    }
}
