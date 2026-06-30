package u84;

/* loaded from: classes4.dex */
public class r1 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView f425662a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView snsAdInteractionLabelView, android.os.Looper looper) {
        super(looper);
        this.f425662a = snsAdInteractionLabelView;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$1");
        com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView snsAdInteractionLabelView = this.f425662a;
        snsAdInteractionLabelView.f163594m++;
        if (snsAdInteractionLabelView.f163591g.getVisibility() == 0) {
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView.a(snsAdInteractionLabelView, snsAdInteractionLabelView.f163591g);
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView.b(snsAdInteractionLabelView, snsAdInteractionLabelView.f163592h);
        } else {
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView.b(snsAdInteractionLabelView, snsAdInteractionLabelView.f163591g);
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView.a(snsAdInteractionLabelView, snsAdInteractionLabelView.f163592h);
        }
        if (!snsAdInteractionLabelView.f163595n) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            android.os.Handler handler = snsAdInteractionLabelView.f163600s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            handler.sendEmptyMessageDelayed(1, 2300L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$1");
    }
}
