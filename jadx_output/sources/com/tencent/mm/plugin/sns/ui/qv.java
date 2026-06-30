package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes13.dex */
public final class qv implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsWeappView f170368a;

    public qv(com.tencent.mm.plugin.sns.ui.SnsWeappView snsWeappView) {
        this.f170368a = snsWeappView;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ui.SnsWeappView$setWeappUsername$1");
        com.tencent.mm.plugin.sns.ui.SnsWeappView snsWeappView = this.f170368a;
        if (v5Var == null) {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsWeappView.f167620g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDefaultName", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            snsWeappView.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDefaultName", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
        } else {
            java.lang.String str = v5Var.field_username;
            int i18 = com.tencent.mm.plugin.sns.ui.SnsWeappView.f167620g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWeappUsername$p", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            java.lang.String str2 = snsWeappView.f167623f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWeappUsername$p", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            if (!kotlin.jvm.internal.o.b(str, str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ui.SnsWeappView$setWeappUsername$1");
                return;
            }
            com.tencent.mm.plugin.sns.ui.SnsWeappView.a(snsWeappView, v5Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ui.SnsWeappView$setWeappUsername$1");
    }
}
