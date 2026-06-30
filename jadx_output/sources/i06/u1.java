package i06;

/* loaded from: classes15.dex */
public abstract class u1 implements kotlin.jvm.internal.f {

    /* renamed from: d, reason: collision with root package name */
    public static final r26.t f286756d = new r26.t("<v#(\\d+)>");

    public final void i(java.util.List list, java.lang.String str, boolean z17) {
        list.addAll(q(str));
        int size = ((((java.util.ArrayList) r5).size() + 32) - 1) / 32;
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Class TYPE = java.lang.Integer.TYPE;
            kotlin.jvm.internal.o.f(TYPE, "TYPE");
            list.add(TYPE);
        }
        if (!z17) {
            list.add(java.lang.Object.class);
        } else {
            list.remove(kotlin.jvm.internal.i.class);
            list.add(kotlin.jvm.internal.i.class);
        }
    }

    public final java.lang.reflect.Method j(java.lang.String name, java.lang.String desc) {
        java.lang.reflect.Method r17;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(desc, "desc");
        if (kotlin.jvm.internal.o.b(name, "<init>")) {
            return null;
        }
        java.lang.Class[] clsArr = (java.lang.Class[]) ((java.util.ArrayList) q(desc)).toArray(new java.lang.Class[0]);
        java.lang.Class s17 = s(desc, r26.n0.K(desc, ')', 0, false, 6, null) + 1, desc.length());
        java.lang.reflect.Method r18 = r(o(), name, clsArr, s17, false);
        if (r18 != null) {
            return r18;
        }
        if (!o().isInterface() || (r17 = r(java.lang.Object.class, name, clsArr, s17, false)) == null) {
            return null;
        }
        return r17;
    }

    public abstract java.util.Collection k();

    public abstract java.util.Collection l(n16.g gVar);

    public abstract o06.o1 m(int i17);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection n(y16.s r9, i06.p1 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.o.g(r10, r0)
            i06.t1 r0 = new i06.t1
            r0.<init>(r8)
            r1 = 0
            r2 = 3
            java.util.Collection r9 = y16.v.a(r9, r1, r1, r2, r1)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L20:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r9.next()
            o06.m r3 = (o06.m) r3
            boolean r4 = r3 instanceof o06.d
            if (r4 == 0) goto L65
            r4 = r3
            o06.d r4 = (o06.d) r4
            o06.g0 r5 = r4.getVisibility()
            o06.g0 r6 = o06.f0.f341948h
            boolean r5 = kotlin.jvm.internal.o.b(r5, r6)
            if (r5 != 0) goto L65
            o06.c r4 = r4.j()
            r4.getClass()
            o06.c r5 = o06.c.FAKE_OVERRIDE
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L4e
            r4 = r6
            goto L4f
        L4e:
            r4 = r7
        L4f:
            i06.p1 r5 = i06.p1.f286718d
            if (r10 != r5) goto L55
            r5 = r6
            goto L56
        L55:
            r5 = r7
        L56:
            if (r4 != r5) goto L59
            goto L5a
        L59:
            r6 = r7
        L5a:
            if (r6 == 0) goto L65
            jz5.f0 r4 = jz5.f0.f302826a
            java.lang.Object r3 = r3.w(r0, r4)
            i06.k0 r3 = (i06.k0) r3
            goto L66
        L65:
            r3 = r1
        L66:
            if (r3 == 0) goto L20
            r2.add(r3)
            goto L20
        L6c:
            java.util.List r9 = kz5.n0.S0(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i06.u1.n(y16.s, i06.p1):java.util.Collection");
    }

    public java.lang.Class o() {
        java.lang.Class f17 = f();
        java.util.List list = u06.i.f423505a;
        kotlin.jvm.internal.o.g(f17, "<this>");
        java.lang.Class cls = (java.lang.Class) u06.i.f423507c.get(f17);
        return cls == null ? f() : cls;
    }

    public abstract java.util.Collection p(n16.g gVar);

    public final java.util.List q(java.lang.String str) {
        int K;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 1;
        while (str.charAt(i17) != ')') {
            int i18 = i17;
            while (str.charAt(i18) == '[') {
                i18++;
            }
            char charAt = str.charAt(i18);
            if (r26.n0.C("VZCBSIFJD", charAt, false, 2, null)) {
                K = i18 + 1;
            } else {
                if (charAt != 'L') {
                    throw new i06.a4("Unknown type prefix in the method signature: ".concat(str));
                }
                K = r26.n0.K(str, ';', i17, false, 4, null) + 1;
            }
            arrayList.add(s(str, i17, K));
            i17 = K;
        }
        return arrayList;
    }

    public final java.lang.reflect.Method r(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Class cls2, boolean z17) {
        java.lang.Class a17;
        java.lang.reflect.Method r17;
        if (z17) {
            clsArr[0] = cls;
        }
        java.lang.reflect.Method t17 = t(cls, str, clsArr, cls2);
        if (t17 != null) {
            return t17;
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (superclass != null && (r17 = r(superclass, str, clsArr, cls2, z17)) != null) {
            return r17;
        }
        java.lang.Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.o.f(interfaces, "getInterfaces(...)");
        for (java.lang.Class<?> cls3 : interfaces) {
            kotlin.jvm.internal.o.d(cls3);
            java.lang.reflect.Method r18 = r(cls3, str, clsArr, cls2, z17);
            if (r18 != null) {
                return r18;
            }
            if (z17 && (a17 = t06.e.a(u06.i.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                java.lang.reflect.Method t18 = t(a17, str, clsArr, cls2);
                if (t18 != null) {
                    return t18;
                }
            }
        }
        return null;
    }

    public final java.lang.Class s(java.lang.String str, int i17, int i18) {
        char charAt = str.charAt(i17);
        if (charAt == 'L') {
            java.lang.ClassLoader d17 = u06.i.d(f());
            java.lang.String substring = str.substring(i17 + 1, i18 - 1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.lang.Class<?> loadClass = d17.loadClass(r26.i0.u(substring, '/', '.', false, 4, null));
            kotlin.jvm.internal.o.f(loadClass, "loadClass(...)");
            return loadClass;
        }
        if (charAt == '[') {
            java.lang.Class s17 = s(str, i17 + 1, i18);
            n16.c cVar = i06.o4.f286715a;
            kotlin.jvm.internal.o.g(s17, "<this>");
            return java.lang.reflect.Array.newInstance((java.lang.Class<?>) s17, 0).getClass();
        }
        if (charAt == 'V') {
            java.lang.Class TYPE = java.lang.Void.TYPE;
            kotlin.jvm.internal.o.f(TYPE, "TYPE");
            return TYPE;
        }
        if (charAt == 'Z') {
            return java.lang.Boolean.TYPE;
        }
        if (charAt == 'C') {
            return java.lang.Character.TYPE;
        }
        if (charAt == 'B') {
            return java.lang.Byte.TYPE;
        }
        if (charAt == 'S') {
            return java.lang.Short.TYPE;
        }
        if (charAt == 'I') {
            return java.lang.Integer.TYPE;
        }
        if (charAt == 'F') {
            return java.lang.Float.TYPE;
        }
        if (charAt == 'J') {
            return java.lang.Long.TYPE;
        }
        if (charAt == 'D') {
            return java.lang.Double.TYPE;
        }
        throw new i06.a4("Unknown type prefix in the method signature: ".concat(str));
    }

    public final java.lang.reflect.Method t(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Class cls2) {
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.o.b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.o.f(declaredMethods, "getDeclaredMethods(...)");
            for (java.lang.reflect.Method method : declaredMethods) {
                if (kotlin.jvm.internal.o.b(method.getName(), str) && kotlin.jvm.internal.o.b(method.getReturnType(), cls2) && java.util.Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }
}
