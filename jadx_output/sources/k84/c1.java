package k84;

/* loaded from: classes4.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f304963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(k84.q1 q1Var) {
        super(0);
        this.f304963d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagAnimWordLiking$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagAnimWordLiking$2");
        android.view.ViewGroup Q = this.f304963d.Q();
        android.widget.TextView textView = Q != null ? (android.widget.TextView) Q.findViewById(com.tencent.mm.R.id.qa8) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagAnimWordLiking$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagAnimWordLiking$2");
        return textView;
    }
}
