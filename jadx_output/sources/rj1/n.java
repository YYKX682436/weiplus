package rj1;

/* loaded from: classes7.dex */
public final class n extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f396171e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f396172d;

    static {
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo.CREATOR.getClass();
        f396171e = new java.lang.String[]{l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo.D, "TipsMsgInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 DB) {
        super(DB, com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo.D, "TipsMsgInfo", dm.jb.f237891q);
        kotlin.jvm.internal.o.g(DB, "DB");
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo.CREATOR.getClass();
        this.f396172d = DB;
    }

    public final void y0(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.database.Cursor rawQuery = rawQuery("select * from TipsMsgInfo where appId = '" + info.field_appId + "' AND busiType = " + info.field_busiType, new java.lang.String[0]);
        while (rawQuery.moveToNext()) {
            try {
                com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo = new com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo();
                tipsMsgInfo.convertFrom(rawQuery);
                z0(tipsMsgInfo);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(rawQuery, th6);
                    throw th7;
                }
            }
        }
        vz5.b.a(rawQuery, null);
        if (insert(info)) {
            return;
        }
        update(info, new java.lang.String[0]);
    }

    public final boolean z0(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.TipsMsgStorage", "[delete] msgId: " + info.field_msgId + '.');
        return super.delete(info, new java.lang.String[0]);
    }
}
