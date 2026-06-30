package wl3;

/* loaded from: classes5.dex */
public final class s implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MusicPlayerSeekBar f447080d;

    public s(com.tencent.mm.plugin.music.ui.view.MusicPlayerSeekBar musicPlayerSeekBar) {
        this.f447080d = musicPlayerSeekBar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f447080d.setSeeking(true);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.tencent.mm.plugin.music.ui.view.MusicPlayerSeekBar musicPlayerSeekBar = this.f447080d;
        musicPlayerSeekBar.setSeeking(false);
        musicPlayerSeekBar.getClass();
    }
}
