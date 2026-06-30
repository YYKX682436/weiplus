package dt2;

/* loaded from: classes3.dex */
public final class u implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar f243203d;

    public u(com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar) {
        this.f243203d = finderLiveReplaySeekbar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        android.os.Vibrator vibrator;
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f243203d;
        java.lang.String str = finderLiveReplaySeekbar.f124919d;
        if (finderLiveReplaySeekbar.isDragging) {
            gk2.e eVar = ws2.k1.f449066r.a().f449071c;
            float S6 = eVar != null ? ((ct2.j) eVar.a(ct2.j.class)).S6() : -1;
            int max = (int) ((finderLiveReplaySeekbar.f124931s / finderLiveReplaySeekbar.getMax()) * S6);
            int progress = (int) ((finderLiveReplaySeekbar.getProgress() / finderLiveReplaySeekbar.getMax()) * S6);
            java.util.Iterator it = ((java.util.ArrayList) finderLiveReplaySeekbar.fragmentItems).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                vibrator = finderLiveReplaySeekbar.f124930r;
                if (!hasNext) {
                    break;
                }
                int integer = ((dt2.v) it.next()).f243205b.getInteger(0);
                if (progress == integer || ((max < integer && progress > integer) || (max > integer && progress < integer))) {
                    vibrator.vibrate(50L);
                }
            }
            finderLiveReplaySeekbar.f124931s = finderLiveReplaySeekbar.getProgress();
            if (finderLiveReplaySeekbar.getProgress() == 0 || finderLiveReplaySeekbar.getProgress() == finderLiveReplaySeekbar.getMax()) {
                vibrator.vibrate(50L);
            }
        }
        java.util.Iterator it6 = finderLiveReplaySeekbar.f124928p.iterator();
        while (it6.hasNext()) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) it6.next()).onProgressChanged(seekBar, i17, z17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f243203d;
        finderLiveReplaySeekbar.setThumb(finderLiveReplaySeekbar.getContext().getDrawable(com.tencent.mm.R.drawable.axf));
        java.util.Iterator it = finderLiveReplaySeekbar.f124928p.iterator();
        while (it.hasNext()) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) it.next()).onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f243203d;
        finderLiveReplaySeekbar.setThumb(finderLiveReplaySeekbar.getContext().getDrawable(com.tencent.mm.R.drawable.f482193b92));
        java.util.Iterator it = finderLiveReplaySeekbar.f124928p.iterator();
        while (it.hasNext()) {
            ((android.widget.SeekBar.OnSeekBarChangeListener) it.next()).onStopTrackingTouch(seekBar);
        }
    }
}
