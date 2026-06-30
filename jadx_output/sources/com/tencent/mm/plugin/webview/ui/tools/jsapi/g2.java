package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public class g2 implements k80.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 f185123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185124c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185125d;

    public g2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var, java.lang.String str) {
        this.f185125d = c1Var;
        this.f185122a = y2Var;
        this.f185123b = e8Var;
        this.f185124c = str;
    }

    @Override // k80.j
    public void a(int i17, int i18, java.lang.String str, k80.k kVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = this.f185123b;
        nw4.y2 y2Var = this.f185122a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185125d;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "login:fail", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            return;
        }
        if (kVar instanceof k80.k) {
            r45.l24 H = ((bl0.c) kVar).H();
            r45.j14 j14Var = H.f379086d;
            int i19 = j14Var.f377491d;
            java.lang.String str2 = j14Var.f377492e;
            java.lang.String str3 = H.f379095p;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "NetSceneJSLogin jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 == -12000) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.f2(this, H, str3));
                return;
            }
            if (i19 != 0) {
                c1Var.i5(y2Var, "login:fail", null);
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSLogin %s", str2);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            } else {
                java.lang.String str4 = H.f379087e;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("code", str4);
                c1Var.i5(y2Var, "login:ok", hashMap);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            }
        }
    }
}
