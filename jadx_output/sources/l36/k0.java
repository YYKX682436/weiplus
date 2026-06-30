package l36;

/* loaded from: classes16.dex */
public final class k0 {

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f315530i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f315531a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315532b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f315533c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f315534d;

    /* renamed from: e, reason: collision with root package name */
    public final int f315535e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315536f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f315537g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f315538h;

    public k0(l36.j0 j0Var) {
        this.f315531a = j0Var.f315518a;
        java.lang.String str = j0Var.f315519b;
        this.f315532b = j(str, 0, str.length(), false);
        java.lang.String str2 = j0Var.f315520c;
        this.f315533c = j(str2, 0, str2.length(), false);
        this.f315534d = j0Var.f315521d;
        int i17 = j0Var.f315522e;
        this.f315535e = i17 == -1 ? c(j0Var.f315518a) : i17;
        k(j0Var.f315523f, false);
        java.util.List list = j0Var.f315524g;
        this.f315536f = list != null ? k(list, true) : null;
        java.lang.String str3 = j0Var.f315525h;
        this.f315537g = str3 != null ? j(str3, 0, str3.length(), false) : null;
        this.f315538h = j0Var.toString();
    }

    public static java.lang.String a(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18, boolean z19, boolean z27, java.nio.charset.Charset charset) {
        int i19 = i17;
        while (i19 < i18) {
            int codePointAt = str.codePointAt(i19);
            int i27 = -1;
            int i28 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z27) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z17 || (z18 && !l(str, i19, i18)))) || (codePointAt == 43 && z19)))) {
                x36.k kVar = new x36.k();
                kVar.P(str, i17, i19);
                x36.k kVar2 = null;
                while (i19 < i18) {
                    int codePointAt2 = str.codePointAt(i19);
                    if (!z17 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z19) {
                            kVar.O(z17 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i28 && z27) || str2.indexOf(codePointAt2) != i27 || (codePointAt2 == 37 && (!z17 || (z18 && !l(str, i19, i18)))))) {
                            if (kVar2 == null) {
                                kVar2 = new x36.k();
                            }
                            if (charset == null || charset.equals(m36.e.f323389d)) {
                                kVar2.Q(codePointAt2);
                            } else {
                                int charCount = java.lang.Character.charCount(codePointAt2) + i19;
                                if (!(i19 >= 0)) {
                                    throw new java.lang.IllegalArgumentException(("beginIndex < 0: " + i19).toString());
                                }
                                if (!(charCount >= i19)) {
                                    throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + charCount + " < " + i19).toString());
                                }
                                if (!(charCount <= str.length())) {
                                    throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + charCount + " > " + str.length()).toString());
                                }
                                if (kotlin.jvm.internal.o.b(charset, r26.c.f368865a)) {
                                    kVar2.P(str, i19, charCount);
                                } else {
                                    java.lang.String substring = str.substring(i19, charCount);
                                    kotlin.jvm.internal.o.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    byte[] bytes = substring.getBytes(charset);
                                    kotlin.jvm.internal.o.f(bytes, "(this as java.lang.String).getBytes(charset)");
                                    kVar2.A(bytes, 0, bytes.length);
                                }
                            }
                            while (!kVar2.o1()) {
                                int readByte = kVar2.readByte() & 255;
                                kVar.F(37);
                                char[] cArr = f315530i;
                                kVar.F(cArr[(readByte >> 4) & 15]);
                                kVar.F(cArr[readByte & 15]);
                            }
                        } else {
                            kVar.Q(codePointAt2);
                        }
                    }
                    i19 += java.lang.Character.charCount(codePointAt2);
                    i27 = -1;
                    i28 = 128;
                }
                return kVar.q();
            }
            i19 += java.lang.Character.charCount(codePointAt);
        }
        return str.substring(i17, i18);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, boolean z27) {
        return a(str, 0, str.length(), str2, z17, z18, z19, z27, null);
    }

    public static int c(java.lang.String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX;
        }
        return -1;
    }

    public static void i(java.lang.StringBuilder sb6, java.util.List list) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17 += 2) {
            java.lang.String str = (java.lang.String) list.get(i17);
            java.lang.String str2 = (java.lang.String) list.get(i17 + 1);
            if (i17 > 0) {
                sb6.append('&');
            }
            sb6.append(str);
            if (str2 != null) {
                sb6.append('=');
                sb6.append(str2);
            }
        }
    }

    public static java.lang.String j(java.lang.String str, int i17, int i18, boolean z17) {
        int i19;
        int i27 = i17;
        while (i27 < i18) {
            char charAt = str.charAt(i27);
            if (charAt == '%' || (charAt == '+' && z17)) {
                x36.k kVar = new x36.k();
                kVar.P(str, i17, i27);
                while (i27 < i18) {
                    int codePointAt = str.codePointAt(i27);
                    if (codePointAt != 37 || (i19 = i27 + 2) >= i18) {
                        if (codePointAt == 43 && z17) {
                            kVar.F(32);
                        }
                        kVar.Q(codePointAt);
                    } else {
                        int e17 = m36.e.e(str.charAt(i27 + 1));
                        int e18 = m36.e.e(str.charAt(i19));
                        if (e17 != -1 && e18 != -1) {
                            kVar.F((e17 << 4) + e18);
                            i27 = i19;
                        }
                        kVar.Q(codePointAt);
                    }
                    i27 += java.lang.Character.charCount(codePointAt);
                }
                return kVar.q();
            }
            i27++;
        }
        return str.substring(i17, i18);
    }

    public static boolean l(java.lang.String str, int i17, int i18) {
        int i19 = i17 + 2;
        return i19 < i18 && str.charAt(i17) == '%' && m36.e.e(str.charAt(i17 + 1)) != -1 && m36.e.e(str.charAt(i19)) != -1;
    }

    public static java.util.List m(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (i17 <= str.length()) {
            int indexOf = str.indexOf(38, i17);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i17);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i17, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i17, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i17 = indexOf + 1;
        }
        return arrayList;
    }

    public java.lang.String d() {
        if (this.f315533c.isEmpty()) {
            return "";
        }
        int length = this.f315531a.length() + 3;
        java.lang.String str = this.f315538h;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public java.lang.String e() {
        int length = this.f315531a.length() + 3;
        java.lang.String str = this.f315538h;
        int indexOf = str.indexOf(47, length);
        return str.substring(indexOf, m36.e.h(str, indexOf, str.length(), "?#"));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof l36.k0) && ((l36.k0) obj).f315538h.equals(this.f315538h);
    }

    public java.util.List f() {
        int length = this.f315531a.length() + 3;
        java.lang.String str = this.f315538h;
        int indexOf = str.indexOf(47, length);
        int h17 = m36.e.h(str, indexOf, str.length(), "?#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (indexOf < h17) {
            int i17 = indexOf + 1;
            int g17 = m36.e.g(str, i17, h17, '/');
            arrayList.add(str.substring(i17, g17));
            indexOf = g17;
        }
        return arrayList;
    }

    public java.lang.String g() {
        if (this.f315536f == null) {
            return null;
        }
        java.lang.String str = this.f315538h;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, m36.e.g(str, indexOf, str.length(), '#'));
    }

    public java.lang.String h() {
        if (this.f315532b.isEmpty()) {
            return "";
        }
        int length = this.f315531a.length() + 3;
        java.lang.String str = this.f315538h;
        return str.substring(length, m36.e.h(str, length, str.length(), ":@"));
    }

    public int hashCode() {
        return this.f315538h.hashCode();
    }

    public final java.util.List k(java.util.List list, boolean z17) {
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = (java.lang.String) list.get(i17);
            arrayList.add(str != null ? j(str, 0, str.length(), z17) : null);
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public java.lang.String n() {
        l36.j0 j0Var;
        try {
            j0Var = new l36.j0();
            j0Var.b(this, "/...");
        } catch (java.lang.IllegalArgumentException unused) {
            j0Var = null;
        }
        j0Var.getClass();
        j0Var.f315519b = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        j0Var.f315520c = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return j0Var.a().f315538h;
    }

    public java.net.URI o() {
        l36.j0 j0Var = new l36.j0();
        java.lang.String str = this.f315531a;
        j0Var.f315518a = str;
        j0Var.f315519b = h();
        j0Var.f315520c = d();
        j0Var.f315521d = this.f315534d;
        int c17 = c(str);
        int i17 = this.f315535e;
        if (i17 == c17) {
            i17 = -1;
        }
        j0Var.f315522e = i17;
        java.util.List list = j0Var.f315523f;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        arrayList.addAll(f());
        java.lang.String g17 = g();
        java.lang.String str2 = null;
        j0Var.f315524g = g17 != null ? m(b(g17, " \"'<>#", true, false, true, true)) : null;
        if (this.f315537g != null) {
            java.lang.String str3 = this.f315538h;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        j0Var.f315525h = str2;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        int size = arrayList2.size();
        for (int i18 = 0; i18 < size; i18++) {
            arrayList2.set(i18, b((java.lang.String) arrayList2.get(i18), "[]", true, true, false, true));
        }
        java.util.List list2 = j0Var.f315524g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                java.lang.String str4 = (java.lang.String) j0Var.f315524g.get(i19);
                if (str4 != null) {
                    j0Var.f315524g.set(i19, b(str4, "\\^`{|}", true, true, true, true));
                }
            }
        }
        java.lang.String str5 = j0Var.f315525h;
        if (str5 != null) {
            j0Var.f315525h = b(str5, " \"#<>\\^`{|}", true, true, false, false);
        }
        java.lang.String j0Var2 = j0Var.toString();
        try {
            return new java.net.URI(j0Var2);
        } catch (java.net.URISyntaxException e17) {
            try {
                return java.net.URI.create(j0Var2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    public java.lang.String toString() {
        return this.f315538h;
    }
}
