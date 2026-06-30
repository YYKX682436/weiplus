package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class ma0 extends l75.n0 implements zy2.x8 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f127182e = {"CREATE INDEX IF NOT EXISTS FinderMsgAliasContactStorage_username_index ON FinderMsgAliasContactStorage(username)"};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f127183f = {l75.n0.getCreateSQLs(ya2.b2.O2, "FinderMsgAliasContactStorage")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f127184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(l75.k0 storage) {
        super(storage, ya2.b2.O2, "FinderMsgAliasContactStorage", f127182e);
        kotlin.jvm.internal.o.g(storage, "storage");
        l75.e0 e0Var = ya2.b2.O2;
        this.f127184d = storage;
    }

    public ya2.b2 y0(java.lang.String username) {
        ya2.b2 b2Var;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String sql = "SELECT *, rowid FROM FinderMsgAliasContactStorage WHERE username = " + d95.b0.O(username);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.database.Cursor f17 = this.f127184d.f(sql, null, 2);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderMsgAliasContactStorage.getContact", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            b2Var = new ya2.b2();
            b2Var.convertFrom(f17);
        } else {
            b2Var = null;
        }
        vz5.b.a(f17, null);
        return b2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fa, code lost:
    
        if (r2 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0082, code lost:
    
        if (r8 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0085, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z0(ya2.b2 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.ma0.z0(ya2.b2, boolean):boolean");
    }
}
