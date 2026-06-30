package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ECardJsApiCheckEvent f185274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185276f;

    public m4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.autogen.events.ECardJsApiCheckEvent eCardJsApiCheckEvent, nw4.y2 y2Var) {
        this.f185276f = c1Var;
        this.f185274d = eCardJsApiCheckEvent;
        this.f185275e = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "run ecard jsapi check callback");
        int i17 = this.f185274d.f54097h.f7009a;
        nw4.y2 y2Var = this.f185275e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185276f;
        if (i17 == 0) {
            c1Var.i5(y2Var, "openECard:ok", null);
        } else {
            c1Var.i5(y2Var, "openECard:fail", null);
        }
    }
}
