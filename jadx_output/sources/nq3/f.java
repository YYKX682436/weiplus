package nq3;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final kq3.h f338994a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f338995b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f338996c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f338997d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f338998e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f338999f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f339000g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f339001h;

    public f(kq3.h hVar) {
        this.f338994a = hVar;
        if (hVar.e(2L, 0L) != 4) {
            if (hVar.g("C2CMsgAutoDownloadFile")) {
                hVar.b("C2CMsgAutoDownloadFile");
            }
            hVar.c(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (id TEXT, fromuser TEXT, realuser TEXT, restype INTEGER, createtime INTEGER, reason INTEGER, status INTEGER, downloadtime INTEGER, msgsvrid LONG, filesize INTEGER, fileext TEXT, opentime INTEGER, priority FLOAT, prioritytype INTEGER, fileid TEXT, PRIMARY KEY(id, msgsvrid));", "C2CMsgAutoDownloadFile"));
            hVar.c(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s ON %s(priority, createtime);", "C2CMsgAutoDownloadFile_Priority_CreateTime", "C2CMsgAutoDownloadFile"));
            hVar.i(2L, 4L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "Exist Table %s Count %s", "C2CMsgAutoDownloadFile", java.lang.Integer.valueOf(hVar.f("C2CMsgAutoDownloadFile")));
        }
        this.f338995b = hVar.a(java.lang.String.format("INSERT OR IGNORE INTO %s (id, fromuser, realuser, restype, createtime, reason, status, downloadtime, msgsvrid, filesize, fileext, opentime, priority, prioritytype, fileid) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);", "C2CMsgAutoDownloadFile"));
        this.f338996c = hVar.a(java.lang.String.format("DELETE FROM %s WHERE id = ? AND msgsvrid = ?", "C2CMsgAutoDownloadFile"));
        this.f338997d = hVar.a(java.lang.String.format("DELETE FROM %s WHERE fromuser = ?;", "C2CMsgAutoDownloadFile"));
        this.f338998e = hVar.a(java.lang.String.format("UPDATE %s SET status = ? WHERE id = ? AND msgsvrid = ?", "C2CMsgAutoDownloadFile"));
        this.f338999f = hVar.a(java.lang.String.format("UPDATE %s SET reason = reason | ?, status = ? WHERE id = ? AND msgsvrid = ?", "C2CMsgAutoDownloadFile"));
        this.f339000g = hVar.a(java.lang.String.format("UPDATE %s SET downloadtime = ?, status = ? WHERE id = ? AND msgsvrid = ? AND downloadtime = 0", "C2CMsgAutoDownloadFile"));
        this.f339001h = hVar.a(java.lang.String.format("UPDATE %s SET opentime = ? WHERE id = ? AND msgsvrid = ? AND opentime = 0", "C2CMsgAutoDownloadFile"));
    }

    public final r45.qc a(android.database.Cursor cursor) {
        r45.qc qcVar = new r45.qc();
        qcVar.f383818d = cursor.getString(0);
        qcVar.f383819e = cursor.getString(1);
        qcVar.f383820f = cursor.getString(2);
        qcVar.f383821g = cursor.getInt(3);
        qcVar.f383822h = cursor.getLong(4);
        qcVar.f383823i = cursor.getInt(5);
        qcVar.f383824m = cursor.getInt(6);
        qcVar.f383825n = cursor.getLong(7);
        qcVar.f383826o = cursor.getLong(8);
        qcVar.f383827p = cursor.getInt(9);
        qcVar.f383828q = cursor.getString(10);
        qcVar.f383829r = cursor.getLong(11);
        qcVar.f383830s = cursor.getFloat(12);
        qcVar.f383831t = cursor.getInt(13);
        qcVar.f383832u = cursor.getString(14);
        return qcVar;
    }

    public void b(java.lang.String str, long j17) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f338996c;
        sQLiteStatement.bindString(1, str);
        sQLiteStatement.bindLong(2, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "delete %s img %s %s", java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()), str, java.lang.Long.valueOf(j17));
    }

    public r45.qc c(java.lang.String str, long j17) {
        android.database.Cursor h17 = this.f338994a.h(java.lang.String.format("SELECT * FROM %s WHERE id = ? AND msgsvrid = ?;", "C2CMsgAutoDownloadFile"), new java.lang.String[]{str, java.lang.String.valueOf(j17)});
        try {
            if (h17.moveToNext()) {
                return a(h17);
            }
            h17.close();
            return null;
        } finally {
            h17.close();
        }
    }

    public void d(r45.qc qcVar) {
        java.lang.String str = qcVar.f383818d;
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f338995b;
        sQLiteStatement.bindString(1, str);
        sQLiteStatement.bindString(2, qcVar.f383819e);
        sQLiteStatement.bindString(3, qcVar.f383820f);
        sQLiteStatement.bindLong(4, qcVar.f383821g);
        sQLiteStatement.bindLong(5, qcVar.f383822h);
        sQLiteStatement.bindLong(6, qcVar.f383823i);
        sQLiteStatement.bindLong(7, qcVar.f383824m);
        sQLiteStatement.bindLong(8, qcVar.f383825n);
        sQLiteStatement.bindLong(9, qcVar.f383826o);
        sQLiteStatement.bindLong(10, qcVar.f383827p);
        sQLiteStatement.bindString(11, qcVar.f383828q);
        sQLiteStatement.bindLong(12, qcVar.f383829r);
        sQLiteStatement.bindDouble(13, qcVar.f383830s);
        sQLiteStatement.bindLong(14, qcVar.f383831t);
        sQLiteStatement.bindString(15, qcVar.f383832u);
        sQLiteStatement.execute();
    }

    public boolean e(java.lang.String str, long j17) {
        android.database.Cursor h17 = this.f338994a.h(java.lang.String.format("SELECT 1 FROM %s WHERE id = ? AND msgsvrid = ?", "C2CMsgAutoDownloadFile"), new java.lang.String[]{str, java.lang.String.valueOf(j17)});
        try {
            return h17.moveToNext();
        } finally {
            h17.close();
        }
    }

    public void f(java.lang.String str, long j17, int i17) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f338998e;
        sQLiteStatement.bindLong(1, i17);
        sQLiteStatement.bindString(2, str);
        sQLiteStatement.bindLong(3, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "updateStatus %s res %s %s %s", java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }
}
