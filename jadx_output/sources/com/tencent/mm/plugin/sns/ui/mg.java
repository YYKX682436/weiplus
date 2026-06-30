package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class mg implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f169918d;

    public mg(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f169918d = snsCommentImageFlowUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1$1");
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1$1");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRlLayout$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f169918d;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = snsCommentImageFlowUI.U;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRlLayout$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        on5.c loadMoreFooter = wxRefreshLayout != null ? wxRefreshLayout.getLoadMoreFooter() : null;
        com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter snsCommentImageLoadMoreFooter = loadMoreFooter instanceof com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter ? (com.tencent.mm.plugin.sns.ui.SnsCommentImageLoadMoreFooter) loadMoreFooter : null;
        if (snsCommentImageLoadMoreFooter != null) {
            snsCommentImageLoadMoreFooter.setOnRefreshStateNone(new com.tencent.mm.plugin.sns.ui.lg(snsCommentImageLoadMoreFooter));
        }
        if (com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI) == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHasMoreData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHasMoreData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRlLayout$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = snsCommentImageFlowUI.U;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRlLayout$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (wxRefreshLayout2 != null) {
            wxRefreshLayout2.f();
        }
        com.tencent.mm.plugin.sns.ui.nh v76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
        if (v76 == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        int size = v76.N6().size();
        if (!list.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.nh v77 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
            if (v77 == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            v77.N6().addAll(list);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWxAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = snsCommentImageFlowUI.V;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWxAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (wxRecyclerAdapter != null) {
                int a07 = wxRecyclerAdapter.a0() + size;
                wxRecyclerAdapter.notifyItemRangeInserted(a07, list.size());
                com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView t76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.t7(snsCommentImageFlowUI);
                if (t76 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(a07));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(t76, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$collectFlows$1$1", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                t76.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(t76, "com/tencent/mm/plugin/sns/ui/SnsCommentImageFlowUI$collectFlows$1$1", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1$1");
        return f0Var;
    }
}
