package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class c1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.f1 f171344d;

    public c1(com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var) {
        this.f171344d = f1Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$setupRecyclerView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/wsfold/SnsWsFoldMainUIC$setupRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var = this.f171344d;
        androidx.appcompat.app.AppCompatActivity activity = f1Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUIComponents", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        java.util.HashSet<com.tencent.mm.ui.component.UIComponent> uiComponents = ((com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3) activity).getUiComponents();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUIComponents", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        for (com.tencent.mm.ui.component.UIComponent uIComponent : uiComponents) {
            if (uIComponent instanceof com.tencent.mm.plugin.sns.ui.wsfold.a) {
                ((com.tencent.mm.plugin.sns.ui.wsfold.a) uIComponent).O6(recyclerView, f1Var.getVisibleItemView(), i17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/wsfold/SnsWsFoldMainUIC$setupRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$setupRecyclerView$1");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$setupRecyclerView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/wsfold/SnsWsFoldMainUIC$setupRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.appcompat.app.AppCompatActivity activity = this.f171344d.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUIComponents", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        java.util.HashSet<com.tencent.mm.ui.component.UIComponent> uiComponents = ((com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3) activity).getUiComponents();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUIComponents", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3");
        for (com.tencent.mm.ui.component.UIComponent uIComponent : uiComponents) {
            if (uIComponent instanceof com.tencent.mm.plugin.sns.ui.wsfold.a) {
                ((com.tencent.mm.plugin.sns.ui.wsfold.a) uIComponent).onScrolled(recyclerView, i17, i18);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/wsfold/SnsWsFoldMainUIC$setupRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$setupRecyclerView$1");
    }
}
