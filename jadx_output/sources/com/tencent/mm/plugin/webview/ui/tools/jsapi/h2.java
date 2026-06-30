package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public class h2 implements k80.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 f185158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f185159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185160d;

    public h2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var, int i17) {
        this.f185160d = c1Var;
        this.f185157a = y2Var;
        this.f185158b = e8Var;
        this.f185159c = i17;
    }

    @Override // k80.h
    public void a(int i17, int i18, java.lang.String str, k80.i iVar) {
        nw4.y2 y2Var = this.f185157a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185160d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = this.f185158b;
        if (i17 != 0 || i18 != 0) {
            c1Var.i5(y2Var, "authorize:fail", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            return;
        }
        if (iVar instanceof k80.i) {
            if (this.f185159c == 2) {
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
                return;
            }
            r45.j14 j14Var = ((r45.f24) ((bl0.b) iVar).f21679d.f70711b.f70700a).f373941d;
            int i19 = j14Var.f377491d;
            java.lang.String str2 = j14Var.f377492e;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "NetSceneJSAuthorizeConfirm jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 == 0) {
                c1Var.i5(y2Var, "authorize:ok", null);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSAuthorizeConfirm ERROR %s", str2);
                c1Var.i5(y2Var, "authorize:fail", null);
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
            }
        }
    }
}
