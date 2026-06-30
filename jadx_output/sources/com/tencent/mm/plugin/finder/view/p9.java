package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class p9 {
    public p9(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.finder.view.FinderFavDrawer a(final android.content.Context context, android.view.Window window, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(window, "window");
        com.tencent.mars.xlog.Log.i("Finder.FinderFavDrawer", "createDrawerToAttachWindow ");
        final com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer = new com.tencent.mm.plugin.finder.view.FinderFavDrawer(context);
        finderFavDrawer.setScene(i17);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y9).getValue()).r()).intValue() == 1) {
            finderFavDrawer.setChangeBackgroundAlpha(false);
            finderFavDrawer.setBackgroundColorRes(com.tencent.mm.R.color.a9e);
        }
        float a17 = 1 - kx2.a.f313278a.a(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i19 >= i18) {
                i18 = i19;
            }
            i19 = i18;
        }
        finderFavDrawer.setTopOffset((int) (i19 * a17));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (i17 == 0) {
            h0Var.f310123d = new yw2.f(new com.tencent.mm.plugin.finder.feed.f8(context));
        } else {
            h0Var.f310123d = new yw2.f(new com.tencent.mm.plugin.finder.feed.f8(context));
        }
        yw2.f fVar = (yw2.f) h0Var.f310123d;
        fVar.getClass();
        android.content.Context context2 = finderFavDrawer.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        fVar.f466641p = context2;
        ((com.tencent.mm.plugin.finder.feed.f8) fVar.f466632d).getClass();
        finderFavDrawer.setId(com.tencent.mm.R.id.edy);
        fVar.f466636h = finderFavDrawer;
        finderFavDrawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481599xo);
        finderFavDrawer.setEnableClickBackgroundToCloseDrawer(true);
        finderFavDrawer.h(fVar);
        com.tencent.mm.plugin.finder.report.d2.f124994a.n(finderFavDrawer, "profile_feed_like_tabulation_half_screen", (r20 & 4) != 0 ? 40 : 128, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.e(new jz5.l("like_panel", 2)), (r20 & 128) != 0 ? null : new yw2.a(new yw2.d(fVar), new yw2.c(fVar)));
        finderFavDrawer.setBuilder((yw2.f) h0Var.f310123d);
        window.getDecorView().post(new com.tencent.mm.plugin.finder.view.o9(context, layoutParams, window, finderFavDrawer, h0Var));
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.MMFragmentActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.FinderFavDrawer$Companion$createDrawerToAttachWindow$2
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    com.tencent.mm.plugin.finder.view.FinderFavDrawer.this.b();
                    ((com.tencent.mm.ui.MMFragmentActivity) context).mo133getLifecycle().c(this);
                }
            });
        }
        return finderFavDrawer;
    }
}
