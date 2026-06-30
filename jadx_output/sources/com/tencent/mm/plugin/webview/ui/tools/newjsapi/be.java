package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes5.dex */
public final class be extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.be f185987d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.be();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.yd ydVar = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.yd(env, msg);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.zd zdVar = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.zd(env);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.wd wdVar = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wd(env);
        java.util.Objects.toString(((java.util.HashMap) msg.f340790a).get("hidden"));
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.ce.a(env);
        boolean y17 = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) ((java.util.HashMap) msg.f340790a).get("hidden"), false);
        boolean y18 = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) ((java.util.HashMap) msg.f340790a).get("supportEmoticon"), false);
        sk.g gVar = (sk.g) i95.n0.c(sk.g.class);
        if (y17) {
            if (!(com.tencent.mm.plugin.webview.ui.tools.newjsapi.ce.a(env) != null)) {
                e(env, msg);
                return false;
            }
            sk.e a17 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.ce.a(env);
            if (a17 == null) {
                e(env, msg);
                return false;
            }
            vr.g gVar2 = (vr.g) a17;
            yz5.a aVar = gVar2.f439408f;
            if (aVar != null) {
                aVar.invoke();
            }
            pm0.v.X(new vr.c(gVar2));
            pm0.v.X(new vr.a(gVar2, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ae(env, msg)));
            return true;
        }
        if (!(com.tencent.mm.plugin.webview.ui.tools.newjsapi.ce.a(env) != null)) {
            android.content.Context context = env.f340860a;
            java.util.Map params = msg.f340790a;
            kotlin.jvm.internal.o.f(params, "params");
            ((qv.g2) gVar).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(context);
            com.tencent.mm.api.SmileyPanel smileyPanel = (com.tencent.mm.api.SmileyPanel) wi6;
            int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
            smileyPanel.setEntranceScene(112);
            smileyPanel.setSearchSource(6500);
            smileyPanel.setShowSmiley(true);
            smileyPanel.setShowSend(true);
            smileyPanel.p(y18, y18);
            smileyPanel.o(false, false);
            smileyPanel.setShowStore(y18);
            smileyPanel.setShowSend(true);
            smileyPanel.setShowClose(false);
            smileyPanel.setShowSearch(y18);
            smileyPanel.setShowGame(false);
            smileyPanel.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aij));
            smileyPanel.setTabBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aij));
            smileyPanel.setPanelBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aij));
            smileyPanel.i();
            wi6.k();
            wi6.j();
            android.content.Context context2 = env.f340860a;
            com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
            kotlin.jvm.internal.o.g(context2, "context");
            vr.g gVar3 = new vr.g(context2, mMWebView, wi6, wdVar, zdVar);
            gVar3.f439408f = new qv.e2(ydVar);
            pm0.v.X(new vr.f(gVar3, new qv.f2(ydVar, gVar3), context2));
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 238;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return hc1.i.NAME;
    }

    public final boolean e(nw4.k kVar, nw4.y2 y2Var) {
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        return false;
    }
}
