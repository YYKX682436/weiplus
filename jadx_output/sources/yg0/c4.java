package yg0;

@j95.b
/* loaded from: classes.dex */
public final class c4 extends i95.w implements zg0.f3 {
    public int Ai(zg0.s3 params) {
        kotlin.jvm.internal.o.g(params, "params");
        android.content.Intent intent = params.f472781b;
        int hashCode = intent.hashCode();
        if (params.f472782c) {
            pf5.j0.a(intent, rx4.p2.class);
        } else if (params.f472784e) {
            pf5.j0.a(intent, rx4.r2.class);
        }
        intent.putExtra("key_halfscreen_id", hashCode);
        intent.putExtra("INTENT_KEY_HALFSCREEN_HEIGHT_RATIO", params.f472783d);
        intent.putExtra("INTENT_KEY_HALFSCREEN_ENABLE_DRAG", params.f472784e);
        intent.putExtra("INTENT_KEY_HALFSCREEN_TRANSPARENT_MASK", params.f472787h);
        if (params.f472784e) {
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            ok5.d.b(intent, "INTENT_KEY_HALFSCREEN_FULLSCREEN_LISTENER", new yg0.y3(params, c0Var, hashCode), new ok5.h());
            ok5.d.b(intent, "INTENT_KEY_HALFSCREEN_VISIBLE_LISTENER", new yg0.z3(new kotlin.jvm.internal.c0(), c0Var, params), new ok5.h());
            ok5.d.b(intent, "INTENT_KEY_HALFSCREEN_STATUS_LISTENER", new yg0.a4(hashCode), new ok5.h());
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = params.f472785f;
        if (aVar != null) {
            ok5.d.b(intent, "INTENT_KEY_HALFSCREEN_DRAWER_LISTENER", aVar, new ok5.h());
        }
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f20922a;
        android.content.Context context = params.f472780a;
        dVar.f20924a = context;
        cVar.c(false);
        cVar.e(true);
        dVar.f20927d.x(com.tencent.mm.ui.b4.a(context));
        dVar.f20925b = params.f472786g;
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI");
        } else {
            dVar.getClass();
            dVar.f20926c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI");
        }
        if (intent.getBooleanExtra("KHalfScreenSearchUseFlutter", false)) {
            cVar.a(com.tencent.mm.sdk.platformtools.x2.f193072b + ".plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
        }
        cVar.b(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.class);
        cVar.g();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        su4.r2.p(1000, false, true, 0);
        return hashCode;
    }

    public void Bi(android.content.Context context, android.content.Intent intent, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (!z17) {
            j45.l.z(context, intent, null);
            return;
        }
        pf5.j0.a(intent, rx4.q2.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f20922a;
        dVar.f20924a = context;
        cVar.e(true);
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
        } else {
            dVar.getClass();
            dVar.f20926c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI");
        }
        cVar.b(com.tencent.mm.ui.halfscreen.custom.WebSearchMoreHalfScreen.class);
        cVar.g();
    }

    public void Di(android.content.Context context, android.content.Intent intent, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (!z17) {
            j45.l.n(context, "webview", ".ui.tools.fts.MMFTSSearchTabWebViewUI", intent, i17);
            return;
        }
        pf5.j0.a(intent, rx4.q2.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f20922a;
        dVar.f20924a = context;
        cVar.e(true);
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
        } else {
            dVar.getClass();
            dVar.f20926c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI");
        }
        cVar.b(com.tencent.mm.ui.halfscreen.custom.WebSearchMoreHalfScreen.class);
        cVar.h(i17);
    }

    public void wi(android.content.Context context, android.content.Intent intent, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (!z17) {
            j45.l.y(context, intent);
            return;
        }
        boolean z19 = false;
        boolean booleanExtra = intent.getBooleanExtra("hideSearchTitle", false);
        if (z18) {
            pf5.j0.a(intent, rx4.q2.class);
        } else if (booleanExtra) {
            pf5.j0.a(intent, rx4.r2.class);
        } else {
            pf5.j0.a(intent, rx4.p2.class);
        }
        if (!z18 && j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchHalfScreenEnablePullDownClose()) == 1) {
            z19 = true;
        }
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        bh5.d dVar = cVar.f20922a;
        dVar.f20924a = context;
        cVar.c(z19);
        cVar.e(true);
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI");
        } else {
            dVar.getClass();
            dVar.f20926c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI");
        }
        if (z18) {
            cVar.b(com.tencent.mm.ui.halfscreen.custom.WebSearchMoreHalfScreen.class);
        } else {
            cVar.b(com.tencent.mm.ui.halfscreen.custom.WebSearchHomeHalfScreen.class);
        }
        cVar.g();
    }
}
