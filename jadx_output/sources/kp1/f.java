package kp1;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView f310898d;

    public f(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView) {
        this.f310898d = audioPanelTaskBarBaseView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView recentDescTextView = this.f310898d.getRecentDescTextView();
        if (recentDescTextView == null) {
            return;
        }
        recentDescTextView.setSelected(true);
    }
}
