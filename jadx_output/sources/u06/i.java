package u06;

/* loaded from: classes15.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f423505a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f423506b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f423507c;

    static {
        int i17 = 0;
        java.util.List<f06.d> i18 = kz5.c0.i(kotlin.jvm.internal.i0.a(java.lang.Boolean.TYPE), kotlin.jvm.internal.i0.a(java.lang.Byte.TYPE), kotlin.jvm.internal.i0.a(java.lang.Character.TYPE), kotlin.jvm.internal.i0.a(java.lang.Double.TYPE), kotlin.jvm.internal.i0.a(java.lang.Float.TYPE), kotlin.jvm.internal.i0.a(java.lang.Integer.TYPE), kotlin.jvm.internal.i0.a(java.lang.Long.TYPE), kotlin.jvm.internal.i0.a(java.lang.Short.TYPE));
        f423505a = i18;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i18, 10));
        for (f06.d dVar : i18) {
            arrayList.add(new jz5.l(xz5.a.c(dVar), xz5.a.d(dVar)));
        }
        f423506b = kz5.c1.q(arrayList);
        java.util.List<f06.d> list = f423505a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (f06.d dVar2 : list) {
            arrayList2.add(new jz5.l(xz5.a.d(dVar2), xz5.a.c(dVar2)));
        }
        f423507c = kz5.c1.q(arrayList2);
        java.util.List i19 = kz5.c0.i(yz5.a.class, yz5.l.class, yz5.p.class, yz5.q.class, yz5.r.class, yz5.s.class, yz5.t.class, yz5.u.class, yz5.v.class, yz5.w.class, yz5.b.class, yz5.c.class, yz5.d.class, yz5.e.class, yz5.f.class, yz5.g.class, yz5.h.class, yz5.i.class, yz5.j.class, yz5.k.class, yz5.m.class, yz5.n.class, yz5.o.class);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(i19, 10));
        for (java.lang.Object obj : i19) {
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList3.add(new jz5.l((java.lang.Class) obj, java.lang.Integer.valueOf(i17)));
            i17 = i27;
        }
        kz5.c1.q(arrayList3);
    }

    public static final n16.b a(java.lang.Class cls) {
        n16.b a17;
        kotlin.jvm.internal.o.g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            if (!(cls.getSimpleName().length() == 0)) {
                java.lang.Class<?> declaringClass = cls.getDeclaringClass();
                return (declaringClass == null || (a17 = a(declaringClass)) == null) ? n16.b.l(new n16.c(cls.getName())) : a17.d(n16.g.k(cls.getSimpleName()));
            }
        }
        n16.c cVar = new n16.c(cls.getName());
        return new n16.b(cVar.e(), n16.c.j(cVar.f()), true);
    }

    public static final java.lang.String b(java.lang.Class cls) {
        kotlin.jvm.internal.o.g(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return r26.i0.u(cls.getName(), '.', '/', false, 4, null);
            }
            return "L" + r26.i0.u(cls.getName(), '.', '/', false, 4, null) + ';';
        }
        java.lang.String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                }
                break;
            case 64711720:
                if (name.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final java.util.List c(java.lang.reflect.Type type) {
        kotlin.jvm.internal.o.g(type, "<this>");
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            return kz5.p0.f313996d;
        }
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return q26.h0.y(q26.h0.m(q26.y.d(type, u06.g.f423501d), u06.h.f423503d));
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.o.f(actualTypeArguments, "getActualTypeArguments(...)");
        return kz5.z.z0(actualTypeArguments);
    }

    public static final java.lang.ClassLoader d(java.lang.Class cls) {
        kotlin.jvm.internal.o.g(cls, "<this>");
        java.lang.ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.o.f(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final boolean e(java.lang.Class cls) {
        kotlin.jvm.internal.o.g(cls, "<this>");
        return java.lang.Enum.class.isAssignableFrom(cls);
    }
}
