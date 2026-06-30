package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public final class y5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f165848d;

    /* renamed from: e, reason: collision with root package name */
    public int f165849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f165850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165852h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z5 f165853i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(android.content.Context context, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z5 z5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f165850f = context;
        this.f165851g = str;
        this.f165852h = str2;
        this.f165853i = z5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y5 y5Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y5(this.f165850f, this.f165851g, this.f165852h, this.f165853i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
        return y5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        java.lang.String str;
        r45.ua0 ua0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f165849e;
        java.lang.String str2 = null;
        java.lang.String str3 = this.f165851g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context = this.f165850f;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490468vx), false, true, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x5(this.f165853i));
            r45.ta0 ta0Var = new r45.ta0();
            java.lang.String str4 = this.f165852h;
            ta0Var.f386230e = str4;
            ta0Var.f386229d = str3;
            ta0Var.f386231f = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageJumpKefuBtnComp", "CustomerServiceSignReq start url=" + str3 + " uxInfo=" + str4 + " type=" + ta0Var.f386231f);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w5 w5Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w5(ta0Var, 2634, "/cgi-bin/mmoc-bin/adplayinfo/customer_service_sign", null);
            this.f165848d = Q;
            this.f165849e = 1;
            java.lang.Object c17 = kotlinx.coroutines.a4.c(20000L, w5Var, this);
            if (c17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
                return aVar;
            }
            u3Var = Q;
            obj = c17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
                throw illegalStateException;
            }
            u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f165848d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        k64.b bVar = (k64.b) obj;
        if (bVar != null && (ua0Var = (r45.ua0) bVar.c()) != null) {
            str2 = ua0Var.f387164d;
        }
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageJumpKefuBtnComp", "CustomerServiceSignResp end url=".concat(str2));
        if (r26.n0.N(str2)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, 2);
            str = str3;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, 1);
            str = str2;
        }
        if (u3Var != null) {
            u3Var.dismiss();
        }
        x64.u.f452333a.b(this.f165850f, str, this.f165852h, 10, true);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp$doBtnClick$1");
        return f0Var;
    }
}
