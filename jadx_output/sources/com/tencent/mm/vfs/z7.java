package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class z7 implements java.lang.Comparable {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.vfs.z7 f213276i = new com.tencent.mm.vfs.z7(null, null, null, null, null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213277d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f213278e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f213279f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f213280g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f213281h;

    public z7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f213277d = str;
        this.f213278e = str2;
        if ((str != null || str2 != null) && str3 != null && !str3.isEmpty() && str3.charAt(0) != '/') {
            str3 = "/".concat(str3);
        }
        this.f213279f = str3;
        this.f213280g = str4;
        this.f213281h = str5;
    }

    public static com.tencent.mm.vfs.z7 a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int indexOf;
        if (str.isEmpty() || str.charAt(0) == '/' || (indexOf = str.indexOf(58)) < 0) {
            str2 = str;
            str3 = null;
            str4 = null;
        } else {
            java.lang.String substring = str.substring(0, indexOf);
            int length = str.length();
            int i17 = indexOf + 2;
            if (length > i17 && str.charAt(indexOf + 1) == '/' && str.charAt(i17) == '/') {
                int i18 = indexOf + 3;
                int i19 = i18;
                while (i19 < length) {
                    char charAt = str.charAt(i19);
                    if (charAt == '#' || charAt == '/' || charAt == '?') {
                        break;
                    }
                    i19++;
                }
                java.lang.String substring2 = str.substring(i18, i19);
                str2 = i19 < length ? str.substring(i19 + 1) : null;
                str3 = substring;
                str4 = substring2;
            } else {
                str2 = str.substring(indexOf + 1);
                str3 = substring;
                str4 = null;
            }
        }
        return new com.tencent.mm.vfs.z7(str3, str4, str2, null, null);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return toString().compareTo(((com.tencent.mm.vfs.z7) obj).toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.z7)) {
            return false;
        }
        com.tencent.mm.vfs.z7 z7Var = (com.tencent.mm.vfs.z7) obj;
        return com.tencent.mm.vfs.e8.f(this.f213277d, z7Var.f213277d) && com.tencent.mm.vfs.e8.f(this.f213278e, z7Var.f213278e) && com.tencent.mm.vfs.e8.f(this.f213279f, z7Var.f213279f) && com.tencent.mm.vfs.e8.f(this.f213280g, z7Var.f213280g) && com.tencent.mm.vfs.e8.f(this.f213281h, z7Var.f213281h);
    }

    public android.net.Uri h() {
        return new android.net.Uri.Builder().scheme(this.f213277d).authority(this.f213278e).path(this.f213279f).query(this.f213280g).fragment(this.f213281h).build();
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.String[]{this.f213277d, this.f213278e, this.f213279f, this.f213280g, this.f213281h});
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f213277d;
        if (str != null && !str.isEmpty()) {
            sb6.append(str);
            sb6.append(':');
        }
        java.lang.String str2 = this.f213278e;
        if (str2 != null && !str2.isEmpty()) {
            sb6.append("//");
            sb6.append(str2);
        }
        java.lang.String str3 = this.f213279f;
        if (str3 != null) {
            sb6.append(str3);
        }
        return sb6.toString();
    }

    public z7(android.net.Uri uri) {
        this.f213277d = uri.getScheme();
        this.f213278e = uri.getAuthority();
        this.f213279f = uri.getPath();
        this.f213280g = uri.getQuery();
        this.f213281h = uri.getFragment();
    }
}
