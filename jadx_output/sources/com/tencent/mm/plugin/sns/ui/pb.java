package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pb implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f170210e;

    public pb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, int i17) {
        this.f170210e = snsAdNativeLandingPagesUI;
        this.f170209d = i17;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = this.f170209d;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170210e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$21");
        try {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.Window window = snsAdNativeLandingPagesUI.getWindow();
            java.lang.String str = snsAdNativeLandingPagesUI.f166700d;
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int i47 = rect.top;
            com.tencent.mars.xlog.Log.i(str, "rect=" + rect.toString() + ", screenH=" + com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.c7(snsAdNativeLandingPagesUI) + ", cutH=" + i39 + ", statusBarH=" + i47 + ", isHalfScreen=" + com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.e7(snsAdNativeLandingPagesUI));
            if (i47 > 0) {
                if (i47 != i39) {
                    com.tencent.mars.xlog.Log.i(str, "cutH != statusBarH, reset height");
                    if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.e7(snsAdNativeLandingPagesUI)) {
                        android.view.View findViewById = snsAdNativeLandingPagesUI.findViewById(com.tencent.mm.R.id.gw6);
                        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById.getLayoutParams();
                        layoutParams.topMargin = i47;
                        findViewById.setLayoutParams(layoutParams);
                        com.tencent.mars.xlog.Log.i(str, "fixContentHeight, containerParams top margin is " + i47 + ", screenHeight is " + com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.c7(snsAdNativeLandingPagesUI));
                    } else {
                        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).getLayoutParams();
                        layoutParams2.height = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.c7(snsAdNativeLandingPagesUI) - i47;
                        layoutParams2.topMargin = i47;
                        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).setLayoutParams(layoutParams2);
                        com.tencent.mars.xlog.Log.i(str, "fixContentHeight, root height is " + layoutParams2.height + ", root top margin is " + i47 + ", screenHeight is " + com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.c7(snsAdNativeLandingPagesUI));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        androidx.lifecycle.j0 j0Var = snsAdNativeLandingPagesUI.H2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        j0Var.setValue(java.lang.Integer.valueOf(layoutParams2.height));
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    int i48 = snsAdNativeLandingPagesUI.P1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    sb6.append(i48);
                    sb6.append("|");
                    sb6.append(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.c7(snsAdNativeLandingPagesUI));
                    ca4.e0.a("cut_height_error", "", i39, i47, sb6.toString());
                }
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).removeOnLayoutChangeListener(this);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(snsAdNativeLandingPagesUI.f166700d, "onLayoutChange error:" + th6.toString());
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).removeOnLayoutChangeListener(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$21");
    }
}
