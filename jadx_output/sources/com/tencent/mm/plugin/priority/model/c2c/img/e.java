package com.tencent.mm.plugin.priority.model.c2c.img;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final kq3.h f153182a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f153183b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f153184c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f153185d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f153186e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f153187f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f153188g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f153189h;

    public e(kq3.h hVar) {
        this.f153182a = hVar;
        if (hVar.e(1L, 0L) != 1) {
            if (hVar.g("C2CMsgAutoDownloadRes")) {
                hVar.b("C2CMsgAutoDownloadRes");
            }
            hVar.c(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (msgid INTEGER PRIMARY KEY, fromuser TEXT, realuser TEXT, restype INTEGER, createtime INTEGER, reason INTEGER, status INTEGER, downloadtime INTEGER, msgsvrid LONG, imgsize INTEGER, opentime INTEGER, priority FLOAT, prioritytype INTEGER);", "C2CMsgAutoDownloadRes"));
            hVar.c(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s ON %s(priority, createtime);", "C2CMsgAutoDownloadRes_Priority_CreateTime", "C2CMsgAutoDownloadRes"));
            hVar.i(1L, 1L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "Exist Table %s Count %d", "C2CMsgAutoDownloadRes", java.lang.Integer.valueOf(hVar.f("C2CMsgAutoDownloadRes")));
        }
        this.f153183b = hVar.a(java.lang.String.format("INSERT OR IGNORE INTO %s (msgid, fromuser, realuser, restype, createtime, reason, status, downloadtime, msgsvrid, imgsize, opentime, priority, prioritytype) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);", "C2CMsgAutoDownloadRes"));
        this.f153184c = hVar.a(java.lang.String.format("DELETE FROM %s WHERE msgid = ?", "C2CMsgAutoDownloadRes"));
        this.f153185d = hVar.a(java.lang.String.format("DELETE FROM %s WHERE fromuser = ?;", "C2CMsgAutoDownloadRes"));
        this.f153186e = hVar.a(java.lang.String.format("UPDATE %s SET status = ? WHERE msgid = ?", "C2CMsgAutoDownloadRes"));
        this.f153187f = hVar.a(java.lang.String.format("UPDATE %s SET reason = reason | ?, status = ? WHERE msgid = ?", "C2CMsgAutoDownloadRes"));
        this.f153188g = hVar.a(java.lang.String.format("UPDATE %s SET downloadtime = ?, status = ?, imgsize = ? WHERE msgid = ? AND downloadtime = 0", "C2CMsgAutoDownloadRes"));
        this.f153189h = hVar.a(java.lang.String.format("UPDATE %s SET opentime = ? WHERE msgid = ?", "C2CMsgAutoDownloadRes"));
    }

    public final r45.rc a(android.database.Cursor cursor) {
        r45.rc rcVar = new r45.rc();
        rcVar.f384709d = cursor.getLong(0);
        rcVar.f384710e = cursor.getString(1);
        rcVar.f384711f = cursor.getString(2);
        rcVar.f384712g = cursor.getInt(3);
        rcVar.f384713h = cursor.getLong(4);
        rcVar.f384714i = cursor.getInt(5);
        rcVar.f384715m = cursor.getInt(6);
        rcVar.f384716n = cursor.getLong(7);
        rcVar.f384717o = cursor.getLong(8);
        rcVar.f384718p = cursor.getInt(9);
        rcVar.f384719q = cursor.getLong(10);
        rcVar.f384720r = cursor.getFloat(11);
        rcVar.f384721s = cursor.getInt(12);
        return rcVar;
    }

    public r45.rc b(int i17, float f17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 432000000;
        android.database.Cursor h17 = this.f153182a.h(java.lang.String.format("SELECT * FROM %s Img, %s Chat WHERE Chat.rank <= ? AND Chat.totallsp > ? AND Chat.chat = Img.fromuser AND createtime > ? AND Img.status = ? ORDER BY Img.createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes", "C2CChatUsageResult"), new java.lang.String[]{java.lang.String.valueOf(i17), java.lang.String.valueOf(f17), java.lang.String.valueOf(currentTimeMillis), java.lang.String.valueOf(1)});
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

    public r45.rc c(long j17) {
        android.database.Cursor h17 = this.f153182a.h(java.lang.String.format("SELECT * FROM %s WHERE msgid = ?;", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(j17)});
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

    public r45.rc d(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 432000000;
        android.database.Cursor h17 = this.f153182a.h(java.lang.String.format("SELECT * FROM %s WHERE status = ? AND (reason & ?) > 0 AND createtime > ? ORDER BY createtime DESC LIMIT 1;", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(i17), java.lang.String.valueOf(currentTimeMillis)});
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

    public boolean e(long j17) {
        android.database.Cursor h17 = this.f153182a.h(java.lang.String.format("SELECT 1 FROM %s WHERE msgid = ?", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(j17)});
        try {
            return h17.moveToNext();
        } finally {
            h17.close();
        }
    }

    public void f(long j17, int i17) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f153186e;
        sQLiteStatement.bindLong(1, i17);
        sQLiteStatement.bindLong(2, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "updateStatus %d res %d %d", java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    public void g(long j17, int i17, int i18) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f153187f;
        sQLiteStatement.bindLong(1, i17);
        sQLiteStatement.bindLong(2, i18);
        sQLiteStatement.bindLong(3, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "updateStatusAndReason %d res %d %d %d", java.lang.Integer.valueOf(sQLiteStatement.executeUpdateDelete()), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
