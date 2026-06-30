package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bt implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTransparentUI f168061d;

    public bt(com.tencent.mm.plugin.sns.ui.SnsTransparentUI snsTransparentUI) {
        this.f168061d = snsTransparentUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$2");
        com.tencent.mm.plugin.sns.ui.SnsTransparentUI snsTransparentUI = this.f168061d;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.e(snsTransparentUI);
        snsTransparentUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$2");
    }
}
