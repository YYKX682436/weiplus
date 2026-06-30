package u84;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.f0 f425660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u84.f0 f0Var) {
        super(0);
        this.f425660d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$mArrowIv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$mArrowIv$2");
        android.view.View y17 = u84.f0.y(this.f425660d);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = y17 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) y17.findViewById(com.tencent.mm.R.id.a4f) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$mArrowIv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$mArrowIv$2");
        return weImageView;
    }
}
