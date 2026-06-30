package k84;

/* loaded from: classes4.dex */
public class g4 implements android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView f305044d;

    public g4(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        this.f305044d = adSocialAttitudeView;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305044d;
        java.lang.String a17 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDoubleTap, mSupportDoubleTap is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        boolean z17 = adSocialAttitudeView.f163467z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(a17, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        boolean z18 = adSocialAttitudeView.f163467z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (!z18) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
            return false;
        }
        if (adSocialAttitudeView.m()) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "onDoubleTap, do liked");
            boolean b17 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.b(adSocialAttitudeView, false);
            yj0.a.i(b17, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
            return b17;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        long j17 = adSocialAttitudeView.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (currentTimeMillis - j17 > 800) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            adSocialAttitudeView.N = currentTimeMillis2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            l44.b3 b3Var = l44.b3.f316041a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = adSocialAttitudeView.f163457u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdLikedStateDoubleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onAdLikedStateDoubleTap() called with: snsInfo = ");
            sb7.append(snsInfo);
            sb7.append(", model snsId is ");
            sb7.append(snsInfo != null ? snsInfo.getSnsId() : null);
            sb7.append(", snsIdStr is ");
            sb7.append(ca4.z0.t0(snsInfo != null ? snsInfo.field_snsId : 0L));
            com.tencent.mars.xlog.Log.i("AdInteractHelper", sb7.toString());
            ((kotlinx.coroutines.flow.q2) l44.b3.f316049i).e(snsInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdLikedStateDoubleTap", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "already liked and double tap");
        } else {
            com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "already liked and double tap, you must click button slowly");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305044d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.a(adSocialAttitudeView), "onSingleTapConfirmed");
        boolean b17 = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.b(adSocialAttitudeView, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
        return b17;
    }
}
