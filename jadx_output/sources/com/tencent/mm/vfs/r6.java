package com.tencent.mm.vfs;

/* loaded from: classes7.dex */
public class r6 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.z7 f213166d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.vfs.z2 f213167e;

    public r6(java.lang.String str) {
        this(com.tencent.mm.vfs.z7.a(str));
    }

    public static com.tencent.mm.vfs.r6 j(java.io.File file) {
        if (file != null) {
            return new com.tencent.mm.vfs.r6(file);
        }
        return null;
    }

    public boolean A() {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.z2 M = M();
        return (!M.a() || (m17 = M.f213266a.m(M.f213267b)) == null || m17.f213236f) ? false : true;
    }

    public long B() {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.z2 M = M();
        if (M.a() && (m17 = M.f213266a.m(M.f213267b)) != null) {
            return m17.f213235e;
        }
        return 0L;
    }

    public long C() {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.z2 M = M();
        if (M.a() && (m17 = M.f213266a.m(M.f213267b)) != null) {
            return m17.f213233c;
        }
        return 0L;
    }

    public java.lang.String[] D() {
        java.lang.Iterable C;
        com.tencent.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f213266a.C(M.f213267b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public java.lang.String[] E(com.tencent.mm.vfs.b7 b7Var) {
        java.lang.Iterable<java.lang.String> C;
        if (b7Var == null) {
            return D();
        }
        com.tencent.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f213266a.C(M.f213267b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : C) {
            if (b7Var.a(this, str)) {
                arrayList.add(str);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public com.tencent.mm.vfs.r6[] G() {
        java.lang.Iterable C;
        com.tencent.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f213266a.C(M.f213267b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.mm.vfs.r6((java.lang.String) it.next(), this.f213166d));
        }
        return (com.tencent.mm.vfs.r6[]) arrayList.toArray(new com.tencent.mm.vfs.r6[0]);
    }

    public com.tencent.mm.vfs.r6[] H(com.tencent.mm.vfs.t6 t6Var) {
        java.lang.Iterable C;
        if (t6Var == null) {
            return G();
        }
        com.tencent.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f213266a.C(M.f213267b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6((java.lang.String) it.next(), this.f213166d);
            if (t6Var.accept(r6Var)) {
                arrayList.add(r6Var);
            }
        }
        return (com.tencent.mm.vfs.r6[]) arrayList.toArray(new com.tencent.mm.vfs.r6[0]);
    }

    public com.tencent.mm.vfs.r6[] I(com.tencent.mm.vfs.b7 b7Var) {
        java.lang.Iterable<java.lang.String> C;
        if (b7Var == null) {
            return G();
        }
        com.tencent.mm.vfs.z2 M = M();
        if (!M.a() || (C = M.f213266a.C(M.f213267b)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : C) {
            if (b7Var.a(this, str)) {
                arrayList.add(new com.tencent.mm.vfs.r6(str, this.f213166d));
            }
        }
        return (com.tencent.mm.vfs.r6[]) arrayList.toArray(new com.tencent.mm.vfs.r6[0]);
    }

    public boolean J() {
        com.tencent.mm.vfs.z2 M = M();
        if (M.a()) {
            return M.f213266a.r(M.f213267b);
        }
        return false;
    }

    public boolean L(com.tencent.mm.vfs.r6 r6Var) {
        com.tencent.mm.vfs.z2 M = M();
        com.tencent.mm.vfs.z2 M2 = r6Var.M();
        if (M.a() && M2.a()) {
            try {
                return M2.f213266a.t(M2.f213267b, M.f213266a, M.f213267b);
            } catch (java.io.IOException unused) {
            }
        }
        return false;
    }

    public com.tencent.mm.vfs.z2 M() {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(this.f213166d, this.f213167e);
        this.f213167e = m17;
        return m17;
    }

    public boolean N(long j17) {
        com.tencent.mm.vfs.z2 M = M();
        if (M.a()) {
            return M.f213266a.n(M.f213267b, j17);
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return u().compareTo(((com.tencent.mm.vfs.r6) obj).u());
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.r6)) {
            return false;
        }
        return this.f213166d.equals(((com.tencent.mm.vfs.r6) obj).f213166d);
    }

    public java.lang.String getName() {
        java.lang.String str = this.f213166d.f213279f;
        int lastIndexOf = str.lastIndexOf("/");
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1);
    }

    public boolean h() {
        com.tencent.mm.vfs.z2 M = M();
        if (!M.a()) {
            return false;
        }
        com.tencent.mm.vfs.q2 q2Var = M.f213266a;
        java.lang.String str = M.f213267b;
        java.lang.String D = q2Var.D(str, false);
        return D != null ? new java.io.File(D).canRead() : q2Var.F(str);
    }

    public int hashCode() {
        return u().hashCode() ^ 1234321;
    }

    public boolean i() {
        com.tencent.mm.vfs.z2 M = M();
        if (!M.a()) {
            return false;
        }
        com.tencent.mm.vfs.q2 q2Var = M.f213266a;
        if ((q2Var.o() & 1) == 0) {
            return false;
        }
        java.lang.String str = M.f213267b;
        java.lang.String D = q2Var.D(str, true);
        return D != null ? new java.io.File(D).canWrite() : q2Var.F(str);
    }

    public boolean k() {
        com.tencent.mm.vfs.z2 M = M();
        if (!M.a()) {
            throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + this.f213166d);
        }
        com.tencent.mm.vfs.q2 q2Var = M.f213266a;
        java.lang.String str = M.f213267b;
        if (q2Var.F(str)) {
            return false;
        }
        q2Var.c(str, false).close();
        return true;
    }

    public boolean l() {
        com.tencent.mm.vfs.z2 M = M();
        return M.a() && M.f213266a.d(M.f213267b);
    }

    public boolean m() {
        com.tencent.mm.vfs.z2 M = M();
        if (M.a()) {
            return M.f213266a.F(M.f213267b);
        }
        return false;
    }

    public com.tencent.mm.vfs.r6 n() {
        return new com.tencent.mm.vfs.r6((java.lang.String) null, p());
    }

    public java.lang.String o() {
        return p().toString();
    }

    public final com.tencent.mm.vfs.z7 p() {
        com.tencent.mm.vfs.z7 z7Var = this.f213166d;
        java.lang.String str = z7Var.f213279f;
        boolean z17 = true;
        if (!(z7Var.f213277d != null) && (str.length() <= 0 || str.charAt(0) != '/')) {
            z17 = false;
        }
        if (z17) {
            return z7Var;
        }
        java.lang.String str2 = z7Var.f213279f;
        java.lang.String property = java.lang.System.getProperty("user.dir");
        if (!str2.isEmpty()) {
            property = property + '/' + str2;
        }
        return new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, property, z7Var.f213280g, z7Var.f213281h);
    }

    public java.lang.String r() {
        com.tencent.mm.vfs.z7 t17 = t();
        if (t17 == null) {
            return null;
        }
        return t17.toString();
    }

    public com.tencent.mm.vfs.r6 s() {
        com.tencent.mm.vfs.z7 t17 = t();
        if (t17 == null) {
            return null;
        }
        return new com.tencent.mm.vfs.r6((java.lang.String) null, t17);
    }

    public com.tencent.mm.vfs.z7 t() {
        com.tencent.mm.vfs.z7 z7Var = this.f213166d;
        java.lang.String str = z7Var.f213279f;
        int length = str.length();
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1 || str.charAt(length - 1) == '/') {
            return null;
        }
        return new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, (str.indexOf(47) == lastIndexOf && str.charAt(0) == '/') ? str.substring(0, lastIndexOf + 1) : str.substring(0, lastIndexOf), z7Var.f213280g, z7Var.f213281h);
    }

    public java.lang.String toString() {
        return this.f213166d.toString();
    }

    public java.lang.String u() {
        return this.f213166d.toString();
    }

    public long w() {
        com.tencent.mm.vfs.o2 g17;
        com.tencent.mm.vfs.z2 M = M();
        if (M.a() && (g17 = M.f213266a.g(M.f213267b)) != null) {
            return g17.f213104c;
        }
        return 0L;
    }

    public boolean y() {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.z2 M = M();
        return M.a() && (m17 = M.f213266a.m(M.f213267b)) != null && m17.f213236f;
    }

    public r6(com.tencent.mm.vfs.z7 z7Var) {
        this.f213167e = null;
        java.lang.String str = z7Var.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!z7Var.f213279f.equals(l17)) {
                z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, l17, z7Var.f213280g, z7Var.f213281h);
            }
        }
        this.f213166d = z7Var;
    }

    public r6(android.net.Uri uri) {
        this(new com.tencent.mm.vfs.z7(uri));
    }

    public r6(java.io.File file) {
        this.f213167e = null;
        this.f213166d = new com.tencent.mm.vfs.z7(null, null, file.getPath(), null, null);
    }

    public r6(com.tencent.mm.vfs.r6 r6Var) {
        this.f213167e = null;
        this.f213166d = r6Var.f213166d;
        this.f213167e = r6Var.f213167e;
    }

    public r6(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.z7 a17 = str == null ? null : com.tencent.mm.vfs.z7.a(str);
        this.f213167e = null;
        if (a17 == null) {
            this.f213166d = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l(str2, false, false), null, null);
            return;
        }
        boolean isEmpty = str2.isEmpty();
        java.lang.String str3 = a17.f213279f;
        if (!isEmpty) {
            str3 = com.tencent.mm.vfs.e8.l(str3 + '/' + str2, false, false);
        }
        this.f213166d = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, str3, a17.f213280g, a17.f213281h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r6(com.tencent.mm.vfs.r6 r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.String r4 = com.tencent.mm.vfs.e8.l(r4, r0, r1)
            if (r3 != 0) goto Lb
            com.tencent.mm.vfs.z7 r3 = com.tencent.mm.vfs.z7.f213276i
            goto Ld
        Lb:
            com.tencent.mm.vfs.z7 r3 = r3.f213166d
        Ld:
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.r6.<init>(com.tencent.mm.vfs.r6, java.lang.String):void");
    }

    public r6(java.io.File file, java.lang.String str) {
        this(new java.io.File(file, str));
    }

    public r6(java.lang.String str, com.tencent.mm.vfs.z7 z7Var) {
        this.f213167e = null;
        if (str != null && !str.isEmpty()) {
            java.lang.String str2 = z7Var.f213279f;
            this.f213166d = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str2 + '/' + str, z7Var.f213280g, z7Var.f213281h);
            return;
        }
        this.f213166d = z7Var;
    }
}
