package x64;

/* loaded from: classes4.dex */
public final class o implements l41.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f452315a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f452316b;

    public o(java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f452315a = weakReference;
        this.f452316b = z17;
    }

    @Override // l41.j2
    public void a(android.os.Bundle bundle) {
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceiveResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdReceiveResultCallback");
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("result_key_action")) : null;
        boolean z17 = this.f452316b;
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, z17 ? 3 : 8);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, z17 ? 4 : 9);
        }
        if (valueOf != null && valueOf.intValue() == 5) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "show confirm page");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, z17 ? 10 : 11);
        }
        if (valueOf != null && valueOf.intValue() == 6) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "in confirm page, user cancel");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, z17 ? 12 : 13);
        }
        if (valueOf != null && valueOf.intValue() == 3) {
            java.lang.ref.WeakReference weakReference = this.f452315a;
            if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceiveResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdReceiveResultCallback");
                return;
            }
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = context instanceof com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI ? (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI) context : null;
            if (adHalfScreenPageUI != null) {
                adHalfScreenPageUI.finish();
            }
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdGeneralPageUI adGeneralPageUI = context instanceof com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdGeneralPageUI ? (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdGeneralPageUI) context : null;
            if (adGeneralPageUI != null) {
                adGeneralPageUI.finish();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "ad startConversation result action: %s", valueOf);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceiveResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdReceiveResultCallback");
    }
}
