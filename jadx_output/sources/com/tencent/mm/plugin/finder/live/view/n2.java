package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class n2 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView f116496d;

    public n2(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView) {
        this.f116496d = finderLiveCameraOptBeautyPowerfulDetailsView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        yz5.p onSeekChanging;
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = this.f116496d;
        qs5.c selectedEffect = finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect();
        int c17 = finderLiveCameraOptBeautyPowerfulDetailsView.c(i17, selectedEffect != null ? selectedEffect.f366425c : false, seekBar != null ? seekBar.getMax() : 0);
        qs5.c selectedEffect2 = finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect();
        if (selectedEffect2 != null && (onSeekChanging = finderLiveCameraOptBeautyPowerfulDetailsView.getOnSeekChanging()) != null) {
            if (!z17) {
                onSeekChanging = null;
            }
            if (onSeekChanging != null) {
                onSeekChanging.invoke(java.lang.Integer.valueOf(selectedEffect2.f366423a), java.lang.Integer.valueOf(c17));
            }
        }
        finderLiveCameraOptBeautyPowerfulDetailsView.setAndMoveSeekValueText(i17);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        yz5.p onSeekDone;
        int i17 = 0;
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = this.f116496d;
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            qs5.c selectedEffect = finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect();
            i17 = finderLiveCameraOptBeautyPowerfulDetailsView.c(progress, selectedEffect != null ? selectedEffect.f366425c : false, seekBar.getMax());
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#onStopTrackingTouch progress=" + i17);
        qs5.c selectedEffect2 = finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect();
        if (selectedEffect2 == null || (onSeekDone = finderLiveCameraOptBeautyPowerfulDetailsView.getOnSeekDone()) == null) {
            return;
        }
        onSeekDone.invoke(java.lang.Integer.valueOf(selectedEffect2.f366423a), java.lang.Integer.valueOf(i17));
    }
}
