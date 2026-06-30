package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class vf implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.wf f211155d;

    public vf(com.tencent.mm.ui.wf wfVar) {
        this.f211155d = wfVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            return windowInsets;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "OnApplyWindowInsetsListener %s", windowInsets);
        windowInsets.consumeSystemWindowInsets();
        com.tencent.mm.ui.wf wfVar = this.f211155d;
        com.tencent.mm.ui.n8 n8Var = wfVar.f211234g.f197015b;
        windowInsets.getSystemWindowInsetTop();
        android.graphics.Rect rect = new android.graphics.Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        ((com.tencent.mm.ui.HomeUI) n8Var).getClass();
        com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = wfVar.f211232e;
        fitSystemWindowLayoutView.setActionBarContainer(wfVar.f211233f);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
        return windowInsets;
    }
}
