package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public abstract class t {
    public static final void a(android.content.Context context, java.lang.String url, xc2.p0 infoEx, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar, oy2.p scConfig, int i17, java.lang.String str, java.util.Map map) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(scConfig, "scConfig");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.di diVar = (com.tencent.mm.plugin.finder.viewmodel.component.di) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.di.class);
        diVar.getClass();
        if (com.tencent.mm.plugin.finder.webview.l0.f136880n) {
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ci ciVar = new com.tencent.mm.plugin.finder.viewmodel.component.ci(context, infoEx);
        oy2.l lVar = new oy2.l(context, scConfig);
        lVar.setListener(aVar);
        com.tencent.mm.plugin.finder.webview.l0 l0Var = new com.tencent.mm.plugin.finder.webview.l0(context, url, lVar, i17, str, scConfig, map);
        l0Var.f136890j = ciVar;
        l0Var.f136887g = false;
        com.tencent.mm.plugin.finder.viewmodel.component.bi biVar = new com.tencent.mm.plugin.finder.viewmodel.component.bi(context, infoEx);
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout = l0Var.f136891k.f349947l;
        com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout expandableScrollFrameLayout = scrollFrameLayout instanceof com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout ? (com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) scrollFrameLayout : null;
        if (expandableScrollFrameLayout != null) {
            expandableScrollFrameLayout.setScrollToTopListener(biVar);
        }
        l0Var.c();
        diVar.f134143d = l0Var;
    }
}
