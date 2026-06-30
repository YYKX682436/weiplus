package qb2;

/* loaded from: classes8.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qb2.u1 f361300a = new qb2.u1();

    public final boolean a(int i17) {
        com.tencent.mm.plugin.finder.storage.pa0 jk6 = ((c61.l7) i95.n0.c(c61.l7.class)).jk();
        java.lang.String str = "DELETE FROM " + jk6.getTableName() + " WHERE type = " + i17;
        boolean execSQL = jk6.execSQL(jk6.getTableName(), str);
        com.tencent.mars.xlog.Log.i("Finder.NewXmlDataLogic", "clearAll sql: " + str + ", success: " + execSQL);
        return execSQL;
    }

    public final boolean b(int i17, long j17) {
        com.tencent.mm.plugin.finder.storage.pa0 jk6 = ((c61.l7) i95.n0.c(c61.l7.class)).jk();
        java.lang.String str = "DELETE FROM " + jk6.getTableName() + " WHERE type = " + i17 + " AND createTime < " + j17;
        boolean execSQL = jk6.execSQL(jk6.getTableName(), str);
        com.tencent.mars.xlog.Log.i("Finder.NewXmlDataLogic", "clearBeforeTime sql: " + str + ", success: " + execSQL);
        return execSQL;
    }

    public final java.util.List c(int i17) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.finder.storage.pa0 jk6 = ((c61.l7) i95.n0.c(c61.l7.class)).jk();
        java.lang.String str = "SELECT * FROM " + jk6.getTableName() + " WHERE type = " + i17 + " ORDER BY createTime ASC";
        android.database.Cursor rawQuery = jk6.rawQuery(str, new java.lang.String[0]);
        if (rawQuery != null) {
            linkedList = new java.util.LinkedList();
            while (rawQuery.moveToNext()) {
                try {
                    l75.f0 f0Var = (l75.f0) com.tencent.mm.plugin.finder.storage.zj0.class.newInstance();
                    f0Var.convertFrom(rawQuery);
                    linkedList.add(f0Var);
                } finally {
                }
            }
            vz5.b.a(rawQuery, null);
        } else {
            linkedList = new java.util.LinkedList();
        }
        com.tencent.mars.xlog.Log.i("Finder.NewXmlDataLogic", "queryAll sql: " + str + ", size: " + linkedList.size());
        return linkedList;
    }

    public final boolean d(java.lang.String localId) {
        kotlin.jvm.internal.o.g(localId, "localId");
        com.tencent.mm.plugin.finder.storage.pa0 jk6 = ((c61.l7) i95.n0.c(c61.l7.class)).jk();
        java.lang.String str = "DELETE FROM " + jk6.getTableName() + " WHERE localId = " + localId;
        boolean execSQL = jk6.execSQL(jk6.getTableName(), str);
        com.tencent.mars.xlog.Log.i("Finder.NewXmlDataLogic", "removeById sql: " + str + ", success: " + execSQL);
        return execSQL;
    }
}
