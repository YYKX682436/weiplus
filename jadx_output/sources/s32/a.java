package s32;

/* loaded from: classes12.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f402458e = {l75.n0.getCreateSQLs(r32.c.f368961v, "HardDeviceRankFollowInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f402459d;

    public a(l75.k0 k0Var) {
        super(k0Var, r32.c.f368961v, "HardDeviceRankFollowInfo", null);
        this.f402459d = k0Var;
        k0Var.A("HardDeviceRankFollowInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankFollowRankIdAppNameIndex ON HardDeviceRankFollowInfo ( rankID, appusername )");
    }

    public r32.c D0(q32.b bVar) {
        r32.c cVar = null;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: param error");
            return null;
        }
        java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? and %s = ? and %s = ? limit 1", "HardDeviceRankFollowInfo", "rankID", dm.i4.COL_USERNAME, "appusername");
        java.lang.String[] strArr = new java.lang.String[3];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = bVar.f359926a;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        java.lang.String str2 = bVar.f359928c;
        if (str2 == null) {
            str2 = "";
        }
        strArr[1] = str2;
        java.lang.String str3 = bVar.f359927b;
        strArr[2] = str3 != null ? str3 : "";
        android.database.Cursor f17 = this.f402459d.f(format, strArr, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get no follow in DB");
            return null;
        }
        if (f17.moveToFirst()) {
            cVar = new r32.c();
            cVar.convertFrom(f17);
        }
        f17.close();
        return cVar;
    }

    public java.util.ArrayList J0() {
        android.database.Cursor f17 = this.f402459d.f(java.lang.String.format("select *, rowid from %s where %s= ? and %s = ? order by rowid asc", "HardDeviceRankFollowInfo", "rankID", "appusername"), new java.lang.String[]{"hardcode_rank_id", "hardcode_app_name"}, 2);
        java.util.ArrayList arrayList = null;
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get follows not in DB");
        } else {
            if (f17.moveToFirst()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                do {
                    r32.c cVar = new r32.c();
                    cVar.convertFrom(f17);
                    f17.getColumnIndex("rowid");
                    cVar.toString();
                    arrayList2.add(cVar);
                } while (f17.moveToNext());
                arrayList2.size();
                arrayList2.toString();
                arrayList = arrayList2;
            }
            f17.close();
        }
        return arrayList;
    }

    public boolean L0(r32.c cVar) {
        boolean z17 = false;
        iz5.a.g(null, cVar != null);
        r32.c D0 = D0(new q32.b(cVar.field_rankID, cVar.field_appusername, cVar.field_username));
        if (D0 != null) {
            D0.field_step = cVar.field_step;
            update(D0, "rankID", "appusername", dm.i4.COL_USERNAME);
            z17 = true;
        }
        if (z17) {
            return true;
        }
        insert(cVar);
        return true;
    }

    public void P0(java.util.List list) {
        if (com.tencent.mm.sdk.platformtools.t8.K0("hardcode_rank_id") || com.tencent.mm.sdk.platformtools.t8.K0("hardcode_app_name")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: delete follows,params is null");
        } else {
            this.f402459d.delete("HardDeviceRankFollowInfo", "rankID=? and appusername=?", new java.lang.String[]{"hardcode_rank_id", "hardcode_app_name"});
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r32.c cVar = (r32.c) it.next();
                cVar.field_rankID = "hardcode_rank_id";
                cVar.field_appusername = "hardcode_app_name";
                L0(cVar);
            }
        }
    }

    public boolean y0(java.lang.String str) {
        java.lang.String format = java.lang.String.format("select * from %s where %s=? and %s=? and %s=? limit 1", "HardDeviceRankFollowInfo", "rankID", "appusername", dm.i4.COL_USERNAME);
        java.lang.String[] strArr = new java.lang.String[3];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        strArr[0] = "hardcode_rank_id";
        strArr[1] = "hardcode_app_name";
        if (str == null) {
            str = "";
        }
        strArr[2] = str;
        android.database.Cursor f17 = this.f402459d.f(format, strArr, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceFollowInfoStg", "ap: check follow not in DB");
            return false;
        }
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        return moveToFirst;
    }

    public boolean z0(java.lang.String str) {
        r32.c D0 = D0(new q32.b("hardcode_rank_id", "hardcode_app_name", str));
        if (D0 == null) {
            return false;
        }
        delete(D0, "rankID", "appusername", dm.i4.COL_USERNAME);
        return true;
    }
}
