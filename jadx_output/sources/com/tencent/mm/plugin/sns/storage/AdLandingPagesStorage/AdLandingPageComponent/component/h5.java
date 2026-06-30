package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class h5 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j5 f165234a;

    public h5(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j5 j5Var) {
        this.f165234a = j5Var;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$1");
        int intValue = ((java.lang.Integer) obj).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "onCallback, errType=" + i17 + ", errNo=" + i18 + ", state=" + intValue);
        if (intValue == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j5 j5Var = this.f165234a;
            sb6.append(j5Var.B.A1);
            sb6.append(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getUin());
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            if (android.text.TextUtils.isEmpty(sb7)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("adLandingPageSp", 0).edit().putString(sb7, "0").commit();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            }
            com.tencent.mm.autogen.events.GetHbCoverStateEvent getHbCoverStateEvent = new com.tencent.mm.autogen.events.GetHbCoverStateEvent();
            java.lang.String str = j5Var.B.A1;
            am.yf yfVar = getHbCoverStateEvent.f54397g;
            yfVar.f8456a = str;
            yfVar.f8457b = intValue;
            getHbCoverStateEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$1");
    }
}
