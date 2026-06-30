package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class y5 implements com.tencent.wechat.mm.biz.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186678b;

    public y5(nw4.k kVar, nw4.y2 y2Var) {
        this.f186677a = kVar;
        this.f186678b = y2Var;
    }

    @Override // com.tencent.wechat.mm.biz.j
    public final void complete() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNotifyHotNewsFeedStatus", "notifyHotNewsFeedStatus complete");
        nw4.g gVar = this.f186677a.f340863d;
        nw4.y2 y2Var = this.f186678b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
    }
}
