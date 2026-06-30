package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class QRCodeIntroductionWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    public static final /* synthetic */ int A3 = 0;

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.webview.ui.tools.v0(this));
        setBackBtn(new com.tencent.mm.plugin.webview.ui.tools.w0(this));
    }
}
