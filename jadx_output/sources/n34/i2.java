package n34;

/* loaded from: classes4.dex */
public class i2 extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public int f334627d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f334628e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f334629f;

    public i2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        com.tencent.mm.autogen.events.GetSnsObjectDetailEvent getSnsObjectDetailEvent = (com.tencent.mm.autogen.events.GetSnsObjectDetailEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetSnsObjectDetailListener", "GetSnsObjectDetailEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        } else if (getSnsObjectDetailEvent instanceof com.tencent.mm.autogen.events.GetSnsObjectDetailEvent) {
            this.f334627d = getSnsObjectDetailEvent.f54410g.f7247a;
            this.f334628e = com.tencent.mm.plugin.sns.model.l4.Fj().i1(this.f334627d);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(this.f334627d);
            objArr[1] = java.lang.Boolean.valueOf(this.f334628e == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetSnsObjectDetailListener", "LocalId:%s mSnsInfo is null?[%b]", objArr);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f334628e;
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
            } else {
                com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(snsInfo);
                if (this.f334628e.field_snsId == 0) {
                    getSnsObjectDetailEvent.f54411h.f7347a = f17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetSnsObjectDetailListener", "[callback] local SnsObject not enable group, try request SnsObjectDetial");
                    com.tencent.mm.plugin.sns.model.p2 p2Var = new com.tencent.mm.plugin.sns.model.p2(this.f334628e.field_snsId);
                    gm0.j1.i();
                    gm0.j1.n().f273288b.a(210, this);
                    gm0.j1.i();
                    gm0.j1.n().f273288b.g(p2Var);
                    com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new n34.h2(this), false);
                    this.f334629f = b4Var;
                    b4Var.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                }
                z17 = true;
            }
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        return z17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetSnsObjectDetailListener", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f334629f.d();
        com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent = new com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent();
        am.as asVar = returnSnsObjectDetailEvent.f54711g;
        if (i17 == 0 && i18 == 0 && (m1Var instanceof com.tencent.mm.plugin.sns.model.p2)) {
            asVar.f6185a = com.tencent.mm.plugin.sns.model.l4.xj().s(((com.tencent.mm.plugin.sns.model.p2) m1Var).J());
            returnSnsObjectDetailEvent.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        } else {
            asVar.f6185a = null;
            returnSnsObjectDetailEvent.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        }
    }
}
