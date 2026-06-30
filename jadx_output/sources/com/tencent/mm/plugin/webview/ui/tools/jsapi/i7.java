package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class i7 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f185193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185195c;

    public i7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, boolean z17, nw4.y2 y2Var) {
        this.f185195c = c1Var;
        this.f185193a = z17;
        this.f185194b = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        if (this.f185193a) {
            return;
        }
        nw4.y2 y2Var = this.f185194b;
        if (y2Var.f340790a.get("url") == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "webview recent share: onContentClick: url is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", y2Var.f340790a.get("url").toString());
        intent.putExtra("hide_option_menu", true);
        j45.l.j(this.f185195c.f184975d, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
