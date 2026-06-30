package k84;

/* loaded from: classes4.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(k84.c6 c6Var) {
        super(0);
        this.f305045d = c6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mCommentTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mCommentTv$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView E = k84.c6.E(this.f305045d);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = E != null ? (androidx.appcompat.widget.AppCompatTextView) E.findViewById(com.tencent.mm.R.id.c86) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mCommentTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mCommentTv$2");
        return appCompatTextView;
    }
}
