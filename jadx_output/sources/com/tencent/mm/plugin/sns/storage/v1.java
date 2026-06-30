package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class v1 extends dm.ma implements java.lang.Cloneable {
    public static final l75.e0 T = dm.ma.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.v1.class);
    public int S;

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        com.tencent.mm.plugin.sns.storage.v1 t07 = t0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return t07;
    }

    @Override // dm.ma, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
        try {
            super.convertFrom(cursor);
            this.S = (int) this.systemRowid;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsComment", "error " + message);
            if (message != null && message.contains("Unable to convert")) {
                com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
                Aj.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                Aj.f166156d.A("SnsComment", "DROP TABLE SnsComment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            }
            try {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
                throw e17;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsComment", e18, "", new java.lang.Object[0]);
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.SnsComment");
        if (!(obj instanceof com.tencent.mm.plugin.sns.storage.v1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.SnsComment");
            return false;
        }
        long j17 = this.field_commentSvrID;
        if (j17 > 0) {
            boolean z17 = j17 == ((com.tencent.mm.plugin.sns.storage.v1) obj).field_commentSvrID;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.SnsComment");
            return z17;
        }
        boolean equals = super.equals(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return equals;
    }

    @Override // dm.ma, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return T;
    }

    public com.tencent.mm.plugin.sns.storage.v1 t0() {
        com.tencent.mm.plugin.sns.storage.v1 v1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        try {
            v1Var = (com.tencent.mm.plugin.sns.storage.v1) super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsComment", "snscomment clone error");
            v1Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return v1Var;
    }

    public void u0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        this.field_commentflag |= 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
    }
}
