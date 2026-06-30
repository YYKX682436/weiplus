package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class d2 extends dm.pa {

    /* renamed from: p1, reason: collision with root package name */
    public static final l75.e0 f165965p1 = dm.pa.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.d2.class);

    @Override // dm.pa, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return f165965p1;
    }

    public r45.cp0 t0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFault", "com.tencent.mm.plugin.sns.storage.SnsExt");
        new r45.k53();
        r45.cp0 cp0Var = new r45.cp0();
        if (!com.tencent.mm.sdk.platformtools.t8.M0(this.field_faultS)) {
            try {
                r45.k53 k53Var = (r45.k53) new r45.k53().parseFrom(this.field_faultS);
                if (k53Var.f378381d.size() > 0) {
                    cp0Var = (r45.cp0) k53Var.f378381d.getFirst();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFault", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return cp0Var;
    }

    public r45.cb6 u0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
        try {
            r45.cb6 cb6Var = (r45.cb6) new r45.cb6().parseFrom(this.field_snsuser);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            return cb6Var;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsExt", "getSnsUser error, return fallback userinfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            return null;
        }
    }

    public r45.bb6 v0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        r45.bb6 bb6Var = new r45.bb6();
        if (!com.tencent.mm.sdk.platformtools.t8.M0(this.field_snsYearMonthInfo)) {
            try {
                bb6Var.parseFrom(this.field_snsYearMonthInfo);
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return bb6Var;
    }

    public void w0(r45.cb6 cb6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.field_userName;
        objArr[1] = java.lang.Boolean.valueOf(cb6Var == null);
        objArr[2] = java.lang.Boolean.valueOf(this.field_snsuser == null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsExt", "setSnsUser, username:%s, userInfo==null:%s, this.field_snsuser==null:%s", objArr);
        if (cb6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            return;
        }
        try {
            this.field_snsuser = cb6Var.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsExt", "setSnsUser error:%s", e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
    }

    public void y0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsExt");
        this.field_local_flag &= -3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsExt");
    }
}
