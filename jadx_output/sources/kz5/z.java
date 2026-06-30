package kz5;

/* loaded from: classes12.dex */
public abstract class z extends kz5.v {
    public static final java.util.List A0(float[] fArr) {
        kotlin.jvm.internal.o.g(fArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(fArr.length);
        for (float f17 : fArr) {
            arrayList.add(java.lang.Float.valueOf(f17));
        }
        return arrayList;
    }

    public static final java.lang.Iterable B(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        return objArr.length == 0 ? kz5.p0.f313996d : new kz5.w(objArr);
    }

    public static final java.util.List B0(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return arrayList;
    }

    public static final q26.n C(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        return objArr.length == 0 ? q26.g.f359840a : new kz5.x(objArr);
    }

    public static final java.util.List C0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        return new java.util.ArrayList(new kz5.p(objArr, false));
    }

    public static final boolean D(byte[] bArr, byte b17) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        int length = bArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                i17 = -1;
                break;
            }
            if (b17 == bArr[i17]) {
                break;
            }
            i17++;
        }
        return i17 >= 0;
    }

    public static final java.util.Set D0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return kz5.r0.f314002d;
        }
        if (length == 1) {
            return kz5.o1.c(objArr[0]);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kz5.b1.d(objArr.length));
        u0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final boolean E(char[] cArr, char c17) {
        kotlin.jvm.internal.o.g(cArr, "<this>");
        int length = cArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                i17 = -1;
                break;
            }
            if (c17 == cArr[i17]) {
                break;
            }
            i17++;
        }
        return i17 >= 0;
    }

    public static final boolean F(int[] iArr, int i17) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        return V(iArr, i17) >= 0;
    }

    public static final boolean G(java.lang.Object[] objArr, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        return X(objArr, obj) >= 0;
    }

    public static final java.util.List H(java.lang.Object[] objArr, int i17) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        if (i17 >= 0) {
            int length = objArr.length - i17;
            return t0(objArr, length >= 0 ? length : 0);
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
    }

    public static final java.util.List I(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final float J(float[] fArr) {
        kotlin.jvm.internal.o.g(fArr, "<this>");
        if (fArr.length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    public static final int K(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        if (iArr.length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static final java.lang.Object L(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        if (objArr.length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        return objArr[0];
    }

    public static final java.lang.Integer M(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return java.lang.Integer.valueOf(iArr[0]);
    }

    public static final java.lang.Long N(long[] jArr) {
        kotlin.jvm.internal.o.g(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return java.lang.Long.valueOf(jArr[0]);
    }

    public static final java.lang.Object O(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final int P(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final java.lang.Byte Q(byte[] bArr, int i17) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < bArr.length) {
            z17 = true;
        }
        if (z17) {
            return java.lang.Byte.valueOf(bArr[i17]);
        }
        return null;
    }

    public static final java.lang.Character R(char[] cArr, int i17) {
        kotlin.jvm.internal.o.g(cArr, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < cArr.length) {
            z17 = true;
        }
        if (z17) {
            return java.lang.Character.valueOf(cArr[i17]);
        }
        return null;
    }

    public static final java.lang.Integer S(int[] iArr, int i17) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < iArr.length) {
            z17 = true;
        }
        if (z17) {
            return java.lang.Integer.valueOf(iArr[i17]);
        }
        return null;
    }

    public static final java.lang.Long T(long[] jArr, int i17) {
        kotlin.jvm.internal.o.g(jArr, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < jArr.length) {
            z17 = true;
        }
        if (z17) {
            return java.lang.Long.valueOf(jArr[i17]);
        }
        return null;
    }

    public static final java.lang.Object U(java.lang.Object[] objArr, int i17) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < objArr.length) {
            z17 = true;
        }
        if (z17) {
            return objArr[i17];
        }
        return null;
    }

    public static final int V(int[] iArr, int i17) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        int length = iArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            if (i17 == iArr[i18]) {
                return i18;
            }
        }
        return -1;
    }

    public static final int W(long[] jArr, long j17) {
        kotlin.jvm.internal.o.g(jArr, "<this>");
        int length = jArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (j17 == jArr[i17]) {
                return i17;
            }
        }
        return -1;
    }

    public static final int X(java.lang.Object[] objArr, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        int i17 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i17 < length) {
                if (objArr[i17] == null) {
                    return i17;
                }
                i17++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i17 < length2) {
            if (kotlin.jvm.internal.o.b(obj, objArr[i17])) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public static final java.lang.Appendable Y(java.lang.Object[] objArr, java.lang.Appendable buffer, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int i17, java.lang.CharSequence truncated, yz5.l lVar) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(separator, "separator");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(postfix, "postfix");
        kotlin.jvm.internal.o.g(truncated, "truncated");
        buffer.append(prefix);
        int i18 = 0;
        for (java.lang.Object obj : objArr) {
            i18++;
            if (i18 > 1) {
                buffer.append(separator);
            }
            if (i17 >= 0 && i18 > i17) {
                break;
            }
            r26.y.a(buffer, obj, lVar);
        }
        if (i17 >= 0 && i18 > i17) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ java.lang.Appendable Z(java.lang.Object[] objArr, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i17, java.lang.CharSequence charSequence4, yz5.l lVar, int i18, java.lang.Object obj) {
        Y(objArr, appendable, (i18 & 2) != 0 ? ", " : charSequence, (i18 & 4) != 0 ? "" : charSequence2, (i18 & 8) == 0 ? charSequence3 : "", (i18 & 16) != 0 ? -1 : i17, (i18 & 32) != 0 ? "..." : charSequence4, (i18 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static java.lang.String a0(byte[] bArr, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int i17, java.lang.CharSequence truncated, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            separator = ", ";
        }
        if ((i18 & 2) != 0) {
            prefix = "";
        }
        if ((i18 & 4) != 0) {
            postfix = "";
        }
        if ((i18 & 8) != 0) {
            i17 = -1;
        }
        if ((i18 & 16) != 0) {
            truncated = "...";
        }
        if ((i18 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.o.g(bArr, "<this>");
        kotlin.jvm.internal.o.g(separator, "separator");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(postfix, "postfix");
        kotlin.jvm.internal.o.g(truncated, "truncated");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(prefix);
        int i19 = 0;
        for (byte b17 : bArr) {
            i19++;
            if (i19 > 1) {
                sb6.append(separator);
            }
            if (i17 >= 0 && i19 > i17) {
                break;
            }
            if (lVar != null) {
                sb6.append((java.lang.CharSequence) lVar.invoke(java.lang.Byte.valueOf(b17)));
            } else {
                sb6.append((java.lang.CharSequence) java.lang.String.valueOf((int) b17));
            }
        }
        if (i17 >= 0 && i19 > i17) {
            sb6.append(truncated);
        }
        sb6.append(postfix);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static java.lang.String b0(float[] fArr, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int i17, java.lang.CharSequence truncated, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            separator = ", ";
        }
        if ((i18 & 2) != 0) {
            prefix = "";
        }
        if ((i18 & 4) != 0) {
            postfix = "";
        }
        if ((i18 & 8) != 0) {
            i17 = -1;
        }
        if ((i18 & 16) != 0) {
            truncated = "...";
        }
        if ((i18 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.o.g(fArr, "<this>");
        kotlin.jvm.internal.o.g(separator, "separator");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(postfix, "postfix");
        kotlin.jvm.internal.o.g(truncated, "truncated");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(prefix);
        int i19 = 0;
        for (float f17 : fArr) {
            i19++;
            if (i19 > 1) {
                sb6.append(separator);
            }
            if (i17 >= 0 && i19 > i17) {
                break;
            }
            if (lVar != null) {
                sb6.append((java.lang.CharSequence) lVar.invoke(java.lang.Float.valueOf(f17)));
            } else {
                sb6.append((java.lang.CharSequence) java.lang.String.valueOf(f17));
            }
        }
        if (i17 >= 0 && i19 > i17) {
            sb6.append(truncated);
        }
        sb6.append(postfix);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static java.lang.String c0(int[] iArr, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int i17, java.lang.CharSequence truncated, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            separator = ", ";
        }
        if ((i18 & 2) != 0) {
            prefix = "";
        }
        if ((i18 & 4) != 0) {
            postfix = "";
        }
        if ((i18 & 8) != 0) {
            i17 = -1;
        }
        if ((i18 & 16) != 0) {
            truncated = "...";
        }
        if ((i18 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.o.g(iArr, "<this>");
        kotlin.jvm.internal.o.g(separator, "separator");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(postfix, "postfix");
        kotlin.jvm.internal.o.g(truncated, "truncated");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(prefix);
        int i19 = 0;
        for (int i27 : iArr) {
            i19++;
            if (i19 > 1) {
                sb6.append(separator);
            }
            if (i17 >= 0 && i19 > i17) {
                break;
            }
            if (lVar != null) {
                sb6.append((java.lang.CharSequence) lVar.invoke(java.lang.Integer.valueOf(i27)));
            } else {
                sb6.append((java.lang.CharSequence) java.lang.String.valueOf(i27));
            }
        }
        if (i17 >= 0 && i19 > i17) {
            sb6.append(truncated);
        }
        sb6.append(postfix);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static java.lang.String d0(java.lang.Object[] objArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i17, java.lang.CharSequence charSequence4, yz5.l lVar, int i18, java.lang.Object obj) {
        java.lang.CharSequence separator = (i18 & 1) != 0 ? ", " : charSequence;
        java.lang.CharSequence prefix = (i18 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence postfix = (i18 & 4) == 0 ? charSequence3 : "";
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        java.lang.CharSequence truncated = (i18 & 16) != 0 ? "..." : charSequence4;
        yz5.l lVar2 = (i18 & 32) != 0 ? null : lVar;
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(separator, "separator");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(postfix, "postfix");
        kotlin.jvm.internal.o.g(truncated, "truncated");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        Y(objArr, sb6, separator, prefix, postfix, i19, truncated, lVar2);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final int e0(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        if (iArr.length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        return iArr[iArr.length - 1];
    }

    public static final java.lang.Object f0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        if (objArr.length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        return objArr[objArr.length - 1];
    }

    public static final java.lang.Float g0(float[] fArr) {
        kotlin.jvm.internal.o.g(fArr, "<this>");
        int i17 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float f17 = fArr[0];
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f17 = java.lang.Math.max(f17, fArr[i17]);
                if (i17 == length) {
                    break;
                }
                i17++;
            }
        }
        return java.lang.Float.valueOf(f17);
    }

    public static final java.lang.Integer h0(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        int i17 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i18 = iArr[0];
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i19 = iArr[i17];
                if (i18 < i19) {
                    i18 = i19;
                }
                if (i17 == length) {
                    break;
                }
                i17++;
            }
        }
        return java.lang.Integer.valueOf(i18);
    }

    public static final java.lang.Float i0(float[] fArr) {
        kotlin.jvm.internal.o.g(fArr, "<this>");
        int i17 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float f17 = fArr[0];
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f17 = java.lang.Math.min(f17, fArr[i17]);
                if (i17 == length) {
                    break;
                }
                i17++;
            }
        }
        return java.lang.Float.valueOf(f17);
    }

    public static final java.lang.Integer j0(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        int i17 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i18 = iArr[0];
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i19 = iArr[i17];
                if (i18 > i19) {
                    i18 = i19;
                }
                if (i17 == length) {
                    break;
                }
                i17++;
            }
        }
        return java.lang.Integer.valueOf(i18);
    }

    public static final char k0(char[] cArr) {
        kotlin.jvm.internal.o.g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static final java.lang.Object l0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static final java.util.List m0(float[] fArr, e06.k indices) {
        kotlin.jvm.internal.o.g(fArr, "<this>");
        kotlin.jvm.internal.o.g(indices, "indices");
        return indices.isEmpty() ? kz5.p0.f313996d : kz5.v.d(kz5.v.r(fArr, indices.h().intValue(), indices.g().intValue() + 1));
    }

    public static final java.util.List n0(java.lang.Object[] objArr, e06.k indices) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(indices, "indices");
        return indices.isEmpty() ? kz5.p0.f313996d : kz5.v.f(kz5.v.s(objArr, indices.h().intValue(), indices.g().intValue() + 1));
    }

    public static final byte[] o0(byte[] bArr, e06.k indices) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        kotlin.jvm.internal.o.g(indices, "indices");
        return indices.isEmpty() ? new byte[0] : kz5.v.q(bArr, indices.h().intValue(), indices.g().intValue() + 1);
    }

    public static final java.lang.Object[] p0(java.lang.Object[] objArr, e06.k indices) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(indices, "indices");
        return indices.isEmpty() ? kz5.v.s(objArr, 0, 0) : kz5.v.s(objArr, indices.h().intValue(), indices.g().intValue() + 1);
    }

    public static final java.util.List q0(java.lang.Object[] objArr, java.util.Comparator comparator) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(comparator, "comparator");
        if (!(objArr.length == 0)) {
            objArr = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.f(objArr, "copyOf(...)");
            kz5.v.A(objArr, comparator);
        }
        return kz5.v.f(objArr);
    }

    public static final java.util.List r0(int[] iArr, int i17) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
        }
        if (i17 == 0) {
            return kz5.p0.f313996d;
        }
        if (i17 >= iArr.length) {
            return x0(iArr);
        }
        if (i17 == 1) {
            return kz5.b0.c(java.lang.Integer.valueOf(iArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        int i18 = 0;
        for (int i19 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i19));
            i18++;
            if (i18 == i17) {
                break;
            }
        }
        return arrayList;
    }

    public static final java.util.List s0(java.lang.Object[] objArr, int i17) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
        }
        if (i17 == 0) {
            return kz5.p0.f313996d;
        }
        if (i17 >= objArr.length) {
            return z0(objArr);
        }
        if (i17 == 1) {
            return kz5.b0.c(objArr[0]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        int i18 = 0;
        for (java.lang.Object obj : objArr) {
            arrayList.add(obj);
            i18++;
            if (i18 == i17) {
                break;
            }
        }
        return arrayList;
    }

    public static final java.util.List t0(java.lang.Object[] objArr, int i17) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
        }
        if (i17 == 0) {
            return kz5.p0.f313996d;
        }
        int length = objArr.length;
        if (i17 >= length) {
            return z0(objArr);
        }
        if (i17 == 1) {
            return kz5.b0.c(objArr[length - 1]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = length - i17; i18 < length; i18++) {
            arrayList.add(objArr[i18]);
        }
        return arrayList;
    }

    public static final java.util.Collection u0(java.lang.Object[] objArr, java.util.Collection destination) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        for (java.lang.Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static final java.util.List v0(byte[] bArr) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return kz5.p0.f313996d;
        }
        if (length == 1) {
            return kz5.b0.c(java.lang.Byte.valueOf(bArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
        for (byte b17 : bArr) {
            arrayList.add(java.lang.Byte.valueOf(b17));
        }
        return arrayList;
    }

    public static final java.util.List w0(float[] fArr) {
        kotlin.jvm.internal.o.g(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? A0(fArr) : kz5.b0.c(java.lang.Float.valueOf(fArr[0])) : kz5.p0.f313996d;
    }

    public static final java.util.List x0(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? B0(iArr) : kz5.b0.c(java.lang.Integer.valueOf(iArr[0])) : kz5.p0.f313996d;
    }

    public static final java.util.List y0(long[] jArr) {
        kotlin.jvm.internal.o.g(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return kz5.p0.f313996d;
        }
        if (length == 1) {
            return kz5.b0.c(java.lang.Long.valueOf(jArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(jArr.length);
        for (long j17 : jArr) {
            arrayList.add(java.lang.Long.valueOf(j17));
        }
        return arrayList;
    }

    public static final java.util.List z0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? C0(objArr) : kz5.b0.c(objArr[0]) : kz5.p0.f313996d;
    }
}
