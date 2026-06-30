package com.tencent.mm.plugin.webview.ui.tools.game;

@db5.a(19)
/* loaded from: classes8.dex */
public class H5GameWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI {
    public static final java.lang.String U3 = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/gameloading/index.html";
    public int T3;

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI, com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.H5GameWebViewUI", "onCreate");
        this.K = false;
        this.T3 = this.A;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.H5GameWebViewUI", "onNewIntent");
        super.onNewIntent(intent);
        boolean booleanExtra = getIntent().getBooleanExtra("show_full_screen", false);
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("rawUrl");
        if (this.f183802J.equals(stringExtra)) {
            return;
        }
        if (stringExtra.startsWith(U3)) {
            this.f183802J = stringExtra;
        }
        if (F7().equals(stringExtra)) {
            this.A = this.T3;
            getIntent().putExtra("show_full_screen", booleanExtra);
            Z7();
            return;
        }
        this.A = getIntent().getIntExtra("screen_orientation", -1);
        com.tencent.mm.plugin.webview.permission.w wVar = this.f183876z1;
        if (wVar == null) {
            this.f183876z1 = new com.tencent.mm.plugin.webview.permission.w(new sx4.r0(this));
        } else {
            wVar.g(stringExtra, null, null);
        }
        this.f183876z1.h((com.tencent.mm.protocal.JsapiPermissionWrapper) getIntent().getParcelableExtra("hardcode_jspermission"), (com.tencent.mm.protocal.GeneralControlWrapper) getIntent().getParcelableExtra("hardcode_general_ctrl"));
        this.f183815f.loadUrl("about:blank");
        this.L1.j(intent);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI, com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        setMMOrientation();
        super.onResume();
    }
}
