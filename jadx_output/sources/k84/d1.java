package k84;

/* loaded from: classes4.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f304993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(k84.q1 q1Var) {
        super(0);
        this.f304993d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagBeforeLikeContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagBeforeLikeContainer$2");
        android.view.ViewGroup Q = this.f304993d.Q();
        android.view.ViewGroup viewGroup = Q != null ? (android.view.ViewGroup) Q.findViewById(com.tencent.mm.R.id.qaa) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagBeforeLikeContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagBeforeLikeContainer$2");
        return viewGroup;
    }
}
