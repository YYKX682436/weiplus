package oh1;

/* loaded from: classes9.dex */
public class l1 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oh1.m1 f345251a;

    public l1(oh1.m1 m1Var) {
        this.f345251a = m1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        int i17;
        k01.x0 x0Var = (k01.x0) i95.n0.c(k01.x0.class);
        oh1.m1 m1Var = this.f345251a;
        tt0.e Ai = ((oh1.k2) x0Var).Ai(m1Var.f345253e.f421803h);
        if (Ai != null && (i17 = Ai.field_msgType) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaSubscribeMsgService", "msgType: %d, report ignore", java.lang.Integer.valueOf(i17));
            return;
        }
        cm.c1 c1Var = cm.c1.DEFAULT;
        cm.d1 d1Var = cm.d1.DEFAULT;
        if (Ai != null) {
            int i18 = Ai.field_msgState;
            if (i18 == 1) {
                c1Var = cm.c1.DONE;
            } else if (i18 == 0) {
                c1Var = cm.c1.DOING;
            }
            int i19 = Ai.field_btnState;
            if (i19 == 2) {
                d1Var = cm.d1.SUBSCRIBE;
            } else if (i19 == 0 || i19 == 1) {
                d1Var = cm.d1.NOTSUBSCRIBE;
            }
        }
        int i27 = v5Var.u0() == null ? 0 : v5Var.u0().f305629d;
        com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct wxaUpdatableMsgReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct();
        tt0.d dVar = m1Var.f345253e;
        wxaUpdatableMsgReportStruct.f63050d = wxaUpdatableMsgReportStruct.b("AppId", dVar.f421799d, true);
        wxaUpdatableMsgReportStruct.f63051e = wxaUpdatableMsgReportStruct.b("PageId", dVar.f421801f, true);
        wxaUpdatableMsgReportStruct.f63053g = wxaUpdatableMsgReportStruct.b("ShareTicket", dVar.f421801f, true);
        java.lang.String str = m1Var.f345254f;
        wxaUpdatableMsgReportStruct.f63054h = wxaUpdatableMsgReportStruct.b("ChattingId", str, true);
        wxaUpdatableMsgReportStruct.f63055i = str.toLowerCase().endsWith("@chatroom") ? cm.b1.YES : cm.b1.NO;
        wxaUpdatableMsgReportStruct.f63056j = cm.a1.CLICKSTARTGAME;
        wxaUpdatableMsgReportStruct.f63057k = 0L;
        wxaUpdatableMsgReportStruct.f63058l = wxaUpdatableMsgReportStruct.b("SceneNote", "", true);
        wxaUpdatableMsgReportStruct.f63061o = cm.z0.a(i27 + 1000);
        wxaUpdatableMsgReportStruct.f63052f = wxaUpdatableMsgReportStruct.i();
        wxaUpdatableMsgReportStruct.f63059m = c1Var;
        wxaUpdatableMsgReportStruct.f63060n = d1Var;
        wxaUpdatableMsgReportStruct.k();
    }
}
