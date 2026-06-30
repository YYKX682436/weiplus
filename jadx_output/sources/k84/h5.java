package k84;

/* loaded from: classes.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(android.view.View view) {
        super(0);
        this.f305056d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mNextLineParentViewGroup$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mNextLineParentViewGroup$2");
        android.view.View view = this.f305056d;
        android.widget.LinearLayout linearLayout = view != null ? (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.nbz) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mNextLineParentViewGroup$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mNextLineParentViewGroup$2");
        return linearLayout;
    }
}
