package n34;

/* loaded from: classes4.dex */
public class h2 implements com.tencent.mm.sdk.platformtools.a4 {
    public h2(n34.i2 i2Var) {
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetSnsObjectDetailListener", "[onTimerExpired] ReturnSnsObjectDetailEvent but SnsObject null");
        com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent = new com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent();
        returnSnsObjectDetailEvent.f54711g.f6185a = null;
        returnSnsObjectDetailEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener$1");
        return false;
    }
}
