package tc4;

/* loaded from: classes4.dex */
public abstract class d2 extends tc4.i2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object F(tc4.d2 r8, in5.s0 r9, zc4.b r10, int r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            java.lang.String r9 = "onBindViewHolder$suspendImpl"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r0)
            boolean r1 = r13 instanceof tc4.c2
            if (r1 == 0) goto L1b
            r1 = r13
            tc4.c2 r1 = (tc4.c2) r1
            int r2 = r1.f417306h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1b
            int r2 = r2 - r3
            r1.f417306h = r2
            goto L20
        L1b:
            tc4.c2 r1 = new tc4.c2
            r1.<init>(r8, r13)
        L20:
            java.lang.Object r13 = r1.f417304f
            pz5.a r2 = pz5.a.f359186d
            int r3 = r1.f417306h
            r4 = 2
            r5 = 1
            jz5.f0 r6 = jz5.f0.f302826a
            if (r3 == 0) goto L4a
            if (r3 == r5) goto L40
            if (r3 != r4) goto L35
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lb0
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            throw r8
        L40:
            boolean r12 = r1.f417303e
            java.lang.Object r8 = r1.f417302d
            tc4.d2 r8 = (tc4.d2) r8
            kotlin.ResultKt.throwOnFailure(r13)
            goto L8d
        L4a:
            kotlin.ResultKt.throwOnFailure(r13)
            r1.f417302d = r8
            r1.f417303e = r12
            r1.f417306h = r5
            r8.getClass()
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "pos:"
            r5.<init>(r7)
            r5.append(r11)
            java.lang.String r11 = " bindHolder "
            r5.append(r11)
            xc4.p r10 = r10.n()
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            java.lang.String r11 = "MicroMsg.Improve.DataFlow"
            r8.x(r11, r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r3)
            if (r6 != r2) goto L8d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            return r2
        L8d:
            boolean r10 = r8.B()
            if (r10 != 0) goto La1
            if (r12 == 0) goto L96
            goto La1
        L96:
            java.lang.String r10 = "MicroMsg.Improve.TimelineItemLoad"
            java.lang.String r11 = "already finish custom load,do nothing"
            r8.x(r10, r11)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            return r6
        La1:
            r10 = 0
            r1.f417302d = r10
            r1.f417306h = r4
            java.lang.Object r8 = r8.C(r1)
            if (r8 != r2) goto Lb0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            return r2
        Lb0:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.d2.F(tc4.d2, in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        com.tencent.mm.memory.ui.QPictureView tagImgView = getTagImgView();
        boolean z17 = false;
        if (tagImgView != null && !tagImgView.E) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            java.lang.String r0 = "itemLoad"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r9 instanceof tc4.a2
            if (r2 == 0) goto L1b
            r2 = r9
            tc4.a2 r2 = (tc4.a2) r2
            int r3 = r2.f417276g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f417276g = r3
            goto L20
        L1b:
            tc4.a2 r2 = new tc4.a2
            r2.<init>(r8, r9)
        L20:
            java.lang.Object r9 = r2.f417274e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f417276g
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L45
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L32
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6d
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L3d:
            java.lang.Object r4 = r2.f417273d
            tc4.d2 r4 = (tc4.d2) r4
            kotlin.ResultKt.throwOnFailure(r9)
            goto L57
        L45:
            kotlin.ResultKt.throwOnFailure(r9)
            r2.f417273d = r8
            r2.f417276g = r6
            java.lang.Object r9 = r8.D(r2)
            if (r9 != r3) goto L56
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L56:
            r4 = r8
        L57:
            kotlinx.coroutines.p0 r9 = kotlinx.coroutines.q1.f310568a
            tc4.b2 r6 = new tc4.b2
            r7 = 0
            r6.<init>(r4, r7)
            r2.f417273d = r7
            r2.f417276g = r5
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r6, r2)
            if (r9 != r3) goto L6d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L6d:
            jz5.f0 r9 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.d2.C(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object D(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomInMainThread", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomInMainThread$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomInMainThread$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomInMainThread", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return f0Var;
    }

    public abstract java.lang.Object E(kotlin.coroutines.Continuation continuation);

    public final java.lang.String getMediaId() {
        xc4.p n17;
        r45.jj4 R0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        zc4.b data = getData();
        java.lang.String str = (data == null || (n17 = data.n()) == null || (R0 = n17.R0()) == null) ? null : R0.f377855d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return str;
    }

    public final java.util.List<r45.jj4> getMediaList() {
        xc4.p n17;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaList", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        zc4.b data = getData();
        java.util.List<r45.jj4> a17 = (data == null || (n17 = data.n()) == null || (h17 = n17.h1()) == null) ? null : qa4.f.a(h17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaList", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return a17;
    }

    public com.tencent.mm.memory.ui.QPictureView getTagImgView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad");
        return null;
    }
}
