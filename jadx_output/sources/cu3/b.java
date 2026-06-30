package cu3;

/* loaded from: classes8.dex */
public final class b implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin f222464d;

    public b(com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin) {
        this.f222464d = photoFilterPlugin;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin = this.f222464d;
        photoFilterPlugin.getTAG();
        android.widget.TextView progressDescTv = photoFilterPlugin.getProgressDescTv();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('%');
        progressDescTv.setText(sb6.toString());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin = this.f222464d;
        int lastSelectedIndex = photoFilterPlugin.getLastSelectedIndex();
        kotlin.jvm.internal.o.d(seekBar);
        com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin.a(photoFilterPlugin, lastSelectedIndex, seekBar.getProgress() / 100.0f);
    }
}
