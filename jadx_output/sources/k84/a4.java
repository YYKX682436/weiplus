package k84;

/* loaded from: classes4.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f304944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(k84.d4 d4Var) {
        super(0);
        this.f304944d = d4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$tagWordAfterLike$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$tagWordAfterLike$2");
        android.view.ViewGroup W = this.f304944d.W();
        android.widget.TextView textView = W != null ? (android.widget.TextView) W.findViewById(com.tencent.mm.R.id.qwv) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$tagWordAfterLike$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$tagWordAfterLike$2");
        return textView;
    }
}
