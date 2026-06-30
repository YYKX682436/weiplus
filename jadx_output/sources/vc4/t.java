package vc4;

/* loaded from: classes4.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435305d;

    public t(com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter) {
        this.f435305d = improveItemFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadWsFoldView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadWsFoldView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_ws_use_page_v3, true);
        va4.b bVar = va4.b.f434401a;
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter = this.f435305d;
        android.content.Context context = improveItemFooter.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zc4.b b17 = com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.b(improveItemFooter);
        bVar.b(context, b17 != null ? b17.n() : null, fj6, false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadWsFoldView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadWsFoldView$3");
    }
}
