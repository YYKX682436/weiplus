package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveFinderPoiHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "Landroid/view/ViewGroup;", "layout", "Ljz5/l;", "", "handle", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveFinderPoiHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle {
    public static final com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPoiHandle INSTANCE = new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPoiHandle();

    private ImproveFinderPoiHandle() {
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public int getContentStyle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPoiHandle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPoiHandle");
        return 44;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public jz5.l handle(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject tlObj, android.view.ViewGroup layout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPoiHandle");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(tlObj, "tlObj");
        kotlin.jvm.internal.o.g(layout, "layout");
        jz5.l handle = super.handle(snsInfo, tlObj, layout);
        if (tlObj.ContentObj.f369853x == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPoiHandle");
            return handle;
        }
        com.tencent.mm.plugin.sns.ui.TagImageView access$leftIv = com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt.access$leftIv(layout);
        if (access$leftIv != null) {
            access$leftIv.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(tlObj.ContentObj.f369853x.getString(5))) {
            com.tencent.mm.plugin.sns.model.l4.hj().S(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt.access$leftIv(layout), -1, com.tencent.mm.R.raw.icons_outlined_location, layout.getContext().hashCode());
        } else {
            r45.jj4 jj4Var = new r45.jj4();
            jj4Var.f377858g = tlObj.ContentObj.f369853x.getString(5);
            jj4Var.f377860i = tlObj.ContentObj.f369853x.getString(5);
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
            com.tencent.mm.plugin.sns.ui.TagImageView access$leftIv2 = com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt.access$leftIv(layout);
            int hashCode = layout.getContext().hashCode();
            com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
            d17.f195313b = tlObj.CreateTime;
            hj6.Z(snsId, jj4Var, access$leftIv2, hashCode, d17);
        }
        jz5.l lVar = new jz5.l(tlObj.ContentObj.f369853x.getString(2), tlObj.ContentObj.f369853x.getString(7));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPoiHandle");
        return lVar;
    }
}
