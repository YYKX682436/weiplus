package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class u3 extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f213194e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f213195f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f213196g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f213197h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.MigrationFileSystem f213198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.tencent.mm.vfs.MigrationFileSystem migrationFileSystem, java.util.List list, boolean z17, boolean z18, boolean z19, java.util.Map map) {
        super(migrationFileSystem, map);
        this.f213198i = migrationFileSystem;
        this.f213194e = list;
        this.f213195f = z17;
        this.f213196g = z18;
        this.f213197h = z19;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public boolean F(java.lang.String str) {
        java.util.Iterator it = this.f213194e.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.vfs.q2) it.next()).F(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f213194e;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        java.util.List<com.tencent.mm.vfs.q2> list = this.f213194e;
        if (i17 == 1 || i17 == 3) {
            for (com.tencent.mm.vfs.q2 q2Var : list) {
                if (q2Var.F(str)) {
                    return q2Var;
                }
            }
        }
        return (com.tencent.mm.vfs.q2) list.get(0);
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.util.Iterator it = this.f213194e.iterator();
        java.io.FileNotFoundException fileNotFoundException = null;
        while (it.hasNext()) {
            try {
                return ((com.tencent.mm.vfs.q2) it.next()).a(str);
            } catch (java.io.FileNotFoundException e17) {
                if (fileNotFoundException == null) {
                    fileNotFoundException = e17;
                }
            }
        }
        if (fileNotFoundException != null) {
            throw fileNotFoundException;
        }
        throw new java.io.FileNotFoundException(str + " not found on any file systems.");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.u3)) {
            return false;
        }
        com.tencent.mm.vfs.u3 u3Var = (com.tencent.mm.vfs.u3) obj;
        return this.f213194e.equals(u3Var.f213194e) && this.f213195f == u3Var.f213195f && this.f213196g == u3Var.f213196g;
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.u3.class.hashCode();
        java.lang.Object[] objArr = {this.f213194e, java.lang.Boolean.valueOf(this.f213195f), java.lang.Boolean.valueOf(this.f213196g)};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.x1 m(java.lang.String str) {
        java.util.Iterator it = this.f213194e.iterator();
        while (it.hasNext()) {
            com.tencent.mm.vfs.x1 m17 = ((com.tencent.mm.vfs.q2) it.next()).m(str);
            if (m17 != null) {
                return m17;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d A[Catch: Exception -> 0x0175, TRY_ENTER, TryCatch #7 {Exception -> 0x0175, blocks: (B:29:0x00a1, B:31:0x00a5, B:36:0x00ab, B:38:0x00b1, B:40:0x00b8, B:54:0x00c1, B:56:0x00c9, B:58:0x00cf, B:60:0x00d6, B:61:0x00d9, B:65:0x00e5, B:71:0x00ed, B:95:0x00fc, B:74:0x0101, B:77:0x010b, B:81:0x011d, B:83:0x014f, B:84:0x0165, B:88:0x016d, B:93:0x0160, B:102:0x00f5, B:106:0x0112, B:112:0x0187, B:113:0x018f, B:115:0x0195), top: B:28:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015c  */
    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r47) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.u3.q(android.os.CancellationSignal):void");
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        java.util.Iterator it = this.f213194e.iterator();
        java.io.FileNotFoundException fileNotFoundException = null;
        while (it.hasNext()) {
            try {
                return ((com.tencent.mm.vfs.q2) it.next()).s(str);
            } catch (java.io.FileNotFoundException e17) {
                if (fileNotFoundException == null) {
                    fileNotFoundException = e17;
                }
            }
        }
        if (fileNotFoundException != null) {
            throw fileNotFoundException;
        }
        throw new java.io.FileNotFoundException(str + " not found on any file systems.");
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("migrate(");
        sb6.append(this.f213195f ? 'P' : '-');
        sb6.append(") ");
        java.util.List list = this.f213194e;
        sb6.append(list.get(0));
        for (com.tencent.mm.vfs.q2 q2Var : list.subList(1, list.size())) {
            sb6.append("\n  <- ");
            sb6.append(q2Var);
        }
        return sb6.toString();
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213198i;
    }
}
