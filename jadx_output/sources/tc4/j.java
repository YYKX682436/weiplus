package tc4;

/* loaded from: classes4.dex */
public final class j implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f417372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f417373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417374c;

    public j(r45.g92 g92Var, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, tc4.a0 a0Var) {
        this.f417372a = g92Var;
        this.f417373b = timeLineObject;
        this.f417374c = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (r5 == false) goto L16;
     */
    @Override // gy1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r14, java.lang.String r16, java.util.Map r17) {
        /*
            r13 = this;
            r0 = r13
            java.lang.String r1 = "onEventOccur"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 13
            r45.g92 r4 = r0.f417372a
            int r3 = r4.getInteger(r3)
            r4 = 1
            if (r3 != r4) goto L15
            goto L16
        L15:
            r4 = 2
        L16:
            p52.c r3 = p52.h.f352016a
            kotlin.jvm.internal.o.d(r16)
            kotlin.jvm.internal.o.d(r17)
            r5 = r3
            r6 = r14
            r8 = r16
            r9 = r17
            r10 = r4
            boolean r5 = r5.c(r6, r8, r9, r10)
            if (r5 != 0) goto L81
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f417373b
            r45.a90 r5 = r5.ContentObj
            if (r5 == 0) goto L81
            r45.g92 r5 = r5.f369848s
            if (r5 == 0) goto L81
            java.lang.Class<s40.w0> r6 = s40.w0.class
            i95.m r6 = i95.n0.c(r6)
            s40.w0 r6 = (s40.w0) r6
            com.tencent.mm.feature.finder.live.v4 r6 = (com.tencent.mm.feature.finder.live.v4) r6
            boolean r6 = r6.ok(r5)
            if (r6 == 0) goto L5f
            r6 = 24
            com.tencent.mm.protobuf.f r6 = r5.getCustom(r6)
            r45.nw1 r6 = (r45.nw1) r6
            java.lang.String r7 = "access$isLiveReplay"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            tc4.a0 r9 = r0.f417374c
            boolean r5 = r9.Y(r5, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            if (r5 != 0) goto L81
        L5f:
            java.lang.Class<dy1.r> r5 = dy1.r.class
            i95.m r5 = i95.n0.c(r5)
            dy1.r r5 = (dy1.r) r5
            r6 = r17
            java.util.Map r10 = r3.h(r6, r4)
            r3 = 26236(0x667c, float:3.6764E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.List r11 = kz5.b0.c(r3)
            r12 = 0
            r6 = r5
            cy1.a r6 = (cy1.a) r6
            r7 = r14
            r9 = r16
            r6.Qj(r7, r9, r10, r11, r12)
        L81:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.j.a(long, java.lang.String, java.util.Map):void");
    }
}
