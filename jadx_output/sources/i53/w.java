package i53;

/* loaded from: classes8.dex */
public class w extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f288766d = {l75.n0.getCreateSQLs(i53.u.S, "GameHaowanMedia")};

    public w(l75.k0 k0Var) {
        super(k0Var, i53.u.S, "GameHaowanMedia", null);
    }

    public void y0(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2;
        java.lang.String format = java.lang.String.format("select * from %s where %s in %s", "GameHaowanMedia", dm.i4.COL_LOCALID, r53.f.f(linkedList));
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchGet, sql: " + format);
        android.database.Cursor rawQuery = rawQuery(format, new java.lang.String[0]);
        if (rawQuery == null) {
            linkedList2 = null;
        } else {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            while (rawQuery.moveToNext()) {
                i53.u uVar = new i53.u();
                uVar.convertFrom(rawQuery);
                linkedList3.add(uVar);
            }
            rawQuery.close();
            linkedList2 = linkedList3;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
            p95.a.a(new i53.v(this, linkedList2));
        }
        java.lang.String format2 = java.lang.String.format("delete from %s where %s in %s", "GameHaowanMedia", dm.i4.COL_LOCALID, r53.f.f(linkedList));
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchDelete, sql: " + format2);
        execSQL("GameHaowanMedia", format2);
    }

    public i53.u z0(java.lang.String str) {
        java.lang.String format = java.lang.String.format("select * from %s where %s=\"%s\"", "GameHaowanMedia", dm.i4.COL_LOCALID, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "get, sql: " + format);
        android.database.Cursor rawQuery = rawQuery(format, new java.lang.String[0]);
        i53.u uVar = null;
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToNext()) {
            uVar = new i53.u();
            uVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return uVar;
    }
}
