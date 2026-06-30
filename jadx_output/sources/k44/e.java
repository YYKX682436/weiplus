package k44;

/* loaded from: classes4.dex */
public final class e implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper f304070d;

    public e(com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper adGalleryOpenAppMarketHalfScreenHelper) {
        this.f304070d = adGalleryOpenAppMarketHalfScreenHelper;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        i64.p0 d17;
        i64.p0 d18;
        i64.p0 d19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper$setOnBottomSheetDismissListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isAppMarketBtnClick$p", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper adGalleryOpenAppMarketHalfScreenHelper = this.f304070d;
        boolean z17 = adGalleryOpenAppMarketHalfScreenHelper.f162690y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isAppMarketBtnClick$p", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        if (!z17) {
            h44.c d27 = adGalleryOpenAppMarketHalfScreenHelper.d();
            java.lang.String str = null;
            java.lang.String str2 = (d27 == null || (d19 = d27.d()) == null) ? null : d19.f289271a;
            h44.c d28 = adGalleryOpenAppMarketHalfScreenHelper.d();
            java.lang.String str3 = (d28 == null || (d18 = d28.d()) == null) ? null : d18.f289272b;
            h44.c d29 = adGalleryOpenAppMarketHalfScreenHelper.d();
            if (d29 != null && (d17 = d29.d()) != null) {
                str = d17.f289273c;
            }
            ca4.m0.B0(str2, str3, str, 2, "2");
        }
        adGalleryOpenAppMarketHalfScreenHelper.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper$setOnBottomSheetDismissListener$1");
    }
}
