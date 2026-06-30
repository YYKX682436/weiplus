package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0002\u001a0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002\u001a0\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/view/ViewGroup;", "Lcom/tencent/mm/plugin/sns/ui/TagImageView;", "leftIv", "Landroid/widget/ImageView;", "stateIv", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "layout", "Ljz5/l;", "", "layoutFinderTopic", "layoutFinderLive", "TAG", "Ljava/lang/String;", "plugin-sns_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveOtherTimelineItemHandleKt {
    private static final java.lang.String TAG = "MicroMsg.Improve.ImproveOtherTimelineItemHandle";

    public static final /* synthetic */ jz5.l access$layoutFinderLive(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$layoutFinderLive", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        jz5.l layoutFinderLive = layoutFinderLive(snsInfo, timeLineObject, viewGroup);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$layoutFinderLive", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return layoutFinderLive;
    }

    public static final /* synthetic */ jz5.l access$layoutFinderTopic(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        jz5.l layoutFinderTopic = layoutFinderTopic(snsInfo, timeLineObject, viewGroup);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return layoutFinderTopic;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.TagImageView access$leftIv(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$leftIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        com.tencent.mm.plugin.sns.ui.TagImageView leftIv = leftIv(viewGroup);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$leftIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return leftIv;
    }

    public static final /* synthetic */ android.widget.ImageView access$stateIv(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stateIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        android.widget.ImageView stateIv = stateIv(viewGroup);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stateIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return stateIv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final jz5.l layoutFinderLive(com.tencent.mm.plugin.sns.storage.SnsInfo r13, com.tencent.mm.protocal.protobuf.TimeLineObject r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt.layoutFinderLive(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject, android.view.ViewGroup):jz5.l");
    }

    private static final jz5.l layoutFinderTopic(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        android.content.Context context = viewGroup.getContext();
        if (timeLineObject.ContentObj.f369845p == null) {
            jz5.l lVar = new jz5.l("", "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
            return lVar;
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490440v3);
        r45.mv2 mv2Var = timeLineObject.ContentObj.f369845p;
        if (mv2Var != null) {
            string = mv2Var.getInteger(1) == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jeq, timeLineObject.ContentObj.f369845p.getString(0)) : timeLineObject.ContentObj.f369845p.getString(0);
        }
        com.tencent.mm.plugin.sns.ui.TagImageView leftIv = leftIv(viewGroup);
        if (leftIv != null) {
            leftIv.setVisibility(0);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.ContentObj.f369845p.getString(2))) {
            r45.jj4 jj4Var = new r45.jj4();
            jj4Var.f377858g = timeLineObject.ContentObj.f369845p.getString(2);
            jj4Var.f377860i = timeLineObject.ContentObj.f369845p.getString(2);
            jj4Var.f377856e = 2;
            jj4Var.f377862m = 1;
            r45.lj4 lj4Var = new r45.lj4();
            jj4Var.f377865p = lj4Var;
            jj4Var.f377859h = 1;
            lj4Var.f379520d = 0.0f;
            lj4Var.f379521e = 0.0f;
            jj4Var.f377855d = snsInfo.getSnsId();
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            java.lang.String snsId = snsInfo.getSnsId();
            com.tencent.mm.plugin.sns.ui.TagImageView leftIv2 = leftIv(viewGroup);
            int hashCode = viewGroup.getContext().hashCode();
            com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
            d17.f195313b = timeLineObject.CreateTime;
            hj6.Z(snsId, jj4Var, leftIv2, hashCode, d17);
        }
        jz5.l lVar2 = new jz5.l(string, timeLineObject.ContentObj.f369845p.getString(3));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return lVar2;
    }

    private static final com.tencent.mm.plugin.sns.ui.TagImageView leftIv(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("leftIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = (com.tencent.mm.plugin.sns.ui.TagImageView) viewGroup.getTag(com.tencent.mm.R.id.h9t);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("leftIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return tagImageView;
    }

    private static final android.widget.ImageView stateIv(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stateIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.getTag(com.tencent.mm.R.id.nh7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stateIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return imageView;
    }
}
