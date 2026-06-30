package fc3;

/* loaded from: classes5.dex */
public class i implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ChatFooterPanel f261049a;

    public i(com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel) {
        this.f261049a = chatFooterPanel;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f261049a;
        if (chatFooterPanel != null) {
            chatFooterPanel.h();
            chatFooterPanel.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f261049a;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(0);
        }
    }
}
