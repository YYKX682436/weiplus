package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes.dex */
public final class w5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f165601d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f165602e;

    /* renamed from: f, reason: collision with root package name */
    public int f165603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f165604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f165605h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165606i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(r45.mr5 mr5Var, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f165604g = mr5Var;
        this.f165605h = i17;
        this.f165606i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w5 w5Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w5(this.f165604g, this.f165605h, this.f165606i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
        return w5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f165603f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.mr5 mr5Var = this.f165604g;
            int i18 = this.f165605h;
            java.lang.String str = this.f165606i;
            this.f165601d = mr5Var;
            this.f165602e = str;
            this.f165603f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u5 u5Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u5(rVar);
            k64.l.a(mr5Var, i18, str, u5Var, (r45.js5) r45.ua0.class.newInstance(), true);
            rVar.m(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v5(u5Var, i18, mr5Var));
            obj = rVar.j();
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1$invokeSuspend$$inlined$requestCgiAsync$1");
        return obj;
    }
}
