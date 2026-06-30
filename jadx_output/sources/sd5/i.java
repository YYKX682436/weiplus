package sd5;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final sd5.i f406719a = new sd5.i();

    public final com.tencent.mm.storage.f9 a(java.lang.String talker, int i17, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        android.database.Cursor N6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N6(talker, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker) - i17, j17, 0L);
        try {
            try {
                N6.moveToFirst();
                if (!N6.isAfterLast()) {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.convertFrom(N6);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataRepo", "getMsgByPosition[" + f9Var.getMsgId() + "]:[" + com.tencent.mm.sdk.platformtools.t8.G1(f9Var.j()) + ']');
                    return f9Var;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MvvmMsgDataRepo", e17, "", new java.lang.Object[0]);
            }
            return null;
        } finally {
            N6.close();
        }
    }

    public final java.util.List b(java.lang.String talker, int i17, long j17, long j18) {
        kotlin.jvm.internal.o.g(talker, "talker");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor K6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().K6(talker, i17, j17, j18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            K6.moveToFirst();
            while (!K6.isAfterLast()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(K6);
                arrayList.add(f9Var);
                K6.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MvvmMsgDataRepo", e17, "", new java.lang.Object[0]);
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataRepo", "getMsgListAfter[%s] after fillItem:%s, cost:%s, count:%s, deleteCreateTime:%s, createTime:%s", talker, java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        K6.close();
        return arrayList;
    }

    public final java.util.List c(java.lang.String talker, int i17, long j17, long j18) {
        kotlin.jvm.internal.o.g(talker, "talker");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor N6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N6(talker, i17, j17, j18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            N6.moveToFirst();
            while (!N6.isAfterLast()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(N6);
                arrayList.add(f9Var);
                N6.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MvvmMsgDataRepo", e17, "", new java.lang.Object[0]);
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataRepo", "getMsgListBefore[%s] after fillItem:%s, cost:%s, count:%s, deleteCreateTime:%s, createTime:%s", talker, java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        N6.close();
        return arrayList;
    }

    public final java.util.List d(java.lang.String talker, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(talker, "talker");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j27 = j17 + 1;
        android.database.Cursor V2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().V2(talker, java.lang.Math.max(j27, j18), java.lang.Math.max(j27, j19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            V2.moveToFirst();
            while (!V2.isAfterLast()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(V2);
                arrayList.add(f9Var);
                V2.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MvvmMsgDataRepo", e17, "", new java.lang.Object[0]);
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataRepo", "getMsgListCreateRange[%s] after fillItem:%s, cost:%s, deleteCreateTime:%s, topCreateTime:%s, bottomCreateTime:%s", talker, java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
        }
        V2.close();
        return arrayList;
    }
}
