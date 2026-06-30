package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class h3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f184787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184788b;

    public h3(android.net.Uri uri, android.content.Context context) {
        this.f184787a = uri;
        this.f184788b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", this.f184787a);
            intent.addFlags(268435456);
            try {
                android.content.Context context = this.f184788b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SMSQueryHelper$Companion$showDialog$build$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/SMSQueryHelper$Companion$showDialog$build$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI.SMSQueryHelper", "start sms app failed:[%s]", e17.getMessage());
            }
        }
    }
}
