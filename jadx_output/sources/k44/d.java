package k44;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper f304069d;

    public d(com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper adGalleryOpenAppMarketHalfScreenHelper) {
        this.f304069d = adGalleryOpenAppMarketHalfScreenHelper;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        i64.p0 d17;
        i64.p0 d18;
        i64.p0 d19;
        i64.p0 d27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper$initOpenAppBtnClick$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/xml/AdGalleryOpenAppMarketHalfScreenHelper$initOpenAppBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper adGalleryOpenAppMarketHalfScreenHelper = this.f304069d;
        h44.c d28 = adGalleryOpenAppMarketHalfScreenHelper.d();
        a44.m.a((d28 == null || (d27 = d28.d()) == null) ? 0 : d27.f289274d, 16);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAppMarketBtnClick$p", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        adGalleryOpenAppMarketHalfScreenHelper.f162690y = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAppMarketBtnClick$p", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAppMarketClickListener$p", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        k44.a aVar = adGalleryOpenAppMarketHalfScreenHelper.f162689x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAppMarketClickListener$p", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        if (aVar != null) {
            aVar.a();
        }
        l44.z.c(adGalleryOpenAppMarketHalfScreenHelper.b());
        h44.c d29 = adGalleryOpenAppMarketHalfScreenHelper.d();
        java.lang.String str = null;
        java.lang.String str2 = (d29 == null || (d19 = d29.d()) == null) ? null : d19.f289271a;
        h44.c d37 = adGalleryOpenAppMarketHalfScreenHelper.d();
        java.lang.String str3 = (d37 == null || (d18 = d37.d()) == null) ? null : d18.f289272b;
        h44.c d38 = adGalleryOpenAppMarketHalfScreenHelper.d();
        if (d38 != null && (d17 = d38.d()) != null) {
            str = d17.f289273c;
        }
        ca4.m0.B0(str2, str3, str, 2, "0");
        adGalleryOpenAppMarketHalfScreenHelper.j();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/xml/AdGalleryOpenAppMarketHalfScreenHelper$initOpenAppBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper$initOpenAppBtnClick$1");
    }
}
