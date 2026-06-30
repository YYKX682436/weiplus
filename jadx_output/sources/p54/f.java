package p54;

/* loaded from: classes.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f352088d;

    public f(yz5.l lVar) {
        this.f352088d = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper$showRetentionDialogInner$sheet$1$2");
        if (menuItem != null) {
            com.tencent.mars.xlog.Log.i("SnsAd.DownloadDialog", "the item id is " + menuItem.getItemId() + ", item content is " + ((java.lang.Object) menuItem.getTitle()) + ", the index is " + i17);
            this.f352088d.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper$showRetentionDialogInner$sheet$1$2");
    }
}
