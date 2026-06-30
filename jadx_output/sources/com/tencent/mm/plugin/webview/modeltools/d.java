package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class d implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.w1 f183248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183250c;

    public d(com.tencent.mm.ui.widget.dialog.w1 w1Var, android.content.Context context, java.lang.String str) {
        this.f183248a = w1Var;
        this.f183249b = context;
        this.f183250c = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.w1 w1Var = this.f183248a;
        if (w1Var != null) {
            w1Var.a(z17, str);
        }
        android.content.Context context = this.f183249b;
        java.lang.String str2 = this.f183250c;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str2));
        intent.addFlags(268435456);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.P0(context) && !com.tencent.mm.sdk.platformtools.a0.c()) {
                android.content.Intent a17 = hx4.r.a(context, intent, str2, false);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(a17);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            if (fp.h.c(29)) {
                android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(134217728)).send(context, 1, null, new com.tencent.mm.plugin.webview.modeltools.e(), null);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", e17.getMessage());
        }
    }
}
