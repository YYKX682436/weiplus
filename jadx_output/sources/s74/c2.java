package s74;

/* loaded from: classes4.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z74.b f404228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f404229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f404230h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(s74.o2 o2Var, z74.b bVar, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404227e = o2Var;
        this.f404228f = bVar;
        this.f404229g = i17;
        this.f404230h = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        s74.c2 c2Var = new s74.c2(this.f404227e, this.f404228f, this.f404229g, this.f404230h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        return c2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        java.lang.Object invokeSuspend = ((s74.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r13.f404226d
            jz5.f0 r4 = jz5.f0.f302826a
            r5 = 1
            if (r3 == 0) goto L23
            if (r3 != r5) goto L18
            kotlin.ResultKt.throwOnFailure(r14)
            goto L9a
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r14
        L23:
            kotlin.ResultKt.throwOnFailure(r14)
            s74.o2 r14 = r13.f404227e
            java.lang.String r3 = r14.j()
            java.lang.String r6 = "the video event it is going to send"
            com.tencent.mars.xlog.Log.i(r3, r6)
            java.lang.String r3 = "access$getTemplateEventHelper$p"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            r13.f404226d = r5
            s74.b3 r14 = r14.L
            r14.getClass()
            java.lang.String r3 = "emitVideoEvent"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEventHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            z74.b r6 = z74.b.f470587g
            z74.b r7 = r13.f404228f
            if (r7 != r6) goto L90
            kotlinx.coroutines.flow.i2 r14 = r14.f404218a
            s74.z2 r12 = new s74.z2
            r7 = 0
            java.lang.String r8 = "onPlayEnd"
            java.lang.Integer r6 = new java.lang.Integer
            int r9 = r13.f404229g
            r6.<init>(r9)
            jz5.l r9 = new jz5.l
            java.lang.String r10 = "video_duration"
            r9.<init>(r10, r6)
            java.lang.Integer r6 = new java.lang.Integer
            int r10 = r13.f404230h
            r6.<init>(r10)
            jz5.l r10 = new jz5.l
            java.lang.String r11 = "video_progress"
            r10.<init>(r11, r6)
            jz5.l[] r6 = new jz5.l[]{r9, r10}
            java.util.Map r9 = kz5.c1.k(r6)
            r10 = 1
            r11 = 0
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.q2 r14 = (kotlinx.coroutines.flow.q2) r14
            java.lang.Object r14 = r14.emit(r12, r13)
            if (r14 != r2) goto L90
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            goto L94
        L90:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            r14 = r4
        L94:
            if (r14 != r2) goto L9a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L9a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
