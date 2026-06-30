package kz5;

/* loaded from: classes2.dex */
public abstract class d0 extends kz5.c0 {
    public static final int q(java.lang.Iterable iterable, int i17) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : i17;
    }

    public static final java.util.List r(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, (java.lang.Iterable) it.next());
        }
        return arrayList;
    }
}
