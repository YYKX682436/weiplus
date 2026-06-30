package cw2;

/* loaded from: classes10.dex */
public final class y7 implements vm5.a {

    /* renamed from: d, reason: collision with root package name */
    public long f224122d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView f224123e;

    public y7(com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView finderVLogCompositionPlayView) {
        this.f224123e = finderVLogCompositionPlayView;
    }

    @Override // vm5.a
    public void a(long j17) {
        long playStart;
        long playStart2;
        com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f224123e;
        cw2.fb lifecycle = finderVLogCompositionPlayView.getLifecycle();
        if (lifecycle != null) {
            r45.mb4 mb4Var = finderVLogCompositionPlayView.B;
            playStart2 = finderVLogCompositionPlayView.getPlayStart();
            lifecycle.v(mb4Var, j17 - playStart2, finderVLogCompositionPlayView.getVideoDurationMs());
        }
        long j18 = this.f224122d;
        if (j18 == -1 || j17 - j18 > 1000 || j17 < j18) {
            cw2.fb lifecycle2 = finderVLogCompositionPlayView.getLifecycle();
            if (lifecycle2 != null) {
                r45.mb4 mb4Var2 = finderVLogCompositionPlayView.B;
                playStart = finderVLogCompositionPlayView.getPlayStart();
                cw2.fb.w(lifecycle2, mb4Var2, (int) ((j17 - playStart) / 1000), finderVLogCompositionPlayView.getVideoDuration(), null, 8, null);
            }
            this.f224122d = j17;
        }
        if (finderVLogCompositionPlayView.getVideoDurationMs() <= 0 || j17 <= 0 || finderVLogCompositionPlayView.getVideoDurationMs() - j17 > 500 || finderVLogCompositionPlayView.D || !finderVLogCompositionPlayView.f213291n) {
            return;
        }
        cw2.fb lifecycle3 = finderVLogCompositionPlayView.getLifecycle();
        if (lifecycle3 != null) {
            lifecycle3.F(finderVLogCompositionPlayView.B);
        }
        finderVLogCompositionPlayView.D = true;
    }

    @Override // vm5.a
    public void e() {
        com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f224123e;
        com.tencent.mm.pluginsdk.ui.b1 b1Var = finderVLogCompositionPlayView.f130687y;
        if (b1Var != null) {
            b1Var.N(finderVLogCompositionPlayView.f130688z, finderVLogCompositionPlayView.A, "", -1, -1);
        }
    }

    @Override // vm5.a
    public void g() {
        com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f224123e;
        com.tencent.mm.pluginsdk.ui.b1 b1Var = finderVLogCompositionPlayView.f130687y;
        if (b1Var != null) {
            b1Var.E(finderVLogCompositionPlayView.f130688z, finderVLogCompositionPlayView.A);
        }
    }

    @Override // vm5.a
    public void i() {
    }

    @Override // vm5.a
    public void s() {
        cw2.fb lifecycle;
        com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f224123e;
        com.tencent.mm.pluginsdk.ui.b1 b1Var = finderVLogCompositionPlayView.f130687y;
        if (b1Var != null) {
            b1Var.l(finderVLogCompositionPlayView.f130688z, finderVLogCompositionPlayView.A);
        }
        if ((finderVLogCompositionPlayView.C || !finderVLogCompositionPlayView.f213291n) && (lifecycle = finderVLogCompositionPlayView.getLifecycle()) != null) {
            lifecycle.h(finderVLogCompositionPlayView.B);
        }
        finderVLogCompositionPlayView.C = false;
        finderVLogCompositionPlayView.D = false;
    }

    @Override // vm5.a
    public void x() {
        com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f224123e;
        finderVLogCompositionPlayView.E = true;
        com.tencent.mm.pluginsdk.ui.b1 b1Var = finderVLogCompositionPlayView.f130687y;
        if (b1Var != null) {
            b1Var.p2(finderVLogCompositionPlayView.f130688z, finderVLogCompositionPlayView.A);
        }
        cw2.fb lifecycle = finderVLogCompositionPlayView.getLifecycle();
        if (lifecycle != null) {
            lifecycle.D(finderVLogCompositionPlayView.B, 0L);
        }
    }
}
