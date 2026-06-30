package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class j2 extends dm.wa {

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f166026w = dm.wa.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.j2.class);

    /* renamed from: v, reason: collision with root package name */
    public int f166027v;

    @Override // dm.wa, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        try {
            super.convertFrom(cursor);
            this.f166027v = (int) this.systemRowid;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsKvReport", "error " + message);
            if (message != null && message.contains("Unable to convert")) {
                com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
                Aj.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                Aj.f166156d.A("SnsComment", "DROP TABLE SnsComment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            }
            try {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
                throw e17;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsKvReport", e18, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // dm.wa, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        return f166026w;
    }
}
