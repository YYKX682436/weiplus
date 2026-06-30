package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ic extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ic f186260d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ic();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("subTitle");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetPageSubTitle", "handleMsg subTitle: " + str + " context valid: " + (env.f340860a instanceof com.tencent.mm.ui.MMActivity));
        android.content.Context context = env.f340860a;
        boolean z17 = context instanceof com.tencent.mm.ui.MMActivity;
        nw4.g gVar = env.f340863d;
        if (z17) {
            if (str == null || r26.n0.N(str)) {
                ((com.tencent.mm.ui.MMActivity) context).setMMSubTitle((java.lang.String) null);
            } else {
                ((com.tencent.mm.ui.MMActivity) context).setMMSubTitle(str);
            }
            gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        } else {
            gVar.e(msg.f341013c, msg.f341019i + ":failed", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return uc1.o.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setPageSubTitle";
    }
}
