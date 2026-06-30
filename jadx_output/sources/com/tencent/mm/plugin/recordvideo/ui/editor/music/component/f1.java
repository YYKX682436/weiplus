package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes2.dex */
public final class f1 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f156226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f156227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f156228f;

    public f1(android.widget.TextView textView, int i17, yz5.l lVar) {
        this.f156226d = textView;
        this.f156227e = i17;
        this.f156228f = lVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        this.f156226d.setText(java.lang.String.valueOf(i17));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicVolumeAdjustDialog", "onStopTrackingTouch: rowId=" + this.f156227e + " newValue=" + progress);
            this.f156228f.invoke(java.lang.Integer.valueOf(progress));
        }
    }
}
