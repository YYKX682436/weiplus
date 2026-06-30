package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ContactQZoneWebView extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    public boolean A3 = false;
    public final java.lang.String B3 = "";
    public final java.lang.String C3 = "";

    public void m9(java.lang.String str) {
        if (this.A3) {
            return;
        }
        this.A3 = true;
        java.lang.String substring = str.substring(19);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("nowUrl", substring);
        java.lang.String stringExtra = getIntent().getStringExtra("tweetid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        intent.putExtra("tweetid", stringExtra);
        intent.putExtra("htmlData", this.B3);
        intent.putExtra("type", getIntent().getIntExtra("type", 0));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 4);
        bundle.putString("stat_url", x7());
        intent.putExtra("_stat_obj", bundle);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/ContactQZoneWebView", "gotoImageView", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/ContactQZoneWebView", "gotoImageView", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((com.tencent.mm.app.y7) dw4.a.f244297a).t(intent, this);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getString(com.tencent.mm.R.string.lap));
        this.f183815f.setWebViewClient(new com.tencent.mm.plugin.webview.ui.tools.b(this));
        this.f183815f.loadUrl(F7());
        F7();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A3 = false;
    }
}
