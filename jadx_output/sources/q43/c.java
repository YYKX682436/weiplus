package q43;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final q43.c f360083d = new q43.c();

    @Override // java.lang.Runnable
    public final void run() {
        q43.j Vi = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi();
        Vi.getClass();
        java.lang.String str = "select intervalSeconds - abs(" + com.tencent.mm.sdk.platformtools.t8.i1() + " - checkCgiTime) as diffTime from GameResourceDownload order by diffTime asc";
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadStorage", "getMinCheckInterval, sql: " + str);
        android.database.Cursor rawQuery = Vi.rawQuery(str, new java.lang.String[0]);
        if (rawQuery != null) {
            r1 = rawQuery.moveToNext() ? java.lang.Long.valueOf(rawQuery.getLong(0)) : null;
            rawQuery.close();
        }
        if (r1 == null) {
            q43.g.f360095b.d();
            return;
        }
        long longValue = r1.longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "resetCheckTimer, interval:" + longValue);
        com.tencent.mm.sdk.platformtools.b4 b4Var = q43.g.f360095b;
        b4Var.d();
        if (longValue <= 0) {
            q43.g.a(q43.g.f360094a);
        } else {
            long j17 = longValue * 1000;
            b4Var.c(j17, j17);
        }
        r1.longValue();
    }
}
