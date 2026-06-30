package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveFinderCollectionHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "Landroid/view/ViewGroup;", "layout", "Ljz5/l;", "", "handle", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveFinderCollectionHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle {
    public static final com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle INSTANCE = new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle();

    private ImproveFinderCollectionHandle() {
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public int getContentStyle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
        return 56;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public jz5.l handle(final com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, final com.tencent.mm.protocal.protobuf.TimeLineObject tlObj, android.view.ViewGroup layout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(tlObj, "tlObj");
        kotlin.jvm.internal.o.g(layout, "layout");
        jz5.l handle = super.handle(snsInfo, tlObj, layout);
        if (tlObj.ContentObj.E == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
            return handle;
        }
        com.tencent.mm.plugin.sns.ui.TagImageView access$leftIv = com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt.access$leftIv(layout);
        if (access$leftIv != null) {
            access$leftIv.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(tlObj.ContentObj.E.getString(3))) {
            com.tencent.mm.plugin.sns.model.l4.hj().S(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt.access$leftIv(layout), -1, com.tencent.mm.R.raw.app_attach_file_icon_webpage, hashCode());
        } else {
            com.tencent.mm.plugin.sns.ui.TagImageView access$leftIv2 = com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt.access$leftIv(layout);
            if (access$leftIv2 != null) {
                access$leftIv2.setScaleType(al5.q2.CENTER_CROP);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                ya2.l.f460502a.i(tlObj.ContentObj.E.getString(3), access$leftIv2);
            }
        }
        java.lang.String string = tlObj.ContentObj.E.getString(1);
        java.lang.String string2 = layout.getContext().getString(com.tencent.mm.R.string.ok6, java.lang.Integer.valueOf(tlObj.ContentObj.E.getInteger(4)));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        ym5.a1.h(layout, new ym5.n0() { // from class: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle$handle$2
            @Override // ym5.n0
            public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
                r45.ev2 ev2Var;
                r45.ev2 ev2Var2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle$handle$2");
                kotlin.jvm.internal.o.g(view, "view");
                if (z17) {
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                    com.tencent.mm.plugin.finder.report.m0 m0Var = com.tencent.mm.plugin.finder.report.m0.f125120d;
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = com.tencent.mm.protocal.protobuf.TimeLineObject.this;
                    java.lang.String str = timeLineObject.UserName;
                    if (str == null) {
                        str = "";
                    }
                    r45.a90 a90Var = timeLineObject.ContentObj;
                    int integer = (a90Var == null || (ev2Var2 = a90Var.E) == null) ? 0 : ev2Var2.getInteger(13);
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = com.tencent.mm.protocal.protobuf.TimeLineObject.this;
                    java.lang.String str2 = timeLineObject2.UserName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    r45.a90 a90Var2 = timeLineObject2.ContentObj;
                    java.lang.String u17 = pm0.v.u((a90Var2 == null || (ev2Var = a90Var2.E) == null) ? 0L : ev2Var.getLong(0));
                    long j19 = com.tencent.mm.protocal.protobuf.TimeLineObject.this.CreateTime;
                    fe0.o4 o4Var = (fe0.o4) i95.n0.c(fe0.o4.class);
                    java.lang.String localid = snsInfo.getLocalid();
                    java.lang.String Di = ((ee0.v4) o4Var).Di(localid != null ? localid : "");
                    kotlin.jvm.internal.o.f(Di, "getSnsPublishId(...)");
                    m0Var.c(3, 8, str, null, "", integer, str2, u17, j19, Di);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle$handle$2");
            }
        });
        jz5.l lVar = new jz5.l(string, string2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle");
        return lVar;
    }
}
