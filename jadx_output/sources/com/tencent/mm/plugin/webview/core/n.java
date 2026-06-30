package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181889d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181889d;
        com.tencent.mm.ui.widget.MMWebView mMWebView = r0Var.f181916a;
        java.lang.String str4 = "";
        if (mMWebView.f211371t) {
            java.lang.String url = mMWebView.getUrl();
            if (url == null) {
                url = "";
            }
            r0Var.Q0(url);
        }
        if (!r0Var.v0()) {
            com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) r0Var;
            e3Var.o1();
            byte[] byteArrayExtra = e3Var.d0().getByteArrayExtra("key_scan_qr_code_get_a8key_req");
            byte[] byteArrayExtra2 = e3Var.d0().getByteArrayExtra("key_scan_qr_code_get_a8key_resp");
            if (byteArrayExtra != null && byteArrayExtra2 != null) {
                com.tencent.mars.xlog.Log.i(e3Var.o1(), "set outer get A8key result");
                com.tencent.mm.plugin.webview.permission.d O = e3Var.O();
                O.getClass();
                if (byteArrayExtra.length > 0 && byteArrayExtra2.length > 0) {
                    r45.r83 r83Var = new r45.r83();
                    r45.s83 s83Var = new r45.s83();
                    try {
                        r83Var.parseFrom(byteArrayExtra);
                        s83Var.parseFrom(byteArrayExtra2);
                        O.f183397q = r83Var.f384615i.f372756d;
                    } catch (java.lang.Exception unused) {
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(O.f183397q) || s83Var.f385545d == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8Key", "ReqUrl or FullUrl is null");
                    } else {
                        O.f183398r = s83Var;
                        O.f183399s = r83Var;
                    }
                }
            }
            java.lang.String stringExtra = e3Var.d0().getStringExtra("geta8key_username");
            java.lang.String stringExtra2 = e3Var.d0().getStringExtra("msgUsername");
            java.lang.String stringExtra3 = e3Var.d0().getStringExtra("serverMsgID");
            int intExtra = e3Var.d0().getIntExtra("geta8key_msg_scene", 0);
            int intExtra2 = e3Var.d0().getIntExtra("weapp_scene", 0);
            java.lang.String stringExtra4 = e3Var.d0().getStringExtra("weapp_scene_note");
            java.lang.String stringExtra5 = e3Var.d0().getStringExtra("weapp_username");
            com.tencent.mm.plugin.webview.permission.d O2 = e3Var.O();
            O2.getClass();
            O2.f183402v = stringExtra2 == null ? "" : stringExtra2;
            e3Var.O().f183384d = e3Var.d0().getStringExtra("kReferrer");
            e3Var.O().A = stringExtra3;
            com.tencent.mm.plugin.webview.permission.d O3 = e3Var.O();
            O3.getClass();
            O3.f183386f = stringExtra == null ? "" : stringExtra;
            e3Var.O().f183403w = intExtra;
            e3Var.O().f183404x = intExtra2;
            e3Var.O().f183405y = stringExtra4;
            com.tencent.mm.plugin.webview.permission.d O4 = e3Var.O();
            O4.getClass();
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            O4.f183406z = stringExtra5;
            e3Var.O().f183383c = e3Var.k0(stringExtra);
            e3Var.O().f183387g = e3Var.d0().getStringExtra("geta8key_open_webview_appid");
            e3Var.O().f183385e = 0;
            e3Var.O().f183389i = e3Var.d0().getByteArrayExtra("geta8key_cookie");
            e3Var.O().f183395o = e3Var.d0().getIntExtra("key_wallet_region", 0);
            com.tencent.mm.plugin.webview.permission.d O5 = e3Var.O();
            java.lang.String stringExtra6 = e3Var.d0().getStringExtra("key_function_id");
            O5.getClass();
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            O5.f183388h = stringExtra6;
            e3Var.O().F = e3Var.d0().getIntExtra("KMsgType", 0);
            e3Var.O().G = e3Var.d0().getIntExtra("KAppMsgType", 0);
            int intExtra3 = e3Var.d0().getIntExtra("geta8key_session_id", 0);
            if (intExtra3 != 0) {
                com.tencent.mars.xlog.Log.i(e3Var.o1(), "set requestid:" + intExtra3);
                e3Var.O().f183390j = intExtra3;
            }
            int intExtra4 = e3Var.d0().getIntExtra("geta8key_init_request_id", 0);
            if (intExtra4 != 0) {
                com.tencent.mars.xlog.Log.i(e3Var.o1(), "set initRequestId:" + intExtra4);
                e3Var.O().f183391k = intExtra4;
            }
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                com.tencent.mm.plugin.webview.permission.d O6 = e3Var.O();
                r45.r83 r83Var2 = e3Var.O().f183399s;
                if (r83Var2 == null || (str3 = r83Var2.G) == null) {
                    str3 = "";
                }
                O6.getClass();
                O6.f183402v = str3;
            }
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mm.plugin.webview.permission.d O7 = e3Var.O();
                r45.r83 r83Var3 = e3Var.O().f183399s;
                if (r83Var3 == null || (str2 = r83Var3.f384619p) == null) {
                    str2 = "";
                }
                O7.getClass();
                O7.f183386f = str2;
            }
            if (stringExtra3 == null || stringExtra3.length() == 0) {
                com.tencent.mm.plugin.webview.permission.d O8 = e3Var.O();
                r45.r83 r83Var4 = e3Var.O().f183399s;
                if (r83Var4 != null && (str = r83Var4.H) != null) {
                    str4 = str;
                }
                O8.A = str4;
            }
            r0Var.H0();
            r0Var.R0();
        }
        return jz5.f0.f302826a;
    }
}
