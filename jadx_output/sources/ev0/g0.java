package ev0;

/* loaded from: classes5.dex */
public final class g0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel f256846d;

    public g0(com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel) {
        this.f256846d = soundTrackPanel;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        yz5.l onOSTVolumeChangedListener = this.f256846d.getOnOSTVolumeChangedListener();
        if (onOSTVolumeChangedListener != null) {
            onOSTVolumeChangedListener.invoke(java.lang.Float.valueOf(i17 / 100.0f));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
