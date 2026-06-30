package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class t extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f169420q = new java.util.HashMap();

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.s sVar = (com.tencent.mm.plugin.sns.ui.item.s) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) == null || com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).getParent() == null) {
            sVar.E0 = baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.n8j);
            sVar.D0 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cro);
            if (!sVar.D0) {
                sVar.E0 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                sVar.D0 = true;
            }
        }
        sVar.G0 = (android.widget.ImageView) sVar.E0.findViewById(com.tencent.mm.R.id.n8m);
        sVar.H0 = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) sVar.E0.findViewById(com.tencent.mm.R.id.n8k);
        sVar.I0 = (android.widget.ImageView) sVar.E0.findViewById(com.tencent.mm.R.id.n8n);
        sVar.F0 = (androidx.constraintlayout.widget.Guideline) sVar.E0.findViewById(com.tencent.mm.R.id.n8l);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r22, int r23, com.tencent.mm.plugin.sns.ui.ns r24, com.tencent.mm.protocal.protobuf.TimeLineObject r25, int r26, com.tencent.mm.plugin.sns.ui.bs r27) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.t.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
        return "FinderMediaTimeLineItem";
    }
}
