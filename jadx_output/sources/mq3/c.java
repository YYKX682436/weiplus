package mq3;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final kq3.h f330775a;

    public c(kq3.h hVar) {
        this.f330775a = hVar;
        if (hVar.e(65L, 0L) == 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CChatUsageResultStorage", "Exist Table %s Count %d", "C2CChatUsageResult", java.lang.Integer.valueOf(hVar.f("C2CChatUsageResult")));
            return;
        }
        if (hVar.g("C2CChatUsageResult")) {
            hVar.b("C2CChatUsageResult");
        }
        hVar.c(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (chat TEXT, openrmf DOUBLE DEFAULT 0, staytimedev DOUBLE DEFAULT 0,sendmsgrmf DOUBLE DEFAULT 0, consumemsgrmf DOUBLE DEFAULT 0, totallsp DOUBLE DEFAULT 0, rank INTEGER DEFAULT -1, PRIMARY KEY(chat));", "C2CChatUsageResult"));
        hVar.i(65L, 7L);
    }

    public final r45.ez a(android.database.Cursor cursor) {
        r45.ez ezVar = new r45.ez();
        ezVar.f373832d = cursor.getString(0);
        ezVar.f373833e = cursor.getDouble(1);
        ezVar.f373834f = cursor.getDouble(2);
        ezVar.f373835g = cursor.getDouble(3);
        ezVar.f373836h = cursor.getDouble(4);
        ezVar.f373837i = cursor.getDouble(5);
        ezVar.f373838m = cursor.getInt(6);
        return ezVar;
    }

    public r45.ez b(java.lang.String str) {
        android.database.Cursor h17 = this.f330775a.h(java.lang.String.format("SELECT * FROM %s WHERE chat = ?", "C2CChatUsageResult"), new java.lang.String[]{str});
        try {
            if (!h17.moveToNext()) {
                h17.close();
                return null;
            }
            r45.ez a17 = a(h17);
            h17.close();
            return a17;
        } catch (java.lang.Throwable th6) {
            if (h17 != null) {
                h17.close();
            }
            throw th6;
        }
    }
}
