package gd4;

/* loaded from: classes4.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270727d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f270729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f270730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f270731h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gd4.c2 f270732i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(long j17, kotlin.jvm.internal.e0 e0Var, float f17, gd4.c2 c2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270729f = j17;
        this.f270730g = e0Var;
        this.f270731h = f17;
        this.f270732i = c2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
        gd4.j1 j1Var = new gd4.j1(this.f270729f, this.f270730g, this.f270731h, this.f270732i, continuation);
        j1Var.f270728e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
        return j1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
        java.lang.Object invokeSuspend = ((gd4.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:5:0x0044). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r8.f270727d
            r4 = 1
            if (r3 == 0) goto L25
            if (r3 != r4) goto L1a
            java.lang.Object r3 = r8.f270728e
            kotlinx.coroutines.y0 r3 = (kotlinx.coroutines.y0) r3
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            goto L44
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L25:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f270728e
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
            r3 = r9
            r9 = r8
        L2e:
            boolean r5 = kotlinx.coroutines.z0.h(r3)
            if (r5 == 0) goto L62
            r9.f270728e = r3
            r9.f270727d = r4
            long r5 = r9.f270729f
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r5, r9)
            if (r5 != r2) goto L44
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L44:
            kotlin.jvm.internal.e0 r5 = r9.f270730g
            float r6 = r5.f310115d
            float r7 = r9.f270731h
            float r6 = r6 - r7
            r5.f310115d = r6
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L54
            r5.f310115d = r7
        L54:
            gd4.c2 r6 = r9.f270732i
            gd4.x0 r6 = r6.f()
            if (r6 == 0) goto L2e
            float r5 = r5.f310115d
            r6.setFrameLayoutAlpha(r5)
            goto L2e
        L62:
            jz5.f0 r9 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gd4.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
