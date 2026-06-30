package j54;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f297813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f297814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView f297815f;

    public a(kotlin.jvm.internal.f0 f0Var, android.widget.ImageView imageView, com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView panoramaContainerView) {
        this.f297813d = f0Var;
        this.f297814e = imageView;
        this.f297815f = panoramaContainerView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView$setImageBitmap$3");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("the new width ");
        int i39 = i19 - i17;
        sb6.append(i39);
        sb6.append(", old width ");
        sb6.append(i37 - i28);
        sb6.append(", imageWidth is ");
        kotlin.jvm.internal.f0 f0Var = this.f297813d;
        sb6.append(f0Var.f310116d);
        com.tencent.mars.xlog.Log.i("SnsAd.PanoramaView", sb6.toString());
        if (i39 == f0Var.f310116d) {
            this.f297814e.removeOnLayoutChangeListener(this);
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView.a(this.f297815f, f0Var.f310116d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView$setImageBitmap$3");
    }
}
