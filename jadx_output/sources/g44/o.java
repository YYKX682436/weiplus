package g44;

/* loaded from: classes4.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper f268834d;

    public o(com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper adFinderOpenAppMarketHalfScreenHelper) {
        this.f268834d = adFinderOpenAppMarketHalfScreenHelper;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        i64.p0 d17;
        i64.p0 d18;
        i64.p0 d19;
        i64.p0 d27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper$initOpenAppBtnClick$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdFinderOpenAppMarketHalfScreenHelper$initOpenAppBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper adFinderOpenAppMarketHalfScreenHelper = this.f268834d;
        h44.c d28 = adFinderOpenAppMarketHalfScreenHelper.d();
        a44.m.a((d28 == null || (d27 = d28.d()) == null) ? 0 : d27.f289274d, 16);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAppMarketBtnClick$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        adFinderOpenAppMarketHalfScreenHelper.f162662t = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAppMarketBtnClick$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAppMarketClickListener$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        k44.a aVar = adFinderOpenAppMarketHalfScreenHelper.f162661s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAppMarketClickListener$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        if (aVar != null) {
            aVar.a();
        }
        l44.z.c(adFinderOpenAppMarketHalfScreenHelper.b());
        h44.c d29 = adFinderOpenAppMarketHalfScreenHelper.d();
        java.lang.String str = null;
        java.lang.String str2 = (d29 == null || (d19 = d29.d()) == null) ? null : d19.f289271a;
        h44.c d37 = adFinderOpenAppMarketHalfScreenHelper.d();
        java.lang.String str3 = (d37 == null || (d18 = d37.d()) == null) ? null : d18.f289272b;
        h44.c d38 = adFinderOpenAppMarketHalfScreenHelper.d();
        if (d38 != null && (d17 = d38.d()) != null) {
            str = d17.f289273c;
        }
        ca4.m0.B0(str2, str3, str, 2, "0");
        adFinderOpenAppMarketHalfScreenHelper.j();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdFinderOpenAppMarketHalfScreenHelper$initOpenAppBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper$initOpenAppBtnClick$1");
    }
}
