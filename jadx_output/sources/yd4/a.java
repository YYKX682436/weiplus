package yd4;

/* loaded from: classes3.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView f461082d;

    public a(com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView) {
        this.f461082d = snsStoryHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView.f170656w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView = this.f461082d;
        snsStoryHeaderView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1015L, 5L, 1L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToStoryGallery", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        java.util.LinkedList linkedList = (java.util.LinkedList) snsStoryHeaderView.f170659f;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStoryHeaderView", "goToStoryGallery: %s", java.lang.Integer.valueOf(linkedList.size()));
        linkedList.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToStoryGallery", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$1");
    }
}
