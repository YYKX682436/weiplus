package wm2;

/* loaded from: classes14.dex */
public final class b implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider f447232d;

    public b(com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider finderLiveBeautySlider) {
        this.f447232d = finderLiveBeautySlider;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.beauty.FinderLiveBeautySlider finderLiveBeautySlider = this.f447232d;
        double d17 = e06.p.d(finderLiveBeautySlider.getValue(), finderLiveBeautySlider.getMinimum(), finderLiveBeautySlider.getMaximum());
        finderLiveBeautySlider.B(d17, (d17 - finderLiveBeautySlider.getMinimum()) / (finderLiveBeautySlider.getMaximum() - finderLiveBeautySlider.getMinimum()));
        java.lang.Object obj = finderLiveBeautySlider.f117874y;
        if ((obj instanceof android.os.Vibrator ? (android.os.Vibrator) obj : null) != null && java.lang.Math.abs(d17 - finderLiveBeautySlider.getDefault()) < 0.005d) {
            ((android.os.Vibrator) finderLiveBeautySlider.f117874y).vibrate(10L);
        }
        yz5.l valueChangedHandler = finderLiveBeautySlider.getValueChangedHandler();
        if (valueChangedHandler != null) {
            valueChangedHandler.invoke(java.lang.Double.valueOf(d17));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
