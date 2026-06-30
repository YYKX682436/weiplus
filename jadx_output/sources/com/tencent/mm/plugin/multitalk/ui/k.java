package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f150290d;

    public k(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI) {
        this.f150290d = multiTalkMainUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f150290d;
        int c17 = com.tencent.mm.ui.bl.f(multiTalkMainUI.getContext()) ? com.tencent.mm.ui.bl.c(multiTalkMainUI.getContext()) : 0;
        com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = multiTalkMainUI.f150229e.H;
        if (collapseView != null && collapseView.findViewById(com.tencent.mm.R.id.m7i) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "applyBottomMarin %s", java.lang.Integer.valueOf(c17));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) collapseView.findViewById(com.tencent.mm.R.id.m7i).getLayoutParams();
            layoutParams.bottomMargin = c17;
            collapseView.findViewById(com.tencent.mm.R.id.m7i).setLayoutParams(layoutParams);
        }
        sj3.g3 g3Var = multiTalkMainUI.f150231g;
        if (g3Var.f408541v) {
            sj3.a1 e17 = g3Var.e();
            e17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "updateNavigationBarHeight() called with: height = " + c17);
            e17.f408410x = c17;
            e17.h(e17.f408405s, false);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MT.MultiTalkNewTalkingUILogic", "updateNavigationBarHeight: view not showing, do not update");
        }
        multiTalkMainUI.T6().getViewTreeObserver().removeOnGlobalLayoutListener(multiTalkMainUI.f150240s);
    }
}
