package os3;

/* loaded from: classes8.dex */
public class y4 implements com.tencent.mm.plugin.webview.ui.tools.widget.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348259a;

    public y4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348259a = readMailUI;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public void a(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public boolean b(android.os.Bundle bundle) {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public boolean c(java.lang.String str) {
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348259a;
        if (str != null && str.startsWith("mailto:")) {
            java.lang.String replace = str.trim().replace("mailto:", "");
            android.content.Intent intent = new android.content.Intent(readMailUI, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.ComposeUI.class);
            intent.putExtra("composeType", 4);
            intent.putExtra("toList", new java.lang.String[]{replace + " " + replace});
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI2 = this.f348259a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(readMailUI2, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            readMailUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(readMailUI2, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            if (str == null || !str.startsWith("tel:")) {
                if (str != null && !str.startsWith("data:")) {
                    tx5.f fVar = readMailUI.f154928g;
                    if (((com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView) ((com.tencent.mm.plugin.webview.ui.tools.widget.e2) fVar)).I) {
                        ((com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView) ((com.tencent.mm.plugin.webview.ui.tools.widget.e2) fVar)).I = false;
                        return true;
                    }
                    if (str.startsWith("http")) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("rawUrl", str);
                        intent2.putExtra("geta8key_scene", 16);
                        j45.l.j(readMailUI, "webview", ".ui.tools.WebViewUI", intent2, null);
                    }
                }
                return false;
            }
            android.content.Intent intent3 = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse(str));
            intent3.addFlags(268435456);
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI3 = this.f348259a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(readMailUI3, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            readMailUI3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(readMailUI3, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x1
    public boolean callback(int i17, android.os.Bundle bundle) {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public void d(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str) {
        mMWebView.evaluateJavascript("javascript:var meta = document.createElement(\"meta\");meta.name=\"viewport\";meta.id=\"viewport\";meta.content=\"initial-scale=1,user-scalable=yes,maximum-scale=3.0\";document.head.appendChild(meta);", null);
        mMWebView.evaluateJavascript("javascript:" + com.tencent.mm.plugin.qqmail.ui.ReadMailUI.N, null);
        mMWebView.evaluateJavascript("javascript:" + com.tencent.mm.plugin.qqmail.ui.ReadMailUI.P, null);
        mMWebView.evaluateJavascript("javascript:" + com.tencent.mm.plugin.qqmail.ui.ReadMailUI.Q, null);
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348259a;
        new com.tencent.mm.sdk.platformtools.n3(readMailUI.getMainLooper()).postDelayed(new os3.w4(this), 200L);
        new com.tencent.mm.sdk.platformtools.n3(readMailUI.getMainLooper()).postDelayed(new os3.x4(this), 400L);
    }
}
