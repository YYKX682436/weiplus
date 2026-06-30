package dd4;

/* loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229019e;

    public l(java.lang.String str, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        this.f229018d = str;
        this.f229019e = flexibleLivePhotoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$checkShowTranslateResImg$1");
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f229018d, null);
        ((ku5.t0) ku5.t0.f312615d).B(new dd4.k(J2, this.f229019e));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$checkShowTranslateResImg$1");
    }
}
