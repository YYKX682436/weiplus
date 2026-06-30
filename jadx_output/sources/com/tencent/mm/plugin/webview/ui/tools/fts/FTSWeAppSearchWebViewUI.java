package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class FTSWeAppSearchWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI {
    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI, tj5.n
    public boolean G0() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        tj5.z zVar = this.F4;
        if (zVar != null) {
            zVar.getFtsEditText().d();
        }
        int intExtra = getIntent().getIntExtra(com.tencent.mm.ui.w2.f211201n, 0);
        if (intExtra != 0 && (stringArrayListExtra = getIntent().getStringArrayListExtra(com.tencent.mm.ui.w2.f211202o)) != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(intExtra, stringArrayListExtra);
        }
        super.G0();
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
    public android.graphics.drawable.Drawable M9(int i17) {
        return this.f184255l4 ? getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_wechat_search_one_search) : super.M9(i17);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI
    public java.lang.String ga() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f184258p4)) {
            return this.f184258p4;
        }
        boolean z17 = this.f184255l4;
        int i17 = com.tencent.mm.R.string.l5_;
        if (z17) {
            if (this.I4 != 8) {
                return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490549y8);
            }
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490549y8) + getString(com.tencent.mm.R.string.l5_);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_search_input_hint");
        if (!android.text.TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        int i18 = this.I4;
        if (i18 == 1) {
            i17 = com.tencent.mm.R.string.id8;
        } else if (i18 == 2) {
            i17 = com.tencent.mm.R.string.id7;
        } else if (i18 != 8) {
            if (i18 != 16) {
                if (i18 != 64) {
                    if (i18 == 128) {
                        i17 = com.tencent.mm.R.string.ffs;
                    } else if (i18 == 256 || i18 == 384) {
                        i17 = com.tencent.mm.R.string.ffr;
                    } else if (i18 == 512) {
                        i17 = com.tencent.mm.R.string.f492158fg1;
                    } else if (i18 == 1024) {
                        i17 = com.tencent.mm.R.string.f492159fg2;
                    } else if (i18 != 262208) {
                        i17 = -1;
                    }
                }
                i17 = com.tencent.mm.R.string.f490115lc;
            } else {
                i17 = com.tencent.mm.R.string.f492160fg3;
            }
        }
        int i19 = this.K4;
        if (i19 == 56) {
            i17 = com.tencent.mm.R.string.ids;
        }
        if (i18 == 0 && (i19 == 135 || i19 == 136 || i19 == 137 || i19 == 244)) {
            i17 = com.tencent.mm.R.string.idt;
        }
        return i17 < 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490549y8) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.id6, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(i17));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceUIMode() {
        if (this.J4) {
            return 1;
        }
        return super.getForceUIMode();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI, tj5.y
    public void onClickCancelBtn(android.view.View view) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4);
        java.util.HashMap hashMap = this.f184261s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f184246c4);
        }
        hashMap.put("exittype", "5");
        super.onClickCancelBtn(view);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (fp.h.c(23)) {
            if (com.tencent.mm.ui.bk.C()) {
                Q8(getResources().getColor(com.tencent.mm.R.color.ael), false);
            } else {
                Q8(getResources().getColor(com.tencent.mm.R.color.aem), false);
            }
        }
        if (this.J4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppSearchWebViewUI", "isforceShowNightMode.");
            tj5.z zVar = this.F4;
            if (zVar == null || zVar.getFtsEditText() == null) {
                return;
            }
            this.F4.getFtsEditText().f209815f.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        su4.k3.l();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        if (this.J4 && (mMWebView = this.f183815f) != null) {
            mMWebView.getSettings().B(2);
        }
        super.onResume();
        su4.k3.f412979a.f412966c = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void q8(int i17) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183815f;
        if (mMWebView == null || mMWebView.getSettings() == null) {
            return;
        }
        getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        float b17 = j65.c.b(getContext());
        if (b17 >= i65.a.v(getContext())) {
            this.f183815f.getSettings().O(140);
            return;
        }
        if (b17 >= i65.a.u(getContext())) {
            this.f183815f.getSettings().O(140);
            return;
        }
        if (b17 >= i65.a.t(getContext())) {
            this.f183815f.getSettings().O(140);
            return;
        }
        if (b17 >= i65.a.s(getContext())) {
            this.f183815f.getSettings().O(130);
            return;
        }
        if (b17 >= i65.a.z(getContext())) {
            this.f183815f.getSettings().O(120);
            return;
        }
        if (b17 >= i65.a.w(getContext())) {
            this.f183815f.getSettings().O(110);
            return;
        }
        i65.a.x(getContext());
        if (b17 >= 1.0f) {
            this.f183815f.getSettings().O(100);
        } else if (b17 >= i65.a.y(getContext())) {
            this.f183815f.getSettings().O(90);
        } else {
            this.f183815f.getSettings().O(80);
        }
    }
}
