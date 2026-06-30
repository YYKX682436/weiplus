package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class ye implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f130061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f130062e;

    public ye(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, long j17) {
        this.f130061d = finderSelectCoverUI;
        this.f130062e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f130061d;
        long longExtra = finderSelectCoverUI.getIntent().getLongExtra("cover_time_ms", 0L);
        if (longExtra > 0) {
            if (finderSelectCoverUI.F == null) {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
            long max = (r3.getMax() * longExtra) / this.f130062e;
            android.widget.SeekBar seekBar = finderSelectCoverUI.F;
            if (seekBar != null) {
                seekBar.setProgress((int) max);
            } else {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
        }
    }
}
