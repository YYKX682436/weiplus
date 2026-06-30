package com.tencent.mm.plugin.sns.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/config/RCSnsSpring2024RedDotVisibility;", "Lq55/i;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RCSnsSpring2024RedDotVisibility extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        return "RepairerConfig_SnsSpring2024RedDotVisibility";
    }

    @Override // q55.h
    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        return "朋友圈春节发表红点可见";
    }

    @Override // q55.h
    public java.lang.Class e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        return com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultValue", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultValue", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        return 0;
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheetValueAliasList", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        java.util.List k17 = kz5.c0.k("默认(后台动态配置)", "强制允许", "强制不允许");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheetValueAliasList", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        return k17;
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheetValueList", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        java.util.List k17 = kz5.c0.k("1", "2", "3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheetValueList", "com.tencent.mm.plugin.sns.config.RCSnsSpring2024RedDotVisibility");
        return k17;
    }
}
