package wc4;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView f444519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444520f;

    public e(java.lang.String str, com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView videoExportStateView, java.lang.String str2) {
        this.f444518d = str;
        this.f444519e = videoExportStateView;
        this.f444520f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$publishSuccess$2");
        wc4.a aVar = com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.f169098i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$removeUploadSight", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeUploadSight", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        java.util.HashMap c17 = com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView.c();
        java.lang.String str = this.f444518d;
        c17.remove(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUploadSight", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$removeUploadSight", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$Companion");
        wc4.d dVar = new wc4.d(this.f444520f);
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView videoExportStateView = this.f444519e;
        dy1.a.a(videoExportStateView, dVar);
        videoExportStateView.setVisibility(8);
        yz5.l publishHideListener = videoExportStateView.getPublishHideListener();
        if (publishHideListener != null) {
            publishHideListener.invoke(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$publishSuccess$2");
    }
}
