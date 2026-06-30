package vc4;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter) {
        super(0);
        this.f435276d = improveItemFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$exportVideoIndicatorLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$exportVideoIndicatorLayout$2");
        com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView videoExportStateView = new com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView(this.f435276d.getContext());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$exportVideoIndicatorLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$exportVideoIndicatorLayout$2");
        return videoExportStateView;
    }
}
