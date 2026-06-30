package lz5;

/* loaded from: classes14.dex */
public abstract class f {
    public static final boolean a(java.lang.Object[] objArr, int i17, int i18, java.util.List list) {
        if (i18 != list.size()) {
            return false;
        }
        for (int i19 = 0; i19 < i18; i19++) {
            if (!kotlin.jvm.internal.o.b(objArr[i17 + i19], list.get(i19))) {
                return false;
            }
        }
        return true;
    }

    public static final java.lang.String b(java.lang.Object[] objArr, int i17, int i18, java.util.Collection collection) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((i18 * 3) + 2);
        sb6.append("[");
        for (int i19 = 0; i19 < i18; i19++) {
            if (i19 > 0) {
                sb6.append(", ");
            }
            java.lang.Object obj = objArr[i17 + i19];
            if (obj == collection) {
                sb6.append("(this Collection)");
            } else {
                sb6.append(obj);
            }
        }
        sb6.append("]");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final java.lang.Object[] c(int i17) {
        if (i17 >= 0) {
            return new java.lang.Object[i17];
        }
        throw new java.lang.IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final void d(java.lang.Object[] objArr, int i17, int i18) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        while (i17 < i18) {
            objArr[i17] = null;
            i17++;
        }
    }
}
