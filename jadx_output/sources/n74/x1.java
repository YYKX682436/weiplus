package n74;

/* loaded from: classes4.dex */
public abstract class x1 {
    public static r45.jj4 a(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        r45.jj4 jj4Var = null;
        if (baseViewHolder == null || (timeLineObject = baseViewHolder.timeLineObject) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        if (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null || a84.b0.b(a90Var.f369840h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        } else {
            jj4Var = (r45.jj4) a90Var.f369840h.get(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        return jj4Var;
    }

    public static i64.b1 b(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        if (bsVar == null || (l1Var = bsVar.f168036b) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
            return null;
        }
        i64.b1 b1Var = l1Var.f169702c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        return b1Var;
    }

    public static java.lang.String c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLineId", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        if (baseViewHolder != null) {
            timeLineObject = baseViewHolder.timeLineObject;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
            timeLineObject = null;
        }
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLineId", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
            return "";
        }
        java.lang.String str = timeLineObject.Id;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLineId", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineViewHolderHelper");
        return str;
    }
}
