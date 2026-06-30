package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class k7 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185236e;

    public k7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185236e = c1Var;
        this.f185235d = y2Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        nw4.y2 y2Var = this.f185235d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185236e;
        if (i17 == 0 && i18 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ticket", ((r45.aa3) ((com.tencent.mm.plugin.webview.model.c1) m1Var).f182816e.f70711b.f70700a).f369869d);
            c1Var.i5(y2Var, "get_wechat_verify_ticket:ok ticket", hashMap);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "doGetWechatVerifyTicket, errType = " + i17 + ", errCode = " + i18);
            c1Var.i5(y2Var, "get_wechat_verify_ticket:fail ticket", null);
        }
        gm0.j1.d().q(1097, this);
    }
}
