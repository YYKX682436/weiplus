package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class s extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public s() {
        super(28);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        g4Var.g(28, context.getString(com.tencent.mm.R.string.l5c), com.tencent.mm.R.raw.icons_outlined_refresh);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) e0Var;
        x0Var.f182180p.reload();
        com.tencent.mm.plugin.game.luggage.page.l lVar = x0Var.V1;
        if (lVar != null) {
            java.lang.String Z = lVar.Z(lVar.f139915o2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Z)) {
                ((java.util.concurrent.ConcurrentHashMap) lVar.f139911k2).remove(Z);
                lVar.X(Z, 1);
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 7);
    }
}
