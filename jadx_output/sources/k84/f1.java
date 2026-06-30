package k84;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k84.q1 q1Var) {
        super(0);
        this.f305030d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagIconAfterLike$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagIconAfterLike$2");
        android.view.ViewGroup Q = this.f305030d.Q();
        android.widget.ImageView imageView = Q != null ? (android.widget.ImageView) Q.findViewById(com.tencent.mm.R.id.qa6) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagIconAfterLike$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagIconAfterLike$2");
        return imageView;
    }
}
