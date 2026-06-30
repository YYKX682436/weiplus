package cw2;

/* loaded from: classes4.dex */
public final class o9 implements com.tencent.mm.pluginsdk.ui.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoView f223902d;

    public o9(com.tencent.mm.plugin.finder.video.FinderVideoView finderVideoView) {
        this.f223902d = finderVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void idkeyStat(long j17, long j18, long j19, boolean z17) {
        cw2.wa mediaInfo = this.f223902d.getMediaInfo();
        if ((mediaInfo != null ? mediaInfo.f224097d : null) != null) {
            if (j18 < 200) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1302L, j18, j19, z17);
            }
            if (120 <= j18 && j18 < 140) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(1302L, 200L, j19, z17);
                if (120 <= j18 && j18 < 125) {
                    g0Var.idkeyStat(1302L, 201L, j19, z17);
                }
                if (125 <= j18 && j18 < 130) {
                    g0Var.idkeyStat(1302L, 202L, j19, z17);
                }
                if (130 <= j18 && j18 < 135) {
                    g0Var.idkeyStat(1302L, 203L, j19, z17);
                }
                if (135 <= j18 && j18 < 140) {
                    g0Var.idkeyStat(1302L, 204L, j19, z17);
                }
            }
            if (141 <= j18 && j18 < 161) {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.idkeyStat(1302L, 210L, j19, z17);
                if (141 <= j18 && j18 < 146) {
                    g0Var2.idkeyStat(1302L, 211L, j19, z17);
                }
                if (146 <= j18 && j18 < 151) {
                    g0Var2.idkeyStat(1302L, 212L, j19, z17);
                }
                if (151 <= j18 && j18 < 156) {
                    g0Var2.idkeyStat(1302L, 213L, j19, z17);
                }
                if (156 <= j18 && j18 < 161) {
                    g0Var2.idkeyStat(1302L, 214L, j19, z17);
                }
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void kvStat(int i17, java.lang.String str) {
    }
}
