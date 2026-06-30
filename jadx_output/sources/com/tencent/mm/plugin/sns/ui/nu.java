package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class nu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.qu f170056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f170057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(com.tencent.mm.plugin.sns.ui.qu quVar, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f170056d = quVar;
        this.f170057e = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1$1");
        com.tencent.mm.plugin.sns.ui.nu nuVar = new com.tencent.mm.plugin.sns.ui.nu(this.f170056d, this.f170057e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1$1");
        return nuVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1$1");
        com.tencent.mm.plugin.sns.ui.nu nuVar = (com.tencent.mm.plugin.sns.ui.nu) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nuVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1$1");
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00a2  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            java.lang.String r2 = "access$getSlotSnsList$p"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.qu r4 = r12.f170056d
            java.util.ArrayList r5 = r4.f170362e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r13.<init>(r5)
            java.lang.String r5 = "checkIsChange"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            java.util.ArrayList r6 = r12.f170057e
            java.lang.String r7 = "list"
            kotlin.jvm.internal.o.g(r6, r7)
            int r7 = r6.size()
            java.util.ArrayList r8 = r4.f170362e
            int r8 = r8.size()
            if (r7 == r8) goto L3d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L6a
        L3d:
            java.util.Iterator r7 = r6.iterator()
            r8 = 0
            r9 = r8
        L43:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L73
            java.lang.Object r10 = r7.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L6e
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r10
            java.lang.Object r9 = r13.get(r9)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r9
            java.lang.String r9 = r9.getSnsId()
            java.lang.String r10 = r10.getSnsId()
            boolean r9 = kotlin.jvm.internal.o.b(r9, r10)
            if (r9 != 0) goto L6c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L6a:
            r8 = 1
            goto L76
        L6c:
            r9 = r11
            goto L43
        L6e:
            kz5.c0.p()
            r13 = 0
            throw r13
        L73:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L76:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r5 = "loadSlotData >> "
            r13.<init>(r5)
            int r5 = r6.size()
            r13.append(r5)
            java.lang.String r5 = " isChange: "
            r13.append(r5)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            java.lang.String r5 = "MicroMsg.SnsUserStarSlotHelper"
            com.tencent.mars.xlog.Log.i(r5, r13)
            java.lang.String r13 = "access$setSlotSnsList$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r3)
            r4.f170362e = r6
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r3)
            if (r8 == 0) goto Lb7
            java.lang.String r13 = "access$getSlotAdapter$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.ArrayList r13 = r4.f170362e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            sb4.y r2 = r4.f170361d
            r2.x(r13)
        Lb7:
            jz5.f0 r13 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.nu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
