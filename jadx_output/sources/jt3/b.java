package jt3;

/* loaded from: classes10.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final int a(int i17, java.util.List list, java.util.List list2) {
        int size;
        int size2;
        if (-1 != i17) {
            return i17;
        }
        if (list == null || list.isEmpty()) {
            size = 0;
        } else {
            kotlin.jvm.internal.o.d(list);
            size = list.size();
        }
        if (list2 == null || list2.isEmpty()) {
            size2 = 0;
        } else {
            kotlin.jvm.internal.o.d(list2);
            size2 = list2.size();
        }
        if (size <= 2 && size2 == 0) {
            return 1;
        }
        if (size > 2 && size2 == 0) {
            return 3;
        }
        if ((size <= 0 || size2 <= 0) && size2 <= 1 && size <= 1) {
            return (size == 0 && size2 == 1) ? 2 : 0;
        }
        return 4;
    }
}
