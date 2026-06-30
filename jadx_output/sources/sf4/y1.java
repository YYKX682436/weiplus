package sf4;

/* loaded from: classes4.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView f407619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct f407620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f407621f;

    public y1(com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView, com.tencent.mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct, long j17) {
        this.f407619d = storyVideoView;
        this.f407620e = wCStoryVideoPlayReportStruct;
        this.f407621f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView.f172110a2;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407619d;
        com.tencent.mars.xlog.Log.i(storyVideoView.f189739e, "reportStopLocalVideo");
        com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
        java.lang.String str = storyVideoView.f71645l1;
        ((be0.e) oVar).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 != null) {
            long j17 = d17.f162382a;
            com.tencent.mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct = this.f407620e;
            wCStoryVideoPlayReportStruct.f62138h = j17;
            nf4.l i18 = ef4.w.f252468t.i();
            long j18 = this.f407621f;
            wCStoryVideoPlayReportStruct.f62136f = (j18 >= 0 ? i18.J0((int) j18) : i18.L0(j18)) != null ? r1.field_readCount : 0;
            wCStoryVideoPlayReportStruct.f62148r = d17.f162383b;
            wCStoryVideoPlayReportStruct.k();
        }
    }
}
