package q4;

/* loaded from: classes13.dex */
public class b implements android.database.sqlite.SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p4.h f360005a;

    public b(q4.c cVar, p4.h hVar) {
        this.f360005a = hVar;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        this.f360005a.b(new q4.h(sQLiteQuery));
        return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
