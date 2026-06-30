package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public final class g0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem");
        if (baseViewHolder == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.f0 f0Var = (com.tencent.mm.plugin.sns.ui.item.f0) baseViewHolder;
        android.view.ViewStub r17 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder);
        if (r17 != null) {
            if (r17.getParent() != null) {
                r17.setLayoutResource(com.tencent.mm.R.layout.csm);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTingCategoryStubHas", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                boolean z17 = f0Var.D0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTingCategoryStubHas", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                if (!z17) {
                    android.view.View findViewById = r17.inflate().findViewById(com.tencent.mm.R.id.o9f);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTingRootView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                    f0Var.E0 = findViewById;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTingRootView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTingCategoryStubHas", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                    f0Var.D0 = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTingCategoryStubHas", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                }
            } else {
                android.view.View findViewById2 = f0Var.f169272h.findViewById(com.tencent.mm.R.id.o9f);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTingRootView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                f0Var.E0 = findViewById2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTingRootView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTingCategoryStubHas", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
                f0Var.D0 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTingCategoryStubHas", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
            }
        }
        android.view.View b17 = f0Var.b();
        com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = b17 != null ? (com.tencent.mm.plugin.ting.widget.TingCategoryView) b17.findViewById(com.tencent.mm.R.id.o9e) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTingCategoryView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
        f0Var.F0 = tingCategoryView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTingCategoryView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        com.tencent.mm.plugin.sns.ui.kw kwVar;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem");
        if (baseViewHolder == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.f0 f0Var = (com.tencent.mm.plugin.sns.ui.item.f0) baseViewHolder;
        r45.km6 km6Var = (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null) ? null : a90Var.A;
        if (km6Var != null) {
            bw5.o50 v17 = il4.d.v(km6Var.f378839e);
            android.content.Context context = f0Var.f169272h.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.lm6 c17 = il4.d.c(context, v17, m21.v.b(timeLineObject));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTingCategoryView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
            com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = f0Var.F0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTingCategoryView", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem$MusicTingCategoryViewHolder");
            if (tingCategoryView != null) {
                tingCategoryView.setContainerBackgroundColor(tingCategoryView.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d));
                tingCategoryView.b(c17);
            }
        }
        android.view.View b17 = f0Var.b();
        if (b17 != null) {
            java.lang.String str = nsVar != null ? nsVar.f170036h : null;
            if (str == null) {
                str = "";
            }
            b17.setTag(new com.tencent.mm.plugin.sns.ui.i2(timeLineObject, str));
        }
        android.view.View b18 = f0Var.b();
        if (b18 != null) {
            b18.setOnClickListener((bsVar == null || (kwVar = bsVar.f168043i) == null) ? null : kwVar.f169660h);
        }
        if (bsVar != null) {
            rl5.r d17 = bsVar.d();
            android.view.View b19 = f0Var.b();
            com.tencent.mm.plugin.sns.ui.listener.i iVar = bsVar.f168039e;
            d17.j(b19, iVar != null ? iVar.A : null, iVar.f169809l);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.MusicTingCategoryTimeLineItem");
        return "MusicTingCategoryTimeLineItem";
    }
}
