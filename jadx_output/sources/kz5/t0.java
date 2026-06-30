package kz5;

/* loaded from: classes12.dex */
public abstract class t0 {
    public static final java.util.Map a(kz5.s0 s0Var) {
        kotlin.jvm.internal.o.g(s0Var, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator b17 = s0Var.b();
        while (b17.hasNext()) {
            java.lang.Object a17 = s0Var.a(b17.next());
            java.lang.Object obj = linkedHashMap.get(a17);
            if (obj == null && !linkedHashMap.containsKey(a17)) {
                obj = new kotlin.jvm.internal.f0();
            }
            kotlin.jvm.internal.f0 f0Var = (kotlin.jvm.internal.f0) obj;
            f0Var.f310116d++;
            linkedHashMap.put(a17, f0Var);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.o.e(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            if ((entry instanceof zz5.a) && !(entry instanceof zz5.e)) {
                kotlin.jvm.internal.m0.j(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(java.lang.Integer.valueOf(((kotlin.jvm.internal.f0) entry.getValue()).f310116d));
        }
        return kotlin.jvm.internal.m0.c(linkedHashMap);
    }
}
