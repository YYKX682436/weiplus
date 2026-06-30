package kotlin.jvm.internal;

/* loaded from: classes14.dex */
public abstract class m0 {
    public static java.util.Collection a(java.lang.Object obj) {
        if ((obj instanceof zz5.a) && !(obj instanceof zz5.b)) {
            j(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (java.util.Collection) obj;
        } catch (java.lang.ClassCastException e17) {
            kotlin.jvm.internal.o.l(e17, kotlin.jvm.internal.m0.class.getName());
            throw e17;
        }
    }

    public static java.util.List b(java.lang.Object obj) {
        if ((obj instanceof zz5.a) && !(obj instanceof zz5.d)) {
            j(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (java.util.List) obj;
        } catch (java.lang.ClassCastException e17) {
            kotlin.jvm.internal.o.l(e17, kotlin.jvm.internal.m0.class.getName());
            throw e17;
        }
    }

    public static java.util.Map c(java.lang.Object obj) {
        if ((obj instanceof zz5.a) && !(obj instanceof zz5.f)) {
            j(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (java.util.Map) obj;
        } catch (java.lang.ClassCastException e17) {
            kotlin.jvm.internal.o.l(e17, kotlin.jvm.internal.m0.class.getName());
            throw e17;
        }
    }

    public static java.util.Set d(java.lang.Object obj) {
        if ((obj instanceof zz5.a) && !(obj instanceof zz5.g)) {
            j(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (java.util.Set) obj;
        } catch (java.lang.ClassCastException e17) {
            kotlin.jvm.internal.o.l(e17, kotlin.jvm.internal.m0.class.getName());
            throw e17;
        }
    }

    public static java.lang.Object e(java.lang.Object obj, int i17) {
        if (obj == null || f(obj, i17)) {
            return obj;
        }
        j(obj, "kotlin.jvm.functions.Function" + i17);
        throw null;
    }

    public static boolean f(java.lang.Object obj, int i17) {
        if (obj instanceof jz5.b) {
            return (obj instanceof kotlin.jvm.internal.k ? ((kotlin.jvm.internal.k) obj).getArity() : obj instanceof yz5.a ? 0 : obj instanceof yz5.l ? 1 : obj instanceof yz5.p ? 2 : obj instanceof yz5.q ? 3 : obj instanceof yz5.r ? 4 : obj instanceof yz5.s ? 5 : obj instanceof yz5.t ? 6 : obj instanceof yz5.u ? 7 : obj instanceof yz5.v ? 8 : obj instanceof yz5.w ? 9 : obj instanceof yz5.b ? 10 : obj instanceof yz5.c ? 11 : obj instanceof yz5.d ? 12 : obj instanceof yz5.e ? 13 : obj instanceof yz5.f ? 14 : obj instanceof yz5.g ? 15 : obj instanceof yz5.h ? 16 : obj instanceof yz5.i ? 17 : obj instanceof yz5.j ? 18 : obj instanceof yz5.k ? 19 : obj instanceof yz5.m ? 20 : obj instanceof yz5.n ? 21 : obj instanceof yz5.o ? 22 : -1) == i17;
        }
        return false;
    }

    public static boolean g(java.lang.Object obj) {
        return (obj instanceof java.util.List) && (!(obj instanceof zz5.a) || (obj instanceof zz5.d));
    }

    public static boolean h(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && (!(obj instanceof zz5.a) || (obj instanceof zz5.f));
    }

    public static boolean i(java.lang.Object obj) {
        return (obj instanceof java.util.Set) && (!(obj instanceof zz5.a) || (obj instanceof zz5.g));
    }

    public static void j(java.lang.Object obj, java.lang.String str) {
        java.lang.ClassCastException classCastException = new java.lang.ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        kotlin.jvm.internal.o.l(classCastException, kotlin.jvm.internal.m0.class.getName());
        throw classCastException;
    }
}
