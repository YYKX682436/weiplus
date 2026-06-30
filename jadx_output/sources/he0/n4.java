package he0;

/* loaded from: classes4.dex */
public class n4 extends com.tencent.mm.sdk.event.n {
    public n4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.vc vcVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        com.tencent.mm.autogen.events.FinderPostStatusEvent finderPostStatusEvent = (com.tencent.mm.autogen.events.FinderPostStatusEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        if (gm0.j1.a()) {
            if (finderPostStatusEvent != null && (vcVar = finderPostStatusEvent.f54316g) != null && vcVar.f8188a > 0) {
                ((ku5.t0) ku5.t0.f312615d).g(new he0.m4(this, finderPostStatusEvent));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderPostFinishListener", "FinderPostStatusEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        return false;
    }
}
