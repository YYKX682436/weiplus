package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class MMWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.y()) ? getIntent().getBooleanExtra("convertActivityFromTranslucent", false) : getIntent().getBooleanExtra("convertActivityFromTranslucent", true);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean l7() {
        return getClass().equals(com.tencent.mm.plugin.webview.ui.tools.MMWebViewUI.class) && !getIntent().getBooleanExtra("disable_minimize", false);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean s8() {
        return true;
    }
}
