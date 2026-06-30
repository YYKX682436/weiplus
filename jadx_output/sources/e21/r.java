package e21;

/* loaded from: classes11.dex */
public class r extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f246571e = {"CREATE TABLE IF NOT EXISTS oplog2 ( id INTEGER PRIMARY KEY , inserTime long , cmdId int , buffer blob , reserved1 int , reserved2 long , reserved3 text , reserved4 text ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f246572d;

    public r(l75.k0 k0Var) {
        this.f246572d = k0Var;
    }

    public int getCount() {
        android.database.Cursor B = this.f246572d.B("SELECT COUNT(*) FROM oplog2", null);
        if (B == null || !B.moveToFirst()) {
            if (B != null) {
                B.close();
            }
            return 0;
        }
        int i17 = B.getInt(0);
        B.close();
        return i17;
    }

    public int m0(xg3.q0 q0Var) {
        if (q0Var == null) {
            return -1;
        }
        return this.f246572d.delete("oplog2", "id= ? AND inserTime= ?", new java.lang.String[]{"" + q0Var.f454423b, "" + q0Var.f454424c});
    }

    public java.util.List n0(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = this.f246572d.B("select oplog2.id,oplog2.inserTime,oplog2.cmdId,oplog2.buffer,oplog2.reserved1,oplog2.reserved2,oplog2.reserved3,oplog2.reserved4 from oplog2  order by inserTime asc limit ?", new java.lang.String[]{java.lang.String.valueOf(i17)});
        if (B == null) {
            return arrayList;
        }
        int count = B.getCount();
        if (count <= 0) {
            B.close();
            return arrayList;
        }
        for (int i18 = 0; i18 < count; i18++) {
            B.moveToPosition(i18);
            xg3.q0 q0Var = new xg3.q0(0);
            q0Var.f454423b = B.getInt(0);
            q0Var.f454424c = B.getLong(1);
            q0Var.f454425d = B.getInt(2);
            q0Var.f454426e = B.getBlob(3);
            q0Var.f454427f = B.getInt(4);
            q0Var.f454428g = B.getLong(5);
            q0Var.f454429h = B.getString(6);
            q0Var.f454430i = B.getString(7);
            arrayList.add(q0Var);
        }
        B.close();
        return arrayList;
    }

    public boolean s0(xg3.q0 q0Var) {
        if (q0Var == null) {
            return false;
        }
        q0Var.f454422a = -1;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((q0Var.f454422a & 2) != 0) {
            contentValues.put("inserTime", java.lang.Long.valueOf(q0Var.f454424c));
        }
        if ((q0Var.f454422a & 4) != 0) {
            contentValues.put("cmdId", java.lang.Integer.valueOf(q0Var.b()));
        }
        if ((q0Var.f454422a & 8) != 0) {
            contentValues.put("buffer", q0Var.a());
        }
        if ((q0Var.f454422a & 16) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(q0Var.f454427f));
        }
        if ((q0Var.f454422a & 32) != 0) {
            contentValues.put("reserved2", java.lang.Long.valueOf(q0Var.f454428g));
        }
        if ((q0Var.f454422a & 64) != 0) {
            contentValues.put("reserved3", q0Var.f454429h);
        }
        if ((q0Var.f454422a & 128) != 0) {
            contentValues.put("reserved4", q0Var.f454430i);
        }
        int l17 = (int) this.f246572d.l("oplog2", dm.i4.COL_ID, contentValues);
        if (l17 > 0) {
            q0Var.f454423b = l17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpLogStorage", "insert result:%d", java.lang.Integer.valueOf(l17));
        return l17 >= 0;
    }
}
