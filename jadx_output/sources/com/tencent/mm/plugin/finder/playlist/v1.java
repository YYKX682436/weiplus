package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.w1 f122479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.finder.playlist.w1 w1Var) {
        super(0);
        this.f122479d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.playlist.w1 w1Var = this.f122479d;
        w1Var.f122482d = true;
        com.tencent.mm.plugin.finder.playlist.k kVar = com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer.G;
        androidx.appcompat.app.AppCompatActivity context = w1Var.getActivity();
        android.view.View decorView = w1Var.getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawer", "createDrawerToAttachWindow");
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = new com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer(context);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y9).getValue()).r()).intValue() == 1) {
            finderPlayListDrawer.setChangeBackgroundAlpha(false);
            finderPlayListDrawer.setBackgroundColorRes(com.tencent.mm.R.color.a9e);
        }
        float a17 = 1 - kx2.a.f313278a.a(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i18 >= i17) {
                i17 = i18;
            }
            i18 = i17;
        }
        finderPlayListDrawer.setTopOffset((int) (i18 * a17));
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = new com.tencent.mm.plugin.finder.playlist.l0(new com.tencent.mm.plugin.finder.playlist.s1(context));
        android.content.Context context2 = finderPlayListDrawer.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        l0Var.D = context2;
        finderPlayListDrawer.setId(com.tencent.mm.R.id.f484503eg0);
        l0Var.f122339e = finderPlayListDrawer;
        finderPlayListDrawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481599xo);
        finderPlayListDrawer.setEnableClickBackgroundToCloseDrawer(true);
        finderPlayListDrawer.h(l0Var);
        finderPlayListDrawer.setMPresenter(l0Var.f122338d);
        androidx.recyclerview.widget.RecyclerView recyclerView = finderPlayListDrawer.getCenterLayout().getRecyclerView();
        recyclerView.i(new com.tencent.mm.plugin.finder.playlist.f(finderPlayListDrawer));
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new com.tencent.mm.plugin.finder.playlist.g(finderPlayListDrawer));
        }
        com.tencent.mm.plugin.finder.playlist.s1 mPresenter = finderPlayListDrawer.getMPresenter();
        com.tencent.mm.plugin.finder.playlist.o0 o0Var = new com.tencent.mm.plugin.finder.playlist.o0(context, mPresenter != null && mPresenter.f122443w, null, 0, 12, null);
        o0Var.setClickListener(new com.tencent.mm.plugin.finder.playlist.i(finderPlayListDrawer));
        finderPlayListDrawer.C = o0Var;
        android.view.View realRootView = o0Var.getRealRootView();
        if (realRootView != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            layoutParams.bottomMargin = es.h.a(context, 66);
            ((com.tencent.mm.view.TouchableLayout) finderPlayListDrawer.getSquares().findViewById(com.tencent.mm.R.id.vgo)).addView(realRootView, layoutParams);
        }
        new com.tencent.mm.plugin.finder.playlist.h(context, new android.widget.FrameLayout.LayoutParams(-1, -1), decorView, finderPlayListDrawer, l0Var).invoke();
        return finderPlayListDrawer;
    }
}
