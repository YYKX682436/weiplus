package k53;

/* loaded from: classes4.dex */
public class f0 implements com.tencent.mm.pluginsdk.ui.c1 {
    public f0(com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void idkeyStat(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void kvStat(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
    }
}
