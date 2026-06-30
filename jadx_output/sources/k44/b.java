package k44;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper f304067d;

    public b(com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper adGalleryOpenAppMarketHalfScreenHelper) {
        this.f304067d = adGalleryOpenAppMarketHalfScreenHelper;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper$initExpandAreaClick$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/xml/AdGalleryOpenAppMarketHalfScreenHelper$initExpandAreaClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button h17 = this.f304067d.h();
        if (h17 != null) {
            h17.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/xml/AdGalleryOpenAppMarketHalfScreenHelper$initExpandAreaClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper$initExpandAreaClick$1");
    }
}
