package com.tencent.mm.plugin.webview.ui.tools.game;

/* loaded from: classes8.dex */
public class GameBaseWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    public sx4.q A3;
    public final sx4.v B3 = new sx4.a(this);

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void N8(android.os.Bundle bundle) {
        this.B3.f413666f.c(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean f7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.B3.f413666f.a();
        sx4.q qVar = this.A3;
        if (qVar != null) {
            qVar.a();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.B3.f413666f.b();
        sx4.q qVar = this.A3;
        if (qVar != null) {
            qVar.f413651o.f413666f.b();
            qVar.f413647k.I += java.lang.System.currentTimeMillis() - qVar.f413649m;
            qVar.f413649m = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.B3.f413666f.d();
        sx4.q qVar = this.A3;
        if (qVar != null) {
            qVar.f413651o.f413666f.d();
            qVar.f413649m = java.lang.System.currentTimeMillis();
        }
        super.onResume();
    }
}
