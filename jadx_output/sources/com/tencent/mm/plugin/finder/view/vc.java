package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class vc {
    public vc(kotlin.jvm.internal.i iVar) {
    }

    public static com.tencent.mm.plugin.finder.view.FinderLikeDrawer a(com.tencent.mm.plugin.finder.view.vc vcVar, final android.content.Context context, android.view.Window window, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        boolean z19 = (i18 & 8) != 0 ? false : z17;
        boolean z27 = (i18 & 16) != 0 ? false : z18;
        vcVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(window, "window");
        com.tencent.mars.xlog.Log.i("Finder.FinderLikeDrawer", "createDrawerToAttachWindow ");
        final com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = new com.tencent.mm.plugin.finder.view.FinderLikeDrawer(context);
        finderLikeDrawer.setScene(i17);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y9).getValue()).r()).intValue() == 1) {
            finderLikeDrawer.setChangeBackgroundAlpha(false);
            finderLikeDrawer.setBackgroundColorRes(com.tencent.mm.R.color.a9e);
        }
        float a17 = 1 - kx2.a.f313278a.a(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        boolean z28 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z28) {
            if (i27 >= i19) {
                i19 = i27;
            }
            i27 = i19;
        }
        finderLikeDrawer.setTopOffset((int) (i27 * a17));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        yw2.n nVar = i17 == 1 ? new yw2.n(new com.tencent.mm.plugin.finder.feed.jb(context, z27)) : i17 == 2 ? new yw2.n(new com.tencent.mm.plugin.finder.feed.id(context, z27)) : i17 == 3 ? new yw2.n(new com.tencent.mm.plugin.finder.feed.d7(context)) : i17 == 4 ? new yw2.n(new com.tencent.mm.plugin.finder.feed.mh(context)) : new yw2.n(new com.tencent.mm.plugin.finder.feed.id(context, z27));
        h0Var.f310123d = nVar;
        android.content.Context context2 = finderLikeDrawer.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        nVar.f466659o = context2;
        com.tencent.mm.plugin.finder.feed.w20 w20Var = nVar.f466651d;
        int scene = w20Var.getScene();
        if (scene == 1) {
            finderLikeDrawer.setId(com.tencent.mm.R.id.edz);
        } else if (scene == 2) {
            finderLikeDrawer.setId(com.tencent.mm.R.id.edo);
        } else if (scene == 3) {
            finderLikeDrawer.setId(com.tencent.mm.R.id.tci);
        } else if (scene == 4) {
            finderLikeDrawer.setId(com.tencent.mm.R.id.tk9);
        }
        nVar.f466654g = finderLikeDrawer;
        finderLikeDrawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481599xo);
        finderLikeDrawer.setEnableClickBackgroundToCloseDrawer(true);
        finderLikeDrawer.h(nVar);
        if (w20Var.getScene() == 2) {
            com.tencent.mm.plugin.finder.report.d2.f124994a.n(finderLikeDrawer, "profile_feed_like_tabulation_half_screen", (r20 & 4) != 0 ? 40 : 128, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.e(new jz5.l("like_panel", 1)), (r20 & 128) != 0 ? null : new yw2.a(new yw2.l(nVar), new yw2.k(nVar)));
        }
        finderLikeDrawer.setBuilder((yw2.n) h0Var.f310123d);
        final com.tencent.mm.plugin.finder.view.uc ucVar = new com.tencent.mm.plugin.finder.view.uc(context, layoutParams, window, finderLikeDrawer, h0Var);
        if (z19) {
            ucVar.invoke();
        } else {
            window.getDecorView().post(new java.lang.Runnable(ucVar) { // from class: com.tencent.mm.plugin.finder.view.wc

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f133290d;

                {
                    kotlin.jvm.internal.o.g(ucVar, "function");
                    this.f133290d = ucVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f133290d.invoke();
                }
            });
        }
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.MMFragmentActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.FinderLikeDrawer$Companion$createDrawerToAttachWindow$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    com.tencent.mm.plugin.finder.view.FinderLikeDrawer.this.b();
                    ((com.tencent.mm.ui.MMFragmentActivity) context).mo133getLifecycle().c(this);
                }
            });
        }
        return finderLikeDrawer;
    }
}
