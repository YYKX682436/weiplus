package n34;

/* loaded from: classes13.dex */
public class m2 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f334679d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f334680e;

    public m2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent getSnsTimeLineObjectEvent = (com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetSnsObjectDetailListener", "GetSnsTimeLineObjectEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        } else if (getSnsTimeLineObjectEvent instanceof com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent) {
            this.f334679d = getSnsTimeLineObjectEvent.f54414g.f7619a;
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f334679d);
            this.f334680e = k17;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = this.f334679d;
            objArr[1] = java.lang.Boolean.valueOf(k17 == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetSnsObjectDetailListener", "mLoaclId:%s mSnsInfo is null?[%b]", objArr);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f334680e;
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
            } else {
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                if (timeLine != null) {
                    getSnsTimeLineObjectEvent.f54415h.f7711a = timeLine;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
                }
            }
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        return z17;
    }
}
