package kz5;

/* loaded from: classes14.dex */
public abstract class i0 extends kz5.h0 {
    public static final int F(java.util.List list, int i17) {
        if (i17 >= 0 && i17 <= kz5.c0.h(list)) {
            return kz5.c0.h(list) - i17;
        }
        throw new java.lang.IndexOutOfBoundsException("Element index " + i17 + " must be in range [" + new e06.k(0, kz5.c0.h(list)) + "].");
    }

    public static final int G(java.util.List list, int i17) {
        if (i17 >= 0 && i17 <= list.size()) {
            return list.size() - i17;
        }
        throw new java.lang.IndexOutOfBoundsException("Position index " + i17 + " must be in range [" + new e06.k(0, list.size()) + "].");
    }

    public static final java.util.List H(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        return new kz5.l1(list);
    }
}
