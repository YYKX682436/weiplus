package l36;

/* loaded from: classes16.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f315502a = new java.util.ArrayList(20);

    public l36.h0 a(java.lang.String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            b(str.substring(0, indexOf), str.substring(indexOf + 1));
            return this;
        }
        if (str.startsWith(":")) {
            b("", str.substring(1));
            return this;
        }
        b("", str);
        return this;
    }

    public l36.h0 b(java.lang.String str, java.lang.String str2) {
        java.util.List list = this.f315502a;
        ((java.util.ArrayList) list).add(str);
        ((java.util.ArrayList) list).add(str2.trim());
        return this;
    }

    public java.lang.String c(java.lang.String str) {
        java.util.List list = this.f315502a;
        for (int size = ((java.util.ArrayList) list).size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((java.lang.String) ((java.util.ArrayList) list).get(size))) {
                return (java.lang.String) ((java.util.ArrayList) list).get(size + 1);
            }
        }
        return null;
    }

    public l36.h0 d(java.lang.String str) {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f315502a;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return this;
            }
            if (str.equalsIgnoreCase((java.lang.String) ((java.util.ArrayList) list).get(i17))) {
                ((java.util.ArrayList) list).remove(i17);
                ((java.util.ArrayList) list).remove(i17);
                i17 -= 2;
            }
            i17 += 2;
        }
    }

    public l36.h0 e(java.lang.String str, java.lang.String str2) {
        l36.i0.a(str);
        l36.i0.b(str2, str);
        d(str);
        b(str, str2);
        return this;
    }
}
