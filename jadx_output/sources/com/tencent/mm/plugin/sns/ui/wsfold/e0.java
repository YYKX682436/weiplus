package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f171355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 f171356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171356e = snsWsFoldDetailUIV3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
        com.tencent.mm.plugin.sns.ui.wsfold.e0 e0Var = new com.tencent.mm.plugin.sns.ui.wsfold.e0(this.f171356e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
        return e0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.wsfold.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171355d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f171355d = 1;
            obj = com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3.V6(this.f171356e, 2, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3$result$2");
        return obj;
    }
}
