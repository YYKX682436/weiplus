package com.tencent.mm.plugin.sns.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/config/RCSnsVideoAbaPresetSwitch;", "Lq55/d;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RCSnsVideoAbaPresetSwitch extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        return "RepairerConfig_SnsVideoAbaPresetSwitch";
    }

    @Override // q55.h
    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        return "视频ABA预置开关PresetSwitch";
    }

    @Override // q55.h
    public java.lang.Class e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        return com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultValue", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultValue", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExptKey", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExptKey", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        return "clicfg_use_sns_video_preset_switch";
    }

    @Override // q55.d
    public java.util.List n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheetValueAliasList", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        java.util.List i17 = kz5.c0.i("默认配置", "实验1", "实验2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheetValueAliasList", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        return i17;
    }

    @Override // q55.d
    public java.util.List o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheetValueList", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        java.util.List i17 = kz5.c0.i("0", "1", "2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheetValueList", "com.tencent.mm.plugin.sns.config.RCSnsVideoAbaPresetSwitch");
        return i17;
    }
}
