package yd4;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView f461083d;

    public b(com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView) {
        this.f461083d = snsStoryHeaderView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$2");
        int i17 = com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView.f170656w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f461083d.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$2");
    }
}
