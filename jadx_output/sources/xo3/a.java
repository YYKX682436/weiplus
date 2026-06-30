package xo3;

/* loaded from: classes9.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f455765e = {l75.n0.getCreateSQLs(wo3.q.f448211t, "OfflineOrderStatus")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f455766d;

    public a(l75.k0 k0Var) {
        super(k0Var, wo3.q.f448211t, "OfflineOrderStatus", null);
        this.f455766d = k0Var;
    }

    public wo3.q D0(java.lang.String str) {
        android.database.Cursor f17 = this.f455766d.f("select * from OfflineOrderStatus where reqkey=?", new java.lang.String[]{str}, 2);
        wo3.q qVar = null;
        if (f17 == null) {
            return null;
        }
        f17.moveToFirst();
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "in getOrderStatusByTranId: cursor.isAfterLast() = " + f17.isAfterLast());
        if (!f17.isAfterLast()) {
            qVar = new wo3.q();
            qVar.convertFrom(f17);
        }
        f17.close();
        return qVar;
    }

    public int J0() {
        android.database.Cursor f17 = this.f455766d.f(java.lang.String.format("SELECT COUNT(*) FROM %s;", "OfflineOrderStatus"), null, 2);
        int i17 = 0;
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineOrderStatusStorage", "getOrdersCount: error.cursor is null\n");
        } else {
            if (f17.moveToNext() && f17.getColumnCount() > 0) {
                i17 = f17.getInt(0);
            }
            f17.close();
        }
        return i17;
    }

    public void L0(java.lang.String str) {
        wo3.q D0 = D0(str);
        if (D0 != null) {
            D0.field_status = -1;
        } else {
            D0 = new wo3.q();
            D0.field_reqkey = str;
            D0.field_status = -1;
        }
        P0(D0);
    }

    public void P0(wo3.q qVar) {
        boolean z17;
        java.lang.String str = qVar.field_reqkey;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineOrderStatusStorage", "status.field_reqkey is null");
            return;
        }
        android.database.Cursor f17 = this.f455766d.f("select * from OfflineOrderStatus where reqkey=?", new java.lang.String[]{str}, 2);
        if (f17 == null) {
            z17 = false;
        } else {
            f17.moveToFirst();
            z17 = !f17.isAfterLast();
            f17.close();
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: update reqKey: %s,  status: %d ", qVar.field_reqkey, java.lang.Integer.valueOf(qVar.field_status));
            update(qVar, new java.lang.String[0]);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: insert reqKey: %s,  status: %d ", qVar.field_reqkey, java.lang.Integer.valueOf(qVar.field_status));
            insert(qVar);
        }
    }

    public wo3.q y0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "in getLastestOrder: orders count: %d, latest 3 orders: %s", java.lang.Integer.valueOf(J0()), z0(3));
        wo3.q qVar = null;
        android.database.Cursor f17 = this.f455766d.f("SELECT * FROM OfflineOrderStatus WHERE status!=-1 ORDER BY rowid DESC LIMIT 1", null, 2);
        if (f17 == null) {
            return null;
        }
        f17.moveToFirst();
        if (!f17.isAfterLast()) {
            qVar = new wo3.q();
            qVar.convertFrom(f17);
        }
        f17.close();
        if (qVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder status = " + qVar.field_status);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder null");
        }
        return qVar;
    }

    public java.lang.String z0(int i17) {
        android.database.Cursor f17 = this.f455766d.f(java.lang.String.format("SELECT * FROM %s ORDER BY %s DESC LIMIT %d;", "OfflineOrderStatus", "rowid", java.lang.Integer.valueOf(i17)), null, 2);
        java.lang.String str = "";
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineOrderStatusStorage", "getAllOrdersInfo: error.cursor is null\n");
        } else {
            int i18 = 0;
            while (f17.moveToNext() && (i18 = i18 + 1) <= i17) {
                for (int i19 = 0; i19 < f17.getColumnCount(); i19++) {
                    str = str + f17.getColumnName(i19) + ": " + f17.getString(i19) + ", ";
                }
                str = str + ";";
            }
            f17.close();
        }
        return str;
    }
}
