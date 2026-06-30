package ua;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425897a;

    /* renamed from: b, reason: collision with root package name */
    public final ua.e f425898b;

    /* renamed from: c, reason: collision with root package name */
    public ua.e f425899c;

    public f(java.lang.String str, ua.d dVar) {
        ua.e eVar = new ua.e(null);
        this.f425898b = eVar;
        this.f425899c = eVar;
        str.getClass();
        this.f425897a = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
        sb6.append(this.f425897a);
        sb6.append('{');
        ua.e eVar = this.f425898b.f425896c;
        java.lang.String str = "";
        while (eVar != null) {
            java.lang.Object obj = eVar.f425895b;
            sb6.append(str);
            java.lang.String str2 = eVar.f425894a;
            if (str2 != null) {
                sb6.append(str2);
                sb6.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb6.append(obj);
            } else {
                java.lang.String deepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                sb6.append((java.lang.CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            eVar = eVar.f425896c;
            str = ", ";
        }
        sb6.append('}');
        return sb6.toString();
    }
}
