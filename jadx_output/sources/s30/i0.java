package s30;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.sdk.event.n {
    public i0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WeChatFrontBackEvent weChatFrontBackEvent = (com.tencent.mm.autogen.events.WeChatFrontBackEvent) iEvent;
        h62.d vj6 = h62.d.vj();
        vj6.getClass();
        if (weChatFrontBackEvent != null && weChatFrontBackEvent.f54978g.f6630a == 7) {
            vj6.wi(1);
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "account is not ready, don't get expt config");
            } else if (com.tencent.mm.sdk.platformtools.x2.n()) {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
                int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_INTERVAL_SEC_INT, 86400)).intValue();
                if (intValue2 <= 3600) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "interval is less than 1 hour, something warn here!!!");
                    intValue2 = 3600;
                }
                if (com.tencent.mm.sdk.platformtools.t8.H1(intValue) >= intValue2) {
                    vj6.Hj(1);
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
            }
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "account is not ready, don't get expt config");
            } else if (com.tencent.mm.sdk.platformtools.x2.n()) {
                int intValue3 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_REPORT_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
                int Ni = vj6.Ni(e42.d0.clicfg_new_expt_report, 3600);
                if (Ni > 0 && com.tencent.mm.sdk.platformtools.t8.H1(intValue3) >= Ni) {
                    d42.a.a().getClass();
                    gm0.j1.d().g(new d42.d());
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
            }
        }
        if (weChatFrontBackEvent != null && weChatFrontBackEvent.f54978g.f6630a == 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExptService", "test y and expt result. clicfg_test_tapd_ios = [%s]", vj6.bj("clicfg_test_tapd_ios", "-1", false));
        }
        return false;
    }
}
