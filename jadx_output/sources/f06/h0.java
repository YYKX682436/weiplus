package f06;

/* loaded from: classes15.dex */
public abstract class h0 {
    public static final java.lang.String a(java.lang.reflect.Type type) {
        java.lang.String name;
        if (!(type instanceof java.lang.Class)) {
            return type.toString();
        }
        java.lang.Class cls = (java.lang.Class) type;
        if (cls.isArray()) {
            q26.n d17 = q26.y.d(type, f06.g0.f258450d);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = d17.iterator();
            if (!it.hasNext()) {
                throw new java.util.NoSuchElementException("Sequence is empty.");
            }
            java.lang.Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            sb6.append(((java.lang.Class) next).getName());
            sb6.append(r26.i0.s("[]", q26.h0.f(d17)));
            name = sb6.toString();
        } else {
            name = cls.getName();
        }
        kotlin.jvm.internal.o.d(name);
        return name;
    }

    public static final java.lang.reflect.Type b(f06.w wVar, boolean z17) {
        i06.w3 w3Var = (i06.w3) wVar;
        f06.e i17 = w3Var.i();
        if (i17 instanceof f06.x) {
            return new f06.e0((f06.x) i17);
        }
        if (!(i17 instanceof f06.d)) {
            throw new java.lang.UnsupportedOperationException("Unsupported type classifier: " + w3Var);
        }
        f06.d dVar = (f06.d) i17;
        java.lang.Class c17 = z17 ? xz5.a.c(dVar) : xz5.a.b(dVar);
        java.util.List h17 = w3Var.h();
        if (h17.isEmpty()) {
            return c17;
        }
        if (!c17.isArray()) {
            return c(c17, h17);
        }
        if (c17.getComponentType().isPrimitive()) {
            return c17;
        }
        f06.z zVar = (f06.z) kz5.n0.B0(h17);
        if (zVar == null) {
            throw new java.lang.IllegalArgumentException("kotlin.Array must have exactly one type argument: " + w3Var);
        }
        f06.a0 a0Var = zVar.f258460a;
        int i18 = a0Var == null ? -1 : f06.f0.f258449a[a0Var.ordinal()];
        if (i18 == -1 || i18 == 1) {
            return c17;
        }
        if (i18 != 2 && i18 != 3) {
            throw new jz5.j();
        }
        f06.w wVar2 = zVar.f258461b;
        kotlin.jvm.internal.o.d(wVar2);
        java.lang.reflect.Type b17 = b(wVar2, false);
        return b17 instanceof java.lang.Class ? c17 : new f06.a(b17);
    }

    public static final java.lang.reflect.Type c(java.lang.Class cls, java.util.List list) {
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d((f06.z) it.next()));
            }
            return new f06.d0(cls, null, arrayList);
        }
        if (java.lang.reflect.Modifier.isStatic(cls.getModifiers())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList2.add(d((f06.z) it6.next()));
            }
            return new f06.d0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        java.lang.reflect.Type c17 = c(declaringClass, list.subList(length, list.size()));
        java.util.List subList = list.subList(0, length);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it7 = subList.iterator();
        while (it7.hasNext()) {
            arrayList3.add(d((f06.z) it7.next()));
        }
        return new f06.d0(cls, c17, arrayList3);
    }

    public static final java.lang.reflect.Type d(f06.z zVar) {
        f06.a0 a0Var = zVar.f258460a;
        if (a0Var == null) {
            return f06.i0.f258451f;
        }
        f06.w wVar = zVar.f258461b;
        kotlin.jvm.internal.o.d(wVar);
        int ordinal = a0Var.ordinal();
        if (ordinal == 0) {
            return b(wVar, true);
        }
        if (ordinal == 1) {
            return new f06.i0(null, b(wVar, true));
        }
        if (ordinal == 2) {
            return new f06.i0(b(wVar, true), null);
        }
        throw new jz5.j();
    }
}
