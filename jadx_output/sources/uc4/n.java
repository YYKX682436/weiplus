package uc4;

/* loaded from: classes4.dex */
public final class n implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.o f426435d;

    public n(uc4.o oVar) {
        this.f426435d = oVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$update$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveAvatarClick$update$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        this.f426435d.n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveAvatarClick$update$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$update$1");
        return true;
    }
}
