package k84;

/* loaded from: classes4.dex */
public class j implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView f305071d;

    public j(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView) {
        this.f305071d = adAttitudePlayView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$4");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView = this.f305071d;
        adAttitudePlayView.getViewTreeObserver().removeOnPreDrawListener(this);
        adAttitudePlayView.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$4");
        return true;
    }
}
