package kp1;

/* loaded from: classes11.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView f310891d;

    public d(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView) {
        this.f310891d = audioPanelTaskBarBaseView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView$initRecentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView.l(this.f310891d, false, false, 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView$initRecentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
