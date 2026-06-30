package zh;

/* loaded from: classes12.dex */
public abstract class c {
    public static final boolean a(boolean[] zArr) {
        int availableProcessors;
        boolean z17;
        if (zArr == null) {
            return false;
        }
        if (zArr.length == 0) {
            return false;
        }
        int length = zArr.length;
        try {
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/").listFiles(zh.b.f472844a);
            kotlin.jvm.internal.o.d(listFiles);
            availableProcessors = listFiles.length;
        } catch (java.lang.Exception unused) {
            availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        }
        if (length != availableProcessors) {
            return false;
        }
        int length2 = zArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length2) {
                z17 = false;
                break;
            }
            if (zArr[i17]) {
                z17 = true;
                break;
            }
            i17++;
        }
        return z17;
    }

    public static final java.lang.String b(boolean[] zArr) {
        if (zArr == null) {
            return "null";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(zArr.length);
        int length = zArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int i19 = i18 + 1;
            arrayList.add(zArr[i17] ? java.lang.Integer.valueOf(i18) : null);
            i17++;
            i18 = i19;
        }
        return kz5.n0.g0(kz5.n0.V(arrayList), "", null, null, 0, null, zh.a.f472843d, 30, null);
    }

    public static final java.util.List c() {
        int availableProcessors;
        java.util.Collection collection;
        try {
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/").listFiles(zh.b.f472844a);
            kotlin.jvm.internal.o.d(listFiles);
            availableProcessors = listFiles.length;
        } catch (java.lang.Exception unused) {
            availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(availableProcessors);
        for (int i17 = 0; i17 < availableProcessors; i17++) {
            java.lang.String str = "/sys/devices/system/cpu/cpu" + i17 + "/cpufreq/scaling_available_frequencies";
            java.lang.String str2 = null;
            if (!android.text.TextUtils.isEmpty(str)) {
                try {
                    java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
                    try {
                        java.lang.String readLine = randomAccessFile.readLine();
                        vz5.b.a(randomAccessFile, null);
                        str2 = readLine;
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                            break;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(randomAccessFile, th6);
                            throw th7;
                            break;
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    oj.j.d("Matrix.CpuSetUtils", th8, "cat file fail", new java.lang.Object[0]);
                }
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                kotlin.jvm.internal.o.d(str2);
                java.util.List g17 = new r26.t(" ").g(str2, 0);
                if (!g17.isEmpty()) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = kz5.p0.f313996d;
                java.lang.Object[] array = collection.toArray(new java.lang.String[0]);
                if (array == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                java.lang.String[] strArr = (java.lang.String[]) array;
                int[] iArr = new int[strArr.length];
                int length = strArr.length;
                for (int i18 = 0; i18 < length; i18++) {
                    try {
                        iArr[i18] = java.lang.Integer.parseInt(strArr[i18]) / 1000;
                    } catch (java.lang.Exception unused2) {
                        iArr[i18] = 0;
                    }
                }
                arrayList.add(iArr);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Integer h07 = kz5.z.h0((int[]) it.next());
            arrayList2.add(java.lang.Integer.valueOf(h07 != null ? h07.intValue() : 0));
        }
        return arrayList2;
    }

    public static final boolean[] d() {
        boolean z17;
        java.lang.Integer num;
        java.util.List c17 = c();
        if (!c17.isEmpty()) {
            java.util.Iterator it = c17.iterator();
            while (it.hasNext()) {
                if (!(((java.lang.Number) it.next()).intValue() > 0)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (!z17 || (num = (java.lang.Integer) kz5.n0.o0(c17)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c17, 10));
        java.util.Iterator it6 = c17.iterator();
        while (it6.hasNext()) {
            arrayList.add(java.lang.Boolean.valueOf(((java.lang.Number) it6.next()).intValue() == num.intValue()));
        }
        return kz5.n0.M0(arrayList);
    }

    public static final boolean[] e() {
        boolean z17;
        boolean[] d17 = d();
        if (!a(d17)) {
            return null;
        }
        kotlin.jvm.internal.o.d(d17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (boolean z18 : d17) {
            if (z18) {
                arrayList.add(java.lang.Boolean.valueOf(z18));
            }
        }
        int size = arrayList.size();
        if (size <= 1) {
            return null;
        }
        int i17 = (size + 1) / 2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(d17.length);
        int i18 = 0;
        for (boolean z19 : d17) {
            if (!z19 || i18 >= i17) {
                z17 = false;
            } else {
                i18++;
                z17 = true;
            }
            arrayList2.add(java.lang.Boolean.valueOf(z17));
        }
        return kz5.n0.M0(arrayList2);
    }

    public static final boolean[] f() {
        boolean z17;
        java.lang.Integer num;
        boolean z18;
        java.util.List c17 = c();
        if (!c17.isEmpty()) {
            java.util.Iterator it = c17.iterator();
            while (it.hasNext()) {
                if (!(((java.lang.Number) it.next()).intValue() > 0)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (!z17 || (num = (java.lang.Integer) kz5.n0.o0(c17)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c17, 10));
        java.util.Iterator it6 = c17.iterator();
        boolean z19 = false;
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            if (z19 || intValue != num.intValue()) {
                z18 = false;
            } else {
                z19 = true;
                z18 = true;
            }
            arrayList.add(java.lang.Boolean.valueOf(z18));
        }
        return kz5.n0.M0(arrayList);
    }
}
