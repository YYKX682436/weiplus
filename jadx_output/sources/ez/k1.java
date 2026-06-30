package ez;

@j95.b
/* loaded from: classes12.dex */
public final class k1 extends i95.w implements pt0.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f257751d = new java.util.concurrent.CopyOnWriteArraySet();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAccountInitialized, c2c img: ");
        pt0.e0 e0Var = pt0.f0.f358209b1;
        sb6.append(e0Var.f());
        sb6.append(", video: ");
        sb6.append(e0Var.i());
        sb6.append(", voice: ");
        sb6.append(e0Var.j());
        sb6.append(", voice: ");
        sb6.append(e0Var.j());
        sb6.append(", file: ");
        sb6.append(((java.lang.Boolean) ((jz5.n) pt0.e0.f358205m).getValue()).booleanValue());
        sb6.append(", emoji: ");
        sb6.append(e0Var.e());
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgFeatureService", sb6.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.tencent.mm.storage.f9 wi(java.lang.String str, long j17, java.lang.Boolean bool) {
        java.lang.String str2;
        pt0.e0 e0Var;
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase;
        com.tencent.wcdb.core.Database innerDB;
        com.tencent.wcdb.core.Table table;
        com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
        l75.k0 k0Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f193989r;
        java.lang.String P8 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().P8(j17, str);
        java.lang.Object[] objArr = P8 == null || P8.length() == 0;
        pt0.e0 e0Var2 = pt0.f0.f358209b1;
        if (objArr == true) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgFeatureService", "getById table is null or empty, id: " + j17 + ", talker: " + str);
            ((ku5.t0) ku5.t0.f312615d).h(new ez.i1(e0Var2.p(new java.lang.Throwable()), this, j17, str), "msg_empty_table_report");
        } else {
            kotlin.jvm.internal.o.d(k0Var);
            if ((k0Var.a() && kotlin.jvm.internal.o.b(P8, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) != true) {
                str2 = "MicroMsg.MsgFeatureService";
                e0Var = e0Var2;
                android.database.Cursor D = k0Var.D(P8, null, "msgId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
                if (D.moveToFirst()) {
                    f9Var2.convertFrom(D);
                }
                D.close();
                if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE) && e0Var.d() && f9Var2.getMsgId() > 0 && !kotlin.jvm.internal.o.b(f9Var2.Q0(), str) && !kotlin.jvm.internal.o.b(str, "talker-ignore")) {
                    java.lang.String p17 = e0Var.p(new java.lang.Throwable());
                    com.tencent.mars.xlog.Log.i(str2, "found different msgId:" + j17 + ", createTime:" + f9Var2.getCreateTime() + " talker[" + f9Var2.Q0() + " -> " + str + "], stack: " + p17);
                    ((ku5.t0) ku5.t0.f312615d).h(new ez.j1(f9Var2, p17, this, str), "msg_talker_error_report");
                }
                return f9Var2;
            }
            l75.k0 k0Var2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f193989r;
            java.lang.String P82 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().P8(j17, str);
            if (P82 == null || P82.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgFeatureService", "getMsgById table is null or empty, id: " + j17 + ", talker: " + str);
                ((ku5.t0) ku5.t0.f312615d).h(new ez.i1(e0Var2.p(new java.lang.Throwable()), this, j17, str), "msg_empty_table_report");
                f9Var = new com.tencent.mm.storage.f9();
            } else {
                up5.w wVar = null;
                wVar = null;
                wVar = null;
                wVar = null;
                d95.z zVar = k0Var2 instanceof d95.z ? (d95.z) k0Var2 : null;
                if (zVar != null && (sQLiteDatabase = zVar.f227718a) != null && (innerDB = sQLiteDatabase.getInnerDB()) != null && (table = innerDB.getTable(P82, up5.i.f429970b)) != null) {
                    com.tencent.wcdb.orm.Field field = up5.i.f429971c;
                    wVar = (up5.w) table.getFirstObject(field != null ? field.eq(j17) : null);
                }
                f9Var = new com.tencent.mm.storage.f9();
                if (wVar != null) {
                    g95.e0.k(f9Var, wVar);
                }
            }
            f9Var2 = f9Var;
        }
        str2 = "MicroMsg.MsgFeatureService";
        e0Var = e0Var2;
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
        }
        return f9Var2;
    }
}
