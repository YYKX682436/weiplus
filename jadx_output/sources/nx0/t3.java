package nx0;

/* loaded from: classes5.dex */
public final class t3 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView f341230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.p3 f341231e;

    public t3(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBarWithValueView, nx0.p3 p3Var) {
        this.f341230d = seekBarWithValueView;
        this.f341231e = p3Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        this.f341230d.setValueChangeWithProgress(i17);
        this.f341231e.onProgressChanged(seekBar, i17, z17);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f341231e.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        this.f341231e.getClass();
    }
}
