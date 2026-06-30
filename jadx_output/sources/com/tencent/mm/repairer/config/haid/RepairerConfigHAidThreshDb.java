package com.tencent.mm.repairer.config.haid;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/haid/RepairerConfigHAidThreshDb;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigHAidThreshDb extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_HAid_Thresh_Db";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "噪音检测阈值 Db";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupHAid.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "Float";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return java.lang.Float.valueOf(-30.0f);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_hearing_aid_thresh_db";
    }
}
