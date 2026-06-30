package sx4;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.plugin.webview.ui.tools.widget.x3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.q f413632e;

    public n(sx4.q qVar) {
        this.f413632e = qVar;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void b(android.os.Bundle bundle) {
        sx4.q qVar = this.f413632e;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "closeWindow");
        try {
            qVar.f413640d.removeView(qVar.f413639c);
            qVar.a();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "game float invokeAsResult, actionCode = " + i17);
        android.os.Bundle bundle2 = new android.os.Bundle();
        int i19 = 1;
        sx4.q qVar = this.f413632e;
        if (i17 == 18) {
            sx4.s0 s0Var = qVar.f413641e;
            bundle2.putString("KPublisherId", sx4.s0.f413657a);
            sx4.s0 s0Var2 = qVar.f413641e;
            java.lang.String str = sx4.s0.f413658b;
            int i27 = sx4.s0.f413659c;
            qVar.getClass();
            if (i27 != 0) {
                i19 = i27;
            } else if (str == null || str.length() <= 0) {
                i19 = 0;
            } else {
                com.tencent.mm.plugin.webview.stub.v0 v0Var = qVar.f413642f;
                if (v0Var != null) {
                    try {
                        if (!v0Var.wc(str)) {
                            i18 = qVar.f413642f.j8(str) ? 7 : 8;
                        }
                        i19 = i18;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GameFloatWebView", "getScene fail, ex = " + e17.getMessage());
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "KGetA8KeyScene = %s", java.lang.Integer.valueOf(i19));
            bundle2.putInt("getA8KeyScene", i19);
        } else if (i17 == 37) {
            qVar.f413638b.runOnUiThread(new sx4.j(this, bundle.getString("show_kb_placeholder"), bundle.getInt("show_kb_max_length"), bundle.getInt("show_kb_show_remind_word_count")));
        } else if (i17 == 43) {
            qVar.f413638b.runOnUiThread(new sx4.l(this, bundle.getString("set_page_title_text"), com.tencent.mm.plugin.webview.ui.tools.a1.c(bundle.getString("set_page_title_color"), qVar.f413638b.getResources().getColor(com.tencent.mm.R.color.f478587bl))));
        } else if (i17 == 79) {
            qVar.f413638b.runOnUiThread(new sx4.k(this, bundle2));
        } else if (i17 == 84) {
            java.lang.CharSequence mMTitle = qVar.f413638b.getMMTitle();
            bundle2.putString("webview_current_url", null);
            bundle2.putString("webview_current_title", mMTitle != null ? mMTitle.toString() : "");
            bundle2.putString("webview_current_desc", "");
        } else if (i17 == 87) {
            sx4.p pVar = qVar.f413645i;
            boolean z17 = pVar.f187569v;
            java.lang.String str2 = pVar.f187570w;
            java.util.Map map = pVar.f187571x;
            if (z17) {
                bundle2.putString("result", "not_return");
            } else {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                bundle2.putString("full_url", str2 == null ? "" : str2);
                if (map == null || map.size() == 0) {
                    bundle2.putInt("set_cookie", 0);
                } else {
                    bundle2.putInt("set_cookie", 1);
                    for (java.lang.String str3 : map.keySet()) {
                        com.tencent.xweb.d.g().b(str2 == null ? "" : str2, str3 + "=" + ((java.lang.String) map.get(str3)));
                    }
                    com.tencent.xweb.d.g().flush();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = com.tencent.xweb.d.g().a(str2 != null ? str2 : "");
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "cookies:%s", objArr);
                }
            }
        } else if (i17 == 95) {
            qVar.f413651o.f413666f.c(bundle);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "set game float page time data");
        } else if (i17 == 99) {
            sx4.s0 s0Var3 = qVar.f413641e;
            int i28 = sx4.s0.f413659c;
            bundle2.putInt("geta8key_scene", i28);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "Key value: getA8KeyScene(%d)", java.lang.Integer.valueOf(i28));
        } else if (i17 == 101) {
            bundle.setClassLoader(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.class.getClassLoader());
            android.content.Context context = qVar.f413637a;
            java.lang.String string = bundle.getString("open_ui_with_webview_ui_plugin_name");
            java.lang.String string2 = bundle.getString("open_ui_with_webview_ui_plugin_entry");
            android.content.Intent putExtras = new android.content.Intent().putExtras(bundle.getBundle("open_ui_with_webview_ui_extras"));
            sx4.s0 s0Var4 = qVar.f413641e;
            j45.l.j(context, string, string2, putExtras.putExtra("KPublisherId", sx4.s0.f413657a), null);
        } else if (i17 == 6001) {
            boolean z19 = bundle.getBoolean("clear_webview_cache_clear_cookie", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "includeCookie = %b", java.lang.Boolean.valueOf(z19));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
            intent.putExtra("tools_clean_webview_cache_ignore_cookie", z19);
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).getClass();
            com.tencent.mm.xwebutil.s0.a(intent);
        } else if (i17 == 53) {
            qVar.f413638b.runOnUiThread(new sx4.m(this, bundle));
        } else if (i17 == 54) {
            boolean z27 = bundle.getBoolean("add_shortcut_status");
            nw4.n nVar = qVar.f413643g;
            if (nVar != null) {
                nVar.B(z27);
            }
        } else if (i17 == 252) {
            qVar.f413647k.f68182o = 1;
            qVar.f413648l.f413589h = java.lang.System.currentTimeMillis();
        } else if (i17 != 253) {
            switch (i17) {
                case com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION /* 90001 */:
                    java.lang.String a17 = com.tencent.xweb.d.g().a(null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "url = %s, cookie = %s", null, a17);
                    bundle2.putString("cookie", a17);
                    bundle2.putFloat("density", i65.a.g(qVar.f413638b));
                    break;
                case 90002:
                    com.tencent.mm.plugin.webview.ui.tools.t7.f186896i.d(bundle.getString("traceid"), bundle.getString(dm.i4.COL_USERNAME));
                    break;
                default:
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameFloatWebView", "undefine action code!!!");
                    break;
            }
        } else {
            qVar.f413648l.f413590i = java.lang.System.currentTimeMillis();
        }
        return bundle2;
    }
}
