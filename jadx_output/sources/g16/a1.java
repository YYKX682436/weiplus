package g16;

/* loaded from: classes15.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g16.a1 f267591a = new g16.a1();

    public final java.lang.String[] a(java.lang.String... signatures) {
        kotlin.jvm.internal.o.g(signatures, "signatures");
        java.util.ArrayList arrayList = new java.util.ArrayList(signatures.length);
        for (java.lang.String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public final java.util.Set b(java.lang.String internalName, java.lang.String... signatures) {
        kotlin.jvm.internal.o.g(internalName, "internalName");
        kotlin.jvm.internal.o.g(signatures, "signatures");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final java.util.Set c(java.lang.String name, java.lang.String... signatures) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(signatures, "signatures");
        return b(f(name), (java.lang.String[]) java.util.Arrays.copyOf(signatures, signatures.length));
    }

    public final java.util.Set d(java.lang.String name, java.lang.String... signatures) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(signatures, "signatures");
        return b(g(name), (java.lang.String[]) java.util.Arrays.copyOf(signatures, signatures.length));
    }

    public final java.lang.String e(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        return "java/util/function/".concat(name);
    }

    public final java.lang.String f(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        return "java/lang/".concat(name);
    }

    public final java.lang.String g(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        return "java/util/".concat(name);
    }
}
