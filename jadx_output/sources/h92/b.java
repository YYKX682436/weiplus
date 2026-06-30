package h92;

/* loaded from: classes2.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer a(android.content.Context context, android.view.Window window, h92.a builder) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(window, "window");
        kotlin.jvm.internal.o.g(builder, "builder");
        com.tencent.mars.xlog.Log.i("Finder.FinderAccountSwitchDrawer", "createDrawerToAttachWindow ");
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer drawer = builder.k(context);
        h92.d dVar = (h92.d) builder;
        kotlin.jvm.internal.o.g(drawer, "drawer");
        kotlin.jvm.internal.o.f(drawer.getContext(), "getContext(...)");
        dVar.f279689d = drawer;
        drawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481510v6);
        drawer.setEnableClickBackgroundToCloseDrawer(true);
        drawer.h(dVar);
        int g17 = com.tencent.mm.ui.bl.g(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        com.tencent.mars.xlog.Log.i("Finder.FinderAccountSwitchDrawer", "[initView] bottomMargin= " + g17);
        android.view.View decorView = window.getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) decorView).addView(drawer, layoutParams);
        builder.g(context, drawer.getHeaderLayout());
        builder.h(context, drawer.getCenterLayout());
        android.widget.FrameLayout loadingLayout = drawer.getLoadingLayout();
        kotlin.jvm.internal.o.g(loadingLayout, "loadingLayout");
        loadingLayout.setVisibility(8);
        builder.l(context, drawer.getFooterLayout());
        return drawer;
    }
}
