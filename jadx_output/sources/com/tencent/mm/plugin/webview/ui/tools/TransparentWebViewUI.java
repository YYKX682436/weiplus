package com.tencent.mm.plugin.webview.ui.tools;

@db5.a(3)
/* loaded from: classes8.dex */
public class TransparentWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI {
    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void Y7() {
        setBackGroundColorResource(0);
        getContentView().setBackgroundResource(0);
        this.f183815f.setBackgroundResource(android.R.color.transparent);
        this.f183815f.setBackgroundColor(0);
        findViewById(com.tencent.mm.R.id.pil).setBackgroundResource(android.R.color.transparent);
        findViewById(com.tencent.mm.R.id.m7j).setBackgroundResource(android.R.color.transparent);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton movingImageButton;
        super.initView();
        com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = this.f183804a3;
        s7Var.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        yp5.a.f464409a.a();
        s7Var.f186863q = true;
        s7Var.f186851e = false;
        s7Var.e(true);
        android.view.View view = s7Var.f186859m;
        if (view != null) {
            view.setBackgroundColor(0);
        }
        if (!(getIntent() != null && getIntent().hasExtra("show_full_screen") && getIntent().getBooleanExtra("show_full_screen", false)) || (movingImageButton = this.f183875z) == null) {
            return;
        }
        movingImageButton.setCanMove(false);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI, com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i17 = this.A;
        if (i17 == 1001) {
            this.A = 0;
            z41.c cVar = this.D;
            if (cVar != null) {
                cVar.enable();
                return;
            }
            return;
        }
        if (i17 == 1002) {
            this.A = 1;
            z41.c cVar2 = this.D;
            if (cVar2 != null) {
                cVar2.enable();
            }
        }
    }
}
