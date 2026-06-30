package cu2;

/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.g0 f222404a = new cu2.g0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f222405b = new java.util.concurrent.ConcurrentHashMap();

    public final int a(long j17) {
        f222405b.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.finder.storage.bb0 bb0Var = (com.tencent.mm.plugin.finder.storage.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).getValue();
        p75.m0 i17 = dm.b4.f235839h.i(java.lang.Long.valueOf(j17));
        p75.n0 n0Var = dm.b4.f235838g;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        p75.h hVar = (p75.h) i17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        java.lang.String table = n0Var.f352676a;
        kotlin.jvm.internal.o.g(table, "table");
        l75.k0 k0Var = bb0Var.f126519d;
        if (k0Var != null) {
            return k0Var.delete(table, b17, e17);
        }
        return -1;
    }

    public final com.tencent.mm.plugin.finder.storage.ak0 b(long j17) {
        if (j17 == 0) {
            return null;
        }
        android.database.Cursor rawQuery = ((com.tencent.mm.plugin.finder.storage.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).getValue()).rawQuery("SELECT rowid, * FROM FinderCourseInfo WHERE topic_id = " + j17, new java.lang.String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToNext()) {
                    com.tencent.mm.plugin.finder.storage.ak0 ak0Var = new com.tencent.mm.plugin.finder.storage.ak0();
                    ak0Var.convertFrom(rawQuery);
                    vz5.b.a(rawQuery, null);
                    return ak0Var;
                }
                vz5.b.a(rawQuery, null);
            } finally {
            }
        }
        return null;
    }

    public final boolean c(com.tencent.mm.plugin.finder.storage.ak0 paidCollectionInfo) {
        kotlin.jvm.internal.o.g(paidCollectionInfo, "paidCollectionInfo");
        f222405b.remove(java.lang.Long.valueOf(paidCollectionInfo.field_topic_id));
        boolean replace = ((com.tencent.mm.plugin.finder.storage.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).getValue()).replace(paidCollectionInfo);
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionLogic", "replaceCollection:new course id=" + paidCollectionInfo.field_topic_id + " success=" + replace);
        return replace;
    }

    public final nr2.m d(r45.uz0 courseInfo) {
        kotlin.jvm.internal.o.g(courseInfo, "courseInfo");
        r45.do2 do2Var = new r45.do2();
        do2Var.set(0, courseInfo);
        return new nr2.m(do2Var);
    }

    public final com.tencent.mm.plugin.finder.storage.ak0 e(r45.uz0 courseInfo) {
        kotlin.jvm.internal.o.g(courseInfo, "courseInfo");
        com.tencent.mm.plugin.finder.storage.ak0 ak0Var = new com.tencent.mm.plugin.finder.storage.ak0();
        ak0Var.field_topic_id = courseInfo.getLong(0);
        ak0Var.field_courseInfo = courseInfo;
        ak0Var.field_dramaInfo = new r45.n11();
        return ak0Var;
    }
}
