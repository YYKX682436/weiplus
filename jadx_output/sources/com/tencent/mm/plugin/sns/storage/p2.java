package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class p2 implements l75.k0 {

    /* renamed from: b, reason: collision with root package name */
    public static java.util.concurrent.ConcurrentHashMap f166099b;

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f166100a;

    public p2(l75.k0 k0Var) {
        this.f166100a = k0Var;
        if (com.tencent.mm.sdk.platformtools.t8.P(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_sql_trace_switch, "0", true), 0) > 0) {
            f166099b = new java.util.concurrent.ConcurrentHashMap();
        }
    }

    @Override // l75.k0
    public boolean A(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f166099b;
        if (concurrentHashMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(str2.hashCode());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            concurrentHashMap.put(valueOf, new com.tencent.mm.plugin.sns.storage.o2(this, com.tencent.mm.sdk.platformtools.z3.b(true), android.os.Looper.getMainLooper() == android.os.Looper.myLooper()));
        }
        boolean A = this.f166100a.A(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return A;
    }

    @Override // l75.k0
    public android.database.Cursor B(java.lang.String str, java.lang.String[] strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f166099b;
        if (concurrentHashMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(str.hashCode());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            concurrentHashMap.put(valueOf, new com.tencent.mm.plugin.sns.storage.o2(this, com.tencent.mm.sdk.platformtools.z3.b(true), android.os.Looper.getMainLooper() == android.os.Looper.myLooper()));
        }
        android.database.Cursor B = this.f166100a.B(str, strArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return B;
    }

    @Override // l75.k0
    public android.database.Cursor D(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        android.database.Cursor D = this.f166100a.D(str, strArr, str2, strArr2, str3, str4, str5, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return D;
    }

    @Override // l75.k0
    public android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        android.database.Cursor E = this.f166100a.E(str, strArr, str2, strArr2, str3, str4, str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return E;
    }

    @Override // l75.k0
    public long F(java.lang.Long l17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long F = this.f166100a.F(l17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return F;
    }

    @Override // l75.k0
    public boolean G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        boolean G = this.f166100a.G();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return G;
    }

    @Override // l75.k0
    public boolean H(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f166099b;
        if (concurrentHashMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(str2.hashCode());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            concurrentHashMap.put(valueOf, new com.tencent.mm.plugin.sns.storage.o2(this, com.tencent.mm.sdk.platformtools.z3.b(true), android.os.Looper.getMainLooper() == android.os.Looper.myLooper()));
        }
        boolean H = this.f166100a.H(str, str2, objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return H;
    }

    @Override // l75.k0
    public boolean J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isClose", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        boolean J2 = this.f166100a.J();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isClose", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return J2;
    }

    @Override // l75.k0
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWcDb2", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        boolean a17 = this.f166100a.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWcDb2", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return a17;
    }

    @Override // l75.k0
    public void close() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("close", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        this.f166100a.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("close", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
    }

    @Override // l75.k0
    public android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        android.database.Cursor d17 = this.f166100a.d(z17, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return d17;
    }

    @Override // l75.k0
    public int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delete", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        int delete = this.f166100a.delete(str, str2, strArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delete", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return delete;
    }

    @Override // l75.k0
    public android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f166099b;
        if (concurrentHashMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(str.hashCode());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            concurrentHashMap.put(valueOf, new com.tencent.mm.plugin.sns.storage.o2(this, com.tencent.mm.sdk.platformtools.z3.b(true), android.os.Looper.getMainLooper() == android.os.Looper.myLooper()));
        }
        android.database.Cursor f17 = this.f166100a.f(str, strArr, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return f17;
    }

    @Override // l75.k0
    public java.lang.String getPath() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPath", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.lang.String path = this.f166100a.getPath();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPath", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return path;
    }

    @Override // l75.k0
    public long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insert", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long l17 = this.f166100a.l(str, str2, contentValues);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insert", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return l17;
    }

    @Override // l75.k0
    public long m(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long m17 = this.f166100a.m(str, str2, contentValues);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return m17;
    }

    @Override // l75.k0
    public int p(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        int p17 = this.f166100a.p(str, contentValues, str2, strArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return p17;
    }

    @Override // l75.k0
    public long q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageSize", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long q17 = this.f166100a.q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageSize", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return q17;
    }

    @Override // l75.k0
    public android.database.Cursor s(java.lang.String str, java.lang.String[] strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rawQueryWithCancel", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        android.database.Cursor s17 = this.f166100a.s(str, strArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rawQueryWithCancel", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return s17;
    }

    @Override // l75.k0
    public boolean u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("vacuum", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        boolean u17 = this.f166100a.u();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("vacuum", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return u17;
    }

    @Override // l75.k0
    public long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertOrThrow", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long v17 = this.f166100a.v(str, str2, contentValues);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertOrThrow", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return v17;
    }

    @Override // l75.k0
    public int w(java.lang.Long l17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        int w17 = this.f166100a.w(l17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return w17;
    }
}
