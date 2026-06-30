package kz5;

/* loaded from: classes12.dex */
public abstract class v extends kz5.s {
    public static final void A(java.lang.Object[] objArr, java.util.Comparator comparator) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(comparator, "comparator");
        if (objArr.length > 1) {
            java.util.Arrays.sort(objArr, comparator);
        }
    }

    public static final java.util.List d(float[] fArr) {
        kotlin.jvm.internal.o.g(fArr, "<this>");
        return new kz5.u(fArr);
    }

    public static final java.util.List e(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        return new kz5.t(iArr);
    }

    public static final java.util.List f(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        java.util.List asList = java.util.Arrays.asList(objArr);
        kotlin.jvm.internal.o.f(asList, "asList(...)");
        return asList;
    }

    public static int g(java.lang.Object[] objArr, java.lang.Object obj, int i17, int i18, int i19, java.lang.Object obj2) {
        if ((i19 & 2) != 0) {
            i17 = 0;
        }
        if ((i19 & 4) != 0) {
            i18 = objArr.length;
        }
        kotlin.jvm.internal.o.g(objArr, "<this>");
        return java.util.Arrays.binarySearch(objArr, i17, i18, obj);
    }

    public static final byte[] h(byte[] bArr, byte[] destination, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        java.lang.System.arraycopy(bArr, i18, destination, i17, i19 - i18);
        return destination;
    }

    public static final char[] i(char[] cArr, char[] destination, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(cArr, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        java.lang.System.arraycopy(cArr, i18, destination, i17, i19 - i18);
        return destination;
    }

    public static final int[] j(int[] iArr, int[] destination, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        java.lang.System.arraycopy(iArr, i18, destination, i17, i19 - i18);
        return destination;
    }

    public static final java.lang.Object[] k(java.lang.Object[] objArr, java.lang.Object[] destination, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        java.lang.System.arraycopy(objArr, i18, destination, i17, i19 - i18);
        return destination;
    }

    public static /* synthetic */ byte[] l(byte[] bArr, byte[] bArr2, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 2) != 0) {
            i17 = 0;
        }
        if ((i27 & 4) != 0) {
            i18 = 0;
        }
        if ((i27 & 8) != 0) {
            i19 = bArr.length;
        }
        h(bArr, bArr2, i17, i18, i19);
        return bArr2;
    }

    public static float[] m(float[] fArr, float[] destination, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 2) != 0) {
            i17 = 0;
        }
        if ((i27 & 4) != 0) {
            i18 = 0;
        }
        if ((i27 & 8) != 0) {
            i19 = fArr.length;
        }
        kotlin.jvm.internal.o.g(fArr, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        java.lang.System.arraycopy(fArr, i18, destination, i17, i19 - i18);
        return destination;
    }

    public static /* synthetic */ int[] n(int[] iArr, int[] iArr2, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 2) != 0) {
            i17 = 0;
        }
        if ((i27 & 4) != 0) {
            i18 = 0;
        }
        if ((i27 & 8) != 0) {
            i19 = iArr.length;
        }
        j(iArr, iArr2, i17, i18, i19);
        return iArr2;
    }

    public static long[] o(long[] jArr, long[] destination, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 2) != 0) {
            i17 = 0;
        }
        if ((i27 & 4) != 0) {
            i18 = 0;
        }
        if ((i27 & 8) != 0) {
            i19 = jArr.length;
        }
        kotlin.jvm.internal.o.g(jArr, "<this>");
        kotlin.jvm.internal.o.g(destination, "destination");
        java.lang.System.arraycopy(jArr, i18, destination, i17, i19 - i18);
        return destination;
    }

    public static /* synthetic */ java.lang.Object[] p(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 2) != 0) {
            i17 = 0;
        }
        if ((i27 & 4) != 0) {
            i18 = 0;
        }
        if ((i27 & 8) != 0) {
            i19 = objArr.length;
        }
        k(objArr, objArr2, i17, i18, i19);
        return objArr2;
    }

    public static final byte[] q(byte[] bArr, int i17, int i18) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        kz5.r.a(i18, bArr.length);
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, i17, i18);
        kotlin.jvm.internal.o.f(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static final float[] r(float[] fArr, int i17, int i18) {
        kotlin.jvm.internal.o.g(fArr, "<this>");
        kz5.r.a(i18, fArr.length);
        float[] copyOfRange = java.util.Arrays.copyOfRange(fArr, i17, i18);
        kotlin.jvm.internal.o.f(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static final java.lang.Object[] s(java.lang.Object[] objArr, int i17, int i18) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kz5.r.a(i18, objArr.length);
        java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr, i17, i18);
        kotlin.jvm.internal.o.f(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static final void t(java.lang.Object[] objArr, java.lang.Object obj, int i17, int i18) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        java.util.Arrays.fill(objArr, i17, i18, obj);
    }

    public static void u(java.lang.Object[] objArr, java.lang.Object obj, int i17, int i18, int i19, java.lang.Object obj2) {
        if ((i19 & 2) != 0) {
            i17 = 0;
        }
        if ((i19 & 4) != 0) {
            i18 = objArr.length;
        }
        kotlin.jvm.internal.o.g(objArr, "<this>");
        java.util.Arrays.fill(objArr, i17, i18, obj);
    }

    public static void v(boolean[] zArr, boolean z17, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = 0;
        }
        if ((i19 & 4) != 0) {
            i18 = zArr.length;
        }
        kotlin.jvm.internal.o.g(zArr, "<this>");
        java.util.Arrays.fill(zArr, i17, i18, z17);
    }

    public static final java.util.List w(java.lang.Object[] objArr, java.lang.Class klass) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(klass, "klass");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            if (klass.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final byte[] x(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.o.g(bArr, "<this>");
        kotlin.jvm.internal.o.g(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, length + length2);
        java.lang.System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.o.d(copyOf);
        return copyOf;
    }

    public static final int[] y(int[] iArr, int i17) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = java.util.Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i17;
        return copyOf;
    }

    public static final java.lang.Object[] z(java.lang.Object[] objArr, java.lang.Object[] elements) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        kotlin.jvm.internal.o.g(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, length + length2);
        java.lang.System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.o.d(copyOf);
        return copyOf;
    }
}
