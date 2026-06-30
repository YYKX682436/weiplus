package tc4;

/* loaded from: classes4.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.r0 f417430d;

    public p0(tc4.r0 r0Var) {
        this.f417430d = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem$loadCustomItemInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_ws_use_page_v3_for_old, false);
        va4.b bVar = va4.b.f434401a;
        tc4.r0 r0Var = this.f417430d;
        android.content.Context context = r0Var.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zc4.b data = r0Var.getData();
        bVar.b(context, data != null ? data.n() : null, fj6, true);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem$loadCustomItemInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2$1");
    }
}
