package l36;

/* loaded from: classes16.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String[] f315515a;

    public i0(l36.h0 h0Var) {
        java.util.List list = h0Var.f315502a;
        this.f315515a = (java.lang.String[]) ((java.util.ArrayList) list).toArray(new java.lang.String[((java.util.ArrayList) list).size()]);
    }

    public static void a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            if (charAt <= ' ' || charAt >= 127) {
                throw new java.lang.IllegalArgumentException(m36.e.j("Unexpected char %#04x at %d in header name: %s", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i17), str));
            }
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new java.lang.IllegalArgumentException(m36.e.j("Unexpected char %#04x at %d in %s value: %s", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i17), str2, str));
            }
        }
    }

    public java.lang.String c(java.lang.String str) {
        java.lang.String[] strArr = this.f315515a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public java.lang.String d(int i17) {
        return this.f315515a[i17 * 2];
    }

    public l36.h0 e() {
        l36.h0 h0Var = new l36.h0();
        java.util.Collections.addAll(h0Var.f315502a, this.f315515a);
        return h0Var;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof l36.i0) && java.util.Arrays.equals(((l36.i0) obj).f315515a, this.f315515a);
    }

    public java.lang.String f(int i17) {
        return this.f315515a[(i17 * 2) + 1];
    }

    public java.util.List g(java.lang.String str) {
        int length = this.f315515a.length / 2;
        java.util.ArrayList arrayList = null;
        for (int i17 = 0; i17 < length; i17++) {
            if (str.equalsIgnoreCase(d(i17))) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList(2);
                }
                arrayList.add(f(i17));
            }
        }
        return arrayList != null ? java.util.Collections.unmodifiableList(arrayList) : java.util.Collections.emptyList();
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.f315515a);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = this.f315515a.length / 2;
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append(d(i17));
            sb6.append(": ");
            sb6.append(f(i17));
            sb6.append("\n");
        }
        return sb6.toString();
    }
}
