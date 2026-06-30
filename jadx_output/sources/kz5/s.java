package kz5;

/* loaded from: classes12.dex */
public abstract class s extends kz5.r {
    public static final java.lang.String b(java.lang.Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        int length = objArr.length;
        if (length > 429496729) {
            length = 429496729;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((length * 5) + 2);
        c(objArr, sb6, new java.util.ArrayList());
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final void c(java.lang.Object[] objArr, java.lang.StringBuilder sb6, java.util.List list) {
        if (list.contains(objArr)) {
            sb6.append("[...]");
            return;
        }
        list.add(objArr);
        sb6.append('[');
        int length = objArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(", ");
            }
            java.lang.Object obj = objArr[i17];
            if (obj == null) {
                sb6.append("null");
            } else if (obj instanceof java.lang.Object[]) {
                c((java.lang.Object[]) obj, sb6, list);
            } else if (obj instanceof byte[]) {
                java.lang.String arrays = java.util.Arrays.toString((byte[]) obj);
                kotlin.jvm.internal.o.f(arrays, "toString(...)");
                sb6.append(arrays);
            } else if (obj instanceof short[]) {
                java.lang.String arrays2 = java.util.Arrays.toString((short[]) obj);
                kotlin.jvm.internal.o.f(arrays2, "toString(...)");
                sb6.append(arrays2);
            } else if (obj instanceof int[]) {
                java.lang.String arrays3 = java.util.Arrays.toString((int[]) obj);
                kotlin.jvm.internal.o.f(arrays3, "toString(...)");
                sb6.append(arrays3);
            } else if (obj instanceof long[]) {
                java.lang.String arrays4 = java.util.Arrays.toString((long[]) obj);
                kotlin.jvm.internal.o.f(arrays4, "toString(...)");
                sb6.append(arrays4);
            } else if (obj instanceof float[]) {
                java.lang.String arrays5 = java.util.Arrays.toString((float[]) obj);
                kotlin.jvm.internal.o.f(arrays5, "toString(...)");
                sb6.append(arrays5);
            } else if (obj instanceof double[]) {
                java.lang.String arrays6 = java.util.Arrays.toString((double[]) obj);
                kotlin.jvm.internal.o.f(arrays6, "toString(...)");
                sb6.append(arrays6);
            } else if (obj instanceof char[]) {
                java.lang.String arrays7 = java.util.Arrays.toString((char[]) obj);
                kotlin.jvm.internal.o.f(arrays7, "toString(...)");
                sb6.append(arrays7);
            } else if (obj instanceof boolean[]) {
                java.lang.String arrays8 = java.util.Arrays.toString((boolean[]) obj);
                kotlin.jvm.internal.o.f(arrays8, "toString(...)");
                sb6.append(arrays8);
            } else if (obj instanceof jz5.t) {
                byte[] bArr = ((jz5.t) obj).f302847d;
                sb6.append(bArr != null ? kz5.n0.g0(new jz5.t(bArr), ", ", "[", "]", 0, null, null, 56, null) : "null");
            } else if (obj instanceof jz5.d0) {
                short[] sArr = ((jz5.d0) obj).f302820d;
                sb6.append(sArr != null ? kz5.n0.g0(new jz5.d0(sArr), ", ", "[", "]", 0, null, null, 56, null) : "null");
            } else if (obj instanceof jz5.w) {
                int[] iArr = ((jz5.w) obj).f302851d;
                sb6.append(iArr != null ? kz5.n0.g0(new jz5.w(iArr), ", ", "[", "]", 0, null, null, 56, null) : "null");
            } else if (obj instanceof jz5.z) {
                long[] jArr = ((jz5.z) obj).f302855d;
                sb6.append(jArr != null ? kz5.n0.g0(new jz5.z(jArr), ", ", "[", "]", 0, null, null, 56, null) : "null");
            } else {
                sb6.append(obj.toString());
            }
        }
        sb6.append(']');
        list.remove(kz5.c0.h(list));
    }
}
