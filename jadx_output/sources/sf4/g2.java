package sf4;

/* loaded from: classes4.dex */
public final class g2 implements com.tencent.mm.pluginsdk.ui.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f407482d;

    public g2(sf4.j2 j2Var) {
        this.f407482d = j2Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void idkeyStat(long j17, long j18, long j19, boolean z17) {
        sf4.j2 j2Var = this.f407482d;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = j2Var.f407499a;
        if ((storyVideoView == null || storyVideoView.Q1) ? false : true) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j2Var.f407508j, j18, j19, z17);
            if (j18 < 141 || j18 > 145) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initCreateVideoView test key ");
            sb6.append(j18);
            sb6.append(" value ");
            sb6.append(j19);
            sb6.append(" currVideoItem:");
            sb6.append(j2Var.f407504f);
            sb6.append(' ');
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void kvStat(int i17, java.lang.String str) {
    }
}
