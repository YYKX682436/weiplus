package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class kh extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f169633d;

    public kh(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f169633d = snsCommentImageFlowUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$setupRecyclerView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f169633d;
        if (i17 == 0) {
            int y76 = snsCommentImageFlowUI.y7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCurrentPage$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            int i18 = snsCommentImageFlowUI.G1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCurrentPage$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (y76 < i18) {
                com.tencent.mm.plugin.sns.ui.nh v76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
                if (v76 == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                java.lang.Object obj = v76.N6().get(y76);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                snsCommentImageFlowUI.C7((com.tencent.mm.plugin.sns.ui.ei) obj, ta4.s.f416820g);
            } else {
                com.tencent.mm.plugin.sns.ui.nh v77 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
                if (v77 == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                java.lang.Object obj2 = v77.N6().get(y76);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                snsCommentImageFlowUI.C7((com.tencent.mm.plugin.sns.ui.ei) obj2, ta4.s.f416821h);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setCurrentPage$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            snsCommentImageFlowUI.G1 = y76;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setCurrentPage$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (y76 >= 0) {
                com.tencent.mm.plugin.sns.ui.nh v78 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
                if (v78 == null) {
                    kotlin.jvm.internal.o.o("viewModel");
                    throw null;
                }
                if (y76 < v78.N6().size()) {
                    com.tencent.mm.plugin.sns.ui.nh v79 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
                    if (v79 == null) {
                        kotlin.jvm.internal.o.o("viewModel");
                        throw null;
                    }
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip c17 = ((com.tencent.mm.plugin.sns.ui.ei) v79.N6().get(y76)).c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsInfoFlipView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                    snsCommentImageFlowUI.f166810o = c17;
                    snsCommentImageFlowUI.k7(c17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsInfoFlipView", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                    if (y76 == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                        com.tencent.mm.ui.base.MMViewPager gallery = c17.getGallery();
                        gallery.setGalleryScaleListener(new com.tencent.mm.plugin.sns.ui.vg(snsCommentImageFlowUI, c17, gallery));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                    }
                }
            }
        } else if (i17 == 1) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            boolean x76 = snsCommentImageFlowUI.x7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (x76) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$hideCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                snsCommentImageFlowUI.A7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$hideCommentInputFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$setupRecyclerView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$3");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$setupRecyclerView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$setupRecyclerView$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$3");
    }
}
