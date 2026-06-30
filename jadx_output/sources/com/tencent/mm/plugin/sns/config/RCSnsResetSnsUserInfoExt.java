package com.tencent.mm.plugin.sns.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/config/RCSnsResetSnsUserInfoExt;", "Lq55/a;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RCSnsResetSnsUserInfoExt extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RCSnsResetSnsUserInfoExt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.config.RCSnsResetSnsUserInfoExt");
        return "clicfg_reset_sns_user_info_ext";
    }

    @Override // q55.h
    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.config.RCSnsResetSnsUserInfoExt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.config.RCSnsResetSnsUserInfoExt");
        return "重置SnsUserInfoExt";
    }

    @Override // q55.h
    public java.lang.Class e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RCSnsResetSnsUserInfoExt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentGroup", "com.tencent.mm.plugin.sns.config.RCSnsResetSnsUserInfoExt");
        return com.tencent.mm.repairer.group.RepairerGroupSns.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleOnClick", "com.tencent.mm.plugin.sns.config.RCSnsResetSnsUserInfoExt");
        kotlin.jvm.internal.o.g(context, "context");
        ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUserInfoFetcher", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.model.SnsUserInfoFetcherImpl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.model.SnsUserInfoFetcherImpl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUserInfoFetcher", "com.tencent.mm.feature.sns.SnsFactoryFeatureService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetSelfSnsUserInfo", "com.tencent.mm.plugin.sns.model.SnsUserInfoFetcherImpl");
        java.lang.String r17 = c01.z1.r();
        if (com.tencent.mm.sdk.platformtools.t8.K0(r17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSelfSnsUserInfo", "com.tencent.mm.plugin.sns.model.SnsUserInfoFetcherImpl");
        } else {
            if (com.tencent.mm.plugin.sns.model.l4.Ej() != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserInfoFetcherImpl", "resetSelfSnsUserInfo userName=:%s", r17);
                com.tencent.mm.plugin.sns.storage.d2 J0 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(r17);
                J0.field_snsuser = null;
                com.tencent.mm.plugin.sns.model.l4.Ej().k1(J0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSelfSnsUserInfo", "com.tencent.mm.plugin.sns.model.SnsUserInfoFetcherImpl");
        }
        android.widget.Toast.makeText(context, "重置成功", 0).show();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnClick", "com.tencent.mm.plugin.sns.config.RCSnsResetSnsUserInfoExt");
    }
}
