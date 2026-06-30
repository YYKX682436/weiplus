package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizFinderHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Ljz5/f0;", "onViewExposed", "snsinfo", "karaExposedEvent", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveTimelineItemBizFinderHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle {
    public final void karaExposedEvent(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("karaExposedEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle");
        if (snsInfo != null) {
            java.lang.String str = snsInfo.getTimeLine().Location != null ? snsInfo.getTimeLine().Location.f373313f : "";
            java.util.LinkedList linkedList = snsInfo.getTimeLine().ContentObj.f369840h;
            if (snsInfo.isPhoto() && !snsInfo.isAd() && linkedList != null) {
                linkedList.size();
            }
            java.lang.String userName = snsInfo.getUserName();
            java.lang.String snsId = snsInfo.getSnsId();
            int typeFlag = snsInfo.getTypeFlag();
            boolean isWsFold = snsInfo.isWsFold();
            snsInfo.toString();
            el0.h hVar = el0.i.f253720a;
            if (hVar != null) {
                ((ku5.t0) ku5.t0.f312615d).r(new wl0.n((wl0.o) hVar, snsId, isWsFold, str, typeFlag, userName), "KaraEvent");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("karaExposedEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        if (r5 == wa4.d0.f444215d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r5 == n34.x3.f334776f) goto L21;
     */
    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewExposed(com.tencent.mm.plugin.sns.storage.SnsInfo r15, android.view.View r16, long r17, long r19, boolean r21) {
        /*
            r14 = this;
            r0 = r15
            r1 = r21
            java.lang.String r2 = "onViewExposed"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "info"
            kotlin.jvm.internal.o.g(r15, r4)
            java.lang.String r4 = "view"
            r5 = r16
            kotlin.jvm.internal.o.g(r5, r4)
            n34.h3 r4 = n34.h3.f334610d
            java.lang.String r5 = r15.getLocalid()
            boolean r4 = r4.c(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ImproveTimelineItemBizFinderHandle isExposed:"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = " show:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.Improve.ImproveTimelineItemBizHandle"
            com.tencent.mars.xlog.Log.i(r6, r5)
            if (r1 == 0) goto Lb8
            if (r4 == 0) goto Lb8
            pc4.d r4 = pc4.d.f353410a
            boolean r4 = r4.E()
            r5 = 0
            if (r4 == 0) goto L6d
            wa4.b0 r4 = wa4.b0.f444203a
            java.lang.String r6 = r15.getLocalid()
            java.lang.String r7 = "getLocalid(...)"
            kotlin.jvm.internal.o.f(r6, r7)
            wa4.f0 r4 = r4.b(r6)
            if (r4 == 0) goto L68
            java.lang.String r5 = "getInfoType"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            wa4.d0 r5 = r4.f444225a
        L68:
            wa4.d0 r4 = wa4.d0.f444215d
            if (r5 != r4) goto L9f
            goto L9c
        L6d:
            java.lang.String r4 = r15.getLocalid()
            java.lang.String r6 = "getFinderPostData"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.SnsFinderPostManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            if (r4 != 0) goto L7f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r4 = r5
            goto L8a
        L7f:
            java.util.HashMap r8 = n34.h3.f334611e
            java.lang.Object r4 = r8.get(r4)
            n34.w3 r4 = (n34.w3) r4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
        L8a:
            if (r4 == 0) goto L98
            java.lang.String r5 = "getType"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.SnsPostFinderData"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            n34.x3 r5 = r4.f334767a
        L98:
            n34.x3 r4 = n34.x3.f334776f
            if (r5 != r4) goto L9f
        L9c:
            r4 = 1
        L9d:
            r12 = r4
            goto La1
        L9f:
            r4 = 0
            goto L9d
        La1:
            java.lang.Class<w40.e> r4 = w40.e.class
            i95.m r4 = i95.n0.c(r4)
            w40.e r4 = (w40.e) r4
            r6 = 0
            long r7 = r0.field_snsId
            java.lang.String r9 = ""
            int r5 = r0.localid
            long r10 = (long) r5
            r13 = 0
            r5 = r4
            qs2.q r5 = (qs2.q) r5
            r5.wj(r6, r7, r9, r10, r12, r13)
        Lb8:
            if (r1 == 0) goto Lbd
            r14.karaExposedEvent(r15)
        Lbd:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle.onViewExposed(com.tencent.mm.plugin.sns.storage.SnsInfo, android.view.View, long, long, boolean):void");
    }
}
