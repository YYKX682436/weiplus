package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class rd implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f186503f;

    public rd(nw4.k kVar, nw4.y2 y2Var, boolean z17) {
        this.f186501d = kVar;
        this.f186502e = y2Var;
        this.f186503f = z17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String string = bundle.getString("KEY_BACK_INFO");
        if (string == null) {
            string = "";
        }
        h0Var.f310123d = string;
        java.lang.String string2 = bundle.getString("KEY_ERR_TIPS");
        if (!kotlin.jvm.internal.o.b(h0Var.f310123d, "") && !r26.i0.A((java.lang.String) h0Var.f310123d, ":", false, 2, null)) {
            h0Var.f310123d = ":" + ((java.lang.String) h0Var.f310123d);
        }
        java.lang.String str = (java.lang.String) h0Var.f310123d;
        if ((str != null && r26.i0.y(str, "fail", false)) && !kotlin.jvm.internal.o.b(h0Var.f310123d, "fail_cancel")) {
            if (string2 == null || r26.n0.N(string2)) {
                string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ajc);
            }
            java.lang.String str2 = string2;
            kotlin.jvm.internal.o.d(str2);
            pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.qd(this.f186501d, str2, this.f186502e, h0Var, this.f186503f));
            return;
        }
        java.lang.String errMsg = (java.lang.String) h0Var.f310123d;
        nw4.k env = this.f186501d;
        kotlin.jvm.internal.o.g(env, "env");
        nw4.y2 msg = this.f186502e;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        env.f340863d.e(msg.f341013c, msg.f341019i + errMsg, null);
        android.content.Context context = env.f340860a;
        if (this.f186503f && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
    }
}
