package com.tencent.mm.repairer.config.msgrefactor;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/msgrefactor/RepairerConfigDataCleanPeriodLimit;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigDataCleanPeriodLimit extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_DataCleanPeriodLimit";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "消息清理周期批量处理个数";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMsgRefactor.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "Int";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 500;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_msg_refactor_data_clean_period_limit";
    }
}
