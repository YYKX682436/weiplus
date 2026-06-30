package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class qf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f129737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f129738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f129739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, long j17, long j18, r45.mb4 mb4Var) {
        super(0);
        this.f129736d = finderSelectCoverUI;
        this.f129737e = j17;
        this.f129738f = j18;
        this.f129739g = mb4Var;
    }

    public static final int a(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        android.widget.SeekBar seekBar = finderSelectCoverUI.F;
        if (seekBar == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        int width = seekBar.getWidth();
        android.widget.SeekBar seekBar2 = finderSelectCoverUI.F;
        if (seekBar2 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        int paddingLeft = width - seekBar2.getPaddingLeft();
        android.widget.SeekBar seekBar3 = finderSelectCoverUI.F;
        if (seekBar3 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        int paddingRight = paddingLeft - seekBar3.getPaddingRight();
        if (paddingRight < 1) {
            return 1;
        }
        return paddingRight;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rm5.k kVar;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129736d;
        android.widget.SeekBar seekBar = finderSelectCoverUI.F;
        if (seekBar == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        seekBar.setEnabled(true);
        android.view.View view = finderSelectCoverUI.G;
        if (view == null) {
            kotlin.jvm.internal.o.o("selectBtn");
            throw null;
        }
        view.setEnabled(true);
        android.view.View view2 = finderSelectCoverUI.N;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("previewBtn");
            throw null;
        }
        view2.setEnabled(true);
        r45.mb4 mb4Var = this.f129739g;
        long j17 = this.f129738f;
        com.tencent.mm.plugin.finder.ui.pf pfVar = new com.tencent.mm.plugin.finder.ui.pf(finderSelectCoverUI, mb4Var, j17);
        android.widget.SeekBar seekBar2 = finderSelectCoverUI.F;
        if (seekBar2 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        seekBar2.setOnSeekBarChangeListener(pfVar);
        finderSelectCoverUI.f128673d2 = android.view.ViewConfiguration.get(finderSelectCoverUI).getScaledTouchSlop();
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        android.widget.SeekBar seekBar3 = finderSelectCoverUI.F;
        if (seekBar3 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        seekBar3.setOnTouchListener(new com.tencent.mm.plugin.finder.ui.lf(e0Var, finderSelectCoverUI, this.f129738f, pfVar));
        cw2.aa i76 = finderSelectCoverUI.i7();
        if (i76 != null) {
            i76.seekTo(0L);
        }
        long j18 = this.f129737e;
        if (j18 > 0) {
            if (finderSelectCoverUI.F == null) {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
            long max = (r0.getMax() * j18) / j17;
            android.widget.SeekBar seekBar4 = finderSelectCoverUI.F;
            if (seekBar4 == null) {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
            seekBar4.setProgress((int) max);
        }
        if (!hc2.l0.c(mb4Var) && (kVar = finderSelectCoverUI.U) != null) {
            kVar.a(kz5.b0.c(0L), new com.tencent.mm.plugin.finder.ui.mf(finderSelectCoverUI, mb4Var));
        }
        return jz5.f0.f302826a;
    }
}
