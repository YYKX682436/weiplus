package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class ou extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f170125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.qu f170126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(com.tencent.mm.plugin.sns.ui.qu quVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f170126e = quVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
        com.tencent.mm.plugin.sns.ui.ou ouVar = new com.tencent.mm.plugin.sns.ui.ou(this.f170126e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
        return ouVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.ou) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f170125d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.qu quVar = this.f170126e;
            quVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlotItemNum", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
            android.app.Activity context = quVar.f170358a;
            kotlin.jvm.internal.o.g(context, "context");
            int i18 = n34.o4.f334698b;
            if (i18 != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlotItemNum", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
            } else {
                int b17 = com.tencent.mm.ui.bh.a(context).f197135a - i65.a.b(context, 120);
                n34.o4.f334698b = b17 / (com.tencent.mm.plugin.sns.model.l4.Oj() + i65.a.b(context, 4));
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarHelper", "getSlotItemNum >> " + n34.o4.f334698b + ", " + b17);
                if (n34.o4.f334698b == 0) {
                    n34.o4.f334698b = 3;
                }
                i18 = n34.o4.f334698b;
                int i19 = n34.o4.f334699c;
                if (i18 > i19) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlotItemNum", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
                    i18 = i19;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlotItemNum", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            quVar.f170364g = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadSlotData >> ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            int i27 = quVar.f170364g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            sb6.append(i27);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", sb6.toString());
            pb4.e eVar = pb4.e.f353196a;
            java.lang.String a17 = quVar.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            int i28 = quVar.f170364g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            java.util.ArrayList h17 = eVar.h(a17, i28);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.sns.ui.nu nuVar = new com.tencent.mm.plugin.sns.ui.nu(quVar, h17, null);
            this.f170125d = 1;
            if (kotlinx.coroutines.l.g(g3Var, nuVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$loadSlotData$1");
        return f0Var;
    }
}
