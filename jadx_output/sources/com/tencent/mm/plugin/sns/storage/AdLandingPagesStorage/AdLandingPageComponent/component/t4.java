package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class t4 extends android.content.BroadcastReceiver implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 f165509d;

    public t4(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c3 c3Var) {
        this.f165509d = u4Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$PkgUpdateReceiver");
        if (intent != null) {
            java.lang.String action = intent.getAction();
            boolean equals = "android.intent.action.PACKAGE_ADDED".equals(action);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4 u4Var = this.f165509d;
            if (equals) {
                java.lang.String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                if (!android.text.TextUtils.isEmpty(schemeSpecificPart) && schemeSpecificPart.equals(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(u4Var).H1)) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(u4Var).l(3);
                }
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                java.lang.String schemeSpecificPart2 = intent.getData().getSchemeSpecificPart();
                if (!android.text.TextUtils.isEmpty(schemeSpecificPart2) && schemeSpecificPart2.equals(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(u4Var).H1)) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(u4Var).l(4);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$PkgUpdateReceiver");
    }
}
