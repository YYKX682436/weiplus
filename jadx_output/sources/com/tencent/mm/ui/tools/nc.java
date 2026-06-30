package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class nc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210608d;

    public nc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210608d = showVideoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210608d;
        showVideoUI.H = false;
        boolean z17 = showVideoUI.F;
        if (z17) {
            if (z17) {
                android.view.View findViewById = showVideoUI.findViewById(com.tencent.mm.R.id.ght);
                android.view.View findViewById2 = showVideoUI.findViewById(com.tencent.mm.R.id.v5i);
                findViewById2.setBackgroundColor(showVideoUI.getResources().getColor(com.tencent.mm.R.color.f478712f3));
                android.widget.RelativeLayout relativeLayout = showVideoUI.f210218J;
                if (relativeLayout != null) {
                    oa5.b.b(showVideoUI.f210218J).k(new com.tencent.mm.ui.tools.hc(showVideoUI, relativeLayout.getHeight(), findViewById)).o(new com.tencent.mm.ui.tools.gc(showVideoUI, findViewById, findViewById2)).g(150L).l();
                }
                com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation = showVideoUI.B;
                if (redesignVideoPlayerSeekBarWithAnimation != null) {
                    redesignVideoPlayerSeekBarWithAnimation.setVisibility(8);
                    showVideoUI.T6();
                }
            }
            showVideoUI.Y6(false);
            return;
        }
        if (!z17) {
            android.view.View findViewById3 = showVideoUI.findViewById(com.tencent.mm.R.id.ght);
            showVideoUI.setNavigationbarColor(showVideoUI.getResources().getColor(com.tencent.mm.R.color.f478491c));
            showVideoUI.findViewById(com.tencent.mm.R.id.v5i).setBackgroundColor(showVideoUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
            android.widget.RelativeLayout relativeLayout2 = showVideoUI.f210218J;
            if (relativeLayout2 != null) {
                oa5.b.b(showVideoUI.f210218J).k(new com.tencent.mm.ui.tools.ec(showVideoUI, relativeLayout2.getHeight(), findViewById3)).o(new com.tencent.mm.ui.tools.dc(showVideoUI, findViewById3)).g(150L).l();
            }
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation2 = showVideoUI.B;
            if (redesignVideoPlayerSeekBarWithAnimation2 != null) {
                redesignVideoPlayerSeekBarWithAnimation2.setVisibility(0);
                showVideoUI.T6();
            }
        }
        showVideoUI.Y6(true);
    }
}
