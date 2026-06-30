package ev0;

/* loaded from: classes9.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.music.MusicPickerVolumePanel f256889d;

    public z(com.tencent.mm.mj_publisher.finder.movie_composing.music.MusicPickerVolumePanel musicPickerVolumePanel) {
        this.f256889d = musicPickerVolumePanel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.mj_publisher.finder.movie_composing.music.MusicPickerVolumePanel musicPickerVolumePanel = this.f256889d;
        android.view.ViewParent parent = musicPickerVolumePanel.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(musicPickerVolumePanel);
        }
    }
}
