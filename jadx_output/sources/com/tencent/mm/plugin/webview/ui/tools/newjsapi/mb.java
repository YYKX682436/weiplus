package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class mb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.mb f186365d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.mb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = false;
        nw4.e3.a(msg.f341018h, false, null, (java.lang.String) ((java.util.HashMap) msg.f340790a).get("appId"));
        if (((java.util.HashMap) msg.f340790a).get("action") != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestWxPayKeyboard", "action: %s", ((java.util.HashMap) msg.f340790a).get("action"));
            java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("action");
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            str = (java.lang.String) obj;
        } else {
            str = "";
        }
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            android.view.ViewGroup K7 = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).K7();
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).getClass();
                        if (K7 instanceof com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) {
                            ((com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) K7).i();
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WalletService", "hideNumKeyboard error, kbView is not WcPayKeyboard");
                        }
                        z17 = true;
                        break;
                    }
                    break;
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                    if (str.equals("1")) {
                        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Ai(K7);
                        z17 = true;
                        break;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).getClass();
                        if (K7 instanceof com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) {
                            android.widget.EditText editText = ((com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) K7).f213821y;
                            if (editText != null) {
                                editText.setText("");
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WalletService", "resetKeyboardAmount error, kbView is not WcPayKeyboard");
                        }
                        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Ai(K7);
                        z17 = true;
                        break;
                    }
                    break;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestWxPayKeyboard", "env.context is not WebViewUI");
        }
        nw4.g gVar = env.f340863d;
        if (z17) {
            gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        } else {
            gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 484;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "requestWxPayKeyboard";
    }
}
