package d95;

/* loaded from: classes12.dex */
public class y implements android.database.Cursor, l75.h0 {

    /* renamed from: d, reason: collision with root package name */
    public android.database.Cursor f227712d;

    /* renamed from: e, reason: collision with root package name */
    public final d95.x f227713e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.CancellationSignal f227714f = new android.os.CancellationSignal();

    public y(d95.x xVar) {
        this.f227713e = xVar;
    }

    @Override // l75.h0
    public boolean a() {
        return this.f227714f.isCanceled();
    }

    public final void b() {
        if (this.f227712d == null) {
            d95.z$$a z__a = (d95.z$$a) this.f227713e;
            com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase = z__a.f227723a.f227718a;
            java.lang.String[] strArr = z__a.f227725c;
            java.lang.String str = z__a.f227724b;
            android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr, this.f227714f);
            d95.z.L(rawQuery, str);
            this.f227712d = rawQuery;
        }
    }

    @Override // l75.h0
    public void cancel() {
        this.f227714f.cancel();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        android.database.Cursor cursor = this.f227712d;
        if (cursor != null) {
            cursor.close();
        }
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        b();
        this.f227712d.copyStringToBuffer(i17, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i17) {
        b();
        return this.f227712d.getBlob(i17);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        b();
        return this.f227712d.getColumnCount();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        b();
        return this.f227712d.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        b();
        return this.f227712d.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        b();
        return this.f227712d.getColumnName(i17);
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
        b();
        return this.f227712d.getColumnNames();
    }

    @Override // android.database.Cursor
    public int getCount() {
        b();
        return this.f227712d.getCount();
    }

    @Override // android.database.Cursor
    public double getDouble(int i17) {
        b();
        return this.f227712d.getDouble(i17);
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i17) {
        b();
        return this.f227712d.getFloat(i17);
    }

    @Override // android.database.Cursor
    public int getInt(int i17) {
        b();
        return this.f227712d.getInt(i17);
    }

    @Override // android.database.Cursor
    public long getLong(int i17) {
        b();
        return this.f227712d.getLong(i17);
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        b();
        return this.f227712d.getPosition();
    }

    @Override // android.database.Cursor
    public short getShort(int i17) {
        b();
        return this.f227712d.getShort(i17);
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int i17) {
        b();
        return this.f227712d.getString(i17);
    }

    @Override // android.database.Cursor
    public int getType(int i17) {
        b();
        return this.f227712d.getType(i17);
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        b();
        return this.f227712d.isAfterLast();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        b();
        return this.f227712d.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        android.database.Cursor cursor = this.f227712d;
        if (cursor == null) {
            return true;
        }
        return cursor.isClosed();
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        b();
        return this.f227712d.isFirst();
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        b();
        return this.f227712d.isLast();
    }

    @Override // android.database.Cursor
    public boolean isNull(int i17) {
        b();
        return this.f227712d.isNull(i17);
    }

    @Override // android.database.Cursor
    public boolean move(int i17) {
        b();
        return this.f227712d.move(i17);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        b();
        return this.f227712d.moveToFirst();
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        b();
        return this.f227712d.moveToLast();
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        b();
        return this.f227712d.moveToNext();
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i17) {
        b();
        return this.f227712d.moveToPosition(i17);
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        b();
        return this.f227712d.moveToPrevious();
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }
}
