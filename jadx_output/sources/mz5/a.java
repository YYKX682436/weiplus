package mz5;

/* loaded from: classes5.dex */
public abstract class a {
    public static final java.util.Comparator a(yz5.l... selectors) {
        kotlin.jvm.internal.o.g(selectors, "selectors");
        if (selectors.length > 0) {
            return new mz5.a$$a(selectors);
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int b(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
