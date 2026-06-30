package com.tencent.mm.plugin.sns.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/config/RCSnsCmtSendEmoticonInternal;", "Lq55/i;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RCSnsCmtSendEmoticonInternal extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        return "RepairerConfig_SnsCmtSendEmoticonInternal";
    }

    @Override // q55.h
    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        return "朋友圈评论支持发表表情";
    }

    @Override // q55.h
    public java.lang.Class e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        return com.tencent.mm.plugin.sns.config.RepairerGroupSnsNew.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultValue", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultValue", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        return 1;
    }

    @Override // q55.e
    public java.lang.String k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExptKey", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExptKey", "com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal");
        return "clicfg_sns_cmt_send_emoticon_internal";
    }
}
