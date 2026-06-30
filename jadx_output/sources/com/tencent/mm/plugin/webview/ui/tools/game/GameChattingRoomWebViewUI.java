package com.tencent.mm.plugin.webview.ui.tools.game;

/* loaded from: classes8.dex */
public class GameChattingRoomWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    public java.lang.String A3 = "";
    public final int B3 = 4;
    public final int C3 = 5;
    public final com.tencent.mm.ui.widget.dialog.j D3 = new sx4.c(this);
    public final com.tencent.mm.ui.widget.dialog.j E3 = new sx4.d(this);
    public final com.tencent.mm.plugin.webview.core.i3 F3 = new sx4.f(this);

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.plugin.webview.core.e3 e7() {
        com.tencent.mm.plugin.webview.core.e3 e76 = super.e7();
        e76.E(this.F3);
        return e76;
    }

    public void m9(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameChattingRoomWebViewUI", "url = %s", str);
        this.A3 = str;
        java.lang.String stringExtra = getIntent().getStringExtra("action");
        if (stringExtra != null) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("app_name");
            java.lang.String string = stringExtra2 == null ? getString(com.tencent.mm.R.string.f490012ig) : getString(com.tencent.mm.R.string.bay, stringExtra2);
            java.lang.String string2 = getString(com.tencent.mm.R.string.f490943bb5);
            boolean equals = stringExtra.equals("action_create");
            com.tencent.mm.ui.widget.dialog.j jVar = this.E3;
            com.tencent.mm.ui.widget.dialog.j jVar2 = this.D3;
            if (equals) {
                fq1.h.a(this.mController, getString(com.tencent.mm.R.string.bly), string, string2, jVar2, jVar);
            } else if (stringExtra.equals("action_join")) {
                fq1.h.a(this.mController, getString(com.tencent.mm.R.string.g6s), string, string2, jVar2, jVar);
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.L1.M0(this.F3);
        super.onDestroy();
    }
}
