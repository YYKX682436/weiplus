package q02;

/* loaded from: classes4.dex */
public abstract class b {
    public static java.util.LinkedList a() {
        java.util.LinkedList linkedList = null;
        if (b() == null) {
            return null;
        }
        q02.c b17 = b();
        b17.getClass();
        android.database.Cursor rawQuery = b17.rawQuery(java.lang.String.format("select * from %s order by %s desc", "DownloadTaskItem", "modifyTime"), new java.lang.String[0]);
        if (rawQuery != null) {
            linkedList = new java.util.LinkedList();
            while (rawQuery.moveToNext()) {
                q02.a aVar = new q02.a();
                aVar.convertFrom(rawQuery);
                linkedList.add(aVar);
            }
            rawQuery.close();
        }
        return linkedList;
    }

    public static q02.c b() {
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                if (i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DownloadTaskItemDbHelp", "service not ready");
                    return null;
                }
                l02.t tVar = (l02.t) ((m02.t) i95.n0.c(m02.t.class));
                if (tVar.f314838d == null) {
                    synchronized (tVar) {
                        if (tVar.f314838d == null) {
                            tVar.f314838d = new q02.c(gm0.j1.u().f273153f);
                        }
                    }
                }
                return tVar.f314838d;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.DownloadTaskItemDbHelp", "no user login");
        return null;
    }

    public static boolean c(java.lang.String str, int i17) {
        if (b() == null) {
            return false;
        }
        q02.a aVar = new q02.a();
        aVar.field_appId = str;
        aVar.field_status = i17;
        aVar.field_modifyTime = java.lang.System.currentTimeMillis();
        return b().update(aVar, new java.lang.String[0]);
    }
}
