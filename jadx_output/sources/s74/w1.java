package s74;

/* loaded from: classes4.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404577g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404578h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.o2 o2Var, java.lang.String str, s74.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404575e = snsInfo;
        this.f404576f = o2Var;
        this.f404577g = str;
        this.f404578h = f3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        s74.w1 w1Var = new s74.w1(this.f404575e, this.f404576f, this.f404577g, this.f404578h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        return w1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        java.lang.Object invokeSuspend = ((s74.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            pz5.a r3 = pz5.a.f359186d
            int r4 = r0.f404574d
            r5 = 1
            if (r4 == 0) goto L23
            if (r4 != r5) goto L18
            kotlin.ResultKt.throwOnFailure(r18)
            goto Lce
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r3
        L23:
            kotlin.ResultKt.throwOnFailure(r18)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f404575e
            boolean r4 = i64.y.i(r4)
            if (r4 == 0) goto Lce
            i64.y r4 = i64.y.f289357d
            s74.o2 r6 = r0.f404576f
            s74.f3 r6 = r6.D()
            r4.getClass()
            java.lang.String r7 = "updateProductWithLocalCache"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = r0.f404577g
            if (r6 != 0) goto L4c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L48:
            r5 = r1
            r16 = r2
            goto Laf
        L4c:
            if (r9 != 0) goto L52
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L48
        L52:
            java.util.concurrent.ConcurrentHashMap r10 = i64.y.f289359f
            java.lang.Object r10 = r10.get(r9)
            i64.x r10 = (i64.x) r10
            if (r10 != 0) goto L60
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L48
        L60:
            java.lang.String r11 = r4.d()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "updateAdFinderLivingProductWithLocalCache, snsId="
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r13 = ", component.size="
            r12.append(r13)
            java.lang.String r13 = "getAttrArray"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            org.json.JSONArray r15 = r10.f289354c
            int r5 = r15.length()
            r12.append(r5)
            java.lang.String r5 = ", productId="
            r12.append(r5)
            java.lang.String r5 = "getProductId"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r14)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            r5 = r1
            r16 = r2
            long r1 = r10.f289353b
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            com.tencent.mars.xlog.Log.i(r11, r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            r4.k(r6, r15)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        Laf:
            kotlinx.coroutines.flow.j r1 = r4.e(r9)
            s74.v1 r2 = new s74.v1
            s74.f3 r4 = r0.f404578h
            r2.<init>(r4, r9)
            r4 = 1
            r0.f404574d = r4
            kotlinx.coroutines.flow.h3 r1 = (kotlinx.coroutines.flow.h3) r1
            java.lang.Object r1 = r1.a(r2, r0)
            if (r1 != r3) goto Lcb
            r1 = r16
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            return r3
        Lcb:
            r1 = r16
            goto Ld0
        Lce:
            r5 = r1
            r1 = r2
        Ld0:
            jz5.f0 r2 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
