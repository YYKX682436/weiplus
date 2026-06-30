package fc3;

/* loaded from: classes5.dex */
public abstract class j {
    public static boolean a(android.content.Context context, com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel) {
        if (chatFooterPanel == null) {
            return false;
        }
        chatFooterPanel.h();
        if (chatFooterPanel.getVisibility() != 0) {
            return false;
        }
        chatFooterPanel.setVisibility(8);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477855dd);
        loadAnimation.setAnimationListener(new fc3.i(chatFooterPanel));
        chatFooterPanel.startAnimation(loadAnimation);
        return true;
    }

    public static void b(com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel) {
        chatFooterPanel.setShowSmiley(false);
        chatFooterPanel.setShowClose(true);
        chatFooterPanel.setSmileyPanelExpandableOnSimpleMode(true);
        chatFooterPanel.p(true, true);
        chatFooterPanel.setShowSearch(true);
    }

    public static void c(java.lang.String str, android.view.ViewGroup viewGroup, com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel, int i17, qk.u9 u9Var) {
        chatFooterPanel.setToSendText(str);
        chatFooterPanel.setEntranceScene(i17);
        chatFooterPanel.setVisibility(0);
        chatFooterPanel.i();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(viewGroup.getContext()));
        layoutParams.gravity = 80;
        viewGroup.removeAllViews();
        viewGroup.addView(chatFooterPanel, layoutParams);
        qk.v9 d17 = qk.w9.d();
        d17.f364351a = u9Var;
        chatFooterPanel.setCallback(d17);
    }
}
