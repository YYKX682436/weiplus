package k84;

/* loaded from: classes4.dex */
public final class o5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(k84.c6 c6Var, android.view.View view) {
        super(0);
        this.f305172d = c6Var;
        this.f305173e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mShowCommentView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mShowCommentView$2");
        k84.c6 c6Var = this.f305172d;
        c6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        i64.b1 b1Var = c6Var.f304978o;
        boolean z17 = b1Var != null && b1Var.f289095j == 0;
        android.view.View view = this.f305173e;
        if (z17) {
            if (view != null) {
                findViewById = view.findViewById(com.tencent.mm.R.id.f482894r2);
            }
            findViewById = null;
        } else {
            if (view != null) {
                findViewById = view.findViewById(com.tencent.mm.R.id.f482894r2);
            }
            findViewById = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mShowCommentView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mShowCommentView$2");
        return findViewById;
    }
}
