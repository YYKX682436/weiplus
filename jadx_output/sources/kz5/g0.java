package kz5;

/* loaded from: classes.dex */
public abstract class g0 extends kz5.f0 {
    public static final void s(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.size() > 1) {
            java.util.Collections.sort(list);
        }
    }

    public static final void t(java.util.List list, java.util.Comparator comparator) {
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(comparator, "comparator");
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }
}
