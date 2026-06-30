package vz5;

/* loaded from: classes7.dex */
public abstract class n {
    public static final int a(java.lang.String str) {
        int K;
        int K2 = r26.n0.K(str, java.io.File.separatorChar, 0, false, 4, null);
        if (K2 != 0) {
            if (K2 > 0 && str.charAt(K2 - 1) == ':') {
                return K2 + 1;
            }
            if (K2 == -1 && r26.n0.E(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char charAt = str.charAt(1);
            char c17 = java.io.File.separatorChar;
            if (charAt == c17 && (K = r26.n0.K(str, c17, 2, false, 4, null)) >= 0) {
                int K3 = r26.n0.K(str, java.io.File.separatorChar, K + 1, false, 4, null);
                return K3 >= 0 ? K3 + 1 : str.length();
            }
        }
        return 1;
    }

    public static final vz5.d b(java.io.File file) {
        java.util.List list;
        kotlin.jvm.internal.o.g(file, "<this>");
        java.lang.String path = file.getPath();
        kotlin.jvm.internal.o.d(path);
        int a17 = a(path);
        java.lang.String substring = path.substring(0, a17);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = path.substring(a17);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        if (substring2.length() == 0) {
            list = kz5.p0.f313996d;
        } else {
            java.util.List e07 = r26.n0.e0(substring2, new char[]{java.io.File.separatorChar}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(e07, 10));
            java.util.Iterator it = e07.iterator();
            while (it.hasNext()) {
                arrayList.add(new java.io.File((java.lang.String) it.next()));
            }
            list = arrayList;
        }
        return new vz5.d(new java.io.File(substring), list);
    }
}
