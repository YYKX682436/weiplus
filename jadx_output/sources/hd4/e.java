package hd4;

/* loaded from: classes4.dex */
public final class e implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd4.g f280571a;

    public e(hd4.g gVar) {
        this.f280571a = gVar;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$mCardAnimPrepareListener$1");
        hd4.g gVar = this.f280571a;
        java.lang.String j17 = gVar.j();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("ad_no_click_anim", false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            gVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            com.tencent.mm.plugin.sns.ui.listener.i iVar = gVar.f280576r;
            if (iVar != null) {
                iVar.M(gVar.f280574p, bundle);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$mCardAnimPrepareListener$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$mCardAnimPrepareListener$1");
        u74.d B = this.f280571a.B();
        android.view.View view = B != null ? B.f425165z : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$mCardAnimPrepareListener$1");
        return view;
    }
}
