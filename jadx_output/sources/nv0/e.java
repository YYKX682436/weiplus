package nv0;

/* loaded from: classes5.dex */
public interface e {
    static boolean a(nv0.e eVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k panelUIC, java.util.Map map, zw0.e eVar2, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m mVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o oVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPanel");
        }
        java.util.Map map2 = (i17 & 2) != 0 ? null : map;
        zw0.e panelEntrance = (i17 & 4) != 0 ? new zw0.e(zw0.b.f476551e, zw0.d.f476561f) : eVar2;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m mVar2 = (i17 & 8) != 0 ? null : mVar;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o oVar2 = (i17 & 16) != 0 ? null : oVar;
        boolean z18 = (i17 & 32) != 0 ? true : z17;
        nv0.b bVar = (nv0.b) eVar;
        bVar.getClass();
        kotlin.jvm.internal.o.g(panelUIC, "panelUIC");
        kotlin.jvm.internal.o.g(panelEntrance, "panelEntrance");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = panelUIC.f69240i;
        if (baseComposingPanel == null) {
            baseComposingPanel = panelUIC.Y6();
            panelUIC.f69240i = baseComposingPanel;
        }
        if (map2 != null) {
            baseComposingPanel.setArguments(map2);
        }
        android.widget.FrameLayout frameLayout = panelUIC.f243347d;
        if (frameLayout != null) {
            return bVar.d(baseComposingPanel, frameLayout, panelEntrance, mVar2, oVar2, panelUIC, z18);
        }
        kotlin.jvm.internal.o.o("movieComposingPanelContainer");
        throw null;
    }

    static boolean b(nv0.e eVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel panel, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePanel");
        }
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        boolean z27 = (i17 & 4) != 0 ? true : z18;
        nv0.b bVar = (nv0.b) eVar;
        bVar.getClass();
        kotlin.jvm.internal.o.g(panel, "panel");
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closePanel: ----> stack ");
        kz5.q qVar = bVar.f340424a;
        sb6.append(qVar.f314000f);
        com.tencent.mars.xlog.Log.i("DefaultPanelNavigation", sb6.toString());
        if (!qVar.isEmpty()) {
            if (!qVar.contains(panel)) {
                kz5.n0.g0(bVar.f340424a, null, null, null, 0, null, nv0.a.f340423d, 31, null);
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else if (panel.getF69205e() != com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69247i) {
                com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p f69205e = panel.getF69205e();
                com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p pVar = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69245g;
                if (f69205e == pVar) {
                    panel.animate().cancel();
                    panel.f69212o.animate().cancel();
                    panel.clearAnimation();
                    if (panel.getF69205e() == pVar) {
                        panel.A(false, true, new zw0.e(panel.getEntrance(), panel.getPanelLevel()));
                    }
                }
                if (panel.getF69205e() == com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.p.f69246h) {
                    boolean z28 = true;
                    while (z28) {
                        z28 = ((nv0.b) panel.getChildPanelNavigation()).e(false);
                    }
                    com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.f(panel, z19, z27, null, 4, null);
                    qVar.remove(panel);
                    return true;
                }
                java.util.Objects.toString(panel.getF69205e());
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
        }
        return false;
    }

    static /* synthetic */ boolean c(nv0.e eVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popupPanel");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return ((nv0.b) eVar).e(z17);
    }
}
