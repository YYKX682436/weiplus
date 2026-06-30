package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class p extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public p() {
        super(27);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        if (e0Var.f406657n.getBoolean("show_full_screen", false)) {
            g4Var.g(27, context.getString(com.tencent.mm.R.string.hrd), com.tencent.mm.R.raw.bottomsheet_icon_exit);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = e0Var.f182186t;
        if (!(y1Var != null ? y1Var.h() : false) && !((sd.u) e0Var.f406612f).f406653a.f(true)) {
            ((android.app.Activity) e0Var.f406610d).finish();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 11);
    }
}
