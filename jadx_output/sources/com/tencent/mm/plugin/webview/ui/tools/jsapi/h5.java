package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class h5 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185166b;

    public h5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str) {
        this.f185166b = c1Var;
        this.f185165a = str;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doLaunch3RdAppImpl launchSuccess:" + z17 + "pkg:" + this.f185165a);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185166b;
        if (z17) {
            c1Var.i5(c1Var.f184976e, "launch_3rdApp:ok", null);
        } else {
            c1Var.i5(c1Var.f184976e, "launch_3rdApp:fail", null);
        }
    }
}
