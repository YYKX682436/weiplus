package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public final class v9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f165580d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f165581e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f165582f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f165583g;

    /* renamed from: h, reason: collision with root package name */
    public int f165584h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165585i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ab4.f0 f165586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ab4.n0 f165587n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165588o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(java.lang.String str, ab4.f0 f0Var, ab4.n0 n0Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f165585i = str;
        this.f165586m = f0Var;
        this.f165587n = n0Var;
        this.f165588o = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v9 v9Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v9(this.f165585i, this.f165586m, this.f165587n, this.f165588o, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        return v9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f165584h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f165585i;
            this.f165580d = str;
            ab4.f0 f0Var = this.f165586m;
            this.f165581e = f0Var;
            ab4.n0 pageData = this.f165587n;
            this.f165582f = pageData;
            java.lang.String str2 = this.f165588o;
            this.f165583g = str2;
            this.f165584h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j9 j9Var = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9.f165823e;
            java.lang.String str3 = f0Var.A1;
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u9 u9Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u9(str2, rVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestQrImageUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$Companion");
            kotlin.jvm.internal.o.g(pageData, "pageData");
            j9Var.a();
            com.tencent.mars.xlog.Log.i("AdLandingQRCodeBtnCompDelegate", "requestQrImageUrl() called with: geoString = " + str + ", qrExtInfo = " + str3 + ", backUp = , pageData = " + pageData + ", cId = " + str2 + ", callback = " + u9Var);
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
            java.lang.String str4 = str == null ? "" : str;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String o17 = pageData.o();
            if (o17 == null) {
                o17 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String k17 = pageData.k();
            adLandingPagesProxy.doAdUpdateQrUrlScene(str4, str3, "", o17, str2, k17 == null ? "" : k17, u9Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestQrImageUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$Companion");
            j17 = rVar.j();
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        return j17;
    }
}
