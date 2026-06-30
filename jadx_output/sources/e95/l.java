package e95;

/* loaded from: classes12.dex */
public class l implements com.tencent.wcdb.database.SQLiteDatabase.CursorFactory {
    @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
    public com.tencent.wcdb.Cursor newCursor(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, com.tencent.wcdb.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, com.tencent.wcdb.database.SQLiteProgram sQLiteProgram) {
        return j62.e.g().c(new com.tencent.mm.repairer.config.msgrefactor.RepairerConfigNewCursorRefactor()) == 1 ? new e95.d(sQLiteCursorDriver, str, (e95.p) sQLiteProgram) : new e95.m(sQLiteCursorDriver, str, (e95.p) sQLiteProgram);
    }

    @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
    public com.tencent.wcdb.database.SQLiteProgram newQuery(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        return new e95.p(sQLiteDatabase, str, objArr, cancellationSignal);
    }
}
