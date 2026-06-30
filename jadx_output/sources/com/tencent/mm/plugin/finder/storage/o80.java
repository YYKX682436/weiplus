package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class o80 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f127294e = {l75.n0.getCreateSQLs(ya2.b2.O2, "FinderContact")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f127295f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f127296d;

    static {
        java.lang.String[] INDEX_CREATE = dm.z3.B1;
        kotlin.jvm.internal.o.f(INDEX_CREATE, "INDEX_CREATE");
        java.util.ArrayList arrayList = (java.util.ArrayList) kz5.z.C0(INDEX_CREATE);
        arrayList.add(0, "DROP INDEX username_index");
        f127295f = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(l75.k0 storage) {
        super(storage, ya2.b2.O2, "FinderContact", f127295f);
        kotlin.jvm.internal.o.g(storage, "storage");
        l75.e0 e0Var = ya2.b2.O2;
        this.f127296d = storage;
    }

    public ya2.b2 y0(java.lang.String username) {
        ya2.b2 b2Var;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String sql = "SELECT *, rowid FROM FinderContact WHERE username = " + d95.b0.O(username);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.database.Cursor f17 = this.f127296d.f(sql, null, 2);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderContactStorage.getContact", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
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
}
