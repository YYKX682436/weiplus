package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class h0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem");
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) == null || com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).getParent() == null) {
            baseViewHolder.f169265d0 = baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.jdl);
            baseViewHolder.f169263c0 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.csp);
            if (!baseViewHolder.f169263c0) {
                baseViewHolder.f169265d0 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                baseViewHolder.f169263c0 = true;
            }
        }
        android.view.View view = baseViewHolder.f169265d0;
        baseViewHolder.f169298u = view;
        baseViewHolder.f169300v = (com.tencent.mm.plugin.sns.ui.TagImageView) view.findViewById(com.tencent.mm.R.id.h9t);
        baseViewHolder.f169302w = (android.widget.ImageView) baseViewHolder.f169298u.findViewById(com.tencent.mm.R.id.nh7);
        baseViewHolder.f169304x = (android.widget.TextView) baseViewHolder.f169298u.findViewById(com.tencent.mm.R.id.m4o);
        android.widget.TextView textView = (android.widget.TextView) baseViewHolder.f169298u.findViewById(com.tencent.mm.R.id.odj);
        baseViewHolder.f169306y = textView;
        textView.setTextColor(this.f169249f.getResources().getColor(com.tencent.mm.R.color.a0c));
        ca4.z0.A0(baseViewHolder.f169300v, this.f169249f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0544, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0b5b, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0d18, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 0) goto L352;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0d9d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0e36  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0e51  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0ec6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0e44  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0307  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r30, int r31, com.tencent.mm.plugin.sns.ui.ns r32, com.tencent.mm.protocal.protobuf.TimeLineObject r33, int r34, com.tencent.mm.plugin.sns.ui.bs r35) {
        /*
            Method dump skipped, instructions count: 3864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.h0.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem");
        return "OtherTimeLineItem";
    }
}
