package kz5;

/* loaded from: classes12.dex */
public abstract class h0 extends kz5.g0 {
    public static final boolean A(java.lang.Iterable iterable, yz5.l predicate) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return y(iterable, predicate, true);
    }

    public static final boolean B(java.util.List list, yz5.l predicate) {
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z(list, predicate, true);
    }

    public static final java.lang.Object C(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final java.lang.Object D(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(kz5.c0.h(list));
    }

    public static final java.lang.Object E(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(kz5.c0.h(list));
    }

    public static final boolean u(java.util.Collection collection, java.lang.Iterable elements) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(elements, "elements");
        if (elements instanceof java.util.Collection) {
            return collection.addAll((java.util.Collection) elements);
        }
        java.util.Iterator it = elements.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z17 = true;
            }
        }
        return z17;
    }

    public static final boolean v(java.util.Collection collection, q26.n elements) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Iterator it = elements.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z17 = true;
            }
        }
        return z17;
    }

    public static final boolean w(java.util.Collection collection, java.lang.Object[] elements) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(elements, "elements");
        return collection.addAll(kz5.v.f(elements));
    }

    public static final java.util.Collection x(java.lang.Iterable iterable) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        return iterable instanceof java.util.Collection ? (java.util.Collection) iterable : kz5.n0.S0(iterable);
    }

    public static final boolean y(java.lang.Iterable iterable, yz5.l lVar, boolean z17) {
        java.util.Iterator it = iterable.iterator();
        boolean z18 = false;
        while (it.hasNext()) {
            if (((java.lang.Boolean) lVar.invoke(it.next())).booleanValue() == z17) {
                it.remove();
                z18 = true;
            }
        }
        return z18;
    }

    public static final boolean z(java.util.List list, yz5.l lVar, boolean z17) {
        int i17;
        if (!(list instanceof java.util.RandomAccess)) {
            kotlin.jvm.internal.o.e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            if (!(list instanceof zz5.a) || (list instanceof zz5.c)) {
                return y(list, lVar, z17);
            }
            kotlin.jvm.internal.m0.j(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        int h17 = kz5.c0.h(list);
        if (h17 >= 0) {
            int i18 = 0;
            i17 = 0;
            while (true) {
                java.lang.Object obj = list.get(i18);
                if (((java.lang.Boolean) lVar.invoke(obj)).booleanValue() != z17) {
                    if (i17 != i18) {
                        list.set(i17, obj);
                    }
                    i17++;
                }
                if (i18 == h17) {
                    break;
                }
                i18++;
            }
        } else {
            i17 = 0;
        }
        if (i17 >= list.size()) {
            return false;
        }
        int h18 = kz5.c0.h(list);
        if (i17 > h18) {
            return true;
        }
        while (true) {
            list.remove(h18);
            if (h18 == i17) {
                return true;
            }
            h18--;
        }
    }
}
