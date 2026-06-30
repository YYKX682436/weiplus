package d95;

/* loaded from: classes12.dex */
public final class d implements android.database.Cursor, e95.h {

    /* renamed from: d, reason: collision with root package name */
    public static android.database.Cursor f227655d;

    public static android.database.Cursor a() {
        if (f227655d == null) {
            f227655d = new d95.d();
        }
        return f227655d;
    }

    @Override // e95.h
    public boolean I0(int i17) {
        return false;
    }

    @Override // e95.h
    public void Y(e95.g gVar) {
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i17) {
        return null;
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        return 0;
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        return null;
    }

    @Override // android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return null;
    }

    @Override // android.database.Cursor
    public int getCount() {
        return 0;
    }

    @Override // android.database.Cursor
    public double getDouble(int i17) {
        return 0.0d;
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i17) {
        return 0.0f;
    }

    @Override // android.database.Cursor
    public int getInt(int i17) {
        return 0;
    }

    @Override // e95.h
    public e95.a getItem(int i17) {
        return null;
    }

    @Override // android.database.Cursor
    public long getLong(int i17) {
        return 0L;
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return 0;
    }

    @Override // android.database.Cursor
    public short getShort(int i17) {
        return (short) 0;
    }

    @Override // android.database.Cursor
    public java.lang.String getString(int i17) {
        return null;
    }

    @Override // android.database.Cursor
    public int getType(int i17) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return true;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i17) {
        return false;
    }

    @Override // android.database.Cursor
    public boolean move(int i17) {
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i17) {
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        return false;
    }

    @Override // e95.h
    public boolean n0(java.lang.Object obj) {
        return false;
    }

    @Override // e95.h
    public android.util.SparseArray[] n1() {
        return null;
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

    @Override // e95.h
    public boolean t(java.lang.Object obj, e95.a aVar) {
        return false;
    }

    @Override // e95.h
    public void u(boolean z17) {
    }

    @Override // e95.h
    public void u1(int i17) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // e95.h
    public boolean y() {
        return false;
    }
}
