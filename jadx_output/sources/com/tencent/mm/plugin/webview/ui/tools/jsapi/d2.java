package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public class d2 implements k80.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 f185045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f185046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185047d;

    public d2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var, int i17) {
        this.f185047d = c1Var;
        this.f185044a = y2Var;
        this.f185045b = e8Var;
        this.f185046c = i17;
    }

    @Override // k80.l
    public void a(int i17, int i18, java.lang.String str, k80.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        nw4.y2 y2Var = this.f185044a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185047d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = this.f185045b;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "login:fail", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            return;
        }
        if (mVar instanceof k80.m) {
            if (this.f185046c == 2) {
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
                return;
            }
            r45.j24 H = ((bl0.d) mVar).H();
            r45.j14 j14Var = H.f377509d;
            int i19 = j14Var.f377491d;
            java.lang.String str2 = j14Var.f377492e;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "stev NetSceneJSLoginConfirm jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 != 0) {
                c1Var.i5(y2Var, "login:fail", null);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSLoginConfirm %s", str2);
            } else {
                java.lang.String str3 = H.f377510e;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("code", str3);
                c1Var.i5(y2Var, "login:ok", hashMap);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            }
        }
    }
}
