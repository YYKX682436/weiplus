package kp1;

/* loaded from: classes11.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 f310882d;

    public a1(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5) {
        this.f310882d = audioPanelTaskBarViewV5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5$initRecentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView.l(this.f310882d, false, false, 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV5$initRecentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
