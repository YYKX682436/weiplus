package i53;

/* loaded from: classes8.dex */
public class g0 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f288578d = {l75.n0.getCreateSQLs(i53.x.L, "GameHaowanPublishEdition")};

    public g0(l75.k0 k0Var) {
        super(k0Var, i53.x.L, "GameHaowanPublishEdition", null);
    }

    public i53.x D0(java.lang.String str) {
        java.lang.String format = java.lang.String.format("select * from %s where %s=\"%s\"", "GameHaowanPublishEdition", "taskId", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "query, sql : %s", format);
        android.database.Cursor rawQuery = rawQuery(format, new java.lang.String[0]);
        i53.x xVar = null;
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToNext()) {
            xVar = new i53.x();
            xVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return xVar;
    }

    public java.util.LinkedList J0(int i17) {
        java.lang.String format = java.lang.String.format("select * from %s where %s=%d", "GameHaowanPublishEdition", "publishState", java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryAllPublish: %s", format);
        android.database.Cursor rawQuery = rawQuery(format, new java.lang.String[0]);
        if (rawQuery == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (rawQuery.moveToNext()) {
            i53.x xVar = new i53.x();
            xVar.convertFrom(rawQuery);
            linkedList.add(xVar);
        }
        rawQuery.close();
        return linkedList;
    }

    public boolean L0(java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "GameHaowanPublishEdition", "uploadState", java.lang.Integer.valueOf(i17), "taskId", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMediaUploadState, sql : %s", format);
        return execSQL("GameHaowanPublishEdition", format);
    }

    public boolean P0(java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "GameHaowanPublishEdition", "mixState", java.lang.Integer.valueOf(i17), "taskId", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMixState, sql : %s", format);
        return execSQL("GameHaowanPublishEdition", format);
    }

    public boolean W0(java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "GameHaowanPublishEdition", "publishState", java.lang.Integer.valueOf(i17), "taskId", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updatePublishState, sql : %s", format);
        return execSQL("GameHaowanPublishEdition", format);
    }

    public void y0(java.util.LinkedList linkedList) {
        java.util.LinkedList z07 = z0(linkedList);
        if (z07 != null) {
            java.util.Iterator it = z07.iterator();
            while (it.hasNext()) {
                i53.x xVar = (i53.x) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(xVar.field_localIdList)) {
                    ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().y0(r53.f.G(xVar.field_localIdList));
                }
            }
            java.lang.String format = java.lang.String.format("delete from %s where %s in %s", "GameHaowanPublishEdition", "taskId", r53.f.f(linkedList));
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchDelete, sql : %s", format);
            execSQL("GameHaowanPublishEdition", format);
        }
    }

    public java.util.LinkedList z0(java.util.LinkedList linkedList) {
        java.lang.String format = java.lang.String.format("select * from %s where %s in %s", "GameHaowanPublishEdition", "taskId", r53.f.f(linkedList));
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchQuery, sql : %s", format);
        android.database.Cursor rawQuery = rawQuery(format, new java.lang.String[0]);
        if (rawQuery == null) {
            return null;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        while (rawQuery.moveToNext()) {
            i53.x xVar = new i53.x();
            xVar.convertFrom(rawQuery);
            linkedList2.add(xVar);
        }
        rawQuery.close();
        return linkedList2;
    }
}
