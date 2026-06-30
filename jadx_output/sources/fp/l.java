package fp;

/* loaded from: classes3.dex */
public abstract class l {
    public static final java.lang.Object a(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static final java.lang.Object b(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(kz5.c0.h(list));
    }
}
