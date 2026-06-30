package r26;

/* loaded from: classes5.dex */
public abstract class b0 extends r26.y {
    public static final java.lang.String b(java.lang.String str) {
        int i17;
        kotlin.jvm.internal.o.g(str, "<this>");
        java.util.List Q = r26.n0.Q(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = Q.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (true ^ r26.n0.N((java.lang.String) next)) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            i17 = 0;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.String str2 = (java.lang.String) it6.next();
            int length = str2.length();
            while (true) {
                if (i17 >= length) {
                    i17 = -1;
                    break;
                }
                if (!r26.a.b(str2.charAt(i17))) {
                    break;
                }
                i17++;
            }
            if (i17 == -1) {
                i17 = str2.length();
            }
            arrayList2.add(java.lang.Integer.valueOf(i17));
        }
        java.lang.Integer num = (java.lang.Integer) kz5.n0.o0(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length() + (Q.size() * 0);
        yz5.l a0Var = "".length() == 0 ? r26.z.f368922d : new r26.a0("");
        int h17 = kz5.c0.h(Q);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : Q) {
            int i18 = i17 + 1;
            java.lang.String str3 = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str4 = (java.lang.String) obj;
            if (((i17 != 0 && i17 != h17) || !r26.n0.N(str4)) && (str3 = (java.lang.String) a0Var.invoke(r26.p0.y0(str4, intValue))) == null) {
                str3 = str4;
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i17 = i18;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length2);
        kz5.n0.f0(arrayList3, sb6, "\n", null, null, 0, null, null, 124, null);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        int i18;
        java.lang.String str3;
        boolean z17 = true;
        java.lang.String marginPrefix = (i17 & 1) != 0 ? "|" : str2;
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(marginPrefix, "marginPrefix");
        if (!(!r26.n0.N(marginPrefix))) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        java.util.List Q = r26.n0.Q(str);
        int length = str.length() + (Q.size() * 0);
        yz5.l a0Var = "".length() == 0 ? r26.z.f368922d : new r26.a0("");
        int h17 = kz5.c0.h(Q);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i19 = 0;
        for (java.lang.Object obj2 : Q) {
            int i27 = i19 + 1;
            java.lang.String str4 = null;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str5 = (java.lang.String) obj2;
            if ((i19 != 0 && i19 != h17) || !r26.n0.N(str5)) {
                int length2 = str5.length();
                int i28 = 0;
                while (true) {
                    if (i28 >= length2) {
                        i18 = -1;
                        break;
                    }
                    if (r26.a.b(str5.charAt(i28)) ^ z17) {
                        i18 = i28;
                        break;
                    }
                    i28++;
                }
                if (i18 == -1) {
                    str3 = str5;
                } else {
                    int i29 = i18;
                    str3 = str5;
                    if (r26.i0.z(str5, marginPrefix, i18, false, 4, null)) {
                        str4 = str3.substring(i29 + marginPrefix.length());
                        kotlin.jvm.internal.o.f(str4, "substring(...)");
                    }
                }
                if (str4 == null || (str4 = (java.lang.String) a0Var.invoke(str4)) == null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i19 = i27;
            z17 = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length);
        kz5.n0.f0(arrayList, sb6, "\n", null, null, 0, null, null, 124, null);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
