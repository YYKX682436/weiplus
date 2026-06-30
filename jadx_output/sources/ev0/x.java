package ev0;

/* loaded from: classes9.dex */
public final class x implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.music.MusicPickerVolumePanel f256887d;

    public x(com.tencent.mm.mj_publisher.finder.movie_composing.music.MusicPickerVolumePanel musicPickerVolumePanel) {
        this.f256887d = musicPickerVolumePanel;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        yz5.l onMusicVolumeChangedListener = this.f256887d.getOnMusicVolumeChangedListener();
        if (onMusicVolumeChangedListener != null) {
            onMusicVolumeChangedListener.invoke(java.lang.Float.valueOf(i17 / 100.0f));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
