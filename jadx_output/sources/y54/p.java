package y54;

/* loaded from: classes8.dex */
public final class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459553d;

    public p(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        this.f459553d = adHalfScreenPageUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$showMoreOptionMenu$2");
        if (menuItem != null && menuItem.getItemId() == 1) {
            n44.m0 V6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(this.f459553d);
            V6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAndOpenInBrowser", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
            n44.i e17 = V6.e();
            if (e17 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAndOpenInBrowser", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
                zg0.g3 g3Var = (zg0.g3) i95.n0.c(zg0.g3.class);
                android.view.View h17 = e17.h();
                android.content.Context context = h17 != null ? h17.getContext() : null;
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                i64.z g17 = e17.g();
                java.lang.String c17 = g17 != null ? g17.c() : null;
                ((yg0.e4) g3Var).getClass();
                ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
                new com.tencent.mm.plugin.webview.modeltools.h().c(activity, c17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAndOpenInBrowser", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAndOpenInBrowser", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$showMoreOptionMenu$2");
    }
}
