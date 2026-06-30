package e94;

/* loaded from: classes4.dex */
public class y extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView f250393a;

    public y(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView) {
        this.f250393a = twistRoateCardsView;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$1");
        java.util.HashMap hashMap = com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView.f163951y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView = this.f250393a;
        int i17 = twistRoateCardsView.f163956h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        int i18 = twistRoateCardsView.f163957i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        int i19 = twistRoateCardsView.f163959n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        outline.setRoundRect(0, 0, i17, i18, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$1");
    }
}
