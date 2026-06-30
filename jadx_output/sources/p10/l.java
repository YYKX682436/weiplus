package p10;

/* loaded from: classes8.dex */
public final class l implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350967d;

    public l(int i17, com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f350967d = magicDebugPanelView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            i17 += 100;
        }
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f350967d;
        magicDebugPanelView.f65828u = i17;
        android.widget.TextView textView = magicDebugPanelView.f65823p;
        if (textView == null) {
            kotlin.jvm.internal.o.o("swipeSpeedLabel");
            throw null;
        }
        textView.setText("Speed: " + i17 + " px/s");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
