package wd4;

/* loaded from: classes4.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.k5 f444977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd4.h f444978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wd4.q f444981i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444982m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f444983n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, java.util.List list, java.lang.String str, wd4.q qVar, yz5.a aVar, java.lang.Runnable runnable, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444977e = k5Var;
        this.f444978f = hVar;
        this.f444979g = list;
        this.f444980h = str;
        this.f444981i = qVar;
        this.f444982m = aVar;
        this.f444983n = runnable;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
        wd4.n nVar = new wd4.n(this.f444977e, this.f444978f, this.f444979g, this.f444980h, this.f444981i, this.f444982m, this.f444983n, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
        java.lang.Object invokeSuspend = ((wd4.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f444976d;
        wd4.h hVar = this.f444978f;
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = this.f444977e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            wd4.r rVar = wd4.r.f445015a;
            this.f444976d = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkNotReadyConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkNotReadyConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310568a, new wd4.j(this.f444979g, k5Var, hVar, null), this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNotReadyConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkNotReadyConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            if (g17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                return aVar;
            }
            obj = g17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f444980h;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.w(str, "executeOrDefer, not allNotReadyOpenConditionsGranted");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i(str, "tryEnable, allNotReadyOpenConditionsGranted");
        if (!this.f444981i.c(k5Var, hVar)) {
            com.tencent.mars.xlog.Log.w(str, "executeOrDefer, conditionAfterLongTimesWork not granted");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
            return f0Var;
        }
        yz5.a aVar2 = this.f444982m;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        this.f444983n.run();
        com.tencent.mars.xlog.Log.i(str, "tryEnable, opened");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
        return f0Var;
    }
}
