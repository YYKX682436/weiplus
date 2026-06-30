package mq3;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final kq3.h f330776a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f330777b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f330778c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f330779d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f330780e;

    public d(kq3.h hVar) {
        this.f330776a = hVar;
        if (hVar.e(49L, 0L) != 5) {
            if (hVar.g("C2CChatUsage")) {
                hVar.b("C2CChatUsage");
            }
            hVar.c(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (chat TEXT, date INTEGER, chattype INTEGER DEFAULT 0, opencount INTEGER DEFAULT 0, sendmsgcount INTEGER DEFAULT 0, staytime INTEGER DEFAULT 0, consumemsgcount INTEGER DEFAULT 0, PRIMARY KEY(chat, date));", "C2CChatUsage"));
            hVar.i(49L, 5L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CChatUsageStorage", "Exist Table %s Count %d", "C2CChatUsage", java.lang.Integer.valueOf(hVar.f("C2CChatUsage")));
        }
        this.f330777b = hVar.a(java.lang.String.format("INSERT OR IGNORE INTO %s (chat, date, chattype) VALUES (?,?,?)", "C2CChatUsage"));
        this.f330778c = hVar.a(java.lang.String.format("UPDATE %s SET opencount = opencount + 1, staytime = staytime + ? WHERE chat = ? AND date = ?", "C2CChatUsage"));
        this.f330779d = hVar.a(java.lang.String.format("UPDATE %s SET sendmsgcount = sendmsgcount + 1 WHERE chat = ? AND date = ?", "C2CChatUsage"));
        this.f330780e = hVar.a(java.lang.String.format("UPDATE %s SET consumemsgcount = consumemsgcount + 1 WHERE chat = ? AND date = ?", "C2CChatUsage"));
    }

    public boolean a(java.lang.String str, long j17, long j18) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f330777b;
        sQLiteStatement.bindString(1, str);
        sQLiteStatement.bindLong(2, j17);
        sQLiteStatement.bindLong(3, j18);
        return sQLiteStatement.executeInsert() >= 0;
    }
}
