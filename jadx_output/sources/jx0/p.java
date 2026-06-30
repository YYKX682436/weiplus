package jx0;

/* loaded from: classes5.dex */
public final class p implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar f302389d;

    public p(com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar) {
        this.f302389d = mJTextSeekBar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        java.lang.String valueOf;
        float f17 = i17;
        int i18 = com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar.D;
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = this.f302389d;
        yz5.l lVar = mJTextSeekBar.customText;
        if (lVar == null || (valueOf = (java.lang.String) lVar.invoke(java.lang.Float.valueOf(f17))) == null) {
            valueOf = java.lang.String.valueOf((int) f17);
        }
        mJTextSeekBar.f69403w.setText(valueOf);
        if (z17) {
            mJTextSeekBar.A(f17);
        }
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = mJTextSeekBar.getOnSeekBarChangeListener();
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i17, z17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f302389d.getOnSeekBarChangeListener();
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f302389d.getOnSeekBarChangeListener();
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }
}
