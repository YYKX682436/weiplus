package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class f1 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f212919c = java.util.regex.Pattern.compile("\\$\\{([A-Za-z0-9_]+)\\}");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Comparator f212920d = new com.tencent.mm.vfs.d1();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f212921a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.vfs.e1[] f212922b;

    public f1(java.lang.String str) {
        this.f212921a = str;
        if (str == null) {
            this.f212922b = null;
            return;
        }
        java.util.regex.Matcher matcher = f212919c.matcher(str);
        if (!matcher.find()) {
            this.f212922b = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            arrayList.add(new com.tencent.mm.vfs.e1(matcher.group(1), matcher.start(), matcher.end()));
        } while (matcher.find());
        com.tencent.mm.vfs.e1[] e1VarArr = (com.tencent.mm.vfs.e1[]) arrayList.toArray(new com.tencent.mm.vfs.e1[0]);
        this.f212922b = e1VarArr;
        java.util.Arrays.sort(e1VarArr, f212920d);
    }

    public java.lang.String a(java.util.Map map) {
        java.lang.String str = this.f212921a;
        com.tencent.mm.vfs.e1[] e1VarArr = this.f212922b;
        if (e1VarArr == null || str == null) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = e1VarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            com.tencent.mm.vfs.e1 e1Var = e1VarArr[i17];
            java.lang.String e17 = com.tencent.mm.vfs.e8.e(map, e1Var.f212902a);
            if (e17 == null) {
                return null;
            }
            sb6.append((java.lang.CharSequence) str, i18, e1Var.f212903b);
            sb6.append(e17);
            i17++;
            i18 = e1Var.f212904c;
        }
        sb6.append((java.lang.CharSequence) str, i18, str.length());
        return sb6.toString();
    }

    public java.lang.String[] b(java.util.Map map) {
        java.lang.String str = this.f212921a;
        if (str == null) {
            return null;
        }
        com.tencent.mm.vfs.e1[] e1VarArr = this.f212922b;
        if (e1VarArr == null) {
            return new java.lang.String[]{str};
        }
        int length = e1VarArr.length;
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = map.get(e1VarArr[i17].f212902a);
            if (obj == null) {
                return null;
            }
            objArr[i17] = obj;
        }
        int i18 = 1;
        for (int i19 = 0; i19 < length; i19++) {
            java.lang.Object obj2 = objArr[i19];
            if (obj2 instanceof java.lang.String[]) {
                i18 *= ((java.lang.String[]) obj2).length;
            }
        }
        if (i18 == 0) {
            return null;
        }
        int length2 = e1VarArr.length;
        int[] iArr = new int[length2];
        java.lang.String[] strArr = new java.lang.String[i18];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i27 = 0; i27 < i18; i27++) {
            int i28 = 0;
            int i29 = 0;
            while (i28 < length2) {
                com.tencent.mm.vfs.e1 e1Var = e1VarArr[i28];
                java.lang.Object obj3 = objArr[i28];
                sb6.append((java.lang.CharSequence) str, i29, e1Var.f212903b);
                if (obj3 instanceof java.lang.String) {
                    sb6.append((java.lang.String) obj3);
                } else {
                    if (!(obj3 instanceof java.lang.String[])) {
                        return null;
                    }
                    sb6.append(((java.lang.String[]) obj3)[iArr[i28]]);
                }
                i28++;
                i29 = e1Var.f212904c;
            }
            sb6.append((java.lang.CharSequence) str, i29, str.length());
            strArr[i27] = sb6.toString();
            sb6.setLength(0);
            for (int i37 = length2 - 1; i37 >= 0; i37--) {
                java.lang.Object obj4 = objArr[i37];
                if (obj4 instanceof java.lang.String[]) {
                    int length3 = ((java.lang.String[]) obj4).length;
                    int i38 = iArr[i37] + 1;
                    iArr[i37] = i38;
                    if (i38 < length3) {
                        break;
                    }
                    iArr[i37] = 0;
                }
            }
        }
        return strArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.f1) {
            if (com.tencent.mm.vfs.e8.f(this.f212921a, ((com.tencent.mm.vfs.f1) obj).f212921a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.f212921a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = this.f212921a;
        return str == null ? "(null)" : str;
    }
}
