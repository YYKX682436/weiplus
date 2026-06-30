package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public class k2 implements k80.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 f185226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185227c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185228d;

    public k2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var, java.lang.String str) {
        this.f185228d = c1Var;
        this.f185225a = y2Var;
        this.f185226b = e8Var;
        this.f185227c = str;
    }

    @Override // k80.f
    public void a(int i17, int i18, java.lang.String str, k80.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = this.f185226b;
        nw4.y2 y2Var = this.f185225a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185228d;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "authorize:fail", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            return;
        }
        if (gVar instanceof k80.g) {
            r45.h24 h24Var = (r45.h24) ((bl0.a) gVar).f21676d.f70711b.f70700a;
            r45.j14 j14Var = h24Var.f375773d;
            int i19 = j14Var.f377491d;
            java.lang.String str2 = j14Var.f377492e;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "NetSceneJSAuthorize jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 == -12000) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.j2(this, h24Var));
                return;
            }
            if (i19 == 0) {
                c1Var.i5(y2Var, "authorize:ok", null);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSAuthorize ERROR %s", str2);
                c1Var.i5(y2Var, "authorize:fail", null);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            }
        }
    }
}
