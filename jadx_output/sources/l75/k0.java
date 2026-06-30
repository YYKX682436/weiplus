package l75;

/* loaded from: classes12.dex */
public interface k0 {
    boolean A(java.lang.String str, java.lang.String str2);

    android.database.Cursor B(java.lang.String str, java.lang.String[] strArr);

    default void C() {
    }

    android.database.Cursor D(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17);

    android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    long F(java.lang.Long l17);

    boolean G();

    boolean H(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr);

    default boolean I(java.lang.String table) {
        kotlin.jvm.internal.o.g(table, "table");
        return true;
    }

    boolean J();

    default boolean K() {
        return false;
    }

    default boolean a() {
        return false;
    }

    default long b() {
        return F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }

    default boolean c() {
        return true;
    }

    void close();

    android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.wcdb.support.CancellationSignal cancellationSignal);

    int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr);

    default long e() {
        return 0L;
    }

    android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17);

    default l75.e1 g() {
        return new l75.e1();
    }

    java.lang.String getPath();

    default long h(long j17) {
        return 0L;
    }

    default com.tencent.wcdb.repair.RepairKit.LeafInfo i(java.lang.String[] tables, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(tables, "tables");
        return null;
    }

    default boolean isOpen() {
        return !J();
    }

    default boolean j(java.lang.String str, java.lang.String sql, java.lang.Object[] bindArgs, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(sql, "sql");
        kotlin.jvm.internal.o.g(bindArgs, "bindArgs");
        return false;
    }

    default long k() {
        return 0L;
    }

    long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues);

    long m(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues);

    default boolean n() {
        return false;
    }

    default android.database.Cursor o(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return null;
    }

    int p(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr);

    long q();

    default void r() {
    }

    android.database.Cursor s(java.lang.String str, java.lang.String[] strArr);

    default int t() {
        return w(null);
    }

    default boolean u() {
        return false;
    }

    long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues);

    int w(java.lang.Long l17);

    default void x() {
    }

    default void y(l75.j0 handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
    }

    default p75.k z(java.lang.String str) {
        return null;
    }
}
