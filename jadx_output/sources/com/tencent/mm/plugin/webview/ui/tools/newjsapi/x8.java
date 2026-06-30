package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class x8 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186659c;

    public x8(java.lang.String str, nw4.k kVar, nw4.y2 y2Var) {
        this.f186657a = str;
        this.f186658b = kVar;
        this.f186659c = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        nw4.y2 y2Var = this.f186659c;
        nw4.k kVar = this.f186658b;
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.f186657a));
            intent.addFlags(268435456);
            android.content.Context context = kVar.f340860a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenUrlByExtBrowser$handleMsg$3", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenUrlByExtBrowser$handleMsg$3", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            kVar.f340863d.e(y2Var.f341013c, "open_url_by_ext_browser:ok", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenUrlByExtBrowser", e17, "openUrlByExtBrowser exception", new java.lang.Object[0]);
            kVar.f340863d.e(y2Var.f341013c, "open_url_by_ext_browser:fail", null);
        }
    }
}
