package k84;

/* loaded from: classes4.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k84.q1 q1Var) {
        super(0);
        this.f305073d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagWordLiking$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagWordLiking$2");
        android.view.ViewGroup Q = this.f305073d.Q();
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = Q != null ? (androidx.appcompat.widget.AppCompatTextView) Q.findViewById(com.tencent.mm.R.id.qa9) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagWordLiking$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$tagWordLiking$2");
        return appCompatTextView;
    }
}
