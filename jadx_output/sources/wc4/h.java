package wc4;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView f444523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f444525f;

    public h(com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView videoExportStateView, java.lang.String str, int i17) {
        this.f444523d = videoExportStateView;
        this.f444524e = str;
        this.f444525f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$updateProgress$1");
        wc4.a aVar = com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.f169098i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$loadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView videoExportStateView = this.f444523d;
        videoExportStateView.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$loadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        wc4.a aVar2 = com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.f169098i;
        java.lang.String str = this.f444524e;
        int i17 = this.f444525f;
        wc4.a.a(aVar2, str, i17);
        if (i17 >= 100) {
            videoExportStateView.f(str, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$updateProgress$1");
            return;
        }
        dy1.a.a(videoExportStateView, wc4.g.f444522a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTask$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        wu5.c cVar = videoExportStateView.f169103g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTask$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        if (cVar != null) {
            cVar.cancel(false);
        }
        videoExportStateView.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.a(videoExportStateView).setVisibility(0);
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.b(videoExportStateView).setVisibility(8);
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.a(videoExportStateView).setProgress(i17);
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.d(videoExportStateView).setText(i65.a.r(videoExportStateView.getContext(), com.tencent.mm.R.string.ojh));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$updateProgress$1");
    }
}
