package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class m extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        int nj6 = com.tencent.mm.plugin.sns.model.l4.nj();
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) == null) {
            baseViewHolder.f169265d0 = baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.cgy);
            baseViewHolder.f169263c0 = true;
        } else if (!baseViewHolder.f169263c0) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.csg);
            baseViewHolder.f169265d0 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
            baseViewHolder.f169263c0 = true;
        }
        baseViewHolder.f169300v = (com.tencent.mm.plugin.sns.ui.TagImageView) baseViewHolder.f169265d0.findViewById(com.tencent.mm.R.id.chp);
        baseViewHolder.f169302w = (android.widget.ImageView) baseViewHolder.f169265d0.findViewById(com.tencent.mm.R.id.nh7);
        baseViewHolder.f169306y = (android.widget.TextView) baseViewHolder.f169265d0.findViewById(com.tencent.mm.R.id.ch7);
        android.view.View view = baseViewHolder.f169265d0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentSize", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = nj6;
        layoutParams.width = nj6;
        view.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentSize", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        ca4.z0.A0(baseViewHolder.f169300v, this.f169249f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r11 != 54) goto L13;
     */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r20, int r21, com.tencent.mm.plugin.sns.ui.ns r22, com.tencent.mm.protocal.protobuf.TimeLineObject r23, int r24, com.tencent.mm.plugin.sns.ui.bs r25) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.m.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        return "CollapseTimelineItem";
    }
}
