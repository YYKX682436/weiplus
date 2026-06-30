package w13;

/* loaded from: classes12.dex */
public class l implements l75.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteDatabase f442224a;

    public l(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
        this.f442224a = sQLiteDatabase;
    }

    @Override // l75.k0
    public boolean A(java.lang.String str, java.lang.String str2) {
        try {
            this.f442224a.execSQL(str2);
            return true;
        } catch (android.database.SQLException unused) {
            return false;
        }
    }

    @Override // l75.k0
    public android.database.Cursor B(java.lang.String str, java.lang.String[] strArr) {
        return this.f442224a.rawQuery(str, strArr);
    }

    @Override // l75.k0
    public android.database.Cursor D(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        return this.f442224a.query(str, strArr, str2, strArr2, str3, str4, str5);
    }

    @Override // l75.k0
    public android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return this.f442224a.query(str, strArr, str2, strArr2, str3, str4, str5);
    }

    @Override // l75.k0
    public long F(java.lang.Long l17) {
        this.f442224a.beginTransaction();
        return l17.longValue();
    }

    @Override // l75.k0
    public boolean G() {
        return this.f442224a.inTransaction();
    }

    @Override // l75.k0
    public boolean H(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        try {
            this.f442224a.execSQL(str2, objArr);
            return true;
        } catch (android.database.SQLException unused) {
            return false;
        }
    }

    @Override // l75.k0
    public boolean J() {
        return !this.f442224a.isOpen();
    }

    @Override // l75.k0
    public void close() {
        this.f442224a.close();
    }

    @Override // l75.k0
    public android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return this.f442224a.query(z17, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
    }

    @Override // l75.k0
    public int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        return this.f442224a.delete(str, str2, strArr);
    }

    @Override // l75.k0
    public android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17) {
        return this.f442224a.rawQuery(str, strArr);
    }

    @Override // l75.k0
    public java.lang.String getPath() {
        return this.f442224a.getPath();
    }

    @Override // l75.k0
    public long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return this.f442224a.insert(str, str2, contentValues);
    }

    @Override // l75.k0
    public long m(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return this.f442224a.replace(str, str2, contentValues);
    }

    @Override // l75.k0
    public android.database.Cursor o(com.tencent.wcdb.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return this.f442224a.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal != null ? new p75.c(cancellationSignal, this).f352622a : null);
    }

    @Override // l75.k0
    public int p(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return this.f442224a.update(str, contentValues, str2, strArr);
    }

    @Override // l75.k0
    public long q() {
        return this.f442224a.getPageSize();
    }

    @Override // l75.k0
    public android.database.Cursor s(java.lang.String str, java.lang.String[] strArr) {
        return this.f442224a.rawQuery(str, strArr);
    }

    @Override // l75.k0
    public long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return this.f442224a.insertOrThrow(str, str2, contentValues);
    }

    @Override // l75.k0
    public int w(java.lang.Long l17) {
        com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase = this.f442224a;
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        return 0;
    }
}
