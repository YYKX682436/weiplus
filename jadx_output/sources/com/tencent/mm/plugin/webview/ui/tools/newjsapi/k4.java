package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class k4 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186303e;

    public k4(nw4.k kVar, nw4.y2 y2Var) {
        this.f186302d = kVar;
        this.f186303e = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "deleteBizArticle click canceled");
        nw4.g gVar = this.f186302d.f340863d;
        nw4.y2 y2Var = this.f186303e;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":cancel", null);
    }
}
