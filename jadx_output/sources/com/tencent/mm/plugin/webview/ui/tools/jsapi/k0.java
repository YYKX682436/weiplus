package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class k0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185220e;

    public k0(nw4.k kVar, nw4.y2 y2Var) {
        this.f185219d = kVar;
        this.f185220e = y2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetRedPacketDone", "on select envelope result: " + i18);
        if (i17 == 207) {
            nw4.k kVar = this.f185219d;
            nw4.y2 y2Var = this.f185220e;
            if (i18 == -1) {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok confirm", null);
                return;
            }
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok cancel", null);
        }
    }
}
