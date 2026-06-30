package l36;

/* loaded from: classes16.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f315518a;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f315521d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315523f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f315524g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f315525h;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f315519b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f315520c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f315522e = -1;

    public j0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f315523f = arrayList;
        arrayList.add("");
    }

    public l36.k0 a() {
        if (this.f315518a == null) {
            throw new java.lang.IllegalStateException("scheme == null");
        }
        if (this.f315521d != null) {
            return new l36.k0(this);
        }
        throw new java.lang.IllegalStateException("host == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0246, code lost:
    
        if (r1 <= 65535) goto L120;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l36.j0 b(l36.k0 r34, java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l36.j0.b(l36.k0, java.lang.String):l36.j0");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f315518a;
        if (str != null) {
            sb6.append(str);
            sb6.append("://");
        } else {
            sb6.append("//");
        }
        if (!this.f315519b.isEmpty() || !this.f315520c.isEmpty()) {
            sb6.append(this.f315519b);
            if (!this.f315520c.isEmpty()) {
                sb6.append(':');
                sb6.append(this.f315520c);
            }
            sb6.append('@');
        }
        java.lang.String str2 = this.f315521d;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb6.append('[');
                sb6.append(this.f315521d);
                sb6.append(']');
            } else {
                sb6.append(this.f315521d);
            }
        }
        int i17 = this.f315522e;
        if (i17 != -1 || this.f315518a != null) {
            if (i17 == -1) {
                i17 = l36.k0.c(this.f315518a);
            }
            java.lang.String str3 = this.f315518a;
            if (str3 == null || i17 != l36.k0.c(str3)) {
                sb6.append(':');
                sb6.append(i17);
            }
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f315523f;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            sb6.append('/');
            sb6.append((java.lang.String) arrayList.get(i18));
        }
        if (this.f315524g != null) {
            sb6.append('?');
            l36.k0.i(sb6, this.f315524g);
        }
        if (this.f315525h != null) {
            sb6.append('#');
            sb6.append(this.f315525h);
        }
        return sb6.toString();
    }
}
