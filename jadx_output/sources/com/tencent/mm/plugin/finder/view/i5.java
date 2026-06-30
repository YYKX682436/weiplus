package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class i5 {
    public i5(kotlin.jvm.internal.i iVar) {
    }

    public static com.tencent.mm.plugin.finder.view.FinderCommentDrawer a(com.tencent.mm.plugin.finder.view.i5 i5Var, com.tencent.mm.ui.MMFragmentActivity context, android.view.View parent, com.tencent.mm.plugin.finder.view.g5 g5Var, boolean z17, boolean z18, int i17, int i18, java.lang.Object obj) {
        int i19;
        com.tencent.mm.plugin.finder.view.g5 builder = (i18 & 4) != 0 ? new yw2.a0(new com.tencent.mm.plugin.finder.feed.a7(context)) : g5Var;
        boolean z19 = (i18 & 8) != 0 ? false : z17;
        int i27 = (i18 & 32) != 0 ? 58 : i17;
        i5Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(builder, "builder");
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = new com.tencent.mm.plugin.finder.view.FinderCommentDrawer(context);
        if (z18) {
            finderCommentDrawer.setTopOffset(com.tencent.mm.ui.bk.q(context));
            finderCommentDrawer.setBackgroundColorRes(com.tencent.mm.R.color.a9e);
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y9).getValue()).r()).intValue() == 1) {
            finderCommentDrawer.setChangeBackgroundAlpha(false);
            finderCommentDrawer.setBackgroundColorRes(com.tencent.mm.R.color.a9e);
        }
        float a17 = 1 - kx2.a.f313278a.a(context);
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i28 = b17.x;
        int i29 = b17.y;
        java.lang.System.nanoTime();
        boolean z27 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z27) {
            i19 = i29 - c17;
        } else {
            if (i29 >= i28) {
                i28 = i29;
            }
            i19 = i28 - c17;
        }
        finderCommentDrawer.setTopOffset((int) (i19 * a17));
        yw2.a0 a0Var = (yw2.a0) builder;
        android.content.Context context2 = finderCommentDrawer.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        a0Var.f466623v = context2;
        finderCommentDrawer.setId(com.tencent.mm.R.id.ean);
        a0Var.f466617p = finderCommentDrawer;
        finderCommentDrawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481599xo);
        finderCommentDrawer.setEnableClickBackgroundToCloseDrawer(true);
        finderCommentDrawer.h(a0Var);
        a0Var.C = new ux2.f(a0Var.l(), finderCommentDrawer.getRootView(), new yw2.t(a0Var), new yw2.u(a0Var), new yw2.v(a0Var));
        yw2.a0 a0Var2 = builder instanceof yw2.a0 ? (yw2.a0) builder : null;
        fs2.a aVar = a0Var2 != null ? a0Var2.f466608d : null;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = aVar instanceof com.tencent.mm.plugin.finder.feed.a7 ? (com.tencent.mm.plugin.finder.feed.a7) aVar : null;
        if (a7Var != null) {
            a7Var.f106208e = i27;
            a7Var.D = z19;
            finderCommentDrawer.setPresenter(a7Var);
        }
        new com.tencent.mm.plugin.finder.view.h5(context, parent, finderCommentDrawer, new android.widget.FrameLayout.LayoutParams(-1, -1), builder, z18).invoke();
        return finderCommentDrawer;
    }
}
