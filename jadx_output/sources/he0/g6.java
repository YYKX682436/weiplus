package he0;

/* loaded from: classes4.dex */
public class g6 extends com.tencent.mm.sdk.event.n {
    public g6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsVideoServiceChattingUIStatusListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsVideoServiceChattingUIStatusListener");
        com.tencent.mm.plugin.sns.model.i7 Pj = com.tencent.mm.plugin.sns.model.l4.Pj();
        Pj.f164315h = ((com.tencent.mm.autogen.events.ChattingUIStatusEvent) iEvent).f54046g.f7124a;
        if ((Pj.f164316i && !ma4.a.a()) || Pj.f164315h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.b7(Pj));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        }
        if (!Pj.f164315h && !Pj.f164316i) {
            Pj.t();
        }
        t21.c2 Ni = t21.o2.Ni();
        boolean z18 = Pj.f164315h;
        Ni.f414724e = z18;
        if (z18) {
            Ni.g();
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new t21.z1(Ni));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsVideoServiceChattingUIStatusListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsVideoServiceChattingUIStatusListener");
        return false;
    }
}
