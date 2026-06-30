package e94;

/* loaded from: classes4.dex */
public class t implements q44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView f250389a;

    public t(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView) {
        this.f250389a = twistCoverView;
    }

    public void a(float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView = this.f250389a;
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        com.tencent.mm.plugin.sns.storage.r rVar = twistCoverView.f163921i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (rVar == null) {
            com.tencent.mars.xlog.Log.w("TwistCoverView", "onDegreeChange, twistInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
            return;
        }
        boolean z17 = rVar.f166112i;
        if (z17 && f18 > 0.0f) {
            f18 = 0.0f;
        }
        float f19 = (z17 || f18 >= 0.0f) ? f18 : 0.0f;
        float abs = java.lang.Math.abs(f19 / rVar.f166111h);
        float abs2 = java.lang.Math.abs(f19);
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView2 = this.f250389a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        float f27 = twistCoverView2.f163935z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (abs2 > f27) {
            com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView3 = this.f250389a;
            float abs3 = java.lang.Math.abs(f19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            twistCoverView3.f163935z = abs3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        }
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView twistCoverView4 = this.f250389a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.os.Handler handler = twistCoverView4.f163934y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.os.Message obtain = android.os.Message.obtain(handler, 2);
        obtain.arg1 = (int) (abs * 1000.0f);
        obtain.sendToTarget();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
    }
}
