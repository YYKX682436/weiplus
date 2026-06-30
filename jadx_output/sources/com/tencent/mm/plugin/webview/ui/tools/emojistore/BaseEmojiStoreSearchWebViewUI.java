package com.tencent.mm.plugin.webview.ui.tools.emojistore;

/* loaded from: classes8.dex */
public class BaseEmojiStoreSearchWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI implements com.tencent.mm.ui.tools.b9 {
    public com.tencent.mm.ui.tools.c9 A3;
    public java.lang.String B3;
    public int C3;
    public boolean D3;
    public boolean E3 = true;
    public int F3;

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void B8() {
        super.B8();
        this.B3 = getIntent().getStringExtra("keyword");
        this.C3 = getIntent().getIntExtra("type", 0);
        this.D3 = getIntent().getBooleanExtra("showkeyboard", false);
        this.F3 = getIntent().getIntExtra("sence", 0);
        this.f183815f.setOnTouchListener(new nx4.a(this));
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9();
        this.A3 = c9Var;
        addSearchMenu(true, c9Var);
        this.A3.c(false);
        this.A3.f210324i = this;
        showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = this.f183804a3;
        if (s7Var != null) {
            s7Var.e(true);
        }
        this.f183815f.setOnLongClickListener(new nx4.b(this));
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        if (this.E3 && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.E3 = false;
            if (!this.D3) {
                com.tencent.mm.sdk.platformtools.u3.i(new nx4.c(this), 500L);
                return;
            }
            com.tencent.mm.ui.tools.o3 o3Var = this.A3.f210323h;
            if (o3Var != null) {
                o3Var.d();
            }
            showVKB();
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void Q7(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "handleEmojiStoreAction action:%d", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.RESET_CODECEXCEPTION /* 80001 */:
                java.lang.String string = bundle.getString("emoji_store_json_data");
                boolean z17 = bundle.getBoolean("emoji_store_new_query", true);
                java.lang.String string2 = bundle.getString("emoji_store_page_buf");
                long j17 = bundle.getLong("emoji_store_search_id");
                nw4.n nVar = this.f183844p0;
                if (!nVar.f340895i) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, not ready");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData success, ready");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("json", string);
                hashMap.put("newQuery", java.lang.Boolean.valueOf(z17));
                hashMap.put("nextPageBuffer", string2);
                nVar.O = j17;
                java.lang.String c17 = nw4.x2.c("getSearchEmotionDataCallBack", hashMap, nVar.f340903q, nVar.f340904r);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "event:%s", c17);
                com.tencent.mm.sdk.platformtools.u3.h(new nw4.z1(nVar, c17));
                return;
            case 80002:
                this.f183844p0.F(true);
                return;
            default:
                super.Q7(i17, bundle);
                return;
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.plugin.webview.core.e3 e7() {
        com.tencent.mm.plugin.webview.core.e3 e76 = super.e7();
        e76.C(new nx4.e(this, null));
        return e76;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean e8() {
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a8t;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        if (str != null) {
            str = str.trim();
        }
        this.B3 = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.B3 = str;
            this.Q2.post(new nx4.d(this));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type", this.C3);
            bundle.putString("nextPageBuffer", "");
            bundle.putString("keyword", this.B3);
            bundle.putInt("webview_instance_id", hashCode());
            bundle.putLong("searchID", this.f183844p0.O);
            try {
                com.tencent.mm.plugin.webview.stub.v0 v0Var = this.K1;
                if (v0Var != null) {
                    v0Var.j7(1, bundle);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "invoker should not be null");
                }
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", e17, "doSearch", new java.lang.Object[0]);
            }
        }
        hideVKB();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13054, java.lang.Integer.valueOf(this.F3), 1, com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str.replace(",", " "));
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void o8() {
        finish();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        com.tencent.mm.ui.tools.c9 c9Var = this.A3;
        if (c9Var == null) {
            return true;
        }
        c9Var.j(this, menu);
        this.A3.q(getString(com.tencent.mm.R.string.bxt));
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean t8() {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
        com.tencent.mm.ui.tools.o3 o3Var = this.A3.f210323h;
        if (o3Var != null) {
            o3Var.d();
        }
        showVKB();
    }
}
