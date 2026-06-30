package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ExDeviceGetTicketEvent f185360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185362f;

    public q5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.autogen.events.ExDeviceGetTicketEvent exDeviceGetTicketEvent, nw4.y2 y2Var) {
        this.f185362f = c1Var;
        this.f185360d = exDeviceGetTicketEvent;
        this.f185361e = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExDeviceGetTicketEvent exDeviceGetTicketEvent = this.f185360d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "ExDeviceGetTicketEvent isOk[%s], ticket[%s]", java.lang.Boolean.valueOf(exDeviceGetTicketEvent.f54140h.f6128a), exDeviceGetTicketEvent.f54140h.f6129b);
        am.a6 a6Var = exDeviceGetTicketEvent.f54140h;
        if (a6Var.f6128a) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(a6Var.f6129b);
            nw4.y2 y2Var = this.f185361e;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185362f;
            if (K0) {
                c1Var.i5(y2Var, "getWXDeviceTicket:fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "ticket %s", exDeviceGetTicketEvent.f54140h.f6129b);
            hashMap.put("ticket", exDeviceGetTicketEvent.f54140h.f6129b);
            c1Var.i5(y2Var, "getWXDeviceTicket:ok", hashMap);
        }
    }
}
