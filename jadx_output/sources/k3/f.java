package k3;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f303780a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f303781b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f303782c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f303783d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f303784e;

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        str.getClass();
        this.f303780a = str;
        str2.getClass();
        this.f303781b = str2;
        str3.getClass();
        this.f303782c = str3;
        list.getClass();
        this.f303783d = list;
        this.f303784e = str + "-" + str2 + "-" + str3;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("FontRequest {mProviderAuthority: " + this.f303780a + ", mProviderPackage: " + this.f303781b + ", mQuery: " + this.f303782c + ", mCertificates:");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f303783d;
            if (i17 >= list.size()) {
                sb6.append("}mCertificatesArray: 0");
                return sb6.toString();
            }
            sb6.append(" [");
            java.util.List list2 = (java.util.List) list.get(i17);
            for (int i18 = 0; i18 < list2.size(); i18++) {
                sb6.append(" \"");
                sb6.append(android.util.Base64.encodeToString((byte[]) list2.get(i18), 0));
                sb6.append("\"");
            }
            sb6.append(" ]");
            i17++;
        }
    }
}
