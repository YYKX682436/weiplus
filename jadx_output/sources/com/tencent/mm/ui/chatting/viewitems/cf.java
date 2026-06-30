package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class cf extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f203720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot0.a f203721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lf f203722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203724i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(int i17, r35.m3 m3Var, ot0.q qVar, ot0.a aVar, com.tencent.mm.ui.chatting.viewitems.lf lfVar, java.lang.String str, yb5.d dVar) {
        super(i17, m3Var);
        this.f203720e = qVar;
        this.f203721f = aVar;
        this.f203722g = lfVar;
        this.f203723h = str;
        this.f203724i = dVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        k01.x0 x0Var = (k01.x0) i95.n0.c(k01.x0.class);
        view.getContext();
        x0Var.getClass();
        k01.x0 x0Var2 = (k01.x0) i95.n0.c(k01.x0.class);
        ot0.q qVar = this.f203720e;
        java.lang.String str = qVar.f348693o2;
        ot0.a aVar = this.f203721f;
        ((oh1.k2) x0Var2).Bi(str, 2, aVar.f348358n);
        this.f203722g.f204480s.setText(this.f203723h);
        com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct wxaUpdatableMsgReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct();
        wxaUpdatableMsgReportStruct.f63050d = wxaUpdatableMsgReportStruct.b("AppId", qVar.f348677k2, true);
        wxaUpdatableMsgReportStruct.f63051e = wxaUpdatableMsgReportStruct.b("PageId", qVar.f348669i2, true);
        wxaUpdatableMsgReportStruct.f63053g = wxaUpdatableMsgReportStruct.b("ShareTicket", qVar.f348693o2, true);
        yb5.d dVar = this.f203724i;
        wxaUpdatableMsgReportStruct.f63054h = wxaUpdatableMsgReportStruct.b("ChattingId", dVar.x(), true);
        wxaUpdatableMsgReportStruct.f63055i = dVar.D() ? cm.b1.YES : cm.b1.NO;
        wxaUpdatableMsgReportStruct.f63056j = cm.a1.CLICKSUBSCRIBETV;
        wxaUpdatableMsgReportStruct.f63057k = 0L;
        wxaUpdatableMsgReportStruct.f63058l = wxaUpdatableMsgReportStruct.b("SceneNote", "", true);
        wxaUpdatableMsgReportStruct.f63052f = wxaUpdatableMsgReportStruct.i();
        wxaUpdatableMsgReportStruct.f63059m = cm.c1.DEFAULT;
        wxaUpdatableMsgReportStruct.f63061o = cm.z0.a(aVar.f348348d + 1000);
        wxaUpdatableMsgReportStruct.f63060n = cm.d1.DEFAULT;
        wxaUpdatableMsgReportStruct.k();
    }
}
