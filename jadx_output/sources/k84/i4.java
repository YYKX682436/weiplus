package k84;

/* loaded from: classes4.dex */
public class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView f305069d;

    public i4(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        this.f305069d = adSocialAttitudeView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305069d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "onClick");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.b(adSocialAttitudeView, true);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
    }
}
