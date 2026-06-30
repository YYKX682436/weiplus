package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class d0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.c0 c0Var = (com.tencent.mm.plugin.sns.ui.item.c0) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(c0Var) == null || com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(c0Var).getParent() == null) {
            c0Var.E0 = c0Var.f169272h.findViewById(com.tencent.mm.R.id.n8j);
            c0Var.D0 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(c0Var).setLayoutResource(com.tencent.mm.R.layout.cro);
            if (!c0Var.D0) {
                c0Var.E0 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(c0Var).inflate();
                c0Var.D0 = true;
            }
        }
        c0Var.G0 = (android.widget.ImageView) c0Var.E0.findViewById(com.tencent.mm.R.id.n8m);
        c0Var.H0 = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) c0Var.E0.findViewById(com.tencent.mm.R.id.n8k);
        c0Var.I0 = (android.widget.ImageView) c0Var.E0.findViewById(com.tencent.mm.R.id.n8n);
        c0Var.F0 = (androidx.constraintlayout.widget.Guideline) c0Var.E0.findViewById(com.tencent.mm.R.id.n8l);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        r45.a90 a90Var;
        r45.ek4 ek4Var;
        r45.dk4 dk4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        if (timeLineObject != null && (a90Var = timeLineObject.ContentObj) != null && (ek4Var = a90Var.f369849t) != null) {
            com.tencent.mm.plugin.sns.ui.item.c0 c0Var = (com.tencent.mm.plugin.sns.ui.item.c0) baseViewHolder;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(ek4Var.getList(6)) && (dk4Var = (r45.dk4) ek4Var.getList(6).get(0)) != null) {
                c0Var.G0.setVisibility(0);
                c0Var.H0.setVisibility(8);
                c0Var.F0.setGuidelineEnd(0);
                android.util.Pair k17 = m21.y.k((int) dk4Var.getFloat(2), (int) dk4Var.getFloat(3), c0Var.E0.getContext(), false);
                int intValue = ((java.lang.Integer) k17.first).intValue();
                int intValue2 = ((java.lang.Integer) k17.second).intValue();
                c0Var.E0.getLayoutParams().width = intValue;
                c0Var.E0.getLayoutParams().height = intValue2;
                c0Var.E0.requestLayout();
                if (android.text.TextUtils.isEmpty(dk4Var.getString(4))) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.h(dk4Var.getString(1), c0Var.I0, mn2.f1.B);
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.h(dk4Var.getString(4), c0Var.I0, mn2.f1.B);
                }
                c0Var.E0.setTag(timeLineObject);
                c0Var.E0.setOnClickListener(bsVar.f168043i.f169657e);
                rl5.r d17 = bsVar.d();
                android.view.View view = c0Var.E0;
                com.tencent.mm.plugin.sns.ui.listener.i iVar = bsVar.f168039e;
                d17.j(view, iVar.G, iVar.f169809l);
            }
        }
        g(nsVar, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        return "MegaVideoTimeLineItem";
    }
}
