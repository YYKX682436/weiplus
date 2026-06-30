package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class pf implements android.widget.SeekBar.OnSeekBarChangeListener, com.tencent.mm.plugin.finder.ui.ud {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f129635d;

    /* renamed from: g, reason: collision with root package name */
    public long f129638g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f129639h;

    /* renamed from: m, reason: collision with root package name */
    public long f129641m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129642n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f129643o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f129644p;

    /* renamed from: e, reason: collision with root package name */
    public long f129636e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f129637f = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f129640i = Long.MIN_VALUE;

    public pf(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, r45.mb4 mb4Var, long j17) {
        this.f129642n = finderSelectCoverUI;
        this.f129643o = mb4Var;
        this.f129644p = j17;
        this.f129635d = new com.tencent.mm.plugin.finder.ui.of(finderSelectCoverUI, mb4Var);
    }

    public final void a(long j17, r45.mb4 mb4Var) {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129642n;
        cw2.aa i76 = finderSelectCoverUI.i7();
        if (i76 != null) {
            i76.seekTo(j17);
        }
        this.f129637f = j17;
        this.f129638g = java.lang.System.currentTimeMillis();
        if (hc2.l0.c(mb4Var)) {
            return;
        }
        long j18 = this.f129636e;
        if (j18 < 0 || java.lang.Math.abs(j17 - j18) >= 80) {
            rm5.k kVar = finderSelectCoverUI.U;
            if (kVar != null) {
                kVar.b(this.f129636e);
            }
            rm5.k kVar2 = finderSelectCoverUI.U;
            if (kVar2 != null) {
                kVar2.a(kz5.b0.c(java.lang.Long.valueOf(j17)), this.f129635d);
            }
            this.f129636e = j17;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129642n;
        android.widget.SeekBar seekBar2 = finderSelectCoverUI.F;
        if (seekBar2 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        int max = seekBar2.getMax();
        long h17 = max > 0 ? e06.p.h(finderSelectCoverUI.S1 + ((i17 * finderSelectCoverUI.U1) / max), 0L, this.f129644p) : 0L;
        if (finderSelectCoverUI.V1) {
            return;
        }
        if (z17) {
            long j17 = h17 / 200;
            if (j17 != this.f129640i) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - this.f129641m >= 40) {
                    this.f129640i = j17;
                    this.f129641m = currentTimeMillis;
                    android.widget.SeekBar seekBar3 = finderSelectCoverUI.F;
                    if (seekBar3 == null) {
                        kotlin.jvm.internal.o.o("seekBar");
                        throw null;
                    }
                    hc2.f1.x(seekBar3);
                }
            }
        }
        long j18 = this.f129637f;
        if (j18 < 0 || java.lang.Math.abs(h17 - j18) >= 16) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j19 = currentTimeMillis2 - this.f129638g;
            r45.mb4 mb4Var = this.f129643o;
            if (j19 >= 30) {
                java.lang.Runnable runnable = this.f129639h;
                if (runnable != null && seekBar != null) {
                    seekBar.removeCallbacks(runnable);
                }
                this.f129639h = null;
                a(h17, mb4Var);
                return;
            }
            java.lang.Runnable runnable2 = this.f129639h;
            if (runnable2 != null && seekBar != null) {
                seekBar.removeCallbacks(runnable2);
            }
            com.tencent.mm.plugin.finder.ui.nf nfVar = new com.tencent.mm.plugin.finder.ui.nf(this, h17, mb4Var);
            this.f129639h = nfVar;
            if (seekBar != null) {
                seekBar.postDelayed(nfVar, 30 - (currentTimeMillis2 - this.f129638g));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        this.f129641m = java.lang.System.currentTimeMillis();
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        this.f129642n.A7(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        if (seekBar != null) {
            int max = seekBar.getMax();
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129642n;
            long h17 = max > 0 ? e06.p.h(finderSelectCoverUI.S1 + ((seekBar.getProgress() * finderSelectCoverUI.U1) / max), 0L, this.f129644p) : 0L;
            java.lang.Runnable runnable = this.f129639h;
            if (runnable != null) {
                seekBar.removeCallbacks(runnable);
            }
            this.f129639h = null;
            a(h17, this.f129643o);
            this.f129640i = Long.MIN_VALUE;
            if (finderSelectCoverUI.R1) {
                return;
            }
            finderSelectCoverUI.A7(true);
        }
    }
}
