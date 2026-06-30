package kp1;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList f310943d;

    public v(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList) {
        this.f310943d = audioPanelTaskBarViewRecommendMusicList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f310943d.f92999s;
        if (textView != null) {
            textView.setSelected(true);
        } else {
            kotlin.jvm.internal.o.o("recommendDesc");
            throw null;
        }
    }
}
