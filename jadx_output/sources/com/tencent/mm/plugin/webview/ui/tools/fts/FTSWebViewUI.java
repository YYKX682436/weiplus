package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class FTSWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI {
    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void B8() {
        super.B8();
        int i17 = this.K4;
        su4.j3 j3Var = su4.k3.f412979a;
        j3Var.f412964a = i17;
        j3Var.f412965b = 1;
        j3Var.f412966c = java.lang.System.currentTimeMillis();
        j3Var.f412967d = 0L;
        j3Var.f412968e = java.lang.System.currentTimeMillis();
        j3Var.f412969f = 0L;
        j3Var.f412970g = false;
        if (this.K4 == 21) {
            su4.k3.e(17);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI
    public java.lang.String ha() {
        return getString(com.tencent.mm.R.string.f490549y8);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.K4 == 21) {
            su4.k3.e(19);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.y
    public void onClickCancelBtn(android.view.View view) {
        super.onClickCancelBtn(view);
        finish();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        su4.j3 j3Var = su4.k3.f412979a;
        j3Var.f412969f += java.lang.System.currentTimeMillis() - j3Var.f412968e;
        su4.k3.h();
        if (this.K4 == 21) {
            su4.k3.e(18);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        su4.k3.l();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        su4.k3.f412979a.f412966c = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void v8() {
        if (this.K4 == 21) {
            su4.k3.e(19);
        }
        super.v8();
    }
}
