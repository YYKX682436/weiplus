package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.d7 f185032e;

    public c7(com.tencent.mm.plugin.webview.ui.tools.jsapi.d7 d7Var, boolean z17) {
        this.f185032e = d7Var;
        this.f185031d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "EnterChattingAfterTrans config disabled, show normal toast for H5 forward");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.h(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490560yi));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.d7 d7Var = this.f185032e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 h7Var = d7Var.f185056a.f185083b;
        if (h7Var.f185173f) {
            hashMap.put("sendChatType", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.R4(h7Var.f185170c) ? 2 : 1));
        }
        com.tencent.mm.plugin.webview.stub.z0 z0Var = d7Var.f185056a.f185083b.f185174g.f184998y;
        java.lang.String str = "";
        if (z0Var != null) {
            android.os.Bundle bundle = null;
            try {
                bundle = z0Var.i(77, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "Exception has occured : %s", e17.getMessage());
            }
            if (bundle != null) {
                java.lang.String string = bundle.getString("KSessionId");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string != null) {
                    str = string;
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 h7Var2 = d7Var.f185056a.f185083b;
        h7Var2.f185174g.i5(h7Var2.f185169b, "send_app_msg:ok", hashMap);
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(d7Var.f185056a.f185083b.f185170c);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recent forward send result is ");
        sb6.append(this.f185031d);
        sb6.append(" sendChatType=");
        sb6.append(hashMap.get("sendChatType") == null ? "NULL" : hashMap.get("sendChatType"));
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", sb6.toString());
        if (str.isEmpty()) {
            return;
        }
        d7Var.f185056a.f185083b.f185174g.T6(str);
    }
}
