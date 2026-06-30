package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H&J0\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0004J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0004J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0014JH\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rH\u0004¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "", "getDefaultTitle", "getDescStr", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Landroid/view/ViewGroup;", "layout", "Ljz5/l;", "handle", "Lcom/tencent/mm/plugin/sns/ui/i2;", "getTagObject", "", "checkClickValid", "checkMediaValid", "Landroid/view/View;", "Ljz5/f0;", "postClickEvent", "first", "second", "pickValidContent", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class ImproveOtherTimelineItemHandle {
    private final java.lang.String getDefaultTitle(com.tencent.mm.protocal.protobuf.TimeLineObject tlObj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        java.lang.String str = tlObj.ContentObj.f369838f;
        if (str != null && str.length() > 40) {
            boolean z17 = com.tencent.mm.smiley.q0.f193336d;
            java.lang.String substring = str.substring(0, com.tencent.mm.smiley.l0.f193307a.h(str, 0, 40));
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            str = substring.concat("...");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return str;
    }

    private final java.lang.String getDescStr(com.tencent.mm.protocal.protobuf.TimeLineObject tlObj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDescStr", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        java.lang.String h17 = com.tencent.mm.plugin.sns.ui.bs.l(tlObj) ? com.tencent.mm.plugin.sns.ui.bs.h(tlObj.ContentObj.f369839g) : "";
        r45.a90 a90Var = tlObj.ContentObj;
        int i17 = a90Var.f369837e;
        if (i17 == 9 || i17 == 14 || i17 == 12 || i17 == 13) {
            h17 = a90Var.f369836d;
        }
        r45.hh4 hh4Var = a90Var.f369843n;
        if (hh4Var != null && hh4Var.f376159q == 1) {
            h17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492564gz4);
        }
        java.lang.String str = h17 != null ? h17 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDescStr", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return str;
    }

    public boolean checkClickValid(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return true;
    }

    public final boolean checkMediaValid(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMediaValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        boolean z17 = timeLine.ContentObj.f369840h.size() > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return z17;
    }

    public abstract int getContentStyle();

    public final com.tencent.mm.plugin.sns.ui.i2 getTagObject(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagObject", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        java.lang.String localid = snsInfo.getLocalid();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        com.tencent.mm.plugin.sns.ui.i2 i2Var = new com.tencent.mm.plugin.sns.ui.i2(timeLine, localid, snsInfo.getTypeFlag());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagObject", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return i2Var;
    }

    public jz5.l handle(final com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject tlObj, android.view.ViewGroup layout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(tlObj, "tlObj");
        kotlin.jvm.internal.o.g(layout, "layout");
        layout.setTag(getTagObject(snsInfo));
        layout.setOnClickListener(null);
        if (checkClickValid(snsInfo)) {
            java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
            zy1.f fVar = (zy1.f) ((dy1.s) i95.n0.c(dy1.s.class));
            fVar.Bi(12076, "ClickFeedCount", 1);
            kotlin.jvm.internal.o.d(t07);
            fVar.Di(12076, "ClickFeedId", t07);
            layout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$2
                private byte _hellAccFlag_;

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$2");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle$handle$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle improveOtherTimelineItemHandle = com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle.this;
                    kotlin.jvm.internal.o.d(view);
                    improveOtherTimelineItemHandle.postClickEvent(view, snsInfo);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle$handle$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle$handle$2");
                }
            });
        }
        jz5.l lVar = new jz5.l(getDefaultTitle(tlObj), getDescStr(tlObj));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return lVar;
    }

    public final jz5.l pickValidContent(jz5.l first, jz5.l second) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pickValidContent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        kotlin.jvm.internal.o.g(first, "first");
        kotlin.jvm.internal.o.g(second, "second");
        java.lang.Object obj = first.f302833d;
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) obj)) {
            obj = second.f302833d;
        }
        java.lang.String str = (java.lang.String) obj;
        java.lang.Object obj2 = first.f302834e;
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) obj2)) {
            obj2 = second.f302834e;
        }
        jz5.l lVar = new jz5.l(str, (java.lang.String) obj2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pickValidContent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return lVar;
    }

    public void postClickEvent(android.view.View layout, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        ot5.g.c("MicroMsg.Improve.ImproveOtherTimelineItemHandle", "postClickEvent type:" + getContentStyle() + " snsid:" + snsInfo.getSnsId());
        yc4.b0 b0Var = yc4.b0.f460839a;
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        b0Var.b(t07);
        java.lang.String t08 = ca4.z0.t0(snsInfo.field_snsId);
        kotlin.jvm.internal.o.f(t08, "longToString(...)");
        b0Var.c(t08, 1);
        com.tencent.mm.autogen.events.SnsOtherFeedClickEvent snsOtherFeedClickEvent = new com.tencent.mm.autogen.events.SnsOtherFeedClickEvent();
        int contentStyle = getContentStyle();
        am.iw iwVar = snsOtherFeedClickEvent.f54826g;
        iwVar.f6977a = contentStyle;
        iwVar.f6978b = getTagObject(snsInfo);
        iwVar.f6979c = layout;
        snsOtherFeedClickEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
    }
}
