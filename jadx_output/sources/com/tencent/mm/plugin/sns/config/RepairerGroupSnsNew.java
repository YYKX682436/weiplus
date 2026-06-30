package com.tencent.mm.plugin.sns.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/config/RepairerGroupSnsNew;", "Lq55/g;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RepairerGroupSnsNew extends q55.g {
    @Override // q55.h
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew");
        return "RepairerGroup_SnsNew";
    }

    @Override // q55.h
    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew");
        return "朋友圈新版维修厂";
    }

    @Override // q55.h
    public java.lang.Class e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew");
        return com.tencent.mm.repairer.group.RepairerGroupSns.class;
    }
}
